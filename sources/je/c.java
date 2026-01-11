package je;

import ge.d0;
import ie.d;
import ie.n;
import ie.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ke.e;
import ke.k;
import md.m;
import pd.h;
import qd.a;

public final class c<T> extends e<T> {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7200u = AtomicIntegerFieldUpdater.newUpdater(c.class, "consumed");
    private volatile /* synthetic */ int consumed = 0;

    /* renamed from: s  reason: collision with root package name */
    public final p<T> f7201s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f7202t = false;

    public c(p pVar) {
        super(h.f9881a, -3, d.SUSPEND);
        this.f7201s = pVar;
    }

    public final Object b(f<? super T> fVar, pd.d<? super m> dVar) {
        if (this.f7513b == -3) {
            f();
            Object a10 = g.a(fVar, this.f7201s, this.f7202t, dVar);
            if (a10 == a.COROUTINE_SUSPENDED) {
                return a10;
            }
            return m.f8555a;
        }
        Object b10 = super.b(fVar, dVar);
        if (b10 == a.COROUTINE_SUSPENDED) {
            return b10;
        }
        return m.f8555a;
    }

    public final String c() {
        return e6.e.a0("channel=", this.f7201s);
    }

    public final Object d(n<? super T> nVar, pd.d<? super m> dVar) {
        Object a10 = g.a(new k(nVar), this.f7201s, this.f7202t, dVar);
        if (a10 == a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return m.f8555a;
    }

    public final p<T> e(d0 d0Var) {
        f();
        if (this.f7513b == -3) {
            return this.f7201s;
        }
        return super.e(d0Var);
    }

    public final void f() {
        if (this.f7202t) {
            boolean z = true;
            if (f7200u.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
