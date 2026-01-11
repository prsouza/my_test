package com.google.android.gms.measurement.internal;

final class zzkj implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzkr zzb;

    public zzkj(zzkr zzkr, long j10) {
        this.zzb = zzkr;
        this.zza = j10;
    }

    public final void run() {
        zzkr.zzl(this.zzb, this.zza);
    }
}
