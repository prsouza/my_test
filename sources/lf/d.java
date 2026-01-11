package lf;

import ah.v;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f8287h;
    public static final Logger i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f8288j = new b();

    /* renamed from: a  reason: collision with root package name */
    public int f8289a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8290b;

    /* renamed from: c  reason: collision with root package name */
    public long f8291c;

    /* renamed from: d  reason: collision with root package name */
    public final List<c> f8292d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final List<c> f8293e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final C0148d f8294f = new C0148d(this);
    public final a g;

    public interface a {
        void a(d dVar, long j10);

        void b(d dVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    public static final class b {
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f8295a;

        public c(ThreadFactory threadFactory) {
            this.f8295a = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public final void a(d dVar, long j10) throws InterruptedException {
            e.D(dVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                dVar.wait(j11, (int) j12);
            }
        }

        public final void b(d dVar) {
            e.D(dVar, "taskRunner");
            dVar.notify();
        }

        public final void execute(Runnable runnable) {
            e.D(runnable, "runnable");
            this.f8295a.execute(runnable);
        }

        public final long nanoTime() {
            return System.nanoTime();
        }
    }

    /* renamed from: lf.d$d  reason: collision with other inner class name */
    public static final class C0148d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f8296a;

        public C0148d(d dVar) {
            this.f8296a = dVar;
        }

        public final void run() {
            a c10;
            while (true) {
                synchronized (this.f8296a) {
                    c10 = this.f8296a.c();
                }
                if (c10 != null) {
                    c cVar = c10.f8276a;
                    e.B(cVar);
                    long j10 = -1;
                    b bVar = d.f8288j;
                    boolean isLoggable = d.i.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j10 = cVar.f8285e.g.nanoTime();
                        v.n(c10, cVar, "starting");
                    }
                    try {
                        d.a(this.f8296a, c10);
                        if (isLoggable) {
                            long nanoTime = cVar.f8285e.g.nanoTime() - j10;
                            StringBuilder d10 = a.a.d("finished run in ");
                            d10.append(v.G(nanoTime));
                            v.n(c10, cVar, d10.toString());
                        }
                    } catch (Throwable th2) {
                        if (isLoggable) {
                            long nanoTime2 = cVar.f8285e.g.nanoTime() - j10;
                            StringBuilder d11 = a.a.d("failed a run in ");
                            d11.append(v.G(nanoTime2));
                            v.n(c10, cVar, d11.toString());
                        }
                        throw th2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        String str = jf.c.g + " TaskRunner";
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        f8287h = new d(new c(new jf.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        e.C(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public d(a aVar) {
        this.g = aVar;
    }

    public static final void a(d dVar, a aVar) {
        Objects.requireNonNull(dVar);
        byte[] bArr = jf.c.f7250a;
        Thread currentThread = Thread.currentThread();
        e.C(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f8278c);
        try {
            long a10 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a10);
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (dVar) {
                dVar.b(aVar, -1);
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.util.List<lf.c>, java.util.ArrayList] */
    public final void b(a aVar, long j10) {
        byte[] bArr = jf.c.f7250a;
        c cVar = aVar.f8276a;
        e.B(cVar);
        if (cVar.f8282b == aVar) {
            boolean z = cVar.f8284d;
            cVar.f8284d = false;
            cVar.f8282b = null;
            this.f8292d.remove(cVar);
            if (j10 != -1 && !z && !cVar.f8281a) {
                cVar.d(aVar, j10, true);
            }
            if (!cVar.f8283c.isEmpty()) {
                this.f8293e.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final lf.a c() {
        /*
            r14 = this;
            byte[] r0 = jf.c.f7250a
        L_0x0002:
            java.util.List<lf.c> r0 = r14.f8293e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            lf.d$a r0 = r14.g
            long r2 = r0.nanoTime()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<lf.c> r0 = r14.f8293e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x001e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r0.next()
            lf.c r7 = (lf.c) r7
            java.util.List<lf.a> r7 = r7.f8283c
            java.lang.Object r7 = r7.get(r9)
            lf.a r7 = (lf.a) r7
            long r10 = r7.f8277b
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0046
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x001e
        L_0x0046:
            if (r6 == 0) goto L_0x004a
            r0 = r8
            goto L_0x004d
        L_0x004a:
            r6 = r7
            goto L_0x001e
        L_0x004c:
            r0 = r9
        L_0x004d:
            if (r6 == 0) goto L_0x0082
            byte[] r1 = jf.c.f7250a
            r1 = -1
            r6.f8277b = r1
            lf.c r1 = r6.f8276a
            e6.e.B(r1)
            java.util.List<lf.a> r2 = r1.f8283c
            r2.remove(r6)
            java.util.List<lf.c> r2 = r14.f8293e
            r2.remove(r1)
            r1.f8282b = r6
            java.util.List<lf.c> r2 = r14.f8292d
            r2.add(r1)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r14.f8290b
            if (r0 != 0) goto L_0x0081
            java.util.List<lf.c> r0 = r14.f8293e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0081
        L_0x007a:
            lf.d$a r0 = r14.g
            lf.d$d r1 = r14.f8294f
            r0.execute(r1)
        L_0x0081:
            return r6
        L_0x0082:
            boolean r0 = r14.f8290b
            if (r0 == 0) goto L_0x0093
            long r6 = r14.f8291c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            lf.d$a r0 = r14.g
            r0.b(r14)
        L_0x0092:
            return r1
        L_0x0093:
            r14.f8290b = r8
            long r2 = r2 + r4
            r14.f8291c = r2
            lf.d$a r0 = r14.g     // Catch:{ InterruptedException -> 0x00a0 }
            r0.a(r14, r4)     // Catch:{ InterruptedException -> 0x00a0 }
            goto L_0x00a3
        L_0x009e:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a0:
            r14.d()     // Catch:{ all -> 0x009e }
        L_0x00a3:
            r14.f8290b = r9
            goto L_0x0002
        L_0x00a7:
            r14.f8290b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.d.c():lf.a");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.List<lf.c>, java.util.ArrayList] */
    public final void d() {
        int size = this.f8292d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((c) this.f8292d.get(size)).b();
        }
        int size2 = this.f8293e.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                c cVar = (c) this.f8293e.get(size2);
                cVar.b();
                if (cVar.f8283c.isEmpty()) {
                    this.f8293e.remove(size2);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<lf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, java.util.List<lf.c>, java.util.ArrayList] */
    public final void e(c cVar) {
        e.D(cVar, "taskQueue");
        byte[] bArr = jf.c.f7250a;
        if (cVar.f8282b == null) {
            if (!cVar.f8283c.isEmpty()) {
                ? r02 = this.f8293e;
                e.D(r02, "$this$addIfAbsent");
                if (!r02.contains(cVar)) {
                    r02.add(cVar);
                }
            } else {
                this.f8293e.remove(cVar);
            }
        }
        if (this.f8290b) {
            this.g.b(this);
        } else {
            this.g.execute(this.f8294f);
        }
    }

    public final c f() {
        int i10;
        synchronized (this) {
            i10 = this.f8289a;
            this.f8289a = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new c(this, sb2.toString());
    }
}
