package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;

final class NoOpSentryClient implements ISentryClient {
    private static final NoOpSentryClient instance = new NoOpSentryClient();

    private NoOpSentryClient() {
    }

    public static NoOpSentryClient getInstance() {
        return instance;
    }

    public final /* synthetic */ SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return f.a(this, sentryEnvelope);
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public final /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent) {
        return f.b(this, sentryEvent);
    }

    public final /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent, Scope scope) {
        return f.c(this, sentryEvent, scope);
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public final /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        return f.d(this, sentryEvent, obj);
    }

    public final /* synthetic */ SentryId captureException(Throwable th2) {
        return f.e(this, th2);
    }

    public final /* synthetic */ SentryId captureException(Throwable th2, Scope scope) {
        return f.f(this, th2, scope);
    }

    public final /* synthetic */ SentryId captureException(Throwable th2, Scope scope, Object obj) {
        return f.g(this, th2, scope, obj);
    }

    public final /* synthetic */ SentryId captureException(Throwable th2, Object obj) {
        return f.h(this, th2, obj);
    }

    public final /* synthetic */ SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return f.i(this, str, sentryLevel);
    }

    public final /* synthetic */ SentryId captureMessage(String str, SentryLevel sentryLevel, Scope scope) {
        return f.j(this, str, sentryLevel, scope);
    }

    public final /* synthetic */ void captureSession(Session session) {
        f.k(this, session);
    }

    public void captureSession(Session session, Object obj) {
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction) {
        return f.l(this, sentryTransaction);
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, Scope scope, Object obj) {
        return f.m(this, sentryTransaction, scope, obj);
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState) {
        return f.n(this, sentryTransaction, traceState);
    }

    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Scope scope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
    }

    public void close() {
    }

    public void flush(long j10) {
    }

    public boolean isEnabled() {
        return false;
    }
}
