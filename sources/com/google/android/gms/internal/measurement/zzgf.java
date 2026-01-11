package com.google.android.gms.internal.measurement;

import java.util.Objects;

public final class zzgf extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgf zza;
    private int zze;
    private int zzf = 1;
    private zzkj zzg = zzkc.zzbG();

    static {
        zzgf zzgf = new zzgf();
        zza = zzgf;
        zzkc.zzbM(zzgf.class, zzgf);
    }

    private zzgf() {
    }

    public static zzgd zza() {
        return (zzgd) zza.zzbA();
    }

    public static /* synthetic */ void zzc(zzgf zzgf, zzfu zzfu) {
        Objects.requireNonNull(zzfu);
        zzkj zzkj = zzgf.zzg;
        if (!zzkj.zzc()) {
            zzgf.zzg = zzkc.zzbH(zzkj);
        }
        zzgf.zzg.add(zzfu);
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzge.zza, "zzg", zzfu.class});
        } else if (i10 == 3) {
            return new zzgf();
        } else {
            if (i10 == 4) {
                return new zzgd((zzfj) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
