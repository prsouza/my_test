package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpp;

final class zzii implements Runnable {
    public final /* synthetic */ zzah zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzah zze;
    public final /* synthetic */ zzin zzf;

    public zzii(zzin zzin, zzah zzah, int i, long j10, boolean z, zzah zzah2) {
        this.zzf = zzin;
        this.zza = zzah;
        this.zzb = i;
        this.zzc = j10;
        this.zzd = z;
        this.zze = zzah2;
    }

    public final void run() {
        this.zzf.zzX(this.zza);
        zzin.zzw(this.zzf, this.zza, this.zzb, this.zzc, false, this.zzd);
        zzpp.zzc();
        if (this.zzf.zzs.zzf().zzs((String) null, zzel.zzaI)) {
            zzin.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
