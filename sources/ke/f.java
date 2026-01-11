package ke;

import pd.f;
import xd.p;

public final class f implements pd.f {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f7515a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ pd.f f7516b;

    public f(Throwable th2, pd.f fVar) {
        this.f7515a = th2;
        this.f7516b = fVar;
    }

    public final <R> R fold(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        return this.f7516b.fold(r10, pVar);
    }

    public final <E extends f.a> E get(f.b<E> bVar) {
        return this.f7516b.get(bVar);
    }

    public final pd.f minusKey(f.b<?> bVar) {
        return this.f7516b.minusKey(bVar);
    }

    public final pd.f plus(pd.f fVar) {
        return this.f7516b.plus(fVar);
    }
}
