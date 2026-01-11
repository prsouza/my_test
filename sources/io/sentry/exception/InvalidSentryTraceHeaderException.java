package io.sentry.exception;

import a8.a;

public final class InvalidSentryTraceHeaderException extends Exception {
    private static final long serialVersionUID = 1;
    private final String sentryTraceHeader;

    public InvalidSentryTraceHeaderException(String str) {
        this(str, (Throwable) null);
    }

    public InvalidSentryTraceHeaderException(String str, Throwable th2) {
        super(a.c("sentry-trace header does not conform to expected format: ", str), th2);
        this.sentryTraceHeader = str;
    }

    public String getSentryTraceHeader() {
        return this.sentryTraceHeader;
    }
}
