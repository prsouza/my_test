package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zzje implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzkb zzd;

    public zzje(zzkb zzkb, AtomicReference atomicReference, zzp zzp, boolean z) {
        this.zzd = zzkb;
        this.zza = atomicReference;
        this.zzb = zzp;
        this.zzc = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                zzkb zzkb = this.zzd;
                zzeo zzh = zzkb.zzb;
                if (zzh == null) {
                    zzkb.zzs.zzaz().zzd().zza("Failed to get all user properties; not connected to service");
                    this.zza.notify();
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzh.zze(this.zzb, this.zzc));
                this.zzd.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    this.zzd.zzs.zzaz().zzd().zzb("Failed to get all user properties; remote exception", e10);
                    atomicReference = this.zza;
                } catch (Throwable th2) {
                    this.zza.notify();
                    throw th2;
                }
            }
        }
    }
}
