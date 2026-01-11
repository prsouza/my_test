package com.google.android.gms.internal.auth;

final class zzfm {
    private static final zzfl zza;
    private static final zzfl zzb = new zzfl();

    static {
        zzfl zzfl;
        try {
            zzfl = (zzfl) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzfl = null;
        }
        zza = zzfl;
    }

    public static zzfl zza() {
        return zza;
    }

    public static zzfl zzb() {
        return zzb;
    }
}
