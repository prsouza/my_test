package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzeg {
    public static final zzeg zza = new zzeg(true);
    private static volatile boolean zzb = false;
    private static volatile zzeg zzc;
    private final Map zzd;

    public zzeg() {
        this.zzd = new HashMap();
    }

    public static zzeg zza() {
        zzeg zzeg = zzc;
        if (zzeg == null) {
            synchronized (zzeg.class) {
                zzeg = zzc;
                if (zzeg == null) {
                    zzeg = zza;
                    zzc = zzeg;
                }
            }
        }
        return zzeg;
    }

    public zzeg(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
