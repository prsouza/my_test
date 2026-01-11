package se;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import nd.m;
import oe.e;
import xd.l;
import zd.a;

@e(with = c.class)
public final class b extends e implements List<e>, a {

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f11103a;

    public b(List<? extends e> list) {
        e6.e.D(list, "content");
        this.f11103a = list;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        e6.e.D(eVar, "element");
        return this.f11103a.contains(eVar);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        e6.e.D(collection, "elements");
        return this.f11103a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return e6.e.r(this.f11103a, obj);
    }

    public final Object get(int i) {
        e eVar = this.f11103a.get(i);
        e6.e.C(eVar, "get(...)");
        return eVar;
    }

    public final int hashCode() {
        return this.f11103a.hashCode();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof e)) {
            return -1;
        }
        e eVar = (e) obj;
        e6.e.D(eVar, "element");
        return this.f11103a.indexOf(eVar);
    }

    public final boolean isEmpty() {
        return this.f11103a.isEmpty();
    }

    public final Iterator<e> iterator() {
        return this.f11103a.iterator();
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof e)) {
            return -1;
        }
        e eVar = (e) obj;
        e6.e.D(eVar, "element");
        return this.f11103a.lastIndexOf(eVar);
    }

    public final ListIterator<e> listIterator() {
        return this.f11103a.listIterator();
    }

    public final ListIterator<e> listIterator(int i) {
        return this.f11103a.listIterator(i);
    }

    public final /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator<e> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f11103a.size();
    }

    public final void sort(Comparator<? super e> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<e> subList(int i, int i10) {
        return this.f11103a.subList(i, i10);
    }

    public final Object[] toArray() {
        return jc.b.z(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return jc.b.A(this, tArr);
    }

    public final String toString() {
        return m.b1(this.f11103a, ",", "[", "]", (l) null, 56);
    }
}
