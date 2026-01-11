package t4;

import i8.c;
import i8.d;
import i8.e;
import java.io.IOException;
import java.util.HashMap;
import l8.a;
import l8.d;

public final class c implements d<x4.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f11337a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final i8.c f11338b;

    /* renamed from: c  reason: collision with root package name */
    public static final i8.c f11339c;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f11338b = new i8.c("eventsDroppedCount", a8.a.e(hashMap), (c.a) null);
        a aVar2 = new a(3, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f11339c = new i8.c("reason", a8.a.e(hashMap2), (c.a) null);
    }

    public final void a(Object obj, Object obj2) throws IOException {
        x4.c cVar = (x4.c) obj;
        e eVar = (e) obj2;
        eVar.c(f11338b, cVar.f12789a);
        eVar.a(f11339c, cVar.f12790b);
    }
}
