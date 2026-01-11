package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class zzij {
    public static zzif zza(zzif zzif) {
        if ((zzif instanceof zzih) || (zzif instanceof zzig)) {
            return zzif;
        }
        if (zzif instanceof Serializable) {
            return new zzig(zzif);
        }
        return new zzih(zzif);
    }

    public static zzif zzb(Object obj) {
        return new zzii(obj);
    }
}
