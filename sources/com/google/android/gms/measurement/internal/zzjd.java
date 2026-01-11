package com.google.android.gms.measurement.internal;

import a.a;
import com.google.android.gms.common.internal.Preconditions;

final class zzjd implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzll zzc;
    public final /* synthetic */ zzkb zzd;

    public zzjd(zzkb zzkb, zzp zzp, boolean z, zzll zzll) {
        this.zzd = zzkb;
        this.zza = zzp;
        this.zzb = z;
        this.zzc = zzll;
    }

    public final void run() {
        zzll zzll;
        zzkb zzkb = this.zzd;
        zzeo zzh = zzkb.zzb;
        if (zzh == null) {
            a.e(zzkb.zzs, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzkb zzkb2 = this.zzd;
        if (this.zzb) {
            zzll = null;
        } else {
            zzll = this.zzc;
        }
        zzkb2.zzD(zzh, zzll, this.zza);
        this.zzd.zzQ();
    }
}
