package c;

import bf.c;
import c3.k;
import e6.e;
import io.nodle.sdk.NodleContext;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import jd.b;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ve.a;
import ze.f;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public final NodleContext f3046a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3047b;

    /* renamed from: c  reason: collision with root package name */
    public final t9.b f3048c;

    /* renamed from: d  reason: collision with root package name */
    public final Logger f3049d = LoggerFactory.getLogger("SdkAgent");

    /* renamed from: e  reason: collision with root package name */
    public g9.c f3050e = new g9.c();

    /* renamed from: f  reason: collision with root package name */
    public a f3051f = new a(this);
    public ii.a g = new ii.a();

    public c(NodleContext nodleContext, f fVar, t9.b bVar) {
        e.D(nodleContext, "ctx");
        this.f3046a = nodleContext;
        this.f3047b = fVar;
        this.f3048c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009e, code lost:
        if (r5 == qd.a.COROUTINE_SUSPENDED) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c5, code lost:
        if (r5 == qd.a.COROUTINE_SUSPENDED) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(si.a r5, pd.d<? super md.m> r6) {
        /*
            r4 = this;
            java.util.List<java.lang.String> r0 = r5.f11151d
            java.lang.String r1 = "origin_cla"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x001b
            ze.f r0 = r4.f3047b
            hf.f r0 = (hf.f) r0
            ze.e r0 = r0.e()
            io.nodle.sdk.SdkMetricType r1 = io.nodle.sdk.SdkMetricType.DtnRxCount
            int r1 = r1.getId()
            r0.d(r1)
        L_0x001b:
            java.util.List<java.lang.String> r0 = r5.f11151d
            java.lang.String r1 = "origin_local"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0036
            ze.f r0 = r4.f3047b
            hf.f r0 = (hf.f) r0
            ze.e r0 = r0.e()
            io.nodle.sdk.SdkMetricType r1 = io.nodle.sdk.SdkMetricType.DtnTxCount
            int r1 = r1.getId()
            r0.d(r1)
        L_0x0036:
            java.util.List<java.lang.String> r0 = r5.f11151d
            java.lang.String r1 = "delivered"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0051
            ze.f r0 = r4.f3047b
            hf.f r0 = (hf.f) r0
            ze.e r0 = r0.e()
            io.nodle.sdk.SdkMetricType r1 = io.nodle.sdk.SdkMetricType.DtnDeliveredCount
            int r1 = r1.getId()
            r0.d(r1)
        L_0x0051:
            java.util.List<java.lang.String> r0 = r5.f11151d
            java.lang.String r1 = "forwarded"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x006c
            ze.f r0 = r4.f3047b
            hf.f r0 = (hf.f) r0
            ze.e r0 = r0.e()
            io.nodle.sdk.SdkMetricType r1 = io.nodle.sdk.SdkMetricType.DtnForwardedCount
            int r1 = r1.getId()
            r0.d(r1)
        L_0x006c:
            java.util.List<java.lang.String> r0 = r5.f11150c
            java.lang.String r1 = "forward_pending"
            boolean r0 = r0.contains(r1)
            r1 = 0
            java.lang.String r2 = "bundle:"
            if (r0 == 0) goto L_0x00a1
            java.util.List<java.lang.String> r0 = r5.f11150c
            java.lang.String r3 = "contraindicated"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00a1
            org.slf4j.Logger r0 = r4.f3049d
            java.lang.StringBuilder r2 = a.b.q(r2)
            java.lang.String r3 = " - forward later, put in storage"
            c3.k.w(r5, r2, r3, r0)
            java.util.List<java.lang.String> r0 = r5.f11151d
            r0.clear()
            c.a r0 = new c.a
            r0.<init>(r4, r5, r1)
            java.lang.Object r5 = c3.k.d0(r0, r6)
            qd.a r6 = qd.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L_0x00c8
            goto L_0x00ca
        L_0x00a1:
            org.slf4j.Logger r0 = r4.f3049d
            java.lang.StringBuilder r2 = a.b.q(r2)
            java.lang.String r3 = jc.b.e(r5)
            r2.append(r3)
            java.lang.String r3 = " - forget this bundle"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.debug(r2)
            c.b r0 = new c.b
            r0.<init>(r4, r5, r1)
            java.lang.Object r5 = c3.k.d0(r0, r6)
            qd.a r6 = qd.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            md.m r5 = md.m.f8555a
        L_0x00ca:
            qd.a r6 = qd.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L_0x00cf
            return r5
        L_0x00cf:
            md.m r5 = md.m.f8555a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a(si.a, pd.d):java.lang.Object");
    }

    public final Object c(xe.f fVar) {
        return Boolean.valueOf(((hf.f) this.f3047b).b().e(a.b.p(fVar)));
    }

    public final URI g() {
        return h(k.H(this.f3048c.a()));
    }

    public final URI h(qg.e eVar) {
        StringBuilder d10 = a.a.d("dtn://");
        byte[] encoded = eVar.getEncoded();
        e.C(encoded, "pub.encoded");
        d10.append(nd.f.M(encoded, c.a.f3000b));
        d10.append(".nodle.io/");
        URI create = URI.create(d10.toString());
        e.C(create, "create(\"dtn://${pub.encoded.toHex()}.nodle.io/\")");
        return create;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map<java.net.URI, si.d>, java.util.Map] */
    public final boolean i(URI uri) {
        e.D(uri, "eid");
        if (!e.r(uri.getAuthority(), g().getAuthority())) {
            a aVar = this.f3051f;
            ? r12 = aVar.f12467b;
            ArrayList arrayList = new ArrayList(r12.size());
            for (Map.Entry key : r12.entrySet()) {
                arrayList.add(aVar.a((URI) key.getKey()));
            }
            return arrayList.contains(uri);
        }
    }
}
