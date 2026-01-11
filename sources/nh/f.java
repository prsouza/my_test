package nh;

import ag.n;
import fg.a;
import java.util.HashMap;
import java.util.Map;
import lg.b;
import mg.g;
import mg.j;
import mg.k;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, n> f9073a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<n, String> f9074b = new HashMap();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    static {
        ? r02 = f9073a;
        n nVar = a.f5123a;
        r02.put("SHA-256", nVar);
        ? r03 = f9073a;
        n nVar2 = a.f5125c;
        r03.put("SHA-512", nVar2);
        ? r04 = f9073a;
        n nVar3 = a.g;
        r04.put("SHAKE128", nVar3);
        ? r05 = f9073a;
        n nVar4 = a.f5129h;
        r05.put("SHAKE256", nVar4);
        f9074b.put(nVar, "SHA-256");
        f9074b.put(nVar2, "SHA-512");
        f9074b.put(nVar3, "SHAKE128");
        f9074b.put(nVar4, "SHAKE256");
    }

    public static b a(n nVar) {
        if (nVar.m(a.f5123a)) {
            return new g();
        }
        if (nVar.m(a.f5125c)) {
            return new j();
        }
        if (nVar.m(a.g)) {
            return new k(128);
        }
        if (nVar.m(a.f5129h)) {
            return new k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + nVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    public static n b(String str) {
        n nVar = (n) f9073a.get(str);
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException(a8.a.c("unrecognized digest name: ", str));
    }
}
