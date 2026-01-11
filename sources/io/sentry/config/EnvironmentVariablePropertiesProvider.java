package io.sentry.config;

import a.b;
import android.support.v4.media.a;
import io.sentry.util.StringUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class EnvironmentVariablePropertiesProvider implements PropertiesProvider {
    private static final String PREFIX = "SENTRY";

    private String propertyToEnvironmentVariableName(String str) {
        StringBuilder q10 = b.q("SENTRY_");
        q10.append(str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT));
        return q10.toString();
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
        String removeSurrounding;
        String e10 = a.e(new StringBuilder(), propertyToEnvironmentVariableName(str), "_");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry next : System.getenv().entrySet()) {
            String str2 = (String) next.getKey();
            if (str2.startsWith(e10) && (removeSurrounding = StringUtils.removeSurrounding((String) next.getValue(), "\"")) != null) {
                concurrentHashMap.put(str2.substring(e10.length()).toLowerCase(Locale.ROOT), removeSurrounding);
            }
        }
        return concurrentHashMap;
    }

    public String getProperty(String str) {
        return StringUtils.removeSurrounding(System.getenv(propertyToEnvironmentVariableName(str)), "\"");
    }

    public final /* synthetic */ String getProperty(String str, String str2) {
        return a.d(this, str, str2);
    }
}
