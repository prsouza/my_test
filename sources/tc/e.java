package tc;

import c3.k;
import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.protocol.SentryRuntime;
import kc.a;
import tc.d;
import vc.f;

public final class e extends f<d> {

    /* renamed from: c  reason: collision with root package name */
    public static final e f11536c = new e();

    public e() {
        super("Era");
    }

    public final Object a(b bVar, a aVar) {
        e6.e.D(bVar, "scaleCodecReader");
        e6.e.D(aVar, SentryRuntime.TYPE);
        String B = jc.b.B(new byte[]{bVar.b()}, false);
        if (e6.e.r(B, "00")) {
            return d.a.f11533a;
        }
        k.T(16);
        int parseInt = Integer.parseInt(jc.b.B(new byte[]{bVar.b()}, false) + B, 16);
        int i = 2 << (parseInt % 16);
        return new d.b(i, (parseInt >> 4) * Math.max(1, i >> 12));
    }

    public final void b(c cVar, a aVar, Object obj) {
        d dVar = (d) obj;
        e6.e.D(cVar, "scaleCodecWriter");
        e6.e.D(aVar, SentryRuntime.TYPE);
        e6.e.D(dVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (dVar instanceof d.a) {
            cVar.a(0);
        } else if (dVar instanceof d.b) {
            d.b bVar = (d.b) dVar;
            int max = Math.max(1, bVar.f11534a >> 12);
            Integer valueOf = Integer.valueOf(((bVar.f11535b / max) << 4) | ad.c.A(Integer.numberOfTrailingZeros(bVar.f11534a) - 1, 1, 15));
            cVar.a(valueOf.intValue() & 255);
            cVar.a((valueOf.intValue() >> 8) & 255);
        }
    }

    public final boolean e(Object obj) {
        return obj instanceof d;
    }
}
