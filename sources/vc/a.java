package vc;

import ca.b;
import ca.c;
import e6.e;
import io.sentry.protocol.SentryRuntime;

public final class a extends f<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f12452c = new a();

    public a() {
        super("bool");
    }

    public final Object a(b bVar, kc.a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        return Boolean.valueOf(bVar.a());
    }

    public final void b(c cVar, kc.a aVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        if (Boolean.valueOf(booleanValue).booleanValue()) {
            cVar.a(1);
        } else {
            cVar.a(0);
        }
    }

    public final boolean e(Object obj) {
        return obj instanceof Boolean;
    }
}
