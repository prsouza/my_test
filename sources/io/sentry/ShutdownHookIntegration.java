package io.sentry;

import io.sentry.util.Objects;
import java.io.Closeable;

public final class ShutdownHookIntegration implements Integration, Closeable {
    private final Runtime runtime;
    private Thread thread;

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }

    public ShutdownHookIntegration(Runtime runtime2) {
        this.runtime = (Runtime) Objects.requireNonNull(runtime2, "Runtime is required");
    }

    public void close() {
        Thread thread2 = this.thread;
        if (thread2 != null) {
            this.runtime.removeShutdownHook(thread2);
        }
    }

    public Thread getHook() {
        return this.thread;
    }

    public void register(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (sentryOptions.isEnableShutdownHook()) {
            Thread thread2 = new Thread(new w(iHub, sentryOptions));
            this.thread = thread2;
            this.runtime.addShutdownHook(thread2);
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            return;
        }
        sentryOptions.getLogger().log(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
    }
}
