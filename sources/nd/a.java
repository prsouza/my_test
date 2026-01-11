package nd;

import e6.e;
import java.util.Collection;
import java.util.Iterator;
import jc.b;
import xd.l;
import yd.h;

public abstract class a<E> implements Collection<E>, zd.a {

    /* renamed from: nd.a$a  reason: collision with other inner class name */
    public static final class C0168a extends h implements l<E, CharSequence> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a<E> f8953b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0168a(a<? extends E> aVar) {
            super(1);
            this.f8953b = aVar;
        }

        public final Object k(Object obj) {
            return obj == this.f8953b ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public final boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (Object r10 : this) {
            if (e.r(r10, e10)) {
                return true;
            }
        }
        return false;
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

    public abstract int d();

    public final boolean isEmpty() {
        return d() == 0;
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

    public final /* bridge */ int size() {
        return d();
    }

    public final Object[] toArray() {
        return b.z(this);
    }

    public final String toString() {
        return m.b1(this, ", ", "[", "]", new C0168a(this), 24);
    }

    public final <T> T[] toArray(T[] tArr) {
        e.D(tArr, "array");
        return b.A(this, tArr);
    }
}
