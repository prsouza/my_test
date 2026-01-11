package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzgr implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzha zzb;

    public zzgr(zzha zzha, zzp zzp) {
        this.zzb = zzha;
        this.zza = zzp;
    }

    public final void run() {
        this.zzb.zza.zzA();
        zzli zzc = this.zzb.zza;
        zzp zzp = this.zza;
        zzc.zzaA().zzg();
        zzc.zzB();
        Preconditions.checkNotEmpty(zzp.zza);
        zzc.zzd(zzp);
    }
}
