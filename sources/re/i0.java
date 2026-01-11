package re;

import c3.k;
import oe.b;
import pe.e;
import qe.a;

public abstract class i0<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    public final b<Element> f10709a;

    public i0(b bVar, k kVar) {
        this.f10709a = bVar;
    }

    public abstract e a();

    public void f(a aVar, int i, Builder builder, boolean z) {
        i(builder, i, aVar.u(a(), i, this.f10709a));
    }

    public abstract void i(Builder builder, int i, Element element);
}
