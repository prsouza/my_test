package bd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.util.List;
import md.f;
import qc.a;
import zc.r;

public final class c implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f2969a;

    /* renamed from: b  reason: collision with root package name */
    public final f<Integer, Integer> f2970b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a<?, ?>> f2971c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f2972d;

    public c(String str, f<Integer, Integer> fVar, List<? extends a<?, ?>> list, List<String> list2) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(list2, "documentation");
        this.f2969a = str;
        this.f2970b = fVar;
        this.f2971c = list;
        this.f2972d = list2;
    }

    public final String getName() {
        return this.f2969a;
    }
}
