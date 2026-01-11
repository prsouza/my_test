package ua;

import ah.v;
import android.content.Context;
import ge.d0;
import ie.n;
import java.util.ArrayList;
import java.util.List;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;
import yd.q;
import yd.s;
import yd.t;

@e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchAllTransactions$2", f = "TransactionRepository.kt", l = {}, m = "invokeSuspend")
public final class g extends i implements p<d0, d<? super je.e<? extends e<Object>>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f11788a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11789b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11790c;

    @e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchAllTransactions$2$1", f = "TransactionRepository.kt", l = {72, 77, 171, 174}, m = "invokeSuspend")
    public static final class a extends i implements p<n<? super e<Object>>, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList f11791a;

        /* renamed from: b  reason: collision with root package name */
        public int f11792b;

        /* renamed from: c  reason: collision with root package name */
        public long f11793c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f11794s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f11795t;

        /* renamed from: u  reason: collision with root package name */
        public int f11796u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f11797v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f f11798w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f11799x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f11800y;

        @e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchAllTransactions$2$1$1", f = "TransactionRepository.kt", l = {97, 102}, m = "invokeSuspend")
        /* renamed from: ua.g$a$a  reason: collision with other inner class name */
        public static final class C0232a extends i implements p<d0, d<? super m>, Object> {
            public final /* synthetic */ int A;
            public final /* synthetic */ long B;
            public final /* synthetic */ String C;
            public final /* synthetic */ boolean D;
            public final /* synthetic */ n<e<Object>> E;

            /* renamed from: a  reason: collision with root package name */
            public s f11801a;

            /* renamed from: b  reason: collision with root package name */
            public t f11802b;

            /* renamed from: c  reason: collision with root package name */
            public q f11803c;

            /* renamed from: s  reason: collision with root package name */
            public f f11804s;

            /* renamed from: t  reason: collision with root package name */
            public n f11805t;

            /* renamed from: u  reason: collision with root package name */
            public List f11806u;

            /* renamed from: v  reason: collision with root package name */
            public q f11807v;

            /* renamed from: w  reason: collision with root package name */
            public int f11808w;

            /* renamed from: x  reason: collision with root package name */
            public long f11809x;

            /* renamed from: y  reason: collision with root package name */
            public int f11810y;
            public final /* synthetic */ f z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0232a(f fVar, int i, long j10, String str, boolean z10, n<? super e<Object>> nVar, d<? super C0232a> dVar) {
                super(2, dVar);
                this.z = fVar;
                this.A = i;
                this.B = j10;
                this.C = str;
                this.D = z10;
                this.E = nVar;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                return new C0232a(this.z, this.A, this.B, this.C, this.D, this.E, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0232a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
            }

            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v1 */
            /* JADX WARNING: type inference failed for: r3v7, types: [ua.f, java.util.List, yd.q, ie.n] */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0083  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00d1  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    r20 = this;
                    r0 = r20
                    qd.a r1 = qd.a.COROUTINE_SUSPENDED
                    int r2 = r0.f11810y
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L_0x0052
                    if (r2 == r5) goto L_0x003e
                    if (r2 != r4) goto L_0x0036
                    long r2 = r0.f11809x
                    int r4 = r0.f11808w
                    yd.q r5 = r0.f11807v
                    java.util.List r6 = r0.f11806u
                    ie.n r7 = r0.f11805t
                    ua.f r8 = r0.f11804s
                    yd.q r9 = r0.f11803c
                    yd.t r10 = r0.f11802b
                    yd.s r11 = r0.f11801a
                    l6.b1.w(r21)
                    r17 = r0
                    r0 = r4
                    r12 = r8
                    r15 = r9
                    r4 = r10
                    r16 = r11
                    r9 = r6
                    r18 = r2
                    r3 = r21
                    r2 = r7
                L_0x0032:
                    r7 = r18
                    goto L_0x0104
                L_0x0036:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x003e:
                    int r2 = r0.f11808w
                    yd.q r3 = r0.f11803c
                    yd.t r4 = r0.f11802b
                    yd.s r6 = r0.f11801a
                    l6.b1.w(r21)
                    r14 = r0
                    r13 = r3
                    r10 = r4
                    r11 = r6
                    r3 = r21
                    r4 = r2
                    goto L_0x00bb
                L_0x0052:
                    l6.b1.w(r21)
                    ua.f r2 = r0.z
                    boolean r2 = ua.f.a(r2)
                    if (r2 != 0) goto L_0x0060
                    md.m r1 = md.m.f8555a
                    return r1
                L_0x0060:
                    yd.s r2 = new yd.s
                    r2.<init>()
                    int r4 = r0.A
                    r2.f13620a = r4
                    r4 = 0
                    yd.t r6 = new yd.t
                    r6.<init>()
                    long r7 = r0.B
                    r6.f13621a = r7
                    yd.q r7 = new yd.q
                    r7.<init>()
                    r14 = r0
                    r10 = r4
                    r11 = r5
                    r12 = r6
                    r13 = r7
                L_0x007d:
                    int r4 = r2.f13620a
                    int r7 = r14.A
                    if (r4 < r7) goto L_0x01a7
                    long r4 = r14.B
                    long r8 = r12.f13621a
                    long r4 = r4 - r8
                    ua.f r6 = r14.z
                    long r8 = r6.f11778e
                    int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                    if (r4 >= 0) goto L_0x01a7
                    java.lang.String r8 = r14.C
                    r14.f11801a = r2
                    r14.f11802b = r12
                    r14.f11803c = r13
                    r14.f11804s = r3
                    r14.f11805t = r3
                    r14.f11806u = r3
                    r14.f11807v = r3
                    r14.f11808w = r10
                    r14.f11810y = r11
                    me.b r3 = ge.o0.f5434b
                    ua.j r15 = new ua.j
                    r9 = 0
                    r4 = r15
                    r5 = r6
                    r6 = r8
                    r8 = r10
                    r4.<init>(r5, r6, r7, r8, r9)
                    java.lang.Object r3 = ge.g.d(r3, r15, r14)
                    if (r3 != r1) goto L_0x00b7
                    return r1
                L_0x00b7:
                    r4 = r10
                    r5 = r11
                    r10 = r12
                    r11 = r2
                L_0x00bb:
                    ua.f r8 = r14.z
                    ie.n<ua.e<java.lang.Object>> r7 = r14.E
                    r2 = r1
                    long r0 = r14.B
                    r6 = r3
                    java.util.List r6 = (java.util.List) r6
                    if (r6 != 0) goto L_0x00d1
                    java.lang.String r0 = r8.f11776c
                    java.lang.String r1 = "Subscan caching failed!"
                    android.util.Log.d(r0, r1)
                    md.m r0 = md.m.f8555a
                    return r0
                L_0x00d1:
                    boolean r3 = r6.isEmpty()
                    r3 = r3 ^ r5
                    if (r3 == 0) goto L_0x018d
                    r14.f11801a = r11
                    r14.f11802b = r10
                    r14.f11803c = r13
                    r14.f11804s = r8
                    r14.f11805t = r7
                    r14.f11806u = r6
                    r14.f11807v = r13
                    r14.f11808w = r4
                    r14.f11809x = r0
                    r3 = 2
                    r14.f11810y = r3
                    java.lang.Object r3 = ua.f.b(r8, r6, r14)
                    if (r3 != r2) goto L_0x00f4
                    return r2
                L_0x00f4:
                    r9 = r6
                    r12 = r8
                    r16 = r11
                    r5 = r13
                    r15 = r5
                    r17 = r14
                    r18 = r0
                    r1 = r2
                    r0 = r4
                    r2 = r7
                    r4 = r10
                    goto L_0x0032
                L_0x0104:
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    boolean r3 = r3.booleanValue()
                    r5.f13618a = r3
                    ua.e$b r3 = new ua.e$b
                    r3.<init>()
                    r2.k(r3)
                    java.util.Iterator r3 = r9.iterator()
                    boolean r2 = r3.hasNext()
                    if (r2 != 0) goto L_0x0120
                    r2 = 0
                    goto L_0x0145
                L_0x0120:
                    java.lang.Object r2 = r3.next()
                    boolean r5 = r3.hasNext()
                    if (r5 != 0) goto L_0x012b
                    goto L_0x0145
                L_0x012b:
                    r5 = r2
                    sa.b r5 = (sa.b) r5
                    long r5 = r5.f11045y
                L_0x0130:
                    java.lang.Object r10 = r3.next()
                    r11 = r10
                    sa.b r11 = (sa.b) r11
                    long r13 = r11.f11045y
                    int r11 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                    if (r11 <= 0) goto L_0x013f
                    r2 = r10
                    r5 = r13
                L_0x013f:
                    boolean r10 = r3.hasNext()
                    if (r10 != 0) goto L_0x0130
                L_0x0145:
                    sa.b r2 = (sa.b) r2
                    if (r2 == 0) goto L_0x014b
                    long r7 = r2.f11045y
                L_0x014b:
                    r4.f13621a = r7
                    java.lang.String r2 = r12.f11776c
                    java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
                    java.util.Locale r5 = java.util.Locale.getDefault()
                    java.lang.String r6 = "yyyy.MM.dd  HH:mm:ss"
                    r3.<init>(r6, r5)
                    java.util.Date r5 = new java.util.Date
                    r5.<init>(r7)
                    java.lang.String r3 = r3.format(r5)
                    java.lang.String r5 = "dateFormat.format(Date(timeStampMillis))"
                    e6.e.C(r3, r5)
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "Oldest item "
                    r5.append(r6)
                    r5.append(r7)
                    java.lang.String r6 = " : "
                    r5.append(r6)
                    r5.append(r3)
                    java.lang.String r3 = r5.toString()
                    android.util.Log.d(r2, r3)
                    r12 = r4
                    r6 = r9
                    r13 = r15
                    r2 = r16
                    r14 = r17
                    r4 = r0
                    goto L_0x0190
                L_0x018d:
                    r1 = r2
                    r12 = r10
                    r2 = r11
                L_0x0190:
                    int r0 = r6.size()
                    r2.f13620a = r0
                    r11 = 1
                    int r10 = r4 + 1
                    boolean r0 = r14.D
                    if (r0 == 0) goto L_0x01a2
                    boolean r0 = r13.f13618a
                    if (r0 != 0) goto L_0x01a2
                    goto L_0x01a7
                L_0x01a2:
                    r3 = 0
                    r0 = r20
                    goto L_0x007d
                L_0x01a7:
                    int r0 = r2.f13620a
                    int r1 = r14.A
                    if (r0 < r1) goto L_0x01ba
                    long r0 = r14.B
                    long r2 = r12.f13621a
                    long r0 = r0 - r2
                    ua.f r2 = r14.z
                    long r2 = r2.f11778e
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 < 0) goto L_0x01ce
                L_0x01ba:
                    ua.f r0 = r14.z
                    android.content.Context r0 = r0.f11774a
                    qa.e r1 = qa.e.IS_CACHED_SUBSCAN
                    java.lang.Boolean r2 = java.lang.Boolean.TRUE
                    ah.v.f0(r0, r1, r2)
                    ua.f r0 = r14.z
                    java.lang.String r0 = r0.f11776c
                    java.lang.String r1 = "Subscan caching complete!"
                    android.util.Log.d(r0, r1)
                L_0x01ce:
                    md.m r0 = md.m.f8555a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ua.g.a.C0232a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @e(c = "io.nodle.cash.data.repository.TransactionRepository$fetchAllTransactions$2$1$2", f = "TransactionRepository.kt", l = {137, 143, 153, 159}, m = "invokeSuspend")
        public static final class b extends i implements p<d0, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public n f11811a;

            /* renamed from: b  reason: collision with root package name */
            public int f11812b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ f f11813c;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ boolean f11814s;

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ int f11815t;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ String f11816u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ int f11817v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ long f11818w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ n<e<Object>> f11819x;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(f fVar, boolean z, int i, String str, int i10, long j10, n<? super e<Object>> nVar, d<? super b> dVar) {
                super(2, dVar);
                this.f11813c = fVar;
                this.f11814s = z;
                this.f11815t = i;
                this.f11816u = str;
                this.f11817v = i10;
                this.f11818w = j10;
                this.f11819x = nVar;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                return new b(this.f11813c, this.f11814s, this.f11815t, this.f11816u, this.f11817v, this.f11818w, this.f11819x, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((b) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x010a  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x012a  */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x0134  */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x0158  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r0 = r16
                    qd.a r1 = qd.a.COROUTINE_SUSPENDED
                    int r2 = r0.f11812b
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    r7 = 0
                    if (r2 == 0) goto L_0x0038
                    if (r2 == r6) goto L_0x0032
                    if (r2 == r5) goto L_0x002b
                    if (r2 == r4) goto L_0x0024
                    if (r2 != r3) goto L_0x001c
                    ie.n r1 = r0.f11811a
                    l6.b1.w(r17)
                    goto L_0x0147
                L_0x001c:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0024:
                    l6.b1.w(r17)
                    r2 = r17
                    goto L_0x0100
                L_0x002b:
                    ie.n r2 = r0.f11811a
                    l6.b1.w(r17)
                    goto L_0x00c2
                L_0x0032:
                    l6.b1.w(r17)
                    r2 = r17
                    goto L_0x007a
                L_0x0038:
                    l6.b1.w(r17)
                    ua.f r2 = r0.f11813c
                    boolean r2 = ua.f.a(r2)
                    if (r2 == 0) goto L_0x004a
                    boolean r2 = r0.f11814s
                    if (r2 == 0) goto L_0x004a
                    md.m r1 = md.m.f8555a
                    return r1
                L_0x004a:
                    ua.f r2 = r0.f11813c
                    boolean r2 = ua.f.a(r2)
                    if (r2 != 0) goto L_0x0058
                    int r2 = r0.f11815t
                    r8 = 101(0x65, float:1.42E-43)
                    if (r2 != r8) goto L_0x00cb
                L_0x0058:
                    ua.f r2 = r0.f11813c
                    java.lang.String r2 = r2.f11776c
                    java.lang.String r8 = "CIDT FOR_HISTORY"
                    android.util.Log.d(r2, r8)
                    ua.f r2 = r0.f11813c
                    java.lang.String r8 = r0.f11816u
                    int r9 = r0.f11817v
                    r0.f11812b = r6
                    java.util.Objects.requireNonNull(r2)
                    me.b r10 = ge.o0.f5434b
                    ua.i r11 = new ua.i
                    r11.<init>(r2, r8, r9, r7)
                    java.lang.Object r2 = ge.g.d(r10, r11, r0)
                    if (r2 != r1) goto L_0x007a
                    return r1
                L_0x007a:
                    ua.f r8 = r0.f11813c
                    ie.n<ua.e<java.lang.Object>> r9 = r0.f11819x
                    java.util.List r2 = (java.util.List) r2
                    java.lang.String r10 = r8.f11776c
                    if (r2 == 0) goto L_0x008e
                    int r11 = r2.size()
                    java.lang.Integer r12 = new java.lang.Integer
                    r12.<init>(r11)
                    goto L_0x008f
                L_0x008e:
                    r12 = r7
                L_0x008f:
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    java.lang.String r13 = "CIDT Transactions: "
                    r11.append(r13)
                    r11.append(r12)
                    java.lang.String r11 = r11.toString()
                    android.util.Log.d(r10, r11)
                    if (r2 != 0) goto L_0x00af
                    java.lang.String r1 = r8.f11776c
                    java.lang.String r2 = "CIDT transactions caching failed!"
                    android.util.Log.d(r1, r2)
                    md.m r1 = md.m.f8555a
                    return r1
                L_0x00af:
                    boolean r10 = r2.isEmpty()
                    r10 = r10 ^ r6
                    if (r10 == 0) goto L_0x00c3
                    r0.f11811a = r9
                    r0.f11812b = r5
                    java.lang.Object r2 = ua.f.b(r8, r2, r0)
                    if (r2 != r1) goto L_0x00c1
                    return r1
                L_0x00c1:
                    r2 = r9
                L_0x00c2:
                    r9 = r2
                L_0x00c3:
                    ua.e$b r2 = new ua.e$b
                    r2.<init>()
                    r9.k(r2)
                L_0x00cb:
                    ua.f r2 = r0.f11813c
                    boolean r2 = ua.f.a(r2)
                    if (r2 != 0) goto L_0x00d9
                    int r2 = r0.f11815t
                    r5 = 102(0x66, float:1.43E-43)
                    if (r2 != r5) goto L_0x0150
                L_0x00d9:
                    ua.f r2 = r0.f11813c
                    java.lang.String r2 = r2.f11776c
                    java.lang.String r5 = "CIDT FOR_REWARD_STATS"
                    android.util.Log.d(r2, r5)
                    long r11 = r0.f11818w
                    ua.f r13 = r0.f11813c
                    long r8 = r13.f11778e
                    long r9 = r11 - r8
                    java.lang.String r14 = r0.f11816u
                    r0.f11811a = r7
                    r0.f11812b = r4
                    me.b r2 = ge.o0.f5434b
                    ua.h r4 = new ua.h
                    r15 = 0
                    r8 = r4
                    r8.<init>(r9, r11, r13, r14, r15)
                    java.lang.Object r2 = ge.g.d(r2, r4, r0)
                    if (r2 != r1) goto L_0x0100
                    return r1
                L_0x0100:
                    ua.f r4 = r0.f11813c
                    ie.n<ua.e<java.lang.Object>> r5 = r0.f11819x
                    java.util.List r2 = (java.util.List) r2
                    java.lang.String r8 = r4.f11776c
                    if (r2 == 0) goto L_0x0114
                    int r7 = r2.size()
                    java.lang.Integer r9 = new java.lang.Integer
                    r9.<init>(r7)
                    r7 = r9
                L_0x0114:
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r10 = "CIDT Reward transactions: "
                    r9.append(r10)
                    r9.append(r7)
                    java.lang.String r7 = r9.toString()
                    android.util.Log.d(r8, r7)
                    if (r2 != 0) goto L_0x0134
                    java.lang.String r1 = r4.f11776c
                    java.lang.String r2 = "CIDT rewards caching failed!"
                    android.util.Log.d(r1, r2)
                    md.m r1 = md.m.f8555a
                    return r1
                L_0x0134:
                    boolean r7 = r2.isEmpty()
                    r6 = r6 ^ r7
                    if (r6 == 0) goto L_0x0148
                    r0.f11811a = r5
                    r0.f11812b = r3
                    java.lang.Object r2 = ua.f.b(r4, r2, r0)
                    if (r2 != r1) goto L_0x0146
                    return r1
                L_0x0146:
                    r1 = r5
                L_0x0147:
                    r5 = r1
                L_0x0148:
                    ua.e$b r1 = new ua.e$b
                    r1.<init>()
                    r5.k(r1)
                L_0x0150:
                    ua.f r1 = r0.f11813c
                    boolean r1 = ua.f.a(r1)
                    if (r1 == 0) goto L_0x0163
                    ua.f r1 = r0.f11813c
                    android.content.Context r1 = r1.f11774a
                    qa.e r2 = qa.e.IS_CACHED_CIDT
                    java.lang.Boolean r3 = java.lang.Boolean.TRUE
                    ah.v.f0(r1, r2, r3)
                L_0x0163:
                    ua.f r1 = r0.f11813c
                    java.lang.String r1 = r1.f11776c
                    java.lang.String r2 = "CIDT caching complete!"
                    android.util.Log.d(r1, r2)
                    md.m r1 = md.m.f8555a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ua.g.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, int i, d<? super a> dVar) {
            super(2, dVar);
            this.f11798w = fVar;
            this.f11799x = str;
            this.f11800y = i;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f11798w, this.f11799x, this.f11800y, dVar);
            aVar.f11797v = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((n) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: ie.n} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0129 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0142  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0146 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0147  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r6 = r21
                qd.a r7 = qd.a.COROUTINE_SUSPENDED
                int r0 = r6.f11796u
                r1 = 4
                r2 = 3
                r8 = 2
                r3 = 1
                if (r0 == 0) goto L_0x0054
                if (r0 == r3) goto L_0x0042
                if (r0 == r8) goto L_0x002f
                if (r0 == r2) goto L_0x0025
                if (r0 != r1) goto L_0x001d
                java.lang.Object r0 = r6.f11797v
                ie.n r0 = (ie.n) r0
                l6.b1.w(r22)
                goto L_0x0148
            L_0x001d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0025:
                java.lang.Object r0 = r6.f11797v
                ie.n r0 = (ie.n) r0
                l6.b1.w(r22)
                r8 = r0
                goto L_0x012a
            L_0x002f:
                boolean r0 = r6.f11795t
                boolean r1 = r6.f11794s
                long r2 = r6.f11793c
                int r4 = r6.f11792b
                java.util.ArrayList r5 = r6.f11791a
                java.lang.Object r8 = r6.f11797v
                ie.n r8 = (ie.n) r8
                l6.b1.w(r22)
                goto L_0x00e2
            L_0x0042:
                boolean r0 = r6.f11795t
                boolean r1 = r6.f11794s
                long r2 = r6.f11793c
                int r4 = r6.f11792b
                java.util.ArrayList r5 = r6.f11791a
                java.lang.Object r9 = r6.f11797v
                ie.n r9 = (ie.n) r9
                l6.b1.w(r22)
                goto L_0x00b7
            L_0x0054:
                l6.b1.w(r22)
                java.lang.Object r0 = r6.f11797v
                r9 = r0
                ie.n r9 = (ie.n) r9
                ua.e$a r0 = new ua.e$a
                r0.<init>(r3)
                r9.k(r0)
                r10 = 100
                long r11 = java.lang.System.currentTimeMillis()
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                ua.f r0 = r6.f11798w
                android.content.Context r0 = r0.f11774a
                qa.e r1 = qa.e.IS_CACHED_SUBSCAN
                java.lang.String r0 = ah.v.J(r0, r1)
                boolean r14 = java.lang.Boolean.parseBoolean(r0)
                ua.f r0 = r6.f11798w
                android.content.Context r0 = r0.f11774a
                qa.e r1 = qa.e.IS_CACHED_CIDT
                java.lang.String r0 = ah.v.J(r0, r1)
                boolean r15 = java.lang.Boolean.parseBoolean(r0)
                ua.f r0 = r6.f11798w
                long r4 = r0.f11777d
                r6.f11797v = r9
                r6.f11791a = r13
                r6.f11792b = r10
                r6.f11793c = r11
                r6.f11794s = r14
                r6.f11795t = r15
                r6.f11796u = r3
                ra.c r0 = r0.f11779f
                long r1 = java.lang.System.currentTimeMillis()
                r3 = r4
                r5 = r21
                java.lang.Object r0 = r0.d(r1, r3, r5)
                if (r0 != r7) goto L_0x00ad
                goto L_0x00af
            L_0x00ad:
                md.m r0 = md.m.f8555a
            L_0x00af:
                if (r0 != r7) goto L_0x00b2
                return r7
            L_0x00b2:
                r4 = r10
                r2 = r11
                r5 = r13
                r1 = r14
                r0 = r15
            L_0x00b7:
                ua.f r10 = r6.f11798w
                boolean r10 = ua.f.a(r10)
                if (r10 == 0) goto L_0x00e6
                if (r1 != 0) goto L_0x00e6
                if (r0 != 0) goto L_0x00e6
                ua.f r10 = r6.f11798w
                r6.f11797v = r9
                r6.f11791a = r5
                r6.f11792b = r4
                r6.f11793c = r2
                r6.f11794s = r1
                r6.f11795t = r0
                r6.f11796u = r8
                ra.c r8 = r10.f11779f
                java.lang.Object r8 = r8.a(r6)
                if (r8 != r7) goto L_0x00dc
                goto L_0x00de
            L_0x00dc:
                md.m r8 = md.m.f8555a
            L_0x00de:
                if (r8 != r7) goto L_0x00e1
                return r7
            L_0x00e1:
                r8 = r9
            L_0x00e2:
                r11 = r0
                r18 = r1
                goto L_0x00ea
            L_0x00e6:
                r11 = r0
                r18 = r1
                r8 = r9
            L_0x00ea:
                ua.g$a$a r0 = new ua.g$a$a
                ua.f r13 = r6.f11798w
                java.lang.String r1 = r6.f11799x
                r20 = 0
                r12 = r0
                r14 = r4
                r15 = r2
                r17 = r1
                r19 = r8
                r12.<init>(r13, r14, r15, r17, r18, r19, r20)
                r1 = 0
                r9 = 3
                ge.g1 r0 = ge.g.b(r8, r1, r0, r9)
                r5.add(r0)
                ua.g$a$b r0 = new ua.g$a$b
                ua.f r10 = r6.f11798w
                int r12 = r6.f11800y
                java.lang.String r13 = r6.f11799x
                r18 = 0
                r9 = r0
                r17 = r8
                r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18)
                r2 = 3
                ge.g1 r0 = ge.g.b(r8, r1, r0, r2)
                r5.add(r0)
                r6.f11797v = r8
                r6.f11791a = r1
                r6.f11796u = r2
                java.lang.Object r0 = ge.c.a(r5, r6)
                if (r0 != r7) goto L_0x012a
                return r7
            L_0x012a:
                ua.f r0 = r6.f11798w
                long r3 = r0.f11778e
                r6.f11797v = r8
                r1 = 4
                r6.f11796u = r1
                ra.c r0 = r0.f11779f
                long r1 = java.lang.System.currentTimeMillis()
                r5 = r21
                java.lang.Object r0 = r0.h(r1, r3, r5)
                if (r0 != r7) goto L_0x0142
                goto L_0x0144
            L_0x0142:
                md.m r0 = md.m.f8555a
            L_0x0144:
                if (r0 != r7) goto L_0x0147
                return r7
            L_0x0147:
                r0 = r8
            L_0x0148:
                ua.e$a r1 = new ua.e$a
                r2 = 0
                r1.<init>(r2)
                r0.k(r1)
                md.m r0 = md.m.f8555a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ua.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f fVar, String str, int i, d<? super g> dVar) {
        super(2, dVar);
        this.f11788a = fVar;
        this.f11789b = str;
        this.f11790c = i;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f11788a, this.f11789b, this.f11790c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        b1.w(obj);
        if (!f.a(this.f11788a)) {
            Context context = this.f11788a.f11774a;
            qa.e eVar = qa.e.IS_CACHED_SUBSCAN;
            Boolean bool = Boolean.FALSE;
            v.f0(context, eVar, bool);
            v.f0(this.f11788a.f11774a, qa.e.IS_CACHED_CIDT, bool);
        }
        return new je.d(new a(this.f11788a, this.f11789b, this.f11790c, (d<? super a>) null));
    }
}
