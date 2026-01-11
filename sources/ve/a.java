package ve;

import e6.e;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import si.b;
import si.c;
import si.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Logger f12466a = LoggerFactory.getLogger("Registrar");

    /* renamed from: b  reason: collision with root package name */
    public Map<URI, d> f12467b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final c f12468c;

    /* renamed from: ve.a$a  reason: collision with other inner class name */
    public static final class C0241a implements b {
    }

    public a(c cVar) {
        e.D(cVar, "agent");
        this.f12468c = cVar;
    }

    public final URI a(URI uri) {
        try {
            if (e.r(uri.getAuthority(), "api:me")) {
                URI g = ((c.c) this.f12468c).g();
                jc.b.i(uri);
                jc.b.i(g);
                URI uri2 = new URI("dtn", g.getAuthority(), uri.getPath(), uri.getQuery(), uri.getFragment());
                jc.b.i(uri2);
                return uri2;
            }
        } catch (Exception unused) {
        }
        return uri;
    }

    public final boolean b(URI uri, d dVar) {
        if (this.f12467b.containsKey(uri)) {
            return false;
        }
        this.f12467b.put(uri, dVar);
        dVar.c(new C0241a());
        return true;
    }
}
