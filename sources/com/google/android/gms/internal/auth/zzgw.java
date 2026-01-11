package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

final class zzgw extends zzgy {
    public zzgw(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(zzj(obj, j10));
    }

    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(zzi(obj, j10));
    }

    public final void zzc(Object obj, long j10, boolean z) {
        if (zzgz.zza) {
            zzgz.zzi(obj, j10, z);
        } else {
            zzgz.zzj(obj, j10, z);
        }
    }

    public final void zzd(Object obj, long j10, double d10) {
        zzn(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void zze(Object obj, long j10, float f10) {
        zzm(obj, j10, Float.floatToIntBits(f10));
    }

    public final boolean zzf(Object obj, long j10) {
        if (zzgz.zza) {
            return zzgz.zzq(obj, j10);
        }
        return zzgz.zzr(obj, j10);
    }
}
