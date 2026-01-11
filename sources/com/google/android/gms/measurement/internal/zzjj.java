package com.google.android.gms.measurement.internal;

import a.a;
import android.os.RemoteException;

final class zzjj implements Runnable {
    public final /* synthetic */ zziu zza;
    public final /* synthetic */ zzkb zzb;

    public zzjj(zzkb zzkb, zziu zziu) {
        this.zzb = zzkb;
        this.zza = zziu;
    }

    public final void run() {
        zzkb zzkb = this.zzb;
        zzeo zzh = zzkb.zzb;
        if (zzh == null) {
            a.e(zzkb.zzs, "Failed to send current screen to service");
            return;
        }
        try {
            zziu zziu = this.zza;
            if (zziu == null) {
                zzh.zzq(0, (String) null, (String) null, zzkb.zzs.zzav().getPackageName());
            } else {
                zzh.zzq(zziu.zzc, zziu.zza, zziu.zzb, zzkb.zzs.zzav().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzs.zzaz().zzd().zzb("Failed to send current screen to the service", e10);
        }
    }
}
