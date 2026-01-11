package nc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fe.k;
import fe.o;
import mc.a;
import qc.d;
import xd.l;

public abstract class i implements a {
    public final qc.a<?, ?> a(String str, String str2, l<? super String, d> lVar) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(str2, "typeDef");
        if (!k.d1(str2, c() + '<', false)) {
            return null;
        }
        return b(str, lVar.k(o.u1(str2, c() + '<', ">")));
    }

    public abstract qc.a<?, ?> b(String str, d dVar);

    public abstract String c();
}
