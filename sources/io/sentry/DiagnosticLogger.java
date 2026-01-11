package io.sentry;

import io.sentry.util.Objects;

public final class DiagnosticLogger implements ILogger {
    private final ILogger logger;
    private final SentryOptions options;

    public DiagnosticLogger(SentryOptions sentryOptions, ILogger iLogger) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.logger = iLogger;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public boolean isEnabled(SentryLevel sentryLevel) {
        return sentryLevel != null && this.options.isDebug() && sentryLevel.ordinal() >= this.options.getDiagnosticLevel().ordinal();
    }

    public void log(SentryLevel sentryLevel, String str, Throwable th2) {
        if (this.logger != null && isEnabled(sentryLevel)) {
            this.logger.log(sentryLevel, str, th2);
        }
    }

    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        if (this.logger != null && isEnabled(sentryLevel)) {
            this.logger.log(sentryLevel, str, objArr);
        }
    }

    public void log(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr) {
        if (this.logger != null && isEnabled(sentryLevel)) {
            this.logger.log(sentryLevel, th2, str, objArr);
        }
    }
}
