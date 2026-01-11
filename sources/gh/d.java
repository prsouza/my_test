package gh;

import ag.n;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final d f5490f;
    public static final d g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f5491h;
    public static final d i;

    /* renamed from: j  reason: collision with root package name */
    public static final Map<Object, d> f5492j = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5493a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5494b = 32;

    /* renamed from: c  reason: collision with root package name */
    public final int f5495c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5496d;

    /* renamed from: e  reason: collision with root package name */
    public final n f5497e;

    public static class a extends HashMap<Object, d> {
        public a() {
            d dVar = d.f5490f;
            put(Integer.valueOf(dVar.f5493a), dVar);
            d dVar2 = d.g;
            put(Integer.valueOf(dVar2.f5493a), dVar2);
            d dVar3 = d.f5491h;
            put(Integer.valueOf(dVar3.f5493a), dVar3);
            d dVar4 = d.i;
            put(Integer.valueOf(dVar4.f5493a), dVar4);
        }
    }

    static {
        n nVar = fg.a.f5123a;
        f5490f = new d(1, 1, 265, nVar);
        g = new d(2, 2, 133, nVar);
        f5491h = new d(3, 4, 67, nVar);
        i = new d(4, 8, 34, nVar);
    }

    public d(int i10, int i11, int i12, n nVar) {
        this.f5493a = i10;
        this.f5495c = i11;
        this.f5496d = i12;
        this.f5497e = nVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Object, gh.d>] */
    public static d a(int i10) {
        return (d) f5492j.get(Integer.valueOf(i10));
    }
}
