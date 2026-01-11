package io.nodle.sdk;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import ge.g0;
import je.k;
import xb.b;

public final class NodleNotFound implements INodle {
    public void clear() {
    }

    public void config(NodleResourceId nodleResourceId) {
        e.D(nodleResourceId, "resourceId");
    }

    public <T> void config(String str, T t10) {
        e.D(str, "key");
    }

    public k<b> getEvents() {
        return g0.h(0, 7);
    }

    public long getMetric(SdkMetricType sdkMetricType) {
        e.D(sdkMetricType, "which");
        return 0;
    }

    public String getVersion() {
        return BuildConfig.FLAVOR;
    }

    public boolean isScanning() {
        return false;
    }

    public boolean isStarted() {
        return false;
    }

    public String showConfig() {
        return BuildConfig.FLAVOR;
    }

    public void start(String str, String... strArr) {
        e.D(str, "devKey");
        e.D(strArr, "tags");
    }

    public void stop() {
    }
}
