package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zziw implements Runnable {
    public final /* synthetic */ zziu zza;
    public final /* synthetic */ zziu zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzjb zze;

    public zziw(zzjb zzjb, zziu zziu, zziu zziu2, long j10, boolean z) {
        this.zze = zzjb;
        this.zza = zziu;
        this.zzb = zziu2;
        this.zzc = j10;
        this.zzd = z;
    }

    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
