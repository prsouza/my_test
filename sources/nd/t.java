package nd;

import a.b;
import e6.e;
import java.util.Iterator;
import zd.a;

public final class t<T> implements Iterator<r<? extends T>>, a {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator<T> f8972a;

    /* renamed from: b  reason: collision with root package name */
    public int f8973b;

    public t(Iterator<? extends T> it) {
        e.D(it, "iterator");
        this.f8972a = it;
    }

    public final boolean hasNext() {
        return this.f8972a.hasNext();
    }

    public final Object next() {
        int i = this.f8973b;
        this.f8973b = i + 1;
        if (i >= 0) {
            return new r(i, this.f8972a.next());
        }
        b.N0();
        throw null;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
