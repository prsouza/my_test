package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zzgp implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzha zzd;

    public zzgp(zzha zzha, String str, String str2, String str3) {
        this.zzd = zzha;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzd.zza.zzA();
        return this.zzd.zza.zzi().zzs(this.zza, this.zzb, this.zzc);
    }
}
