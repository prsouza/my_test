package re;

import c3.k;
import de.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import pe.e;

public final class y0<ElementKlass, Element extends ElementKlass> extends i0<Element, Element[], ArrayList<Element>> {

    /* renamed from: b  reason: collision with root package name */
    public final c f10762b;

    /* renamed from: c  reason: collision with root package name */
    public final b<ElementKlass> f10763c;

    public y0(b<ElementKlass> bVar, oe.b<Element> bVar2) {
        super(bVar2, (k) null);
        this.f10763c = bVar;
        this.f10762b = new c(bVar2.a());
    }

    public final e a() {
        return this.f10762b;
    }

    public final Object c() {
        return new ArrayList();
    }

    public final int d(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        e6.e.D(arrayList, "$this$builderSize");
        return arrayList.size();
    }

    public final Object g(Object obj) {
        e6.e.D((Object) null, "$this$toBuilder");
        throw null;
    }

    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        e6.e.D(arrayList, "$this$toResult");
        b<ElementKlass> bVar = this.f10763c;
        e6.e.D(bVar, "eClass");
        Object newInstance = Array.newInstance(aa.b.G(bVar), arrayList.size());
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        e6.e.C(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }

    public final void i(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        e6.e.D(arrayList, "$this$insert");
        arrayList.add(i, obj2);
    }
}
