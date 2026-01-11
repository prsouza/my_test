package rc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kc.a;
import qc.d;

public final class i extends j<List<?>> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, d dVar) {
        super(str, dVar);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(dVar, "typeReference");
    }

    public final Object a(b bVar, a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        qc.a<?, ?> b10 = this.f10667b.b();
        BigInteger r22 = ed.d.f4804v.g(bVar);
        ArrayList arrayList = new ArrayList();
        int intValue = r22.intValue();
        for (int i = 0; i < intValue; i++) {
            arrayList.add(b10.a(bVar, aVar));
        }
        return arrayList;
    }

    public final void b(c cVar, a aVar, Object obj) {
        List<Object> list = (List) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.a<?, ?> b10 = this.f10667b.b();
        BigInteger valueOf = BigInteger.valueOf((long) list.size());
        e.C(valueOf, "BigInteger.valueOf(this.toLong())");
        ca.a forNumber = ca.a.forNumber(valueOf);
        byte[] a10 = fd.a.a(valueOf);
        if (forNumber != ca.a.BIGINT) {
            fd.a.f5084a.b(cVar, Long.valueOf(valueOf.longValue()));
        } else {
            cVar.a(forNumber.getValue() + ((a10.length - 4) << 2));
            for (int length = a10.length - 1; length >= 0; length--) {
                cVar.a(a10[length]);
            }
        }
        for (Object c10 : list) {
            b10.c(cVar, aVar, c10);
        }
    }

    public final boolean e(Object obj) {
        boolean z;
        if (!(obj instanceof List)) {
            return false;
        }
        Iterable iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!this.f10667b.b().e(it.next())) {
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
