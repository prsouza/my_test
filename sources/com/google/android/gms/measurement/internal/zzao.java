package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

abstract class zzao {
    private static volatile Handler zza;
    private final zzhd zzb;
    private final Runnable zzc;
    /* access modifiers changed from: private */
    public volatile long zzd;

    public zzao(zzhd zzhd) {
        Preconditions.checkNotNull(zzhd);
        this.zzb = zzhd;
        this.zzc = new zzan(this, zzhd);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzao.class) {
            if (zza == null) {
                zza = new zzby(this.zzb.zzav().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public final void zzb() {
        this.zzd = 0;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j10) {
        zzb();
        if (j10 >= 0) {
            this.zzd = this.zzb.zzaw().currentTimeMillis();
            if (!zzf().postDelayed(this.zzc, j10)) {
                this.zzb.zzaz().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
