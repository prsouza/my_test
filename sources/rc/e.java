package rc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.protocol.SentryRuntime;
import java.util.Objects;
import kc.a;
import qc.d;

public final class e extends j<Object> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, d dVar) {
        super(str, dVar);
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e6.e.D(dVar, "typeReference");
    }

    public final Object a(b bVar, a aVar) {
        e6.e.D(bVar, "scaleCodecReader");
        e6.e.D(aVar, SentryRuntime.TYPE);
        if (this.f10667b.b() instanceof vc.a) {
            byte b10 = bVar.b();
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.FALSE;
            }
            if (b10 == 2) {
                return Boolean.TRUE;
            }
            throw new sc.a("Not a optional boolean");
        } else if (bVar.a()) {
            return this.f10667b.b().a(bVar, aVar);
        } else {
            return null;
        }
    }

    public final void b(c cVar, a aVar, Object obj) {
        e6.e.D(cVar, "scaleCodecWriter");
        e6.e.D(aVar, SentryRuntime.TYPE);
        qc.a<?, ?> b10 = this.f10667b.b();
        if (b10 instanceof vc.a) {
            ea.b bVar = c.f3314s;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            cVar.e(bVar, (Boolean) obj);
        } else if (obj == null) {
            cVar.a(0);
        } else {
            cVar.a(1);
            b10.c(cVar, aVar, obj);
        }
    }

    public final boolean e(Object obj) {
        return obj == null || this.f10667b.b().e(obj);
    }
}
