package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

final class zzaf implements zzae {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw<Void> zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzaf(int i, zzw<Void> zzw) {
        this.zzb = i;
        this.zzc = zzw;
    }

    private final void zza() {
        if (this.zzd + this.zze + this.zzf != this.zzb) {
            return;
        }
        if (this.zzg != null) {
            zzw<Void> zzw = this.zzc;
            int i = this.zze;
            int i10 = this.zzb;
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append(i);
            sb2.append(" out of ");
            sb2.append(i10);
            sb2.append(" underlying tasks failed");
            zzw.zza(new ExecutionException(sb2.toString(), this.zzg));
        } else if (this.zzh) {
            this.zzc.zzc();
        } else {
            this.zzc.zzb(null);
        }
    }

    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    public final void onSuccess(Object obj) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
