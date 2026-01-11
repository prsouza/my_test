package i7;

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

public class i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f6280w = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f6281a;

    /* renamed from: b  reason: collision with root package name */
    public List<i1<K, V>.d> f6282b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f6283c = Collections.emptyMap();

    /* renamed from: s  reason: collision with root package name */
    public boolean f6284s;

    /* renamed from: t  reason: collision with root package name */
    public volatile i1<K, V>.f f6285t;

    /* renamed from: u  reason: collision with root package name */
    public Map<K, V> f6286u = Collections.emptyMap();

    /* renamed from: v  reason: collision with root package name */
    public volatile i1<K, V>.b f6287v;

    public class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public int f6288a;

        /* renamed from: b  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f6289b;

        public a() {
            this.f6288a = i1.this.f6282b.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f6289b == null) {
                this.f6289b = i1.this.f6286u.entrySet().iterator();
            }
            return this.f6289b;
        }

        public final boolean hasNext() {
            int i = this.f6288a;
            return (i > 0 && i <= i1.this.f6282b.size()) || a().hasNext();
        }

        public final Object next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List<i1<K, V>.d> list = i1.this.f6282b;
            int i = this.f6288a - 1;
            this.f6288a = i;
            return list.get(i);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b extends i1<K, V>.f {
        public b() {
            super();
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f6292a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable<Object> f6293b = new b();

        public class a implements Iterator<Object> {
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

        public class b implements Iterable<Object> {
            public final Iterator<Object> iterator() {
                return c.f6292a;
            }
        }
    }

    public class e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public int f6297a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6298b;

        /* renamed from: c  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f6299c;

        public e() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f6299c == null) {
                this.f6299c = i1.this.f6283c.entrySet().iterator();
            }
            return this.f6299c;
        }

        public final boolean hasNext() {
            if (this.f6297a + 1 < i1.this.f6282b.size()) {
                return true;
            }
            if (i1.this.f6283c.isEmpty() || !a().hasNext()) {
                return false;
            }
            return true;
        }

        public final Object next() {
            this.f6298b = true;
            int i = this.f6297a + 1;
            this.f6297a = i;
            if (i < i1.this.f6282b.size()) {
                return i1.this.f6282b.get(this.f6297a);
            }
            return (Map.Entry) a().next();
        }

        public final void remove() {
            if (this.f6298b) {
                this.f6298b = false;
                i1 i1Var = i1.this;
                int i = i1.f6280w;
                i1Var.c();
                if (this.f6297a < i1.this.f6282b.size()) {
                    i1 i1Var2 = i1.this;
                    int i10 = this.f6297a;
                    this.f6297a = i10 - 1;
                    i1Var2.j(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            i1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            i1.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i1.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return i1.this.size();
        }
    }

    public i1(int i) {
        this.f6281a = i;
    }

    public final int a(K k10) {
        int size = this.f6282b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f6282b.get(size).f6294a);
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
            int compareTo2 = k10.compareTo(this.f6282b.get(i10).f6294a);
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

    public final void c() {
        if (this.f6284s) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        c();
        if (!this.f6282b.isEmpty()) {
            this.f6282b.clear();
        }
        if (!this.f6283c.isEmpty()) {
            this.f6283c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f6283c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i) {
        return this.f6282b.get(i);
    }

    public final int e() {
        return this.f6282b.size();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f6285t == null) {
            this.f6285t = new f();
        }
        return this.f6285t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return super.equals(obj);
        }
        i1 i1Var = (i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int e10 = e();
        if (e10 != i1Var.e()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i = 0; i < e10; i++) {
            if (!d(i).equals(i1Var.d(i))) {
                return false;
            }
        }
        if (e10 != size) {
            return this.f6283c.equals(i1Var.f6283c);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        if (this.f6283c.isEmpty()) {
            return c.f6293b;
        }
        return this.f6283c.entrySet();
    }

    public final SortedMap<K, V> g() {
        c();
        if (this.f6283c.isEmpty() && !(this.f6283c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6283c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f6286u = treeMap.descendingMap();
        }
        return (SortedMap) this.f6283c;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f6282b.get(a10).f6295b;
        }
        return this.f6283c.get(comparable);
    }

    public void h() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f6284s) {
            if (this.f6283c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f6283c);
            }
            this.f6283c = map;
            if (this.f6286u.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f6286u);
            }
            this.f6286u = map2;
            this.f6284s = true;
        }
    }

    public final int hashCode() {
        int e10 = e();
        int i = 0;
        for (int i10 = 0; i10 < e10; i10++) {
            i += this.f6282b.get(i10).hashCode();
        }
        return this.f6283c.size() > 0 ? i + this.f6283c.hashCode() : i;
    }

    /* renamed from: i */
    public final V put(K k10, V v10) {
        c();
        int a10 = a(k10);
        if (a10 >= 0) {
            return this.f6282b.get(a10).setValue(v10);
        }
        c();
        if (this.f6282b.isEmpty() && !(this.f6282b instanceof ArrayList)) {
            this.f6282b = new ArrayList(this.f6281a);
        }
        int i = -(a10 + 1);
        if (i >= this.f6281a) {
            return g().put(k10, v10);
        }
        int size = this.f6282b.size();
        int i10 = this.f6281a;
        if (size == i10) {
            d remove = this.f6282b.remove(i10 - 1);
            g().put(remove.f6294a, remove.f6295b);
        }
        this.f6282b.add(i, new d(k10, v10));
        return null;
    }

    public final V j(int i) {
        c();
        V v10 = this.f6282b.remove(i).f6295b;
        if (!this.f6283c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.f6282b.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return v10;
    }

    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return j(a10);
        }
        if (this.f6283c.isEmpty()) {
            return null;
        }
        return this.f6283c.remove(comparable);
    }

    public final int size() {
        return this.f6283c.size() + this.f6282b.size();
    }

    public class d implements Map.Entry<K, V>, Comparable<i1<K, V>.d> {

        /* renamed from: a  reason: collision with root package name */
        public final K f6294a;

        /* renamed from: b  reason: collision with root package name */
        public V f6295b;

        public d(i1 i1Var, Map.Entry<K, V> entry) {
            V value = entry.getValue();
            i1.this = i1Var;
            this.f6294a = (Comparable) entry.getKey();
            this.f6295b = value;
        }

        public final int compareTo(Object obj) {
            return this.f6294a.compareTo(((d) obj).f6294a);
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f6294a;
            Object key = entry.getKey();
            if (k10 == null) {
                z = key == null;
            } else {
                z = k10.equals(key);
            }
            if (z) {
                V v10 = this.f6295b;
                Object value = entry.getValue();
                if (v10 == null) {
                    z10 = value == null;
                } else {
                    z10 = v10.equals(value);
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f6294a;
        }

        public final V getValue() {
            return this.f6295b;
        }

        public final int hashCode() {
            K k10 = this.f6294a;
            int i = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f6295b;
            if (v10 != null) {
                i = v10.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v10) {
            i1 i1Var = i1.this;
            int i = i1.f6280w;
            i1Var.c();
            V v11 = this.f6295b;
            this.f6295b = v10;
            return v11;
        }

        public final String toString() {
            return this.f6294a + "=" + this.f6295b;
        }

        public d(K k10, V v10) {
            this.f6294a = k10;
            this.f6295b = v10;
        }
    }
}
