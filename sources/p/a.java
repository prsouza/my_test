package p;

import java.util.HashMap;
import p.b;

public final class a<K, V> extends b<K, V> {

    /* renamed from: t  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f9466t = new HashMap<>();

    public final b.c<K, V> b(K k10) {
        return this.f9466t.get(k10);
    }

    public final boolean contains(K k10) {
        return this.f9466t.containsKey(k10);
    }

    public final V g(K k10, V v10) {
        b.c b10 = b(k10);
        if (b10 != null) {
            return b10.f9472b;
        }
        this.f9466t.put(k10, e(k10, v10));
        return null;
    }

    public final V h(K k10) {
        V h10 = super.h(k10);
        this.f9466t.remove(k10);
        return h10;
    }
}
