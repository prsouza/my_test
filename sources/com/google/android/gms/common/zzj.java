package com.google.android.gms.common;

import java.util.Arrays;

final class zzj extends zzi {
    private final byte[] zza;

    public zzj(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.zza = bArr;
    }

    public final byte[] zzf() {
        return this.zza;
    }
}
