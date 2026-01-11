package nd;

import androidx.activity.result.d;
import b9.m;
import e6.e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import jc.b;
import zd.a;

public final class o implements List, Serializable, RandomAccess, a {

    /* renamed from: a  reason: collision with root package name */
    public static final o f8966a = new o();

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        e.D((Void) obj, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        e.D(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        e.D((Void) obj, "element");
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return n.f8965a;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        e.D((Void) obj, "element");
        return -1;
    }

    public final ListIterator listIterator() {
        return n.f8965a;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final List subList(int i, int i10) {
        if (i == 0 && i10 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(d.b("fromIndex: ", i, ", toIndex: ", i10));
    }

    public final Object[] toArray() {
        return b.z(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        e.D(tArr, "array");
        return b.A(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return n.f8965a;
        }
        throw new IndexOutOfBoundsException(m.b("Index: ", i));
    }
}
