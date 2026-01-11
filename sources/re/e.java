package re;

import c3.k;
import java.util.ArrayList;
import java.util.List;
import oe.b;

public final class e<E> extends i0<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final d f10687b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(b<E> bVar) {
        super(bVar, (k) null);
        e6.e.D(bVar, "element");
        this.f10687b = new d(bVar.a());
    }

    public final pe.e a() {
        return this.f10687b;
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
        return arrayList;
    }

    public final void i(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        e6.e.D(arrayList, "$this$insert");
        arrayList.add(i, obj2);
    }
}
