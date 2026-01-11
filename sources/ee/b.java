package ee;

import e6.e;
import java.util.Iterator;

public final class b<T> implements d<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f4816a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4817b;

    public static final class a implements Iterator<T>, zd.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f4818a;

        /* renamed from: b  reason: collision with root package name */
        public int f4819b;

        public a(b<T> bVar) {
            this.f4818a = bVar.f4816a.iterator();
            this.f4819b = bVar.f4817b;
        }

        public final void a() {
            while (this.f4819b > 0 && this.f4818a.hasNext()) {
                this.f4818a.next();
                this.f4819b--;
            }
        }

        public final boolean hasNext() {
            a();
            return this.f4818a.hasNext();
        }

        public final T next() {
            a();
            return this.f4818a.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(d<? extends T> dVar, int i) {
        e.D(dVar, "sequence");
        this.f4816a = dVar;
        this.f4817b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    public final d<T> a(int i) {
        int i10 = this.f4817b + i;
        return i10 < 0 ? new b(this, i) : new b(this.f4816a, i10);
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}
