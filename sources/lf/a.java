package lf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public c f8276a;

    /* renamed from: b  reason: collision with root package name */
    public long f8277b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final String f8278c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8279d;

    public a(String str, boolean z) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f8278c = str;
        this.f8279d = z;
    }

    public abstract long a();

    public final String toString() {
        return this.f8278c;
    }
}
