package i7;

import i7.z;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class c<E> extends AbstractList<E> implements z.d<E> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6238a = true;

    public boolean add(E e10) {
        b();
        return super.add(e10);
    }

    public boolean addAll(Collection<? extends E> collection) {
        b();
        return super.addAll(collection);
    }

    public final void b() {
        if (!this.f6238a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
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

    public final void f() {
        this.f6238a = false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i = (i * 31) + get(i10).hashCode();
        }
        return i;
    }

    public final boolean p0() {
        return this.f6238a;
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

    public boolean addAll(int i, Collection<? extends E> collection) {
        b();
        return super.addAll(i, collection);
    }
}
