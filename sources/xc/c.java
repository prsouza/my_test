package xc;

import cd.i;
import cd.r;
import cd.s;
import de.h;
import e6.e;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.b;
import nd.m;
import qc.a;
import qc.d;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final c f13167a = new c();

    public final a<?, ?> a(dd.a<i> aVar, String str, Map<String, d> map) {
        e.D(map, "typesBuilder");
        Object s10 = b.s(b.w(aVar));
        if (!(s10 instanceof dd.a)) {
            return null;
        }
        dd.a aVar2 = (dd.a) s10;
        if (!(aVar2.f4448c instanceof r)) {
            return null;
        }
        List list = (List) aVar2.a(r.f3409s.d());
        if (list.size() != 1) {
            return null;
        }
        dd.a aVar3 = (dd.a) m.X0(list);
        e.D(aVar3, "$this$name");
        Objects.requireNonNull(s.f3413t);
        a9.c cVar = s.f3411c;
        h hVar = s.f3410b[0];
        Objects.requireNonNull(cVar);
        e.D(hVar, "property");
        if (((String) aVar3.a((dd.b) cVar.f176b)) != null) {
            return null;
        }
        String bigInteger = b.x((dd.a) m.X0(list)).toString();
        e.C(bigInteger, "fields.first().type.toString()");
        return new rc.a(str, aa.b.J(map, bigInteger));
    }
}
