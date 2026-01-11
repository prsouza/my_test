package je;

import aa.b;
import ge.g1;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

public final class o<T> extends ke.a<p> implements n, h, e {
    private volatile /* synthetic */ Object _state;

    /* renamed from: s  reason: collision with root package name */
    public int f7232s;

    @e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public o f7233a;

        /* renamed from: b  reason: collision with root package name */
        public f f7234b;

        /* renamed from: c  reason: collision with root package name */
        public p f7235c;

        /* renamed from: s  reason: collision with root package name */
        public g1 f7236s;

        /* renamed from: t  reason: collision with root package name */
        public Object f7237t;

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f7238u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ o<T> f7239v;

        /* renamed from: w  reason: collision with root package name */
        public int f7240w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o<T> oVar, d<? super a> dVar) {
            super(dVar);
            this.f7239v = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7238u = obj;
            this.f7240w |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f7239v.b((f) null, this);
        }
    }

    public o(Object obj) {
        this._state = obj;
    }

    public final Object a(T t10, d<? super m> dVar) {
        if (t10 == null) {
            t10 = b.D;
        }
        h((Object) null, t10);
        return m.f8555a;
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [pd.f$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb A[Catch:{ all -> 0x005f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d3 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(je.f<? super T> r18, pd.d<?> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof je.o.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            je.o$a r3 = (je.o.a) r3
            int r4 = r3.f7240w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f7240w = r4
            goto L_0x001e
        L_0x0019:
            je.o$a r3 = new je.o$a
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f7238u
            qd.a r4 = qd.a.COROUTINE_SUSPENDED
            int r5 = r3.f7240w
            r6 = 1
            r7 = 2
            r8 = 3
            r9 = 0
            if (r5 == 0) goto L_0x0062
            if (r5 == r6) goto L_0x0055
            if (r5 == r7) goto L_0x0046
            if (r5 != r8) goto L_0x003e
            java.lang.Object r0 = r3.f7237t
            ge.g1 r5 = r3.f7236s
            je.p r10 = r3.f7235c
            je.f r11 = r3.f7234b
            je.o r12 = r3.f7233a
            l6.b1.w(r2)     // Catch:{ all -> 0x005f }
            goto L_0x0092
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            java.lang.Object r0 = r3.f7237t
            ge.g1 r5 = r3.f7236s
            je.p r10 = r3.f7235c
            je.f r11 = r3.f7234b
            je.o r12 = r3.f7233a
            l6.b1.w(r2)     // Catch:{ all -> 0x005f }
            goto L_0x00bd
        L_0x0055:
            je.p r10 = r3.f7235c
            je.f r0 = r3.f7234b
            je.o r12 = r3.f7233a
            l6.b1.w(r2)     // Catch:{ all -> 0x005f }
            goto L_0x0083
        L_0x005f:
            r0 = move-exception
            goto L_0x0114
        L_0x0062:
            l6.b1.w(r2)
            ke.b r2 = r17.c()
            je.p r2 = (je.p) r2
            boolean r5 = r0 instanceof je.q     // Catch:{ all -> 0x0116 }
            if (r5 == 0) goto L_0x0081
            r5 = r0
            je.q r5 = (je.q) r5     // Catch:{ all -> 0x0116 }
            r3.f7233a = r1     // Catch:{ all -> 0x0116 }
            r3.f7234b = r0     // Catch:{ all -> 0x0116 }
            r3.f7235c = r2     // Catch:{ all -> 0x0116 }
            r3.f7240w = r6     // Catch:{ all -> 0x0116 }
            java.lang.Object r5 = r5.b(r3)     // Catch:{ all -> 0x0116 }
            if (r5 != r4) goto L_0x0081
            return r4
        L_0x0081:
            r12 = r1
            r10 = r2
        L_0x0083:
            pd.f r2 = r3.getContext()     // Catch:{ all -> 0x005f }
            ge.g1$b r5 = ge.g1.b.f5401a     // Catch:{ all -> 0x005f }
            pd.f$a r2 = r2.get(r5)     // Catch:{ all -> 0x005f }
            r5 = r2
            ge.g1 r5 = (ge.g1) r5     // Catch:{ all -> 0x005f }
            r11 = r0
            r0 = r9
        L_0x0092:
            java.lang.Object r2 = r12._state     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            ad.c.F(r5)     // Catch:{ all -> 0x005f }
        L_0x009a:
            if (r0 == 0) goto L_0x00a2
            boolean r13 = e6.e.r(r0, r2)     // Catch:{ all -> 0x005f }
            if (r13 != 0) goto L_0x00bd
        L_0x00a2:
            le.r r0 = aa.b.D     // Catch:{ all -> 0x005f }
            if (r2 != r0) goto L_0x00a8
            r0 = r9
            goto L_0x00a9
        L_0x00a8:
            r0 = r2
        L_0x00a9:
            r3.f7233a = r12     // Catch:{ all -> 0x005f }
            r3.f7234b = r11     // Catch:{ all -> 0x005f }
            r3.f7235c = r10     // Catch:{ all -> 0x005f }
            r3.f7236s = r5     // Catch:{ all -> 0x005f }
            r3.f7237t = r2     // Catch:{ all -> 0x005f }
            r3.f7240w = r7     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r11.a(r0, r3)     // Catch:{ all -> 0x005f }
            if (r0 != r4) goto L_0x00bc
            return r4
        L_0x00bc:
            r0 = r2
        L_0x00bd:
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x005f }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = je.p.f7241a     // Catch:{ all -> 0x005f }
            le.r r13 = aa.b.B     // Catch:{ all -> 0x005f }
            java.lang.Object r14 = r2.getAndSet(r10, r13)     // Catch:{ all -> 0x005f }
            e6.e.B(r14)     // Catch:{ all -> 0x005f }
            le.r r15 = aa.b.C     // Catch:{ all -> 0x005f }
            r16 = 0
            if (r14 != r15) goto L_0x00d3
            r14 = r6
            goto L_0x00d5
        L_0x00d3:
            r14 = r16
        L_0x00d5:
            if (r14 != 0) goto L_0x0092
            r3.f7233a = r12     // Catch:{ all -> 0x005f }
            r3.f7234b = r11     // Catch:{ all -> 0x005f }
            r3.f7235c = r10     // Catch:{ all -> 0x005f }
            r3.f7236s = r5     // Catch:{ all -> 0x005f }
            r3.f7237t = r0     // Catch:{ all -> 0x005f }
            r3.f7240w = r8     // Catch:{ all -> 0x005f }
            ge.l r14 = new ge.l     // Catch:{ all -> 0x005f }
            pd.d r15 = ad.c.Y(r3)     // Catch:{ all -> 0x005f }
            r14.<init>(r15, r6)     // Catch:{ all -> 0x005f }
            r14.u()     // Catch:{ all -> 0x005f }
        L_0x00ef:
            boolean r15 = r2.compareAndSet(r10, r13, r14)     // Catch:{ all -> 0x005f }
            if (r15 == 0) goto L_0x00f8
            r16 = r6
            goto L_0x00fe
        L_0x00f8:
            java.lang.Object r15 = r2.get(r10)     // Catch:{ all -> 0x005f }
            if (r15 == r13) goto L_0x00ef
        L_0x00fe:
            if (r16 == 0) goto L_0x0101
            goto L_0x0106
        L_0x0101:
            md.m r2 = md.m.f8555a     // Catch:{ all -> 0x005f }
            r14.resumeWith(r2)     // Catch:{ all -> 0x005f }
        L_0x0106:
            java.lang.Object r2 = r14.t()     // Catch:{ all -> 0x005f }
            qd.a r13 = qd.a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x005f }
            if (r2 != r13) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            md.m r2 = md.m.f8555a     // Catch:{ all -> 0x005f }
        L_0x0111:
            if (r2 != r4) goto L_0x0092
            return r4
        L_0x0114:
            r2 = r10
            goto L_0x0118
        L_0x0116:
            r0 = move-exception
            r12 = r1
        L_0x0118:
            r12.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: je.o.b(je.f, pd.d):java.lang.Object");
    }

    public final ke.b d() {
        return new p();
    }

    public final ke.b[] e() {
        return new p[2];
    }

    public final boolean g(T t10, T t11) {
        if (t10 == null) {
            t10 = b.D;
        }
        return h(t10, t11);
    }

    public final T getValue() {
        T t10 = b.D;
        T t11 = this._state;
        if (t11 == t10) {
            return null;
        }
        return t11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        r12 = (je.p[]) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        if (r12 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        r2 = r12.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        if (r3 >= r2) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        r4 = r12[r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        if (r4 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        r5 = r4._state;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0037, code lost:
        if (r5 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003a, code lost:
        r6 = aa.b.C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003c, code lost:
        if (r5 != r6) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
        r7 = aa.b.B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0041, code lost:
        if (r5 != r7) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
        r8 = je.p.f7241a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        if (r8.compareAndSet(r4, r5, r6) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004b, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        if (r8.get(r4) == r5) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0053, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        if (r5 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        r6 = je.p.f7241a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005d, code lost:
        if (r6.compareAndSet(r4, r5, r7) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005f, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0065, code lost:
        if (r6.get(r4) == r5) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0067, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0068, code lost:
        if (r6 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006a, code lost:
        ((ge.l) r5).resumeWith(md.m.f8555a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0072, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r12 = r10.f7232s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0075, code lost:
        if (r12 != r11) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0077, code lost:
        r10.f7232s = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007a, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x007b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r11 = r10.f7502a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x007e, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x007f, code lost:
        r9 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.Object r0 = r10._state     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r11 == 0) goto L_0x000e
            boolean r11 = e6.e.r(r0, r11)     // Catch:{ all -> 0x008c }
            if (r11 != 0) goto L_0x000e
            monitor-exit(r10)
            return r1
        L_0x000e:
            boolean r11 = e6.e.r(r0, r12)     // Catch:{ all -> 0x008c }
            r0 = 1
            if (r11 == 0) goto L_0x0017
            monitor-exit(r10)
            return r0
        L_0x0017:
            r10._state = r12     // Catch:{ all -> 0x008c }
            int r11 = r10.f7232s     // Catch:{ all -> 0x008c }
            r12 = r11 & 1
            if (r12 != 0) goto L_0x0086
            int r11 = r11 + r0
            r10.f7232s = r11     // Catch:{ all -> 0x008c }
            S[] r12 = r10.f7502a     // Catch:{ all -> 0x008c }
            monitor-exit(r10)
        L_0x0025:
            je.p[] r12 = (je.p[]) r12
            if (r12 != 0) goto L_0x002a
            goto L_0x0072
        L_0x002a:
            int r2 = r12.length
            r3 = r1
        L_0x002c:
            if (r3 >= r2) goto L_0x0072
            r4 = r12[r3]
            int r3 = r3 + 1
            if (r4 != 0) goto L_0x0035
            goto L_0x002c
        L_0x0035:
            java.lang.Object r5 = r4._state
            if (r5 != 0) goto L_0x003a
            goto L_0x002c
        L_0x003a:
            le.r r6 = aa.b.C
            if (r5 != r6) goto L_0x003f
            goto L_0x002c
        L_0x003f:
            le.r r7 = aa.b.B
            if (r5 != r7) goto L_0x0057
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = je.p.f7241a
        L_0x0045:
            boolean r7 = r8.compareAndSet(r4, r5, r6)
            if (r7 == 0) goto L_0x004d
            r5 = r0
            goto L_0x0054
        L_0x004d:
            java.lang.Object r7 = r8.get(r4)
            if (r7 == r5) goto L_0x0045
            r5 = r1
        L_0x0054:
            if (r5 == 0) goto L_0x0035
            goto L_0x002c
        L_0x0057:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = je.p.f7241a
        L_0x0059:
            boolean r8 = r6.compareAndSet(r4, r5, r7)
            if (r8 == 0) goto L_0x0061
            r6 = r0
            goto L_0x0068
        L_0x0061:
            java.lang.Object r8 = r6.get(r4)
            if (r8 == r5) goto L_0x0059
            r6 = r1
        L_0x0068:
            if (r6 == 0) goto L_0x0035
            ge.l r5 = (ge.l) r5
            md.m r4 = md.m.f8555a
            r5.resumeWith(r4)
            goto L_0x002c
        L_0x0072:
            monitor-enter(r10)
            int r12 = r10.f7232s     // Catch:{ all -> 0x0083 }
            if (r12 != r11) goto L_0x007c
            int r11 = r11 + r0
            r10.f7232s = r11     // Catch:{ all -> 0x0083 }
            monitor-exit(r10)
            return r0
        L_0x007c:
            S[] r11 = r10.f7502a     // Catch:{ all -> 0x0083 }
            monitor-exit(r10)
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x0025
        L_0x0083:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x0086:
            int r11 = r11 + 2
            r10.f7232s = r11     // Catch:{ all -> 0x008c }
            monitor-exit(r10)
            return r0
        L_0x008c:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: je.o.h(java.lang.Object, java.lang.Object):boolean");
    }
}
