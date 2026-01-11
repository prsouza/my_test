package io.sentry.config;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class CompositePropertiesProvider implements PropertiesProvider {
    private final List<PropertiesProvider> providers;

    public CompositePropertiesProvider(List<PropertiesProvider> list) {
        this.providers = list;
    }

    public final /* synthetic */ Boolean getBooleanProperty(String str) {
        return a.a(this, str);
    }

    public final /* synthetic */ Double getDoubleProperty(String str) {
        return a.b(this, str);
    }

    public final /* synthetic */ List getList(String str) {
        return a.c(this, str);
    }

    public Map<String, String> getMap(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (PropertiesProvider map : this.providers) {
            concurrentHashMap.putAll(map.getMap(str));
        }
        return concurrentHashMap;
    }

    public String getProperty(String str) {
        for (PropertiesProvider property : this.providers) {
            String property2 = property.getProperty(str);
            if (property2 != null) {
                return property2;
            }
        }
        return null;
    }

    public final /* synthetic */ String getProperty(String str, String str2) {
        return a.d(this, str, str2);
    }
}
