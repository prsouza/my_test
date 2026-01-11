package pd;

import e6.e;
import java.io.Serializable;
import pd.f;
import xd.p;

public final class h implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final h f9881a = new h();

    public final <R> R fold(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        return r10;
    }

    public final <E extends f.a> E get(f.b<E> bVar) {
        e.D(bVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final f minusKey(f.b<?> bVar) {
        e.D(bVar, "key");
        return this;
    }

    public final f plus(f fVar) {
        e.D(fVar, "context");
        return fVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
