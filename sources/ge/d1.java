package ge;

import a.a;
import md.m;
import xd.l;

public final class d1 extends i {

    /* renamed from: a  reason: collision with root package name */
    public final l<Throwable, m> f5380a;

    public d1(l<? super Throwable, m> lVar) {
        this.f5380a = lVar;
    }

    public final void a(Throwable th2) {
        this.f5380a.k(th2);
    }

    public final Object k(Object obj) {
        this.f5380a.k((Throwable) obj);
        return m.f8555a;
    }

    public final String toString() {
        StringBuilder d10 = a.d("InvokeOnCancel[");
        d10.append(g0.n(this.f5380a));
        d10.append('@');
        d10.append(g0.o(this));
        d10.append(']');
        return d10.toString();
    }
}
