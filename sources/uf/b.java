package uf;

import e6.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class b extends c0 {

    /* renamed from: h  reason: collision with root package name */
    public static final long f11938h;
    public static final long i;

    /* renamed from: j  reason: collision with root package name */
    public static b f11939j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f11940k = new a();

    /* renamed from: e  reason: collision with root package name */
    public boolean f11941e;

    /* renamed from: f  reason: collision with root package name */
    public b f11942f;
    public long g;

    public static final class a {
        public final b a() throws InterruptedException {
            Class<b> cls = b.class;
            b bVar = b.f11939j;
            e.B(bVar);
            b bVar2 = bVar.f11942f;
            if (bVar2 == null) {
                long nanoTime = System.nanoTime();
                cls.wait(b.f11938h);
                b bVar3 = b.f11939j;
                e.B(bVar3);
                if (bVar3.f11942f != null || System.nanoTime() - nanoTime < b.i) {
                    return null;
                }
                return b.f11939j;
            }
            long nanoTime2 = bVar2.g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j10 = nanoTime2 / 1000000;
                cls.wait(j10, (int) (nanoTime2 - (1000000 * j10)));
                return null;
            }
            b bVar4 = b.f11939j;
            e.B(bVar4);
            bVar4.f11942f = bVar2.f11942f;
            bVar2.f11942f = null;
            return bVar2;
        }
    }

    /* renamed from: uf.b$b  reason: collision with other inner class name */
    public static final class C0234b extends Thread {
        public C0234b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0015, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0017, code lost:
            r1.k();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<uf.b> r0 = uf.b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                uf.b$a r1 = uf.b.f11940k     // Catch:{ all -> 0x0012 }
                uf.b r1 = r1.a()     // Catch:{ all -> 0x0012 }
                uf.b r2 = uf.b.f11939j     // Catch:{ all -> 0x0012 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                uf.b.f11939j = r1     // Catch:{ all -> 0x0012 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                r1 = move-exception
                goto L_0x001b
            L_0x0014:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001b:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.b.C0234b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f11938h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        b bVar;
        if (!this.f11941e) {
            long j10 = this.f11948c;
            boolean z = this.f11946a;
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i10 != 0 || z) {
                this.f11941e = true;
                Class<b> cls = b.class;
                synchronized (cls) {
                    if (f11939j == null) {
                        f11939j = new b();
                        new C0234b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i10 != 0 && z) {
                        this.g = Math.min(j10, c() - nanoTime) + nanoTime;
                    } else if (i10 != 0) {
                        this.g = j10 + nanoTime;
                    } else if (z) {
                        this.g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j11 = this.g - nanoTime;
                    b bVar2 = f11939j;
                    e.B(bVar2);
                    while (true) {
                        bVar = bVar2.f11942f;
                        if (bVar == null) {
                            break;
                        } else if (j11 < bVar.g - nanoTime) {
                            break;
                        } else {
                            bVar2 = bVar;
                        }
                    }
                    this.f11942f = bVar;
                    bVar2.f11942f = this;
                    if (bVar2 == f11939j) {
                        cls.notify();
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean i() {
        boolean z = false;
        if (!this.f11941e) {
            return false;
        }
        this.f11941e = false;
        synchronized (b.class) {
            b bVar = f11939j;
            while (true) {
                if (bVar == null) {
                    z = true;
                    break;
                }
                b bVar2 = bVar.f11942f;
                if (bVar2 == this) {
                    bVar.f11942f = this.f11942f;
                    this.f11942f = null;
                    break;
                }
                bVar = bVar2;
            }
        }
        return z;
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
