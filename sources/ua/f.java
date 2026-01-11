package ua;

import android.content.Context;
import bb.g;
import io.nodle.cash.data.local.CashDatabase;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11774a;

    /* renamed from: b  reason: collision with root package name */
    public final db.a f11775b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11776c = f.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public final long f11777d = 3600000;

    /* renamed from: e  reason: collision with root package name */
    public final long f11778e = 31556952000L;

    /* renamed from: f  reason: collision with root package name */
    public final ra.c f11779f;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11780a;

        static {
            int[] iArr = new int[g.values().length];
            iArr[g.REWARD.ordinal()] = 1;
            f11780a = iArr;
        }
    }

    @e(c = "io.nodle.cash.data.repository.TransactionRepository", f = "TransactionRepository.kt", l = {317, 318}, m = "getLocalTransactions")
    public static final class b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public f f11781a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f11782b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f11783c;

        /* renamed from: s  reason: collision with root package name */
        public int f11784s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar, d<? super b> dVar) {
            super(dVar);
            this.f11783c = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11782b = obj;
            this.f11784s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f11783c.c((g) null, 0, this);
        }
    }

    @e(c = "io.nodle.cash.data.repository.TransactionRepository", f = "TransactionRepository.kt", l = {299}, m = "hasPendingTransactions")
    public static final class c extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f11785a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f11786b;

        /* renamed from: c  reason: collision with root package name */
        public int f11787c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f fVar, d<? super c> dVar) {
            super(dVar);
            this.f11786b = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11785a = obj;
            this.f11787c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f11786b.d(this);
        }
    }

    public f(Context context, db.a aVar) {
        this.f11774a = context;
        this.f11775b = aVar;
        this.f11779f = CashDatabase.f6682n.a(context).s();
    }

    public static final boolean a(f fVar) {
        return fVar.f11775b.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c A[LOOP:0: B:19:0x0086->B:21:0x008c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(ua.f r10, java.util.List r11, pd.d r12) {
        /*
            java.util.Objects.requireNonNull(r10)
            boolean r0 = r12 instanceof ua.k
            if (r0 == 0) goto L_0x0016
            r0 = r12
            ua.k r0 = (ua.k) r0
            int r1 = r0.f11852t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f11852t = r1
            goto L_0x001b
        L_0x0016:
            ua.k r0 = new ua.k
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.f11850c
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f11852t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            l6.b1.w(r12)
            goto L_0x00dc
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            java.util.List r10 = r0.f11849b
            ua.f r11 = r0.f11848a
            l6.b1.w(r12)
            goto L_0x00cc
        L_0x0042:
            java.util.List r11 = r0.f11849b
            ua.f r10 = r0.f11848a
            l6.b1.w(r12)
            goto L_0x0077
        L_0x004a:
            l6.b1.w(r12)
            java.lang.String r12 = r10.f11776c
            int r2 = r11.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "saveTransactions locally :"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r12, r2)
            ra.c r12 = r10.f11779f
            r0.f11848a = r10
            r0.f11849b = r11
            r0.f11852t = r5
            java.lang.Object r12 = r12.b(r0)
            if (r12 != r1) goto L_0x0077
            goto L_0x00ee
        L_0x0077:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = nd.g.S0(r12)
            r2.<init>(r6)
            java.util.Iterator r12 = r12.iterator()
        L_0x0086:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x0098
            java.lang.Object r6 = r12.next()
            sa.b r6 = (sa.b) r6
            java.lang.String r6 = r6.f11044x
            r2.add(r6)
            goto L_0x0086
        L_0x0098:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r6 = r11.iterator()
        L_0x00a1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00ba
            java.lang.Object r7 = r6.next()
            r8 = r7
            sa.b r8 = (sa.b) r8
            java.lang.String r8 = r8.f11044x
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x00a1
            r12.add(r7)
            goto L_0x00a1
        L_0x00ba:
            ra.c r2 = r10.f11779f
            r0.f11848a = r10
            r0.f11849b = r11
            r0.f11852t = r4
            java.lang.Object r12 = r2.f(r12, r0)
            if (r12 != r1) goto L_0x00c9
            goto L_0x00ee
        L_0x00c9:
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x00cc:
            ra.c r11 = r11.f11779f
            r12 = 0
            r0.f11848a = r12
            r0.f11849b = r12
            r0.f11852t = r3
            java.lang.Object r12 = r11.g(r10, r0)
            if (r12 != r1) goto L_0x00dc
            goto L_0x00ee
        L_0x00dc:
            java.util.List r12 = (java.util.List) r12
            r10 = -1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r10)
            boolean r10 = r12.contains(r0)
            r10 = r10 ^ r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
        L_0x00ee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.f.b(ua.f, java.util.List, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(bb.g r20, int r21, pd.d<? super java.util.List<sa.b>> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = r3 instanceof ua.f.b
            if (r4 == 0) goto L_0x001b
            r4 = r3
            ua.f$b r4 = (ua.f.b) r4
            int r5 = r4.f11784s
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f11784s = r5
            goto L_0x0020
        L_0x001b:
            ua.f$b r4 = new ua.f$b
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f11782b
            qd.a r5 = qd.a.COROUTINE_SUSPENDED
            int r6 = r4.f11784s
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x0041
            if (r6 == r8) goto L_0x003b
            if (r6 != r7) goto L_0x0033
            l6.b1.w(r3)
            goto L_0x012b
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            ua.f r1 = r4.f11781a
            l6.b1.w(r3)
            goto L_0x005c
        L_0x0041:
            l6.b1.w(r3)
            int[] r3 = ua.f.a.f11780a
            int r6 = r20.ordinal()
            r3 = r3[r6]
            if (r3 != r8) goto L_0x0120
            ra.c r3 = r0.f11779f
            r4.f11781a = r0
            r4.f11784s = r8
            java.lang.Object r3 = r3.i(r1, r2, r4)
            if (r3 != r5) goto L_0x005b
            return r5
        L_0x005b:
            r1 = r0
        L_0x005c:
            java.util.List r3 = (java.util.List) r3
            java.util.Objects.requireNonNull(r1)
            android.content.Context r2 = r1.f11774a
            qa.e r4 = qa.e.REWARDS_PENDING_DEVICE_COUNT
            java.lang.String r2 = ah.v.J(r2, r4)
            long r4 = java.lang.Long.parseLong(r2)
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x011f
            r9 = r3
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            sa.b r10 = new sa.b
            r10.<init>()
            bb.g r11 = bb.g.REWARD
            r10.e(r11)
            boolean r11 = r3.isEmpty()
            r11 = r11 ^ r8
            r12 = 0
            if (r11 == 0) goto L_0x0094
            java.lang.Object r6 = r3.get(r12)
            sa.b r6 = (sa.b) r6
            long r6 = r6.f11045y
            r11 = 1000(0x3e8, float:1.401E-42)
            long r13 = (long) r11
            long r6 = r6 + r13
        L_0x0094:
            r10.f11045y = r6
            r10.A = r8
            java.lang.String r6 = "10+"
            r13 = 1
            r15 = 2
            r17 = 10
            if (r2 != 0) goto L_0x00a4
            r7 = 0
            goto L_0x00db
        L_0x00a4:
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x00b2
            android.content.Context r7 = r1.f11774a
            r11 = 2131755121(0x7f100071, float:1.9141112E38)
            java.lang.String r7 = r7.getString(r11)
            goto L_0x00db
        L_0x00b2:
            int r7 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x00bc
            int r7 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r7 > 0) goto L_0x00bc
            r7 = r8
            goto L_0x00bd
        L_0x00bc:
            r7 = r12
        L_0x00bd:
            r11 = 2131755120(0x7f100070, float:1.914111E38)
            if (r7 == 0) goto L_0x00d1
            android.content.Context r7 = r1.f11774a
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.String r16 = java.lang.String.valueOf(r4)
            r15[r12] = r16
            java.lang.String r7 = r7.getString(r11, r15)
            goto L_0x00db
        L_0x00d1:
            android.content.Context r7 = r1.f11774a
            java.lang.Object[] r15 = new java.lang.Object[r8]
            r15[r12] = r6
            java.lang.String r7 = r7.getString(r11, r15)
        L_0x00db:
            r10.B = r7
            if (r2 != 0) goto L_0x00e1
            r1 = 0
            goto L_0x011a
        L_0x00e1:
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00ef
            android.content.Context r1 = r1.f11774a
            r2 = 2131755361(0x7f100161, float:1.91416E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x011a
        L_0x00ef:
            r13 = 2
            int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x00fb
            int r2 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x00fb
            r2 = r8
            goto L_0x00fc
        L_0x00fb:
            r2 = r12
        L_0x00fc:
            r7 = 2131755360(0x7f100160, float:1.9141597E38)
            if (r2 == 0) goto L_0x0110
            android.content.Context r1 = r1.f11774a
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2[r12] = r4
            java.lang.String r1 = r1.getString(r7, r2)
            goto L_0x011a
        L_0x0110:
            android.content.Context r1 = r1.f11774a
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r12] = r6
            java.lang.String r1 = r1.getString(r7, r2)
        L_0x011a:
            r10.C = r1
            r9.add(r12, r10)
        L_0x011f:
            return r3
        L_0x0120:
            ra.c r3 = r0.f11779f
            r4.f11784s = r7
            java.lang.Object r3 = r3.i(r1, r2, r4)
            if (r3 != r5) goto L_0x012b
            return r5
        L_0x012b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.f.c(bb.g, int, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(pd.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ua.f.c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ua.f$c r0 = (ua.f.c) r0
            int r1 = r0.f11787c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11787c = r1
            goto L_0x0018
        L_0x0013:
            ua.f$c r0 = new ua.f$c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f11785a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f11787c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            l6.b1.w(r5)
            goto L_0x003d
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            l6.b1.w(r5)
            ra.c r5 = r4.f11779f
            r0.f11787c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.f.d(pd.d):java.lang.Object");
    }
}
