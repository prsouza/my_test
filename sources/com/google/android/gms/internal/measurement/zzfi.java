package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;

public final class zzfi extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfi zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        zzfi zzfi = new zzfi();
        zza = zzfi;
        zzkc.zzbM(zzfi.class, zzfi);
    }

    private zzfi() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i10 == 3) {
            return new zzfi();
        } else {
            if (i10 == 4) {
                return new zzfh((zzey) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
