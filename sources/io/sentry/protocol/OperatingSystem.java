package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class OperatingSystem implements IUnknownPropertiesConsumer {
    public static final String TYPE = "os";
    private String build;
    private String kernelVersion;
    private String name;
    private String rawDescription;
    private Boolean rooted;
    private Map<String, Object> unknown;
    private String version;

    public OperatingSystem() {
    }

    public OperatingSystem(OperatingSystem operatingSystem) {
        this.name = operatingSystem.name;
        this.version = operatingSystem.version;
        this.rawDescription = operatingSystem.rawDescription;
        this.build = operatingSystem.build;
        this.kernelVersion = operatingSystem.kernelVersion;
        this.rooted = operatingSystem.rooted;
        this.unknown = CollectionUtils.newConcurrentHashMap(operatingSystem.unknown);
    }

    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String getBuild() {
        return this.build;
    }

    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public String getName() {
        return this.name;
    }

    public String getRawDescription() {
        return this.rawDescription;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getVersion() {
        return this.version;
    }

    public Boolean isRooted() {
        return this.rooted;
    }

    public void setBuild(String str) {
        this.build = str;
    }

    public void setKernelVersion(String str) {
        this.kernelVersion = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRawDescription(String str) {
        this.rawDescription = str;
    }

    public void setRooted(Boolean bool) {
        this.rooted = bool;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
