package com.google.android.gms.internal.common;

import android.support.v4.media.a;

public final class zzah {
    public static Object[] zza(Object[] objArr, int i) {
        int i10 = 0;
        while (i10 < i) {
            if (objArr[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException(a.b(20, "at index ", i10));
            }
        }
        return objArr;
    }
}
