package nd;

import aa.b;
import e6.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import md.f;

public class x extends b {
    public static final Object t0(Map map, Object obj) {
        e.D(map, "<this>");
        if (map instanceof w) {
            return ((w) map).b();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final Map u0(f... fVarArr) {
        if (fVarArr.length <= 0) {
            return p.f8967a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.P(fVarArr.length));
        for (f fVar : fVarArr) {
            linkedHashMap.put(fVar.f8541a, fVar.f8542b);
        }
        return linkedHashMap;
    }

    public static final Map v0(Iterable iterable) {
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p.f8967a;
        }
        if (size == 1) {
            return b.Q((f) ((List) iterable).get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.P(collection.size()));
        w0(iterable, linkedHashMap);
        return linkedHashMap;
    }

    public static final Map w0(Iterable iterable, Map map) {
        Iterator it = ((ArrayList) iterable).iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            map.put(fVar.f8541a, fVar.f8542b);
        }
        return map;
    }

    public static final Map x0(Map map) {
        int size = map.size();
        if (size == 0) {
            return p.f8967a;
        }
        if (size != 1) {
            return y0(map);
        }
        return b.r0(map);
    }

    public static final Map y0(Map map) {
        e.D(map, "<this>");
        return new LinkedHashMap(map);
    }
}
