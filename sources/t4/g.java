package t4;

import i8.c;
import i8.d;
import i8.e;
import java.io.IOException;
import java.util.HashMap;
import l8.a;
import l8.d;
import x4.f;

public final class g implements d<f> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f11348a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final c f11349b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f11350c;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f11349b = new c("startMs", a8.a.e(hashMap), (c.a) null);
        a aVar2 = new a(2, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f11350c = new c("endMs", a8.a.e(hashMap2), (c.a) null);
    }

    public final void a(Object obj, Object obj2) throws IOException {
        f fVar = (f) obj;
        e eVar = (e) obj2;
        eVar.c(f11349b, fVar.f12796a);
        eVar.c(f11350c, fVar.f12797b);
    }
}
