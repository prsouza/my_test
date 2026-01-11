package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzia implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzin zze;

    public zzia(zzin zzin, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.zze = zzin;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z;
    }

    public final void run() {
        this.zze.zzs.zzt().zzz(this.zza, (String) null, this.zzb, this.zzc, this.zzd);
    }
}
