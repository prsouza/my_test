package rc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import qc.a;
import qc.d;

public abstract class j<I> extends a<I, I> {

    /* renamed from: b  reason: collision with root package name */
    public final d f10667b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str, d dVar) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(dVar, "typeReference");
        this.f10667b = dVar;
    }

    public final boolean d() {
        return this.f10667b.a();
    }
}
