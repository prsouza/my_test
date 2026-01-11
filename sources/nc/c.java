package nc;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fe.k;
import fe.o;
import java.util.List;
import mc.a;
import qc.d;
import vc.h;
import xd.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f8947a = new c();

    public final qc.a<?, ?> a(String str, String str2, l<? super String, d> lVar) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(str2, "typeDef");
        if (!k.d1(str2, "[", false)) {
            return null;
        }
        List y12 = o.y1(k.b1(o.u1(str2, "[", "]"), " ", BuildConfig.FLAVOR), new String[]{";"});
        int parseInt = Integer.parseInt((String) y12.get(1));
        d k10 = lVar.k((String) y12.get(0));
        if (e.r(k10.f10406b, h.f12456a)) {
            return new vc.d(str, parseInt);
        }
        return new rc.d(str, parseInt, k10);
    }
}
