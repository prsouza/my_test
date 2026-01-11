package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzol;

final class zzkp {
    @VisibleForTesting
    public long zza;
    @VisibleForTesting
    public long zzb;
    public final /* synthetic */ zzkr zzc;
    private final zzao zzd;

    public zzkp(zzkr zzkr) {
        this.zzc = zzkr;
        this.zzd = new zzko(this, zzkr.zzs);
        long elapsedRealtime = zzkr.zzs.zzaw().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0;
        this.zzb = 0;
    }

    public final void zzb(long j10) {
        this.zzd.zzb();
    }

    public final void zzc(long j10) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j10;
        this.zzb = j10;
    }

    public final boolean zzd(boolean z, boolean z10, long j10) {
        this.zzc.zzg();
        this.zzc.zza();
        zzol.zzc();
        if (!this.zzc.zzs.zzf().zzs((String) null, zzel.zzae)) {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzaw().currentTimeMillis());
        } else if (this.zzc.zzs.zzJ()) {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzaw().currentTimeMillis());
        }
        long j11 = j10 - this.zza;
        if (z || j11 >= 1000) {
            if (!z10) {
                j11 = j10 - this.zzb;
                this.zzb = j10;
            }
            this.zzc.zzs.zzaz().zzj().zzb("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            zzlp.zzK(this.zzc.zzs.zzs().zzj(!this.zzc.zzs.zzf().zzu()), bundle, true);
            if (!z10) {
                this.zzc.zzs.zzq().zzH("auto", "_e", bundle);
            }
            this.zza = j10;
            this.zzd.zzb();
            this.zzd.zzd(3600000);
            return true;
        }
        this.zzc.zzs.zzaz().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }
}
