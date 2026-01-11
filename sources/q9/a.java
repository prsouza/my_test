package q9;

import a5.n;
import a9.c;
import aa.b;
import e6.e;
import io.sentry.Sentry;
import java.net.URI;
import java.util.List;
import java.util.Objects;
import pd.d;
import xe.f;

public final class a extends ni.a {

    /* renamed from: e  reason: collision with root package name */
    public final oi.a f10324e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(oi.a aVar, URI uri) {
        super(aVar.f9454e, uri);
        e.D(aVar, "core");
        this.f10324e = aVar;
    }

    public final Object d(List<f> list, d<? super Boolean> dVar) {
        c cVar = (c) this.f10324e.f9450a.getSdkConfig();
        Objects.requireNonNull(cVar);
        Sentry.configureScope(new n("NodleHTTP", cVar));
        oi.a aVar = this.f10324e;
        int d10 = b.d(aVar.i.e(aVar.f9450a));
        if (d10 == 1) {
            c.c cVar2 = this.f10324e.f9454e;
            e.D(cVar2, "<this>");
            if (((Boolean) ((c) cVar2.f3046a.getSdkConfig()).a("dtn.use-cellular", Boolean.TRUE)).booleanValue()) {
                return ni.a.e(this, list, dVar);
            }
            return Boolean.FALSE;
        } else if (d10 != 2) {
            return Boolean.FALSE;
        } else {
            return ni.a.e(this, list, dVar);
        }
    }
}
