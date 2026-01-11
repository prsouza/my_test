package vc;

import ca.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import kc.a;

public final class c extends f<byte[]> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    public final Object a(b bVar, a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        return bVar.c(b.f3309c.s(bVar).intValue());
    }

    public final boolean e(Object obj) {
        return obj instanceof byte[];
    }

    /* renamed from: f */
    public final void b(ca.c cVar, a aVar, byte[] bArr) {
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ed.c.f4803v.b(cVar, bArr);
    }
}
