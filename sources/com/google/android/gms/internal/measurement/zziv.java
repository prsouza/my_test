package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import b9.m;

final class zziv extends zziy {
    private final int zzc;

    public zziv(byte[] bArr, int i, int i10) {
        super(bArr);
        zzjb.zzj(0, i10, bArr.length);
        this.zzc = i10;
    }

    public final byte zza(int i) {
        int i10 = this.zzc;
        if (((i10 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(m.b("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(d.b("Index > length: ", i, ", ", i10));
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
