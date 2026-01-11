package je;

import ie.n;
import ke.e;
import md.m;
import pd.f;
import pd.h;
import qd.a;
import xd.p;

public class d<T> extends e<T> {

    /* renamed from: s  reason: collision with root package name */
    public final p<n<? super T>, pd.d<? super m>, Object> f7203s;

    public d(p pVar) {
        super(h.f9881a, -2, ie.d.SUSPEND);
        this.f7203s = pVar;
    }

    public Object d(n<? super T> nVar, pd.d<? super m> dVar) {
        Object invoke = this.f7203s.invoke(nVar, dVar);
        return invoke == a.COROUTINE_SUSPENDED ? invoke : m.f8555a;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("block[");
        d10.append(this.f7203s);
        d10.append("] -> ");
        d10.append(super.toString());
        return d10.toString();
    }

    public d(p<? super n<? super T>, ? super pd.d<? super m>, ? extends Object> pVar, f fVar, int i, ie.d dVar) {
        super(fVar, i, dVar);
        this.f7203s = pVar;
    }
}
