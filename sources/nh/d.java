package nh;

import androidx.fragment.app.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, d> f9067c;

    /* renamed from: a  reason: collision with root package name */
    public final int f9068a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9069b;

    static {
        HashMap hashMap = new HashMap();
        m.e(1, "XMSSMT_SHA2_20/2_256", hashMap, a("SHA-256", 32, 16, 67, 20, 2));
        m.e(2, "XMSSMT_SHA2_20/4_256", hashMap, a("SHA-256", 32, 16, 67, 20, 4));
        m.e(3, "XMSSMT_SHA2_40/2_256", hashMap, a("SHA-256", 32, 16, 67, 40, 2));
        m.e(4, "XMSSMT_SHA2_40/4_256", hashMap, a("SHA-256", 32, 16, 67, 40, 2));
        m.e(5, "XMSSMT_SHA2_40/8_256", hashMap, a("SHA-256", 32, 16, 67, 40, 4));
        m.e(6, "XMSSMT_SHA2_60/3_256", hashMap, a("SHA-256", 32, 16, 67, 60, 8));
        m.e(7, "XMSSMT_SHA2_60/6_256", hashMap, a("SHA-256", 32, 16, 67, 60, 6));
        m.e(8, "XMSSMT_SHA2_60/12_256", hashMap, a("SHA-256", 32, 16, 67, 60, 12));
        m.e(9, "XMSSMT_SHA2_20/2_512", hashMap, a("SHA-512", 64, 16, 131, 20, 2));
        m.e(10, "XMSSMT_SHA2_20/4_512", hashMap, a("SHA-512", 64, 16, 131, 20, 4));
        m.e(11, "XMSSMT_SHA2_40/2_512", hashMap, a("SHA-512", 64, 16, 131, 40, 2));
        m.e(12, "XMSSMT_SHA2_40/4_512", hashMap, a("SHA-512", 64, 16, 131, 40, 4));
        m.e(13, "XMSSMT_SHA2_40/8_512", hashMap, a("SHA-512", 64, 16, 131, 40, 8));
        m.e(14, "XMSSMT_SHA2_60/3_512", hashMap, a("SHA-512", 64, 16, 131, 60, 3));
        m.e(15, "XMSSMT_SHA2_60/6_512", hashMap, a("SHA-512", 64, 16, 131, 60, 6));
        m.e(16, "XMSSMT_SHA2_60/12_512", hashMap, a("SHA-512", 64, 16, 131, 60, 12));
        m.e(17, "XMSSMT_SHAKE_20/2_256", hashMap, a("SHAKE128", 32, 16, 67, 20, 2));
        m.e(18, "XMSSMT_SHAKE_20/4_256", hashMap, a("SHAKE128", 32, 16, 67, 20, 4));
        m.e(19, "XMSSMT_SHAKE_40/2_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 2));
        m.e(20, "XMSSMT_SHAKE_40/4_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 4));
        m.e(21, "XMSSMT_SHAKE_40/8_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 8));
        m.e(22, "XMSSMT_SHAKE_60/3_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 3));
        m.e(23, "XMSSMT_SHAKE_60/6_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 6));
        m.e(24, "XMSSMT_SHAKE_60/12_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 12));
        m.e(25, "XMSSMT_SHAKE_20/2_512", hashMap, a("SHAKE256", 64, 16, 131, 20, 2));
        m.e(26, "XMSSMT_SHAKE_20/4_512", hashMap, a("SHAKE256", 64, 16, 131, 20, 4));
        m.e(27, "XMSSMT_SHAKE_40/2_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 2));
        m.e(28, "XMSSMT_SHAKE_40/4_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 4));
        m.e(29, "XMSSMT_SHAKE_40/8_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 8));
        m.e(30, "XMSSMT_SHAKE_60/3_512", hashMap, a("SHAKE256", 64, 16, 131, 60, 3));
        m.e(31, "XMSSMT_SHAKE_60/6_512", hashMap, a("SHAKE256", 64, 16, 131, 60, 6));
        hashMap.put(a("SHAKE256", 64, 16, 131, 60, 12), new d(32, "XMSSMT_SHAKE_60/12_512"));
        f9067c = Collections.unmodifiableMap(hashMap);
    }

    public d(int i, String str) {
        this.f9068a = i;
        this.f9069b = str;
    }

    public static String a(String str, int i, int i10, int i11, int i12, int i13) {
        return str + "-" + i + "-" + i10 + "-" + i11 + "-" + i12 + "-" + i13;
    }

    public final String toString() {
        return this.f9069b;
    }
}
