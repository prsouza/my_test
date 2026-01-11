package nc;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fe.k;
import fe.o;
import java.util.List;
import mc.a;
import qc.d;
import xd.l;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final f f8950a = new f();

    public final qc.a<?, ?> a(String str, String str2, l<? super String, d> lVar) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(str2, "typeDef");
        if (!k.d1(str2, "Result", false)) {
            return null;
        }
        List y12 = o.y1(k.b1(o.u1(o.t1(str2, "Result"), "<", ">"), " ", BuildConfig.FLAVOR), new String[]{","});
        if (y12.size() != 2) {
            return null;
        }
        return new tc.o(lVar.k(y12.get(0)), lVar.k(y12.get(1)));
    }
}
