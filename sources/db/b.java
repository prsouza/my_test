package db;

import nd.m;
import qa.e;
import qa.f;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final g f4421a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4422b;

    public b(g gVar, c cVar) {
        this.f4421a = gVar;
        this.f4422b = cVar;
    }

    public final boolean b() {
        g gVar = this.f4421a;
        if ((m.V0(gVar.f4426b, f.a.a(gVar.f4425a, e.NODLE_PUBLIC_KEY_4, (String) null, 2, (Object) null)) || m.V0(gVar.f4426b, f.a.a(gVar.f4425a, e.NODLE_PUBLIC_KEY_5, (String) null, 2, (Object) null))) || this.f4422b.b()) {
            return true;
        }
        return false;
    }
}
