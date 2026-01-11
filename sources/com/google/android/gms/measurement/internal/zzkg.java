package com.google.android.gms.measurement.internal;

final class zzkg implements Runnable {
    public final /* synthetic */ zzli zza;
    public final /* synthetic */ Runnable zzb;

    public zzkg(zzki zzki, zzli zzli, Runnable runnable) {
        this.zza = zzli;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzW();
    }
}
