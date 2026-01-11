package com.google.android.gms.internal.auth;

import android.util.Log;

final class zzct extends zzcz<Long> {
    public zzct(zzcx zzcx, String str, Long l10, boolean z) {
        super(zzcx, str, l10, true, (zzct) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 25 + str.length());
            sb2.append("Invalid long value for ");
            sb2.append(zzc);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
