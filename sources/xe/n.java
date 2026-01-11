package xe;

import a.b;
import e6.e;
import h4.k;
import java.net.URI;
import java.net.URISyntaxException;
import p4.d;
import xd.l;
import yd.h;

public final class n {

    public static final class a extends h implements l<d, URI> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f13216b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.f13216b = dVar;
        }

        public final Object k(Object obj) {
            e.D((d) obj, "it");
            try {
                int R = b.R(this.f13216b);
                boolean z = true;
                if (R == 1) {
                    k V0 = this.f13216b.V0();
                    e.C(V0, "t");
                    if (V0.isNumeric()) {
                        if (this.f13216b.R0() != 0) {
                            z = false;
                        }
                        if (z) {
                            return jc.b.h();
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return new URI("dtn:" + this.f13216b.t());
                } else if (R == 2) {
                    return c3.k.r(b.R(this.f13216b), b.R(this.f13216b));
                } else {
                    throw new l("eid unsupported");
                }
            } catch (URISyntaxException e10) {
                StringBuilder q10 = b.q("invalid dtn eid: ");
                q10.append(e10.getMessage());
                throw new l(q10.toString());
            } catch (IllegalStateException e11) {
                StringBuilder q11 = b.q("invalid eid: ");
                q11.append(e11.getMessage());
                throw new l(q11.toString());
            }
        }
    }

    public static final f a(d dVar) {
        e.D(dVar, "$this$readBundle");
        b.X(dVar);
        f I = c3.k.I((q) b.o(dVar, false, new o(dVar)));
        while (dVar.V0() != k.END_ARRAY) {
            b.u(I, (j) b.o(dVar, true, new m(dVar)), false);
        }
        return I;
    }

    public static final URI b(d dVar) {
        e.D(dVar, "$this$readEid");
        return (URI) b.o(dVar, false, new a(dVar));
    }
}
