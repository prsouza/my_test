package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.github.mikephil.charting.BuildConfig;
import java.util.Map;

public final class zzhg {
    private final Map zza;

    public zzhg(Map map) {
        this.zza = map;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map map = (Map) this.zza.get(uri.toString());
        if (map == null) {
            return null;
        }
        return (String) map.get(BuildConfig.FLAVOR.concat(String.valueOf(str3)));
    }
}
