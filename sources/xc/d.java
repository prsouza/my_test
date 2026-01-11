package xc;

import a9.c;
import cd.i;
import cd.j;
import cd.x;
import de.h;
import e6.e;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.b;
import nd.m;
import qc.a;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final d f13168a = new d();

    public final a<?, ?> a(dd.a<i> aVar, String str, Map<String, qc.d> map) {
        e.D(map, "typesBuilder");
        List v10 = b.v(b.w(aVar));
        if (v10.size() != 1 || (!e.r((String) m.X0(v10), "Option"))) {
            return null;
        }
        String bigInteger = ((BigInteger) aVar.a(i.f3372t.d())).toString();
        e.C(bigInteger, "originalDefinition.id.toString()");
        dd.a w6 = b.w(aVar);
        e.D(w6, "$this$params");
        j jVar = j.f3377u;
        Objects.requireNonNull(jVar);
        dd.a aVar2 = (dd.a) m.Y0((List) w6.a(j.f3375s.a(jVar, j.f3373b[1])));
        if (aVar2 != null) {
            Objects.requireNonNull(x.f3429s);
            c cVar = x.f3428c;
            h hVar = x.f3427b[1];
            Objects.requireNonNull(cVar);
            e.D(hVar, "property");
            BigInteger bigInteger2 = (BigInteger) aVar2.a((dd.b) cVar.f176b);
            if (bigInteger2 != null) {
                String bigInteger3 = bigInteger2.toString();
                e.C(bigInteger3, "innerTypeIndex.toString()");
                return new rc.e(bigInteger, aa.b.J(map, bigInteger3));
            }
        }
        return new rc.e(bigInteger, new qc.d((a<?, ?>) null));
    }
}
