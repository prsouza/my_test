package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;

public final class zzfa extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfa zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private zzkj zzg = zzkc.zzbG();
    private boolean zzh;

    static {
        zzfa zzfa = new zzfa();
        zza = zzfa;
        zzkc.zzbM(zzfa.class, zzfa);
    }

    private zzfa() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzfg.class, "zzh"});
        } else if (i10 == 3) {
            return new zzfa();
        } else {
            if (i10 == 4) {
                return new zzez((zzey) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
