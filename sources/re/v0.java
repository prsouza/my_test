package re;

import c3.k;
import oe.b;
import pe.e;
import re.t0;

public abstract class v0<Element, Array, Builder extends t0<Array>> extends i0<Element, Array, Builder> {

    /* renamed from: b  reason: collision with root package name */
    public final u0 f10756b;

    public v0(b<Element> bVar) {
        super(bVar, (k) null);
        this.f10756b = new u0(bVar.a());
    }

    public final e a() {
        return this.f10756b;
    }

    public final Array b(qe.b bVar) {
        e6.e.D(bVar, "decoder");
        return e(bVar);
    }

    public final Object c() {
        return (t0) g(j());
    }

    public final int d(Object obj) {
        t0 t0Var = (t0) obj;
        e6.e.D(t0Var, "$this$builderSize");
        return t0Var.d();
    }

    public final Object h(Object obj) {
        t0 t0Var = (t0) obj;
        e6.e.D(t0Var, "$this$toResult");
        return t0Var.a();
    }

    public final void i(Object obj, int i, Object obj2) {
        e6.e.D((t0) obj, "$this$insert");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Array j();
}
