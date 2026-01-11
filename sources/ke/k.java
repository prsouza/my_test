package ke;

import ie.t;
import je.f;
import md.m;
import pd.d;
import qd.a;

public final class k<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final t<T> f7527a;

    public k(t<? super T> tVar) {
        this.f7527a = tVar;
    }

    public final Object a(T t10, d<? super m> dVar) {
        Object h10 = this.f7527a.h(t10, dVar);
        if (h10 == a.COROUTINE_SUSPENDED) {
            return h10;
        }
        return m.f8555a;
    }
}
