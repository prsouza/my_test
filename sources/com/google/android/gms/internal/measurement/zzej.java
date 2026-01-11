package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import java.util.List;
import java.util.Objects;

public final class zzej extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzej zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private zzkj zzh = zzkc.zzbG();
    private boolean zzi;
    private zzeq zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        zzej zzej = new zzej();
        zza = zzej;
        zzkc.zzbM(zzej.class, zzej);
    }

    private zzej() {
    }

    public static zzei zzc() {
        return (zzei) zza.zzbA();
    }

    public static /* synthetic */ void zzi(zzej zzej, String str) {
        zzej.zze |= 2;
        zzej.zzg = str;
    }

    public static /* synthetic */ void zzj(zzej zzej, int i, zzel zzel) {
        Objects.requireNonNull(zzel);
        zzkj zzkj = zzej.zzh;
        if (!zzkj.zzc()) {
            zzej.zzh = zzkc.zzbH(zzkj);
        }
        zzej.zzh.set(i, zzel);
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzel zze(int i) {
        return (zzel) this.zzh.get(i);
    }

    public final zzeq zzf() {
        zzeq zzeq = this.zzj;
        return zzeq == null ? zzeq.zzb() : zzeq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzh;
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzel.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i10 == 3) {
            return new zzej();
        } else {
            if (i10 == 4) {
                return new zzei((zzef) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzm() {
        return this.zzl;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zze & 64) != 0;
    }
}
