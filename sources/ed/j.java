package ed;

import android.support.v4.media.b;
import ca.c;
import e6.e;
import md.l;

public final class j extends b {

    /* renamed from: v  reason: collision with root package name */
    public static final j f4811v = new j();

    public final boolean J(Object obj) {
        return obj instanceof l;
    }

    public final void b(c cVar, Object obj) {
        int i = ((l) obj).f8554a;
        e.D(cVar, "writer");
        c.f3313c.b(cVar, Long.valueOf(((long) i) & 4294967295L));
    }

    public final Object g(ca.b bVar) {
        e.D(bVar, "reader");
        return new l((int) Long.valueOf(((long) bVar.d()) + 0 + (((long) bVar.d()) << 8) + (((long) bVar.d()) << 16) + (((long) bVar.d()) << 24)).longValue());
    }
}
