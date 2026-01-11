package com.google.android.gms.measurement.internal;

final class zzgt implements Runnable {
    public final /* synthetic */ zzav zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ zzha zzc;

    public zzgt(zzha zzha, zzav zzav, zzp zzp) {
        this.zzc = zzha;
        this.zza = zzav;
        this.zzb = zzp;
    }

    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
