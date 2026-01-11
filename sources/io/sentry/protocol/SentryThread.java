package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import java.util.Map;

public final class SentryThread implements IUnknownPropertiesConsumer {
    private Boolean crashed;
    private Boolean current;
    private Boolean daemon;

    /* renamed from: id  reason: collision with root package name */
    private Long f6922id;
    private String name;
    private Integer priority;
    private SentryStackTrace stacktrace;
    private String state;
    private Map<String, Object> unknown;

    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public Long getId() {
        return this.f6922id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public String getState() {
        return this.state;
    }

    public Boolean isCrashed() {
        return this.crashed;
    }

    public Boolean isCurrent() {
        return this.current;
    }

    public Boolean isDaemon() {
        return this.daemon;
    }

    public void setCrashed(Boolean bool) {
        this.crashed = bool;
    }

    public void setCurrent(Boolean bool) {
        this.current = bool;
    }

    public void setDaemon(Boolean bool) {
        this.daemon = bool;
    }

    public void setId(Long l10) {
        this.f6922id = l10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPriority(Integer num) {
        this.priority = num;
    }

    public void setStacktrace(SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public void setState(String str) {
        this.state = str;
    }
}
