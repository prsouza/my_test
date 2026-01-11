package d5;

import android.util.SparseArray;
import b9.m;
import java.util.HashMap;
import q4.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<d> f4338a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<d, Integer> f4339b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f4339b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f4339b.put(d.VERY_LOW, 1);
        f4339b.put(d.HIGHEST, 2);
        for (d next : f4339b.keySet()) {
            f4338a.append(f4339b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f4339b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = f4338a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(m.b("Unknown Priority for value ", i));
    }
}
