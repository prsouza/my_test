package nd;

import e6.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import jc.b;
import zd.a;

public final class c<T> implements Collection<T>, a {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f8960a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8961b;

    public c(T[] tArr, boolean z) {
        this.f8960a = tArr;
        this.f8961b = z;
    }

    public final boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        T[] tArr = this.f8960a;
        e.D(tArr, "<this>");
        return f.L(tArr, obj) >= 0;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        e.D(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f8960a.length == 0;
    }

    public final Iterator<T> iterator() {
        return e.Q(this.f8960a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f8960a.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f8960a;
        boolean z = this.f8961b;
        Class<Object[]> cls = Object[].class;
        e.D(tArr, "<this>");
        if (z && e.r(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        e.C(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final <T> T[] toArray(T[] tArr) {
        e.D(tArr, "array");
        return b.A(this, tArr);
    }
}
