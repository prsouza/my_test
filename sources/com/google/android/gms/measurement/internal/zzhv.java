package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhv implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzin zzb;

    public zzhv(zzin zzin, long j10) {
        this.zzb = zzin;
        this.zza = j10;
    }

    public final void run() {
        this.zzb.zzM(this.zza, true);
        this.zzb.zzs.zzt().zzu(new AtomicReference());
    }
}
