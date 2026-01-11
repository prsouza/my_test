package com.google.android.gms.common;

final class zzp {
    public static int zza(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i10 = 0;
        while (i10 < 6) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            } else if (i12 == i) {
                return i11;
            } else {
                i10++;
            }
        }
        return 1;
    }
}
