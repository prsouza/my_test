package ge;

import ge.v0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import pd.f;
import y.c;

public final class h0 extends v0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: w  reason: collision with root package name */
    public static final h0 f5403w;

    /* renamed from: x  reason: collision with root package name */
    public static final long f5404x;

    static {
        Long l10;
        h0 h0Var = new h0();
        f5403w = h0Var;
        h0Var.z0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f5404x = timeUnit.toNanos(l10.longValue());
    }

    public final Thread D0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public final void E0(long j10, v0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final void F0(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.F0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void K0() {
        if (L0()) {
            debugStatus = 3;
            I0();
            notifyAll();
        }
    }

    public final boolean L0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        _thread = null;
        K0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008e, code lost:
        if (H0() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0090, code lost:
        D0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0093, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            ge.y1 r0 = ge.y1.f5472a
            java.lang.ThreadLocal<ge.u0> r0 = ge.y1.f5473b
            r0.set(r12)
            r0 = 0
            monitor-enter(r12)     // Catch:{ all -> 0x0084 }
            boolean r1 = r12.L0()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0012
            r1 = 0
            monitor-exit(r12)     // Catch:{ all -> 0x0084 }
            goto L_0x0019
        L_0x0012:
            r1 = 1
            debugStatus = r1     // Catch:{ all -> 0x0081 }
            r12.notifyAll()     // Catch:{ all -> 0x0081 }
            monitor-exit(r12)     // Catch:{ all -> 0x0084 }
        L_0x0019:
            if (r1 != 0) goto L_0x002a
            _thread = r0
            r12.K0()
            boolean r0 = r12.H0()
            if (r0 != 0) goto L_0x0029
            r12.D0()
        L_0x0029:
            return
        L_0x002a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L_0x0030:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0084 }
            long r5 = r12.B0()     // Catch:{ all -> 0x0084 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0063
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0084 }
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0048
            long r3 = f5404x     // Catch:{ all -> 0x0084 }
            long r3 = r3 + r10
        L_0x0048:
            long r10 = r3 - r10
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x005d
            _thread = r0
            r12.K0()
            boolean r0 = r12.H0()
            if (r0 != 0) goto L_0x005c
            r12.D0()
        L_0x005c:
            return
        L_0x005d:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            r5 = r10
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0030
            boolean r7 = r12.L0()     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x007d
            _thread = r0
            r12.K0()
            boolean r0 = r12.H0()
            if (r0 != 0) goto L_0x007c
            r12.D0()
        L_0x007c:
            return
        L_0x007d:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch:{ all -> 0x0084 }
            goto L_0x0030
        L_0x0081:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            _thread = r0
            r12.K0()
            boolean r0 = r12.H0()
            if (r0 != 0) goto L_0x0093
            r12.D0()
        L_0x0093:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.h0.run():void");
    }

    public final q0 s(long j10, Runnable runnable, f fVar) {
        long v10 = c.v(j10);
        if (v10 >= 4611686018427387903L) {
            return p1.f5437a;
        }
        long nanoTime = System.nanoTime();
        v0.b bVar = new v0.b(v10 + nanoTime, runnable);
        J0(nanoTime, bVar);
        return bVar;
    }

    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
