package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

final class zzgc implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzgf zza;
    private final String zzb;

    public zzgc(zzgf zzgf, String str) {
        this.zza = zzgf;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.zza.zzs.zzaz().zzd().zzb(this.zzb, th2);
    }
}
