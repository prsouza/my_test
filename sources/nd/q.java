package nd;

import e6.e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import jc.b;
import zd.a;

public final class q implements Set, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final q f8968a = new q();

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return n.f8965a;
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

    public final /* bridge */ int size() {
        return 0;
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
}
