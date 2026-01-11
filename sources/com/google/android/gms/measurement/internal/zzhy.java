package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhy implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzin zzd;

    public zzhy(zzin zzin, AtomicReference atomicReference, String str, String str2, String str3) {
        this.zzd = zzin;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final void run() {
        this.zzd.zzs.zzt().zzw(this.zza, (String) null, this.zzb, this.zzc);
    }
}
