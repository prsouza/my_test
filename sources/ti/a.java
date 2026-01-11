package ti;

import ge.d0;
import l6.b1;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;
import rd.i;
import xd.p;
import xe.f;

public final class a {

    @e(c = "io.nodle.sdk.core.actions.cellular.CellPassKt", f = "CellPass.kt", l = {41}, m = "doCellPass")
    /* renamed from: ti.a$a  reason: collision with other inner class name */
    public static final class C0226a extends c {

        /* renamed from: a  reason: collision with root package name */
        public oi.a f11614a;

        /* renamed from: b  reason: collision with root package name */
        public d0 f11615b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f11616c;

        /* renamed from: s  reason: collision with root package name */
        public int f11617s;

        public C0226a(d<? super C0226a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f11616c = obj;
            this.f11617s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.a((oi.a) null, (d0) null, this);
        }
    }

    @e(c = "io.nodle.sdk.core.actions.cellular.CellPassKt$doCellPass$2", f = "CellPass.kt", l = {70}, m = "invokeSuspend")
    public static final class b extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f11618a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ oi.a f11619b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f11620c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(oi.a aVar, f fVar, d<? super b> dVar) {
            super(2, dVar);
            this.f11619b = aVar;
            this.f11620c = fVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f11619b, this.f11620c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            d0 d0Var = (d0) obj;
            return new b(this.f11619b, this.f11620c, (d) obj2).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f11618a;
            if (i == 0) {
                b1.w(obj);
                c.c cVar = this.f11619b.f9454e;
                f fVar = this.f11620c;
                this.f11618a = 1;
                if (cVar.f(fVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8555a;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7 = java.net.URI.create("dtn://nodle.io/cell/scan");
        e6.e.C(r7, "{\n        URI.create(default)\n    }");
        r12 = r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0169 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010e A[Catch:{ Exception -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(oi.a r24, ge.d0 r25, pd.d<? super md.m> r26) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof ti.a.C0226a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ti.a$a r3 = (ti.a.C0226a) r3
            int r4 = r3.f11617s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f11617s = r4
            goto L_0x001e
        L_0x0019:
            ti.a$a r3 = new ti.a$a
            r3.<init>(r2)
        L_0x001e:
            java.lang.Object r2 = r3.f11616c
            qd.a r4 = qd.a.COROUTINE_SUSPENDED
            int r5 = r3.f11617s
            r6 = 1
            if (r5 == 0) goto L_0x003e
            if (r5 != r6) goto L_0x0036
            ge.d0 r0 = r3.f11615b
            oi.a r1 = r3.f11614a
            l6.b1.w(r2)
            r23 = r1
            r1 = r0
            r0 = r23
            goto L_0x006e
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            l6.b1.w(r2)
            java.lang.String r2 = "<this>"
            e6.e.D(r0, r2)
            io.nodle.sdk.NodleContext r2 = r0.f9450a
            m2.a r2 = r2.getSdkConfig()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            a9.c r2 = (a9.c) r2
            java.lang.String r7 = "cell.enable"
            java.lang.Object r2 = r2.a(r7, r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0061
            md.m r0 = md.m.f8555a
            return r0
        L_0x0061:
            r3.f11614a = r0
            r3.f11615b = r1
            r3.f11617s = r6
            java.lang.Object r2 = xi.a.b(r0, r1, r3)
            if (r2 != r4) goto L_0x006e
            return r4
        L_0x006e:
            ji.l r2 = (ji.l) r2
            hi.a r3 = r0.f9456h     // Catch:{ Exception -> 0x01c5 }
            io.nodle.sdk.NodleContext r4 = r0.f9450a     // Catch:{ Exception -> 0x01c5 }
            ba.a r3 = (ba.a) r3     // Catch:{ Exception -> 0x01c5 }
            java.util.List r3 = r3.b(r4)     // Catch:{ Exception -> 0x01c5 }
            ji.b r4 = ji.b.f7267y     // Catch:{ Exception -> 0x01c5 }
            zb.r$a r4 = r4.c()     // Catch:{ Exception -> 0x01c5 }
            ji.b$a r4 = (ji.b.a) r4     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r5 = r0.f9451b     // Catch:{ Exception -> 0x01c5 }
            r4.k()     // Catch:{ Exception -> 0x01c5 }
            MessageType r7 = r4.f14359b     // Catch:{ Exception -> 0x01c5 }
            ji.b r7 = (ji.b) r7     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ Exception -> 0x01c5 }
            r7.f7270u = r5     // Catch:{ Exception -> 0x01c5 }
            c.c r5 = r0.f9454e     // Catch:{ Exception -> 0x01c5 }
            java.net.URI r5 = r5.g()     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r5 = r5.toASCIIString()     // Catch:{ Exception -> 0x01c5 }
            r4.k()     // Catch:{ Exception -> 0x01c5 }
            MessageType r7 = r4.f14359b     // Catch:{ Exception -> 0x01c5 }
            ji.b r7 = (ji.b) r7     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ Exception -> 0x01c5 }
            r7.f7271v = r5     // Catch:{ Exception -> 0x01c5 }
            java.util.List<java.lang.String> r8 = r0.f9455f     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r9 = ","
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 62
            java.lang.String r5 = nd.m.b1(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x01c5 }
            r4.k()     // Catch:{ Exception -> 0x01c5 }
            MessageType r7 = r4.f14359b     // Catch:{ Exception -> 0x01c5 }
            ji.b r7 = (ji.b) r7     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ Exception -> 0x01c5 }
            r7.f7272w = r5     // Catch:{ Exception -> 0x01c5 }
            io.nodle.sdk.NodleContext r5 = r0.f9450a     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r5 = r5.getGitSHA()     // Catch:{ Exception -> 0x01c5 }
            r4.k()     // Catch:{ Exception -> 0x01c5 }
            MessageType r7 = r4.f14359b     // Catch:{ Exception -> 0x01c5 }
            ji.b r7 = (ji.b) r7     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ Exception -> 0x01c5 }
            r7.f7273x = r5     // Catch:{ Exception -> 0x01c5 }
            ji.k r5 = ji.k.f7323v     // Catch:{ Exception -> 0x01c5 }
            zb.r$a r5 = r5.c()     // Catch:{ Exception -> 0x01c5 }
            ji.k$a r5 = (ji.k.a) r5     // Catch:{ Exception -> 0x01c5 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01c5 }
            r5.k()     // Catch:{ Exception -> 0x01c5 }
            MessageType r9 = r5.f14359b     // Catch:{ Exception -> 0x01c5 }
            ji.k r9 = (ji.k) r9     // Catch:{ Exception -> 0x01c5 }
            r9.f7325s = r7     // Catch:{ Exception -> 0x01c5 }
            r5.k()     // Catch:{ Exception -> 0x01c5 }
            MessageType r7 = r5.f14359b     // Catch:{ Exception -> 0x01c5 }
            ji.k r7 = (ji.k) r7     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ Exception -> 0x01c5 }
            r7.f7326t = r2     // Catch:{ Exception -> 0x01c5 }
            r5.k()     // Catch:{ Exception -> 0x01c5 }
            MessageType r2 = r5.f14359b     // Catch:{ Exception -> 0x01c5 }
            ji.k r2 = (ji.k) r2     // Catch:{ Exception -> 0x01c5 }
            zb.t$c<ji.j> r7 = r2.f7327u     // Catch:{ Exception -> 0x01c5 }
            r8 = r7
            zb.d r8 = (zb.d) r8     // Catch:{ Exception -> 0x01c5 }
            boolean r8 = r8.f14277a     // Catch:{ Exception -> 0x01c5 }
            if (r8 != 0) goto L_0x0114
            zb.t$c r7 = zb.r.k(r7)     // Catch:{ Exception -> 0x01c5 }
            r2.f7327u = r7     // Catch:{ Exception -> 0x01c5 }
        L_0x0114:
            zb.t$c<ji.j> r2 = r2.f7327u     // Catch:{ Exception -> 0x01c5 }
            zb.a.d(r3, r2)     // Catch:{ Exception -> 0x01c5 }
            zb.r r2 = r5.i()     // Catch:{ Exception -> 0x01c5 }
            ji.k r2 = (ji.k) r2     // Catch:{ Exception -> 0x01c5 }
            r4.k()     // Catch:{ Exception -> 0x01c5 }
            MessageType r3 = r4.f14359b     // Catch:{ Exception -> 0x01c5 }
            ji.b r3 = (ji.b) r3     // Catch:{ Exception -> 0x01c5 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ Exception -> 0x01c5 }
            r3.f7269t = r2     // Catch:{ Exception -> 0x01c5 }
            r2 = 6
            r3.f7268s = r2     // Catch:{ Exception -> 0x01c5 }
            zb.r r2 = r4.i()     // Catch:{ Exception -> 0x01c5 }
            ji.b r2 = (ji.b) r2     // Catch:{ Exception -> 0x01c5 }
            byte[] r2 = r2.e()     // Catch:{ Exception -> 0x01c5 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01c5 }
            t9.b r5 = r0.f9453d     // Catch:{ Exception -> 0x01c5 }
            c3.r r5 = r5.a()     // Catch:{ Exception -> 0x01c5 }
            c.c r7 = r0.f9454e     // Catch:{ Exception -> 0x01c5 }
            qg.e r8 = c3.k.H(r5)     // Catch:{ Exception -> 0x01c5 }
            java.net.URI r13 = r7.h(r8)     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r7 = "dtn://nodle.io/cell/scan"
            io.nodle.sdk.NodleContext r8 = r0.f9450a     // Catch:{ IllegalArgumentException -> 0x0169 }
            m2.a r8 = r8.getSdkConfig()     // Catch:{ IllegalArgumentException -> 0x0169 }
            java.lang.String r9 = "cell.eid.scan-sink"
            a9.c r8 = (a9.c) r8     // Catch:{ IllegalArgumentException -> 0x0169 }
            java.lang.Object r8 = r8.a(r9, r7)     // Catch:{ IllegalArgumentException -> 0x0169 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalArgumentException -> 0x0169 }
            java.net.URI r8 = java.net.URI.create(r8)     // Catch:{ IllegalArgumentException -> 0x0169 }
            java.lang.String r9 = "{\n        URI.create(ctx…an-sink\", default))\n    }"
            e6.e.C(r8, r9)     // Catch:{ IllegalArgumentException -> 0x0169 }
            r12 = r8
            goto L_0x0173
        L_0x0169:
            java.net.URI r7 = java.net.URI.create(r7)     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r8 = "{\n        URI.create(default)\n    }"
            e6.e.C(r7, r8)     // Catch:{ Exception -> 0x01c5 }
            r12 = r7
        L_0x0173:
            java.net.URI r14 = jc.b.h()     // Catch:{ Exception -> 0x01c5 }
            xe.q r22 = new xe.q     // Catch:{ Exception -> 0x01c5 }
            r8 = 0
            r9 = 0
            r11 = 0
            r17 = 0
            r19 = 604800000(0x240c8400, double:2.988109026E-315)
            r21 = 1671(0x687, float:2.342E-42)
            r7 = r22
            r15 = r3
            r7.<init>(r8, r9, r11, r12, r13, r14, r15, r17, r19, r21)     // Catch:{ Exception -> 0x01c5 }
            xe.f r7 = c3.k.I(r22)     // Catch:{ Exception -> 0x01c5 }
            xe.j r2 = aa.b.i(r2)     // Catch:{ Exception -> 0x01c5 }
            xe.i r8 = xe.i.NoCRC     // Catch:{ Exception -> 0x01c5 }
            java.lang.String r9 = "type"
            e6.e.D(r8, r9)     // Catch:{ Exception -> 0x01c5 }
            r2.f13211d = r8     // Catch:{ Exception -> 0x01c5 }
            a.b.u(r7, r2, r6)     // Catch:{ Exception -> 0x01c5 }
            qg.d r2 = c3.k.s(r5)     // Catch:{ Exception -> 0x01c5 }
            r5 = 2
            java.lang.Integer[] r5 = new java.lang.Integer[r5]     // Catch:{ Exception -> 0x01c5 }
            java.lang.Integer r8 = new java.lang.Integer     // Catch:{ Exception -> 0x01c5 }
            r9 = 0
            r8.<init>(r9)     // Catch:{ Exception -> 0x01c5 }
            r5[r9] = r8     // Catch:{ Exception -> 0x01c5 }
            java.lang.Integer r8 = new java.lang.Integer     // Catch:{ Exception -> 0x01c5 }
            r8.<init>(r6)     // Catch:{ Exception -> 0x01c5 }
            r5[r6] = r8     // Catch:{ Exception -> 0x01c5 }
            java.util.List r5 = a.b.o0(r5)     // Catch:{ Exception -> 0x01c5 }
            ad.c.j(r7, r2, r3, r5)     // Catch:{ Exception -> 0x01c5 }
            ti.a$b r2 = new ti.a$b     // Catch:{ Exception -> 0x01c5 }
            r3 = 0
            r2.<init>(r0, r7, r3)     // Catch:{ Exception -> 0x01c5 }
            r0 = 3
            ge.g.b(r1, r3, r2, r0)     // Catch:{ Exception -> 0x01c5 }
        L_0x01c5:
            md.m r0 = md.m.f8555a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.a.a(oi.a, ge.d0, pd.d):java.lang.Object");
    }
}
