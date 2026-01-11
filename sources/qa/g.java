package qa;

import ah.v;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10338a;

    public g(Context context) {
        this.f10338a = context;
    }

    public final void a(e eVar, Object obj) {
        e.D(eVar, "key");
        e.D(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        v.f0(this.f10338a, eVar, obj);
    }

    public final long b(e eVar) {
        e.D(eVar, "key");
        return Long.parseLong(v.J(this.f10338a, eVar));
    }

    public final String c(e eVar) {
        e.D(eVar, "key");
        return v.J(this.f10338a, eVar);
    }

    public final int d(e eVar) {
        e.D(eVar, "key");
        return Integer.parseInt(v.J(this.f10338a, eVar));
    }
}
