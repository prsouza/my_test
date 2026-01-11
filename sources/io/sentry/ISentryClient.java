package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;

public interface ISentryClient {
    SentryId captureEnvelope(SentryEnvelope sentryEnvelope);

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj);

    SentryId captureEvent(SentryEvent sentryEvent);

    SentryId captureEvent(SentryEvent sentryEvent, Scope scope);

    SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj);

    SentryId captureEvent(SentryEvent sentryEvent, Object obj);

    SentryId captureException(Throwable th2);

    SentryId captureException(Throwable th2, Scope scope);

    SentryId captureException(Throwable th2, Scope scope, Object obj);

    SentryId captureException(Throwable th2, Object obj);

    SentryId captureMessage(String str, SentryLevel sentryLevel);

    SentryId captureMessage(String str, SentryLevel sentryLevel, Scope scope);

    void captureSession(Session session);

    void captureSession(Session session, Object obj);

    SentryId captureTransaction(SentryTransaction sentryTransaction);

    SentryId captureTransaction(SentryTransaction sentryTransaction, Scope scope, Object obj);

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState);

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Scope scope, Object obj);

    void captureUserFeedback(UserFeedback userFeedback);

    void close();

    void flush(long j10);

    boolean isEnabled();
}
