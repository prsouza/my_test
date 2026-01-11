package mh;

import ag.n;
import b9.m;
import fh.h;
import java.util.HashMap;
import jg.a;
import lg.b;
import mg.g;
import mg.j;
import mg.k;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8733a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f8734b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f8735c = new a(fg.a.f5128f);

    /* renamed from: d  reason: collision with root package name */
    public static final a f8736d = new a(fg.a.f5127e);

    /* renamed from: e  reason: collision with root package name */
    public static final a f8737e = new a(fg.a.f5123a);

    /* renamed from: f  reason: collision with root package name */
    public static final a f8738f = new a(fg.a.f5125c);
    public static final a g = new a(fg.a.g);

    /* renamed from: h  reason: collision with root package name */
    public static final a f8739h = new a(fg.a.f5129h);
    public static final HashMap i;

    static {
        n nVar = fh.e.f5156h;
        f8733a = new a(nVar);
        n nVar2 = fh.e.i;
        f8734b = new a(nVar2);
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put(nVar, 5);
        hashMap.put(nVar2, 6);
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

    public static a b(int i10) {
        if (i10 == 5) {
            return f8733a;
        }
        if (i10 == 6) {
            return f8734b;
        }
        throw new IllegalArgumentException(m.b("unknown security category: ", i10));
    }

    public static a c(String str) {
        if (str.equals("SHA3-256")) {
            return f8735c;
        }
        if (str.equals("SHA-512/256")) {
            return f8736d;
        }
        throw new IllegalArgumentException(a8.a.c("unknown tree digest: ", str));
    }

    public static String d(h hVar) {
        a aVar = hVar.f5172b;
        if (aVar.f7256a.m(f8735c.f7256a)) {
            return "SHA3-256";
        }
        if (aVar.f7256a.m(f8736d.f7256a)) {
            return "SHA-512/256";
        }
        StringBuilder d10 = a.a.d("unknown tree digest: ");
        d10.append(aVar.f7256a);
        throw new IllegalArgumentException(d10.toString());
    }

    public static a e(String str) {
        if (str.equals("SHA-256")) {
            return f8737e;
        }
        if (str.equals("SHA-512")) {
            return f8738f;
        }
        if (str.equals("SHAKE128")) {
            return g;
        }
        if (str.equals("SHAKE256")) {
            return f8739h;
        }
        throw new IllegalArgumentException(a8.a.c("unknown tree digest: ", str));
    }
}
