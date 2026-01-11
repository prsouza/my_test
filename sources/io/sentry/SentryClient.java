package io.sentry;

import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.ITransport;
import io.sentry.util.ApplyScopeUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class SentryClient implements ISentryClient {
    public static final String SENTRY_PROTOCOL_VERSION = "7";
    private boolean enabled;
    private final SentryOptions options;
    private final SecureRandom random;
    private final SortBreadcrumbsByDate sortBreadcrumbsByDate = new SortBreadcrumbsByDate();
    private final ITransport transport;

    public static final class SortBreadcrumbsByDate implements Comparator<Breadcrumb> {
        private SortBreadcrumbsByDate() {
        }

        public int compare(Breadcrumb breadcrumb, Breadcrumb breadcrumb2) {
            return breadcrumb.getTimestamp().compareTo(breadcrumb2.getTimestamp());
        }
    }

    public SentryClient(SentryOptions sentryOptions) {
        SecureRandom secureRandom = null;
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.enabled = true;
        ITransportFactory transportFactory = sentryOptions.getTransportFactory();
        if (transportFactory instanceof NoOpTransportFactory) {
            transportFactory = new AsyncHttpTransportFactory();
            sentryOptions.setTransportFactory(transportFactory);
        }
        this.transport = transportFactory.create(sentryOptions, new RequestDetailsResolver(sentryOptions).resolve());
        this.random = sentryOptions.getSampleRate() != null ? new SecureRandom() : secureRandom;
    }

    private <T extends SentryBaseEvent> T applyScope(T t10, Scope scope) {
        if (scope != null) {
            if (t10.getRequest() == null) {
                t10.setRequest(scope.getRequest());
            }
            if (t10.getUser() == null) {
                t10.setUser(scope.getUser());
            }
            if (t10.getTags() == null) {
                t10.setTags(new HashMap(scope.getTags()));
            } else {
                for (Map.Entry next : scope.getTags().entrySet()) {
                    if (!t10.getTags().containsKey(next.getKey())) {
                        t10.getTags().put((String) next.getKey(), (String) next.getValue());
                    }
                }
            }
            if (t10.getBreadcrumbs() == null) {
                t10.setBreadcrumbs(new ArrayList(scope.getBreadcrumbs()));
            } else {
                sortBreadcrumbsByDate(t10, scope.getBreadcrumbs());
            }
            if (t10.getExtras() == null) {
                t10.setExtras(new HashMap(scope.getExtras()));
            } else {
                for (Map.Entry next2 : scope.getExtras().entrySet()) {
                    if (!t10.getExtras().containsKey(next2.getKey())) {
                        t10.getExtras().put((String) next2.getKey(), next2.getValue());
                    }
                }
            }
            Contexts contexts = t10.getContexts();
            for (Map.Entry entry : new Contexts(scope.getContexts()).entrySet()) {
                if (!contexts.containsKey(entry.getKey())) {
                    contexts.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
        return t10;
    }

    private SentryEvent applyScope(SentryEvent sentryEvent, Scope scope, Object obj) {
        if (scope == null) {
            return sentryEvent;
        }
        applyScope(sentryEvent, scope);
        if (sentryEvent.getTransaction() == null) {
            sentryEvent.setTransaction(scope.getTransactionName());
        }
        if (sentryEvent.getFingerprints() == null) {
            sentryEvent.setFingerprints(scope.getFingerprint());
        }
        if (scope.getLevel() != null) {
            sentryEvent.setLevel(scope.getLevel());
        }
        ISpan span = scope.getSpan();
        if (sentryEvent.getContexts().getTrace() == null && span != null) {
            sentryEvent.getContexts().setTrace(span.getSpanContext());
        }
        return processEvent(sentryEvent, obj, scope.getEventProcessors());
    }

    private SentryEnvelope buildEnvelope(SentryBaseEvent sentryBaseEvent, List<Attachment> list, Session session, TraceState traceState) {
        SentryId sentryId;
        ArrayList arrayList = new ArrayList();
        if (sentryBaseEvent != null) {
            arrayList.add(SentryEnvelopeItem.fromEvent(this.options.getSerializer(), sentryBaseEvent));
            sentryId = sentryBaseEvent.getEventId();
        } else {
            sentryId = null;
        }
        if (session != null) {
            arrayList.add(SentryEnvelopeItem.fromSession(this.options.getSerializer(), session));
        }
        if (list != null) {
            for (Attachment fromAttachment : list) {
                arrayList.add(SentryEnvelopeItem.fromAttachment(fromAttachment, this.options.getMaxAttachmentSize()));
            }
        }
        if (!arrayList.isEmpty()) {
            return new SentryEnvelope(new SentryEnvelopeHeader(sentryId, this.options.getSdkVersion(), traceState), arrayList);
        }
        return null;
    }

    private SentryEnvelope buildEnvelope(UserFeedback userFeedback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromUserFeedback(this.options.getSerializer(), userFeedback));
        return new SentryEnvelope(new SentryEnvelopeHeader(userFeedback.getEventId(), this.options.getSdkVersion()), arrayList);
    }

    private SentryEvent executeBeforeSend(SentryEvent sentryEvent, Object obj) {
        SentryOptions.BeforeSendCallback beforeSend = this.options.getBeforeSend();
        if (beforeSend == null) {
            return sentryEvent;
        }
        try {
            return beforeSend.execute(sentryEvent, obj);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setMessage("BeforeSend callback failed.");
            breadcrumb.setCategory("SentryClient");
            breadcrumb.setLevel(SentryLevel.ERROR);
            if (th2.getMessage() != null) {
                breadcrumb.setData("sentry:message", th2.getMessage());
            }
            sentryEvent.addBreadcrumb(breadcrumb);
            return sentryEvent;
        }
    }

    private List<Attachment> filterForTransaction(List<Attachment> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Attachment next : list) {
            if (next.isAddToTransactions()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private List<Attachment> getAttachmentsFromScope(Scope scope) {
        if (scope != null) {
            return scope.getAttachments();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSessionData$0(SentryEvent sentryEvent, Object obj, Session session) {
        boolean z = false;
        if (session != null) {
            String str = null;
            Session.State state = sentryEvent.isCrashed() ? Session.State.Crashed : null;
            if (Session.State.Crashed == state || sentryEvent.isErrored()) {
                z = true;
            }
            if (!(sentryEvent.getRequest() == null || sentryEvent.getRequest().getHeaders() == null || !sentryEvent.getRequest().getHeaders().containsKey("user-agent"))) {
                str = sentryEvent.getRequest().getHeaders().get("user-agent");
            }
            if (session.update(state, str, z) && (obj instanceof DiskFlushNotification)) {
                session.end();
                return;
            }
            return;
        }
        this.options.getLogger().log(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
    }

    private SentryEvent processEvent(SentryEvent sentryEvent, Object obj, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryEvent = next.process(sentryEvent, obj);
                continue;
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "An exception occurred while processing event by processor: %s", next.getClass().getName());
                continue;
            }
            if (sentryEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                break;
            }
        }
        return sentryEvent;
    }

    private SentryTransaction processTransaction(SentryTransaction sentryTransaction, Object obj, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryTransaction = next.process(sentryTransaction, obj);
                continue;
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
                continue;
            }
            if (sentryTransaction == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                break;
            }
        }
        return sentryTransaction;
    }

    private boolean sample() {
        return this.options.getSampleRate() == null || this.random == null || this.options.getSampleRate().doubleValue() >= this.random.nextDouble();
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Object obj) {
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", sentryBaseEvent.getEventId());
        return false;
    }

    private void sortBreadcrumbsByDate(SentryBaseEvent sentryBaseEvent, Collection<Breadcrumb> collection) {
        List<Breadcrumb> breadcrumbs = sentryBaseEvent.getBreadcrumbs();
        if (breadcrumbs != null && !collection.isEmpty()) {
            breadcrumbs.addAll(collection);
            Collections.sort(breadcrumbs, this.sortBreadcrumbsByDate);
        }
    }

    public final /* synthetic */ SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return f.a(this, sentryEnvelope);
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        try {
            this.transport.send(sentryEnvelope, obj);
            SentryId eventId = sentryEnvelope.getHeader().getEventId();
            return eventId != null ? eventId : SentryId.EMPTY_ID;
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope.", (Throwable) e10);
            return SentryId.EMPTY_ID;
        }
    }

    public final /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent) {
        return f.b(this, sentryEvent);
    }

    public final /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent, Scope scope) {
        return f.c(this, sentryEvent, scope);
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj) {
        Session session;
        Objects.requireNonNull(sentryEvent, "SentryEvent is required.");
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing event: %s", sentryEvent.getEventId());
        if (!shouldApplyScopeData(sentryEvent, obj) || (sentryEvent = applyScope(sentryEvent, scope, obj)) != null) {
            SentryEvent processEvent = processEvent(sentryEvent, obj, this.options.getEventProcessors());
            TraceState traceState = null;
            if (processEvent != null) {
                session = updateSessionData(processEvent, obj, scope);
                if (!sample()) {
                    this.options.getLogger().log(sentryLevel, "Event %s was dropped due to sampling decision.", processEvent.getEventId());
                    processEvent = null;
                }
            } else {
                session = null;
            }
            if (processEvent != null) {
                if (processEvent.getThrowable() == null || !this.options.containsIgnoredExceptionForType(processEvent.getThrowable())) {
                    processEvent = executeBeforeSend(processEvent, obj);
                    if (processEvent == null) {
                        this.options.getLogger().log(sentryLevel, "Event was dropped by beforeSend", new Object[0]);
                    }
                } else {
                    this.options.getLogger().log(sentryLevel, "Event was dropped as the exception %s is ignored", processEvent.getThrowable().getClass());
                }
            }
            SentryId sentryId = SentryId.EMPTY_ID;
            if (!(processEvent == null || processEvent.getEventId() == null)) {
                sentryId = processEvent.getEventId();
            }
            if (scope != null) {
                try {
                    if (scope.getTransaction() != null) {
                        traceState = scope.getTransaction().traceState();
                    }
                } catch (IOException e10) {
                    this.options.getLogger().log(SentryLevel.WARNING, e10, "Capturing event %s failed.", sentryId);
                    return SentryId.EMPTY_ID;
                }
            }
            SentryEnvelope buildEnvelope = buildEnvelope(processEvent, getAttachmentsFromScope(scope), session, traceState);
            if (buildEnvelope == null) {
                return sentryId;
            }
            this.transport.send(buildEnvelope, obj);
            return sentryId;
        }
        this.options.getLogger().log(sentryLevel, "Event was dropped by applyScope", new Object[0]);
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
        Objects.requireNonNull(session, "Session is required.");
        if (session.getRelease() == null || session.getRelease().isEmpty()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            captureEnvelope(SentryEnvelope.from(this.options.getSerializer(), session, this.options.getSdkVersion()), obj);
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture session.", (Throwable) e10);
        }
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
        Objects.requireNonNull(sentryTransaction, "Transaction is required.");
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing transaction: %s", sentryTransaction.getEventId());
        SentryId sentryId = SentryId.EMPTY_ID;
        SentryId eventId = sentryTransaction.getEventId() != null ? sentryTransaction.getEventId() : sentryId;
        if (shouldApplyScopeData(sentryTransaction, obj)) {
            sentryTransaction = (SentryTransaction) applyScope(sentryTransaction, scope);
            if (!(sentryTransaction == null || scope == null)) {
                sentryTransaction = processTransaction(sentryTransaction, obj, scope.getEventProcessors());
            }
            if (sentryTransaction == null) {
                this.options.getLogger().log(sentryLevel, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (sentryTransaction != null) {
            sentryTransaction = processTransaction(sentryTransaction, obj, this.options.getEventProcessors());
        }
        if (sentryTransaction == null) {
            this.options.getLogger().log(sentryLevel, "Transaction was dropped by Event processors.", new Object[0]);
            return sentryId;
        }
        try {
            SentryEnvelope buildEnvelope = buildEnvelope(sentryTransaction, filterForTransaction(getAttachmentsFromScope(scope)), (Session) null, traceState);
            if (buildEnvelope == null) {
                return sentryId;
            }
            this.transport.send(buildEnvelope, obj);
            return eventId;
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.WARNING, e10, "Capturing transaction %s failed.", eventId);
            return SentryId.EMPTY_ID;
        }
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
        Objects.requireNonNull(userFeedback, "SentryEvent is required.");
        if (SentryId.EMPTY_ID.equals(userFeedback.getEventId())) {
            this.options.getLogger().log(SentryLevel.WARNING, "Capturing userFeedback without a Sentry Id.", new Object[0]);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing userFeedback: %s", userFeedback.getEventId());
        try {
            this.transport.send(buildEnvelope(userFeedback));
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.WARNING, e10, "Capturing user feedback %s failed.", userFeedback.getEventId());
        }
    }

    public void close() {
        this.options.getLogger().log(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        try {
            flush(this.options.getShutdownTimeout());
            this.transport.close();
        } catch (IOException e10) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", (Throwable) e10);
        }
        for (EventProcessor next : this.options.getEventProcessors()) {
            if (next instanceof Closeable) {
                try {
                    ((Closeable) next).close();
                } catch (IOException e11) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the event processor {}.", next, e11);
                }
            }
        }
        this.enabled = false;
    }

    public void flush(long j10) {
        this.transport.flush(j10);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public Session updateSessionData(SentryEvent sentryEvent, Object obj, Scope scope) {
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            if (scope != null) {
                return scope.withSession(new k(this, sentryEvent, obj));
            }
            this.options.getLogger().log(SentryLevel.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }
}
