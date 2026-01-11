package ua;

import ah.v;
import bb.f;
import c3.k;
import com.github.mikephil.charting.BuildConfig;
import db.e;
import ge.g0;
import ge.g1;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import le.d;
import ne.c;
import net.jpountz.lz4.LZ4FrameOutputStream;
import ta.g;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f11853a;

    /* renamed from: b  reason: collision with root package name */
    public final g f11854b;

    /* renamed from: c  reason: collision with root package name */
    public final ra.g f11855c;

    /* renamed from: d  reason: collision with root package name */
    public final e f11856d;

    /* renamed from: e  reason: collision with root package name */
    public final v f11857e;

    /* renamed from: f  reason: collision with root package name */
    public final g0 f11858f;
    public final vb.a g;

    /* renamed from: h  reason: collision with root package name */
    public final f f11859h;
    public final int i = 100;

    /* renamed from: j  reason: collision with root package name */
    public final int f11860j = 7;

    /* renamed from: k  reason: collision with root package name */
    public final int f11861k = 600000;

    /* renamed from: l  reason: collision with root package name */
    public final d f11862l;

    /* renamed from: m  reason: collision with root package name */
    public final AtomicInteger f11863m;

    /* renamed from: n  reason: collision with root package name */
    public final c f11864n;

    /* renamed from: o  reason: collision with root package name */
    public final HashSet<f> f11865o;

    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return jc.b.n(Long.valueOf(((f) t11).f2946b), Long.valueOf(((f) t10).f2946b));
        }
    }

    @rd.e(c = "io.nodle.cash.data.repository.TransactionsRepository2", f = "TransactionsRepository2.kt", l = {55, 56, 57, 59, 59}, m = "getLastTransactions")
    public static final class b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public l f11866a;

        /* renamed from: b  reason: collision with root package name */
        public g1 f11867b;

        /* renamed from: c  reason: collision with root package name */
        public long f11868c;

        /* renamed from: s  reason: collision with root package name */
        public long f11869s;

        /* renamed from: t  reason: collision with root package name */
        public /* synthetic */ Object f11870t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ l f11871u;

        /* renamed from: v  reason: collision with root package name */
        public int f11872v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l lVar, pd.d<? super b> dVar) {
            super(dVar);
            this.f11871u = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11870t = obj;
            this.f11872v |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f11871u.d(0, this);
        }
    }

    public l(ub.c cVar, String str, g gVar, ra.g gVar2, e eVar, v vVar, g0 g0Var, vb.a aVar, f fVar) {
        e6.e.D(fVar, "legacyTransactionsRepository");
        this.f11853a = str;
        this.f11854b = gVar;
        this.f11855c = gVar2;
        this.f11856d = eVar;
        this.f11857e = vVar;
        this.f11858f = g0Var;
        this.g = aVar;
        this.f11859h = fVar;
        this.f11862l = (d) k.j(cVar.f11925a);
        this.f11863m = new AtomicInteger();
        this.f11864n = (c) g0.i();
        this.f11865o = new HashSet<>();
    }

    public static final Object a(l lVar, int i10, long j10, int i11) {
        return ge.g.b(lVar.f11862l, (pd.f) null, new q(i10, i11, lVar, j10, (pd.d<? super q>) null), 3);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(ua.l r21, int r22, long r23, pd.d r25) {
        /*
            r0 = r21
            r1 = r22
            r2 = r25
            java.util.Objects.requireNonNull(r21)
            boolean r3 = r2 instanceof ua.r
            if (r3 == 0) goto L_0x001c
            r3 = r2
            ua.r r3 = (ua.r) r3
            int r4 = r3.f11911w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f11911w = r4
            goto L_0x0021
        L_0x001c:
            ua.r r3 = new ua.r
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.f11909u
            qd.a r4 = qd.a.COROUTINE_SUSPENDED
            int r5 = r3.f11911w
            r6 = 1
            r8 = 2
            if (r5 == 0) goto L_0x0052
            if (r5 == r6) goto L_0x0045
            if (r5 != r8) goto L_0x003d
            ne.c r0 = r3.f11906c
            java.util.ArrayList r1 = r3.f11905b
            ua.l r3 = r3.f11904a
            l6.b1.w(r2)
            r5 = r1
            r2 = 0
            r1 = r0
            goto L_0x0154
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            long r0 = r3.f11908t
            int r5 = r3.f11907s
            ua.l r6 = r3.f11904a
            l6.b1.w(r2)
            r10 = r0
            r1 = r5
            r0 = r6
            goto L_0x0079
        L_0x0052:
            l6.b1.w(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f11863m
            int r2 = r2.get()
            if (r2 > r1) goto L_0x0061
            md.m r4 = md.m.f8555a
            goto L_0x015e
        L_0x0061:
            ta.g r2 = r0.f11854b
            java.lang.String r5 = r0.f11853a
            int r9 = r0.i
            r3.f11904a = r0
            r3.f11907s = r1
            r10 = r23
            r3.f11908t = r10
            r3.f11911w = r6
            java.lang.Object r2 = r2.a(r5, r9, r1, r3)
            if (r2 != r4) goto L_0x0079
            goto L_0x015e
        L_0x0079:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = nd.g.S0(r2)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0088:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0119
            java.lang.Object r6 = r2.next()
            io.nodle.cash.data.remote.api.response.TransferApiModel r6 = (io.nodle.cash.data.remote.api.response.TransferApiModel) r6
            java.util.Objects.requireNonNull(r0)
            bb.f r9 = new bb.f
            java.lang.String r13 = r6.getHash()
            long r14 = r6.getBlockTimestamp()
            r12 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r12
            long r14 = r14 * r7
            java.lang.String r16 = r6.getFrom()
            java.lang.String r17 = r6.getTo()
            vb.a r7 = r0.g
            java.lang.String r8 = r6.getAmount()
            java.util.Objects.requireNonNull(r7)
            java.lang.String r12 = "nodle"
            e6.e.D(r8, r12)
            r21 = r2
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r8)
            java.math.BigDecimal r7 = r7.f12448a
            java.lang.String r8 = "multiplayer"
            e6.e.C(r7, r8)
            java.math.BigDecimal r2 = r2.multiply(r7)
            java.lang.String r7 = "this.multiply(other)"
            e6.e.C(r2, r7)
            java.math.BigInteger r2 = r2.toBigInteger()
            java.lang.String r7 = "nodle.toBigDecimal() * multiplayer).toBigInteger()"
            e6.e.C(r2, r7)
            vb.a r7 = r0.g
            java.lang.String r8 = r6.getFee()
            java.util.Objects.requireNonNull(r7)
            e6.e.D(r8, r12)
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r8)
            java.lang.String r6 = r6.getFrom()
            db.e r8 = r0.f11856d
            java.util.Objects.requireNonNull(r8)
            java.lang.String r12 = "key"
            e6.e.D(r6, r12)
            java.util.Set<java.lang.String> r8 = r8.f4424b
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L_0x0105
            bb.g r6 = bb.g.REWARD
            goto L_0x0107
        L_0x0105:
            bb.g r6 = bb.g.TRANSFER
        L_0x0107:
            r20 = r6
            r12 = r9
            r18 = r2
            r19 = r7
            r12.<init>(r13, r14, r16, r17, r18, r19, r20)
            r5.add(r9)
            r2 = r21
            r8 = 2
            goto L_0x0088
        L_0x0119:
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0133
            java.lang.Object r2 = nd.m.c1(r5)
            bb.f r2 = (bb.f) r2
            long r6 = r2.f2946b
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0133
            int r2 = r5.size()
            int r6 = r0.i
            if (r2 >= r6) goto L_0x0140
        L_0x0133:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f11863m
            int r6 = r2.get()
            int r1 = java.lang.Math.min(r1, r6)
            r2.set(r1)
        L_0x0140:
            ne.c r1 = r0.f11864n
            r3.f11904a = r0
            r3.f11905b = r5
            r3.f11906c = r1
            r2 = 2
            r3.f11911w = r2
            r2 = 0
            java.lang.Object r3 = r1.b(r2, r3)
            if (r3 != r4) goto L_0x0153
            goto L_0x015e
        L_0x0153:
            r3 = r0
        L_0x0154:
            java.util.HashSet<bb.f> r0 = r3.f11865o     // Catch:{ all -> 0x015f }
            r0.addAll(r5)     // Catch:{ all -> 0x015f }
            r1.a(r2)
            md.m r4 = md.m.f8555a
        L_0x015e:
            return r4
        L_0x015f:
            r0 = move-exception
            r1.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.l.b(ua.l, int, long, pd.d):java.lang.Object");
    }

    public static final f c(l lVar, sa.b bVar) {
        Objects.requireNonNull(lVar);
        String str = bVar.f11044x;
        long j10 = bVar.f11045y;
        String str2 = bVar.f11036a;
        String str3 = str2 == null ? BuildConfig.FLAVOR : str2;
        String str4 = bVar.f11037b;
        String str5 = str4 == null ? BuildConfig.FLAVOR : str4;
        BigInteger bigInteger = bVar.f11038c;
        BigInteger bigInteger2 = bVar.f11039s;
        if (bigInteger2 == null) {
            bigInteger2 = BigInteger.ZERO;
        }
        BigInteger bigInteger3 = bigInteger2;
        e6.e.C(bigInteger3, "fees ?: BigInteger.ZERO");
        return new f(str, j10, str3, str5, bigInteger, bigInteger3, bVar.z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0170 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cb A[LOOP:2: B:62:0x01c5->B:64:0x01cb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(long r24, pd.d<? super java.util.List<bb.f>> r26) {
        /*
            r23 = this;
            r7 = r23
            r2 = r24
            r0 = r26
            boolean r1 = r0 instanceof ua.l.b
            if (r1 == 0) goto L_0x0019
            r1 = r0
            ua.l$b r1 = (ua.l.b) r1
            int r4 = r1.f11872v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r1.f11872v = r4
            goto L_0x001e
        L_0x0019:
            ua.l$b r1 = new ua.l$b
            r1.<init>(r7, r0)
        L_0x001e:
            r8 = r1
            java.lang.Object r0 = r8.f11870t
            qd.a r9 = qd.a.COROUTINE_SUSPENDED
            int r1 = r8.f11872v
            r4 = 4
            r10 = 2
            r11 = 1
            r12 = 0
            r5 = 5
            r13 = 0
            r14 = 3
            if (r1 == 0) goto L_0x006b
            if (r1 == r11) goto L_0x0060
            if (r1 == r10) goto L_0x0055
            if (r1 == r14) goto L_0x004b
            if (r1 == r4) goto L_0x0041
            if (r1 != r5) goto L_0x0039
            goto L_0x004b
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            long r1 = r8.f11868c
            ua.l r3 = r8.f11866a
            l6.b1.w(r0)
            r6 = r11
            goto L_0x0161
        L_0x004b:
            long r1 = r8.f11868c
            ua.l r3 = r8.f11866a
            l6.b1.w(r0)
            r6 = r11
            goto L_0x0171
        L_0x0055:
            long r1 = r8.f11868c
            ge.g1 r3 = r8.f11867b
            ua.l r4 = r8.f11866a
            l6.b1.w(r0)
            goto L_0x0128
        L_0x0060:
            long r1 = r8.f11869s
            long r3 = r8.f11868c
            ua.l r5 = r8.f11866a
            l6.b1.w(r0)
            goto L_0x0109
        L_0x006b:
            l6.b1.w(r0)
            ri.a$a r0 = ri.a.f10801a
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r6 = "getLastTransactions start"
            r0.a(r6, r1)
            ah.v r0 = r7.f11857e
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            le.d r6 = r7.f11862l
            pd.f r6 = r6.f8235a
            ge.g1$b r15 = ge.g1.b.f5401a
            pd.f$a r6 = r6.get(r15)
            ge.g1 r6 = (ge.g1) r6
            if (r6 != 0) goto L_0x008f
            goto L_0x00aa
        L_0x008f:
            ee.d r6 = r6.y()
            if (r6 != 0) goto L_0x0096
            goto L_0x00aa
        L_0x0096:
            java.util.Iterator r6 = r6.iterator()
        L_0x009a:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L_0x00aa
            java.lang.Object r15 = r6.next()
            ge.g1 r15 = (ge.g1) r15
            r15.c(r13)
            goto L_0x009a
        L_0x00aa:
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f11863m
            r15 = 2147483647(0x7fffffff, float:NaN)
            r6.set(r15)
            java.util.HashSet<bb.f> r6 = r7.f11865o
            r6.clear()
            ra.g r6 = r7.f11855c
            qa.c r15 = r6.f10639d
            de.h<java.lang.Object>[] r16 = ra.g.f10635e
            r5 = r16[r11]
            java.lang.Long r5 = r15.a(r6, r5)
            long r5 = r5.longValue()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00cd
            r5 = r11
            goto L_0x00ce
        L_0x00cd:
            r5 = r12
        L_0x00ce:
            if (r5 == 0) goto L_0x0142
            ra.g r4 = r7.f11855c
            qa.c r5 = r4.f10638c
            r6 = r16[r12]
            java.lang.Long r4 = r5.a(r4, r6)
            long r4 = r4.longValue()
            r8.f11866a = r7
            r8.f11868c = r0
            r8.f11869s = r4
            r8.f11872v = r11
            le.d r15 = r7.f11862l
            ua.m r6 = new ua.m
            r16 = 0
            r17 = r0
            r0 = r6
            r1 = r23
            r2 = r24
            r19 = r4
            r4 = r17
            r11 = r6
            r6 = r16
            r0.<init>(r1, r2, r4, r6)
            ge.g1 r0 = ge.g.b(r15, r13, r11, r14)
            if (r0 != r9) goto L_0x0104
            return r9
        L_0x0104:
            r5 = r7
            r3 = r17
            r1 = r19
        L_0x0109:
            ge.g1 r0 = (ge.g1) r0
            r8.f11866a = r5
            r8.f11867b = r0
            r8.f11868c = r3
            r8.f11872v = r10
            le.d r6 = r5.f11862l
            ua.n r11 = new ua.n
            r11.<init>(r5, r1, r13)
            ge.g1 r1 = ge.g.b(r6, r13, r11, r14)
            if (r1 != r9) goto L_0x0121
            return r9
        L_0x0121:
            r21 = r3
            r3 = r0
            r0 = r1
            r1 = r21
            r4 = r5
        L_0x0128:
            ge.g1 r0 = (ge.g1) r0
            ge.g1[] r5 = new ge.g1[r10]
            r5[r12] = r3
            r6 = 1
            r5[r6] = r0
            r8.f11866a = r4
            r8.f11867b = r13
            r8.f11868c = r1
            r8.f11872v = r14
            java.lang.Object r0 = ge.c.b(r5, r8)
            if (r0 != r9) goto L_0x0140
            return r9
        L_0x0140:
            r3 = r4
            goto L_0x0171
        L_0x0142:
            r17 = r0
            r6 = r11
            r8.f11866a = r7
            r0 = r17
            r8.f11868c = r0
            r8.f11872v = r4
            le.d r4 = r7.f11862l
            ua.n r5 = new ua.n
            r5.<init>(r7, r2, r13)
            ge.g1 r2 = ge.g.b(r4, r13, r5, r14)
            if (r2 != r9) goto L_0x015b
            return r9
        L_0x015b:
            r3 = r7
            r21 = r0
            r0 = r2
            r1 = r21
        L_0x0161:
            ge.g1 r0 = (ge.g1) r0
            r8.f11866a = r3
            r8.f11868c = r1
            r4 = 5
            r8.f11872v = r4
            java.lang.Object r0 = r0.t(r8)
            if (r0 != r9) goto L_0x0171
            return r9
        L_0x0171:
            java.util.HashSet<bb.f> r0 = r3.f11865o
            java.util.List r0 = nd.m.j1(r0)
            ua.l$a r4 = new ua.l$a
            r4.<init>()
            java.util.List r0 = nd.m.f1(r0, r4)
            ra.g r4 = r3.f11855c
            qa.c r5 = r4.f10638c
            de.h<java.lang.Object>[] r8 = ra.g.f10635e
            r8 = r8[r12]
            java.lang.Long r4 = r5.a(r4, r8)
            long r4 = r4.longValue()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x0199:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b8
            java.lang.Object r10 = r9.next()
            r11 = r10
            bb.f r11 = (bb.f) r11
            long r6 = r11.f2946b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = r12
        L_0x01af:
            if (r6 == 0) goto L_0x01b4
            r8.add(r10)
        L_0x01b4:
            r7 = r23
            r6 = 1
            goto L_0x0199
        L_0x01b8:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = nd.g.S0(r8)
            r4.<init>(r5)
            java.util.Iterator r5 = r8.iterator()
        L_0x01c5:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01fd
            java.lang.Object r6 = r5.next()
            bb.f r6 = (bb.f) r6
            sa.b r7 = new sa.b
            r7.<init>()
            java.lang.String r8 = r6.f2945a
            r7.d(r8)
            long r8 = r6.f2946b
            r7.f11045y = r8
            java.lang.String r8 = r6.f2947c
            r7.f11036a = r8
            java.lang.String r8 = r6.f2948d
            r7.f11037b = r8
            java.math.BigInteger r8 = r6.f2949e
            java.lang.String r9 = "<set-?>"
            e6.e.D(r8, r9)
            r7.f11038c = r8
            bb.g r8 = r6.g
            r7.e(r8)
            java.math.BigInteger r6 = r6.f2950f
            r7.f11039s = r6
            r4.add(r7)
            goto L_0x01c5
        L_0x01fd:
            le.d r5 = r3.f11862l
            ua.s r6 = new ua.s
            r20 = 0
            r15 = r6
            r16 = r3
            r17 = r4
            r18 = r1
            r15.<init>(r16, r17, r18, r20)
            ge.g.b(r5, r13, r6, r14)
            ri.a$a r4 = ri.a.f10801a
            ah.v r3 = r3.f11857e
            java.util.Objects.requireNonNull(r3)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getLastTransactions request time = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " ms"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r4.a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.l.d(long, pd.d):java.lang.Object");
    }
}
