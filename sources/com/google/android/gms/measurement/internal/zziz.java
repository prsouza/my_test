package com.google.android.gms.measurement.internal;

final class zziz implements Runnable {
    public final /* synthetic */ zziu zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzjb zzc;

    public zziz(zzjb zzjb, zziu zziu, long j10) {
        this.zzc = zzjb;
        this.zza = zziu;
        this.zzb = j10;
    }

    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzjb zzjb = this.zzc;
        zzjb.zza = null;
        zzjb.zzs.zzt().zzG((zziu) null);
    }
}
