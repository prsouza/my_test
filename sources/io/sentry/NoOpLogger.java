package io.sentry;

public final class NoOpLogger implements ILogger {
    private static final NoOpLogger instance = new NoOpLogger();

    private NoOpLogger() {
    }

    public static NoOpLogger getInstance() {
        return instance;
    }

    public boolean isEnabled(SentryLevel sentryLevel) {
        return false;
    }

    public void log(SentryLevel sentryLevel, String str, Throwable th2) {
    }

    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
    }

    public void log(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr) {
    }
}
