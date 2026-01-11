package zb;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class g0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f14288u = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f14289a;

    /* renamed from: b  reason: collision with root package name */
    public List<g0<K, V>.b> f14290b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f14291c = Collections.emptyMap();

    /* renamed from: s  reason: collision with root package name */
    public boolean f14292s;

    /* renamed from: t  reason: collision with root package name */
    public volatile g0<K, V>.d f14293t;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f14294a = new C0286a();

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable<Object> f14295b = new b();

        /* renamed from: zb.g0$a$a  reason: collision with other inner class name */
        public static class C0286a implements Iterator<Object> {
            public final boolean hasNext() {
                return false;
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable<Object> {
            public final Iterator<Object> iterator() {
                return a.f14294a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<g0<K, V>.b> {

        /* renamed from: a  reason: collision with root package name */
        public final K f14296a;

        /* renamed from: b  reason: collision with root package name */
        public V f14297b;

        public b(K k10, V v10) {
            this.f14296a = k10;
            this.f14297b = v10;
        }

        public final int compareTo(Object obj) {
            return this.f14296a.compareTo(((b) obj).f14296a);
        }

        public final boolean equals(Object obj) {
            boolean z;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f14296a;
            Object key = entry.getKey();
            if (k10 == null ? key == null : k10.equals(key)) {
                V v10 = this.f14297b;
                Object value = entry.getValue();
                if (v10 == null) {
                    z = value == null;
                } else {
                    z = v10.equals(value);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f14296a;
        }

        public final V getValue() {
            return this.f14297b;
        }

        public final int hashCode() {
            K k10 = this.f14296a;
            int i = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f14297b;
            if (v10 != null) {
                i = v10.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v10) {
            g0 g0Var = g0.this;
            int i = g0.f14288u;
            g0Var.e();
            V v11 = this.f14297b;
            this.f14297b = v10;
            return v11;
        }

        public final String toString() {
            return this.f14296a + "=" + this.f14297b;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public int f14299a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f14300b;

        /* renamed from: c  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f14301c;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f14301c == null) {
                this.f14301c = g0.this.f14291c.entrySet().iterator();
            }
            return this.f14301c;
        }

        public final boolean hasNext() {
            if (this.f14299a + 1 < g0.this.f14290b.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        public final Object next() {
            this.f14300b = true;
            int i = this.f14299a + 1;
            this.f14299a = i;
            return (Map.Entry) (i < g0.this.f14290b.size() ? g0.this.f14290b.get(this.f14299a) : a().next());
        }

        public final void remove() {
            if (this.f14300b) {
                this.f14300b = false;
                g0 g0Var = g0.this;
                int i = g0.f14288u;
                g0Var.e();
                if (this.f14299a < g0.this.f14290b.size()) {
                    g0 g0Var2 = g0.this;
                    int i10 = this.f14299a;
                    this.f14299a = i10 - 1;
                    g0Var2.g(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            g0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            g0.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = g0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            g0.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return g0.this.size();
        }
    }

    public g0(int i) {
        this.f14289a = i;
    }

    public final int a(K k10) {
        int size = this.f14290b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f14290b.get(size).f14296a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i10 = (i + size) / 2;
            int compareTo2 = k10.compareTo(this.f14290b.get(i10).f14296a);
            if (compareTo2 < 0) {
                size = i10 - 1;
            } else if (compareTo2 <= 0) {
                return i10;
            } else {
                i = i10 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: c */
    public final V put(K k10, V v10) {
        e();
        int a10 = a(k10);
        if (a10 >= 0) {
            b bVar = this.f14290b.get(a10);
            g0.this.e();
            V v11 = bVar.f14297b;
            bVar.f14297b = v10;
            return v11;
        }
        e();
        if (this.f14290b.isEmpty() && !(this.f14290b instanceof ArrayList)) {
            this.f14290b = new ArrayList(this.f14289a);
        }
        int i = -(a10 + 1);
        if (i >= this.f14289a) {
            return h().put(k10, v10);
        }
        int size = this.f14290b.size();
        int i10 = this.f14289a;
        if (size == i10) {
            b remove = this.f14290b.remove(i10 - 1);
            h().put(remove.f14296a, remove.f14297b);
        }
        this.f14290b.add(i, new b(k10, v10));
        return null;
    }

    public final void clear() {
        e();
        if (!this.f14290b.isEmpty()) {
            this.f14290b.clear();
        }
        if (!this.f14291c.isEmpty()) {
            this.f14291c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f14291c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i) {
        return this.f14290b.get(i);
    }

    public final void e() {
        if (this.f14292s) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f14293t == null) {
            this.f14293t = new d();
        }
        return this.f14293t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        int size = size();
        if (size != g0Var.size()) {
            return false;
        }
        int size2 = this.f14290b.size();
        if (size2 != g0Var.f14290b.size()) {
            return ((AbstractSet) entrySet()).equals(g0Var.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!d(i).equals(g0Var.d(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f14291c.equals(g0Var.f14291c);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.f14291c.isEmpty() ? a.f14295b : this.f14291c.entrySet();
    }

    public final V g(int i) {
        e();
        V v10 = this.f14290b.remove(i).f14297b;
        if (!this.f14291c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            List<g0<K, V>.b> list = this.f14290b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new b((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v10;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f14290b.get(a10).f14297b;
        }
        return this.f14291c.get(comparable);
    }

    public final SortedMap<K, V> h() {
        e();
        if (this.f14291c.isEmpty() && !(this.f14291c instanceof TreeMap)) {
            this.f14291c = new TreeMap();
        }
        return (SortedMap) this.f14291c;
    }

    public final int hashCode() {
        int size = this.f14290b.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += this.f14290b.get(i10).hashCode();
        }
        return this.f14291c.size() > 0 ? i + this.f14291c.hashCode() : i;
    }

    public void i() {
        if (!this.f14292s) {
            this.f14291c = this.f14291c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14291c);
            this.f14292s = true;
        }
    }

    public final V remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return g(a10);
        }
        if (this.f14291c.isEmpty()) {
            return null;
        }
        return this.f14291c.remove(comparable);
    }

    public final int size() {
        return this.f14291c.size() + this.f14290b.size();
    }
}
