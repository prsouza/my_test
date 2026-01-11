package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final /* synthetic */ class zzhh {
    public static Object zza(zzhi zzhi) {
        long clearCallingIdentity;
        try {
            return zzhi.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object zza = zzhi.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th2;
        }
    }
}
