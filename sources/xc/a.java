package xc;

import cd.i;
import e6.e;
import java.util.List;
import java.util.Map;
import qc.d;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f13165a;

    public a(List<? extends f> list) {
        this.f13165a = list;
    }

    public final qc.a<?, ?> a(dd.a<i> aVar, String str, Map<String, d> map) {
        e.D(map, "typesBuilder");
        for (f a10 : this.f13165a) {
            qc.a<?, ?> a11 = a10.a(aVar, str, map);
            if (a11 != null) {
                return a11;
            }
        }
        return null;
    }
}
