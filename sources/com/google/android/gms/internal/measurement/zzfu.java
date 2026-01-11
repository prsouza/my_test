package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import java.util.Objects;

public final class zzfu extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzfu zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;

    static {
        zzfu zzfu = new zzfu();
        zza = zzfu;
        zzkc.zzbM(zzfu.class, zzfu);
    }

    private zzfu() {
    }

    public static zzft zza() {
        return (zzft) zza.zzbA();
    }

    public static /* synthetic */ void zzc(zzfu zzfu, String str) {
        Objects.requireNonNull(str);
        zzfu.zze |= 1;
        zzfu.zzf = str;
    }

    public static /* synthetic */ void zzd(zzfu zzfu, long j10) {
        zzfu.zze |= 2;
        zzfu.zzg = j10;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i10 == 3) {
            return new zzfu();
        } else {
            if (i10 == 4) {
                return new zzft((zzfj) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}
