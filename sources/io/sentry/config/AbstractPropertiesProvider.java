package io.sentry.config;

import androidx.appcompat.widget.d;
import com.github.mikephil.charting.BuildConfig;
import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

abstract class AbstractPropertiesProvider implements PropertiesProvider {
    private final String prefix;
    private final Properties properties;

    public AbstractPropertiesProvider(String str, Properties properties2) {
        this.prefix = (String) Objects.requireNonNull(str, "prefix is required");
        this.properties = (Properties) Objects.requireNonNull(properties2, "properties are required");
    }

    public AbstractPropertiesProvider(Properties properties2) {
        this(BuildConfig.FLAVOR, properties2);
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
        String b10 = d.b(new StringBuilder(), this.prefix, str, ".");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.properties.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str2 = (String) entry.getKey();
                if (str2.startsWith(b10)) {
                    hashMap.put(str2.substring(b10.length()), StringUtils.removeSurrounding((String) entry.getValue(), "\""));
                }
            }
        }
        return hashMap;
    }

    public String getProperty(String str) {
        Properties properties2 = this.properties;
        return StringUtils.removeSurrounding(properties2.getProperty(this.prefix + str), "\"");
    }

    public final /* synthetic */ String getProperty(String str, String str2) {
        return a.d(this, str, str2);
    }
}
