package lc;

import e6.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import mc.b;
import qc.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8218a = new a();

    /* renamed from: lc.a$a  reason: collision with other inner class name */
    public static final class C0146a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Object> f8219a;

        /* renamed from: b  reason: collision with root package name */
        public final b f8220b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, d> f8221c;

        public C0146a(Map<String, ? extends Object> map, b bVar, Map<String, d> map2) {
            e.D(map, "types");
            this.f8219a = map;
            this.f8220b = bVar;
            this.f8221c = map2;
        }
    }

    public static d b(a aVar, C0146a aVar2, String str) {
        Objects.requireNonNull(aVar);
        d dVar = aVar2.f8221c.get(str);
        if (dVar == null) {
            qc.a<?, ?> a10 = aVar2.f8220b.a(str, str, new b(aVar2));
            dVar = a10 != null ? new d(a10) : null;
        }
        if (dVar != null) {
            return dVar;
        }
        Map<String, d> map = aVar2.f8221c;
        e.D(map, "$this$create");
        e.D(str, "definition");
        d dVar2 = new d((qc.a<?, ?>) null);
        map.put(str, dVar2);
        return dVar2;
    }

    public final LinkedHashMap<String, d> a(C0146a aVar, List<? extends List<String>> list) {
        LinkedHashMap<String, d> linkedHashMap = new LinkedHashMap<>();
        for (List list2 : list) {
            linkedHashMap.put((String) list2.get(0), b(this, aVar, (String) list2.get(1)));
        }
        return linkedHashMap;
    }
}
