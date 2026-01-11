package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzhs implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ Bundle zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ boolean zzf;
    public final /* synthetic */ boolean zzg;
    public final /* synthetic */ String zzh;
    public final /* synthetic */ zzin zzi;

    public zzhs(zzin zzin, String str, String str2, long j10, Bundle bundle, boolean z, boolean z10, boolean z11, String str3) {
        this.zzi = zzin;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = bundle;
        this.zze = z;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = str3;
    }

    public final void run() {
        this.zzi.zzJ(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
