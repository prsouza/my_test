package com.google.android.gms.internal.common;

import android.support.v4.media.a;

public final class zzs {
    public static int zza(int i, int i10, String str) {
        String str2;
        if (i >= 0 && i < i10) {
            return i;
        }
        if (i < 0) {
            str2 = zzy.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i10 < 0) {
            throw new IllegalArgumentException(a.b(26, "negative size: ", i10));
        } else {
            str2 = zzy.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int zzb(int i, int i10, String str) {
        if (i >= 0 && i <= i10) {
            return i;
        }
        throw new IndexOutOfBoundsException(zzd(i, i10, "index"));
    }

    public static void zzc(int i, int i10, int i11) {
        String str;
        if (i < 0 || i10 < i || i10 > i11) {
            if (i < 0 || i > i11) {
                str = zzd(i, i11, "start index");
            } else if (i10 < 0 || i10 > i11) {
                str = zzd(i10, i11, "end index");
            } else {
                str = zzy.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    private static String zzd(int i, int i10, String str) {
        if (i < 0) {
            return zzy.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i10 >= 0) {
            return zzy.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        } else {
            throw new IllegalArgumentException(a.b(26, "negative size: ", i10));
        }
    }
}
