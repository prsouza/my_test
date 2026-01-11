package io.nodle.sdk.core;

import io.nodle.sdk.NodleContext;
import je.h;
import oi.a;
import xb.b;

public interface SdkFactory {
    a inMemorySdkCore(NodleContext nodleContext, String str, h<b> hVar, String... strArr);

    a persistentSdkCore(NodleContext nodleContext, String str, h<b> hVar, String... strArr);
}
