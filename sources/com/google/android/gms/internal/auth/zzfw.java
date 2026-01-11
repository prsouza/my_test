package com.google.android.gms.internal.auth;

final class zzfw {
    private static final zzfv zza;
    private static final zzfv zzb = new zzfv();

    static {
        zzfv zzfv;
        try {
            zzfv = (zzfv) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzfv = null;
        }
        zza = zzfv;
    }

    public static zzfv zza() {
        return zza;
    }

    public static zzfv zzb() {
        return zzb;
    }
}
