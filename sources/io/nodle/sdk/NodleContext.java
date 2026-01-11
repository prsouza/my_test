package io.nodle.sdk;

import m2.a;
import pd.f;

public interface NodleContext {
    Integer batteryLevel();

    f coroutineName(String str);

    String getApplicationName();

    String getGitSHA();

    String getHardware();

    String getOsLevel();

    String getOsRelease();

    String getOsVersion();

    String getPhoneModel();

    a getSdkConfig();
}
