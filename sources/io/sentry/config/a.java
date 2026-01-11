package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final /* synthetic */ class a {
    public static Boolean a(PropertiesProvider propertiesProvider, String str) {
        String property = propertiesProvider.getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    public static Double b(PropertiesProvider propertiesProvider, String str) {
        String property = propertiesProvider.getProperty(str);
        if (property != null) {
            return Double.valueOf(property);
        }
        return null;
    }

    public static List c(PropertiesProvider propertiesProvider, String str) {
        String property = propertiesProvider.getProperty(str);
        return property != null ? Arrays.asList(property.split(",")) : Collections.emptyList();
    }

    public static String d(PropertiesProvider propertiesProvider, String str, String str2) {
        String property = propertiesProvider.getProperty(str);
        return property != null ? property : str2;
    }
}
