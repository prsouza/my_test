package com.google.android.gms.measurement.internal;

final class zzgh implements Runnable {
    public final /* synthetic */ zzhl zza;
    public final /* synthetic */ zzgi zzb;

    public zzgh(zzgi zzgi, zzhl zzhl) {
        this.zzb = zzgi;
        this.zza = zzhl;
    }

    public final void run() {
        zzgi.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
