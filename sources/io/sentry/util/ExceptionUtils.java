package io.sentry.util;

public final class ExceptionUtils {
    public static Throwable findRootCause(Throwable th2) {
        Objects.requireNonNull(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }
}
