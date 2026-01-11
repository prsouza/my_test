package vc;

import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import ed.d;
import io.sentry.protocol.SentryRuntime;
import java.math.BigInteger;
import kc.a;

public final class b extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    public final Object a(ca.b bVar, a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        return d.f4804v.g(bVar);
    }

    public final void b(c cVar, a aVar, Object obj) {
        BigInteger bigInteger = (BigInteger) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(bigInteger, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ca.a forNumber = ca.a.forNumber(bigInteger);
        byte[] a10 = fd.a.a(bigInteger);
        if (forNumber != ca.a.BIGINT) {
            fd.a.f5084a.b(cVar, Long.valueOf(bigInteger.longValue()));
            return;
        }
        cVar.a(forNumber.getValue() + ((a10.length - 4) << 2));
        for (int length = a10.length - 1; length >= 0; length--) {
            cVar.a(a10[length]);
        }
    }
}
