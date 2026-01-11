package t4;

import i8.c;
import i8.d;
import i8.e;
import java.io.IOException;
import java.util.HashMap;
import l8.d;

public final class a implements d<x4.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11330a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final c f11331b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f11332c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f11333d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f11334e;

    static {
        l8.a aVar = new l8.a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f11331b = new c("window", a8.a.e(hashMap), (c.a) null);
        l8.a aVar2 = new l8.a(2, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f11332c = new c("logSourceMetrics", a8.a.e(hashMap2), (c.a) null);
        l8.a aVar3 = new l8.a(3, d.a.DEFAULT);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(aVar3.annotationType(), aVar3);
        f11333d = new c("globalMetrics", a8.a.e(hashMap3), (c.a) null);
        l8.a aVar4 = new l8.a(4, d.a.DEFAULT);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(aVar4.annotationType(), aVar4);
        f11334e = new c("appNamespace", a8.a.e(hashMap4), (c.a) null);
    }

    public final void a(Object obj, Object obj2) throws IOException {
        x4.a aVar = (x4.a) obj;
        e eVar = (e) obj2;
        eVar.a(f11331b, aVar.f12779a);
        eVar.a(f11332c, aVar.f12780b);
        eVar.a(f11333d, aVar.f12781c);
        eVar.a(f11334e, aVar.f12782d);
    }
}
