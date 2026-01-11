package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzby;

public final class zzkr extends zzf {
    public final zzkq zza = new zzkq(this);
    public final zzkp zzb = new zzkp(this);
    public final zzkn zzc = new zzkn(this);
    /* access modifiers changed from: private */
    public Handler zzd;

    public zzkr(zzgi zzgi) {
        super(zzgi);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzkr zzkr, long j10) {
        zzkr.zzg();
        zzkr.zzm();
        zzkr.zzs.zzaz().zzj().zzb("Activity paused, time", Long.valueOf(j10));
        zzkr.zzc.zza(j10);
        if (zzkr.zzs.zzf().zzu()) {
            zzkr.zzb.zzb(j10);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(zzkr zzkr, long j10) {
        zzkr.zzg();
        zzkr.zzm();
        zzkr.zzs.zzaz().zzj().zzb("Activity resumed, time", Long.valueOf(j10));
        if (zzkr.zzs.zzf().zzu() || zzkr.zzs.zzm().zzl.zzb()) {
            zzkr.zzb.zzc(j10);
        }
        zzkr.zzc.zzb();
        zzkq zzkq = zzkr.zza;
        zzkq.zza.zzg();
        if (zzkq.zza.zzs.zzJ()) {
            zzkq.zzb(zzkq.zza.zzs.zzaw().currentTimeMillis(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new zzby(Looper.getMainLooper());
        }
    }

    public final boolean zzf() {
        return false;
    }
}
