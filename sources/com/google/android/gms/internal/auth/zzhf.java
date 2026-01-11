package com.google.android.gms.internal.auth;

import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;

public enum zzhf {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(zzeb.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zzhf(Object obj) {
        this.zzk = obj;
    }
}
