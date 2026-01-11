package io.sentry;

import a.b;
import io.sentry.Scope;
import io.sentry.Stack;
import io.sentry.hints.SessionEndHint;
import io.sentry.hints.SessionStartHint;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.ExceptionUtils;
import io.sentry.util.Objects;
import io.sentry.util.Pair;
import java.io.Closeable;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class Hub implements IHub {
    private volatile boolean isEnabled;
    private volatile SentryId lastEventId;
    private final SentryOptions options;
    private final Stack stack;
    private final Map<Throwable, Pair<ISpan, String>> throwableToSpan;
    private final TracesSampler tracesSampler;

    public Hub(SentryOptions sentryOptions) {
        this(sentryOptions, createRootStackItem(sentryOptions));
    }

    private Hub(SentryOptions sentryOptions, Stack.StackItem stackItem) {
        this(sentryOptions, new Stack(sentryOptions.getLogger(), stackItem));
    }

    private Hub(SentryOptions sentryOptions, Stack stack2) {
        this.throwableToSpan = Collections.synchronizedMap(new WeakHashMap());
        validateOptions(sentryOptions);
        this.options = sentryOptions;
        this.tracesSampler = new TracesSampler(sentryOptions);
        this.stack = stack2;
        this.lastEventId = SentryId.EMPTY_ID;
        this.isEnabled = true;
    }

    private void assignTraceContext(SentryEvent sentryEvent) {
        Pair pair;
        if (this.options.isTracingEnabled() && sentryEvent.getThrowable() != null && (pair = this.throwableToSpan.get(ExceptionUtils.findRootCause(sentryEvent.getThrowable()))) != null) {
            ISpan iSpan = (ISpan) pair.getFirst();
            if (sentryEvent.getContexts().getTrace() == null && iSpan != null) {
                sentryEvent.getContexts().setTrace(iSpan.getSpanContext());
            }
            String str = (String) pair.getSecond();
            if (sentryEvent.getTransaction() == null && str != null) {
                sentryEvent.setTransaction(str);
            }
        }
    }

    private static Stack.StackItem createRootStackItem(SentryOptions sentryOptions) {
        validateOptions(sentryOptions);
        return new Stack.StackItem(sentryOptions, new SentryClient(sentryOptions), new Scope(sentryOptions));
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.sentry.ITransaction createTransaction(io.sentry.TransactionContext r7, io.sentry.CustomSamplingContext r8, boolean r9, java.util.Date r10, boolean r11, io.sentry.TransactionFinishedCallback r12) {
        /*
            r6 = this;
            java.lang.String r0 = "transactionContext is required"
            io.sentry.util.Objects.requireNonNull(r7, r0)
            boolean r0 = r6.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0020
            io.sentry.SentryOptions r7 = r6.options
            io.sentry.ILogger r7 = r7.getLogger()
            io.sentry.SentryLevel r8 = io.sentry.SentryLevel.WARNING
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "Instance is disabled and this 'startTransaction' returns a no-op."
            r7.log((io.sentry.SentryLevel) r8, (java.lang.String) r11, (java.lang.Object[]) r10)
        L_0x001b:
            io.sentry.NoOpTransaction r7 = io.sentry.NoOpTransaction.getInstance()
            goto L_0x0056
        L_0x0020:
            io.sentry.SentryOptions r0 = r6.options
            boolean r0 = r0.isTracingEnabled()
            if (r0 != 0) goto L_0x0038
            io.sentry.SentryOptions r7 = r6.options
            io.sentry.ILogger r7 = r7.getLogger()
            io.sentry.SentryLevel r8 = io.sentry.SentryLevel.INFO
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "Tracing is disabled and this 'startTransaction' returns a no-op."
            r7.log((io.sentry.SentryLevel) r8, (java.lang.String) r11, (java.lang.Object[]) r10)
            goto L_0x001b
        L_0x0038:
            io.sentry.SamplingContext r0 = new io.sentry.SamplingContext
            r0.<init>(r7, r8)
            io.sentry.TracesSampler r8 = r6.tracesSampler
            boolean r8 = r8.sample((io.sentry.SamplingContext) r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7.setSampled(r8)
            io.sentry.SentryTracer r8 = new io.sentry.SentryTracer
            r0 = r8
            r1 = r7
            r2 = r6
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r8
        L_0x0056:
            if (r9 == 0) goto L_0x0060
            x8.p r8 = new x8.p
            r8.<init>(r7)
            r6.configureScope(r8)
        L_0x0060:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.Hub.createTransaction(io.sentry.TransactionContext, io.sentry.CustomSamplingContext, boolean, java.util.Date, boolean, io.sentry.TransactionFinishedCallback):io.sentry.ITransaction");
    }

    private static void validateOptions(SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub is no DSN is available.");
        }
    }

    public final /* synthetic */ void addBreadcrumb(Breadcrumb breadcrumb) {
        e.a(this, breadcrumb);
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (breadcrumb == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().addBreadcrumb(breadcrumb, obj);
        }
    }

    public final /* synthetic */ void addBreadcrumb(String str) {
        e.b(this, str);
    }

    public final /* synthetic */ void addBreadcrumb(String str, String str2) {
        e.c(this, str, str2);
    }

    public void bindClient(ISentryClient iSentryClient) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'bindClient' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        if (iSentryClient != null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "New client bound to scope.", new Object[0]);
        } else {
            this.options.getLogger().log(SentryLevel.DEBUG, "NoOp client bound to scope.", new Object[0]);
            iSentryClient = NoOpSentryClient.getInstance();
        }
        peek.setClient(iSentryClient);
    }

    public final /* synthetic */ SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return e.d(this, sentryEnvelope);
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return sentryId;
        }
        try {
            SentryId captureEnvelope = this.stack.peek().getClient().captureEnvelope(sentryEnvelope, obj);
            return captureEnvelope != null ? captureEnvelope : sentryId;
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing envelope.", th2);
            return sentryId;
        }
    }

    public final /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent) {
        return e.e(this, sentryEvent);
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return sentryId;
        } else if (sentryEvent == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return sentryId;
        } else {
            try {
                assignTraceContext(sentryEvent);
                Stack.StackItem peek = this.stack.peek();
                sentryId = peek.getClient().captureEvent(sentryEvent, peek.getScope(), obj);
                this.lastEventId = sentryId;
                return sentryId;
            } catch (Throwable th2) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                StringBuilder q10 = b.q("Error while capturing event with id: ");
                q10.append(sentryEvent.getEventId());
                logger.log(sentryLevel, q10.toString(), th2);
                return sentryId;
            }
        }
    }

    public final /* synthetic */ SentryId captureException(Throwable th2) {
        return e.f(this, th2);
    }

    public SentryId captureException(Throwable th2, Object obj) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                Stack.StackItem peek = this.stack.peek();
                SentryEvent sentryEvent = new SentryEvent(th2);
                assignTraceContext(sentryEvent);
                sentryId = peek.getClient().captureEvent(sentryEvent, peek.getScope(), obj);
            } catch (Throwable th3) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                StringBuilder q10 = b.q("Error while capturing exception: ");
                q10.append(th2.getMessage());
                logger.log(sentryLevel, q10.toString(), th3);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    public final /* synthetic */ SentryId captureMessage(String str) {
        return e.g(this, str);
    }

    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                Stack.StackItem peek = this.stack.peek();
                sentryId = peek.getClient().captureMessage(str, sentryLevel, peek.getScope());
            } catch (Throwable th2) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel2 = SentryLevel.ERROR;
                logger.log(sentryLevel2, "Error while capturing message: " + str, th2);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState) {
        return e.h(this, sentryTransaction, traceState);
    }

    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Object obj) {
        Objects.requireNonNull(sentryTransaction, "transaction is required");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return sentryId;
        } else if (!sentryTransaction.isFinished()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", sentryTransaction.getEventId());
            return sentryId;
        } else if (!Boolean.TRUE.equals(Boolean.valueOf(sentryTransaction.isSampled()))) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", sentryTransaction.getEventId());
            return sentryId;
        } else {
            try {
                Stack.StackItem peek = this.stack.peek();
                return peek.getClient().captureTransaction(sentryTransaction, traceState, peek.getScope(), obj);
            } catch (Throwable th2) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                StringBuilder q10 = b.q("Error while capturing transaction with id: ");
                q10.append(sentryTransaction.getEventId());
                logger.log(sentryLevel, q10.toString(), th2);
                return sentryId;
            }
        }
    }

    public final /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, Object obj) {
        return e.i(this, sentryTransaction, obj);
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureUserFeedback' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.stack.peek().getClient().captureUserFeedback(userFeedback);
        } catch (Throwable th2) {
            ILogger logger = this.options.getLogger();
            SentryLevel sentryLevel = SentryLevel.ERROR;
            StringBuilder q10 = b.q("Error while capturing captureUserFeedback: ");
            q10.append(userFeedback.toString());
            logger.log(sentryLevel, q10.toString(), th2);
        }
    }

    public void clearBreadcrumbs() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'clearBreadcrumbs' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().clearBreadcrumbs();
        }
    }

    public IHub clone() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new Hub(this.options, new Stack(this.stack));
    }

    public void close() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration next : this.options.getIntegrations()) {
                if (next instanceof Closeable) {
                    ((Closeable) next).close();
                }
            }
            this.options.getExecutorService().close(this.options.getShutdownTimeout());
            this.stack.peek().getClient().close();
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while closing the Hub.", th2);
        }
        this.isEnabled = false;
    }

    public void configureScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            scopeCallback.run(this.stack.peek().getScope());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    public void endSession() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        Session endSession = peek.getScope().endSession();
        if (endSession != null) {
            peek.getClient().captureSession(endSession, new SessionEndHint());
        }
    }

    public void flush(long j10) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.stack.peek().getClient().flush(j10);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    public SentryId getLastEventId() {
        return this.lastEventId;
    }

    public SentryOptions getOptions() {
        return this.stack.peek().getOptions();
    }

    public ISpan getSpan() {
        if (isEnabled()) {
            return this.stack.peek().getScope().getSpan();
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    public SpanContext getSpanContext(Throwable th2) {
        ISpan iSpan;
        Objects.requireNonNull(th2, "throwable is required");
        Pair pair = this.throwableToSpan.get(ExceptionUtils.findRootCause(th2));
        if (pair == null || (iSpan = (ISpan) pair.getFirst()) == null) {
            return null;
        }
        return iSpan.getSpanContext();
    }

    public Boolean isCrashedLastRun() {
        return SentryCrashLastRunState.getInstance().isCrashedLastRun(this.options.getCacheDirPath(), !this.options.isEnableAutoSessionTracking());
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void popScope() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
        } else {
            this.stack.pop();
        }
    }

    public void pushScope() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        this.stack.push(new Stack.StackItem(this.options, peek.getClient(), new Scope(peek.getScope())));
    }

    public void removeExtra(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeExtra' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "removeExtra called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().removeExtra(str);
        }
    }

    public void removeTag(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "removeTag called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().removeTag(str);
        }
    }

    public void setExtra(String str, String str2) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setExtra' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setExtra called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setExtra(str, str2);
        }
    }

    public void setFingerprint(List<String> list) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setFingerprint' call is a no-op.", new Object[0]);
        } else if (list == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setFingerprint called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setFingerprint(list);
        }
    }

    public void setLevel(SentryLevel sentryLevel) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setLevel' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().setLevel(sentryLevel);
        }
    }

    public void setSpanContext(Throwable th2, ISpan iSpan, String str) {
        Objects.requireNonNull(th2, "throwable is required");
        Objects.requireNonNull(iSpan, "span is required");
        Objects.requireNonNull(str, "transactionName is required");
        Throwable findRootCause = ExceptionUtils.findRootCause(th2);
        if (!this.throwableToSpan.containsKey(findRootCause)) {
            this.throwableToSpan.put(findRootCause, new Pair(iSpan, str));
        }
    }

    public void setTag(String str, String str2) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setTag(str, str2);
        }
    }

    public void setTransaction(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTransaction' call is a no-op.", new Object[0]);
        } else if (str != null) {
            this.stack.peek().getScope().setTransaction(str);
        } else {
            this.options.getLogger().log(SentryLevel.WARNING, "Transaction cannot be null", new Object[0]);
        }
    }

    public void setUser(User user) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().setUser(user);
        }
    }

    public void startSession() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        Scope.SessionPair startSession = peek.getScope().startSession();
        if (startSession != null) {
            if (startSession.getPrevious() != null) {
                peek.getClient().captureSession(startSession.getPrevious(), new SessionEndHint());
            }
            peek.getClient().captureSession(startSession.getCurrent(), new SessionStartHint());
            return;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
    }

    public final /* synthetic */ ITransaction startTransaction(TransactionContext transactionContext) {
        return e.j(this, transactionContext);
    }

    public final /* synthetic */ ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        return e.k(this, transactionContext, customSamplingContext);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z) {
        return createTransaction(transactionContext, customSamplingContext, z, (Date) null, false, (TransactionFinishedCallback) null);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date) {
        return createTransaction(transactionContext, customSamplingContext, z, date, false, (TransactionFinishedCallback) null);
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date, boolean z10, TransactionFinishedCallback transactionFinishedCallback) {
        return createTransaction(transactionContext, customSamplingContext, z, date, z10, transactionFinishedCallback);
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
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'traceHeaders' call is a no-op.", new Object[0]);
        } else {
            ISpan span = this.stack.peek().getScope().getSpan();
            if (span != null) {
                return span.toSentryTrace();
            }
        }
        return null;
    }

    public void withScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'withScope' call is a no-op.", new Object[0]);
            return;
        }
        pushScope();
        try {
            scopeCallback.run(this.stack.peek().getScope());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", th2);
        }
        popScope();
    }
}
