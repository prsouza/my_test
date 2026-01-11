package com.google.android.gms.internal.auth;

final class zzga implements zzfn {
    private final zzfq zza;
    private final String zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
    private final Object[] zzc;
    private final int zzd;

    public zzga(zzfq zzfq, String str, Object[] objArr) {
        this.zza = zzfq;
        this.zzc = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i10);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i;
                i += 13;
                i10 = i11;
            } else {
                this.zzd = (charAt2 << i) | c10;
                return;
            }
        }
    }

    public final zzfq zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
