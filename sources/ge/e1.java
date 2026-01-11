package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import md.m;
import xd.l;

public final class e1 extends i1 {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5385u = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: t  reason: collision with root package name */
    public final l<Throwable, m> f5386t;

    public e1(l<? super Throwable, m> lVar) {
        this.f5386t = lVar;
    }

    public final /* bridge */ /* synthetic */ Object k(Object obj) {
        x((Throwable) obj);
        return m.f8555a;
    }

    public final void x(Throwable th2) {
        if (f5385u.compareAndSet(this, 0, 1)) {
            this.f5386t.k(th2);
        }
    }
}
