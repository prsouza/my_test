package ie;

import ge.g;
import ge.k;
import le.x;
import md.m;
import pd.f;
import xd.l;
import y.c;

public final class v<E> extends u<E> {

    /* renamed from: u  reason: collision with root package name */
    public final l<E, m> f6442u;

    public v(E e10, k<? super m> kVar, l<? super E, m> lVar) {
        super(e10, kVar);
        this.f6442u = lVar;
    }

    public final void B() {
        l<E, m> lVar = this.f6442u;
        E e10 = this.f6440s;
        f context = this.f6441t.getContext();
        x p10 = c.p(lVar, e10, (x) null);
        if (p10 != null) {
            g.a(context, p10);
        }
    }

    public final boolean u() {
        if (!super.u()) {
            return false;
        }
        B();
        return true;
    }
}
