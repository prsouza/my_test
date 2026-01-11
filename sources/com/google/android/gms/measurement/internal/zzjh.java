package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;

final class zzjh implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzcf zzb;
    public final /* synthetic */ zzkb zzc;

    public zzjh(zzkb zzkb, zzp zzp, zzcf zzcf) {
        this.zzc = zzkb;
        this.zza = zzp;
        this.zzb = zzcf;
    }

    public final void run() {
        zzgi zzgi;
        String str = null;
        try {
            if (!this.zzc.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                this.zzc.zzs.zzaz().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzs.zzq().zzP((String) null);
                this.zzc.zzs.zzm().zze.zzb((String) null);
                zzgi = this.zzc.zzs;
            } else {
                zzkb zzkb = this.zzc;
                zzeo zzh = zzkb.zzb;
                if (zzh == null) {
                    zzkb.zzs.zzaz().zzd().zza("Failed to get app instance id");
                    zzgi = this.zzc.zzs;
                } else {
                    Preconditions.checkNotNull(this.zza);
                    str = zzh.zzd(this.zza);
                    if (str != null) {
                        this.zzc.zzs.zzq().zzP(str);
                        this.zzc.zzs.zzm().zze.zzb(str);
                    }
                    this.zzc.zzQ();
                    zzgi = this.zzc.zzs;
                }
            }
        } catch (RemoteException e10) {
            this.zzc.zzs.zzaz().zzd().zzb("Failed to get app instance id", e10);
            zzgi = this.zzc.zzs;
        } catch (Throwable th2) {
            this.zzc.zzs.zzv().zzV(this.zzb, (String) null);
            throw th2;
        }
        zzgi.zzv().zzV(this.zzb, str);
    }
}
