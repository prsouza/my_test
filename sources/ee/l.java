package ee;

import java.util.Iterator;

public final class l<T, R> implements d<R> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f4826a;

    /* renamed from: b  reason: collision with root package name */
    public final xd.l<T, R> f4827b;

    public static final class a implements Iterator<R>, zd.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f4828a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<T, R> f4829b;

        public a(l<T, R> lVar) {
            this.f4829b = lVar;
            this.f4828a = lVar.f4826a.iterator();
        }

        public final boolean hasNext() {
            return this.f4828a.hasNext();
        }

        public final R next() {
            return this.f4829b.f4827b.k(this.f4828a.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(d<? extends T> dVar, xd.l<? super T, ? extends R> lVar) {
        this.f4826a = dVar;
        this.f4827b = lVar;
    }

    public final Iterator<R> iterator() {
        return new a(this);
    }
}
