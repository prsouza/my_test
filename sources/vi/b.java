package vi;

import aj.m;
import aj.n;
import aj.o;
import b.i;
import bf.c;
import e6.e;
import nd.f;
import oi.a;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ze.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f12483a = LoggerFactory.getLogger("Iotee");

    public static final void a(a aVar, i iVar) {
        e.D(aVar, "<this>");
        Logger logger = f12483a;
        byte[] B = a.b.B(iVar);
        c.a aVar2 = c.a.f3000b;
        logger.debug(e.a0("iotee: installing sx ", f.M(B, aVar2)));
        g a10 = ((hf.f) aVar.f9452c).a();
        e.D(((hf.f) aVar.f9452c).c(), "factory");
        String M = f.M(a.b.B(iVar), aVar2);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = iVar.f2789u;
        bf.a aVar3 = bf.a.f2992a;
        a10.h(new n(M, 0, iVar.r().r().t().B + currentTimeMillis, j10, bf.a.a(iVar.e())));
        g a11 = ((hf.f) aVar.f9452c).a();
        e.D(((hf.f) aVar.f9452c).c(), "factory");
        String M2 = f.M(a.b.B(iVar), aVar2);
        b.n t10 = iVar.r().r().t();
        e.C(t10, "data.manifest.targets");
        a11.i(new o(M2, t10));
        g a12 = ((hf.f) aVar.f9452c).a();
        e.D(((hf.f) aVar.f9452c).c(), "factory");
        String M3 = f.M(a.b.B(iVar), aVar2);
        b.g r10 = iVar.r().r().r();
        e.C(r10, "data.manifest.events");
        a12.j(new m(M3, r10));
    }
}
