package ge;

import a.b;
import ad.c;
import e6.e;
import ge.g1;
import pd.d;
import pd.f;
import xd.l;

public abstract class a<T> extends l1 implements d<T>, d0 {

    /* renamed from: b  reason: collision with root package name */
    public final f f5361b;

    public a(f fVar, boolean z) {
        super(z);
        P((g1) fVar.get(g1.b.f5401a));
        this.f5361b = fVar.plus(this);
    }

    public final void N(Throwable th2) {
        g.a(this.f5361b, th2);
    }

    public String W() {
        return super.W();
    }

    public final void Z(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            l0(tVar.f5447a, tVar.a());
            return;
        }
        m0(obj);
    }

    public boolean a() {
        return super.a();
    }

    public final f f() {
        return this.f5361b;
    }

    public final f getContext() {
        return this.f5361b;
    }

    public void k0(Object obj) {
        s(obj);
    }

    public void l0(Throwable th2, boolean z) {
    }

    public void m0(T t10) {
    }

    public final void resumeWith(Object obj) {
        Object V = V(c.B0(obj, (l) null));
        if (V != b.f5s) {
            k0(V);
        }
    }

    public final String z() {
        return e.a0(getClass().getSimpleName(), " was cancelled");
    }
}
