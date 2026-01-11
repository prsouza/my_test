package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import java.util.List;

public final class zzgx extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgx zza;
    private int zze;
    private int zzf;
    private zzkj zzg = zzkc.zzbG();
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private boolean zzj;
    private double zzk;

    static {
        zzgx zzgx = new zzgx();
        zza = zzgx;
        zzkc.zzbM(zzgx.class, zzgx);
    }

    private zzgx() {
    }

    public final double zza() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzj;
    }

    public final boolean zzg() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 4) != 0;
    }

    public final int zzj() {
        int zza2 = zzgw.zza(this.zzf);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zzgv.zza, "zzg", zzgx.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i10 == 3) {
            return new zzgx();
        } else {
            if (i10 == 4) {
                return new zzgt((zzgm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
