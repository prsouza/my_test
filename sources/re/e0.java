package re;

import c3.k;
import e6.e;
import java.util.LinkedHashMap;
import java.util.Map;
import oe.b;

public final class e0<K, V> extends o0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public final d0 f10688c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(b<K> bVar, b<V> bVar2) {
        super(bVar, bVar2, (k) null);
        e.D(bVar, "kSerializer");
        e.D(bVar2, "vSerializer");
        this.f10688c = new d0(bVar.a(), bVar2.a());
    }

    public final pe.e a() {
        return this.f10688c;
    }

    public final Object c() {
        return new LinkedHashMap();
    }

    public final int d(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        e.D(linkedHashMap, "$this$builderSize");
        return linkedHashMap.size();
    }

    public final Object g(Object obj) {
        e.D((Object) null, "$this$toBuilder");
        throw null;
    }

    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        e.D(linkedHashMap, "$this$toResult");
        return linkedHashMap;
    }
}
