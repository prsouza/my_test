package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgo extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgo zza;
    private zzkj zze = zzkc.zzbG();

    static {
        zzgo zzgo = new zzgo();
        zza = zzgo;
        zzkc.zzbM(zzgo.class, zzgo);
    }

    private zzgo() {
    }

    public static zzgo zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze.size();
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
            return zzkc.zzbL(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgq.class});
        } else if (i10 == 3) {
            return new zzgo();
        } else {
            if (i10 == 4) {
                return new zzgn((zzgm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
