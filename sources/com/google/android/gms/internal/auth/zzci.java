package com.google.android.gms.internal.auth;

import android.os.Binder;

public final /* synthetic */ class zzci {
    public static <V> V zza(zzcj<V> zzcj) {
        long clearCallingIdentity;
        try {
            return zzcj.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = zzcj.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th2;
        }
    }
}
