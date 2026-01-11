package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.github.mikephil.charting.BuildConfig;

public final class zzhv {
    public final String zza;
    public final Uri zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final zzic zzi;

    public zzhv(Uri uri) {
        this((String) null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, (zzic) null);
    }

    private zzhv(String str, Uri uri, String str2, String str3, boolean z, boolean z10, boolean z11, boolean z12, zzic zzic) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = BuildConfig.FLAVOR;
        this.zzd = BuildConfig.FLAVOR;
        this.zze = z;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzhv zza() {
        return new zzhv((String) null, this.zzb, this.zzc, this.zzd, this.zze, false, true, false, (zzic) null);
    }

    public final zzhv zzb() {
        if (this.zzc.isEmpty()) {
            return new zzhv((String) null, this.zzb, this.zzc, this.zzd, true, false, this.zzg, false, (zzic) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzhy zzc(String str, double d10) {
        return new zzht(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzhy zzd(String str, long j10) {
        return new zzhr(this, str, Long.valueOf(j10), true);
    }

    public final zzhy zze(String str, String str2) {
        return new zzhu(this, str, str2, true);
    }

    public final zzhy zzf(String str, boolean z) {
        return new zzhs(this, str, Boolean.valueOf(z), true);
    }
}
