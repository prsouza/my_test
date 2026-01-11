package io.sentry;

public interface ILogger {
    boolean isEnabled(SentryLevel sentryLevel);

    void log(SentryLevel sentryLevel, String str, Throwable th2);

    void log(SentryLevel sentryLevel, String str, Object... objArr);

    void log(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr);
}
