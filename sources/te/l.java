package te;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import nd.m;
import nd.x;
import pe.e;
import se.a;
import se.q;

public final class l extends j {
    public final List<String> i;

    /* renamed from: j  reason: collision with root package name */
    public final int f11592j;

    /* renamed from: k  reason: collision with root package name */
    public int f11593k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final q f11594l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(a aVar, q qVar) {
        super(aVar, qVar, (String) null, (e) null);
        e6.e.D(aVar, "json");
        e6.e.D(qVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f11594l = qVar;
        List<String> j12 = m.j1(qVar.keySet());
        this.i = j12;
        this.f11592j = j12.size() * 2;
    }

    public final se.e O(String str) {
        e6.e.D(str, "tag");
        if (this.f11593k % 2 == 0) {
            return new se.m(str, true);
        }
        return (se.e) x.t0(this.f11594l, str);
    }

    public final String Q(e eVar, int i10) {
        e6.e.D(eVar, "desc");
        return this.i.get(i10 / 2);
    }

    public final se.e S() {
        return this.f11594l;
    }

    public final q U() {
        return this.f11594l;
    }

    public final void j(e eVar) {
        e6.e.D(eVar, "descriptor");
    }

    public final int k(e eVar) {
        e6.e.D(eVar, "descriptor");
        int i10 = this.f11593k;
        if (i10 >= this.f11592j - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f11593k = i11;
        return i11;
    }
}
