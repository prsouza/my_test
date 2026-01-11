package re;

import c3.k;
import e6.e;
import java.util.HashMap;
import java.util.Map;
import oe.b;

public final class w<K, V> extends o0<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public final v f10757c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(b<K> bVar, b<V> bVar2) {
        super(bVar, bVar2, (k) null);
        e.D(bVar, "kSerializer");
        e.D(bVar2, "vSerializer");
        this.f10757c = new v(bVar.a(), bVar2.a());
    }

    public final pe.e a() {
        return this.f10757c;
    }

    public final Object c() {
        return new HashMap();
    }

    public final int d(Object obj) {
        HashMap hashMap = (HashMap) obj;
        e.D(hashMap, "$this$builderSize");
        return hashMap.size();
    }

    public final Object g(Object obj) {
        e.D((Object) null, "$this$toBuilder");
        throw null;
    }

    public final Object h(Object obj) {
        HashMap hashMap = (HashMap) obj;
        e.D(hashMap, "$this$toResult");
        return hashMap;
    }
}
