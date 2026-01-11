package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import java.util.Date;
import java.util.List;

public interface IHub {
    void addBreadcrumb(Breadcrumb breadcrumb);

    void addBreadcrumb(Breadcrumb breadcrumb, Object obj);

    void addBreadcrumb(String str);

    void addBreadcrumb(String str, String str2);

    void bindClient(ISentryClient iSentryClient);

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope);

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj);

    SentryId captureEvent(SentryEvent sentryEvent);

    SentryId captureEvent(SentryEvent sentryEvent, Object obj);

    SentryId captureException(Throwable th2);

    SentryId captureException(Throwable th2, Object obj);

    SentryId captureMessage(String str);

    SentryId captureMessage(String str, SentryLevel sentryLevel);

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState);

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Object obj);

    SentryId captureTransaction(SentryTransaction sentryTransaction, Object obj);

    void captureUserFeedback(UserFeedback userFeedback);

    void clearBreadcrumbs();

    IHub clone();

    void close();

    void configureScope(ScopeCallback scopeCallback);

    void endSession();

    void flush(long j10);

    SentryId getLastEventId();

    SentryOptions getOptions();

    ISpan getSpan();

    Boolean isCrashedLastRun();

    boolean isEnabled();

    void popScope();

    void pushScope();

    void removeExtra(String str);

    void removeTag(String str);

    void setExtra(String str, String str2);

    void setFingerprint(List<String> list);

    void setLevel(SentryLevel sentryLevel);

    void setSpanContext(Throwable th2, ISpan iSpan, String str);

    void setTag(String str, String str2);

    void setTransaction(String str);

    void setUser(User user);

    void startSession();

    ITransaction startTransaction(TransactionContext transactionContext);

    ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext);

    ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z);

    ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date);

    ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date, boolean z10, TransactionFinishedCallback transactionFinishedCallback);

    ITransaction startTransaction(TransactionContext transactionContext, boolean z);

    ITransaction startTransaction(String str, String str2);

    ITransaction startTransaction(String str, String str2, CustomSamplingContext customSamplingContext);

    ITransaction startTransaction(String str, String str2, CustomSamplingContext customSamplingContext, boolean z);

    ITransaction startTransaction(String str, String str2, Date date, boolean z, TransactionFinishedCallback transactionFinishedCallback);

    ITransaction startTransaction(String str, String str2, boolean z);

    SentryTraceHeader traceHeaders();

    void withScope(ScopeCallback scopeCallback);
}
