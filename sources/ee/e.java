package ee;

import java.util.Iterator;
import java.util.NoSuchElementException;
import l6.b1;
import md.m;
import pd.d;
import pd.f;
import pd.h;
import zd.a;

public final class e<T> extends f<T> implements Iterator<T>, d<m>, a {

    /* renamed from: a  reason: collision with root package name */
    public int f4820a;

    /* renamed from: b  reason: collision with root package name */
    public T f4821b;

    /* renamed from: c  reason: collision with root package name */
    public d<? super m> f4822c;

    public final Object a(T t10, d<? super m> dVar) {
        this.f4821b = t10;
        this.f4820a = 3;
        this.f4822c = dVar;
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        e6.e.D(dVar, "frame");
        return aVar;
    }

    public final Throwable c() {
        int i = this.f4820a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder d10 = a.a.d("Unexpected state of the iterator: ");
        d10.append(this.f4820a);
        return new IllegalStateException(d10.toString());
    }

    public final f getContext() {
        return h.f9881a;
    }

    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f4820a;
            if (i != 0) {
                break;
            }
            this.f4820a = 5;
            d<? super m> dVar = this.f4822c;
            e6.e.B(dVar);
            this.f4822c = null;
            dVar.resumeWith(m.f8555a);
        }
        if (i == 1) {
            e6.e.B((Object) null);
            throw null;
        } else if (i == 2 || i == 3) {
            return true;
        } else {
            if (i == 4) {
                return false;
            }
            throw c();
        }
    }

    public final T next() {
        int i = this.f4820a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.f4820a = 1;
            e6.e.B((Object) null);
            throw null;
        } else if (i == 3) {
            this.f4820a = 0;
            T t10 = this.f4821b;
            this.f4821b = null;
            return t10;
        } else {
            throw c();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeWith(Object obj) {
        b1.w(obj);
        this.f4820a = 4;
    }
}
