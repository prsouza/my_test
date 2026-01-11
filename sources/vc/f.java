package vc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import qc.a;

public abstract class f<I> extends a<I, I> {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12454b = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    public final boolean d() {
        return this.f12454b;
    }
}
