package com.google.android.gms.internal.auth;

import android.support.v4.media.a;

final class zzdw extends zzdz {
    private final int zzc;

    public zzdw(byte[] bArr, int i, int i10) {
        super(bArr);
        zzeb.zzi(0, i10, bArr.length);
        this.zzc = i10;
    }

    public final byte zza(int i) {
        int i10 = this.zzc;
        if (((i10 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a.b(22, "Index < 0: ", i));
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final byte zzb(int i) {
        return this.zza[i];
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }
}
