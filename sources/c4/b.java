package c4;

import s.a;
import s.g;

public final class b<K, V> extends a<K, V> {

    /* renamed from: x  reason: collision with root package name */
    public int f3225x;

    public final void clear() {
        this.f3225x = 0;
        super.clear();
    }

    public final int hashCode() {
        if (this.f3225x == 0) {
            this.f3225x = super.hashCode();
        }
        return this.f3225x;
    }

    public final void j(g<? extends K, ? extends V> gVar) {
        this.f3225x = 0;
        super.j(gVar);
    }

    public final V k(int i) {
        this.f3225x = 0;
        return super.k(i);
    }

    public final V l(int i, V v10) {
        this.f3225x = 0;
        return super.l(i, v10);
    }

    public final V put(K k10, V v10) {
        this.f3225x = 0;
        return super.put(k10, v10);
    }
}
