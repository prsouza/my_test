package com.google.android.gms.measurement.internal;

import a.a;
import com.google.android.gms.common.internal.Preconditions;

final class zzjq implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzav zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzkb zze;

    public zzjq(zzkb zzkb, boolean z, zzp zzp, boolean z10, zzav zzav, String str) {
        this.zze = zzkb;
        this.zza = zzp;
        this.zzb = z10;
        this.zzc = zzav;
        this.zzd = str;
    }

    public final void run() {
        zzav zzav;
        zzkb zzkb = this.zze;
        zzeo zzh = zzkb.zzb;
        if (zzh == null) {
            a.e(zzkb.zzs, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzkb zzkb2 = this.zze;
        if (this.zzb) {
            zzav = null;
        } else {
            zzav = this.zzc;
        }
        zzkb2.zzD(zzh, zzav, this.zza);
        this.zze.zzQ();
    }
}
