package jd;

import l6.b1;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.LoggerFactory;
import rd.e;
import rd.i;
import xd.p;
import xe.f;

public abstract class b implements si.c {

    @e(c = "io.nodle.dtn.BundleProtocolAgent", f = "BundleProtocolAgent.kt", l = {31, 32}, m = "checkDuplicate")
    public static final class a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f7172a;

        /* renamed from: b  reason: collision with root package name */
        public int f7173b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f7174c;

        /* renamed from: s  reason: collision with root package name */
        public f f7175s;

        /* renamed from: t  reason: collision with root package name */
        public p f7176t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, pd.d dVar) {
            super(dVar);
            this.f7174c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7172a = obj;
            this.f7173b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f7174c.b((f) null, (p<? super f, ? super pd.d<Object>, ? extends Object>) null, this);
        }
    }

    @e(c = "io.nodle.dtn.BundleProtocolAgent", f = "BundleProtocolAgent.kt", l = {41}, m = "processBundleTransmission")
    /* renamed from: jd.b$b  reason: collision with other inner class name */
    public static final class C0126b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f7177a;

        /* renamed from: b  reason: collision with root package name */
        public int f7178b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f7179c;

        /* renamed from: s  reason: collision with root package name */
        public si.a f7180s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0126b(b bVar, pd.d dVar) {
            super(dVar);
            this.f7179c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7177a = obj;
            this.f7178b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f7179c.d((f) null, this);
        }
    }

    @e(c = "io.nodle.dtn.BundleProtocolAgent", f = "BundleProtocolAgent.kt", l = {47}, m = "processReceivedBundle")
    public static final class c extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f7181a;

        /* renamed from: b  reason: collision with root package name */
        public int f7182b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f7183c;

        /* renamed from: s  reason: collision with root package name */
        public si.a f7184s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, pd.d dVar) {
            super(dVar);
            this.f7183c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7181a = obj;
            this.f7182b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f7183c.e((f) null, this);
        }
    }

    @e(c = "io.nodle.dtn.BundleProtocolAgent$transmit$2", f = "BundleProtocolAgent.kt", l = {18, 19}, m = "invokeSuspend")
    public static final class d extends i implements p<f, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f7185a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f7186b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f7187c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar, f fVar, pd.d dVar) {
            super(2, dVar);
            this.f7186b = bVar;
            this.f7187c = fVar;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            e6.e.D(dVar, "completion");
            return new d(this.f7186b, this.f7187c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create(obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f7185a;
            if (i == 0) {
                b1.w(obj);
                b bVar = this.f7186b;
                f fVar = this.f7187c;
                this.f7185a = 1;
                obj = bVar.d(fVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else if (i == 2) {
                b1.w(obj);
                return m.f8555a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar2 = this.f7186b;
            this.f7185a = 2;
            if (bVar2.a((si.a) obj, this) == aVar) {
                return aVar;
            }
            return m.f8555a;
        }
    }

    public b() {
        LoggerFactory.getLogger("BundleProtocolAgent");
    }

    public abstract Object a(si.a aVar, pd.d<? super m> dVar);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(xe.f r6, xd.p<? super xe.f, ? super pd.d<java.lang.Object>, ? extends java.lang.Object> r7, pd.d<? super md.m> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof jd.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            jd.b$a r0 = (jd.b.a) r0
            int r1 = r0.f7173b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7173b = r1
            goto L_0x0018
        L_0x0013:
            jd.b$a r0 = new jd.b$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f7172a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f7173b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            l6.b1.w(r8)
            goto L_0x007b
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            xd.p r7 = r0.f7176t
            xe.f r6 = r0.f7175s
            l6.b1.w(r8)
            goto L_0x004a
        L_0x003a:
            l6.b1.w(r8)
            r0.f7175s = r6
            r0.f7176t = r7
            r0.f7173b = r4
            java.lang.Object r8 = r5.c(r6)
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0060
            r8 = 0
            r0.f7175s = r8
            r0.f7176t = r8
            r0.f7173b = r3
            java.lang.Object r6 = r7.invoke(r6, r0)
            if (r6 != r1) goto L_0x007b
            return r1
        L_0x0060:
            org.slf4j.Logger r7 = jd.a.f7153a
            java.lang.String r8 = "bundle:"
            java.lang.StringBuilder r8 = a.b.q(r8)
            java.lang.String r6 = a.b.p(r6)
            r8.append(r6)
            java.lang.String r6 = " - duplicate bundle, ignore"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.debug(r6)
        L_0x007b:
            md.m r6 = md.m.f8555a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.b.b(xe.f, xd.p, pd.d):java.lang.Object");
    }

    public abstract Object c(f fVar);

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a9, code lost:
        if (r6 == r1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b7, code lost:
        if (r6 == r1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ba, code lost:
        r6 = md.m.f8555a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bc, code lost:
        if (r6 != r1) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00be, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(xe.f r6, pd.d<? super si.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jd.b.C0126b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            jd.b$b r0 = (jd.b.C0126b) r0
            int r1 = r0.f7178b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7178b = r1
            goto L_0x0018
        L_0x0013:
            jd.b$b r0 = new jd.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f7177a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f7178b
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            si.a r6 = r0.f7180s
            l6.b1.w(r7)
            goto L_0x00c0
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            l6.b1.w(r7)
            si.a r7 = new si.a
            r7.<init>(r6)
            java.util.List<java.lang.String> r6 = r7.f11151d
            java.lang.String r2 = "origin_local"
            r6.add(r2)
            r0.f7180s = r7
            r0.f7178b = r3
            org.slf4j.Logger r6 = jd.a.f7153a
            java.lang.String r2 = "bundle:"
            java.lang.StringBuilder r3 = a.b.q(r2)
            java.lang.String r4 = jc.b.e(r7)
            r3.append(r4)
            java.lang.String r4 = " - bundle transmission "
            r3.append(r4)
            xe.f r4 = r7.f11148a
            xe.q r4 = r4.f13195a
            java.net.URI r4 = r4.f13222e
            java.lang.String r4 = r4.toASCIIString()
            r3.append(r4)
            java.lang.String r4 = " -> "
            r3.append(r4)
            xe.f r4 = r7.f11148a
            xe.q r4 = r4.f13195a
            java.net.URI r4 = r4.f13221d
            java.lang.String r4 = r4.toASCIIString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r6.debug(r3)
            xe.f r3 = r7.f11148a
            xe.q r3 = r3.f13195a
            java.net.URI r3 = r3.f13222e
            boolean r3 = jc.b.m(r3)
            if (r3 != 0) goto L_0x00ac
            xe.f r3 = r7.f11148a
            xe.q r3 = r3.f13195a
            java.net.URI r3 = r3.f13222e
            r4 = r5
            c.c r4 = (c.c) r4
            boolean r3 = r4.i(r3)
            if (r3 != 0) goto L_0x00ac
            java.lang.StringBuilder r2 = a.b.q(r2)
            java.lang.String r3 = " - bundle's source is neither dtn:none nor a node's endpoint"
            c3.k.w(r7, r2, r3, r6)
            af.d r6 = af.d.NoInformation
            java.lang.Object r6 = jd.a.a(r4, r7, r6, r0)
            if (r6 != r1) goto L_0x00ba
            goto L_0x00bc
        L_0x00ac:
            java.util.List<java.lang.String> r6 = r7.f11150c
            java.lang.String r2 = "dispatch_pending"
            r6.add(r2)
            java.lang.Object r6 = jd.a.b(r5, r7, r0)
            if (r6 != r1) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            md.m r6 = md.m.f8555a
        L_0x00bc:
            if (r6 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            r6 = r7
        L_0x00c0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.b.d(xe.f, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(xe.f r5, pd.d<? super si.a> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jd.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            jd.b$c r0 = (jd.b.c) r0
            int r1 = r0.f7182b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7182b = r1
            goto L_0x0018
        L_0x0013:
            jd.b$c r0 = new jd.b$c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f7181a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f7182b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            si.a r5 = r0.f7184s
            l6.b1.w(r6)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            l6.b1.w(r6)
            si.a r6 = new si.a
            r6.<init>(r5)
            java.util.List<java.lang.String> r5 = r6.f11151d
            java.lang.String r2 = "origin_cla"
            r5.add(r2)
            r0.f7184s = r6
            r0.f7182b = r3
            java.lang.Object r5 = jd.a.d(r4, r6, r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r5 = r6
        L_0x004c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.b.e(xe.f, pd.d):java.lang.Object");
    }

    public final Object f(f fVar, pd.d<? super m> dVar) {
        Object b10 = b(fVar, new d(this, fVar, (pd.d) null), dVar);
        return b10 == qd.a.COROUTINE_SUSPENDED ? b10 : m.f8555a;
    }
}
