package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;

public final class zzfm extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfm zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;
    private String zzl = BuildConfig.FLAVOR;

    static {
        zzfm zzfm = new zzfm();
        zza = zzfm;
        zzkc.zzbM(zzfm.class, zzfm);
    }

    private zzfm() {
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i10 == 3) {
            return new zzfm();
        } else {
            if (i10 == 4) {
                return new zzfl((zzfj) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
