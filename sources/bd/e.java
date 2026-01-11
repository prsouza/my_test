package bd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import md.f;
import zc.r;

public final class e implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f2975a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f2976b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f2977c;

    /* renamed from: d  reason: collision with root package name */
    public final f<Integer, Integer> f2978d;

    public e(String str, List<d> list, List<String> list2, f<Integer, Integer> fVar) {
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e6.e.D(list2, "documentation");
        this.f2975a = str;
        this.f2976b = list;
        this.f2977c = list2;
        this.f2978d = fVar;
    }

    public final String getName() {
        return this.f2975a;
    }
}
