package gh;

import ag.n;
import java.util.HashMap;
import java.util.Map;
import lg.b;
import mg.g;
import mg.j;
import mg.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, n> f5488a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<n, String> f5489b = new HashMap();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.Map<java.lang.String, ag.n>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    static {
        ? r02 = f5488a;
        n nVar = fg.a.f5123a;
        r02.put("SHA-256", nVar);
        ? r03 = f5488a;
        n nVar2 = fg.a.f5125c;
        r03.put("SHA-512", nVar2);
        ? r04 = f5488a;
        n nVar3 = fg.a.g;
        r04.put("SHAKE128", nVar3);
        ? r05 = f5488a;
        n nVar4 = fg.a.f5129h;
        r05.put("SHAKE256", nVar4);
        f5489b.put(nVar, "SHA-256");
        f5489b.put(nVar2, "SHA-512");
        f5489b.put(nVar3, "SHAKE128");
        f5489b.put(nVar4, "SHAKE256");
    }

    public static b a(n nVar) {
        if (nVar.m(fg.a.f5123a)) {
            return new g();
        }
        if (nVar.m(fg.a.f5125c)) {
            return new j();
        }
        if (nVar.m(fg.a.g)) {
            return new k(128);
        }
        if (nVar.m(fg.a.f5129h)) {
            return new k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + nVar);
    }
}
