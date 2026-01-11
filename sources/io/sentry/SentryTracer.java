package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import r4.c;
import s7.u;
import x8.q0;

public final class SentryTracer implements ITransaction {
    private final List<Span> children;
    private final Contexts contexts;
    private final SentryId eventId;
    private FinishStatus finishStatus;
    private final IHub hub;
    private String name;
    private Request request;
    private final Span root;
    private TraceState traceState;
    private final TransactionFinishedCallback transactionFinishedCallback;
    private final boolean waitForChildren;

    public static final class FinishStatus {
        public static final FinishStatus NOT_FINISHED = notFinished();
        /* access modifiers changed from: private */
        public final boolean isFinishing;
        /* access modifiers changed from: private */
        public final SpanStatus spanStatus;

        private FinishStatus(boolean z, SpanStatus spanStatus2) {
            this.isFinishing = z;
            this.spanStatus = spanStatus2;
        }

        public static FinishStatus finishing(SpanStatus spanStatus2) {
            return new FinishStatus(true, spanStatus2);
        }

        private static FinishStatus notFinished() {
            return new FinishStatus(false, (SpanStatus) null);
        }
    }

    public SentryTracer(TransactionContext transactionContext, IHub iHub) {
        this(transactionContext, iHub, (Date) null);
    }

    public SentryTracer(TransactionContext transactionContext, IHub iHub, Date date) {
        this(transactionContext, iHub, date, false, (TransactionFinishedCallback) null);
    }

    public SentryTracer(TransactionContext transactionContext, IHub iHub, Date date, boolean z, TransactionFinishedCallback transactionFinishedCallback2) {
        this.eventId = new SentryId();
        this.children = new CopyOnWriteArrayList();
        this.contexts = new Contexts();
        this.finishStatus = FinishStatus.NOT_FINISHED;
        Objects.requireNonNull(transactionContext, "context is required");
        Objects.requireNonNull(iHub, "hub is required");
        this.root = new Span(transactionContext, this, iHub, date);
        this.name = transactionContext.getName();
        this.hub = iHub;
        this.waitForChildren = z;
        this.transactionFinishedCallback = transactionFinishedCallback2;
    }

    public SentryTracer(TransactionContext transactionContext, IHub iHub, boolean z, TransactionFinishedCallback transactionFinishedCallback2) {
        this(transactionContext, iHub, (Date) null, z, transactionFinishedCallback2);
    }

    private ISpan createChild(SpanId spanId, String str) {
        return createChild(spanId, str, (String) null, (Date) null);
    }

    private ISpan createChild(SpanId spanId, String str, String str2, Date date) {
        Objects.requireNonNull(spanId, "parentSpanId is required");
        Objects.requireNonNull(str, "operation is required");
        Span span = new Span(this.root.getTraceId(), spanId, this, str, this.hub, date, new v(this));
        span.setDescription(str2);
        this.children.add(span);
        return span;
    }

    private ISpan createChild(String str, String str2, Date date) {
        if (this.children.size() < this.hub.getOptions().getMaxSpans()) {
            return this.root.startChild(str, str2, date);
        }
        this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return NoOpSpan.getInstance();
    }

    private boolean hasAllChildrenFinished() {
        ArrayList arrayList = new ArrayList(this.children);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((Span) it.next()).isFinished()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createChild$0(Span span) {
        FinishStatus finishStatus2 = this.finishStatus;
        if (finishStatus2.isFinishing) {
            finish(finishStatus2.spanStatus);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$finish$1(Scope scope, ITransaction iTransaction) {
        if (iTransaction == this) {
            scope.clearTransaction();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$finish$2(Scope scope) {
        scope.withTransaction(new u(this, scope));
    }

    public void finish() {
        finish(getStatus());
    }

    public void finish(SpanStatus spanStatus) {
        this.finishStatus = FinishStatus.finishing(spanStatus);
        if (this.root.isFinished()) {
            return;
        }
        if (!this.waitForChildren || hasAllChildrenFinished()) {
            this.root.finish(this.finishStatus.spanStatus);
            Date timestamp = this.root.getTimestamp();
            if (timestamp == null) {
                this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Root span - op: %s, description: %s - has no timestamp set, when finishing unfinished spans.", this.root.getOperation(), this.root.getDescription());
                timestamp = DateUtils.getCurrentDateTime();
            }
            for (Span next : this.children) {
                if (!next.isFinished()) {
                    next.finish(SpanStatus.DEADLINE_EXCEEDED, timestamp);
                }
            }
            this.hub.configureScope(new q0(this, 4));
            SentryTransaction sentryTransaction = new SentryTransaction(this);
            TransactionFinishedCallback transactionFinishedCallback2 = this.transactionFinishedCallback;
            if (transactionFinishedCallback2 != null) {
                transactionFinishedCallback2.execute(this);
            }
            this.hub.captureTransaction(sentryTransaction, traceState());
        }
    }

    public List<Span> getChildren() {
        return this.children;
    }

    @Deprecated
    public Contexts getContexts() {
        return this.contexts;
    }

    public Object getData(String str) {
        return this.root.getData(str);
    }

    public Map<String, Object> getData() {
        return this.root.getData();
    }

    public String getDescription() {
        return this.root.getDescription();
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public Span getLatestActiveSpan() {
        ArrayList arrayList = new ArrayList(this.children);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((Span) arrayList.get(size)).isFinished()) {
                return (Span) arrayList.get(size);
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getOperation() {
        return this.root.getOperation();
    }

    @Deprecated
    public Request getRequest() {
        return this.request;
    }

    public Span getRoot() {
        return this.root;
    }

    public SpanContext getSpanContext() {
        return this.root.getSpanContext();
    }

    public List<Span> getSpans() {
        return this.children;
    }

    public Date getStartTimestamp() {
        return this.root.getStartTimestamp();
    }

    public SpanStatus getStatus() {
        return this.root.getStatus();
    }

    public String getTag(String str) {
        return this.root.getTag(str);
    }

    public Throwable getThrowable() {
        return this.root.getThrowable();
    }

    public Date getTimestamp() {
        return this.root.getTimestamp();
    }

    public boolean isFinished() {
        return this.root.isFinished();
    }

    public Boolean isSampled() {
        return this.root.isSampled();
    }

    public void setData(String str, Object obj) {
        this.root.setData(str, obj);
    }

    public void setDescription(String str) {
        this.root.setDescription(str);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOperation(String str) {
        this.root.setOperation(str);
    }

    @Deprecated
    public void setRequest(Request request2) {
        this.request = request2;
    }

    public void setStatus(SpanStatus spanStatus) {
        this.root.setStatus(spanStatus);
    }

    public void setTag(String str, String str2) {
        this.root.setTag(str, str2);
    }

    public void setThrowable(Throwable th2) {
        this.root.setThrowable(th2);
    }

    public ISpan startChild(SpanId spanId, String str, String str2) {
        ISpan createChild = createChild(spanId, str);
        createChild.setDescription(str2);
        return createChild;
    }

    public ISpan startChild(SpanId spanId, String str, String str2, Date date) {
        return createChild(spanId, str, str2, date);
    }

    public ISpan startChild(String str) {
        return startChild(str, (String) null);
    }

    public ISpan startChild(String str, String str2) {
        return createChild(str, str2, (Date) null);
    }

    public ISpan startChild(String str, String str2, Date date) {
        return createChild(str, str2, date);
    }

    public SentryTraceHeader toSentryTrace() {
        return this.root.toSentryTrace();
    }

    public TraceStateHeader toTraceStateHeader() {
        TraceState traceState2 = traceState();
        if (!this.hub.getOptions().isTraceSampling() || traceState2 == null) {
            return null;
        }
        return TraceStateHeader.fromTraceState(traceState2, this.hub.getOptions().getSerializer(), this.hub.getOptions().getLogger());
    }

    public TraceState traceState() {
        TraceState traceState2;
        if (!this.hub.getOptions().isTraceSampling()) {
            return null;
        }
        synchronized (this) {
            if (this.traceState == null) {
                AtomicReference atomicReference = new AtomicReference();
                this.hub.configureScope(new c(atomicReference));
                this.traceState = new TraceState(this, (User) atomicReference.get(), this.hub.getOptions());
            }
            traceState2 = this.traceState;
        }
        return traceState2;
    }
}
