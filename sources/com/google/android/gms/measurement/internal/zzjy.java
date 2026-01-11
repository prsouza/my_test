package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

final class zzjy implements Runnable {
    public final /* synthetic */ zzka zza;

    public zzjy(zzka zzka) {
        this.zza = zzka;
    }

    public final void run() {
        zzkb zzkb = this.zza.zza;
        Context zzav = zzkb.zzs.zzav();
        this.zza.zza.zzs.zzax();
        zzkb.zzo(zzkb, new ComponentName(zzav, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
