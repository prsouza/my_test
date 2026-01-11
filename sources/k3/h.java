package k3;

import c4.g;
import g3.f;
import i3.m;
import i3.w;
import k3.i;

public final class h extends g<f, w<?>> implements i {

    /* renamed from: d  reason: collision with root package name */
    public i.a f7417d;

    public h(long j10) {
        super(j10);
    }

    public final int b(Object obj) {
        w wVar = (w) obj;
        if (wVar == null) {
            return 1;
        }
        return wVar.b();
    }

    public final void c(Object obj, Object obj2) {
        f fVar = (f) obj;
        w wVar = (w) obj2;
        i.a aVar = this.f7417d;
        if (aVar != null && wVar != null) {
            ((m) aVar).f6092e.a(wVar, true);
        }
    }
}
