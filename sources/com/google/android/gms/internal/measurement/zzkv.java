package com.google.android.gms.internal.measurement;

final class zzkv extends zzkx {
    private zzkv() {
        super((zzkw) null);
    }

    public /* synthetic */ zzkv(zzku zzku) {
        super((zzkw) null);
    }

    public final void zza(Object obj, long j10) {
        ((zzkj) zzmv.zzf(obj, j10)).zzb();
    }

    public final void zzb(Object obj, Object obj2, long j10) {
        zzkj zzkj = (zzkj) zzmv.zzf(obj, j10);
        zzkj zzkj2 = (zzkj) zzmv.zzf(obj2, j10);
        int size = zzkj.size();
        int size2 = zzkj2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkj.zzc()) {
                zzkj = zzkj.zzd(size2 + size);
            }
            zzkj.addAll(zzkj2);
        }
        if (size > 0) {
            zzkj2 = zzkj;
        }
        zzmv.zzs(obj, j10, zzkj2);
    }
}
