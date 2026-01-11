package rc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import md.f;
import nd.g;
import nd.m;
import qc.a;
import qc.d;

public final class h extends a<List<?>, List<?>> {

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f10666b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str, List<d> list) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(list, "typeReferences");
        this.f10666b = list;
    }

    public final Object a(b bVar, kc.a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        List<d> list = this.f10666b;
        ArrayList arrayList = new ArrayList(g.S0(list));
        for (d b10 : list) {
            arrayList.add(b10.b().a(bVar, aVar));
        }
        return arrayList;
    }

    public final void b(c cVar, kc.a aVar, Object obj) {
        List list = (List) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Iterator it = ((ArrayList) m.n1(this.f10666b, list)).iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            ((d) fVar.f8541a).b().c(cVar, aVar, fVar.f8542b);
        }
    }

    public final boolean d() {
        List<d> list = this.f10666b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (d a10 : list) {
                if (!a10.a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(Object obj) {
        boolean z;
        if (!(obj instanceof List)) {
            return false;
        }
        List<f<T, R>> n12 = m.n1(this.f10666b, (Iterable) obj);
        if (((ArrayList) n12).size() != this.f10666b.size()) {
            return false;
        }
        if (!n12.isEmpty()) {
            Iterator<T> it = n12.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar = (f) it.next();
                if (!((d) fVar.f8541a).b().e(fVar.f8542b)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }
}
