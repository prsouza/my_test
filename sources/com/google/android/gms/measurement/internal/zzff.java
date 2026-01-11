package com.google.android.gms.measurement.internal;

final class zzff implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzfg zzb;

    public zzff(zzfg zzfg, boolean z) {
        this.zzb = zzfg;
        this.zza = z;
    }

    public final void run() {
        this.zzb.zzb.zzI(this.zza);
    }
}
