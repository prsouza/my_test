package p7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import o7.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final a.b f9710a;

    public e(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f9710a = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new d(this));
    }
}
