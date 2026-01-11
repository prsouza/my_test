package com.google.android.gms.common;

import android.util.Log;

class zzw {
    private static final zzw zzd = new zzw(true, (String) null, (Throwable) null);
    public final boolean zza;
    public final String zzb;
    public final Throwable zzc;

    public zzw(boolean z, String str, Throwable th2) {
        this.zza = z;
        this.zzb = str;
        this.zzc = th2;
    }

    public static zzw zzb() {
        return zzd;
    }

    public static zzw zzc(String str) {
        return new zzw(false, str, (Throwable) null);
    }

    public static zzw zzd(String str, Throwable th2) {
        return new zzw(false, str, th2);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (!this.zza && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.zzc != null) {
                Log.d("GoogleCertificatesRslt", zza(), this.zzc);
            } else {
                Log.d("GoogleCertificatesRslt", zza());
            }
        }
    }
}
