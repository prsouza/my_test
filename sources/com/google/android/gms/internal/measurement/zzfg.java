package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;

public final class zzfg extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfg zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        zzfg zzfg = new zzfg();
        zza = zzfg;
        zzkc.zzbM(zzfg.class, zzfg);
    }

    private zzfg() {
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i10 == 3) {
            return new zzfg();
        } else {
            if (i10 == 4) {
                return new zzff((zzey) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
