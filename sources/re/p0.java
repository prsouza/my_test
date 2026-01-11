package re;

import oe.b;
import pe.e;
import yd.v;

public final class p0<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final z0 f10737a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f10738b;

    public p0(b<T> bVar) {
        this.f10738b = bVar;
        this.f10737a = new z0(bVar.a());
    }

    public final e a() {
        return this.f10737a;
    }

    public final T b(qe.b bVar) {
        e6.e.D(bVar, "decoder");
        if (bVar.c()) {
            return bVar.e(this.f10738b);
        }
        bVar.w();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && !(e6.e.r(v.a(p0.class), v.a(obj.getClass())) ^ true) && !(e6.e.r(this.f10738b, ((p0) obj).f10738b) ^ true);
    }

    public final int hashCode() {
        return this.f10738b.hashCode();
    }
}
