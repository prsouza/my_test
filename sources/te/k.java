package te;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import se.a;
import se.b;

public final class k extends a {

    /* renamed from: e  reason: collision with root package name */
    public final int f11590e;

    /* renamed from: f  reason: collision with root package name */
    public int f11591f = -1;
    public final b g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a aVar, b bVar) {
        super(aVar);
        e.D(aVar, "json");
        e.D(bVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.g = bVar;
        this.f11590e = bVar.size();
    }

    public final se.e O(String str) {
        e.D(str, "tag");
        b bVar = this.g;
        se.e eVar = bVar.f11103a.get(Integer.parseInt(str));
        e.C(eVar, "get(...)");
        return eVar;
    }

    public final String Q(pe.e eVar, int i) {
        e.D(eVar, "desc");
        return String.valueOf(i);
    }

    public final se.e S() {
        return this.g;
    }

    public final int k(pe.e eVar) {
        e.D(eVar, "descriptor");
        int i = this.f11591f;
        if (i >= this.f11590e - 1) {
            return -1;
        }
        int i10 = i + 1;
        this.f11591f = i10;
        return i10;
    }
}
