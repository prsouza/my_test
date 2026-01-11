package ge;

import e6.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import le.j;
import le.r;
import le.u;
import le.v;
import md.m;
import pd.f;

public abstract class v0 extends w0 implements j0 {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5458u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5459v;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    public final class a extends c {

        /* renamed from: s  reason: collision with root package name */
        public final k<m> f5460s;

        public a(long j10, k<? super m> kVar) {
            super(j10);
            this.f5460s = kVar;
        }

        public final void run() {
            this.f5460s.m(v0.this);
        }

        public final String toString() {
            return e.a0(super.toString(), this.f5460s);
        }
    }

    public static final class b extends c {

        /* renamed from: s  reason: collision with root package name */
        public final Runnable f5462s;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f5462s = runnable;
        }

        public final void run() {
            this.f5462s.run();
        }

        public final String toString() {
            return e.a0(super.toString(), this.f5462s);
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, q0, v {

        /* renamed from: a  reason: collision with root package name */
        public long f5463a;

        /* renamed from: b  reason: collision with root package name */
        public Object f5464b;

        /* renamed from: c  reason: collision with root package name */
        public int f5465c = -1;

        public c(long j10) {
            this.f5463a = j10;
        }

        public final int compareTo(Object obj) {
            int i = ((this.f5463a - ((c) obj).f5463a) > 0 ? 1 : ((this.f5463a - ((c) obj).f5463a) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        public final void d(int i) {
            this.f5465c = i;
        }

        public final synchronized void e() {
            Object obj = this.f5464b;
            r rVar = y.c.f13320t;
            if (obj != rVar) {
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    synchronized (dVar) {
                        if (k() != null) {
                            dVar.d(i());
                        }
                    }
                }
                this.f5464b = rVar;
            }
        }

        public final void h(u<?> uVar) {
            if (this.f5464b != y.c.f13320t) {
                this.f5464b = uVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final int i() {
            return this.f5465c;
        }

        public final u<?> k() {
            Object obj = this.f5464b;
            if (obj instanceof u) {
                return (u) obj;
            }
            return null;
        }

        public String toString() {
            StringBuilder d10 = a.a.d("Delayed[nanos=");
            d10.append(this.f5463a);
            d10.append(']');
            return d10.toString();
        }
    }

    public static final class d extends u<c> {

        /* renamed from: b  reason: collision with root package name */
        public long f5466b;

        public d(long j10) {
            this.f5466b = j10;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<v0> cls2 = v0.class;
        f5458u = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f5459v = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [le.v] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006a A[LOOP:2: B:40:0x006a->B:43:0x0075, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0050 A[EDGE_INSN: B:93:0x0050->B:33:0x0050 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long B0() {
        /*
            r11 = this;
            boolean r0 = r11.C0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r11._delayed
            ge.v0$d r0 = (ge.v0.d) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x004c
            boolean r6 = r0.c()
            if (r6 != 0) goto L_0x004c
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            le.v r8 = r0.b()     // Catch:{ all -> 0x0049 }
            if (r8 != 0) goto L_0x0026
            monitor-exit(r0)
            r8 = r4
            goto L_0x0044
        L_0x0026:
            ge.v0$c r8 = (ge.v0.c) r8     // Catch:{ all -> 0x0049 }
            long r9 = r8.f5463a     // Catch:{ all -> 0x0049 }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0032
            r9 = r3
            goto L_0x0033
        L_0x0032:
            r9 = r5
        L_0x0033:
            if (r9 == 0) goto L_0x003a
            boolean r8 = r11.G0(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x003b
        L_0x003a:
            r8 = r5
        L_0x003b:
            if (r8 == 0) goto L_0x0042
            le.v r8 = r0.d(r5)     // Catch:{ all -> 0x0049 }
            goto L_0x0043
        L_0x0042:
            r8 = r4
        L_0x0043:
            monitor-exit(r0)
        L_0x0044:
            ge.v0$c r8 = (ge.v0.c) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x004c
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004c:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x0052
        L_0x0050:
            r7 = r4
            goto L_0x0093
        L_0x0052:
            boolean r6 = r0 instanceof le.j
            if (r6 == 0) goto L_0x0078
            r6 = r0
            le.j r6 = (le.j) r6
            java.lang.Object r7 = r6.f()
            le.r r8 = le.j.g
            if (r7 == r8) goto L_0x0064
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x0093
        L_0x0064:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f5458u
            le.j r6 = r6.e()
        L_0x006a:
            boolean r8 = r7.compareAndSet(r11, r0, r6)
            if (r8 == 0) goto L_0x0071
            goto L_0x004c
        L_0x0071:
            java.lang.Object r8 = r7.get(r11)
            if (r8 == r0) goto L_0x006a
            goto L_0x004c
        L_0x0078:
            le.r r6 = y.c.f13321u
            if (r0 != r6) goto L_0x007d
            goto L_0x0050
        L_0x007d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f5458u
        L_0x007f:
            boolean r7 = r6.compareAndSet(r11, r0, r4)
            if (r7 == 0) goto L_0x0087
            r6 = r3
            goto L_0x008e
        L_0x0087:
            java.lang.Object r7 = r6.get(r11)
            if (r7 == r0) goto L_0x007f
            r6 = r5
        L_0x008e:
            if (r6 == 0) goto L_0x004c
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x0093:
            if (r7 == 0) goto L_0x0099
            r7.run()
            return r1
        L_0x0099:
            le.a<ge.m0<?>> r0 = r11.f5455s
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x00a3
            goto L_0x00ad
        L_0x00a3:
            int r8 = r0.f8231b
            int r0 = r0.f8232c
            if (r8 != r0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r3 = r5
        L_0x00ab:
            if (r3 == 0) goto L_0x00af
        L_0x00ad:
            r8 = r6
            goto L_0x00b0
        L_0x00af:
            r8 = r1
        L_0x00b0:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            goto L_0x00f0
        L_0x00b5:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x00ba
            goto L_0x00c7
        L_0x00ba:
            boolean r3 = r0 instanceof le.j
            if (r3 == 0) goto L_0x00eb
            le.j r0 = (le.j) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00c7
            goto L_0x00f0
        L_0x00c7:
            java.lang.Object r0 = r11._delayed
            ge.v0$d r0 = (ge.v0.d) r0
            if (r0 != 0) goto L_0x00ce
            goto L_0x00d7
        L_0x00ce:
            monitor-enter(r0)
            le.v r3 = r0.b()     // Catch:{ all -> 0x00e8 }
            monitor-exit(r0)
            r4 = r3
            ge.v0$c r4 = (ge.v0.c) r4
        L_0x00d7:
            if (r4 != 0) goto L_0x00da
            goto L_0x00ef
        L_0x00da:
            long r3 = r4.f5463a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e6
            goto L_0x00f0
        L_0x00e6:
            r1 = r3
            goto L_0x00f0
        L_0x00e8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00eb:
            le.r r3 = y.c.f13321u
            if (r0 != r3) goto L_0x00f0
        L_0x00ef:
            r1 = r6
        L_0x00f0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.v0.B0():long");
    }

    public void F0(Runnable runnable) {
        if (G0(runnable)) {
            Thread D0 = D0();
            if (Thread.currentThread() != D0) {
                LockSupport.unpark(D0);
                return;
            }
            return;
        }
        h0.f5403w.F0(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[LOOP:2: B:22:0x0039->B:25:0x0044, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._queue
            int r1 = r6._isCompleted
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f5458u
            r4 = 0
        L_0x000e:
            boolean r0 = r3.compareAndSet(r6, r4, r7)
            if (r0 == 0) goto L_0x0016
            r2 = r1
            goto L_0x001c
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x000e
        L_0x001c:
            if (r2 == 0) goto L_0x0000
            return r1
        L_0x001f:
            boolean r3 = r0 instanceof le.j
            if (r3 == 0) goto L_0x0048
            r3 = r0
            le.j r3 = (le.j) r3
            int r4 = r3.a(r7)
            if (r4 == 0) goto L_0x0047
            if (r4 == r1) goto L_0x0033
            r0 = 2
            if (r4 == r0) goto L_0x0032
            goto L_0x0000
        L_0x0032:
            return r2
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f5458u
            le.j r3 = r3.e()
        L_0x0039:
            boolean r1 = r2.compareAndSet(r6, r0, r3)
            if (r1 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r0) goto L_0x0039
            goto L_0x0000
        L_0x0047:
            return r1
        L_0x0048:
            le.r r3 = y.c.f13321u
            if (r0 != r3) goto L_0x004d
            return r2
        L_0x004d:
            le.j r3 = new le.j
            r4 = 8
            r3.<init>(r4, r1)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f5458u
        L_0x005f:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L_0x0067
            r2 = r1
            goto L_0x006d
        L_0x0067:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L_0x005f
        L_0x006d:
            if (r2 == 0) goto L_0x0000
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.v0.G0(java.lang.Runnable):boolean");
    }

    public final boolean H0() {
        le.a<m0<?>> aVar = this.f5455s;
        if (!(aVar == null || aVar.f8231b == aVar.f8232c)) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof j) {
            return ((j) obj).d();
        }
        if (obj == y.c.f13321u) {
            return true;
        }
        return false;
    }

    public final void I0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [le.v] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A[LOOP:0: B:5:0x0016->B:8:0x0021, LOOP_START] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J0(long r13, ge.v0.c r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0009
            goto L_0x0041
        L_0x0009:
            java.lang.Object r0 = r12._delayed
            ge.v0$d r0 = (ge.v0.d) r0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f5459v
            ge.v0$d r6 = new ge.v0$d
            r6.<init>(r13)
        L_0x0016:
            boolean r0 = r5.compareAndSet(r12, r3, r6)
            if (r0 == 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            java.lang.Object r0 = r5.get(r12)
            if (r0 == 0) goto L_0x0016
        L_0x0023:
            java.lang.Object r0 = r12._delayed
            e6.e.B(r0)
            ge.v0$d r0 = (ge.v0.d) r0
        L_0x002a:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f5464b     // Catch:{ all -> 0x00ae }
            le.r r6 = y.c.f13320t     // Catch:{ all -> 0x00ae }
            if (r5 != r6) goto L_0x0034
            monitor-exit(r15)
            r0 = r2
            goto L_0x006e
        L_0x0034:
            monitor-enter(r0)     // Catch:{ all -> 0x00ae }
            le.v r5 = r0.b()     // Catch:{ all -> 0x00ab }
            ge.v0$c r5 = (ge.v0.c) r5     // Catch:{ all -> 0x00ab }
            int r6 = r12._isCompleted     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x0043
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            monitor-exit(r15)
        L_0x0041:
            r0 = r4
            goto L_0x006e
        L_0x0043:
            r6 = 0
            if (r5 != 0) goto L_0x004a
            r0.f5466b = r13     // Catch:{ all -> 0x00ab }
            goto L_0x005d
        L_0x004a:
            long r8 = r5.f5463a     // Catch:{ all -> 0x00ab }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0053
            r8 = r13
        L_0x0053:
            long r10 = r0.f5466b     // Catch:{ all -> 0x00ab }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x005d
            r0.f5466b = r8     // Catch:{ all -> 0x00ab }
        L_0x005d:
            long r8 = r15.f5463a     // Catch:{ all -> 0x00ab }
            long r10 = r0.f5466b     // Catch:{ all -> 0x00ab }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0068
            r15.f5463a = r10     // Catch:{ all -> 0x00ab }
        L_0x0068:
            r0.a(r15)     // Catch:{ all -> 0x00ab }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            monitor-exit(r15)
            r0 = r1
        L_0x006e:
            if (r0 == 0) goto L_0x0085
            if (r0 == r4) goto L_0x0081
            if (r0 != r2) goto L_0x0075
            goto L_0x00a7
        L_0x0075:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected result"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0081:
            r12.E0(r13, r15)
            goto L_0x00a7
        L_0x0085:
            java.lang.Object r13 = r12._delayed
            ge.v0$d r13 = (ge.v0.d) r13
            if (r13 != 0) goto L_0x008c
            goto L_0x0095
        L_0x008c:
            monitor-enter(r13)
            le.v r14 = r13.b()     // Catch:{ all -> 0x00a8 }
            monitor-exit(r13)
            r3 = r14
            ge.v0$c r3 = (ge.v0.c) r3
        L_0x0095:
            if (r3 != r15) goto L_0x0098
            r1 = r4
        L_0x0098:
            if (r1 == 0) goto L_0x00a7
            java.lang.Thread r13 = r12.D0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x00a7
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x00a7:
            return
        L_0x00a8:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x00ab:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r13     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.v0.J0(long, ge.v0$c):void");
    }

    public final void f(long j10, k<? super m> kVar) {
        long v10 = y.c.v(j10);
        if (v10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(v10 + nanoTime, kVar);
            y.c.w(kVar, aVar);
            J0(nanoTime, aVar);
        }
    }

    public final void p0(f fVar, Runnable runnable) {
        F0(runnable);
    }

    public q0 s(long j10, Runnable runnable, f fVar) {
        return i0.f5406a.s(j10, runnable, fVar);
    }

    public void shutdown() {
        y1 y1Var = y1.f5472a;
        y1.f5473b.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5458u;
                r rVar = y.c.f13321u;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else if (obj instanceof j) {
                ((j) obj).b();
                break;
            } else if (obj == y.c.f13321u) {
                break;
            } else {
                j jVar = new j(8, true);
                jVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5458u;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        do {
        } while (B0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            c cVar = dVar == null ? null : (c) dVar.e();
            if (cVar != null) {
                E0(nanoTime, cVar);
            } else {
                return;
            }
        }
    }
}
