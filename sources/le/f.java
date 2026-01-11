package le;

import ge.i0;
import ge.j0;
import ge.k;
import ge.q0;
import ge.z;
import md.m;

public final class f extends z implements Runnable, j0 {

    /* renamed from: b  reason: collision with root package name */
    public final z f8241b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8242c;
    private volatile int runningWorkers;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ j0 f8243s;

    /* renamed from: t  reason: collision with root package name */
    public final i<Runnable> f8244t;

    /* renamed from: u  reason: collision with root package name */
    public final Object f8245u;

    public f(z zVar, int i) {
        this.f8241b = zVar;
        this.f8242c = i;
        j0 j0Var = zVar instanceof j0 ? (j0) zVar : null;
        this.f8243s = j0Var == null ? i0.f5406a : j0Var;
        this.f8244t = new i<>();
        this.f8245u = new Object();
    }

    public final void f(long j10, k<? super m> kVar) {
        this.f8243s.f(j10, kVar);
    }

    public final void p0(pd.f fVar, Runnable runnable) {
        this.f8244t.a(runnable);
        boolean z = true;
        if (!(this.runningWorkers >= this.f8242c)) {
            synchronized (this.f8245u) {
                if (this.runningWorkers >= this.f8242c) {
                    z = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z) {
                this.f8241b.p0(this, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f8245u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f8244t.c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            le.i<java.lang.Runnable> r2 = r4.f8244t
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            pd.h r3 = pd.h.f9881a
            ge.g.a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            ge.z r2 = r4.f8241b
            boolean r2 = r2.v0(r4)
            if (r2 == 0) goto L_0x0002
            ge.z r0 = r4.f8241b
            r0.p0(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f8245u
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0045 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0045 }
            le.i<java.lang.Runnable> r2 = r4.f8244t     // Catch:{ all -> 0x0045 }
            int r2 = r2.c()     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0045 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: le.f.run():void");
    }

    public final q0 s(long j10, Runnable runnable, pd.f fVar) {
        return this.f8243s.s(j10, runnable, fVar);
    }
}
