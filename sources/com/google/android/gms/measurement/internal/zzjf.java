package com.google.android.gms.measurement.internal;

import a.a;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzjf implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzkb zzb;

    public zzjf(zzkb zzkb, zzp zzp) {
        this.zzb = zzkb;
        this.zza = zzp;
    }

    public final void run() {
        zzkb zzkb = this.zzb;
        zzeo zzh = zzkb.zzb;
        if (zzh == null) {
            a.e(zzkb.zzs, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzm(this.zza);
        } catch (RemoteException e10) {
            this.zzb.zzs.zzaz().zzd().zzb("Failed to reset data on the service: remote exception", e10);
        }
        this.zzb.zzQ();
    }
}
