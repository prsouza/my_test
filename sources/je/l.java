package je;

import ah.v;
import e6.e;
import ge.g0;
import ge.g1;
import ge.q0;
import ie.d;
import java.util.Objects;
import le.r;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class l<T> extends ke.a<m> implements h<T>, e {

    /* renamed from: s  reason: collision with root package name */
    public final int f7211s;

    /* renamed from: t  reason: collision with root package name */
    public final int f7212t;

    /* renamed from: u  reason: collision with root package name */
    public final d f7213u;

    /* renamed from: v  reason: collision with root package name */
    public Object[] f7214v;

    /* renamed from: w  reason: collision with root package name */
    public long f7215w;

    /* renamed from: x  reason: collision with root package name */
    public long f7216x;

    /* renamed from: y  reason: collision with root package name */
    public int f7217y;
    public int z;

    public static final class a implements q0 {

        /* renamed from: a  reason: collision with root package name */
        public final l<?> f7218a;

        /* renamed from: b  reason: collision with root package name */
        public long f7219b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f7220c;

        /* renamed from: s  reason: collision with root package name */
        public final pd.d<m> f7221s;

        public a(l<?> lVar, long j10, Object obj, pd.d<? super m> dVar) {
            this.f7218a = lVar;
            this.f7219b = j10;
            this.f7220c = obj;
            this.f7221s = dVar;
        }

        public final void e() {
            l<?> lVar = this.f7218a;
            synchronized (lVar) {
                if (this.f7219b >= lVar.n()) {
                    Object[] objArr = lVar.f7214v;
                    e.B(objArr);
                    int i = (int) this.f7219b;
                    if (objArr[(objArr.length - 1) & i] == this) {
                        objArr[i & (objArr.length - 1)] = g0.f5391b;
                        lVar.h();
                    }
                }
            }
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7222a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.SUSPEND.ordinal()] = 1;
            iArr[d.DROP_LATEST.ordinal()] = 2;
            iArr[d.DROP_OLDEST.ordinal()] = 3;
            f7222a = iArr;
        }
    }

    @rd.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
    public static final class c extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public l f7223a;

        /* renamed from: b  reason: collision with root package name */
        public f f7224b;

        /* renamed from: c  reason: collision with root package name */
        public m f7225c;

        /* renamed from: s  reason: collision with root package name */
        public g1 f7226s;

        /* renamed from: t  reason: collision with root package name */
        public /* synthetic */ Object f7227t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ l<T> f7228u;

        /* renamed from: v  reason: collision with root package name */
        public int f7229v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(l<T> lVar, pd.d<? super c> dVar) {
            super(dVar);
            this.f7228u = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7227t = obj;
            this.f7229v |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return l.i(this.f7228u, (f) null, this);
        }
    }

    public l(int i, int i10, d dVar) {
        this.f7211s = i;
        this.f7212t = i10;
        this.f7213u = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object i(je.l r8, je.f r9, pd.d r10) {
        /*
            boolean r0 = r10 instanceof je.l.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            je.l$c r0 = (je.l.c) r0
            int r1 = r0.f7229v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7229v = r1
            goto L_0x0018
        L_0x0013:
            je.l$c r0 = new je.l$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f7227t
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f7229v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            ge.g1 r8 = r0.f7226s
            je.m r9 = r0.f7225c
            je.f r2 = r0.f7224b
            je.l r5 = r0.f7223a
            l6.b1.w(r10)     // Catch:{ all -> 0x003e }
            goto L_0x0089
        L_0x003e:
            r8 = move-exception
        L_0x003f:
            r10 = r9
            r9 = r8
            r8 = r5
            goto L_0x00bd
        L_0x0044:
            je.m r9 = r0.f7225c
            je.f r8 = r0.f7224b
            je.l r2 = r0.f7223a
            l6.b1.w(r10)     // Catch:{ all -> 0x0050 }
            r10 = r8
            r8 = r2
            goto L_0x007a
        L_0x0050:
            r8 = move-exception
            r10 = r9
            r9 = r8
            r8 = r2
            goto L_0x00bd
        L_0x0056:
            l6.b1.w(r10)
            ke.b r10 = r8.c()
            je.m r10 = (je.m) r10
            boolean r2 = r9 instanceof je.q     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0077
            r2 = r9
            je.q r2 = (je.q) r2     // Catch:{ all -> 0x0075 }
            r0.f7223a = r8     // Catch:{ all -> 0x0075 }
            r0.f7224b = r9     // Catch:{ all -> 0x0075 }
            r0.f7225c = r10     // Catch:{ all -> 0x0075 }
            r0.f7229v = r5     // Catch:{ all -> 0x0075 }
            java.lang.Object r2 = r2.b(r0)     // Catch:{ all -> 0x0075 }
            if (r2 != r1) goto L_0x0077
            return r1
        L_0x0075:
            r9 = move-exception
            goto L_0x00bd
        L_0x0077:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x007a:
            pd.f r2 = r0.getContext()     // Catch:{ all -> 0x00b9 }
            ge.g1$b r5 = ge.g1.b.f5401a     // Catch:{ all -> 0x00b9 }
            pd.f$a r2 = r2.get(r5)     // Catch:{ all -> 0x00b9 }
            ge.g1 r2 = (ge.g1) r2     // Catch:{ all -> 0x00b9 }
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0089:
            java.lang.Object r10 = r5.r(r9)     // Catch:{ all -> 0x003e }
            le.r r6 = ge.g0.f5391b     // Catch:{ all -> 0x003e }
            if (r10 == r6) goto L_0x00a8
            if (r8 != 0) goto L_0x0094
            goto L_0x0097
        L_0x0094:
            ad.c.F(r8)     // Catch:{ all -> 0x003e }
        L_0x0097:
            r0.f7223a = r5     // Catch:{ all -> 0x003e }
            r0.f7224b = r2     // Catch:{ all -> 0x003e }
            r0.f7225c = r9     // Catch:{ all -> 0x003e }
            r0.f7226s = r8     // Catch:{ all -> 0x003e }
            r0.f7229v = r3     // Catch:{ all -> 0x003e }
            java.lang.Object r10 = r2.a(r10, r0)     // Catch:{ all -> 0x003e }
            if (r10 != r1) goto L_0x0089
            return r1
        L_0x00a8:
            r0.f7223a = r5     // Catch:{ all -> 0x003e }
            r0.f7224b = r2     // Catch:{ all -> 0x003e }
            r0.f7225c = r9     // Catch:{ all -> 0x003e }
            r0.f7226s = r8     // Catch:{ all -> 0x003e }
            r0.f7229v = r4     // Catch:{ all -> 0x003e }
            java.lang.Object r10 = r5.g(r9, r0)     // Catch:{ all -> 0x003e }
            if (r10 != r1) goto L_0x0089
            return r1
        L_0x00b9:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x003f
        L_0x00bd:
            r8.f(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: je.l.i(je.l, je.f, pd.d):java.lang.Object");
    }

    public final Object a(T t10, pd.d<? super m> dVar) {
        int i;
        boolean z10;
        a aVar;
        pd.d[] dVarArr;
        pd.d[] dVarArr2 = v.C;
        synchronized (this) {
            i = 0;
            if (p(t10)) {
                dVarArr2 = l(dVarArr2);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        int length = dVarArr2.length;
        int i10 = 0;
        while (i10 < length) {
            pd.d dVar2 = dVarArr2[i10];
            i10++;
            if (dVar2 != null) {
                dVar2.resumeWith(m.f8555a);
            }
        }
        if (z10) {
            return m.f8555a;
        }
        ge.l lVar = new ge.l(ad.c.Y(dVar), 1);
        lVar.u();
        pd.d[] dVarArr3 = v.C;
        synchronized (this) {
            if (p(t10)) {
                lVar.resumeWith(m.f8555a);
                dVarArr = l(dVarArr3);
                aVar = null;
            } else {
                a aVar2 = new a(this, ((long) (this.f7217y + this.z)) + n(), t10, lVar);
                k(aVar2);
                this.z++;
                if (this.f7212t == 0) {
                    dVarArr3 = l(dVarArr3);
                }
                dVarArr = dVarArr3;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            y.c.w(lVar, aVar);
        }
        int length2 = dVarArr.length;
        while (i < length2) {
            pd.d dVar3 = dVarArr[i];
            i++;
            if (dVar3 != null) {
                dVar3.resumeWith(m.f8555a);
            }
        }
        Object t11 = lVar.t();
        qd.a aVar3 = qd.a.COROUTINE_SUSPENDED;
        if (t11 != aVar3) {
            t11 = m.f8555a;
        }
        return t11 == aVar3 ? t11 : m.f8555a;
    }

    public final Object b(f<? super T> fVar, pd.d<?> dVar) {
        return i(this, fVar, dVar);
    }

    public final ke.b d() {
        return new m();
    }

    public final ke.b[] e() {
        return new m[2];
    }

    public final Object g(m mVar, pd.d<? super m> dVar) {
        m mVar2;
        ge.l lVar = new ge.l(ad.c.Y(dVar), 1);
        lVar.u();
        synchronized (this) {
            if (q(mVar) < 0) {
                mVar.f7231b = lVar;
            } else {
                lVar.resumeWith(m.f8555a);
            }
            mVar2 = m.f8555a;
        }
        Object t10 = lVar.t();
        return t10 == qd.a.COROUTINE_SUSPENDED ? t10 : mVar2;
    }

    public final void h() {
        if (this.f7212t != 0 || this.z > 1) {
            Object[] objArr = this.f7214v;
            e.B(objArr);
            while (this.z > 0) {
                long n10 = n();
                int i = this.f7217y;
                int i10 = this.z;
                if (objArr[((int) ((n10 + ((long) (i + i10))) - 1)) & (objArr.length - 1)] == g0.f5391b) {
                    this.z = i10 - 1;
                    objArr[((int) (n() + ((long) (this.f7217y + this.z)))) & (objArr.length - 1)] = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void j() {
        S[] sArr;
        Object[] objArr = this.f7214v;
        e.B(objArr);
        objArr[((int) n()) & (objArr.length - 1)] = null;
        this.f7217y--;
        long n10 = n() + 1;
        if (this.f7215w < n10) {
            this.f7215w = n10;
        }
        if (this.f7216x < n10) {
            if (!(this.f7503b == 0 || (sArr = this.f7502a) == null)) {
                int i = 0;
                int length = sArr.length;
                while (i < length) {
                    S s10 = sArr[i];
                    i++;
                    if (s10 != null) {
                        m mVar = (m) s10;
                        long j10 = mVar.f7230a;
                        if (j10 >= 0 && j10 < n10) {
                            mVar.f7230a = n10;
                        }
                    }
                }
            }
            this.f7216x = n10;
        }
    }

    public final void k(Object obj) {
        int i = this.f7217y + this.z;
        Object[] objArr = this.f7214v;
        if (objArr == null) {
            objArr = o((Object[]) null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = o(objArr, i, objArr.length * 2);
        }
        objArr[((int) (n() + ((long) i))) & (objArr.length - 1)] = obj;
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x000d, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pd.d<md.m>[] l(pd.d<md.m>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f7503b
            if (r1 != 0) goto L_0x0006
            goto L_0x0046
        L_0x0006:
            S[] r1 = r10.f7502a
            if (r1 != 0) goto L_0x000b
            goto L_0x0046
        L_0x000b:
            r2 = 0
            int r3 = r1.length
        L_0x000d:
            if (r2 >= r3) goto L_0x0046
            r4 = r1[r2]
            int r2 = r2 + 1
            if (r4 == 0) goto L_0x000d
            je.m r4 = (je.m) r4
            pd.d<? super md.m> r5 = r4.f7231b
            if (r5 != 0) goto L_0x001c
            goto L_0x000d
        L_0x001c:
            long r6 = r10.q(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0027
            goto L_0x000d
        L_0x0027:
            int r6 = r11.length
            if (r0 < r6) goto L_0x003a
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            e6.e.C(r11, r6)
        L_0x003a:
            r6 = r11
            pd.d[] r6 = (pd.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f7231b = r0
            r0 = r7
            goto L_0x000d
        L_0x0046:
            pd.d[] r11 = (pd.d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: je.l.l(pd.d[]):pd.d[]");
    }

    public final long m() {
        return n() + ((long) this.f7217y);
    }

    public final long n() {
        return Math.min(this.f7216x, this.f7215w);
    }

    public final Object[] o(Object[] objArr, int i, int i10) {
        int i11 = 0;
        if (i10 > 0) {
            Object[] objArr2 = new Object[i10];
            this.f7214v = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long n10 = n();
            while (i11 < i) {
                int i12 = i11 + 1;
                int i13 = (int) (((long) i11) + n10);
                objArr2[i13 & (i10 - 1)] = objArr[(objArr.length - 1) & i13];
                i11 = i12;
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean p(T t10) {
        if (this.f7503b == 0) {
            if (this.f7211s != 0) {
                k(t10);
                int i = this.f7217y + 1;
                this.f7217y = i;
                if (i > this.f7211s) {
                    j();
                }
                this.f7216x = n() + ((long) this.f7217y);
            }
            return true;
        }
        if (this.f7217y >= this.f7212t && this.f7216x <= this.f7215w) {
            int i10 = b.f7222a[this.f7213u.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        k(t10);
        int i11 = this.f7217y + 1;
        this.f7217y = i11;
        if (i11 > this.f7212t) {
            j();
        }
        long n10 = n() + ((long) this.f7217y);
        long j10 = this.f7215w;
        if (((int) (n10 - j10)) > this.f7211s) {
            s(j10 + 1, this.f7216x, m(), n() + ((long) this.f7217y) + ((long) this.z));
        }
        return true;
    }

    public final long q(m mVar) {
        long j10 = mVar.f7230a;
        if (j10 < m()) {
            return j10;
        }
        if (this.f7212t <= 0 && j10 <= n() && this.z != 0) {
            return j10;
        }
        return -1;
    }

    public final Object r(m mVar) {
        Object obj;
        pd.d[] dVarArr = v.C;
        synchronized (this) {
            long q10 = q(mVar);
            if (q10 < 0) {
                obj = g0.f5391b;
            } else {
                long j10 = mVar.f7230a;
                Object[] objArr = this.f7214v;
                e.B(objArr);
                Object obj2 = objArr[((int) q10) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f7220c;
                }
                mVar.f7230a = q10 + 1;
                Object obj3 = obj2;
                dVarArr = t(j10);
                obj = obj3;
            }
        }
        int i = 0;
        int length = dVarArr.length;
        while (i < length) {
            pd.d dVar = dVarArr[i];
            i++;
            if (dVar != null) {
                dVar.resumeWith(m.f8555a);
            }
        }
        return obj;
    }

    public final void s(long j10, long j11, long j12, long j13) {
        long j14 = j10;
        long j15 = j11;
        long min = Math.min(j15, j10);
        for (long n10 = n(); n10 < min; n10 = 1 + n10) {
            Object[] objArr = this.f7214v;
            e.B(objArr);
            objArr[((int) n10) & (objArr.length - 1)] = null;
        }
        this.f7215w = j14;
        this.f7216x = j15;
        this.f7217y = (int) (j12 - min);
        this.z = (int) (j13 - j12);
    }

    public final pd.d<m>[] t(long j10) {
        int i;
        S[] sArr;
        if (j10 > this.f7216x) {
            return v.C;
        }
        long n10 = n();
        long j11 = ((long) this.f7217y) + n10;
        long j12 = 1;
        if (this.f7212t == 0 && this.z > 0) {
            j11++;
        }
        if (!(this.f7503b == 0 || (sArr = this.f7502a) == null)) {
            int length = sArr.length;
            int i10 = 0;
            while (i10 < length) {
                S s10 = sArr[i10];
                i10++;
                if (s10 != null) {
                    long j13 = ((m) s10).f7230a;
                    if (j13 >= 0 && j13 < j11) {
                        j11 = j13;
                    }
                }
            }
        }
        if (j11 <= this.f7216x) {
            return v.C;
        }
        long m10 = m();
        if (this.f7503b > 0) {
            i = Math.min(this.z, this.f7212t - ((int) (m10 - j11)));
        } else {
            i = this.z;
        }
        pd.d<m>[] dVarArr = v.C;
        long j14 = ((long) this.z) + m10;
        if (i > 0) {
            dVarArr = new pd.d[i];
            Object[] objArr = this.f7214v;
            e.B(objArr);
            long j15 = m10;
            int i11 = 0;
            while (true) {
                if (m10 >= j14) {
                    m10 = j15;
                    break;
                }
                long j16 = m10 + j12;
                int i12 = (int) m10;
                Object obj = objArr[(objArr.length - 1) & i12];
                r rVar = g0.f5391b;
                if (obj != rVar) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) obj;
                    int i13 = i11 + 1;
                    dVarArr[i11] = aVar.f7221s;
                    objArr[(objArr.length - 1) & i12] = rVar;
                    long j17 = j15;
                    objArr[((int) j17) & (objArr.length - 1)] = aVar.f7220c;
                    long j18 = j17 + 1;
                    if (i13 >= i) {
                        m10 = j18;
                        break;
                    }
                    i11 = i13;
                    j15 = j18;
                    m10 = j16;
                    j12 = 1;
                } else {
                    long j19 = j15;
                    m10 = j16;
                }
            }
        }
        int i14 = (int) (m10 - n10);
        long j20 = this.f7503b == 0 ? m10 : j11;
        long max = Math.max(this.f7215w, m10 - ((long) Math.min(this.f7211s, i14)));
        if (this.f7212t == 0 && max < j14) {
            Object[] objArr2 = this.f7214v;
            e.B(objArr2);
            if (e.r(objArr2[((int) max) & (objArr2.length - 1)], g0.f5391b)) {
                m10++;
                max++;
            }
        }
        s(max, j20, m10, j14);
        h();
        return (dVarArr.length == 0) ^ true ? l(dVarArr) : dVarArr;
    }
}
