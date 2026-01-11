package bd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.util.List;
import zc.r;

public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f2967a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f2968b;

    public b(String str, List<String> list) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(list, "documentation");
        this.f2967a = str;
        this.f2968b = list;
    }

    public final String getName() {
        return this.f2967a;
    }
}
