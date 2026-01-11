package jd;

import ah.v;
import c3.k;
import java.util.Iterator;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rd.e;
import xe.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7153a = LoggerFactory.getLogger("BundleProcessor");

    @e(c = "io.nodle.dtn.BundleProcessorKt", f = "BundleProcessor.kt", l = {218}, m = "bundleDeletion")
    /* renamed from: jd.a$a  reason: collision with other inner class name */
    public static final class C0125a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f7154a;

        /* renamed from: b  reason: collision with root package name */
        public int f7155b;

        /* renamed from: c  reason: collision with root package name */
        public si.a f7156c;

        public C0125a(pd.d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7154a = obj;
            this.f7155b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.a((b) null, (si.a) null, (af.d) null, this);
        }
    }

    @e(c = "io.nodle.dtn.BundleProcessorKt", f = "BundleProcessor.kt", l = {178, 189, 196, 205}, m = "bundleForwarding")
    public static final class b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f7157a;

        /* renamed from: b  reason: collision with root package name */
        public int f7158b;

        /* renamed from: c  reason: collision with root package name */
        public Object f7159c;

        /* renamed from: s  reason: collision with root package name */
        public si.a f7160s;

        public b(pd.d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7157a = obj;
            this.f7158b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.c((b) null, (si.a) null, this);
        }
    }

    @e(c = "io.nodle.dtn.BundleProcessorKt", f = "BundleProcessor.kt", l = {53, 83, 103, 108}, m = "bundleReceive")
    public static final class c extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f7161a;

        /* renamed from: b  reason: collision with root package name */
        public int f7162b;

        /* renamed from: c  reason: collision with root package name */
        public b f7163c;

        /* renamed from: s  reason: collision with root package name */
        public si.a f7164s;

        /* renamed from: t  reason: collision with root package name */
        public Iterator f7165t;

        /* renamed from: u  reason: collision with root package name */
        public j f7166u;

        /* renamed from: v  reason: collision with root package name */
        public Iterator f7167v;

        public c(pd.d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7161a = obj;
            this.f7162b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.d((b) null, (si.a) null, this);
        }
    }

    @e(c = "io.nodle.dtn.BundleProcessorKt", f = "BundleProcessor.kt", l = {137, 145}, m = "localDelivery")
    public static final class d extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f7168a;

        /* renamed from: b  reason: collision with root package name */
        public int f7169b;

        /* renamed from: c  reason: collision with root package name */
        public Object f7170c;

        /* renamed from: s  reason: collision with root package name */
        public si.a f7171s;

        public d(pd.d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f7168a = obj;
            this.f7169b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.e((b) null, (si.a) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(jd.b r7, si.a r8, af.d r9, pd.d<? super md.m> r10) {
        /*
            boolean r0 = r10 instanceof jd.a.C0125a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            jd.a$a r0 = (jd.a.C0125a) r0
            int r1 = r0.f7155b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7155b = r1
            goto L_0x0018
        L_0x0013:
            jd.a$a r0 = new jd.a$a
            r0.<init>(r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.f7154a
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r6.f7155b
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            si.a r8 = r6.f7156c
            l6.b1.w(r10)
            goto L_0x0061
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            l6.b1.w(r10)
            org.slf4j.Logger r10 = f7153a
            java.lang.String r1 = "bundle:"
            java.lang.StringBuilder r1 = a.b.q(r1)
            java.lang.String r3 = " - bundle deletion"
            c3.k.w(r8, r1, r3, r10)
            xe.f r10 = r8.f11148a
            xe.h r1 = xe.h.StatusRequestDeletion
            boolean r10 = ad.c.o(r10, r1)
            if (r10 == 0) goto L_0x0061
            r10 = r7
            c.c r10 = (c.c) r10
            g9.c r1 = r10.f3050e
            af.a r4 = af.a.DeletedBundle
            r6.f7156c = r8
            r6.f7155b = r2
            r2 = r7
            r3 = r8
            r5 = r9
            java.lang.Object r7 = r1.b(r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0061
            return r0
        L_0x0061:
            java.util.List<java.lang.String> r7 = r8.f11150c
            r7.clear()
            md.m r7 = md.m.f8555a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.a.a(jd.b, si.a, af.d, pd.d):java.lang.Object");
    }

    public static final Object b(b bVar, si.a aVar, pd.d<? super m> dVar) {
        k.w(aVar, a.b.q("bundle:"), " - dispatching bundle", f7153a);
        try {
            v.l(aVar.f11148a);
            c.c cVar = (c.c) bVar;
            if (cVar.i(aVar.f11148a.f13195a.f13221d)) {
                Object e10 = e(cVar, aVar, dVar);
                if (e10 == qd.a.COROUTINE_SUSPENDED) {
                    return e10;
                }
            } else {
                Object c10 = c(cVar, aVar, dVar);
                if (c10 == qd.a.COROUTINE_SUSPENDED) {
                    return c10;
                }
            }
            return m.f8555a;
        } catch (Exception e11) {
            Logger logger = f7153a;
            StringBuilder q10 = a.b.q("bundle:");
            q10.append(jc.b.e(aVar));
            q10.append(" - is invalid! ");
            q10.append(e11.getMessage());
            logger.debug(q10.toString());
            aVar.f11150c.clear();
            return m.f8555a;
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.util.Map<java.net.URI, si.e>, java.util.HashMap] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0287 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(jd.b r21, si.a r22, pd.d<? super md.m> r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof jd.a.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            jd.a$b r3 = (jd.a.b) r3
            int r4 = r3.f7158b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f7158b = r4
            goto L_0x001e
        L_0x0019:
            jd.a$b r3 = new jd.a$b
            r3.<init>(r2)
        L_0x001e:
            r9 = r3
            java.lang.Object r2 = r9.f7157a
            qd.a r3 = qd.a.COROUTINE_SUSPENDED
            int r4 = r9.f7158b
            r5 = 0
            r6 = 2
            java.lang.String r7 = "bundle:"
            r8 = 1
            r10 = 3
            r11 = 4
            if (r4 == 0) goto L_0x005c
            if (r4 == r8) goto L_0x0057
            if (r4 == r6) goto L_0x004c
            if (r4 == r10) goto L_0x0043
            if (r4 != r11) goto L_0x003b
            l6.b1.w(r2)
            goto L_0x0288
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            java.lang.Object r0 = r9.f7159c
            si.a r0 = (si.a) r0
            l6.b1.w(r2)
            goto L_0x0253
        L_0x004c:
            si.a r0 = r9.f7160s
            java.lang.Object r1 = r9.f7159c
            jd.b r1 = (jd.b) r1
            l6.b1.w(r2)
            goto L_0x021d
        L_0x0057:
            l6.b1.w(r2)
            goto L_0x012c
        L_0x005c:
            l6.b1.w(r2)
            org.slf4j.Logger r2 = f7153a
            java.lang.StringBuilder r4 = a.b.q(r7)
            java.lang.String r12 = " - bundle forwarding"
            c3.k.w(r1, r4, r12, r2)
            java.util.List<java.lang.String> r2 = r1.f11150c
            java.lang.String r4 = "forward_pending"
            r2.add(r4)
            java.util.List<java.lang.String> r2 = r1.f11150c
            java.lang.String r4 = "dispatch_pending"
            r2.remove(r4)
            xe.f r2 = r1.f11148a
            xe.d r4 = xe.d.HopCountBlock
            boolean r2 = a.b.z(r2, r4)
            java.lang.String r4 = "Collection contains no element matching the predicate."
            if (r2 == 0) goto L_0x00ec
            xe.f r2 = r1.f11148a
            java.lang.String r13 = "$this$getHopCountBlockData"
            e6.e.D(r2, r13)
            java.util.List<xe.j> r2 = r2.f13196b
            java.util.Iterator r2 = r2.iterator()
        L_0x0091:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x00e6
            java.lang.Object r13 = r2.next()
            xe.j r13 = (xe.j) r13
            int r14 = r13.f13208a
            r15 = 10
            if (r14 != r15) goto L_0x00a5
            r14 = r8
            goto L_0x00a6
        L_0x00a5:
            r14 = 0
        L_0x00a6:
            if (r14 == 0) goto L_0x0091
            xe.p r2 = r13.f13212e
            java.lang.String r13 = "null cannot be cast to non-null type io.nodle.dtn.bpv7.extensions.HopCountBlockData"
            java.util.Objects.requireNonNull(r2, r13)
            gi.b r2 = (gi.b) r2
            int r13 = r2.f5516b
            int r13 = r13 + r8
            r2.f5516b = r13
            org.slf4j.Logger r13 = f7153a
            java.lang.StringBuilder r14 = a.b.q(r7)
            java.lang.String r15 = jc.b.e(r22)
            r14.append(r15)
            java.lang.String r15 = " - contain hop count block"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.debug(r14)
            int r14 = r2.f5516b
            int r2 = r2.f5515a
            if (r14 <= r2) goto L_0x00d7
            r2 = r8
            goto L_0x00d8
        L_0x00d7:
            r2 = 0
        L_0x00d8:
            if (r2 == 0) goto L_0x00ec
            java.lang.StringBuilder r0 = a.b.q(r7)
            java.lang.String r2 = " - hop count exceeded"
            c3.k.w(r1, r0, r2, r13)
            md.m r0 = md.m.f8555a
            return r0
        L_0x00e6:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r4)
            throw r0
        L_0x00ec:
            xe.f r2 = r1.f11148a
            r13 = 7
            xe.j r2 = a.b.G(r2, r13)
            if (r2 == 0) goto L_0x010a
            long r13 = java.lang.System.currentTimeMillis()
            long r11 = r1.f11149b
            long r13 = r13 - r11
            xe.p r2 = r2.f13212e
            java.lang.String r11 = "null cannot be cast to non-null type io.nodle.dtn.bpv7.extensions.BundleAgeBlockData"
            java.util.Objects.requireNonNull(r2, r11)
            gi.a r2 = (gi.a) r2
            long r11 = r2.f5514a
            long r11 = r11 + r13
            r2.f5514a = r11
        L_0x010a:
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = jc.b.l(r22)
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x012f
            org.slf4j.Logger r2 = f7153a
            java.lang.StringBuilder r4 = a.b.q(r7)
            java.lang.String r5 = " - is expired"
            c3.k.w(r1, r4, r5, r2)
            af.d r2 = af.d.LifetimeExpired
            r9.f7158b = r8
            java.lang.Object r0 = a(r0, r1, r2, r9)
            if (r0 != r3) goto L_0x012c
            return r3
        L_0x012c:
            md.m r0 = md.m.f8555a
            return r0
        L_0x012f:
            xe.f r2 = r1.f11148a
            xe.d r11 = xe.d.PreviousNodeBlock
            boolean r2 = a.b.z(r2, r11)
            if (r2 == 0) goto L_0x0180
            xe.f r2 = r1.f11148a
            java.lang.String r11 = "$this$getPreviousNodeBlockData"
            e6.e.D(r2, r11)
            java.util.List<xe.j> r2 = r2.f13196b
            java.util.Iterator r2 = r2.iterator()
        L_0x0146:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x017a
            java.lang.Object r11 = r2.next()
            xe.j r11 = (xe.j) r11
            int r12 = r11.f13208a
            r13 = 6
            if (r12 != r13) goto L_0x0159
            r12 = r8
            goto L_0x015a
        L_0x0159:
            r12 = 0
        L_0x015a:
            if (r12 == 0) goto L_0x0146
            xe.p r2 = r11.f13212e
            java.lang.String r4 = "null cannot be cast to non-null type io.nodle.dtn.bpv7.extensions.PreviousNodeBlockData"
            java.util.Objects.requireNonNull(r2, r4)
            gi.d r2 = (gi.d) r2
            r4 = r0
            c.c r4 = (c.c) r4
            java.net.URI r4 = r4.g()
            r2.f5518a = r4
            org.slf4j.Logger r2 = f7153a
            java.lang.StringBuilder r4 = a.b.q(r7)
            java.lang.String r11 = " - previous node block updated"
            c3.k.w(r1, r4, r11, r2)
            goto L_0x01a7
        L_0x017a:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r4)
            throw r0
        L_0x0180:
            xe.f r2 = r1.f11148a
            r4 = r0
            c.c r4 = (c.c) r4
            java.net.URI r4 = r4.g()
            xe.j r14 = new xe.j
            gi.d r15 = new gi.d
            r15.<init>(r4)
            r12 = 6
            r13 = 0
            r16 = 0
            r4 = 0
            r18 = 14
            r11 = r14
            r10 = r14
            r19 = r15
            r14 = r16
            r16 = r4
            r17 = r19
            r11.<init>(r12, r13, r14, r16, r17, r18)
            a.b.u(r2, r10, r8)
        L_0x01a7:
            r2 = r0
            c.c r2 = (c.c) r2
            ii.a r2 = r2.g
            xe.f r4 = r1.f11148a
            java.util.Objects.requireNonNull(r2)
            java.lang.String r10 = "bundle"
            e6.e.D(r4, r10)
            java.util.Map<java.net.URI, si.e> r10 = r2.f6668b
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x01c0:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0205
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.net.URI r12 = (java.net.URI) r12
            java.lang.Object r11 = r11.getValue()
            si.e r11 = (si.e) r11
            xe.q r13 = r4.f13195a
            java.net.URI r13 = r13.f13221d
            boolean r12 = e6.e.r(r12, r13)
            if (r12 == 0) goto L_0x01c0
            org.slf4j.Logger r2 = r2.f6667a
            java.lang.String r10 = "route "
            java.lang.StringBuilder r10 = a.b.q(r10)
            java.net.URI r12 = r11.a()
            r10.append(r12)
            java.lang.String r12 = " found for bundle "
            r10.append(r12)
            int r4 = r4.hashCode()
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r2.debug(r4)
            goto L_0x0207
        L_0x0205:
            si.e r11 = r2.f6669c
        L_0x0207:
            if (r11 == 0) goto L_0x0260
            xe.f r2 = r1.f11148a
            r9.f7159c = r0
            r9.f7160s = r1
            r9.f7158b = r6
            java.lang.Object r2 = r11.b(r2, r9)
            if (r2 != r3) goto L_0x0218
            return r3
        L_0x0218:
            r20 = r1
            r1 = r0
            r0 = r20
        L_0x021d:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != r8) goto L_0x0261
            org.slf4j.Logger r2 = f7153a
            java.lang.StringBuilder r4 = a.b.q(r7)
            java.lang.String r6 = " - forwarding succeeded"
            c3.k.w(r0, r4, r6, r2)
            xe.f r2 = r0.f11148a
            xe.h r4 = xe.h.StatusRequestForward
            boolean r2 = ad.c.o(r2, r4)
            if (r2 == 0) goto L_0x0253
            r2 = r1
            c.c r2 = (c.c) r2
            g9.c r4 = r2.f3050e
            af.a r7 = af.a.ForwardedBundle
            af.d r8 = af.d.NoInformation
            r9.f7159c = r0
            r9.f7160s = r5
            r2 = 3
            r9.f7158b = r2
            r5 = r1
            r6 = r0
            java.lang.Object r1 = r4.b(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L_0x0253
            return r3
        L_0x0253:
            java.util.List<java.lang.String> r1 = r0.f11151d
            java.lang.String r2 = "forwarded"
            r1.add(r2)
            java.util.List<java.lang.String> r0 = r0.f11150c
            r0.clear()
            goto L_0x0288
        L_0x0260:
            r0 = r1
        L_0x0261:
            org.slf4j.Logger r1 = f7153a
            java.lang.StringBuilder r2 = a.b.q(r7)
            java.lang.String r4 = " - forwarding failed"
            c3.k.w(r0, r2, r4, r1)
            r9.f7159c = r5
            r9.f7160s = r5
            r2 = 4
            r9.f7158b = r2
            java.lang.StringBuilder r2 = a.b.q(r7)
            java.lang.String r4 = " - bundle marked for contraindication"
            c3.k.w(r0, r2, r4, r1)
            java.util.List<java.lang.String> r0 = r0.f11150c
            java.lang.String r1 = "contraindicated"
            r0.add(r1)
            md.m r0 = md.m.f8555a
            if (r0 != r3) goto L_0x0288
            return r3
        L_0x0288:
            md.m r0 = md.m.f8555a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.a.c(jd.b, si.a, pd.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: c.c} */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.util.HashMap, java.util.Map<java.lang.Integer, xd.l<p4.d, xe.p>>] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0143, code lost:
        r2 = f7153a;
        r3 = a.b.q(r16);
        r3.append(jc.b.e(r9));
        r3.append(r7);
        r3.append(r13);
        r3.append(r6.f13209b);
        r3.append(r7);
        r3.append(r12);
        r3.append(r6.f13208a);
        r3.append("  - block is unknown ");
        r2.debug(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0178, code lost:
        if (a.b.A(r6, xe.e.StatusReportIfNotProcessed) == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x017a, code lost:
        r3 = a.b.q(r16);
        r3.append(jc.b.e(r9));
        r3.append(r7);
        r3.append(r13);
        r3.append(r6.f13209b);
        r3.append(r7);
        r3.append(r12);
        r3.append(r6.f13208a);
        r3.append("  - unprocessed block requested reporting ");
        r2.debug(r3.toString());
        r2 = ((c.c) r0).f3050e;
        r5 = af.a.ReceivedBundle;
        r17 = af.d.BlockUnsupported;
        r10.f7163c = r0;
        r10.f7164s = r9;
        r10.f7165t = r8;
        r10.f7166u = r6;
        r10.f7167v = r1;
        r10.f7162b = r14;
        r18 = r6;
        r6 = r17;
        r17 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01c9, code lost:
        if (r2.b(r0, r9, r5, r6, r10) != r11) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01cb, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01cc, code lost:
        r18 = r6;
        r17 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d0, code lost:
        r7 = r17;
        r2 = r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0273 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0143 A[EDGE_INSN: B:61:0x0143->B:39:0x0143 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(jd.b r19, si.a r20, pd.d<? super md.m> r21) {
        /*
            r6 = r19
            r7 = r20
            r0 = r21
            boolean r1 = r0 instanceof jd.a.c
            if (r1 == 0) goto L_0x0019
            r1 = r0
            jd.a$c r1 = (jd.a.c) r1
            int r2 = r1.f7162b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0019
            int r2 = r2 - r3
            r1.f7162b = r2
            goto L_0x001e
        L_0x0019:
            jd.a$c r1 = new jd.a$c
            r1.<init>(r0)
        L_0x001e:
            r8 = r1
            java.lang.Object r0 = r8.f7161a
            qd.a r9 = qd.a.COROUTINE_SUSPENDED
            int r1 = r8.f7162b
            java.lang.String r10 = "type="
            java.lang.String r11 = "block: number="
            java.lang.String r12 = ", "
            java.lang.String r13 = "bundle:"
            r15 = 1
            r5 = 2
            r4 = 3
            r3 = 4
            if (r1 == 0) goto L_0x0071
            if (r1 == r15) goto L_0x0067
            if (r1 == r5) goto L_0x004d
            if (r1 == r4) goto L_0x0048
            if (r1 != r3) goto L_0x0040
            l6.b1.w(r0)
            goto L_0x0274
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            l6.b1.w(r0)
            goto L_0x025c
        L_0x004d:
            java.util.Iterator r1 = r8.f7167v
            xe.j r2 = r8.f7166u
            java.util.Iterator r6 = r8.f7165t
            si.a r7 = r8.f7164s
            jd.b r3 = r8.f7163c
            l6.b1.w(r0)
            r0 = r3
            r14 = r5
            r16 = r13
            r13 = r11
            r11 = r9
            r9 = r7
            r7 = r12
            r12 = r10
            r10 = r8
            r8 = r6
            goto L_0x01d4
        L_0x0067:
            si.a r1 = r8.f7164s
            jd.b r2 = r8.f7163c
            l6.b1.w(r0)
            r14 = r5
            goto L_0x00fc
        L_0x0071:
            l6.b1.w(r0)
            org.slf4j.Logger r0 = f7153a
            java.lang.StringBuilder r1 = a.b.q(r13)
            java.lang.String r2 = jc.b.e(r20)
            r1.append(r2)
            java.lang.String r2 = " - bundle receive "
            r1.append(r2)
            xe.f r2 = r7.f11148a
            xe.q r2 = r2.f13195a
            java.net.URI r2 = r2.f13222e
            java.lang.String r2 = r2.toASCIIString()
            r1.append(r2)
            java.lang.String r2 = " -> "
            r1.append(r2)
            xe.f r2 = r7.f11148a
            xe.q r2 = r2.f13195a
            java.net.URI r2 = r2.f13221d
            java.lang.String r2 = r2.toASCIIString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
            java.util.List<java.lang.String> r1 = r7.f11150c
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r15
            if (r1 == 0) goto L_0x00c1
            java.lang.StringBuilder r1 = a.b.q(r13)
            java.lang.String r2 = " - received bundle is already known"
            c3.k.w(r7, r1, r2, r0)
            md.m r0 = md.m.f8555a
            return r0
        L_0x00c1:
            java.util.List<java.lang.String> r1 = r7.f11150c
            java.lang.String r2 = "dispatch_pending"
            r1.add(r2)
            xe.f r1 = r7.f11148a
            xe.h r2 = xe.h.StatusRequestReception
            boolean r1 = ad.c.o(r1, r2)
            if (r1 == 0) goto L_0x00f9
            java.lang.StringBuilder r1 = a.b.q(r13)
            java.lang.String r2 = " - request reporting on reception"
            c3.k.w(r7, r1, r2, r0)
            r0 = r6
            c.c r0 = (c.c) r0
            g9.c r0 = r0.f3050e
            af.a r3 = af.a.ReceivedBundle
            af.d r16 = af.d.NoInformation
            r8.f7163c = r6
            r8.f7164s = r7
            r8.f7162b = r15
            r1 = r19
            r2 = r20
            r4 = r16
            r14 = r5
            r5 = r8
            java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x00fa
            return r9
        L_0x00f9:
            r14 = r5
        L_0x00fa:
            r2 = r6
            r1 = r7
        L_0x00fc:
            org.slf4j.Logger r0 = f7153a
            java.lang.StringBuilder r3 = a.b.q(r13)
            java.lang.String r4 = " - processing bundle"
            c3.k.w(r1, r3, r4, r0)
            xe.f r0 = r1.f11148a
            java.util.List<xe.j> r0 = r0.f13196b
            java.util.Iterator r0 = r0.iterator()
            r7 = r12
            r16 = r13
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r0
            r9 = r1
            r1 = r8
            r0 = r2
        L_0x011a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x025f
            java.lang.Object r2 = r1.next()
            r6 = r2
            xe.j r6 = (xe.j) r6
            xe.b r2 = xe.c.f13183a
            int r3 = r6.f13208a
            java.util.Objects.requireNonNull(r2)
            if (r3 == r15) goto L_0x013f
            java.util.Map<java.lang.Integer, xd.l<p4.d, xe.p>> r2 = r2.f13171a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            r2 = 0
            goto L_0x0140
        L_0x013f:
            r2 = r15
        L_0x0140:
            if (r2 == 0) goto L_0x0143
            goto L_0x011a
        L_0x0143:
            org.slf4j.Logger r2 = f7153a
            java.lang.StringBuilder r3 = a.b.q(r16)
            java.lang.String r4 = jc.b.e(r9)
            r3.append(r4)
            r3.append(r7)
            r3.append(r13)
            int r4 = r6.f13209b
            r3.append(r4)
            r3.append(r7)
            r3.append(r12)
            int r4 = r6.f13208a
            r3.append(r4)
            java.lang.String r4 = "  - block is unknown "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.debug(r3)
            xe.e r3 = xe.e.StatusReportIfNotProcessed
            boolean r3 = a.b.A(r6, r3)
            if (r3 == 0) goto L_0x01cc
            java.lang.StringBuilder r3 = a.b.q(r16)
            java.lang.String r4 = jc.b.e(r9)
            r3.append(r4)
            r3.append(r7)
            r3.append(r13)
            int r4 = r6.f13209b
            r3.append(r4)
            r3.append(r7)
            r3.append(r12)
            int r4 = r6.f13208a
            r3.append(r4)
            java.lang.String r4 = "  - unprocessed block requested reporting "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.debug(r3)
            r2 = r0
            c.c r2 = (c.c) r2
            g9.c r2 = r2.f3050e
            af.a r5 = af.a.ReceivedBundle
            af.d r17 = af.d.BlockUnsupported
            r10.f7163c = r0
            r10.f7164s = r9
            r10.f7165t = r8
            r10.f7166u = r6
            r10.f7167v = r1
            r10.f7162b = r14
            r3 = r0
            r4 = r9
            r18 = r6
            r6 = r17
            r17 = r7
            r7 = r10
            java.lang.Object r2 = r2.b(r3, r4, r5, r6, r7)
            if (r2 != r11) goto L_0x01d0
            return r11
        L_0x01cc:
            r18 = r6
            r17 = r7
        L_0x01d0:
            r7 = r17
            r2 = r18
        L_0x01d4:
            xe.e r3 = xe.e.DiscardIfNotProcessed
            boolean r3 = a.b.A(r2, r3)
            if (r3 == 0) goto L_0x020e
            org.slf4j.Logger r3 = f7153a
            java.lang.StringBuilder r4 = a.b.q(r16)
            java.lang.String r5 = jc.b.e(r9)
            r4.append(r5)
            r4.append(r7)
            r4.append(r13)
            int r5 = r2.f13209b
            r4.append(r5)
            r4.append(r7)
            r4.append(r12)
            int r5 = r2.f13208a
            r4.append(r5)
            java.lang.String r5 = "  - unprocessed block requested removal from bundle"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.debug(r4)
            r8.remove()
        L_0x020e:
            xe.e r3 = xe.e.DeleteBundleIfNotProcessed
            boolean r3 = a.b.A(r2, r3)
            if (r3 == 0) goto L_0x011a
            org.slf4j.Logger r1 = f7153a
            java.lang.StringBuilder r3 = a.b.q(r16)
            java.lang.String r4 = jc.b.e(r9)
            r3.append(r4)
            r3.append(r7)
            r3.append(r13)
            int r4 = r2.f13209b
            r3.append(r4)
            r3.append(r7)
            r3.append(r12)
            int r2 = r2.f13208a
            r3.append(r2)
            java.lang.String r2 = "  - unprocessed block requested bundle deletion"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.debug(r2)
            af.d r1 = af.d.BlockUnsupported
            r2 = 0
            r10.f7163c = r2
            r10.f7164s = r2
            r10.f7165t = r2
            r10.f7166u = r2
            r10.f7167v = r2
            r3 = 3
            r10.f7162b = r3
            java.lang.Object r0 = a(r0, r9, r1, r10)
            if (r0 != r11) goto L_0x025c
            return r11
        L_0x025c:
            md.m r0 = md.m.f8555a
            return r0
        L_0x025f:
            r2 = 0
            r10.f7163c = r2
            r10.f7164s = r2
            r10.f7165t = r2
            r10.f7166u = r2
            r10.f7167v = r2
            r1 = 4
            r10.f7162b = r1
            java.lang.Object r0 = b(r0, r9, r10)
            if (r0 != r11) goto L_0x0274
            return r11
        L_0x0274:
            md.m r0 = md.m.f8555a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.a.d(jd.b, si.a, pd.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.util.LinkedHashMap, java.util.Map<java.net.URI, si.d>] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(jd.b r12, si.a r13, pd.d<? super md.m> r14) {
        /*
            boolean r0 = r14 instanceof jd.a.d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            jd.a$d r0 = (jd.a.d) r0
            int r1 = r0.f7169b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7169b = r1
            goto L_0x0018
        L_0x0013:
            jd.a$d r0 = new jd.a$d
            r0.<init>(r14)
        L_0x0018:
            r6 = r0
            java.lang.Object r14 = r6.f7168a
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r6.f7169b
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.String r5 = "bundle:"
            if (r1 == 0) goto L_0x0049
            if (r1 == r4) goto L_0x003b
            if (r1 != r3) goto L_0x0033
            java.lang.Object r12 = r6.f7170c
            si.a r12 = (si.a) r12
            l6.b1.w(r14)
            goto L_0x0118
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003b:
            si.a r12 = r6.f7171s
            java.lang.Object r13 = r6.f7170c
            jd.b r13 = (jd.b) r13
            l6.b1.w(r14)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L_0x00d0
        L_0x0049:
            l6.b1.w(r14)
            org.slf4j.Logger r14 = f7153a
            java.lang.StringBuilder r1 = a.b.q(r5)
            java.lang.String r7 = " - local delivery"
            c3.k.w(r13, r1, r7, r14)
            java.util.List<java.lang.String> r14 = r13.f11150c
            java.lang.String r1 = "local_endpoint"
            r14.add(r1)
            r14 = r12
            c.c r14 = (c.c) r14
            ve.a r14 = r14.f3051f
            xe.f r1 = r13.f11148a
            java.util.Objects.requireNonNull(r14)
            java.lang.String r7 = "bundle"
            e6.e.D(r1, r7)
            java.util.Map<java.net.URI, si.d> r7 = r14.f12467b
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0077:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00be
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.net.URI r9 = (java.net.URI) r9
            java.lang.Object r8 = r8.getValue()
            si.d r8 = (si.d) r8
            xe.q r10 = r1.f13195a
            java.net.URI r10 = r10.f13221d
            boolean r10 = e6.e.r(r9, r10)
            if (r10 != 0) goto L_0x00a7
            java.net.URI r9 = r14.a(r9)
            xe.q r10 = r1.f13195a
            java.net.URI r10 = r10.f13221d
            boolean r9 = e6.e.r(r9, r10)
            if (r9 == 0) goto L_0x0077
        L_0x00a7:
            org.slf4j.Logger r14 = r14.f12466a
            java.lang.String r7 = "application agent found for bundle "
            java.lang.StringBuilder r7 = a.b.q(r7)
            java.lang.String r1 = a.b.p(r1)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r14.debug(r1)
            goto L_0x00bf
        L_0x00be:
            r8 = r2
        L_0x00bf:
            if (r8 == 0) goto L_0x010c
            xe.f r14 = r13.f11148a
            r6.f7170c = r12
            r6.f7171s = r13
            r6.f7169b = r4
            java.lang.Object r14 = r8.b(r14, r6)
            if (r14 != r0) goto L_0x00d0
            return r0
        L_0x00d0:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != r4) goto L_0x010c
            org.slf4j.Logger r14 = f7153a
            java.lang.StringBuilder r1 = a.b.q(r5)
            java.lang.String r4 = " - bundle is delivered"
            c3.k.w(r13, r1, r4, r14)
            java.util.List<java.lang.String> r14 = r13.f11151d
            java.lang.String r1 = "delivered"
            r14.add(r1)
            xe.f r14 = r13.f11148a
            xe.h r1 = xe.h.StatusRequestDelivery
            boolean r14 = ad.c.o(r14, r1)
            if (r14 == 0) goto L_0x0117
            r14 = r12
            c.c r14 = (c.c) r14
            g9.c r1 = r14.f3050e
            af.a r4 = af.a.DeliveredBundle
            af.d r5 = af.d.NoInformation
            r6.f7170c = r13
            r6.f7171s = r2
            r6.f7169b = r3
            r2 = r12
            r3 = r13
            java.lang.Object r12 = r1.b(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L_0x0117
            return r0
        L_0x010c:
            org.slf4j.Logger r12 = f7153a
            java.lang.StringBuilder r14 = a.b.q(r5)
            java.lang.String r0 = " - delivery unsuccessful"
            c3.k.w(r13, r14, r0, r12)
        L_0x0117:
            r12 = r13
        L_0x0118:
            java.util.List<java.lang.String> r12 = r12.f11150c
            r12.clear()
            md.m r12 = md.m.f8555a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.a.e(jd.b, si.a, pd.d):java.lang.Object");
    }
}
