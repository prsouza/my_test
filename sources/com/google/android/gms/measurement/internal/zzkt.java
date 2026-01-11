package com.google.android.gms.measurement.internal;

import androidx.activity.result.d;

final class zzkt extends zzao {
    public final /* synthetic */ zzku zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzkt(zzku zzku, zzhd zzhd) {
        super(zzhd);
        this.zza = zzku;
    }

    public final void zzc() {
        this.zza.zza();
        d.g(this.zza.zzs, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzW();
    }
}
