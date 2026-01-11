package io.nodle.sdk;

import je.k;
import xb.b;

public interface INodle {
    void clear();

    void config(NodleResourceId nodleResourceId);

    <T> void config(String str, T t10);

    k<b> getEvents();

    long getMetric(SdkMetricType sdkMetricType);

    String getVersion();

    boolean isScanning();

    boolean isStarted();

    String showConfig();

    void start(String str, String... strArr);

    void stop();
}
