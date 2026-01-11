package re;

import c3.k;
import e6.e;
import java.util.HashSet;
import java.util.Set;
import oe.b;

public final class y<E> extends i0<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final x f10761b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(b<E> bVar) {
        super(bVar, (k) null);
        e.D(bVar, "eSerializer");
        this.f10761b = new x(bVar.a());
    }

    public final pe.e a() {
        return this.f10761b;
    }

    public final Object c() {
        return new HashSet();
    }

    public final int d(Object obj) {
        HashSet hashSet = (HashSet) obj;
        e.D(hashSet, "$this$builderSize");
        return hashSet.size();
    }

    public final Object g(Object obj) {
        e.D((Object) null, "$this$toBuilder");
        throw null;
    }

    public final Object h(Object obj) {
        HashSet hashSet = (HashSet) obj;
        e.D(hashSet, "$this$toResult");
        return hashSet;
    }

    public final void i(Object obj, int i, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        e.D(hashSet, "$this$insert");
        hashSet.add(obj2);
    }
}
