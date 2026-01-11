package com.google.android.gms.measurement.internal;

import a.a;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzjp implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzkb zzb;

    public zzjp(zzkb zzkb, zzp zzp) {
        this.zzb = zzkb;
        this.zza = zzp;
    }

    public final void run() {
        zzkb zzkb = this.zzb;
        zzeo zzh = zzkb.zzb;
        if (zzh == null) {
            a.e(zzkb.zzs, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzs.zzaz().zzd().zzb("Failed to send consent settings to the service", e10);
        }
    }
}
