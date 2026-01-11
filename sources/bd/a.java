package bd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.util.List;
import zc.r;

public final class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f2965a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f2966b;

    public a(String str, byte[] bArr, List list) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        e.D(list, "documentation");
        this.f2965a = str;
        this.f2966b = list;
    }

    public final String getName() {
        return this.f2965a;
    }
}
