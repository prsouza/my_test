package x8;

import i8.c;
import i8.d;
import i8.e;
import java.io.IOException;
import java.util.HashMap;
import l8.a;
import l8.d;

public final class b implements d<y8.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f13021a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f13022b;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f13022b = new c("messagingClientEvent", a8.a.e(hashMap), (c.a) null);
    }

    public final void a(Object obj, Object obj2) throws IOException {
        ((e) obj2).a(f13022b, ((y8.b) obj).f13549a);
    }
}
