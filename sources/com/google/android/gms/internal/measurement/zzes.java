package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;

public final class zzes extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzes zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private zzel zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzes zzes = new zzes();
        zza = zzes;
        zzkc.zzbM(zzes.class, zzes);
    }

    private zzes() {
    }

    public static zzer zzc() {
        return (zzer) zza.zzbA();
    }

    public static /* synthetic */ void zzf(zzes zzes, String str) {
        zzes.zze |= 2;
        zzes.zzg = str;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzel zzb() {
        zzel zzel = this.zzh;
        return zzel == null ? zzel.zzb() : zzel;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzk;
    }

    public final boolean zzj() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzk() {
        return (this.zze & 32) != 0;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i10 == 3) {
            return new zzes();
        } else {
            if (i10 == 4) {
                return new zzer((zzef) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
