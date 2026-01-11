package le;

import aa.b;
import ad.c;
import ge.a;
import pd.f;
import rd.d;
import xd.l;

public class q<T> extends a<T> implements d {

    /* renamed from: c  reason: collision with root package name */
    public final pd.d<T> f8264c;

    public q(f fVar, pd.d<? super T> dVar) {
        super(fVar, true);
        this.f8264c = dVar;
    }

    public final boolean U() {
        return true;
    }

    public final d getCallerFrame() {
        pd.d<T> dVar = this.f8264c;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public void k0(Object obj) {
        this.f8264c.resumeWith(c.j0(obj));
    }

    public void s(Object obj) {
        b.e0(c.Y(this.f8264c), c.j0(obj), (l) null);
    }
}
