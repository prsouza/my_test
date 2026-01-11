package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i, int i10, int i11) {
        int i12 = (i10 & -4) + i;
        while (i < i12) {
            int i13 = ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24)) * -862048943;
            int i14 = i11 ^ (((i13 << 15) | (i13 >>> 17)) * 461845907);
            i11 = (((i14 >>> 19) | (i14 << 13)) * 5) - 430675100;
            i += 4;
        }
        int i15 = i10 & 3;
        int i16 = 0;
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 == 3) {
                    i16 = (bArr[i12 + 2] & 255) << 16;
                }
                int i17 = i11 ^ i10;
                int i18 = (i17 ^ (i17 >>> 16)) * -2048144789;
                int i19 = (i18 ^ (i18 >>> 13)) * -1028477387;
                return i19 ^ (i19 >>> 16);
            }
            i16 |= (bArr[i12 + 1] & 255) << 8;
        }
        int i20 = ((bArr[i12] & 255) | i16) * -862048943;
        i11 ^= ((i20 >>> 17) | (i20 << 15)) * 461845907;
        int i172 = i11 ^ i10;
        int i182 = (i172 ^ (i172 >>> 16)) * -2048144789;
        int i192 = (i182 ^ (i182 >>> 13)) * -1028477387;
        return i192 ^ (i192 >>> 16);
    }
}
