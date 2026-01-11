package pd;

import e6.e;
import pd.e;
import pd.f;
import xd.p;
import yd.h;

public final class g extends h implements p<f, f.a, f> {

    /* renamed from: b  reason: collision with root package name */
    public static final g f9880b = new g();

    public g() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        f fVar = (f) obj;
        f.a aVar = (f.a) obj2;
        e.D(fVar, "acc");
        e.D(aVar, "element");
        f minusKey = fVar.minusKey(aVar.getKey());
        h hVar = h.f9881a;
        if (minusKey == hVar) {
            return aVar;
        }
        int i = e.f9878p;
        e.a aVar2 = e.a.f9879a;
        e eVar = (e) minusKey.get(aVar2);
        if (eVar == null) {
            cVar = new c(minusKey, aVar);
        } else {
            f minusKey2 = minusKey.minusKey(aVar2);
            if (minusKey2 == hVar) {
                return new c(aVar, eVar);
            }
            cVar = new c(new c(minusKey2, aVar), eVar);
        }
        return cVar;
    }
}
