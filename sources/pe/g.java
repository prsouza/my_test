package pe;

import java.util.Iterator;

public final class g implements Iterable<e>, zd.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9912a;

    public static final class a implements Iterator<e>, zd.a {

        /* renamed from: a  reason: collision with root package name */
        public int f9913a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f9914b;

        public a(g gVar) {
            this.f9914b = gVar;
            this.f9913a = gVar.f9912a.d();
        }

        public final boolean hasNext() {
            return this.f9913a > 0;
        }

        public final Object next() {
            e eVar = this.f9914b.f9912a;
            int d10 = eVar.d();
            int i = this.f9913a;
            this.f9913a = i - 1;
            return eVar.g(d10 - i);
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(e eVar) {
        this.f9912a = eVar;
    }

    public final Iterator<e> iterator() {
        return new a(this);
    }
}
