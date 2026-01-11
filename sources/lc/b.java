package lc;

import e6.e;
import java.util.Map;
import lc.a;
import qc.d;
import xd.l;
import yd.h;

public final class b extends h implements l<String, d> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.C0146a f8222b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a.C0146a aVar) {
        super(1);
        this.f8222b = aVar;
    }

    public final Object k(Object obj) {
        String str = (String) obj;
        e.D(str, "it");
        a.C0146a aVar = this.f8222b;
        d dVar = aVar.f8221c.get(str);
        if (dVar == null) {
            qc.a<?, ?> a10 = aVar.f8220b.a(str, str, new b(aVar));
            dVar = a10 != null ? new d(a10) : null;
        }
        if (dVar != null) {
            return dVar;
        }
        Map<String, d> map = aVar.f8221c;
        e.D(map, "$this$create");
        d dVar2 = new d((qc.a<?, ?>) null);
        map.put(str, dVar2);
        return dVar2;
    }
}
