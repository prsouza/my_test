package t4;

import i8.c;
import i8.d;
import java.io.IOException;
import java.util.HashMap;
import l8.a;
import l8.d;
import x4.e;

public final class f implements d<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f11345a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final c f11346b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f11347c;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f11346b = new c("currentCacheSizeBytes", a8.a.e(hashMap), (c.a) null);
        a aVar2 = new a(2, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f11347c = new c("maxCacheSizeBytes", a8.a.e(hashMap2), (c.a) null);
    }

    public final void a(Object obj, Object obj2) throws IOException {
        e eVar = (e) obj;
        i8.e eVar2 = (i8.e) obj2;
        eVar2.c(f11346b, eVar.f12794a);
        eVar2.c(f11347c, eVar.f12795b);
    }
}
