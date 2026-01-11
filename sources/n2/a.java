package n2;

import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rd.c;
import rd.e;
import si.b;
import si.d;
import xe.f;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final oi.a f8869a;

    /* renamed from: b  reason: collision with root package name */
    public final Logger f8870b = LoggerFactory.getLogger("NodleCastAA");

    @e(c = "io.nodle.sdk.core.dtn.aa.nodlecast.NodleCastAA", f = "NodleCastAA.kt", l = {40}, m = "deliver")
    /* renamed from: n2.a$a  reason: collision with other inner class name */
    public static final class C0163a extends c {

        /* renamed from: a  reason: collision with root package name */
        public a f8871a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8872b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f8873c;

        /* renamed from: s  reason: collision with root package name */
        public int f8874s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0163a(a aVar, pd.d<? super C0163a> dVar) {
            super(dVar);
            this.f8873c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8872b = obj;
            this.f8874s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f8873c.b((f) null, this);
        }
    }

    public a(oi.a aVar) {
        e6.e.D(aVar, "core");
        this.f8869a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(xe.f r5, pd.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n2.a.C0163a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            n2.a$a r0 = (n2.a.C0163a) r0
            int r1 = r0.f8874s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8874s = r1
            goto L_0x0018
        L_0x0013:
            n2.a$a r0 = new n2.a$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8872b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f8874s
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            n2.a r5 = r0.f8871a
            l6.b1.w(r6)     // Catch:{ u -> 0x00ad }
            goto L_0x00a9
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            l6.b1.w(r6)
            oi.a r6 = r4.f8869a
            io.nodle.sdk.NodleContext r6 = r6.f9450a
            boolean r6 = ad.c.n(r5, r6)
            if (r6 != 0) goto L_0x0042
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x0042:
            oi.a r6 = r4.f8869a
            io.nodle.sdk.NodleContext r6 = r6.f9450a
            java.lang.String r2 = "ctx"
            e6.e.D(r6, r2)
            xe.q r2 = r5.f13195a
            java.net.URI r2 = r2.f13222e
            java.lang.String r2 = r2.getAuthority()
            java.lang.String r6 = ad.c.e(r6)
            boolean r6 = e6.e.r(r2, r6)
            if (r6 != 0) goto L_0x0060
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x0060:
            org.slf4j.Logger r6 = r4.f8870b
            java.lang.String r2 = "nodlecast-aa: received a signed bundle from nodle"
            r6.debug(r2)
            xe.j r5 = a.b.G(r5, r3)
            if (r5 != 0) goto L_0x006f
            r5 = 0
            goto L_0x0071
        L_0x006f:
            xe.p r5 = r5.f13212e
        L_0x0071:
            java.lang.String r6 = "null cannot be cast to non-null type io.nodle.dtn.bpv7.BlobBlockData{ io.nodle.dtn.bpv7.PayloadBlockKt.PayloadBlockData }"
            java.util.Objects.requireNonNull(r5, r6)
            xe.a r5 = (xe.a) r5
            byte[] r5 = r5.f13170a
            ji.a r6 = ji.a.A     // Catch:{ u -> 0x00ac }
            zb.r$a r6 = r6.c()     // Catch:{ u -> 0x00ac }
            ji.a$a r6 = (ji.a.C0128a) r6     // Catch:{ u -> 0x00ac }
            r6.d(r5)     // Catch:{ u -> 0x00ac }
            zb.r r5 = r6.i()     // Catch:{ u -> 0x00ac }
            ji.a r5 = (ji.a) r5     // Catch:{ u -> 0x00ac }
            org.slf4j.Logger r6 = r4.f8870b     // Catch:{ u -> 0x00ac }
            java.lang.String r2 = "nodlecast-aa: successfully deserialized a nodlecast order"
            r6.debug(r2)     // Catch:{ u -> 0x00ac }
            oi.a r6 = r4.f8869a     // Catch:{ u -> 0x00ac }
            r0.f8871a = r4     // Catch:{ u -> 0x00ac }
            r0.f8874s = r3     // Catch:{ u -> 0x00ac }
            ah.v r0 = r6.g     // Catch:{ u -> 0x00ac }
            io.nodle.sdk.NodleContext r6 = r6.f9450a     // Catch:{ u -> 0x00ac }
            java.lang.Object r5 = r0.f(r6, r5)     // Catch:{ u -> 0x00ac }
            if (r5 != r1) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            md.m r5 = md.m.f8555a     // Catch:{ u -> 0x00ac }
        L_0x00a5:
            if (r5 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ u -> 0x00ad }
            return r5
        L_0x00ac:
            r5 = r4
        L_0x00ad:
            org.slf4j.Logger r5 = r5.f8870b
            java.lang.String r6 = "nodlecast-aa: payload is not a nodlecast order"
            r5.debug(r6)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.b(xe.f, pd.d):java.lang.Object");
    }

    public final void c(b bVar) {
    }
}
