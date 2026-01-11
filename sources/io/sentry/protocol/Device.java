package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public final class Device implements IUnknownPropertiesConsumer {
    public static final String TYPE = "device";
    private String[] archs;
    private Float batteryLevel;
    private Float batteryTemperature;
    private Date bootTime;
    private String brand;
    private Boolean charging;
    private String connectionType;
    private Long externalFreeStorage;
    private Long externalStorageSize;
    private String family;
    private Long freeMemory;
    private Long freeStorage;

    /* renamed from: id  reason: collision with root package name */
    private String f6920id;
    @Deprecated
    private String language;
    private String locale;
    private Boolean lowMemory;
    private String manufacturer;
    private Long memorySize;
    private String model;
    private String modelId;
    private String name;
    private Boolean online;
    private DeviceOrientation orientation;
    private Float screenDensity;
    private Integer screenDpi;
    private Integer screenHeightPixels;
    private Integer screenWidthPixels;
    private Boolean simulator;
    private Long storageSize;
    private TimeZone timezone;
    private Map<String, Object> unknown;
    private Long usableMemory;

    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE
    }

    public Device() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.TimeZone} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Device(io.sentry.protocol.Device r3) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.name
            r2.name = r0
            java.lang.String r0 = r3.manufacturer
            r2.manufacturer = r0
            java.lang.String r0 = r3.brand
            r2.brand = r0
            java.lang.String r0 = r3.family
            r2.family = r0
            java.lang.String r0 = r3.model
            r2.model = r0
            java.lang.String r0 = r3.modelId
            r2.modelId = r0
            java.lang.Boolean r0 = r3.charging
            r2.charging = r0
            java.lang.Boolean r0 = r3.online
            r2.online = r0
            io.sentry.protocol.Device$DeviceOrientation r0 = r3.orientation
            r2.orientation = r0
            java.lang.Boolean r0 = r3.simulator
            r2.simulator = r0
            java.lang.Long r0 = r3.memorySize
            r2.memorySize = r0
            java.lang.Long r0 = r3.freeMemory
            r2.freeMemory = r0
            java.lang.Long r0 = r3.usableMemory
            r2.usableMemory = r0
            java.lang.Boolean r0 = r3.lowMemory
            r2.lowMemory = r0
            java.lang.Long r0 = r3.storageSize
            r2.storageSize = r0
            java.lang.Long r0 = r3.freeStorage
            r2.freeStorage = r0
            java.lang.Long r0 = r3.externalStorageSize
            r2.externalStorageSize = r0
            java.lang.Long r0 = r3.externalFreeStorage
            r2.externalFreeStorage = r0
            java.lang.Integer r0 = r3.screenWidthPixels
            r2.screenWidthPixels = r0
            java.lang.Integer r0 = r3.screenHeightPixels
            r2.screenHeightPixels = r0
            java.lang.Float r0 = r3.screenDensity
            r2.screenDensity = r0
            java.lang.Integer r0 = r3.screenDpi
            r2.screenDpi = r0
            java.util.Date r0 = r3.bootTime
            r2.bootTime = r0
            java.lang.String r0 = r3.f6920id
            r2.f6920id = r0
            java.lang.String r0 = r3.language
            r2.language = r0
            java.lang.String r0 = r3.connectionType
            r2.connectionType = r0
            java.lang.Float r0 = r3.batteryTemperature
            r2.batteryTemperature = r0
            java.lang.Float r0 = r3.batteryLevel
            r2.batteryLevel = r0
            java.lang.String[] r0 = r3.archs
            r1 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            goto L_0x0080
        L_0x007f:
            r0 = r1
        L_0x0080:
            r2.archs = r0
            java.lang.String r0 = r3.locale
            r2.locale = r0
            java.util.TimeZone r0 = r3.timezone
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r0.clone()
            r1 = r0
            java.util.TimeZone r1 = (java.util.TimeZone) r1
        L_0x0091:
            r2.timezone = r1
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.unknown
            java.util.Map r3 = io.sentry.util.CollectionUtils.newConcurrentHashMap(r3)
            r2.unknown = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.protocol.Device.<init>(io.sentry.protocol.Device):void");
    }

    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String[] getArchs() {
        return this.archs;
    }

    public Float getBatteryLevel() {
        return this.batteryLevel;
    }

    public Float getBatteryTemperature() {
        return this.batteryTemperature;
    }

    public Date getBootTime() {
        Date date = this.bootTime;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public Long getExternalFreeStorage() {
        return this.externalFreeStorage;
    }

    public Long getExternalStorageSize() {
        return this.externalStorageSize;
    }

    public String getFamily() {
        return this.family;
    }

    public Long getFreeMemory() {
        return this.freeMemory;
    }

    public Long getFreeStorage() {
        return this.freeStorage;
    }

    public String getId() {
        return this.f6920id;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Long getMemorySize() {
        return this.memorySize;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelId() {
        return this.modelId;
    }

    public String getName() {
        return this.name;
    }

    public DeviceOrientation getOrientation() {
        return this.orientation;
    }

    public Float getScreenDensity() {
        return this.screenDensity;
    }

    public Integer getScreenDpi() {
        return this.screenDpi;
    }

    public Integer getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    public Integer getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    public Long getStorageSize() {
        return this.storageSize;
    }

    public TimeZone getTimezone() {
        return this.timezone;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Long getUsableMemory() {
        return this.usableMemory;
    }

    public Boolean isCharging() {
        return this.charging;
    }

    public Boolean isLowMemory() {
        return this.lowMemory;
    }

    public Boolean isOnline() {
        return this.online;
    }

    public Boolean isSimulator() {
        return this.simulator;
    }

    public void setArchs(String[] strArr) {
        this.archs = strArr;
    }

    public void setBatteryLevel(Float f10) {
        this.batteryLevel = f10;
    }

    public void setBatteryTemperature(Float f10) {
        this.batteryTemperature = f10;
    }

    public void setBootTime(Date date) {
        this.bootTime = date;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCharging(Boolean bool) {
        this.charging = bool;
    }

    public void setConnectionType(String str) {
        this.connectionType = str;
    }

    public void setExternalFreeStorage(Long l10) {
        this.externalFreeStorage = l10;
    }

    public void setExternalStorageSize(Long l10) {
        this.externalStorageSize = l10;
    }

    public void setFamily(String str) {
        this.family = str;
    }

    public void setFreeMemory(Long l10) {
        this.freeMemory = l10;
    }

    public void setFreeStorage(Long l10) {
        this.freeStorage = l10;
    }

    public void setId(String str) {
        this.f6920id = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setLowMemory(Boolean bool) {
        this.lowMemory = bool;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMemorySize(Long l10) {
        this.memorySize = l10;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setModelId(String str) {
        this.modelId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOnline(Boolean bool) {
        this.online = bool;
    }

    public void setOrientation(DeviceOrientation deviceOrientation) {
        this.orientation = deviceOrientation;
    }

    public void setScreenDensity(Float f10) {
        this.screenDensity = f10;
    }

    public void setScreenDpi(Integer num) {
        this.screenDpi = num;
    }

    public void setScreenHeightPixels(Integer num) {
        this.screenHeightPixels = num;
    }

    public void setScreenWidthPixels(Integer num) {
        this.screenWidthPixels = num;
    }

    public void setSimulator(Boolean bool) {
        this.simulator = bool;
    }

    public void setStorageSize(Long l10) {
        this.storageSize = l10;
    }

    public void setTimezone(TimeZone timeZone) {
        this.timezone = timeZone;
    }

    public void setUsableMemory(Long l10) {
        this.usableMemory = l10;
    }
}
