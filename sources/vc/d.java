package vc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import kc.a;

public class d extends f<byte[]> {

    /* renamed from: c  reason: collision with root package name */
    public final int f12453c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, int i) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f12453c = i;
    }

    public final Object a(b bVar, a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        return bVar.c(this.f12453c);
    }

    public final void b(c cVar, a aVar, Object obj) {
        byte[] bArr = (byte[]) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        cVar.c(bArr, this.f12453c);
    }

    public final boolean e(Object obj) {
        return (obj instanceof byte[]) && ((byte[]) obj).length == this.f12453c;
    }
}
