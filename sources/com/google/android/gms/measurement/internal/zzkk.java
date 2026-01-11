package com.google.android.gms.measurement.internal;

final class zzkk implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzkr zzb;

    public zzkk(zzkr zzkr, long j10) {
        this.zzb = zzkr;
        this.zza = j10;
    }

    public final void run() {
        zzkr.zzj(this.zzb, this.zza);
    }
}
