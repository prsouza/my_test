package t4;

import i8.c;
import i8.e;
import java.io.IOException;
import java.util.HashMap;
import l8.a;
import l8.d;

public final class d implements i8.d<x4.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f11340a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final c f11341b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f11342c;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f11341b = new c("logSource", a8.a.e(hashMap), (c.a) null);
        a aVar2 = new a(2, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f11342c = new c("logEventDropped", a8.a.e(hashMap2), (c.a) null);
    }

    public final void a(Object obj, Object obj2) throws IOException {
        x4.d dVar = (x4.d) obj;
        e eVar = (e) obj2;
        eVar.a(f11341b, dVar.f12792a);
        eVar.a(f11342c, dVar.f12793b);
    }
}
