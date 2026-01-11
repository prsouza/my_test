package ed;

import ca.c;
import e6.e;

public final class b extends android.support.v4.media.b {

    /* renamed from: v  reason: collision with root package name */
    public static final b f4802v = new b();

    public final boolean J(Object obj) {
        return obj instanceof Boolean;
    }

    public final void b(c cVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e.D(cVar, "writer");
        if (Boolean.valueOf(booleanValue).booleanValue()) {
            cVar.a(1);
        } else {
            cVar.a(0);
        }
    }

    public final Object g(ca.b bVar) {
        e.D(bVar, "reader");
        return Boolean.valueOf(bVar.a());
    }
}
