package v6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class c<E> extends b<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12295b = new a(g.f12309t, 0);

    public static class a<E> extends a<E> {

        /* renamed from: c  reason: collision with root package name */
        public final c<E> f12296c;

        public a(c<E> cVar, int i) {
            super(cVar.size(), i);
            this.f12296c = cVar;
        }
    }

    public class b extends c<E> {

        /* renamed from: c  reason: collision with root package name */
        public final transient int f12297c;

        /* renamed from: s  reason: collision with root package name */
        public final transient int f12298s;

        public b(int i, int i10) {
            this.f12297c = i;
            this.f12298s = i10;
        }

        public final Object[] d() {
            return c.this.d();
        }

        public final int e() {
            return c.this.g() + this.f12297c + this.f12298s;
        }

        public final int g() {
            return c.this.g() + this.f12297c;
        }

        public final E get(int i) {
            aa.b.t(i, this.f12298s);
            return c.this.get(i + this.f12297c);
        }

        public final Iterator iterator() {
            return listIterator(0);
        }

        /* renamed from: k */
        public final c<E> subList(int i, int i10) {
            aa.b.x(i, i10, this.f12298s);
            c cVar = c.this;
            int i11 = this.f12297c;
            return cVar.subList(i + i11, i10 + i11);
        }

        public final ListIterator listIterator() {
            return listIterator(0);
        }

        public final int size() {
            return this.f12298s;
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static <E> c<E> i(Object[] objArr, int i) {
        if (i == 0) {
            return g.f12309t;
        }
        return new g(objArr, i);
    }

    @Deprecated
    public final void add(int i, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[0 + i] = get(i);
        }
        return 0 + size;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (y.c.x(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object x10 : this) {
                    if (it.hasNext()) {
                        if (!y.c.x(x10, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    public final k<E> h() {
        return listIterator(0);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i = ~(~(get(i10).hashCode() + (i * 31)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final a listIterator(int i) {
        aa.b.w(i, size());
        if (isEmpty()) {
            return f12295b;
        }
        return new a(this, i);
    }

    /* renamed from: k */
    public c<E> subList(int i, int i10) {
        aa.b.x(i, i10, size());
        int i11 = i10 - i;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return g.f12309t;
        }
        return new b(i, i11);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e10) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
