package s;

import ge.g0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public f<K, V>.b f10822a;

    /* renamed from: b  reason: collision with root package name */
    public f<K, V>.c f10823b;

    /* renamed from: c  reason: collision with root package name */
    public f<K, V>.e f10824c;

    public final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f10825a;

        /* renamed from: b  reason: collision with root package name */
        public int f10826b;

        /* renamed from: c  reason: collision with root package name */
        public int f10827c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f10828s = false;

        public a(int i) {
            this.f10825a = i;
            this.f10826b = f.this.d();
        }

        public final boolean hasNext() {
            return this.f10827c < this.f10826b;
        }

        public final T next() {
            if (hasNext()) {
                T b10 = f.this.b(this.f10827c, this.f10825a);
                this.f10827c++;
                this.f10828s = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f10828s) {
                int i = this.f10827c - 1;
                this.f10827c = i;
                this.f10826b--;
                this.f10828s = false;
                f.this.h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = f.this.d();
            for (Map.Entry entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != f.this.d();
        }

        public final void clear() {
            f.this.a();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = f.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            return g0.m(f.this.b(e10, 1), entry.getValue());
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return f.j(this, obj);
        }

        public final int hashCode() {
            int i;
            int i10;
            int i11 = 0;
            for (int d10 = f.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = f.this.b(d10, 0);
                Object b11 = f.this.b(d10, 1);
                if (b10 == null) {
                    i = 0;
                } else {
                    i = b10.hashCode();
                }
                if (b11 == null) {
                    i10 = 0;
                } else {
                    i10 = b11.hashCode();
                }
                i11 += i ^ i10;
            }
            return i11;
        }

        public final boolean isEmpty() {
            return f.this.d() == 0;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return f.this.d();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public int f10832a;

        /* renamed from: b  reason: collision with root package name */
        public int f10833b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10834c = false;

        public d() {
            this.f10832a = f.this.d() - 1;
            this.f10833b = -1;
        }

        public final boolean equals(Object obj) {
            if (!this.f10834c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!g0.m(entry.getKey(), f.this.b(this.f10833b, 0)) || !g0.m(entry.getValue(), f.this.b(this.f10833b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public final K getKey() {
            if (this.f10834c) {
                return f.this.b(this.f10833b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f10834c) {
                return f.this.b(this.f10833b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f10833b < this.f10832a;
        }

        public final int hashCode() {
            int i;
            if (this.f10834c) {
                int i10 = 0;
                Object b10 = f.this.b(this.f10833b, 0);
                Object b11 = f.this.b(this.f10833b, 1);
                if (b10 == null) {
                    i = 0;
                } else {
                    i = b10.hashCode();
                }
                if (b11 != null) {
                    i10 = b11.hashCode();
                }
                return i ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final Object next() {
            if (hasNext()) {
                this.f10833b++;
                this.f10834c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f10834c) {
                f.this.h(this.f10833b);
                this.f10833b--;
                this.f10832a--;
                this.f10834c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v10) {
            if (this.f10834c) {
                return f.this.i(this.f10833b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i10);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v10);

    public abstract void h(int i);

    public abstract V i(int i, V v10);

    public final <T> T[] l(T[] tArr, int i) {
        int d10 = d();
        if (tArr.length < d10) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d10);
        }
        for (int i10 = 0; i10 < d10; i10++) {
            tArr[i10] = b(i10, i);
        }
        if (tArr.length > d10) {
            tArr[d10] = null;
        }
        return tArr;
    }

    public final class c implements Set<K> {
        public c() {
        }

        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            f.this.a();
        }

        public final boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map c10 = f.this.c();
            for (Object containsKey : collection) {
                if (!c10.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return f.j(this, obj);
        }

        public final int hashCode() {
            int i;
            int i10 = 0;
            for (int d10 = f.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = f.this.b(d10, 0);
                if (b10 == null) {
                    i = 0;
                } else {
                    i = b10.hashCode();
                }
                i10 += i;
            }
            return i10;
        }

        public final boolean isEmpty() {
            return f.this.d() == 0;
        }

        public final Iterator<K> iterator() {
            return new a(0);
        }

        public final boolean remove(Object obj) {
            int e10 = f.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            f.this.h(e10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map c10 = f.this.c();
            int size = c10.size();
            for (Object remove : collection) {
                c10.remove(remove);
            }
            return size != c10.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return f.k(f.this.c(), collection);
        }

        public final int size() {
            return f.this.d();
        }

        public final Object[] toArray() {
            f fVar = f.this;
            int d10 = fVar.d();
            Object[] objArr = new Object[d10];
            for (int i = 0; i < d10; i++) {
                objArr[i] = fVar.b(i, 0);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return f.this.l(tArr, 0);
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            f.this.a();
        }

        public final boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return f.this.d() == 0;
        }

        public final Iterator<V> iterator() {
            return new a(1);
        }

        public final boolean remove(Object obj) {
            int f10 = f.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            f.this.h(f10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int d10 = f.this.d();
            int i = 0;
            boolean z = false;
            while (i < d10) {
                if (collection.contains(f.this.b(i, 1))) {
                    f.this.h(i);
                    i--;
                    d10--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int d10 = f.this.d();
            int i = 0;
            boolean z = false;
            while (i < d10) {
                if (!collection.contains(f.this.b(i, 1))) {
                    f.this.h(i);
                    i--;
                    d10--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return f.this.d();
        }

        public final Object[] toArray() {
            f fVar = f.this;
            int d10 = fVar.d();
            Object[] objArr = new Object[d10];
            for (int i = 0; i < d10; i++) {
                objArr[i] = fVar.b(i, 1);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return f.this.l(tArr, 1);
        }
    }
}
