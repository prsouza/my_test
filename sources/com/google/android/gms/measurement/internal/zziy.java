package com.google.android.gms.measurement.internal;

final class zziy implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzjb zzb;

    public zziy(zzjb zzjb, long j10) {
        this.zzb = zzjb;
        this.zza = j10;
    }

    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
