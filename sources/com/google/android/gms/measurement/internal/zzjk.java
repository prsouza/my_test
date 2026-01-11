package com.google.android.gms.measurement.internal;

import a.a;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzjk implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ zzkb zzc;

    public zzjk(zzkb zzkb, zzp zzp, Bundle bundle) {
        this.zzc = zzkb;
        this.zza = zzp;
        this.zzb = bundle;
    }

    public final void run() {
        zzkb zzkb = this.zzc;
        zzeo zzh = zzkb.zzb;
        if (zzh == null) {
            a.e(zzkb.zzs, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzr(this.zzb, this.zza);
        } catch (RemoteException e10) {
            this.zzc.zzs.zzaz().zzd().zzb("Failed to send default event parameters to service", e10);
        }
    }
}
