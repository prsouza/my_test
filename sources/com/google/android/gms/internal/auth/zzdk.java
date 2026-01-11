package com.google.android.gms.internal.auth;

import java.io.Serializable;

public final class zzdk {
    public static <T> zzdg<T> zza(zzdg<T> zzdg) {
        if ((zzdg instanceof zzdi) || (zzdg instanceof zzdh)) {
            return zzdg;
        }
        if (zzdg instanceof Serializable) {
            return new zzdh(zzdg);
        }
        return new zzdi(zzdg);
    }

    public static <T> zzdg<T> zzb(T t10) {
        return new zzdj(t10);
    }
}
