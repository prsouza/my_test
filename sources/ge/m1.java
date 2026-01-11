package ge;

import aa.b;
import ad.c;
import l6.b1;
import md.m;
import pd.d;
import pd.f;
import xd.l;
import xd.p;

public final class m1 extends v1 {

    /* renamed from: c  reason: collision with root package name */
    public final d<m> f5431c;

    public m1(f fVar, p<? super d0, ? super d<? super m>, ? extends Object> pVar) {
        super(fVar, false);
        this.f5431c = c.C(pVar, this, this);
    }

    public final void c0() {
        try {
            b.e0(c.Y(this.f5431c), m.f8555a, (l) null);
        } catch (Throwable th2) {
            resumeWith(b1.k(th2));
            throw th2;
        }
    }
}
