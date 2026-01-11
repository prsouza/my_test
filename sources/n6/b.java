package n6;

import android.os.Bundle;
import android.os.Process;
import io.sentry.SentryBaseEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f8926a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(myUid);
        sb2.append("]  PID: [");
        sb2.append(myPid);
        sb2.append("] ");
        sb2.toString().concat("PlayCoreVersion");
    }

    public static Bundle a() {
        Map map;
        Bundle bundle = new Bundle();
        synchronized (b.class) {
            HashMap hashMap = f8926a;
            if (!hashMap.containsKey("review")) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(SentryBaseEvent.DEFAULT_PLATFORM, 11003);
                hashMap.put("review", hashMap2);
            }
            map = (Map) hashMap.get("review");
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get(SentryBaseEvent.DEFAULT_PLATFORM)).intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        return bundle;
    }
}
