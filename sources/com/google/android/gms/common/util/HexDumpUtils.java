package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class HexDumpUtils {
    @KeepForSdk
    public static String dump(byte[] bArr, int i, int i10, boolean z) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i10 <= 0 || i + i10 > length) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(((i10 + 15) / 16) * (z ? 75 : 57));
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        while (i11 > 0) {
            if (i12 == 0) {
                if (i10 < 65536) {
                    sb2.append(String.format("%04X:", new Object[]{Integer.valueOf(i)}));
                } else {
                    sb2.append(String.format("%08X:", new Object[]{Integer.valueOf(i)}));
                }
                i13 = i;
            } else if (i12 == 8) {
                sb2.append(" -");
            }
            sb2.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr[i] & 255)}));
            i11--;
            i12++;
            if (z && (i12 == 16 || i11 == 0)) {
                int i14 = 16 - i12;
                if (i14 > 0) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        sb2.append("   ");
                    }
                }
                if (i14 >= 8) {
                    sb2.append("  ");
                }
                sb2.append("  ");
                for (int i16 = 0; i16 < i12; i16++) {
                    char c10 = (char) bArr[i13 + i16];
                    if (c10 < ' ' || c10 > '~') {
                        c10 = '.';
                    }
                    sb2.append(c10);
                }
            }
            if (i12 == 16 || i11 == 0) {
                sb2.append(10);
                i12 = 0;
            }
            i++;
        }
        return sb2.toString();
    }
}
