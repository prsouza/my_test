package rc;

import ca.b;
import ca.c;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import qc.d;

public final class a extends qc.a<Object, Object> {

    /* renamed from: b  reason: collision with root package name */
    public final d f10656b;

    public a(String str, d dVar) {
        super(str);
        this.f10656b = dVar;
    }

    public final Object a(b bVar, kc.a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        return this.f10656b.b().a(bVar, aVar);
    }

    public final void b(c cVar, kc.a aVar, Object obj) {
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        this.f10656b.b().c(cVar, aVar, obj);
    }

    public final boolean d() {
        return this.f10656b.a();
    }

    public final boolean e(Object obj) {
        return this.f10656b.b().e(obj);
    }
}
