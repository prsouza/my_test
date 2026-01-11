package io.sentry;

import io.sentry.hints.Cached;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.ApplyScopeUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MainEventProcessor implements EventProcessor, Closeable {
    private static final String DEFAULT_ENVIRONMENT = "production";
    private final HostnameCache hostnameCache;
    private final SentryOptions options;
    private final SentryExceptionFactory sentryExceptionFactory;
    private final SentryThreadFactory sentryThreadFactory;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MainEventProcessor(SentryOptions sentryOptions) {
        this(sentryOptions, sentryOptions.isAttachServerName() ? HostnameCache.getInstance() : null);
    }

    public MainEventProcessor(SentryOptions sentryOptions, HostnameCache hostnameCache2) {
        SentryOptions sentryOptions2 = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
        this.options = sentryOptions2;
        this.hostnameCache = hostnameCache2;
        SentryStackTraceFactory sentryStackTraceFactory = new SentryStackTraceFactory(sentryOptions2.getInAppExcludes(), sentryOptions2.getInAppIncludes());
        this.sentryExceptionFactory = new SentryExceptionFactory(sentryStackTraceFactory);
        this.sentryThreadFactory = new SentryThreadFactory(sentryStackTraceFactory, sentryOptions2);
    }

    public MainEventProcessor(SentryOptions sentryOptions, SentryThreadFactory sentryThreadFactory2, SentryExceptionFactory sentryExceptionFactory2, HostnameCache hostnameCache2) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
        this.sentryThreadFactory = (SentryThreadFactory) Objects.requireNonNull(sentryThreadFactory2, "The SentryThreadFactory is required.");
        this.sentryExceptionFactory = (SentryExceptionFactory) Objects.requireNonNull(sentryExceptionFactory2, "The SentryExceptionFactory is required.");
        this.hostnameCache = (HostnameCache) Objects.requireNonNull(hostnameCache2, "The HostnameCache is required");
    }

    private boolean isCachedHint(Object obj) {
        return obj instanceof Cached;
    }

    private void mergeUser(SentryBaseEvent sentryBaseEvent) {
        if (!this.options.isSendDefaultPii()) {
            return;
        }
        if (sentryBaseEvent.getUser() == null) {
            User user = new User();
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
            sentryBaseEvent.setUser(user);
        } else if (sentryBaseEvent.getUser().getIpAddress() == null) {
            sentryBaseEvent.getUser().setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    private void processNonCachedEvent(SentryBaseEvent sentryBaseEvent) {
        setRelease(sentryBaseEvent);
        setEnvironment(sentryBaseEvent);
        setServerName(sentryBaseEvent);
        setDist(sentryBaseEvent);
        setSdk(sentryBaseEvent);
        setTags(sentryBaseEvent);
        mergeUser(sentryBaseEvent);
    }

    private void setCommons(SentryBaseEvent sentryBaseEvent) {
        setPlatform(sentryBaseEvent);
    }

    private void setDebugMeta(SentryEvent sentryEvent) {
        if (this.options.getProguardUuid() != null) {
            DebugMeta debugMeta = sentryEvent.getDebugMeta();
            if (debugMeta == null) {
                debugMeta = new DebugMeta();
            }
            if (debugMeta.getImages() == null) {
                debugMeta.setImages(new ArrayList());
            }
            List<DebugImage> images = debugMeta.getImages();
            if (images != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(this.options.getProguardUuid());
                images.add(debugImage);
                sentryEvent.setDebugMeta(debugMeta);
            }
        }
    }

    private void setDist(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(this.options.getDist());
        }
    }

    private void setEnvironment(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getEnvironment() == null) {
            sentryBaseEvent.setEnvironment(this.options.getEnvironment() != null ? this.options.getEnvironment() : DEFAULT_ENVIRONMENT);
        }
    }

    private void setExceptions(SentryEvent sentryEvent) {
        Throwable throwableMechanism = sentryEvent.getThrowableMechanism();
        if (throwableMechanism != null) {
            sentryEvent.setExceptions(this.sentryExceptionFactory.getSentryExceptions(throwableMechanism));
        }
    }

    private void setPlatform(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getPlatform() == null) {
            sentryBaseEvent.setPlatform(SentryBaseEvent.DEFAULT_PLATFORM);
        }
    }

    private void setRelease(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getRelease() == null) {
            sentryBaseEvent.setRelease(this.options.getRelease());
        }
    }

    private void setSdk(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getSdk() == null) {
            sentryBaseEvent.setSdk(this.options.getSdkVersion());
        }
    }

    private void setServerName(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getServerName() == null) {
            sentryBaseEvent.setServerName(this.options.getServerName());
        }
        if (this.options.isAttachServerName() && this.hostnameCache != null && sentryBaseEvent.getServerName() == null) {
            sentryBaseEvent.setServerName(this.hostnameCache.getHostname());
        }
    }

    private void setTags(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getTags() == null) {
            sentryBaseEvent.setTags(new HashMap(this.options.getTags()));
            return;
        }
        for (Map.Entry next : this.options.getTags().entrySet()) {
            if (!sentryBaseEvent.getTags().containsKey(next.getKey())) {
                sentryBaseEvent.setTag((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    private void setThreads(SentryEvent sentryEvent, Object obj) {
        List<SentryThread> currentThread;
        if (sentryEvent.getThreads() == null) {
            ArrayList arrayList = null;
            List<SentryException> exceptions = sentryEvent.getExceptions();
            if (exceptions != null && !exceptions.isEmpty()) {
                for (SentryException next : exceptions) {
                    if (!(next.getMechanism() == null || next.getThreadId() == null)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next.getThreadId());
                    }
                }
            }
            if (this.options.isAttachThreads()) {
                currentThread = this.sentryThreadFactory.getCurrentThreads(arrayList);
            } else if (!this.options.isAttachStacktrace()) {
                return;
            } else {
                if ((exceptions == null || exceptions.isEmpty()) && !isCachedHint(obj)) {
                    currentThread = this.sentryThreadFactory.getCurrentThread();
                } else {
                    return;
                }
            }
            sentryEvent.setThreads(currentThread);
        }
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Object obj) {
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.getEventId());
        return false;
    }

    public void close() {
        HostnameCache hostnameCache2 = this.hostnameCache;
        if (hostnameCache2 != null) {
            hostnameCache2.close();
        }
    }

    public HostnameCache getHostnameCache() {
        return this.hostnameCache;
    }

    public boolean isClosed() {
        HostnameCache hostnameCache2 = this.hostnameCache;
        if (hostnameCache2 != null) {
            return hostnameCache2.isClosed();
        }
        return true;
    }

    public SentryEvent process(SentryEvent sentryEvent, Object obj) {
        setCommons(sentryEvent);
        setExceptions(sentryEvent);
        setDebugMeta(sentryEvent);
        if (shouldApplyScopeData(sentryEvent, obj)) {
            processNonCachedEvent(sentryEvent);
            setThreads(sentryEvent, obj);
        }
        return sentryEvent;
    }

    public SentryTransaction process(SentryTransaction sentryTransaction, Object obj) {
        setCommons(sentryTransaction);
        if (shouldApplyScopeData(sentryTransaction, obj)) {
            processNonCachedEvent(sentryTransaction);
        }
        return sentryTransaction;
    }
}
