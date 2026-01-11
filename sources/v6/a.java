package v6;

import aa.b;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import v6.c;

public abstract class a<E> extends k<Object> implements ListIterator<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final int f12292a;

    /* renamed from: b  reason: collision with root package name */
    public int f12293b;

    public a(int i, int i10) {
        b.w(i10, i);
        this.f12292a = i;
        this.f12293b = i10;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f12293b < this.f12292a;
    }

    public final boolean hasPrevious() {
        return this.f12293b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f12293b;
            this.f12293b = i + 1;
            return ((c.a) this).f12296c.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f12293b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f12293b - 1;
            this.f12293b = i;
            return ((c.a) this).f12296c.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f12293b - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
