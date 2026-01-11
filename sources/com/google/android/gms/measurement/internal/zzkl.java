package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzkl implements Runnable {
    public final /* synthetic */ zzkm zza;

    public /* synthetic */ zzkl(zzkm zzkm) {
        this.zza = zzkm;
    }

    public final void run() {
        zzkm zzkm = this.zza;
        zzkn zzkn = zzkm.zzc;
        long j10 = zzkm.zza;
        long j11 = zzkm.zzb;
        zzkn.zza.zzg();
        zzkn.zza.zzs.zzaz().zzc().zza("Application going to the background");
        zzkn.zza.zzs.zzm().zzl.zza(true);
        Bundle bundle = new Bundle();
        if (!zzkn.zza.zzs.zzf().zzu()) {
            zzkn.zza.zzb.zzb(j11);
            zzkn.zza.zzb.zzd(false, false, j11);
        }
        zzkn.zza.zzs.zzq().zzI("auto", "_ab", j10, bundle);
    }
}
