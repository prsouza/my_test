package com.google.android.gms.internal.auth;

import android.net.Uri;
import com.github.mikephil.charting.BuildConfig;
import java.util.Map;

public final class zzco {
    private final Map<String, Map<String, String>> zza;

    public zzco(Map<String, Map<String, String>> map) {
        this.zza = map;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        Map map;
        String str4;
        if (uri == null || (map = this.zza.get(uri.toString())) == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = BuildConfig.FLAVOR.concat(valueOf);
        } else {
            str4 = new String(BuildConfig.FLAVOR);
        }
        return (String) map.get(str4);
    }
}
