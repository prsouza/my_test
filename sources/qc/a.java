package qc;

import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fe.g;
import io.sentry.protocol.SentryRuntime;
import oc.b;

public abstract class a<ENCODE, DECODE> {

    /* renamed from: a  reason: collision with root package name */
    public final String f10398a;

    /* renamed from: qc.a$a  reason: collision with other inner class name */
    public interface C0200a<I> {
        Object d(b bVar, I i);
    }

    public a(String str) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f10398a = str;
    }

    public abstract DECODE a(ca.b bVar, kc.a aVar);

    public abstract void b(c cVar, kc.a aVar, ENCODE encode);

    public final void c(c cVar, kc.a aVar, Object obj) {
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        if (!e(obj)) {
            String str = null;
            if (obj != null) {
                str = obj.getClass().getSimpleName();
            }
            throw new sc.a(g.U0("\n                |" + obj + " (" + str + ") is not a valid instance of " + this.f10398a + "\n                | (" + getClass().getSimpleName() + ')'));
        }
        b(cVar, aVar, obj);
    }

    public abstract boolean d();

    public abstract boolean e(Object obj);
}
