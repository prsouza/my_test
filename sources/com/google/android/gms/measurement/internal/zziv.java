package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zziv implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zziu zzb;
    public final /* synthetic */ zziu zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzjb zze;

    public zziv(zzjb zzjb, Bundle bundle, zziu zziu, zziu zziu2, long j10) {
        this.zze = zzjb;
        this.zza = bundle;
        this.zzb = zziu;
        this.zzc = zziu2;
        this.zzd = j10;
    }

    public final void run() {
        zzjb.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
