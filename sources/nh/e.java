package nh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, e> f9070c;

    /* renamed from: a  reason: collision with root package name */
    public final int f9071a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9072b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 16, 67, 10), new e(1, "XMSS_SHA2_10_256"));
        hashMap.put(a("SHA-256", 32, 16, 67, 16), new e(2, "XMSS_SHA2_16_256"));
        hashMap.put(a("SHA-256", 32, 16, 67, 20), new e(3, "XMSS_SHA2_20_256"));
        hashMap.put(a("SHA-512", 64, 16, 131, 10), new e(4, "XMSS_SHA2_10_512"));
        hashMap.put(a("SHA-512", 64, 16, 131, 16), new e(5, "XMSS_SHA2_16_512"));
        hashMap.put(a("SHA-512", 64, 16, 131, 20), new e(6, "XMSS_SHA2_20_512"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 10), new e(7, "XMSS_SHAKE_10_256"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 16), new e(8, "XMSS_SHAKE_16_256"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 20), new e(9, "XMSS_SHAKE_20_256"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 10), new e(10, "XMSS_SHAKE_10_512"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 16), new e(11, "XMSS_SHAKE_16_512"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 20), new e(12, "XMSS_SHAKE_20_512"));
        f9070c = Collections.unmodifiableMap(hashMap);
    }

    public e(int i, String str) {
        this.f9071a = i;
        this.f9072b = str;
    }

    public static String a(String str, int i, int i10, int i11, int i12) {
        return str + "-" + i + "-" + i10 + "-" + i11 + "-" + i12;
    }

    public final String toString() {
        return this.f9072b;
    }
}
