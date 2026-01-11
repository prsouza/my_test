package com.google.android.gms.measurement.internal;

final class zzjv implements Runnable {
    public final /* synthetic */ zzeo zza;
    public final /* synthetic */ zzka zzb;

    public zzjv(zzka zzka, zzeo zzeo) {
        this.zzb = zzka;
        this.zza = zzeo;
    }

    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzaz().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
