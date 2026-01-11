package dd;

import dd.d;
import e6.e;
import ed.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a<S extends d<S>> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<b<?>, Object> f4446a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final List<b<?>> f4447b;

    /* renamed from: c  reason: collision with root package name */
    public final S f4448c;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<dd.b<?>>, java.util.ArrayList] */
    public a(S s10) {
        e.D(s10, "schema");
        this.f4448c = s10;
        ? r42 = s10.f4454a;
        this.f4447b = r42;
        ArrayList arrayList = new ArrayList();
        Iterator it = r42.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((b) next).f4450b != null) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            this.f4446a.put(bVar, bVar.f4450b);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<dd.b<?>, java.lang.Object>] */
    public final <T> T a(b<T> bVar) {
        e.D(bVar, "field");
        T t10 = this.f4446a.get(bVar);
        if (t10 != null) {
            return t10;
        }
        if (bVar.f4449a instanceof f) {
            return null;
        }
        throw new IllegalArgumentException("Non nullable value is not set");
    }
}
