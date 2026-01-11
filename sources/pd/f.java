package pd;

import e6.e;
import xd.p;

public interface f {

    public interface a extends f {

        /* renamed from: pd.f$a$a  reason: collision with other inner class name */
        public static final class C0191a {
            public static <E extends a> E a(a aVar, b<E> bVar) {
                e.D(bVar, "key");
                if (e.r(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static f b(a aVar, b<?> bVar) {
                e.D(bVar, "key");
                return e.r(aVar.getKey(), bVar) ? h.f9881a : aVar;
            }

            public static f c(a aVar, f fVar) {
                e.D(fVar, "context");
                return fVar == h.f9881a ? aVar : (f) fVar.fold(aVar, g.f9880b);
            }
        }

        <E extends a> E get(b<E> bVar);

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    <R> R fold(R r10, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    f minusKey(b<?> bVar);

    f plus(f fVar);
}
