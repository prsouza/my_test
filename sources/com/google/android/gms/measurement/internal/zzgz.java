package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpm;

final class zzgz implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzha zze;

    public zzgz(zzha zzha, String str, String str2, String str3, long j10) {
        this.zze = zzha;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
    }

    public final void run() {
        zzpm.zzc();
        if (this.zze.zza.zzg().zzs((String) null, zzel.zzat)) {
            String str = this.zza;
            if (str == null) {
                this.zze.zza.zzQ(this.zzb, (zziu) null);
                return;
            }
            this.zze.zza.zzQ(this.zzb, new zziu(this.zzc, str, this.zzd));
            return;
        }
        String str2 = this.zza;
        if (str2 == null) {
            this.zze.zza.zzq().zzs().zzy(this.zzb, (zziu) null);
            return;
        }
        this.zze.zza.zzq().zzs().zzy(this.zzb, new zziu(this.zzc, str2, this.zzd));
    }
}
