package xc;

import cd.i;
import cd.r;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jc.b;
import nd.m;
import qc.a;
import qc.d;
import rc.f;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13169a = new e();

    public final a<?, ?> a(dd.a<i> aVar, String str, Map<String, d> map) {
        e6.e.D(map, "typesBuilder");
        dd.a w6 = b.w(aVar);
        if (!e6.e.r((String) m.d1(b.v(w6)), "BitFlags")) {
            return null;
        }
        Object s10 = b.s(w6);
        if (s10 instanceof dd.a) {
            dd.a aVar2 = (dd.a) s10;
            if (aVar2.f4448c instanceof r) {
                dd.a aVar3 = (dd.a) m.Y0((List) aVar2.a(r.f3409s.d()));
                BigInteger x10 = aVar3 != null ? b.x(aVar3) : null;
                if (x10 != null) {
                    String bigInteger = x10.toString();
                    e6.e.C(bigInteger, "typeIndex.toString()");
                    return new f(str, aa.b.J(map, bigInteger), new LinkedHashMap());
                }
            }
        }
        return new f(str, new d((a<?, ?>) null), new LinkedHashMap());
    }
}
