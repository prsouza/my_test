package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import java.util.Objects;

public final class zzfc extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfc zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzfc zzfc = new zzfc();
        zza = zzfc;
        zzkc.zzbM(zzfc.class, zzfc);
    }

    private zzfc() {
    }

    public static /* synthetic */ void zzd(zzfc zzfc, String str) {
        Objects.requireNonNull(str);
        zzfc.zze |= 1;
        zzfc.zzf = str;
    }

    public final int zza() {
        return this.zzi;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 8) != 0;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i10 == 3) {
            return new zzfc();
        } else {
            if (i10 == 4) {
                return new zzfb((zzey) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
