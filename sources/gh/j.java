package gh;

import ag.n;
import java.util.HashMap;
import java.util.Map;

public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final j f5506e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f5507f;
    public static final j g;

    /* renamed from: h  reason: collision with root package name */
    public static final j f5508h;
    public static final j i;

    /* renamed from: j  reason: collision with root package name */
    public static Map<Object, j> f5509j = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5510a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5511b = 32;

    /* renamed from: c  reason: collision with root package name */
    public final int f5512c;

    /* renamed from: d  reason: collision with root package name */
    public final n f5513d;

    public static class a extends HashMap<Object, j> {
        public a() {
            j jVar = j.f5506e;
            put(Integer.valueOf(jVar.f5510a), jVar);
            j jVar2 = j.f5507f;
            put(Integer.valueOf(jVar2.f5510a), jVar2);
            j jVar3 = j.g;
            put(Integer.valueOf(jVar3.f5510a), jVar3);
            j jVar4 = j.f5508h;
            put(Integer.valueOf(jVar4.f5510a), jVar4);
            j jVar5 = j.i;
            put(Integer.valueOf(jVar5.f5510a), jVar5);
        }
    }

    static {
        n nVar = fg.a.f5123a;
        f5506e = new j(5, 5, nVar);
        f5507f = new j(6, 10, nVar);
        g = new j(7, 15, nVar);
        f5508h = new j(8, 20, nVar);
        i = new j(9, 25, nVar);
    }

    public j(int i10, int i11, n nVar) {
        this.f5510a = i10;
        this.f5512c = i11;
        this.f5513d = nVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Object, gh.j>, java.util.HashMap] */
    public static j a(int i10) {
        return (j) f5509j.get(Integer.valueOf(i10));
    }
}
