package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.activity.result.d;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import s.a;

public final class zzd extends zze {
    private final Map zza = new a();
    private final Map zzb = new a();
    private long zzc;

    public zzd(zzgi zzgi) {
        super(zzgi);
    }

    public static /* synthetic */ void zza(zzd zzd, String str, long j10) {
        zzd.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzd.zzb.isEmpty()) {
            zzd.zzc = j10;
        }
        Integer num = (Integer) zzd.zzb.get(str);
        if (num != null) {
            zzd.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzd.zzb.size() >= 100) {
            android.support.v4.media.a.g(zzd.zzs, "Too many ads visible");
        } else {
            zzd.zzb.put(str, 1);
            zzd.zza.put(str, Long.valueOf(j10));
        }
    }

    public static /* synthetic */ void zzb(zzd zzd, String str, long j10) {
        zzd.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzd.zzb.get(str);
        if (num != null) {
            zziu zzj = zzd.zzs.zzs().zzj(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzd.zzb.remove(str);
                Long l10 = (Long) zzd.zza.get(str);
                if (l10 == null) {
                    a.a.e(zzd.zzs, "First ad unit exposure time was never set");
                } else {
                    long longValue = l10.longValue();
                    zzd.zza.remove(str);
                    zzd.zzi(str, j10 - longValue, zzj);
                }
                if (zzd.zzb.isEmpty()) {
                    long j11 = zzd.zzc;
                    if (j11 == 0) {
                        a.a.e(zzd.zzs, "First ad exposure time was never set");
                        return;
                    }
                    zzd.zzh(j10 - j11, zzj);
                    zzd.zzc = 0;
                    return;
                }
                return;
            }
            zzd.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzd.zzs.zzaz().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void zzh(long j10, zziu zziu) {
        if (zziu == null) {
            d.g(this.zzs, "Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.zzs.zzaz().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            zzlp.zzK(zziu, bundle, true);
            this.zzs.zzq().zzH("am", "_xa", bundle);
        }
    }

    private final void zzi(String str, long j10, zziu zziu) {
        if (zziu == null) {
            d.g(this.zzs, "Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.zzs.zzaz().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            zzlp.zzK(zziu, bundle, true);
            this.zzs.zzq().zzH("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void zzj(long j10) {
        for (String put : this.zza.keySet()) {
            this.zza.put(put, Long.valueOf(j10));
        }
        if (!this.zza.isEmpty()) {
            this.zzc = j10;
        }
    }

    public final void zzd(String str, long j10) {
        if (str == null || str.length() == 0) {
            a.a.e(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaA().zzp(new zza(this, str, j10));
        }
    }

    public final void zze(String str, long j10) {
        if (str == null || str.length() == 0) {
            a.a.e(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaA().zzp(new zzb(this, str, j10));
        }
    }

    public final void zzf(long j10) {
        zziu zzj = this.zzs.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j10 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j10 - this.zzc, zzj);
        }
        zzj(j10);
    }
}
