package ki;

import e6.e;
import ge.k;
import l6.b1;

public final class p implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f7618a;

    public p(k kVar) {
        this.f7618a = kVar;
    }

    public final void a(b<Object> bVar, Throwable th2) {
        e.E(bVar, "call");
        e.E(th2, "t");
        this.f7618a.resumeWith(b1.k(th2));
    }

    public final void b(b<Object> bVar, z<Object> zVar) {
        e.E(bVar, "call");
        e.E(zVar, "response");
        this.f7618a.resumeWith(zVar);
    }
}
