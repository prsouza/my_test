package ie;

import ge.g0;
import ge.k;
import l6.b1;
import le.r;
import md.m;

public class u<E> extends s {

    /* renamed from: s  reason: collision with root package name */
    public final E f6440s;

    /* renamed from: t  reason: collision with root package name */
    public final k<m> f6441t;

    public u(E e10, k<? super m> kVar) {
        this.f6440s = e10;
        this.f6441t = kVar;
    }

    public final r A() {
        if (this.f6441t.g() == null) {
            return null;
        }
        return c3.k.B;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + g0.o(this) + '(' + this.f6440s + ')';
    }

    public final void x() {
        this.f6441t.d();
    }

    public final E y() {
        return this.f6440s;
    }

    public final void z(h<?> hVar) {
        this.f6441t.resumeWith(b1.k(hVar.C()));
    }
}
