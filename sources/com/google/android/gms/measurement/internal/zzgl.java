package com.google.android.gms.measurement.internal;

final class zzgl implements Runnable {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ zzha zzb;

    public zzgl(zzha zzha, zzab zzab) {
        this.zzb = zzha;
        this.zza = zzab;
    }

    public final void run() {
        this.zzb.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzM(this.zza);
        } else {
            this.zzb.zza.zzS(this.zza);
        }
    }
}
