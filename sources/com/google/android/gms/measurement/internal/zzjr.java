package com.google.android.gms.measurement.internal;

import a.a;
import com.google.android.gms.common.internal.Preconditions;

final class zzjr implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzab zzc;
    public final /* synthetic */ zzab zzd;
    public final /* synthetic */ zzkb zze;

    public zzjr(zzkb zzkb, boolean z, zzp zzp, boolean z10, zzab zzab, zzab zzab2) {
        this.zze = zzkb;
        this.zza = zzp;
        this.zzb = z10;
        this.zzc = zzab;
        this.zzd = zzab2;
    }

    public final void run() {
        zzab zzab;
        zzkb zzkb = this.zze;
        zzeo zzh = zzkb.zzb;
        if (zzh == null) {
            a.e(zzkb.zzs, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzkb zzkb2 = this.zze;
        if (this.zzb) {
            zzab = null;
        } else {
            zzab = this.zzc;
        }
        zzkb2.zzD(zzh, zzab, this.zza);
        this.zze.zzQ();
    }
}
