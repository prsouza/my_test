package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgs extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgs zza;
    private int zze;
    private zzkj zzf = zzkc.zzbG();
    private zzgo zzg;

    static {
        zzgs zzgs = new zzgs();
        zza = zzgs;
        zzkc.zzbM(zzgs.class, zzgs);
    }

    private zzgs() {
    }

    public final zzgo zza() {
        zzgo zzgo = this.zzg;
        return zzgo == null ? zzgo.zzc() : zzgo;
    }

    public final List zzc() {
        return this.zzf;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgx.class, "zzg"});
        } else if (i10 == 3) {
            return new zzgs();
        } else {
            if (i10 == 4) {
                return new zzgr((zzgm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
