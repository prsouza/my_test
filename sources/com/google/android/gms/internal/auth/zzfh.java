package com.google.android.gms.internal.auth;

final class zzfh implements zzfo {
    private final zzfo[] zza;

    public zzfh(zzfo... zzfoArr) {
        this.zza = zzfoArr;
    }

    public final zzfn zzb(Class<?> cls) {
        zzfo[] zzfoArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzfo zzfo = zzfoArr[i];
            if (zzfo.zzc(cls)) {
                return zzfo.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean zzc(Class<?> cls) {
        zzfo[] zzfoArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzfoArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
