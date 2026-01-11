package pd;

import e6.e;
import pd.f;
import xd.p;

public abstract class a implements f.a {
    private final f.b<?> key;

    public a(f.b<?> bVar) {
        e.D(bVar, "key");
        this.key = bVar;
    }

    public <R> R fold(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        e.D(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        return f.a.C0191a.a(this, bVar);
    }

    public f.b<?> getKey() {
        return this.key;
    }

    public f minusKey(f.b<?> bVar) {
        return f.a.C0191a.b(this, bVar);
    }

    public f plus(f fVar) {
        return f.a.C0191a.c(this, fVar);
    }
}
