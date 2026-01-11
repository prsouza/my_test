package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

public final class zzga extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzga zza;
    private zzkj zze = zzkc.zzbG();

    static {
        zzga zzga = new zzga();
        zza = zzga;
        zzkc.zzbM(zzga.class, zzga);
    }

    private zzga() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbA();
    }

    public static /* synthetic */ void zze(zzga zzga, zzgc zzgc) {
        Objects.requireNonNull(zzgc);
        zzkj zzkj = zzga.zze;
        if (!zzkj.zzc()) {
            zzga.zze = zzkc.zzbH(zzkj);
        }
        zzga.zze.add(zzgc);
    }

    public final zzgc zzc(int i) {
        return (zzgc) this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgc.class});
        } else if (i10 == 3) {
            return new zzga();
        } else {
            if (i10 == 4) {
                return new zzfz((zzfj) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
