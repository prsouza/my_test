package com.google.android.gms.measurement.internal;

final class zzan implements Runnable {
    public final /* synthetic */ zzhd zza;
    public final /* synthetic */ zzao zzb;

    public zzan(zzao zzao, zzhd zzhd) {
        this.zzb = zzao;
        this.zza = zzhd;
    }

    public final void run() {
        this.zza.zzax();
        if (zzaa.zza()) {
            this.zza.zzaA().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
