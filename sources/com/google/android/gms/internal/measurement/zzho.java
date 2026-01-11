package com.google.android.gms.internal.measurement;

import android.net.Uri;
import s.a;

public final class zzho {
    private static final a zza = new a();

    public static synchronized Uri zza(String str) {
        synchronized (zzho.class) {
            a aVar = zza;
            Uri uri = (Uri) aVar.getOrDefault("com.google.android.gms.measurement", null);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
