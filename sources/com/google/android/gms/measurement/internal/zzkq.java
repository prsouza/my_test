package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.d;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.internal.measurement.zzpp;

final class zzkq {
    public final /* synthetic */ zzkr zza;

    public zzkq(zzkr zzkr) {
        this.zza = zzkr;
    }

    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzs.zzm().zzk(this.zza.zzs.zzaw().currentTimeMillis())) {
            this.zza.zzs.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                d.g(this.zza.zzs, "Detected application was in foreground");
                zzc(this.zza.zzs.zzaw().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j10, boolean z) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzs.zzm().zzk(j10)) {
            this.zza.zzs.zzm().zzg.zza(true);
            zzpp.zzc();
            if (this.zza.zzs.zzf().zzs((String) null, zzel.zzaI)) {
                this.zza.zzs.zzh().zzo();
            }
        }
        this.zza.zzs.zzm().zzj.zzb(j10);
        if (this.zza.zzs.zzm().zzg.zzb()) {
            zzc(j10, z);
        }
    }

    @VisibleForTesting
    public final void zzc(long j10, boolean z) {
        this.zza.zzg();
        if (this.zza.zzs.zzJ()) {
            this.zza.zzs.zzm().zzj.zzb(j10);
            this.zza.zzs.zzaz().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzs.zzaw().elapsedRealtime()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.zza.zzs.zzq().zzaa("auto", "_sid", valueOf, j10);
            this.zza.zzs.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.zza.zzs.zzf().zzs((String) null, zzel.zzaa) && z) {
                bundle.putLong("_aib", 1);
            }
            this.zza.zzs.zzq().zzI("auto", "_s", j10, bundle);
            zzoc.zzc();
            if (this.zza.zzs.zzf().zzs((String) null, zzel.zzad)) {
                String zza2 = this.zza.zzs.zzm().zzo.zza();
                if (!TextUtils.isEmpty(zza2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", zza2);
                    this.zza.zzs.zzq().zzI("auto", "_ssr", j10, bundle2);
                }
            }
        }
    }
}
