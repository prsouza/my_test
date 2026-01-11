package y7;

import android.util.Log;
import com.github.mikephil.charting.BuildConfig;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f13494a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f13495b = 64;

    /* renamed from: c  reason: collision with root package name */
    public final int f13496c;

    public b(int i) {
        this.f13496c = i;
    }

    public static String a(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public final synchronized boolean b(String str, String str2) {
        boolean z;
        String a10 = a(str, this.f13496c);
        if (this.f13494a.size() >= this.f13495b) {
            if (!this.f13494a.containsKey(a10)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f13495b, (Throwable) null);
                return false;
            }
        }
        String a11 = a(str2, this.f13496c);
        String str3 = (String) this.f13494a.get(a10);
        if (str3 == null) {
            z = a11 == null;
        } else {
            z = str3.equals(a11);
        }
        if (z) {
            return false;
        }
        ? r12 = this.f13494a;
        if (str2 == null) {
            a11 = BuildConfig.FLAVOR;
        }
        r12.put(a10, a11);
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public final synchronized void c(Map<String, String> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (str != null) {
                String a10 = a(str, this.f13496c);
                if (this.f13494a.size() >= this.f13495b) {
                    if (!this.f13494a.containsKey(a10)) {
                        i++;
                    }
                }
                String str2 = (String) next.getValue();
                this.f13494a.put(a10, str2 == null ? BuildConfig.FLAVOR : a(str2, this.f13496c));
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
        if (i > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f13495b, (Throwable) null);
        }
    }
}
