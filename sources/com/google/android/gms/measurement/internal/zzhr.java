package com.google.android.gms.measurement.internal;

final class zzhr implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzin zzb;

    public zzhr(zzin zzin, long j10) {
        this.zzb = zzin;
        this.zza = j10;
    }

    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzaz().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
