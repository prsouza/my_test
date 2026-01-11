package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;

public final class zzcx {
    public final String zza;
    public final Uri zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final zzdd<Context, Boolean> zzi;

    public zzcx(Uri uri) {
        this((String) null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, (zzdd<Context, Boolean>) null);
    }

    private zzcx(String str, Uri uri, String str2, String str3, boolean z, boolean z10, boolean z11, boolean z12, zzdd<Context, Boolean> zzdd) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = BuildConfig.FLAVOR;
        this.zzd = BuildConfig.FLAVOR;
        this.zze = z;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzcx zza() {
        if (this.zzc.isEmpty()) {
            return new zzcx((String) null, this.zzb, this.zzc, this.zzd, true, false, false, false, (zzdd<Context, Boolean>) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzcz<Double> zzb(String str, double d10) {
        return new zzcv(this, str, Double.valueOf(Utils.DOUBLE_EPSILON), true);
    }

    public final zzcz<Long> zzc(String str, long j10) {
        return new zzct(this, str, Long.valueOf(j10), true);
    }

    public final zzcz<Boolean> zzd(String str, boolean z) {
        return new zzcu(this, str, Boolean.valueOf(z), true);
    }

    public final <T> zzcz<T> zze(String str, T t10, zzhl zzhl) {
        return new zzcw(this, "getTokenRefactor__blocked_packages", t10, true, zzhl, (byte[]) null);
    }
}
