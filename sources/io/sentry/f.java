package io.sentry;

import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;

public final /* synthetic */ class f {
    public static SentryId a(ISentryClient iSentryClient, SentryEnvelope sentryEnvelope) {
        return iSentryClient.captureEnvelope(sentryEnvelope, (Object) null);
    }

    public static SentryId b(ISentryClient iSentryClient, SentryEvent sentryEvent) {
        return iSentryClient.captureEvent(sentryEvent, (Scope) null, (Object) null);
    }

    public static SentryId c(ISentryClient iSentryClient, SentryEvent sentryEvent, Scope scope) {
        return iSentryClient.captureEvent(sentryEvent, scope, (Object) null);
    }

    public static SentryId d(ISentryClient iSentryClient, SentryEvent sentryEvent, Object obj) {
        return iSentryClient.captureEvent(sentryEvent, (Scope) null, obj);
    }

    public static SentryId e(ISentryClient iSentryClient, Throwable th2) {
        return iSentryClient.captureException(th2, (Scope) null, (Object) null);
    }

    public static SentryId f(ISentryClient iSentryClient, Throwable th2, Scope scope) {
        return iSentryClient.captureException(th2, scope, (Object) null);
    }

    public static SentryId g(ISentryClient iSentryClient, Throwable th2, Scope scope, Object obj) {
        return iSentryClient.captureEvent(new SentryEvent(th2), scope, obj);
    }

    public static SentryId h(ISentryClient iSentryClient, Throwable th2, Object obj) {
        return iSentryClient.captureException(th2, (Scope) null, obj);
    }

    public static SentryId i(ISentryClient iSentryClient, String str, SentryLevel sentryLevel) {
        return iSentryClient.captureMessage(str, sentryLevel, (Scope) null);
    }

    public static SentryId j(ISentryClient iSentryClient, String str, SentryLevel sentryLevel, Scope scope) {
        SentryEvent sentryEvent = new SentryEvent();
        Message message = new Message();
        message.setFormatted(str);
        sentryEvent.setMessage(message);
        sentryEvent.setLevel(sentryLevel);
        return iSentryClient.captureEvent(sentryEvent, scope);
    }

    public static void k(ISentryClient iSentryClient, Session session) {
        iSentryClient.captureSession(session, (Object) null);
    }

    public static SentryId l(ISentryClient iSentryClient, SentryTransaction sentryTransaction) {
        return iSentryClient.captureTransaction(sentryTransaction, (TraceState) null, (Scope) null, (Object) null);
    }

    public static SentryId m(ISentryClient iSentryClient, SentryTransaction sentryTransaction, Scope scope, Object obj) {
        return iSentryClient.captureTransaction(sentryTransaction, (TraceState) null, scope, obj);
    }

    public static SentryId n(ISentryClient iSentryClient, SentryTransaction sentryTransaction, TraceState traceState) {
        return iSentryClient.captureTransaction(sentryTransaction, traceState, (Scope) null, (Object) null);
    }
}
