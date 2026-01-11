package com.google.android.gms.internal.auth;

import android.net.Uri;
import s.a;

public final class zzcq {
    private static final a<String, Uri> zza = new a<>();

    public static synchronized Uri zza(String str) {
        Uri orDefault;
        String str2;
        synchronized (zzcq.class) {
            a<String, Uri> aVar = zza;
            orDefault = aVar.getOrDefault("com.google.android.gms.auth_account", null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.auth_account"));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                orDefault = Uri.parse(str2);
                aVar.put("com.google.android.gms.auth_account", orDefault);
            }
        }
        return orDefault;
    }
}
