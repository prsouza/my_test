package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import s.a;

public final class zzda implements zzck {
    private static final Map<String, zzda> zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static zzda zza(Context context, String str) {
        zzda zzda;
        if (!zzcc.zza()) {
            synchronized (zzda.class) {
                zzda = zza.get((Object) null);
                if (zzda == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th2;
                    }
                }
            }
            return zzda;
        }
        throw null;
    }

    public static synchronized void zzc() {
        synchronized (zzda.class) {
            Map<String, zzda> map = zza;
            Iterator<zzda> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().zzb;
                throw null;
            }
        }
    }

    public final Object zzb(String str) {
        throw null;
    }
}
