package com.google.android.gms.internal.auth;

import ah.v;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;

final class zzcn implements zzck {
    private static zzcn zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzcn() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzcn(Context context) {
        this.zzb = context;
        zzcm zzcm = new zzcm(this, (Handler) null);
        this.zzc = zzcm;
        context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcm);
    }

    public static zzcn zza(Context context) {
        zzcn zzcn;
        zzcn zzcn2;
        synchronized (zzcn.class) {
            if (zza == null) {
                if (v.C(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    zzcn2 = new zzcn(context);
                } else {
                    zzcn2 = new zzcn();
                }
                zza = zzcn2;
            }
            zzcn = zza;
        }
        return zzcn;
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzcn.class) {
            zzcn zzcn = zza;
            if (!(zzcn == null || (context = zzcn.zzb) == null || zzcn.zzc == null)) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* renamed from: zzc */
    public final String zzb(String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzci.zza(new zzcl(this, str));
        } catch (IllegalStateException | SecurityException e10) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e10);
            return null;
        }
    }

    public final /* synthetic */ String zzd(String str) {
        return zzcb.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}
