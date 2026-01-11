package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class User implements IUnknownPropertiesConsumer {
    private String email;

    /* renamed from: id  reason: collision with root package name */
    private String f6923id;
    private String ipAddress;
    private Map<String, String> other;
    private Map<String, Object> unknown;
    private String username;

    public User() {
    }

    public User(User user) {
        this.email = user.email;
        this.username = user.username;
        this.f6923id = user.f6923id;
        this.ipAddress = user.ipAddress;
        this.other = CollectionUtils.newConcurrentHashMap(user.other);
        this.unknown = CollectionUtils.newConcurrentHashMap(user.unknown);
    }

    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.f6923id;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public Map<String, String> getOthers() {
        return this.other;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setId(String str) {
        this.f6923id = str;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public void setOthers(Map<String, String> map) {
        this.other = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setUsername(String str) {
        this.username = str;
    }
}
