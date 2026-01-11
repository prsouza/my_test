package nc;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fe.k;
import fe.o;
import mc.a;
import rc.i;
import xd.l;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f8948a = new d();

    public final qc.a<?, ?> a(String str, String str2, l<? super String, qc.d> lVar) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(str2, "typeDef");
        if (!k.d1(str2, "HashMap", false)) {
            return null;
        }
        String b12 = k.b1(o.u1(o.t1(str2, "HashMap"), "<", ">"), " ", BuildConfig.FLAVOR);
        if (o.y1(b12, new String[]{","}).size() != 2) {
            return null;
        }
        String str3 = '(' + b12 + ')';
        return new i("Vec<" + str3 + '>', lVar.k(str3));
    }
}
