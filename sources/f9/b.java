package f9;

import e6.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f5023a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<String>> f5024b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Map<String, String>> f5025c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, String> f5026a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, ArrayList<String>> f5027b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        public final HashMap<String, HashMap<String, String>> f5028c = new HashMap<>();
    }

    public b(Map<String, String> map, Map<String, ? extends List<String>> map2, Map<String, ? extends Map<String, String>> map3) {
        e.D(map, "strings");
        e.D(map2, "arrays");
        e.D(map3, "plurals");
        this.f5023a = map;
        this.f5024b = map2;
        this.f5025c = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e.r(this.f5023a, bVar.f5023a) && e.r(this.f5024b, bVar.f5024b) && e.r(this.f5025c, bVar.f5025c);
    }

    public final int hashCode() {
        Map<String, String> map = this.f5023a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, List<String>> map2 = this.f5024b;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, Map<String, String>> map3 = this.f5025c;
        if (map3 != null) {
            i = map3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("PhraseData(strings=");
        d10.append(this.f5023a);
        d10.append(", arrays=");
        d10.append(this.f5024b);
        d10.append(", plurals=");
        d10.append(this.f5025c);
        d10.append(")");
        return d10.toString();
    }
}
