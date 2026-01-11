package io.sentry;

import io.sentry.util.Objects;

public final class SendCachedEnvelopeFireAndForgetIntegration implements Integration {
    private final SendFireAndForgetFactory factory;

    public interface SendFireAndForget {
        void send();
    }

    public interface SendFireAndForgetDirPath {
        String getDirPath();
    }

    public interface SendFireAndForgetFactory {
        SendFireAndForget create(IHub iHub, SentryOptions sentryOptions);

        boolean hasValidPath(String str, ILogger iLogger);

        SendFireAndForget processDir(DirectoryProcessor directoryProcessor, String str, ILogger iLogger);
    }

    public SendCachedEnvelopeFireAndForgetIntegration(SendFireAndForgetFactory sendFireAndForgetFactory) {
        this.factory = (SendFireAndForgetFactory) Objects.requireNonNull(sendFireAndForgetFactory, "SendFireAndForgetFactory is required");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$register$0(SendFireAndForget sendFireAndForget, SentryOptions sentryOptions) {
        try {
            sendFireAndForget.send();
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    public final void register(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!this.factory.hasValidPath(sentryOptions.getCacheDirPath(), sentryOptions.getLogger())) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        SendFireAndForget create = this.factory.create(iHub, sentryOptions);
        if (create == null) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            sentryOptions.getExecutorService().submit(new h(create, sentryOptions));
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "SendCachedEventFireAndForgetIntegration installed.", new Object[0]);
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }
}
