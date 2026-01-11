package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;

public enum zznc {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(zzjb.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zznc(Object obj) {
        this.zzk = obj;
    }
}
