package re;

import c3.k;
import e6.e;
import java.util.LinkedHashSet;
import java.util.Set;
import oe.b;

public final class g0<E> extends i0<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final f0 f10699b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(b<E> bVar) {
        super(bVar, (k) null);
        e.D(bVar, "eSerializer");
        this.f10699b = new f0(bVar.a());
    }

    public final pe.e a() {
        return this.f10699b;
    }

    public final Object c() {
        return new LinkedHashSet();
    }

    public final int d(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        e.D(linkedHashSet, "$this$builderSize");
        return linkedHashSet.size();
    }

    public final Object g(Object obj) {
        e.D((Object) null, "$this$toBuilder");
        throw null;
    }

    public final Object h(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        e.D(linkedHashSet, "$this$toResult");
        return linkedHashSet;
    }

    public final void i(Object obj, int i, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        e.D(linkedHashSet, "$this$insert");
        linkedHashSet.add(obj2);
    }
}
