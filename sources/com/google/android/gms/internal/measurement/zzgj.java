package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgj extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgj zza;
    private int zze;
    private int zzf;
    private zzki zzg = zzkc.zzbE();

    static {
        zzgj zzgj = new zzgj();
        zza = zzgj;
        zzkc.zzbM(zzgj.class, zzgj);
    }

    private zzgj() {
    }

    public static zzgi zzd() {
        return (zzgi) zza.zzbA();
    }

    public static /* synthetic */ void zzg(zzgj zzgj, int i) {
        zzgj.zze |= 1;
        zzgj.zzf = i;
    }

    public static /* synthetic */ void zzh(zzgj zzgj, Iterable iterable) {
        zzki zzki = zzgj.zzg;
        if (!zzki.zzc()) {
            zzgj.zzg = zzkc.zzbF(zzki);
        }
        zzil.zzbw(iterable, zzgj.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i) {
        return this.zzg.zza(i);
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i10 == 3) {
            return new zzgj();
        } else {
            if (i10 == 4) {
                return new zzgi((zzfj) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
