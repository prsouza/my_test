package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Span implements ISpan {
    private final SpanContext context;
    private final Map<String, Object> data;
    private final AtomicBoolean finished;
    private final IHub hub;
    private final SpanFinishedCallback spanFinishedCallback;
    private final Date startTimestamp;
    private Throwable throwable;
    private Date timestamp;
    private final SentryTracer transaction;

    public Span(TransactionContext transactionContext, SentryTracer sentryTracer, IHub iHub, Date date) {
        this.finished = new AtomicBoolean(false);
        this.data = new ConcurrentHashMap();
        this.context = (SpanContext) Objects.requireNonNull(transactionContext, "context is required");
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "sentryTracer is required");
        this.hub = (IHub) Objects.requireNonNull(iHub, "hub is required");
        this.startTimestamp = date == null ? DateUtils.getCurrentDateTime() : date;
        this.spanFinishedCallback = null;
    }

    public Span(SentryId sentryId, SpanId spanId, SentryTracer sentryTracer, String str, IHub iHub) {
        this(sentryId, spanId, sentryTracer, str, iHub, (Date) null, (SpanFinishedCallback) null);
    }

    public Span(SentryId sentryId, SpanId spanId, SentryTracer sentryTracer, String str, IHub iHub, Date date, SpanFinishedCallback spanFinishedCallback2) {
        this.finished = new AtomicBoolean(false);
        this.data = new ConcurrentHashMap();
        this.context = new SpanContext(sentryId, new SpanId(), str, spanId, sentryTracer.isSampled());
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "transaction is required");
        this.startTimestamp = date == null ? DateUtils.getCurrentDateTime() : date;
        this.hub = (IHub) Objects.requireNonNull(iHub, "hub is required");
        this.spanFinishedCallback = spanFinishedCallback2;
    }

    public void finish() {
        finish(this.context.getStatus());
    }

    public void finish(SpanStatus spanStatus) {
        finish(spanStatus, DateUtils.getCurrentDateTime());
    }

    public void finish(SpanStatus spanStatus, Date date) {
        if (this.finished.compareAndSet(false, true)) {
            this.context.setStatus(spanStatus);
            this.timestamp = date;
            Throwable th2 = this.throwable;
            if (th2 != null) {
                this.hub.setSpanContext(th2, this, this.transaction.getName());
            }
            SpanFinishedCallback spanFinishedCallback2 = this.spanFinishedCallback;
            if (spanFinishedCallback2 != null) {
                spanFinishedCallback2.execute(this);
            }
        }
    }

    public Object getData(String str) {
        return this.data.get(str);
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.context.getDescription();
    }

    public String getOperation() {
        return this.context.getOperation();
    }

    public SpanId getParentSpanId() {
        return this.context.getParentSpanId();
    }

    public SpanContext getSpanContext() {
        return this.context;
    }

    public SpanId getSpanId() {
        return this.context.getSpanId();
    }

    public Date getStartTimestamp() {
        return this.startTimestamp;
    }

    public SpanStatus getStatus() {
        return this.context.getStatus();
    }

    public String getTag(String str) {
        return this.context.getTags().get(str);
    }

    public Map<String, String> getTags() {
        return this.context.getTags();
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public SentryId getTraceId() {
        return this.context.getTraceId();
    }

    public boolean isFinished() {
        return this.finished.get();
    }

    public Boolean isSampled() {
        return this.context.getSampled();
    }

    public void setData(String str, Object obj) {
        this.data.put(str, obj);
    }

    public void setDescription(String str) {
        this.context.setDescription(str);
    }

    public void setOperation(String str) {
        this.context.setOperation(str);
    }

    public void setStatus(SpanStatus spanStatus) {
        this.context.setStatus(spanStatus);
    }

    public void setTag(String str, String str2) {
        this.context.setTag(str, str2);
    }

    public void setThrowable(Throwable th2) {
        this.throwable = th2;
    }

    public ISpan startChild(String str) {
        return startChild(str, (String) null);
    }

    public ISpan startChild(String str, String str2) {
        return this.transaction.startChild(this.context.getSpanId(), str, str2);
    }

    public ISpan startChild(String str, String str2, Date date) {
        return this.transaction.startChild(this.context.getSpanId(), str, str2, date);
    }

    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(this.context.getTraceId(), this.context.getSpanId(), this.context.getSampled());
    }

    public TraceStateHeader toTraceStateHeader() {
        return this.transaction.toTraceStateHeader();
    }

    public TraceState traceState() {
        return this.transaction.traceState();
    }
}
