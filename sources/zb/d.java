package zb;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import zb.t;

public abstract class d<E> extends AbstractList<E> implements t.c<E> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14277a = true;

    public final boolean add(E e10) {
        b();
        return super.add(e10);
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        b();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        b();
        return super.addAll(collection);
    }

    public final void b() {
        if (!this.f14277a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        b();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i = (i * 31) + get(i10).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        b();
        return super.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        b();
        return super.retainAll(collection);
    }
}
