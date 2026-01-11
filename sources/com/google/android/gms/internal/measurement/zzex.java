package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import java.util.List;

public final class zzex extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzex zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private boolean zzh;
    private zzkj zzi = zzkc.zzbG();

    static {
        zzex zzex = new zzex();
        zza = zzex;
        zzkc.zzbM(zzex.class, zzex);
    }

    private zzex() {
    }

    public static zzex zzc() {
        return zza;
    }

    public final int zza() {
        return this.zzi.size();
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    public final int zzj() {
        int zza2 = zzew.zza(this.zzf);
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
            return zzkc.zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zzev.zza, "zzg", "zzh", "zzi"});
        } else if (i10 == 3) {
            return new zzex();
        } else {
            if (i10 == 4) {
                return new zzet((zzef) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
