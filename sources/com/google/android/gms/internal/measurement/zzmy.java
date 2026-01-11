package com.google.android.gms.internal.measurement;

final class zzmy extends zzmx {
    public final int zza(int i, byte[] bArr, int i10, int i11) {
        while (r9 < i11 && bArr[r9] >= 0) {
            i10 = r9 + 1;
        }
        if (r9 >= i11) {
            return 0;
        }
        while (r9 < i11) {
            int i12 = r9 + 1;
            byte b10 = bArr[r9];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i12 >= i11) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        r9 = i12 + 1;
                        if (bArr[i12] > -65) {
                        }
                    }
                } else if (b10 < -16) {
                    if (i12 >= i11 - 1) {
                        return zzna.zza(bArr, i12, i11);
                    }
                    int i13 = i12 + 1;
                    byte b11 = bArr[i12];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        r9 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                } else if (i12 >= i11 - 2) {
                    return zzna.zza(bArr, i12, i11);
                } else {
                    int i14 = i12 + 1;
                    byte b12 = bArr[i12];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i12 = i15 + 1;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            r9 = i12;
        }
        return 0;
    }
}
