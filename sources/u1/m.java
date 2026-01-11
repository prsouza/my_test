package u1;

import f2.a;
import f2.c;
import ge.g1;
import ge.l1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import z6.a;

public final class m<R> implements a<R> {

    /* renamed from: a  reason: collision with root package name */
    public final g1 f11645a;

    /* renamed from: b  reason: collision with root package name */
    public final c<R> f11646b;

    public m(g1 g1Var) {
        c<R> cVar = new c<>();
        this.f11645a = g1Var;
        this.f11646b = cVar;
        ((l1) g1Var).Q(new l(this));
    }

    public final boolean cancel(boolean z) {
        return this.f11646b.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.f11646b.d(runnable, executor);
    }

    public final R get() {
        return this.f11646b.get();
    }

    public final R get(long j10, TimeUnit timeUnit) {
        return this.f11646b.get(j10, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f11646b.f4914a instanceof a.b;
    }

    public final boolean isDone() {
        return this.f11646b.isDone();
    }
}
