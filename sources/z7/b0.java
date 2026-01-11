package z7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class b0<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final List<E> f14005a;

    public b0(List<E> list) {
        this.f14005a = Collections.unmodifiableList(list);
    }

    public final boolean add(E e10) {
        return this.f14005a.add(e10);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.f14005a.addAll(collection);
    }

    public final void clear() {
        this.f14005a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f14005a.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f14005a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f14005a.equals(obj);
    }

    public final E get(int i) {
        return this.f14005a.get(i);
    }

    public final int hashCode() {
        return this.f14005a.hashCode();
    }

    public final int indexOf(Object obj) {
        return this.f14005a.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f14005a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f14005a.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f14005a.lastIndexOf(obj);
    }

    public final ListIterator<E> listIterator() {
        return this.f14005a.listIterator();
    }

    public final boolean remove(Object obj) {
        return this.f14005a.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.f14005a.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f14005a.retainAll(collection);
    }

    public final E set(int i, E e10) {
        return this.f14005a.set(i, e10);
    }

    public final int size() {
        return this.f14005a.size();
    }

    public final List<E> subList(int i, int i10) {
        return this.f14005a.subList(i, i10);
    }

    public final Object[] toArray() {
        return this.f14005a.toArray();
    }

    public final void add(int i, E e10) {
        this.f14005a.add(i, e10);
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.f14005a.addAll(i, collection);
    }

    public final ListIterator<E> listIterator(int i) {
        return this.f14005a.listIterator(i);
    }

    public final E remove(int i) {
        return this.f14005a.remove(i);
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f14005a.toArray(tArr);
    }
}
