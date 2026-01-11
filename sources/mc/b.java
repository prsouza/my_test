package mc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import nc.c;
import nc.d;
import nc.e;
import nc.f;
import nc.g;
import nc.h;
import xd.l;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final List<a> f8533b = a.b.o0(h.f8952a, nc.b.f8946a, e.f8949a, nc.a.f8945a, g.f8951a, c.f8947a, d.f8948a, f.f8950a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f8534c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f8535a;

    public static final class a {
    }

    public b(List<? extends a> list) {
        e6.e.D(list, "extensions");
        this.f8535a = list;
    }

    public final qc.a<?, ?> a(String str, String str2, l<? super String, qc.d> lVar) {
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e6.e.D(str2, "typeDef");
        for (a a10 : this.f8535a) {
            qc.a<?, ?> a11 = a10.a(str, str2, lVar);
            if (a11 != null) {
                return a11;
            }
        }
        return null;
    }
}
