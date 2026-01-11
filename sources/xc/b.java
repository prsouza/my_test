package xc;

import ah.v;
import cd.i;
import cd.o;
import cd.u;
import dd.c;
import de.h;
import e6.e;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;
import md.l;
import qc.a;
import qc.d;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final b f13166a = new b();

    public final a<?, ?> a(dd.a<i> aVar, String str, Map<String, d> map) {
        e.D(map, "typesBuilder");
        Object s10 = jc.b.s(jc.b.w(aVar));
        if (!(s10 instanceof dd.a)) {
            return null;
        }
        dd.a aVar2 = (dd.a) s10;
        S s11 = aVar2.f4448c;
        if (s11 instanceof o) {
            o oVar = o.f3400t;
            Objects.requireNonNull(oVar);
            c cVar = o.f3399s;
            h[] hVarArr = o.f3397b;
            if (b(map, (BigInteger) aVar2.a(cVar.a(oVar, hVarArr[1])))) {
                return new vc.d(str, ((l) aVar2.a(o.f3398c.a(oVar, hVarArr[0]))).f8554a);
            }
            return null;
        } else if (!(s11 instanceof u)) {
            return null;
        } else {
            u uVar = u.f3418s;
            Objects.requireNonNull(uVar);
            if (b(map, (BigInteger) aVar2.a(u.f3417c.a(uVar, u.f3416b[0])))) {
                return new vc.c(str);
            }
            return null;
        }
    }

    public final boolean b(Map<String, d> map, BigInteger bigInteger) {
        d dVar = map.get(bigInteger.toString());
        return e.r(dVar != null ? v.p0(dVar).f10406b : null, vc.h.f12456a);
    }
}
