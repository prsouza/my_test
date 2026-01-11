package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

public final class zzaq {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final zzat zzf;

    public zzaq(zzgi zzgi, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzat zzat;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzgi.zzaz().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzey.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzat = new zzat(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgi.zzaz().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzgi.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzgi.zzaz().zzk().zzb("Param value can't be null", zzgi.zzj().zze(next));
                        it.remove();
                    } else {
                        zzgi.zzv().zzO(bundle2, next, zzA);
                    }
                }
            }
            zzat = new zzat(bundle2);
        }
        this.zzf = zzat;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String zzat = this.zzf.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        return a.e(sb2, zzat, "}");
    }

    public final zzaq zza(zzgi zzgi, long j10) {
        return new zzaq(zzgi, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }

    private zzaq(zzgi zzgi, String str, String str2, String str3, long j10, long j11, zzat zzat) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzat);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzgi.zzaz().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzey.zzn(str2), zzey.zzn(str3));
        }
        this.zzf = zzat;
    }
}
