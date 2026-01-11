package ge;

import pd.f;
import xd.p;

public final class d2 implements f.a, f.b<d2> {

    /* renamed from: a  reason: collision with root package name */
    public static final d2 f5381a = new d2();

    public final <R> R fold(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    public final <E extends f.a> E get(f.b<E> bVar) {
        return f.a.C0191a.a(this, bVar);
    }

    public final f.b<?> getKey() {
        return this;
    }

    public final f minusKey(f.b<?> bVar) {
        return f.a.C0191a.b(this, bVar);
    }

    public final f plus(f fVar) {
        return f.a.C0191a.c(this, fVar);
    }
}
