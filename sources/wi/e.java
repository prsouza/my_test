package wi;

import aa.b;
import java.util.LinkedHashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, b> f12716a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Integer, d> f12717b;

    static {
        b[] values = b.values();
        int P = b.P(values.length);
        int i = 16;
        if (P < 16) {
            P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P);
        for (b bVar : values) {
            linkedHashMap.put(Integer.valueOf(bVar.f12705a), bVar);
        }
        f12716a = linkedHashMap;
        b[] values2 = b.values();
        int P2 = b.P(values2.length);
        if (P2 < 16) {
            P2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P2);
        for (b bVar2 : values2) {
            linkedHashMap2.put(bVar2.name(), bVar2);
        }
        d[] values3 = d.values();
        int P3 = b.P(values3.length);
        if (P3 < 16) {
            P3 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(P3);
        for (d dVar : values3) {
            linkedHashMap3.put(Integer.valueOf(dVar.f12715a), dVar);
        }
        f12717b = linkedHashMap3;
        d[] values4 = d.values();
        int P4 = b.P(values4.length);
        if (P4 >= 16) {
            i = P4;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(i);
        for (d dVar2 : values4) {
            linkedHashMap4.put(dVar2.name(), dVar2);
        }
    }
}
