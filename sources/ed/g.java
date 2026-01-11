package ed;

import android.support.v4.media.b;
import ca.c;
import dd.a;
import dd.d;
import e6.e;

public final class g<S extends d<S>> extends b {

    /* renamed from: v  reason: collision with root package name */
    public final d<S> f4807v;

    public g(d<S> dVar) {
        e.D(dVar, "schema");
        this.f4807v = dVar;
    }

    public final boolean J(Object obj) {
        return (obj instanceof a) && e.r(((a) obj).f4448c, this.f4807v);
    }

    public final void b(c cVar, Object obj) {
        a aVar = (a) obj;
        e.D(cVar, "writer");
        e.D(aVar, "struct");
        this.f4807v.b(cVar, aVar);
    }

    public final Object g(ca.b bVar) {
        e.D(bVar, "reader");
        return this.f4807v.a(bVar);
    }
}
