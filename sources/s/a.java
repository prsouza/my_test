package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import s.f;

public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: w  reason: collision with root package name */
    public f<K, V> f10804w;

    /* renamed from: s.a$a  reason: collision with other inner class name */
    public class C0211a extends f<K, V> {
        public C0211a() {
        }

        public final void a() {
            a.this.clear();
        }

        public final Object b(int i, int i10) {
            return a.this.f10842b[(i << 1) + i10];
        }

        public final Map<K, V> c() {
            return a.this;
        }

        public final int d() {
            return a.this.f10843c;
        }

        public final int e(Object obj) {
            return a.this.f(obj);
        }

        public final int f(Object obj) {
            return a.this.h(obj);
        }

        public final void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        public final void h(int i) {
            a.this.k(i);
        }

        public final V i(int i, V v10) {
            return a.this.l(i, v10);
        }
    }

    public a() {
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        f n10 = n();
        if (n10.f10822a == null) {
            n10.f10822a = new f.b();
        }
        return n10.f10822a;
    }

    public final Set<K> keySet() {
        f n10 = n();
        if (n10.f10823b == null) {
            n10.f10823b = new f.c();
        }
        return n10.f10823b;
    }

    public final f<K, V> n() {
        if (this.f10804w == null) {
            this.f10804w = new C0211a();
        }
        return this.f10804w;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        c(map.size() + this.f10843c);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final Collection<V> values() {
        f n10 = n();
        if (n10.f10824c == null) {
            n10.f10824c = new f.e();
        }
        return n10.f10824c;
    }

    public a(int i) {
        super(i);
    }

    public a(g gVar) {
        if (gVar != null) {
            j(gVar);
        }
    }
}
