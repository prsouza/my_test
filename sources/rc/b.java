package rc;

import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import java.util.List;
import nd.m;
import qc.a;

public final class b extends a<String, String> {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10657b = true;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f10658c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, List<String> list) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f10658c = list;
    }

    public final Object a(ca.b bVar, kc.a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        List<String> list = this.f10658c;
        e.D(list, "values");
        return list.get(bVar.b());
    }

    public final void b(c cVar, kc.a aVar, Object obj) {
        String str = (String) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        List<String> list = this.f10658c;
        e.D(list, "values");
        int indexOf = list.indexOf(str);
        if (indexOf != -1) {
            cVar.a(indexOf);
            return;
        }
        throw new IllegalArgumentException("No " + str + " in " + list);
    }

    public final boolean d() {
        return this.f10657b;
    }

    public final boolean e(Object obj) {
        return m.V0(this.f10658c, obj);
    }
}
