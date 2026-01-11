package io.sentry.config;

import java.util.List;
import java.util.Map;

public interface PropertiesProvider {
    Boolean getBooleanProperty(String str);

    Double getDoubleProperty(String str);

    List<String> getList(String str);

    Map<String, String> getMap(String str);

    String getProperty(String str);

    String getProperty(String str, String str2);
}
