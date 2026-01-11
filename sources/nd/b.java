package nd;

import androidx.activity.result.d;
import e6.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class b<E> extends a<E> implements List<E> {

    public class a implements Iterator<E>, zd.a {

        /* renamed from: a  reason: collision with root package name */
        public int f8954a;

        public a() {
        }

        public final boolean hasNext() {
            return this.f8954a < b.this.d();
        }

        public final E next() {
            if (hasNext()) {
                b<E> bVar = b.this;
                int i = this.f8954a;
                this.f8954a = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: nd.b$b  reason: collision with other inner class name */
    public class C0169b extends b<E>.a implements ListIterator<E> {
        public C0169b(int i) {
            super();
            int d10 = b.this.d();
            if (i < 0 || i > d10) {
                throw new IndexOutOfBoundsException(d.b("index: ", i, ", size: ", d10));
            }
            this.f8954a = i;
        }

        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            return this.f8954a > 0;
        }

        public final int nextIndex() {
            return this.f8954a;
        }

        public final E previous() {
            if (hasPrevious()) {
                b<E> bVar = b.this;
                int i = this.f8954a - 1;
                this.f8954a = i;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f8954a - 1;
        }

        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c<E> extends b<E> implements RandomAccess {

        /* renamed from: a  reason: collision with root package name */
        public final b<E> f8957a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8958b;

        /* renamed from: c  reason: collision with root package name */
        public int f8959c;

        public c(b<? extends E> bVar, int i, int i10) {
            e.D(bVar, "list");
            this.f8957a = bVar;
            this.f8958b = i;
            int d10 = bVar.d();
            if (i < 0 || i10 > d10) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i10 + ", size: " + d10);
            } else if (i <= i10) {
                this.f8959c = i10 - i;
            } else {
                throw new IllegalArgumentException(d.b("fromIndex: ", i, " > toIndex: ", i10));
            }
        }

        public final int d() {
            return this.f8959c;
        }

        public final E get(int i) {
            int i10 = this.f8959c;
            if (i >= 0 && i < i10) {
                return this.f8957a.get(this.f8958b + i);
            }
            throw new IndexOutOfBoundsException(d.b("index: ", i, ", size: ", i10));
        }
    }

    public final void add(int i, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        e.D(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object r10 : this) {
                if (!e.r(r10, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i);

    public final int hashCode() {
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(E e10) {
        int i = 0;
        for (Object r10 : this) {
            if (e.r(r10, e10)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Iterator<E> iterator() {
        return new a();
    }

    public int lastIndexOf(E e10) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (e.r(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator<E> listIterator() {
        return new C0169b(0);
    }

    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<E> subList(int i, int i10) {
        return new c(this, i, i10);
    }

    public final ListIterator<E> listIterator(int i) {
        return new C0169b(i);
    }
}
