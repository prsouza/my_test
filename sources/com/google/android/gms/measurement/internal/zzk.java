package com.google.android.gms.measurement.internal;

final class zzk implements Runnable {
    public final /* synthetic */ zzn zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, zzn zzn) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzn;
    }

    public final void run() {
        this.zzb.zza.zzq().zzV(this.zza);
    }
}
