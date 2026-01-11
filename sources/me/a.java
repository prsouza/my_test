package me;

import androidx.activity.result.d;
import com.google.android.gms.common.api.Api;
import e6.e;
import ge.g0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import le.p;
import le.r;

public final class a implements Executor, Closeable {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8556w = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8557x = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8558y = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    public static final r z = new r("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f8559a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8560b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8561c;
    public volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: s  reason: collision with root package name */
    public final String f8562s;

    /* renamed from: t  reason: collision with root package name */
    public final d f8563t;

    /* renamed from: u  reason: collision with root package name */
    public final d f8564u;

    /* renamed from: v  reason: collision with root package name */
    public final p<b> f8565v;

    /* renamed from: me.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0158a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8566a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.PARKING.ordinal()] = 1;
            iArr[c.BLOCKING.ordinal()] = 2;
            iArr[c.CPU_ACQUIRED.ordinal()] = 3;
            iArr[c.DORMANT.ordinal()] = 4;
            iArr[c.TERMINATED.ordinal()] = 5;
            f8566a = iArr;
        }
    }

    public final class b extends Thread {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f8567w = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final l f8568a = new l();

        /* renamed from: b  reason: collision with root package name */
        public c f8569b = c.DORMANT;

        /* renamed from: c  reason: collision with root package name */
        public long f8570c;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker = a.z;

        /* renamed from: s  reason: collision with root package name */
        public long f8571s;

        /* renamed from: t  reason: collision with root package name */
        public int f8572t = ae.c.f342a.b();

        /* renamed from: u  reason: collision with root package name */
        public boolean f8573u;
        public volatile /* synthetic */ int workerCtl = 0;

        public b(int i) {
            a.this = a.this;
            setDaemon(true);
            f(i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final me.g a(boolean r11) {
            /*
                r10 = this;
                me.a$c r0 = r10.f8569b
                me.a$c r1 = me.a.c.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L_0x0009
                goto L_0x0032
            L_0x0009:
                me.a r0 = me.a.this
            L_0x000b:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L_0x001b
                r0 = r2
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = me.a.f8557x
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto L_0x000b
                r0 = r3
            L_0x002c:
                if (r0 == 0) goto L_0x0034
                me.a$c r0 = me.a.c.CPU_ACQUIRED
                r10.f8569b = r0
            L_0x0032:
                r0 = r3
                goto L_0x0035
            L_0x0034:
                r0 = r2
            L_0x0035:
                if (r0 == 0) goto L_0x006b
                if (r11 == 0) goto L_0x0060
                me.a r11 = me.a.this
                int r11 = r11.f8559a
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L_0x0046
                goto L_0x0047
            L_0x0046:
                r3 = r2
            L_0x0047:
                if (r3 == 0) goto L_0x004f
                me.g r11 = r10.e()
                if (r11 != 0) goto L_0x006a
            L_0x004f:
                me.l r11 = r10.f8568a
                me.g r11 = r11.d()
                if (r11 != 0) goto L_0x006a
                if (r3 != 0) goto L_0x0066
                me.g r11 = r10.e()
                if (r11 != 0) goto L_0x006a
                goto L_0x0066
            L_0x0060:
                me.g r11 = r10.e()
                if (r11 != 0) goto L_0x006a
            L_0x0066:
                me.g r11 = r10.i(r2)
            L_0x006a:
                return r11
            L_0x006b:
                if (r11 == 0) goto L_0x0080
                me.l r11 = r10.f8568a
                me.g r11 = r11.d()
                if (r11 != 0) goto L_0x008a
                me.a r11 = me.a.this
                me.d r11 = r11.f8564u
                java.lang.Object r11 = r11.d()
                me.g r11 = (me.g) r11
                goto L_0x008a
            L_0x0080:
                me.a r11 = me.a.this
                me.d r11 = r11.f8564u
                java.lang.Object r11 = r11.d()
                me.g r11 = (me.g) r11
            L_0x008a:
                if (r11 != 0) goto L_0x0090
                me.g r11 = r10.i(r3)
            L_0x0090:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: me.a.b.a(boolean):me.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i10 = this.f8572t;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.f8572t = i13;
            int i14 = i - 1;
            if ((i14 & i) == 0) {
                return i13 & i14;
            }
            return (i13 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i;
        }

        public final g e() {
            if (d(2) == 0) {
                g gVar = (g) a.this.f8563t.d();
                return gVar == null ? (g) a.this.f8564u.d() : gVar;
            }
            g gVar2 = (g) a.this.f8564u.d();
            return gVar2 == null ? (g) a.this.f8563t.d() : gVar2;
        }

        public final void f(int i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f8562s);
            sb2.append("-worker-");
            sb2.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb2.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(c cVar) {
            c cVar2 = this.f8569b;
            boolean z = cVar2 == c.CPU_ACQUIRED;
            if (z) {
                a.f8557x.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f8569b = cVar;
            }
            return z;
        }

        public final g i(boolean z) {
            long j10;
            int i = (int) (a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int d10 = d(i);
            a aVar = a.this;
            int i10 = 0;
            long j11 = Long.MAX_VALUE;
            while (i10 < i) {
                i10++;
                d10++;
                if (d10 > i) {
                    d10 = 1;
                }
                b b10 = aVar.f8565v.b(d10);
                if (!(b10 == null || b10 == this)) {
                    if (z) {
                        j10 = this.f8568a.f(b10.f8568a);
                    } else {
                        l lVar = this.f8568a;
                        l lVar2 = b10.f8568a;
                        Objects.requireNonNull(lVar);
                        g e10 = lVar2.e();
                        if (e10 != null) {
                            lVar.a(e10, false);
                            j10 = -1;
                        } else {
                            j10 = lVar.g(lVar2, false);
                        }
                    }
                    if (j10 == -1) {
                        return this.f8568a.d();
                    }
                    if (j10 > 0) {
                        j11 = Math.min(j11, j10);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f8571s = j11;
            return null;
        }

        public final void run() {
            c cVar;
            loop0:
            while (true) {
                boolean z = false;
                while (!a.this.isTerminated() && this.f8569b != c.TERMINATED) {
                    g a10 = a(this.f8573u);
                    if (a10 == null) {
                        this.f8573u = false;
                        if (this.f8571s == 0) {
                            if (this.nextParkedWorker != a.z) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != a.z) || this.workerCtl != -1 || a.this.isTerminated() || this.f8569b == (cVar = c.TERMINATED)) {
                                        break;
                                    }
                                    h(c.PARKING);
                                    Thread.interrupted();
                                    if (this.f8570c == 0) {
                                        this.f8570c = System.nanoTime() + a.this.f8561c;
                                    }
                                    LockSupport.parkNanos(a.this.f8561c);
                                    if (System.nanoTime() - this.f8570c >= 0) {
                                        this.f8570c = 0;
                                        a aVar = a.this;
                                        synchronized (aVar.f8565v) {
                                            if (!aVar.isTerminated()) {
                                                if (((int) (aVar.controlState & 2097151)) > aVar.f8559a) {
                                                    if (f8567w.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        aVar.t(this, i, 0);
                                                        int andDecrement = (int) (a.f8557x.getAndDecrement(aVar) & 2097151);
                                                        if (andDecrement != i) {
                                                            b b10 = aVar.f8565v.b(andDecrement);
                                                            e.B(b10);
                                                            b bVar = b10;
                                                            aVar.f8565v.c(i, bVar);
                                                            bVar.f(i);
                                                            aVar.t(bVar, andDecrement, i);
                                                        }
                                                        aVar.f8565v.c(andDecrement, null);
                                                        this.f8569b = cVar;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                a.this.s(this);
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            h(c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f8571s);
                            this.f8571s = 0;
                        }
                    } else {
                        this.f8571s = 0;
                        int b11 = a10.f8581b.b();
                        this.f8570c = 0;
                        if (this.f8569b == c.PARKING) {
                            this.f8569b = c.BLOCKING;
                        }
                        if (b11 != 0 && h(c.BLOCKING)) {
                            a aVar2 = a.this;
                            if (!aVar2.y() && !aVar2.w(aVar2.controlState)) {
                                aVar2.y();
                            }
                        }
                        Objects.requireNonNull(a.this);
                        try {
                            a10.run();
                        } catch (Throwable th2) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        if (b11 != 0) {
                            a.f8557x.addAndGet(a.this, -2097152);
                            if (this.f8569b != c.TERMINATED) {
                                this.f8569b = c.DORMANT;
                            }
                        }
                    }
                }
            }
            h(c.TERMINATED);
            return;
        }
    }

    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i, int i10, long j10, String str) {
        this.f8559a = i;
        this.f8560b = i10;
        this.f8561c = j10;
        this.f8562s = str;
        boolean z10 = true;
        if (i >= 1) {
            if (i10 >= i) {
                if (i10 <= 2097150) {
                    if (j10 <= 0 ? false : z10) {
                        this.f8563t = new d();
                        this.f8564u = new d();
                        this.parkedWorkersStack = 0;
                        this.f8565v = new p<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(a8.a.b("Max pool size ", i10, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(d.b("Max pool size ", i10, " should be greater than or equals to core pool size ", i).toString());
        }
        throw new IllegalArgumentException(a8.a.b("Core pool size ", i, " should be at least 1").toString());
    }

    public final int a() {
        synchronized (this.f8565v) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j10 = this.controlState;
            int i = (int) (j10 & 2097151);
            int i10 = i - ((int) ((j10 & 4398044413952L) >> 21));
            boolean z10 = false;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 >= this.f8559a) {
                return 0;
            }
            if (i >= this.f8560b) {
                return 0;
            }
            int i11 = ((int) (this.controlState & 2097151)) + 1;
            if (i11 > 0 && this.f8565v.b(i11) == null) {
                b bVar = new b(i11);
                this.f8565v.c(i11, bVar);
                if (i11 == ((int) (2097151 & f8557x.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (z10) {
                    bVar.start();
                    int i12 = i10 + 1;
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final b c() {
        Thread currentThread = Thread.currentThread();
        b bVar = currentThread instanceof b ? (b) currentThread : null;
        if (bVar != null && e.r(a.this, this)) {
            return bVar;
        }
        return null;
    }

    public final void close() {
        int i;
        g gVar;
        boolean z10;
        if (f8558y.compareAndSet(this, 0, 1)) {
            b c10 = c();
            synchronized (this.f8565v) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i10 = 1;
                while (true) {
                    int i11 = i10 + 1;
                    b b10 = this.f8565v.b(i10);
                    e.B(b10);
                    b bVar = b10;
                    if (bVar != c10) {
                        while (bVar.isAlive()) {
                            LockSupport.unpark(bVar);
                            bVar.join(10000);
                        }
                        l lVar = bVar.f8568a;
                        d dVar = this.f8564u;
                        Objects.requireNonNull(lVar);
                        g gVar2 = (g) l.f8590b.getAndSet(lVar, (Object) null);
                        if (gVar2 != null) {
                            dVar.a(gVar2);
                        }
                        do {
                            g e10 = lVar.e();
                            if (e10 == null) {
                                z10 = false;
                                continue;
                            } else {
                                dVar.a(e10);
                                z10 = true;
                                continue;
                            }
                        } while (z10);
                    }
                    if (i10 == i) {
                        break;
                    }
                    i10 = i11;
                }
            }
            this.f8564u.b();
            this.f8563t.b();
            while (true) {
                if (c10 == null) {
                    gVar = null;
                } else {
                    gVar = c10.a(true);
                }
                if (gVar == null && (gVar = (g) this.f8563t.d()) == null && (gVar = (g) this.f8564u.d()) == null) {
                    if (c10 != null) {
                        c10.h(c.TERMINATED);
                    }
                    this.parkedWorkersStack = 0;
                    this.controlState = 0;
                    return;
                }
                try {
                    gVar.run();
                } catch (Throwable th2) {
                    Thread currentThread = Thread.currentThread();
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                }
            }
        }
    }

    public final void e(Runnable runnable, h hVar, boolean z10) {
        g gVar;
        g gVar2;
        boolean z11;
        Objects.requireNonNull(j.f8587e);
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            gVar = (g) runnable;
            gVar.f8580a = nanoTime;
            gVar.f8581b = hVar;
        } else {
            gVar = new i(runnable, nanoTime, hVar);
        }
        b c10 = c();
        boolean z12 = true;
        if (c10 == null || c10.f8569b == c.TERMINATED || (gVar.f8581b.b() == 0 && c10.f8569b == c.BLOCKING)) {
            gVar2 = gVar;
        } else {
            c10.f8573u = true;
            gVar2 = c10.f8568a.a(gVar, z10);
        }
        if (gVar2 != null) {
            if (gVar2.f8581b.b() == 1) {
                z11 = this.f8564u.a(gVar2);
            } else {
                z11 = this.f8563t.a(gVar2);
            }
            if (!z11) {
                throw new RejectedExecutionException(e.a0(this.f8562s, " was terminated"));
            }
        }
        if (!z10 || c10 == null) {
            z12 = false;
        }
        if (gVar.f8581b.b() != 0) {
            long addAndGet = f8557x.addAndGet(this, 2097152);
            if (!z12 && !y() && !w(addAndGet)) {
                y();
            }
        } else if (!z12 && !y() && !w(this.controlState)) {
            y();
        }
    }

    public final void execute(Runnable runnable) {
        e(runnable, j.f8588f, false);
    }

    public final int f(b bVar) {
        Object c10 = bVar.c();
        while (c10 != z) {
            if (c10 == null) {
                return 0;
            }
            b bVar2 = (b) c10;
            int b10 = bVar2.b();
            if (b10 != 0) {
                return b10;
            }
            c10 = bVar2.c();
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean s(b bVar) {
        long j10;
        int b10;
        if (bVar.c() != z) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            b10 = bVar.b();
            bVar.g(this.f8565v.b((int) (2097151 & j10)));
        } while (!f8556w.compareAndSet(this, j10, ((2097152 + j10) & -2097152) | ((long) b10)));
        return true;
    }

    public final void t(b bVar, int i, int i10) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i11 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i11 == i) {
                i11 = i10 == 0 ? f(bVar) : i10;
            }
            if (i11 >= 0) {
                if (f8556w.compareAndSet(this, j10, j11 | ((long) i11))) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f8565v.a();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i14 < a10) {
            int i15 = i14 + 1;
            b b10 = this.f8565v.b(i14);
            if (b10 == null) {
                i14 = i15;
            } else {
                int c10 = b10.f8568a.c();
                int i16 = C0158a.f8566a[b10.f8569b.ordinal()];
                if (i16 == 1) {
                    i11++;
                    i14 = i15;
                } else if (i16 == 2) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                    i14 = i15;
                } else if (i16 == 3) {
                    i++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(c10);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                    i14 = i15;
                } else if (i16 != 4) {
                    if (i16 == 5) {
                        i13++;
                    }
                    i14 = i15;
                } else {
                    i12++;
                    if (c10 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c10);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                    i14 = i15;
                }
            }
        }
        long j10 = this.controlState;
        return this.f8562s + '@' + g0.o(this) + "[Pool Size {core = " + this.f8559a + ", max = " + this.f8560b + "}, Worker States {CPU = " + i + ", blocking = " + i10 + ", parked = " + i11 + ", dormant = " + i12 + ", terminated = " + i13 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f8563t.c() + ", global blocking queue size = " + this.f8564u.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f8559a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final boolean w(long j10) {
        int i = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f8559a) {
            int a10 = a();
            if (a10 == 1 && this.f8559a > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            b b10 = this.f8565v.b((int) (2097151 & j10));
            if (b10 == null) {
                b10 = null;
            } else {
                long j11 = (2097152 + j10) & -2097152;
                int f10 = f(b10);
                if (f10 < 0) {
                    continue;
                } else {
                    if (f8556w.compareAndSet(this, j10, ((long) f10) | j11)) {
                        b10.g(z);
                    } else {
                        continue;
                    }
                }
            }
            if (b10 == null) {
                return false;
            }
            if (b.f8567w.compareAndSet(b10, -1, 0)) {
                LockSupport.unpark(b10);
                return true;
            }
        }
    }
}
