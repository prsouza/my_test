package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import java.util.List;

public final class zzgq extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgq zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private zzkj zzg = zzkc.zzbG();

    static {
        zzgq zzgq = new zzgq();
        zza = zzgq;
        zzkc.zzbM(zzgq.class, zzgq);
    }

    private zzgq() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgx.class});
        } else if (i10 == 3) {
            return new zzgq();
        } else {
            if (i10 == 4) {
                return new zzgp((zzgm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
