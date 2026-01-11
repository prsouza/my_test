package com.google.android.gms.measurement.internal;

final class zzky implements Runnable {
    public final /* synthetic */ zzlj zza;
    public final /* synthetic */ zzli zzb;

    public zzky(zzli zzli, zzlj zzlj) {
        this.zzb = zzli;
        this.zza = zzlj;
    }

    public final void run() {
        zzli.zzy(this.zzb, this.zza);
        this.zzb.zzR();
    }
}
