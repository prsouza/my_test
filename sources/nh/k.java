package nh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, k> f9091c;

    /* renamed from: a  reason: collision with root package name */
    public final int f9092a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9093b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 67), new k(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(a("SHA-512", 64, 131), new k(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(a("SHAKE128", 32, 67), new k(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(a("SHAKE256", 64, 131), new k(67108868, "WOTSP_SHAKE256_W16"));
        f9091c = Collections.unmodifiableMap(hashMap);
    }

    public k(int i, String str) {
        this.f9092a = i;
        this.f9093b = str;
    }

    public static String a(String str, int i, int i10) {
        return str + "-" + i + "-" + 16 + "-" + i10;
    }

    public final String toString() {
        return this.f9093b;
    }
}
