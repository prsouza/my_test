package yd;

import e6.e;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T> implements Iterator<T>, zd.a {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f13602a;

    /* renamed from: b  reason: collision with root package name */
    public int f13603b;

    public a(T[] tArr) {
        e.D(tArr, "array");
        this.f13602a = tArr;
    }

    public final boolean hasNext() {
        return this.f13603b < this.f13602a.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f13602a;
            int i = this.f13603b;
            this.f13603b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f13603b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
