package k2;

import a.b;
import ad.c;
import b.i;
import bf.c;
import e6.e;
import io.nodle.sdk.NodleContext;
import java.util.ArrayList;
import java.util.Objects;
import nd.g;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import si.d;
import xe.f;
import xe.j;
import xe.p;
import zb.r;
import zb.t;
import zb.u;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final oi.a f7401a;

    /* renamed from: b  reason: collision with root package name */
    public final Logger f7402b = LoggerFactory.getLogger("NodleIoteeAA");

    public a(oi.a aVar) {
        e.D(aVar, "core");
        this.f7401a = aVar;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, wi.b>] */
    public final Object b(f fVar, pd.d<? super Boolean> dVar) {
        p pVar;
        if (!c.n(fVar, this.f7401a.f9450a)) {
            return Boolean.FALSE;
        }
        NodleContext nodleContext = this.f7401a.f9450a;
        e.D(nodleContext, "ctx");
        if (!e.r(fVar.f13195a.f13222e.getAuthority(), c.e(nodleContext))) {
            return Boolean.FALSE;
        }
        this.f7402b.debug("iotee-aa: received a signed bundle from nodle");
        j G = b.G(fVar, 1);
        if (G == null) {
            pVar = null;
        } else {
            pVar = G.f13212e;
        }
        Objects.requireNonNull(pVar, "null cannot be cast to non-null type io.nodle.dtn.bpv7.BlobBlockData{ io.nodle.dtn.bpv7.PayloadBlockKt.PayloadBlockData }");
        try {
            i iVar = (i) r.i(i.f2785w, ((xe.a) pVar).f13170a);
            this.f7402b.debug("iotee-aa: successfully deserialized an iotee sx");
            y.c.f(this.f7401a, iVar);
            Logger logger = this.f7402b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("iotee-aa: sx ");
            byte[] B = b.B(iVar);
            c.a aVar = c.a.f3000b;
            sb2.append(nd.f.M(B, aVar));
            sb2.append(" is valid");
            logger.debug(sb2.toString());
            vi.b.a(this.f7401a, iVar);
            Logger logger2 = this.f7402b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("iotee-aa: sx ");
            sb3.append(nd.f.M(b.B(iVar), aVar));
            sb3.append(" is registered for events: ");
            t.b<Integer> bVar = iVar.r().r().r().f2778s;
            e.C(bVar, "sxOrder.data.manifest.events.idList");
            ArrayList arrayList = new ArrayList(g.S0(bVar));
            for (Integer num : bVar) {
                arrayList.add((wi.b) wi.e.f12716a.get(num));
            }
            sb3.append(arrayList);
            logger2.debug(sb3.toString());
            t.b bVar2 = iVar.r().r().r().f2778s;
            wi.b bVar3 = wi.b.TxDelivered;
            if (bVar2.contains(new Integer(0))) {
                oi.a aVar2 = this.f7401a;
                e.D(aVar2, "<this>");
                e.D(bVar3, "event");
                vi.a.a(aVar2, iVar, bVar3, (di.b) null);
            }
            return Boolean.TRUE;
        } catch (u unused) {
            this.f7402b.debug("iotee-aa: payload is not an iotee sx");
            return Boolean.FALSE;
        } catch (bj.b e10) {
            this.f7402b.debug(e.a0("iotee-aa: ", e10.getMessage()));
            return Boolean.FALSE;
        }
    }

    public final void c(si.b bVar) {
    }
}
