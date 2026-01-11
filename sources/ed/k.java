package ed;

import android.support.v4.media.b;
import ca.c;
import e6.e;
import md.j;

public final class k extends b {

    /* renamed from: v  reason: collision with root package name */
    public static final k f4812v = new k();

    public final boolean J(Object obj) {
        return obj instanceof j;
    }

    public final void b(c cVar, Object obj) {
        byte b10 = ((j) obj).f8550a;
        e.D(cVar, "writer");
        cVar.a(b10 & 255);
    }

    public final Object g(ca.b bVar) {
        e.D(bVar, "reader");
        return new j((byte) bVar.d());
    }
}
