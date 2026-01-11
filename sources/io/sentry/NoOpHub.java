package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import java.util.Date;
import java.util.List;

public final class NoOpHub implements IHub {
    private static final NoOpHub instance = new NoOpHub();
    private final SentryOptions emptyOptions = SentryOptions.empty();

    private NoOpHub() {
    }

    public static NoOpHub getInstance() {
        return instance;
    }

    public final /* synthetic */ void addBreadcrumb(Breadcrumb breadcrumb) {
        e.a(this, breadcrumb);
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
    }

    public final /* synthetic */ void addBreadcrumb(String str) {
        e.b(this, str);
    }

    public final /* synthetic */ void addBreadcrumb(String str, String str2) {
        e.c(this, str, str2);
    }

    public void bindClient(ISentryClient iSentryClient) {
    }

    public final /* synthetic */ SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return e.d(this, sentryEnvelope);
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public final /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent) {
        return e.e(this, sentryEvent);
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public final /* synthetic */ SentryId captureException(Throwable th2) {
        return e.f(this, th2);
    }

    public SentryId captureException(Throwable th2, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public final /* synthetic */ SentryId captureMessage(String str) {
        return e.g(this, str);
    }

    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return SentryId.EMPTY_ID;
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState) {
        return e.h(this, sentryTransaction, traceState);
    }

    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, Object obj) {
        return e.i(this, sentryTransaction, obj);
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
    }

    public void clearBreadcrumbs() {
    }

    public IHub clone() {
        return instance;
    }

    public void close() {
    }

    public void configureScope(ScopeCallback scopeCallback) {
    }

    public void endSession() {
    }

    public void flush(long j10) {
    }

    public SentryId getLastEventId() {
        return SentryId.EMPTY_ID;
    }

    public SentryOptions getOptions() {
        return this.emptyOptions;
    }

    public ISpan getSpan() {
        return null;
    }

    public Boolean isCrashedLastRun() {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    public void popScope() {
    }

    public void pushScope() {
    }

    public void removeExtra(String str) {
    }

    public void removeTag(String str) {
    }

    public void setExtra(String str, String str2) {
    }

    public void setFingerprint(List<String> list) {
    }

    public void setLevel(SentryLevel sentryLevel) {
    }

    public void setSpanContext(Throwable th2, ISpan iSpan, String str) {
    }

    public void setTag(String str, String str2) {
    }

    public void setTransaction(String str) {
    }

    public void setUser(User user) {
    }

    public void startSession() {
    }

    public ITransaction startTransaction(TransactionContext transactionContext) {
        return NoOpTransaction.getInstance();
    }

    public final /* synthetic */ ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        return e.k(this, transactionContext, customSamplingContext);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z) {
        return NoOpTransaction.getInstance();
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date) {
        return NoOpTransaction.getInstance();
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date, boolean z10, TransactionFinishedCallback transactionFinishedCallback) {
        return NoOpTransaction.getInstance();
    }

    public final /* synthetic */ ITransaction startTransaction(TransactionContext transactionContext, boolean z) {
        return e.l(this, transactionContext, z);
    }

    public final /* synthetic */ ITransaction startTransaction(String str, String str2) {
        return e.m(this, str, str2);
    }

    public final /* synthetic */ ITransaction startTransaction(String str, String str2, CustomSamplingContext customSamplingContext) {
        return e.n(this, str, str2, customSamplingContext);
    }

    public final /* synthetic */ ITransaction startTransaction(String str, String str2, CustomSamplingContext customSamplingContext, boolean z) {
        return e.o(this, str, str2, customSamplingContext, z);
    }

    public final /* synthetic */ ITransaction startTransaction(String str, String str2, Date date, boolean z, TransactionFinishedCallback transactionFinishedCallback) {
        return e.p(this, str, str2, date, z, transactionFinishedCallback);
    }

    public final /* synthetic */ ITransaction startTransaction(String str, String str2, boolean z) {
        return e.q(this, str, str2, z);
    }

    public SentryTraceHeader traceHeaders() {
        return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, Boolean.TRUE);
    }

    public void withScope(ScopeCallback scopeCallback) {
    }
}
