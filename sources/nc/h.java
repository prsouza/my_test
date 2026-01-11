package nc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import qc.a;
import qc.d;
import rc.i;
import vc.c;

public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public static final h f8952a = new h();

    public final a<?, ?> b(String str, d dVar) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(dVar, "innerTypeRef");
        if (e.r(dVar.f10406b, vc.h.f12456a)) {
            return new c(str);
        }
        return new i(str, dVar);
    }

    public final String c() {
        return "Vec";
    }
}
