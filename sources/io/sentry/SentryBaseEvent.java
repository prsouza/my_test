package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SentryBaseEvent {
    public static final String DEFAULT_PLATFORM = "java";
    private List<Breadcrumb> breadcrumbs;
    private final Contexts contexts;
    private String dist;
    private String environment;
    private SentryId eventId;
    private Map<String, Object> extra;
    private String platform;
    private String release;
    private Request request;
    private SdkVersion sdk;
    private String serverName;
    private Map<String, String> tags;
    public transient Throwable throwable;
    private User user;

    public SentryBaseEvent() {
        this(new SentryId());
    }

    public SentryBaseEvent(SentryId sentryId) {
        this.contexts = new Contexts();
        this.eventId = sentryId;
    }

    public void addBreadcrumb(Breadcrumb breadcrumb) {
        if (this.breadcrumbs == null) {
            this.breadcrumbs = new ArrayList();
        }
        this.breadcrumbs.add(breadcrumb);
    }

    public void addBreadcrumb(String str) {
        addBreadcrumb(new Breadcrumb(str));
    }

    public List<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public Contexts getContexts() {
        return this.contexts;
    }

    public String getDist() {
        return this.dist;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public Object getExtra(String str) {
        Map<String, Object> map = this.extra;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public Map<String, Object> getExtras() {
        return this.extra;
    }

    @Deprecated
    public Throwable getOriginThrowable() {
        return getThrowable();
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getRelease() {
        return this.release;
    }

    public Request getRequest() {
        return this.request;
    }

    public SdkVersion getSdk() {
        return this.sdk;
    }

    public String getServerName() {
        return this.serverName;
    }

    public String getTag(String str) {
        Map<String, String> map = this.tags;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Throwable getThrowable() {
        Throwable th2 = this.throwable;
        return th2 instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th2).getThrowable() : th2;
    }

    public Throwable getThrowableMechanism() {
        return this.throwable;
    }

    public User getUser() {
        return this.user;
    }

    public void removeExtra(String str) {
        Map<String, Object> map = this.extra;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeTag(String str) {
        Map<String, String> map = this.tags;
        if (map != null) {
            map.remove(str);
        }
    }

    public void setBreadcrumbs(List<Breadcrumb> list) {
        this.breadcrumbs = CollectionUtils.newArrayList(list);
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setEventId(SentryId sentryId) {
        this.eventId = sentryId;
    }

    public void setExtra(String str, Object obj) {
        if (this.extra == null) {
            this.extra = new HashMap();
        }
        this.extra.put(str, obj);
    }

    public void setExtras(Map<String, Object> map) {
        this.extra = CollectionUtils.newHashMap(map);
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setRequest(Request request2) {
        this.request = request2;
    }

    public void setSdk(SdkVersion sdkVersion) {
        this.sdk = sdkVersion;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setTag(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        this.tags.put(str, str2);
    }

    public void setTags(Map<String, String> map) {
        this.tags = CollectionUtils.newHashMap(map);
    }

    public void setThrowable(Throwable th2) {
        this.throwable = th2;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
