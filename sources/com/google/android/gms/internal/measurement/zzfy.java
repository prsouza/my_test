package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;

public final class zzfy extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfy zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private zzfm zzh;

    static {
        zzfy zzfy = new zzfy();
        zza = zzfy;
        zzkc.zzbM(zzfy.class, zzfy);
    }

    private zzfy() {
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i10 == 3) {
            return new zzfy();
        } else {
            if (i10 == 4) {
                return new zzfx((zzfj) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
