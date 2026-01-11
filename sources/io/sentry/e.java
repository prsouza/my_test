package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import java.util.Date;

public final /* synthetic */ class e {
    public static void a(IHub iHub, Breadcrumb breadcrumb) {
        iHub.addBreadcrumb(breadcrumb, (Object) null);
    }

    public static void b(IHub iHub, String str) {
        iHub.addBreadcrumb(new Breadcrumb(str));
    }

    public static void c(IHub iHub, String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb(str);
        breadcrumb.setCategory(str2);
        iHub.addBreadcrumb(breadcrumb);
    }

    public static SentryId d(IHub iHub, SentryEnvelope sentryEnvelope) {
        return iHub.captureEnvelope(sentryEnvelope, (Object) null);
    }

    public static SentryId e(IHub iHub, SentryEvent sentryEvent) {
        return iHub.captureEvent(sentryEvent, (Object) null);
    }

    public static SentryId f(IHub iHub, Throwable th2) {
        return iHub.captureException(th2, (Object) null);
    }

    public static SentryId g(IHub iHub, String str) {
        return iHub.captureMessage(str, SentryLevel.INFO);
    }

    public static SentryId h(IHub iHub, SentryTransaction sentryTransaction, TraceState traceState) {
        return iHub.captureTransaction(sentryTransaction, traceState, (Object) null);
    }

    public static SentryId i(IHub iHub, SentryTransaction sentryTransaction, Object obj) {
        return iHub.captureTransaction(sentryTransaction, (TraceState) null, obj);
    }

    public static ITransaction j(IHub iHub, TransactionContext transactionContext) {
        return iHub.startTransaction(transactionContext, false);
    }

    public static ITransaction k(IHub iHub, TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        return iHub.startTransaction(transactionContext, customSamplingContext, false);
    }

    public static ITransaction l(IHub iHub, TransactionContext transactionContext, boolean z) {
        return iHub.startTransaction(transactionContext, (CustomSamplingContext) null, z);
    }

    public static ITransaction m(IHub iHub, String str, String str2) {
        return iHub.startTransaction(str, str2, (CustomSamplingContext) null);
    }

    public static ITransaction n(IHub iHub, String str, String str2, CustomSamplingContext customSamplingContext) {
        return iHub.startTransaction(str, str2, customSamplingContext, false);
    }

    public static ITransaction o(IHub iHub, String str, String str2, CustomSamplingContext customSamplingContext, boolean z) {
        return iHub.startTransaction(new TransactionContext(str, str2), customSamplingContext, z);
    }

    public static ITransaction p(IHub iHub, String str, String str2, Date date, boolean z, TransactionFinishedCallback transactionFinishedCallback) {
        return iHub.startTransaction(new TransactionContext(str, str2), (CustomSamplingContext) null, false, date, z, transactionFinishedCallback);
    }

    public static ITransaction q(IHub iHub, String str, String str2, boolean z) {
        return iHub.startTransaction(str, str2, (CustomSamplingContext) null, z);
    }
}
