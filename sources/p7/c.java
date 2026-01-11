package p7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import o7.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f9707a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final a.b f9708b;

    public c(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f9708b = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new b(this));
    }
}
