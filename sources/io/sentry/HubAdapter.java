package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import java.util.Date;
import java.util.List;

public final class HubAdapter implements IHub {
    private static final HubAdapter INSTANCE = new HubAdapter();

    private HubAdapter() {
    }

    public static HubAdapter getInstance() {
        return INSTANCE;
    }

    public final /* synthetic */ void addBreadcrumb(Breadcrumb breadcrumb) {
        e.a(this, breadcrumb);
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
        Sentry.addBreadcrumb(breadcrumb, obj);
    }

    public final /* synthetic */ void addBreadcrumb(String str) {
        e.b(this, str);
    }

    public final /* synthetic */ void addBreadcrumb(String str, String str2) {
        e.c(this, str, str2);
    }

    public void bindClient(ISentryClient iSentryClient) {
        Sentry.bindClient(iSentryClient);
    }

    public final /* synthetic */ SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return e.d(this, sentryEnvelope);
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        return Sentry.getCurrentHub().captureEnvelope(sentryEnvelope, obj);
    }

    public final /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent) {
        return e.e(this, sentryEvent);
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        return Sentry.captureEvent(sentryEvent, obj);
    }

    public final /* synthetic */ SentryId captureException(Throwable th2) {
        return e.f(this, th2);
    }

    public SentryId captureException(Throwable th2, Object obj) {
        return Sentry.captureException(th2, obj);
    }

    public final /* synthetic */ SentryId captureMessage(String str) {
        return e.g(this, str);
    }

    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return Sentry.captureMessage(str, sentryLevel);
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState) {
        return e.h(this, sentryTransaction, traceState);
    }

    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Object obj) {
        return Sentry.getCurrentHub().captureTransaction(sentryTransaction, traceState, obj);
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, Object obj) {
        return e.i(this, sentryTransaction, obj);
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
        Sentry.captureUserFeedback(userFeedback);
    }

    public void clearBreadcrumbs() {
        Sentry.clearBreadcrumbs();
    }

    public IHub clone() {
        return Sentry.getCurrentHub().clone();
    }

    public void close() {
        Sentry.close();
    }

    public void configureScope(ScopeCallback scopeCallback) {
        Sentry.configureScope(scopeCallback);
    }

    public void endSession() {
        Sentry.endSession();
    }

    public void flush(long j10) {
        Sentry.flush(j10);
    }

    public SentryId getLastEventId() {
        return Sentry.getLastEventId();
    }

    public SentryOptions getOptions() {
        return Sentry.getCurrentHub().getOptions();
    }

    public ISpan getSpan() {
        return Sentry.getCurrentHub().getSpan();
    }

    public Boolean isCrashedLastRun() {
        return Sentry.isCrashedLastRun();
    }

    public boolean isEnabled() {
        return Sentry.isEnabled();
    }

    public void popScope() {
        Sentry.popScope();
    }

    public void pushScope() {
        Sentry.pushScope();
    }

    public void removeExtra(String str) {
        Sentry.removeExtra(str);
    }

    public void removeTag(String str) {
        Sentry.removeTag(str);
    }

    public void setExtra(String str, String str2) {
        Sentry.setExtra(str, str2);
    }

    public void setFingerprint(List<String> list) {
        Sentry.setFingerprint(list);
    }

    public void setLevel(SentryLevel sentryLevel) {
        Sentry.setLevel(sentryLevel);
    }

    public void setSpanContext(Throwable th2, ISpan iSpan, String str) {
        Sentry.getCurrentHub().setSpanContext(th2, iSpan, str);
    }

    public void setTag(String str, String str2) {
        Sentry.setTag(str, str2);
    }

    public void setTransaction(String str) {
        Sentry.setTransaction(str);
    }

    public void setUser(User user) {
        Sentry.setUser(user);
    }

    public void startSession() {
        Sentry.startSession();
    }

    public ITransaction startTransaction(TransactionContext transactionContext) {
        return Sentry.startTransaction(transactionContext);
    }

    public final /* synthetic */ ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        return e.k(this, transactionContext, customSamplingContext);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z) {
        return Sentry.startTransaction(transactionContext, customSamplingContext, z);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date) {
        return Sentry.startTransaction(transactionContext, customSamplingContext, z, date);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date, boolean z10, TransactionFinishedCallback transactionFinishedCallback) {
        return Sentry.startTransaction(transactionContext, customSamplingContext, z, date, z10, transactionFinishedCallback);
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
        return Sentry.traceHeaders();
    }

    public void withScope(ScopeCallback scopeCallback) {
        Sentry.withScope(scopeCallback);
    }
}
