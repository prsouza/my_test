package qa;

import de.h;
import e6.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f f10328a;

    /* renamed from: b  reason: collision with root package name */
    public final e f10329b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10330c = 0;

    public c(f fVar, e eVar) {
        e.D(eVar, "key");
        this.f10328a = fVar;
        this.f10329b = eVar;
    }

    public final Long a(Object obj, h<?> hVar) {
        e.D(hVar, "property");
        return Long.valueOf(this.f10328a.b(this.f10329b));
    }

    public final void b(Object obj, h<?> hVar, long j10) {
        e.D(hVar, "property");
        this.f10328a.a(this.f10329b, Long.valueOf(j10));
    }
}
