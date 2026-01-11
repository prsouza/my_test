package qi;

import ah.v;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import ge.d0;
import ge.g;
import io.nodle.sdk.NodleContext;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l6.b1;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rd.i;
import xd.l;
import xd.p;
import xd.q;
import yd.h;
import yd.u;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f10453a;

    @rd.e(c = "io.nodle.sdk.core.actions.blescan.BlePassKt", f = "BlePass.kt", l = {256, 257, 269, 269, 269}, m = "checkForTarget")
    /* renamed from: qi.a$a  reason: collision with other inner class name */
    public static final class C0203a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public Object f10454a;

        /* renamed from: b  reason: collision with root package name */
        public Iterator f10455b;

        /* renamed from: c  reason: collision with root package name */
        public Map.Entry f10456c;

        /* renamed from: s  reason: collision with root package name */
        public di.b f10457s;

        /* renamed from: t  reason: collision with root package name */
        public /* synthetic */ Object f10458t;

        /* renamed from: u  reason: collision with root package name */
        public int f10459u;

        public C0203a(pd.d<? super C0203a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f10458t = obj;
            this.f10459u |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.c((oi.a) null, (List<c>) null, this);
        }
    }

    @rd.e(c = "io.nodle.sdk.core.actions.blescan.BlePassKt", f = "BlePass.kt", l = {78, 85, 87, 140, 143, 140, 143, 140, 143, 150}, m = "doBlePass")
    public static final class b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public Object f10460a;

        /* renamed from: b  reason: collision with root package name */
        public Object f10461b;

        /* renamed from: c  reason: collision with root package name */
        public u f10462c;

        /* renamed from: s  reason: collision with root package name */
        public bc.f f10463s;

        /* renamed from: t  reason: collision with root package name */
        public u f10464t;

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f10465u;

        /* renamed from: v  reason: collision with root package name */
        public int f10466v;

        public b(pd.d<? super b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f10465u = obj;
            this.f10466v |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.b((oi.a) null, (d0) null, this);
        }
    }

    @rd.e(c = "io.nodle.sdk.core.actions.blescan.BlePassKt$doBlePass$2$1", f = "BlePass.kt", l = {129}, m = "invokeSuspend")
    public static final class c extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f10467a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ oi.a f10468b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ xe.f f10469c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(oi.a aVar, xe.f fVar, pd.d<? super c> dVar) {
            super(2, dVar);
            this.f10468b = aVar;
            this.f10469c = fVar;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new c(this.f10468b, this.f10469c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            d0 d0Var = (d0) obj;
            return new c(this.f10468b, this.f10469c, (pd.d) obj2).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f10467a;
            if (i == 0) {
                b1.w(obj);
                c.c cVar = this.f10468b.f9454e;
                xe.f fVar = this.f10469c;
                this.f10467a = 1;
                if (cVar.f(fVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.f10453a.debug("Transmiting bundles");
            return m.f8555a;
        }
    }

    @rd.e(c = "io.nodle.sdk.core.actions.blescan.BlePassKt$doBlePass$2$2", f = "BlePass.kt", l = {140}, m = "invokeSuspend")
    public static final class d extends i implements l<pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f10470a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ oi.a f10471b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u<List<c>> f10472c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(oi.a aVar, u<List<c>> uVar, pd.d<? super d> dVar) {
            super(1, dVar);
            this.f10471b = aVar;
            this.f10472c = uVar;
        }

        public final pd.d<m> create(pd.d<?> dVar) {
            return new d(this.f10471b, this.f10472c, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f10470a;
            if (i == 0) {
                b1.w(obj);
                this.f10470a = 1;
                if (a.c(this.f10471b, (List) this.f10472c.f13622a, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8555a;
        }

        public final Object k(Object obj) {
            return new d(this.f10471b, this.f10472c, (pd.d) obj).invokeSuspend(m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.sdk.core.actions.blescan.BlePassKt", f = "BlePass.kt", l = {199}, m = "getListOfBleRecords")
    public static final class e extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList f10473a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10474b;

        /* renamed from: c  reason: collision with root package name */
        public int f10475c;

        public e(pd.d<? super e> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f10474b = obj;
            this.f10475c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.a((oi.a) null, (bc.f) null, (d0) null, this);
        }
    }

    @rd.e(c = "io.nodle.sdk.core.actions.blescan.BlePassKt$getListOfBleRecords$2", f = "BlePass.kt", l = {164}, m = "invokeSuspend")
    public static final class f extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f10476a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10477b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ oi.a f10478c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ ne.b f10479s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ bc.f f10480t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ List<c> f10481u;

        /* renamed from: qi.a$f$a  reason: collision with other inner class name */
        public static final class C0204a extends h implements q<di.a, Integer, di.c, m> {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d0 f10482b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ne.b f10483c;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ HashSet<String> f10484s;

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ oi.a f10485t;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ bc.f f10486u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ List<c> f10487v;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0204a(d0 d0Var, ne.b bVar, HashSet<String> hashSet, oi.a aVar, bc.f fVar, List<c> list) {
                super(3);
                this.f10482b = d0Var;
                this.f10483c = bVar;
                this.f10484s = hashSet;
                this.f10485t = aVar;
                this.f10486u = fVar;
                this.f10487v = list;
            }

            public final Object h(Object obj, Object obj2, Object obj3) {
                di.a aVar = (di.a) obj;
                int intValue = ((Number) obj2).intValue();
                di.c cVar = (di.c) obj3;
                e6.e.D(aVar, GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG);
                e6.e.D(cVar, "s");
                g.b(this.f10482b, (pd.f) null, new b(aVar, cVar, this.f10483c, this.f10484s, this.f10485t, this.f10486u, intValue, this.f10487v, (pd.d<? super b>) null), 3);
                return m.f8555a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(oi.a aVar, ne.b bVar, bc.f fVar, List<c> list, pd.d<? super f> dVar) {
            super(2, dVar);
            this.f10478c = aVar;
            this.f10479s = bVar;
            this.f10480t = fVar;
            this.f10481u = list;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            f fVar = new f(this.f10478c, this.f10479s, this.f10480t, this.f10481u, dVar);
            fVar.f10477b = obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((f) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f10476a;
            if (i == 0) {
                b1.w(obj);
                HashSet hashSet = new HashSet();
                oi.a aVar2 = this.f10478c;
                v vVar = aVar2.g;
                NodleContext nodleContext = aVar2.f9450a;
                long e10 = a.e(aVar2);
                C0204a aVar3 = new C0204a((d0) this.f10477b, this.f10479s, hashSet, this.f10478c, this.f10480t, this.f10481u);
                this.f10476a = 1;
                Objects.requireNonNull(vVar);
                if (y9.f.a(nodleContext, e10, aVar3, this) == aVar) {
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

    static {
        Logger logger = LoggerFactory.getLogger("BlePass");
        e6.e.C(logger, "getLogger(\"BlePass\")");
        f10453a = logger;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(oi.a r10, bc.f r11, ge.d0 r12, pd.d<? super java.util.List<qi.c>> r13) {
        /*
            boolean r0 = r13 instanceof qi.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r13
            qi.a$e r0 = (qi.a.e) r0
            int r1 = r0.f10475c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10475c = r1
            goto L_0x0018
        L_0x0013:
            qi.a$e r0 = new qi.a$e
            r0.<init>(r13)
        L_0x0018:
            java.lang.Object r13 = r0.f10474b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f10475c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.ArrayList r10 = r0.f10473a
            l6.b1.w(r13)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            l6.b1.w(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            ne.b r6 = ge.g0.i()
            qi.a$f r2 = new qi.a$f
            r9 = 0
            r4 = r2
            r5 = r10
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r10 = 0
            r11 = 3
            ge.g1 r10 = ge.g.b(r12, r10, r2, r11)
            r0.f10473a = r13
            r0.f10475c = r3
            ge.l1 r10 = (ge.l1) r10
            java.lang.Object r10 = r10.t(r0)
            if (r10 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r10 = r13
        L_0x005b:
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            java.lang.String r11 = "unmodifiableList(peers)"
            e6.e.C(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.a.a(oi.a, bc.f, ge.d0, pd.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: oi.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03a9, code lost:
        return java.lang.Boolean.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03cd, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03ce, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03cf, code lost:
        r1 = r4.f9457j;
        r4 = new yb.a(xb.c.BleStopSearching);
        r2.f10460a = r0;
        r2.f10461b = null;
        r2.f10466v = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03e4, code lost:
        if (r1.a(r4, r2) == r3) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03e6, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03e7, code lost:
        f10453a.debug(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03ec, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        r4 = bc.g.b().a(r13.f9450a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010b, code lost:
        if (r4 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010d, code lost:
        r1 = null;
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        r40 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r5 = xi.a.a(r13);
        r2.f10460a = r13;
        r2.f10461b = r14;
        r2.f10462c = r1;
        r2.f10463s = r4;
        r2.f10466v = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0125, code lost:
        if (r4.b(r5, r2) != r3) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0127, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0128, code lost:
        r37 = r13;
        r13 = r1;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r2.f10460a = r1;
        r2.f10461b = r14;
        r2.f10462c = r13;
        r2.f10463s = r4;
        r2.f10464t = r13;
        r2.f10466v = 3;
        r0 = a(r1, r4, r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013d, code lost:
        if (r0 != r3) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0140, code lost:
        r5 = r1;
        r1 = r0;
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r0.f13622a = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014e, code lost:
        if ((!r13.f13622a.isEmpty()) == false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0150, code lost:
        r0 = nd.m.l1(r5.f9455f);
        r6 = (java.util.ArrayList) r0;
        r6.add(e6.e.a0("b:", r5.f9450a.batteryLevel()));
        r6.add(e6.e.a0("h:", ad.c.f(r5.f9450a.getHardware())));
        r6.add(e6.e.a0("a:", ad.c.f(r5.f9450a.getApplicationName())));
        r6.add(e6.e.a0("i:", new java.lang.Long(f(r5))));
        r6.add(e6.e.a0("d:", new java.lang.Long(e(r5))));
        f10453a.debug(e6.e.a0("Payload Additional Context - ", nd.m.b1(r0, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (xd.l) null, 62)));
        r1 = (ji.b.a) ji.b.f7267y.c();
        r6 = r5.f9451b;
        r1.k();
        r9 = r1.f14359b;
        java.util.Objects.requireNonNull(r9);
        java.util.Objects.requireNonNull(r6);
        r9.f7270u = r6;
        r6 = r5.f9454e.g().toASCIIString();
        r1.k();
        r9 = r1.f14359b;
        java.util.Objects.requireNonNull(r9);
        java.util.Objects.requireNonNull(r6);
        r9.f7271v = r6;
        r0 = nd.m.b1(r0, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (xd.l) null, 62);
        r1.k();
        r6 = r1.f14359b;
        java.util.Objects.requireNonNull(r6);
        r6.f7272w = r0;
        r0 = r5.f9450a.getGitSHA();
        r1.k();
        r6 = r1.f14359b;
        java.util.Objects.requireNonNull(r6);
        java.util.Objects.requireNonNull(r0);
        r6.f7273x = r0;
        r0 = (ji.d.a) ji.d.f7281t.c();
        r6 = r13.f13622a;
        r9 = new java.util.ArrayList(nd.g.S0(r6));
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x024d, code lost:
        if (r6.hasNext() == false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x024f, code lost:
        r9.add(((qi.c) r6.next()).f10500c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x025b, code lost:
        r0.l(r9);
        r1.k();
        r6 = r1.f14359b;
        java.util.Objects.requireNonNull(r6);
        r6.f7269t = (ji.d) r0.i();
        r6.f7268s = 5;
        r0 = ((ji.b) r1.i()).e();
        r1 = r5.f9453d.a();
        r9 = java.lang.System.currentTimeMillis();
        r6 = c3.k.I(new xe.q(0, 0, (xe.i) null, d(r5), r5.f9454e.h(c3.k.H(r1)), jc.b.h(), r9, 0, 604800000, 1671));
        r0 = aa.b.i(r0);
        r15 = xe.i.NoCRC;
        e6.e.D(r15, "type");
        r0.f13211d = r15;
        a.b.u(r6, r0, true);
        r0 = c3.k.s(r1);
        r1 = new java.lang.Integer[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02ca, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r1[0] = new java.lang.Integer(0);
        r1[1] = new java.lang.Integer(1);
        ad.c.j(r6, r0, r9, a.b.o0(r1));
        ge.g.b(r14, (pd.f) null, new qi.a.c(r5, r6, (pd.d<? super qi.a.c>) null), 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02ef, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02f0, code lost:
        r4.stop();
        r0 = new qi.a.d(r5, r13, (pd.d<? super qi.a.d>) null);
        r2.f10460a = r5;
        r2.f10461b = null;
        r2.f10462c = null;
        r2.f10463s = null;
        r2.f10464t = null;
        r2.f10466v = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0309, code lost:
        if (bf.b.a(r0, r2) != r3) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x030b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x030c, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x030d, code lost:
        r1 = r0.f9457j;
        r4 = new yb.a(xb.c.BleStopSearching);
        r2.f10460a = r0;
        r2.f10466v = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x031f, code lost:
        if (r1.a(r4, r2) != r3) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0321, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0322, code lost:
        r6 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0325, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0326, code lost:
        r6 = r40;
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0329, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x032c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x032d, code lost:
        r11 = false;
        r37 = r13;
        r13 = r1;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0334, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0335, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0337, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0338, code lost:
        r6 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x033c, code lost:
        r5 = r13;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0362, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0363, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0364, code lost:
        r1 = r0.f9457j;
        r4 = new yb.a(xb.c.BleStopSearching);
        r2.f10460a = r0;
        r2.f10466v = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0376, code lost:
        if (r1.a(r4, r2) == r3) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0378, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0379, code lost:
        f10453a.debug(r40);
        r1 = java.lang.Boolean.TRUE;
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0383, code lost:
        if (r1 == null) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0385, code lost:
        r0 = r13.f9457j;
        r1 = new yb.a(xb.c.BleStopSearching);
        r2.f10460a = null;
        r2.f10461b = null;
        r2.f10462c = null;
        r2.f10466v = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x039c, code lost:
        if (r0.a(r1, r2) == r3) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x039e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x039f, code lost:
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03a1, code lost:
        r10 = r1.booleanValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02e8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:51:0x0143] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0362 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(oi.a r38, ge.d0 r39, pd.d<? super java.lang.Boolean> r40) {
        /*
            r0 = r38
            r1 = r40
            boolean r2 = r1 instanceof qi.a.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            qi.a$b r2 = (qi.a.b) r2
            int r3 = r2.f10466v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f10466v = r3
            goto L_0x001c
        L_0x0017:
            qi.a$b r2 = new qi.a$b
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.f10465u
            qd.a r3 = qd.a.COROUTINE_SUSPENDED
            int r4 = r2.f10466v
            java.lang.String r6 = "BLE Pass Success"
            r7 = 5
            r8 = 1
            r9 = 3
            r11 = 2
            r12 = 0
            switch(r4) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00aa;
                case 2: goto L_0x008a;
                case 3: goto L_0x0074;
                case 4: goto L_0x0068;
                case 5: goto L_0x005c;
                case 6: goto L_0x0050;
                case 7: goto L_0x005c;
                case 8: goto L_0x0043;
                case 9: goto L_0x003a;
                case 10: goto L_0x0034;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            l6.b1.w(r1)
            r11 = 0
            goto L_0x039f
        L_0x003a:
            java.lang.Object r0 = r2.f10460a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            l6.b1.w(r1)
            goto L_0x03e7
        L_0x0043:
            java.lang.Object r0 = r2.f10461b
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r4 = r2.f10460a
            oi.a r4 = (oi.a) r4
            l6.b1.w(r1)
            goto L_0x03cf
        L_0x0050:
            java.lang.Object r0 = r2.f10460a
            oi.a r0 = (oi.a) r0
            l6.b1.w(r1)
            r40 = r6
            r11 = 0
            goto L_0x0364
        L_0x005c:
            java.lang.Object r0 = r2.f10460a
            oi.a r0 = (oi.a) r0
            l6.b1.w(r1)
            r40 = r6
            r11 = 0
            goto L_0x0379
        L_0x0068:
            java.lang.Object r0 = r2.f10460a
            oi.a r0 = (oi.a) r0
            l6.b1.w(r1)
            r40 = r6
            r11 = 0
            goto L_0x030d
        L_0x0074:
            yd.u r0 = r2.f10464t
            bc.f r4 = r2.f10463s
            yd.u r13 = r2.f10462c
            java.lang.Object r14 = r2.f10461b
            ge.d0 r14 = (ge.d0) r14
            java.lang.Object r15 = r2.f10460a
            oi.a r15 = (oi.a) r15
            l6.b1.w(r1)     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            r40 = r6
            r5 = r15
            goto L_0x0143
        L_0x008a:
            bc.f r4 = r2.f10463s
            yd.u r13 = r2.f10462c
            java.lang.Object r0 = r2.f10461b
            ge.d0 r0 = (ge.d0) r0
            java.lang.Object r14 = r2.f10460a
            r15 = r14
            oi.a r15 = (oi.a) r15
            l6.b1.w(r1)     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            r14 = r0
            r40 = r6
            r1 = r15
            goto L_0x012d
        L_0x00a0:
            r0 = move-exception
            goto L_0x03ae
        L_0x00a3:
            r0 = move-exception
            r40 = r6
            r5 = r15
        L_0x00a7:
            r11 = 0
            goto L_0x033e
        L_0x00aa:
            yd.u r0 = r2.f10462c
            java.lang.Object r4 = r2.f10461b
            ge.d0 r4 = (ge.d0) r4
            java.lang.Object r13 = r2.f10460a
            oi.a r13 = (oi.a) r13
            l6.b1.w(r1)
            r1 = r0
            r14 = r4
            goto L_0x0101
        L_0x00ba:
            l6.b1.w(r1)
            java.lang.String r1 = "<this>"
            e6.e.D(r0, r1)
            io.nodle.sdk.NodleContext r1 = r0.f9450a
            m2.a r1 = r1.getSdkConfig()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            a9.c r1 = (a9.c) r1
            java.lang.String r13 = "ble.enable"
            java.lang.Object r1 = r1.a(r13, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00dd
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x00dd:
            yd.u r1 = new yd.u
            r1.<init>()
            nd.o r4 = nd.o.f8966a
            r1.f13622a = r4
            je.h<xb.b> r4 = r0.f9457j
            yb.a r13 = new yb.a
            xb.c r14 = xb.c.BleStartSearching
            r13.<init>(r14)
            r2.f10460a = r0
            r14 = r39
            r2.f10461b = r14
            r2.f10462c = r1
            r2.f10466v = r8
            java.lang.Object r4 = r4.a(r13, r2)
            if (r4 != r3) goto L_0x0100
            return r3
        L_0x0100:
            r13 = r0
        L_0x0101:
            bc.b r0 = bc.g.b()
            io.nodle.sdk.NodleContext r4 = r13.f9450a
            bc.f r4 = r0.a(r4)
            if (r4 != 0) goto L_0x0111
            r1 = r12
            r11 = 0
            goto L_0x0383
        L_0x0111:
            r40 = r6
            long r5 = xi.a.a(r13)     // Catch:{ Exception -> 0x0334, all -> 0x0337 }
            r2.f10460a = r13     // Catch:{ Exception -> 0x0334, all -> 0x0337 }
            r2.f10461b = r14     // Catch:{ Exception -> 0x0334, all -> 0x0337 }
            r2.f10462c = r1     // Catch:{ Exception -> 0x0334, all -> 0x0337 }
            r2.f10463s = r4     // Catch:{ Exception -> 0x0334, all -> 0x0337 }
            r2.f10466v = r11     // Catch:{ Exception -> 0x0334, all -> 0x0337 }
            java.lang.Object r0 = r4.b(r5, r2)     // Catch:{ Exception -> 0x0334, all -> 0x0337 }
            if (r0 != r3) goto L_0x0128
            return r3
        L_0x0128:
            r37 = r13
            r13 = r1
            r1 = r37
        L_0x012d:
            r2.f10460a = r1     // Catch:{ Exception -> 0x032c, all -> 0x0325 }
            r2.f10461b = r14     // Catch:{ Exception -> 0x032c, all -> 0x0325 }
            r2.f10462c = r13     // Catch:{ Exception -> 0x032c, all -> 0x0325 }
            r2.f10463s = r4     // Catch:{ Exception -> 0x032c, all -> 0x0325 }
            r2.f10464t = r13     // Catch:{ Exception -> 0x032c, all -> 0x0325 }
            r2.f10466v = r9     // Catch:{ Exception -> 0x032c, all -> 0x0325 }
            java.lang.Object r0 = a(r1, r4, r14, r2)     // Catch:{ Exception -> 0x032c, all -> 0x0325 }
            if (r0 != r3) goto L_0x0140
            return r3
        L_0x0140:
            r5 = r1
            r1 = r0
            r0 = r13
        L_0x0143:
            r0.f13622a = r1     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            T r0 = r13.f13622a     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x02ef
            java.util.List<java.lang.String> r0 = r5.f9455f     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.List r0 = nd.m.l1(r0)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = "b:"
            io.nodle.sdk.NodleContext r6 = r5.f9450a     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.Integer r6 = r6.batteryLevel()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = e6.e.a0(r1, r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.add(r1)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = "h:"
            io.nodle.sdk.NodleContext r15 = r5.f9450a     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r15 = r15.getHardware()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r15 = ad.c.f(r15)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = e6.e.a0(r1, r15)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.add(r1)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = "a:"
            io.nodle.sdk.NodleContext r15 = r5.f9450a     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r15 = r15.getApplicationName()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r15 = ad.c.f(r15)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = e6.e.a0(r1, r15)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.add(r1)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = "i:"
            long r9 = f(r5)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.Long r15 = new java.lang.Long     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r15.<init>(r9)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = e6.e.a0(r1, r15)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.add(r1)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = "d:"
            long r9 = e(r5)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.Long r15 = new java.lang.Long     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r15.<init>(r9)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r1 = e6.e.a0(r1, r15)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.add(r1)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            org.slf4j.Logger r1 = f10453a     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r6 = "Payload Additional Context - "
            java.lang.String r17 = ","
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r16 = r0
            java.lang.String r9 = nd.m.b1(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r6 = e6.e.a0(r6, r9)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r1.debug(r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.b r1 = ji.b.f7267y     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            zb.r$a r1 = r1.c()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.b$a r1 = (ji.b.a) r1     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r6 = r5.f9451b     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r1.k()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            MessageType r9 = r1.f14359b     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.b r9 = (ji.b) r9     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Objects.requireNonNull(r9)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r9.f7270u = r6     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            c.c r6 = r5.f9454e     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.net.URI r6 = r6.g()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r6 = r6.toASCIIString()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r1.k()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            MessageType r9 = r1.f14359b     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.b r9 = (ji.b) r9     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Objects.requireNonNull(r9)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r9.f7271v = r6     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r17 = ","
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r16 = r0
            java.lang.String r0 = nd.m.b1(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r1.k()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            MessageType r6 = r1.f14359b     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.b r6 = (ji.b) r6     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.f7272w = r0     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            io.nodle.sdk.NodleContext r0 = r5.f9450a     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r0 = r0.getGitSHA()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r1.k()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            MessageType r6 = r1.f14359b     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.b r6 = (ji.b) r6     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.f7273x = r0     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.d r0 = ji.d.f7281t     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            zb.r$a r0 = r0.c()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.d$a r0 = (ji.d.a) r0     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            T r6 = r13.f13622a     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            int r10 = nd.g.S0(r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r9.<init>(r10)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
        L_0x0249:
            boolean r10 = r6.hasNext()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            if (r10 == 0) goto L_0x025b
            java.lang.Object r10 = r6.next()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            qi.c r10 = (qi.c) r10     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.c r10 = r10.f10500c     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r9.add(r10)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            goto L_0x0249
        L_0x025b:
            r0.l(r9)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            zb.r r0 = r0.i()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.d r0 = (ji.d) r0     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r1.k()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            MessageType r6 = r1.f14359b     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.b r6 = (ji.b) r6     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.f7269t = r0     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r6.f7268s = r7     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            zb.r r0 = r1.i()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            ji.b r0 = (ji.b) r0     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            byte[] r0 = r0.e()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            t9.b r1 = r5.f9453d     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            c3.r r1 = r1.a()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            c.c r6 = r5.f9454e     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            qg.e r15 = c3.k.H(r1)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.net.URI r28 = r6.h(r15)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.net.URI r27 = d(r5)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.net.URI r29 = jc.b.h()     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            xe.q r6 = new xe.q     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r23 = 0
            r24 = 0
            r26 = 0
            r32 = 0
            r34 = 604800000(0x240c8400, double:2.988109026E-315)
            r36 = 1671(0x687, float:2.342E-42)
            r22 = r6
            r30 = r9
            r22.<init>(r23, r24, r26, r27, r28, r29, r30, r32, r34, r36)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            xe.f r6 = c3.k.I(r6)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            xe.j r0 = aa.b.i(r0)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            xe.i r15 = xe.i.NoCRC     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.String r7 = "type"
            e6.e.D(r15, r7)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r0.f13211d = r15     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            a.b.u(r6, r0, r8)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            qg.d r0 = c3.k.s(r1)     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.Integer[] r1 = new java.lang.Integer[r11]     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            java.lang.Integer r7 = new java.lang.Integer     // Catch:{ Exception -> 0x02ec, all -> 0x02e8 }
            r11 = 0
            r7.<init>(r11)     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            r1[r11] = r7     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            java.lang.Integer r7 = new java.lang.Integer     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            r1[r8] = r7     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            java.util.List r1 = a.b.o0(r1)     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            ad.c.j(r6, r0, r9, r1)     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            qi.a$c r0 = new qi.a$c     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            r0.<init>(r5, r6, r12)     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            r1 = 3
            ge.g.b(r14, r12, r0, r1)     // Catch:{ Exception -> 0x02ea, all -> 0x02e8 }
            goto L_0x02f0
        L_0x02e8:
            r0 = move-exception
            goto L_0x0322
        L_0x02ea:
            r0 = move-exception
            goto L_0x033e
        L_0x02ec:
            r0 = move-exception
            goto L_0x00a7
        L_0x02ef:
            r11 = 0
        L_0x02f0:
            r4.stop()
            qi.a$d r0 = new qi.a$d
            r0.<init>(r5, r13, r12)
            r2.f10460a = r5
            r2.f10461b = r12
            r2.f10462c = r12
            r2.f10463s = r12
            r2.f10464t = r12
            r1 = 4
            r2.f10466v = r1
            java.lang.Object r0 = bf.b.a(r0, r2)
            if (r0 != r3) goto L_0x030c
            return r3
        L_0x030c:
            r0 = r5
        L_0x030d:
            je.h<xb.b> r1 = r0.f9457j
            yb.a r4 = new yb.a
            xb.c r5 = xb.c.BleStopSearching
            r4.<init>(r5)
            r2.f10460a = r0
            r5 = 5
            r2.f10466v = r5
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 != r3) goto L_0x0379
            return r3
        L_0x0322:
            r6 = r40
            goto L_0x0329
        L_0x0325:
            r0 = move-exception
            r6 = r40
            r5 = r1
        L_0x0329:
            r1 = r13
            goto L_0x03b0
        L_0x032c:
            r0 = move-exception
            r11 = 0
            r37 = r13
            r13 = r1
            r1 = r37
            goto L_0x033c
        L_0x0334:
            r0 = move-exception
            r11 = 0
            goto L_0x033c
        L_0x0337:
            r0 = move-exception
            r6 = r40
            goto L_0x03b1
        L_0x033c:
            r5 = r13
            r13 = r1
        L_0x033e:
            org.slf4j.Logger r1 = f10453a     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x03aa }
            r1.debug(r0)     // Catch:{ all -> 0x03aa }
            r4.stop()
            qi.a$d r0 = new qi.a$d
            r0.<init>(r5, r13, r12)
            r2.f10460a = r5
            r2.f10461b = r12
            r2.f10462c = r12
            r2.f10463s = r12
            r2.f10464t = r12
            r1 = 6
            r2.f10466v = r1
            java.lang.Object r0 = bf.b.a(r0, r2)
            if (r0 != r3) goto L_0x0363
            return r3
        L_0x0363:
            r0 = r5
        L_0x0364:
            je.h<xb.b> r1 = r0.f9457j
            yb.a r4 = new yb.a
            xb.c r5 = xb.c.BleStopSearching
            r4.<init>(r5)
            r2.f10460a = r0
            r5 = 7
            r2.f10466v = r5
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 != r3) goto L_0x0379
            return r3
        L_0x0379:
            org.slf4j.Logger r1 = f10453a
            r6 = r40
            r1.debug(r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13 = r0
        L_0x0383:
            if (r1 != 0) goto L_0x03a1
            je.h<xb.b> r0 = r13.f9457j
            yb.a r1 = new yb.a
            xb.c r4 = xb.c.BleStopSearching
            r1.<init>(r4)
            r2.f10460a = r12
            r2.f10461b = r12
            r2.f10462c = r12
            r4 = 10
            r2.f10466v = r4
            java.lang.Object r0 = r0.a(r1, r2)
            if (r0 != r3) goto L_0x039f
            return r3
        L_0x039f:
            r10 = r11
            goto L_0x03a5
        L_0x03a1:
            boolean r10 = r1.booleanValue()
        L_0x03a5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L_0x03aa:
            r0 = move-exception
            r6 = r40
            r15 = r5
        L_0x03ae:
            r1 = r13
            r5 = r15
        L_0x03b0:
            r13 = r5
        L_0x03b1:
            r4.stop()
            qi.a$d r4 = new qi.a$d
            r4.<init>(r13, r1, r12)
            r2.f10460a = r13
            r2.f10461b = r0
            r2.f10462c = r12
            r2.f10463s = r12
            r2.f10464t = r12
            r1 = 8
            r2.f10466v = r1
            java.lang.Object r1 = bf.b.a(r4, r2)
            if (r1 != r3) goto L_0x03ce
            return r3
        L_0x03ce:
            r4 = r13
        L_0x03cf:
            je.h<xb.b> r1 = r4.f9457j
            yb.a r4 = new yb.a
            xb.c r5 = xb.c.BleStopSearching
            r4.<init>(r5)
            r2.f10460a = r0
            r2.f10461b = r12
            r5 = 9
            r2.f10466v = r5
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 != r3) goto L_0x03e7
            return r3
        L_0x03e7:
            org.slf4j.Logger r1 = f10453a
            r1.debug(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.a.b(oi.a, ge.d0, pd.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v32, types: [di.b] */
    /* JADX WARNING: type inference failed for: r3v33, types: [di.b] */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:175|176|183|188|189|190|191|192|193|194|(0)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:25|26|27|28|(1:152)|153|(4:156|(2:158|246)(2:159|247)|245|154)|160|161|162|163|164|(1:166)(2:167|204)|166) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:175|188|189|190|191|192|193|194|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x042f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0431, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x043e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0440, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0441, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0443, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0473, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0475, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03d1 A[Catch:{ Exception -> 0x0439, all -> 0x0436 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x042a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x043e A[ExcHandler: all (th java.lang.Throwable), PHI: r1 r2 r3 
      PHI: (r1v13 qi.a$a) = (r1v16 qi.a$a), (r1v16 qi.a$a), (r1v16 qi.a$a), (r1v1 qi.a$a), (r1v1 qi.a$a), (r1v1 qi.a$a), (r1v1 qi.a$a) binds: [B:145:0x03af, B:146:?, B:148:0x03b8, B:30:0x007d, B:31:?, B:26:0x006d, B:27:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v11 qd.a) = (r2v14 qd.a), (r2v14 qd.a), (r2v14 qd.a), (r2v0 qd.a), (r2v0 qd.a), (r2v0 qd.a), (r2v0 qd.a) binds: [B:145:0x03af, B:146:?, B:148:0x03b8, B:30:0x007d, B:31:?, B:26:0x006d, B:27:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v11 v9.b) = (r3v38 v9.b), (r3v40 v9.b), (r3v41 v9.b), (r3v46 v9.b), (r3v48 v9.b), (r3v51 v9.b), (r3v53 v9.b) binds: [B:145:0x03af, B:146:?, B:148:0x03b8, B:30:0x007d, B:31:?, B:26:0x006d, B:27:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:26:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x046b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0496 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x020e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(oi.a r17, java.util.List<qi.c> r18, pd.d<? super md.m> r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof qi.a.C0203a
            if (r1 == 0) goto L_0x0015
            r1 = r0
            qi.a$a r1 = (qi.a.C0203a) r1
            int r2 = r1.f10459u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f10459u = r2
            goto L_0x001a
        L_0x0015:
            qi.a$a r1 = new qi.a$a
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.f10458t
            qd.a r2 = qd.a.COROUTINE_SUSPENDED
            int r3 = r1.f10459u
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 5
            r8 = 1
            if (r3 == 0) goto L_0x0087
            if (r3 == r8) goto L_0x0073
            if (r3 == r4) goto L_0x0063
            if (r3 == r5) goto L_0x0045
            if (r3 == r6) goto L_0x0045
            if (r3 == r7) goto L_0x0039
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            java.lang.Object r1 = r1.f10454a
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            l6.b1.w(r0)     // Catch:{ Exception -> 0x0042 }
            goto L_0x049a
        L_0x0042:
            r0 = move-exception
            goto L_0x0497
        L_0x0045:
            java.util.Iterator r3 = r1.f10455b
            java.lang.Object r10 = r1.f10454a
            oi.a r10 = (oi.a) r10
            l6.b1.w(r0)     // Catch:{ Exception -> 0x005a }
            r0 = r3
            r7 = r5
            r3 = r2
            r2 = r1
            r1 = r10
            r16 = r6
            r6 = r4
            r4 = r16
            goto L_0x0470
        L_0x005a:
            r0 = move-exception
            r7 = r5
            r16 = r6
            r6 = r4
            r4 = r16
            goto L_0x0477
        L_0x0063:
            di.b r3 = r1.f10457s
            java.util.Map$Entry r10 = r1.f10456c
            java.util.Iterator r11 = r1.f10455b
            java.lang.Object r12 = r1.f10454a
            oi.a r12 = (oi.a) r12
            l6.b1.w(r0)     // Catch:{ Exception -> 0x0082, all -> 0x043e }
            r6 = r4
            goto L_0x03c1
        L_0x0073:
            di.b r3 = r1.f10457s
            java.util.Map$Entry r10 = r1.f10456c
            java.util.Iterator r11 = r1.f10455b
            java.lang.Object r12 = r1.f10454a
            oi.a r12 = (oi.a) r12
            l6.b1.w(r0)     // Catch:{ Exception -> 0x0082, all -> 0x043e }
            goto L_0x03af
        L_0x0082:
            r0 = move-exception
            r6 = r4
            r7 = r5
            goto L_0x0448
        L_0x0087:
            l6.b1.w(r0)
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x009a
            org.slf4j.Logger r0 = f10453a
            java.lang.String r1 = "BLE Pass Failed nothing was found."
            r0.debug(r1)
            md.m r0 = md.m.f8555a
            return r0
        L_0x009a:
            r0 = r17
            ze.f r3 = r0.f9452c
            hf.f r3 = (hf.f) r3
            ze.g r3 = r3.a()
            java.util.List r3 = r3.a()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Iterator r11 = r18.iterator()
        L_0x00b1:
            boolean r12 = r11.hasNext()
            r13 = 0
            if (r12 == 0) goto L_0x0281
            java.lang.Object r12 = r11.next()
            qi.c r12 = (qi.c) r12
            ji.c r14 = r12.f10500c
            ji.l r14 = r14.r()
            double r6 = r14.f7331t
            double r4 = r14.f7332u
            r14 = 12
            ch.hsr.geohash.GeoHash r4 = ch.hsr.geohash.GeoHash.withCharacterPrecision(r6, r4, r14)
            java.lang.String r4 = r4.toBase32()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r3.iterator()
        L_0x00db:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0102
            java.lang.Object r7 = r6.next()
            r14 = r7
            ze.j r14 = (ze.j) r14
            java.lang.String r15 = "currentLocationGeohash"
            e6.e.C(r4, r15)
            b.n r14 = r14.a()
            java.lang.String r14 = r14.A
            java.lang.String r15 = "it.targets.targetArea"
            e6.e.C(r14, r15)
            boolean r14 = fe.k.d1(r4, r14, r13)
            if (r14 == 0) goto L_0x00db
            r5.add(r7)
            goto L_0x00db
        L_0x0102:
            di.a r4 = r12.f10498a
            java.lang.Object r6 = r10.get(r4)
            java.util.Set r6 = (java.util.Set) r6
            if (r6 != 0) goto L_0x0111
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L_0x0111:
            r10.put(r4, r6)
            di.a r4 = r12.f10498a
            java.lang.Object r4 = r10.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L_0x011f
            goto L_0x018b
        L_0x011f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r5.iterator()
        L_0x0128:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x0163
            java.lang.Object r14 = r7.next()
            r15 = r14
            ze.j r15 = (ze.j) r15
            b.n r15 = r15.a()
            zb.h r15 = r15.f2810s
            byte[] r15 = r15.i()
            java.lang.String r13 = "it.targets.macAddress.toByteArray()"
            e6.e.C(r15, r13)
            bf.c$a r13 = bf.c.a.f3000b
            java.lang.String r13 = nd.f.M(r15, r13)
            java.lang.String r13 = di.d.a(r13)
            di.a r15 = r12.f10498a
            java.lang.String r15 = r15.a()
            java.lang.String r15 = di.d.a(r15)
            boolean r13 = e6.e.r(r13, r15)
            if (r13 == 0) goto L_0x0161
            r6.add(r14)
        L_0x0161:
            r13 = 0
            goto L_0x0128
        L_0x0163:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r13 = nd.g.S0(r6)
            r7.<init>(r13)
            java.util.Iterator r6 = r6.iterator()
        L_0x0170:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0184
            java.lang.Object r13 = r6.next()
            ze.j r13 = (ze.j) r13
            java.lang.String r13 = r13.b()
            r7.add(r13)
            goto L_0x0170
        L_0x0184:
            java.util.Set r6 = nd.m.m1(r7)
            r4.addAll(r6)
        L_0x018b:
            di.a r4 = r12.f10498a
            java.lang.Object r4 = r10.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L_0x0196
            goto L_0x01f9
        L_0x0196:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r5.iterator()
        L_0x019f:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x01d1
            java.lang.Object r13 = r7.next()
            r14 = r13
            ze.j r14 = (ze.j) r14
            di.c r15 = r12.f10499b
            java.util.Map r15 = r15.c()
            if (r15 != 0) goto L_0x01b5
            goto L_0x01c8
        L_0x01b5:
            b.n r14 = r14.a()
            int r14 = r14.f2811t
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r14)
            java.lang.Object r9 = r15.get(r9)
            byte[] r9 = (byte[]) r9
            if (r9 != 0) goto L_0x01ca
        L_0x01c8:
            r9 = 0
            goto L_0x01cb
        L_0x01ca:
            r9 = r8
        L_0x01cb:
            if (r9 == 0) goto L_0x019f
            r6.add(r13)
            goto L_0x019f
        L_0x01d1:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r9 = nd.g.S0(r6)
            r7.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x01de:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x01f2
            java.lang.Object r9 = r6.next()
            ze.j r9 = (ze.j) r9
            java.lang.String r9 = r9.b()
            r7.add(r9)
            goto L_0x01de
        L_0x01f2:
            java.util.Set r6 = nd.m.m1(r7)
            r4.addAll(r6)
        L_0x01f9:
            di.a r4 = r12.f10498a
            java.lang.Object r4 = r10.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L_0x0205
            goto L_0x027b
        L_0x0205:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x020e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0253
            java.lang.Object r7 = r5.next()
            r9 = r7
            ze.j r9 = (ze.j) r9
            b.n r9 = r9.a()     // Catch:{ Exception -> 0x022f }
            zb.h r9 = r9.z     // Catch:{ Exception -> 0x022f }
            byte[] r9 = r9.i()     // Catch:{ Exception -> 0x022f }
            java.lang.String r13 = "it.targets.serviceUUID.toByteArray()"
            e6.e.C(r9, r13)     // Catch:{ Exception -> 0x022f }
            java.util.UUID r9 = di.d.b(r9)     // Catch:{ Exception -> 0x022f }
            goto L_0x0230
        L_0x022f:
            r9 = 0
        L_0x0230:
            if (r9 != 0) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            di.c r13 = r12.f10499b
            java.util.List r13 = r13.a()
            if (r13 != 0) goto L_0x023d
            r9 = 0
            goto L_0x0245
        L_0x023d:
            boolean r9 = r13.contains(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
        L_0x0245:
            if (r9 != 0) goto L_0x0249
        L_0x0247:
            r9 = 0
            goto L_0x024d
        L_0x0249:
            boolean r9 = r9.booleanValue()
        L_0x024d:
            if (r9 == 0) goto L_0x020e
            r6.add(r7)
            goto L_0x020e
        L_0x0253:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = nd.g.S0(r6)
            r5.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x0260:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0274
            java.lang.Object r7 = r6.next()
            ze.j r7 = (ze.j) r7
            java.lang.String r7 = r7.b()
            r5.add(r7)
            goto L_0x0260
        L_0x0274:
            java.util.Set r5 = nd.m.m1(r5)
            r4.addAll(r5)
        L_0x027b:
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 5
            goto L_0x00b1
        L_0x0281:
            org.slf4j.Logger r3 = f10453a
            java.lang.String r4 = "iotee menu:\n"
            r3.debug(r4)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Set r4 = r10.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0295:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02be
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            java.util.Set r6 = (java.util.Set) r6
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x02af
            r6 = r8
            goto L_0x02b0
        L_0x02af:
            r6 = 0
        L_0x02b0:
            if (r6 == 0) goto L_0x0295
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            r3.put(r6, r5)
            goto L_0x0295
        L_0x02be:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x02c6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0317
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            org.slf4j.Logger r5 = f10453a
            java.lang.Object r6 = r4.getKey()
            di.a r6 = (di.a) r6
            java.lang.String r6 = r6.a()
            java.lang.String r7 = "connect to: "
            java.lang.String r6 = e6.e.a0(r7, r6)
            r5.debug(r6)
            java.lang.Object r4 = r4.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = nd.g.S0(r4)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x02fa:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02c6
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            org.slf4j.Logger r7 = f10453a
            java.lang.String r9 = "\t will execute tx: "
            java.lang.String r6 = e6.e.a0(r9, r6)
            r7.debug(r6)
            md.m r6 = md.m.f8555a
            r5.add(r6)
            goto L_0x02fa
        L_0x0317:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Set r4 = r10.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0324:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x034d
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            java.util.Set r6 = (java.util.Set) r6
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x033e
            r6 = r8
            goto L_0x033f
        L_0x033e:
            r6 = 0
        L_0x033f:
            if (r6 == 0) goto L_0x0324
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            r3.put(r6, r5)
            goto L_0x0324
        L_0x034d:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
        L_0x0359:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x049b
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            ah.v r5 = r1.g
            io.nodle.sdk.NodleContext r6 = r1.f9450a
            pd.f r7 = r2.getContext()
            ge.d0 r7 = c3.k.j(r7)
            java.lang.Object r9 = r0.getKey()
            di.a r9 = (di.a) r9
            java.util.Objects.requireNonNull(r5)
            java.lang.String r5 = "ctx"
            e6.e.D(r6, r5)
            java.lang.String r5 = "device"
            e6.e.D(r9, r5)
            v9.b r5 = new v9.b
            r5.<init>(r6, r7, r9)
            io.nodle.sdk.NodleContext r6 = r1.f9450a     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            r2.f10454a = r1     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            r2.f10455b = r4     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            r2.f10456c = r0     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            r2.f10457s = r5     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            r2.f10459u = r8     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            v9.c r7 = new v9.c     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            r9 = 0
            r7.<init>(r5, r6, r9)     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            java.lang.Object r6 = r5.g(r7, r2)     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            qd.a r7 = qd.a.COROUTINE_SUSPENDED     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
            if (r6 != r7) goto L_0x03a4
            goto L_0x03a6
        L_0x03a4:
            md.m r6 = md.m.f8555a     // Catch:{ Exception -> 0x044c, all -> 0x0450 }
        L_0x03a6:
            if (r6 != r3) goto L_0x03a9
            return r3
        L_0x03a9:
            r10 = r0
            r12 = r1
            r1 = r2
            r2 = r3
            r11 = r4
            r3 = r5
        L_0x03af:
            r1.f10454a = r12     // Catch:{ Exception -> 0x0440, all -> 0x043e }
            r1.f10455b = r11     // Catch:{ Exception -> 0x0440, all -> 0x043e }
            r1.f10456c = r10     // Catch:{ Exception -> 0x0440, all -> 0x043e }
            r1.f10457s = r3     // Catch:{ Exception -> 0x0440, all -> 0x043e }
            r6 = 2
            r1.f10459u = r6     // Catch:{ Exception -> 0x043b, all -> 0x043e }
            java.lang.Object r0 = r3.e(r1)     // Catch:{ Exception -> 0x043b, all -> 0x043e }
            if (r0 != r2) goto L_0x03c1
            return r2
        L_0x03c1:
            java.lang.Object r0 = r10.getValue()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
        L_0x03cb:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            if (r4 == 0) goto L_0x0418
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            org.slf4j.Logger r5 = f10453a     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            r7.<init>()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.lang.String r9 = "tx "
            r7.append(r9)     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            r7.append(r4)     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.lang.String r9 = " matched device "
            r7.append(r9)     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.lang.Object r9 = r10.getKey()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            di.a r9 = (di.a) r9     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.lang.String r9 = r9.a()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            r7.append(r9)     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            r5.debug(r7)     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            ze.f r5 = r12.f9452c     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            hf.f r5 = (hf.f) r5     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            ze.g r5 = r5.a()     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            ze.i r4 = r5.e(r4)     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            if (r4 != 0) goto L_0x040e
            goto L_0x03cb
        L_0x040e:
            b.i r4 = e6.e.k(r4)     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            wi.b r5 = wi.b.BleTargetDeviceConnected     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            vi.a.a(r12, r4, r5, r3)     // Catch:{ Exception -> 0x0439, all -> 0x0436 }
            goto L_0x03cb
        L_0x0418:
            r1.f10454a = r12     // Catch:{ Exception -> 0x0431 }
            r1.f10455b = r11     // Catch:{ Exception -> 0x0431 }
            r4 = 0
            r1.f10456c = r4     // Catch:{ Exception -> 0x0431 }
            r1.f10457s = r4     // Catch:{ Exception -> 0x0431 }
            r7 = 3
            r1.f10459u = r7     // Catch:{ Exception -> 0x042f }
            java.lang.Object r0 = r3.b(r1)     // Catch:{ Exception -> 0x042f }
            if (r0 != r2) goto L_0x042b
            return r2
        L_0x042b:
            r3 = r2
            r4 = 4
            goto L_0x047d
        L_0x042f:
            r0 = move-exception
            goto L_0x0433
        L_0x0431:
            r0 = move-exception
            r7 = 3
        L_0x0433:
            r4 = 4
            goto L_0x0479
        L_0x0436:
            r0 = move-exception
            r5 = r3
            goto L_0x0444
        L_0x0439:
            r0 = move-exception
            goto L_0x043c
        L_0x043b:
            r0 = move-exception
        L_0x043c:
            r7 = 3
            goto L_0x0448
        L_0x043e:
            r0 = move-exception
            goto L_0x0443
        L_0x0440:
            r0 = move-exception
            r6 = 2
            goto L_0x043c
        L_0x0443:
            r5 = r3
        L_0x0444:
            r3 = r2
            r2 = r1
        L_0x0446:
            r1 = r0
            goto L_0x0484
        L_0x0448:
            r5 = r3
            r3 = r11
            r10 = r12
            goto L_0x0456
        L_0x044c:
            r0 = move-exception
            r6 = 2
            r7 = 3
            goto L_0x0452
        L_0x0450:
            r0 = move-exception
            goto L_0x0446
        L_0x0452:
            r10 = r1
            r1 = r2
            r2 = r3
            r3 = r4
        L_0x0456:
            r0.printStackTrace()     // Catch:{ all -> 0x0482 }
            r1.f10454a = r10     // Catch:{ Exception -> 0x0475 }
            r1.f10455b = r3     // Catch:{ Exception -> 0x0475 }
            r4 = 0
            r1.f10456c = r4     // Catch:{ Exception -> 0x0475 }
            r1.f10457s = r4     // Catch:{ Exception -> 0x0475 }
            r4 = 4
            r1.f10459u = r4     // Catch:{ Exception -> 0x0473 }
            java.lang.Object r0 = r5.b(r1)     // Catch:{ Exception -> 0x0473 }
            if (r0 != r2) goto L_0x046c
            return r2
        L_0x046c:
            r0 = r3
            r3 = r2
            r2 = r1
            r1 = r10
        L_0x0470:
            r4 = r0
            goto L_0x0359
        L_0x0473:
            r0 = move-exception
            goto L_0x0477
        L_0x0475:
            r0 = move-exception
            r4 = 4
        L_0x0477:
            r11 = r3
            r12 = r10
        L_0x0479:
            r0.printStackTrace()
            r3 = r2
        L_0x047d:
            r2 = r1
            r1 = r12
            r4 = r11
            goto L_0x0359
        L_0x0482:
            r0 = move-exception
            goto L_0x0444
        L_0x0484:
            r2.f10454a = r1     // Catch:{ Exception -> 0x0042 }
            r4 = 0
            r2.f10455b = r4     // Catch:{ Exception -> 0x0042 }
            r2.f10456c = r4     // Catch:{ Exception -> 0x0042 }
            r2.f10457s = r4     // Catch:{ Exception -> 0x0042 }
            r4 = 5
            r2.f10459u = r4     // Catch:{ Exception -> 0x0042 }
            java.lang.Object r0 = r5.b(r2)     // Catch:{ Exception -> 0x0042 }
            if (r0 != r3) goto L_0x049a
            return r3
        L_0x0497:
            r0.printStackTrace()
        L_0x049a:
            throw r1
        L_0x049b:
            md.m r0 = md.m.f8555a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.a.c(oi.a, java.util.List, pd.d):java.lang.Object");
    }

    public static final URI d(oi.a aVar) {
        try {
            URI create = URI.create((String) ((a9.c) aVar.f9450a.getSdkConfig()).a("ble.eid.scan-sink", "dtn://nodle.io/ble/scan"));
            e6.e.C(create, "{\n        URI.create(ctx…an-sink\", default))\n    }");
            return create;
        } catch (IllegalArgumentException unused) {
            URI create2 = URI.create("dtn://nodle.io/ble/scan");
            e6.e.C(create2, "{\n        URI.create(default)\n    }");
            return create2;
        }
    }

    public static final long e(oi.a aVar) {
        return (long) ((Number) ((a9.c) aVar.f9450a.getSdkConfig()).a("ble.scan.duration-msec", Float.valueOf(10000.0f))).floatValue();
    }

    public static final long f(oi.a aVar) {
        return (long) ((Number) ((a9.c) aVar.f9450a.getSdkConfig()).a("ble.scan.interval-msec", Float.valueOf(50000.0f))).floatValue();
    }
}
