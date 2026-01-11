package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Gpu implements IUnknownPropertiesConsumer {
    public static final String TYPE = "gpu";
    private String apiType;

    /* renamed from: id  reason: collision with root package name */
    private Integer f6921id;
    private Integer memorySize;
    private Boolean multiThreadedRendering;
    private String name;
    private String npotSupport;
    private Map<String, Object> unknown;
    private Integer vendorId;
    private String vendorName;
    private String version;

    public Gpu() {
    }

    public Gpu(Gpu gpu) {
        this.name = gpu.name;
        this.f6921id = gpu.f6921id;
        this.vendorId = gpu.vendorId;
        this.vendorName = gpu.vendorName;
        this.memorySize = gpu.memorySize;
        this.apiType = gpu.apiType;
        this.multiThreadedRendering = gpu.multiThreadedRendering;
        this.version = gpu.version;
        this.npotSupport = gpu.npotSupport;
        this.unknown = CollectionUtils.newConcurrentHashMap(gpu.unknown);
    }

    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String getApiType() {
        return this.apiType;
    }

    public Integer getId() {
        return this.f6921id;
    }

    public Integer getMemorySize() {
        return this.memorySize;
    }

    public String getName() {
        return this.name;
    }

    public String getNpotSupport() {
        return this.npotSupport;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Integer getVendorId() {
        return this.vendorId;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public String getVersion() {
        return this.version;
    }

    public Boolean isMultiThreadedRendering() {
        return this.multiThreadedRendering;
    }

    public void setApiType(String str) {
        this.apiType = str;
    }

    public void setId(Integer num) {
        this.f6921id = num;
    }

    public void setMemorySize(Integer num) {
        this.memorySize = num;
    }

    public void setMultiThreadedRendering(Boolean bool) {
        this.multiThreadedRendering = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNpotSupport(String str) {
        this.npotSupport = str;
    }

    public void setVendorId(Integer num) {
        this.vendorId = num;
    }

    public void setVendorName(String str) {
        this.vendorName = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
