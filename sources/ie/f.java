package ie;

import ge.a;
import ge.h1;
import ge.l1;
import ge.t;
import java.util.concurrent.CancellationException;
import md.m;
import pd.d;

public class f<E> extends a<m> implements e<E> {

    /* renamed from: c  reason: collision with root package name */
    public final e<E> f6433c;

    public f(pd.f fVar, e eVar) {
        super(fVar, true);
        this.f6433c = eVar;
    }

    public final boolean b(Throwable th2) {
        return this.f6433c.b(th2);
    }

    public final void c(CancellationException cancellationException) {
        Object L = L();
        if (!((L instanceof t) || ((L instanceof l1.b) && ((l1.b) L).e()))) {
            if (cancellationException == null) {
                cancellationException = new h1(z(), (Throwable) null, this);
            }
            CancellationException h02 = h0(cancellationException, (String) null);
            this.f6433c.c(h02);
            u(h02);
        }
    }

    public final Object h(E e10, d<? super m> dVar) {
        return this.f6433c.h(e10, dVar);
    }

    public final Object j(d<? super E> dVar) {
        return this.f6433c.j(dVar);
    }

    public final Object k(E e10) {
        return this.f6433c.k(e10);
    }

    public final boolean n() {
        return this.f6433c.n();
    }

    public final Object p(d<? super g<? extends E>> dVar) {
        Object p10 = this.f6433c.p(dVar);
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        return p10;
    }

    public final void v(Throwable th2) {
        CancellationException h02 = h0(th2, (String) null);
        this.f6433c.c(h02);
        u(h02);
    }
}
