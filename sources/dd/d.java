package dd;

import ca.b;
import ca.c;
import ca.e;
import dd.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class d<S extends d<S>> implements ca.d<a<S>>, e<a<S>> {

    /* renamed from: a  reason: collision with root package name */
    public final List<b<?>> f4454a = new ArrayList();

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<dd.b<?>>, java.util.ArrayList] */
    public final a<S> a(b bVar) {
        e6.e.D(bVar, "reader");
        a<S> aVar = new a<>(this);
        Iterator it = this.f4454a.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            aVar.f4446a.put(bVar2, bVar2.f4449a.g(bVar));
        }
        return aVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<dd.b<?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.LinkedHashMap, java.util.Map<dd.b<?>, java.lang.Object>] */
    /* renamed from: c */
    public final void b(c cVar, a<S> aVar) {
        e6.e.D(cVar, "writer");
        e6.e.D(aVar, "struct");
        Iterator it = this.f4454a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            Object obj = aVar.f4446a.get(bVar);
            android.support.v4.media.b bVar2 = bVar.f4449a;
            Objects.requireNonNull(bVar2, "null cannot be cast to non-null type jp.co.soramitsu.fearless_utils.scale.dataType.DataType<kotlin.Any?>");
            bVar2.b(cVar, obj);
        }
    }
}
