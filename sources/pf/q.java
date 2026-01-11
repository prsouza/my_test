package pf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import uf.b0;
import uf.c0;
import uf.e;
import uf.z;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public long f10014a;

    /* renamed from: b  reason: collision with root package name */
    public long f10015b;

    /* renamed from: c  reason: collision with root package name */
    public long f10016c;

    /* renamed from: d  reason: collision with root package name */
    public long f10017d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<p002if.q> f10018e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10019f;
    public final b g;

    /* renamed from: h  reason: collision with root package name */
    public final a f10020h;
    public final c i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final c f10021j = new c();

    /* renamed from: k  reason: collision with root package name */
    public b f10022k;

    /* renamed from: l  reason: collision with root package name */
    public IOException f10023l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10024m;

    /* renamed from: n  reason: collision with root package name */
    public final f f10025n;

    public final class a implements z {

        /* renamed from: a  reason: collision with root package name */
        public final e f10026a = new e();

        /* renamed from: b  reason: collision with root package name */
        public boolean f10027b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10028c;

        public a(boolean z) {
            this.f10028c = z;
        }

        public final void H(e eVar, long j10) throws IOException {
            e6.e.D(eVar, "source");
            byte[] bArr = jf.c.f7250a;
            this.f10026a.H(eVar, j10);
            while (this.f10026a.f11952b >= 16384) {
                a(false);
            }
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r12.f10029s.f10021j.l();
            r12.f10029s.b();
            r1 = r12.f10029s;
            r10 = java.lang.Math.min(r1.f10017d - r1.f10016c, r12.f10026a.f11952b);
            r1 = r12.f10029s;
            r1.f10016c += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
            if (r13 == false) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (r10 != r12.f10026a.f11952b) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
            r8 = r13;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r13) throws java.io.IOException {
            /*
                r12 = this;
                pf.q r0 = pf.q.this
                monitor-enter(r0)
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x0083 }
                pf.q$c r1 = r1.f10021j     // Catch:{ all -> 0x0083 }
                r1.h()     // Catch:{ all -> 0x0083 }
            L_0x000a:
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x007a }
                long r2 = r1.f10016c     // Catch:{ all -> 0x007a }
                long r4 = r1.f10017d     // Catch:{ all -> 0x007a }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0028
                boolean r2 = r12.f10028c     // Catch:{ all -> 0x007a }
                if (r2 != 0) goto L_0x0028
                boolean r2 = r12.f10027b     // Catch:{ all -> 0x007a }
                if (r2 != 0) goto L_0x0028
                pf.b r1 = r1.f()     // Catch:{ all -> 0x007a }
                if (r1 != 0) goto L_0x0028
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x007a }
                r1.k()     // Catch:{ all -> 0x007a }
                goto L_0x000a
            L_0x0028:
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x0083 }
                pf.q$c r1 = r1.f10021j     // Catch:{ all -> 0x0083 }
                r1.l()     // Catch:{ all -> 0x0083 }
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x0083 }
                r1.b()     // Catch:{ all -> 0x0083 }
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x0083 }
                long r2 = r1.f10017d     // Catch:{ all -> 0x0083 }
                long r4 = r1.f10016c     // Catch:{ all -> 0x0083 }
                long r2 = r2 - r4
                uf.e r1 = r12.f10026a     // Catch:{ all -> 0x0083 }
                long r4 = r1.f11952b     // Catch:{ all -> 0x0083 }
                long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0083 }
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x0083 }
                long r2 = r1.f10016c     // Catch:{ all -> 0x0083 }
                long r2 = r2 + r10
                r1.f10016c = r2     // Catch:{ all -> 0x0083 }
                if (r13 == 0) goto L_0x0056
                uf.e r13 = r12.f10026a     // Catch:{ all -> 0x0083 }
                long r2 = r13.f11952b     // Catch:{ all -> 0x0083 }
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x0056
                r13 = 1
                goto L_0x0057
            L_0x0056:
                r13 = 0
            L_0x0057:
                r8 = r13
                monitor-exit(r0)
                pf.q$c r13 = r1.f10021j
                r13.h()
                pf.q r13 = pf.q.this     // Catch:{ all -> 0x0071 }
                pf.f r6 = r13.f10025n     // Catch:{ all -> 0x0071 }
                int r7 = r13.f10024m     // Catch:{ all -> 0x0071 }
                uf.e r9 = r12.f10026a     // Catch:{ all -> 0x0071 }
                r6.y(r7, r8, r9, r10)     // Catch:{ all -> 0x0071 }
                pf.q r13 = pf.q.this
                pf.q$c r13 = r13.f10021j
                r13.l()
                return
            L_0x0071:
                r13 = move-exception
                pf.q r0 = pf.q.this
                pf.q$c r0 = r0.f10021j
                r0.l()
                throw r13
            L_0x007a:
                r13 = move-exception
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x0083 }
                pf.q$c r1 = r1.f10021j     // Catch:{ all -> 0x0083 }
                r1.l()     // Catch:{ all -> 0x0083 }
                throw r13     // Catch:{ all -> 0x0083 }
            L_0x0083:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.q.a.a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            r0 = r14.f10029s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            if (r0.f10020h.f10028c != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            if (r14.f10026a.f11952b <= 0) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
            if (r2 == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
            if (r14.f10026a.f11952b <= 0) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            if (r1 == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
            r0.f10025n.y(r0.f10024m, true, (uf.e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            r0 = r14.f10029s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r14.f10027b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r14.f10029s.f10025n.flush();
            r14.f10029s.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() throws java.io.IOException {
            /*
                r14 = this;
                pf.q r0 = pf.q.this
                byte[] r1 = jf.c.f7250a
                monitor-enter(r0)
                boolean r1 = r14.f10027b     // Catch:{ all -> 0x005d }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                pf.q r1 = pf.q.this     // Catch:{ all -> 0x005d }
                pf.b r1 = r1.f()     // Catch:{ all -> 0x005d }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0017
                r1 = r3
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                monitor-exit(r0)
                pf.q r0 = pf.q.this
                pf.q$a r4 = r0.f10020h
                boolean r4 = r4.f10028c
                if (r4 != 0) goto L_0x0047
                uf.e r4 = r14.f10026a
                long r4 = r4.f11952b
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002c
                r2 = r3
            L_0x002c:
                if (r2 == 0) goto L_0x003a
            L_0x002e:
                uf.e r0 = r14.f10026a
                long r0 = r0.f11952b
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r14.a(r3)
                goto L_0x002e
            L_0x003a:
                if (r1 == 0) goto L_0x0047
                pf.f r8 = r0.f10025n
                int r9 = r0.f10024m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.y(r9, r10, r11, r12)
            L_0x0047:
                pf.q r0 = pf.q.this
                monitor-enter(r0)
                r14.f10027b = r3     // Catch:{ all -> 0x005a }
                monitor-exit(r0)
                pf.q r0 = pf.q.this
                pf.f r0 = r0.f10025n
                r0.flush()
                pf.q r0 = pf.q.this
                r0.a()
                return
            L_0x005a:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x005d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.q.a.close():void");
        }

        public final c0 d() {
            return q.this.f10021j;
        }

        public final void flush() throws IOException {
            q qVar = q.this;
            byte[] bArr = jf.c.f7250a;
            synchronized (qVar) {
                q.this.b();
            }
            while (this.f10026a.f11952b > 0) {
                a(false);
                q.this.f10025n.flush();
            }
        }
    }

    public final class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        public final e f10030a = new e();

        /* renamed from: b  reason: collision with root package name */
        public final e f10031b = new e();

        /* renamed from: c  reason: collision with root package name */
        public boolean f10032c;

        /* renamed from: s  reason: collision with root package name */
        public final long f10033s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f10034t;

        public b(long j10, boolean z) {
            this.f10033s = j10;
            this.f10034t = z;
        }

        public final long I(e eVar, long j10) throws IOException {
            long j11;
            boolean z;
            long j12;
            e eVar2 = eVar;
            long j13 = j10;
            e6.e.D(eVar2, "sink");
            long j14 = 0;
            if (j13 >= 0) {
                while (true) {
                    Throwable th2 = null;
                    synchronized (q.this) {
                        q.this.i.h();
                        try {
                            if (q.this.f() != null) {
                                th2 = q.this.f10023l;
                                if (th2 == null) {
                                    b f10 = q.this.f();
                                    e6.e.B(f10);
                                    th2 = new v(f10);
                                }
                            }
                            if (!this.f10032c) {
                                e eVar3 = this.f10031b;
                                long j15 = eVar3.f11952b;
                                if (j15 > j14) {
                                    j12 = eVar3.I(eVar2, Math.min(j13, j15));
                                    q qVar = q.this;
                                    long j16 = qVar.f10014a + j12;
                                    qVar.f10014a = j16;
                                    long j17 = j16 - qVar.f10015b;
                                    if (th2 == null && j17 >= ((long) (qVar.f10025n.G.a() / 2))) {
                                        q qVar2 = q.this;
                                        qVar2.f10025n.O(qVar2.f10024m, j17);
                                        q qVar3 = q.this;
                                        qVar3.f10015b = qVar3.f10014a;
                                    }
                                } else if (this.f10034t || th2 != null) {
                                    j12 = -1;
                                } else {
                                    q.this.k();
                                    z = true;
                                    j11 = -1;
                                }
                                long j18 = j12;
                                z = false;
                                j11 = j18;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            q.this.i.l();
                        }
                    }
                    if (z) {
                        j14 = 0;
                    } else if (j11 != -1) {
                        a(j11);
                        return j11;
                    } else if (th2 == null) {
                        return -1;
                    } else {
                        throw th2;
                    }
                }
            } else {
                throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount < 0: ", j13).toString());
            }
        }

        public final void a(long j10) {
            q qVar = q.this;
            byte[] bArr = jf.c.f7250a;
            qVar.f10025n.w(j10);
        }

        public final void close() throws IOException {
            long j10;
            synchronized (q.this) {
                this.f10032c = true;
                e eVar = this.f10031b;
                j10 = eVar.f11952b;
                eVar.a();
                q qVar = q.this;
                if (qVar != null) {
                    qVar.notifyAll();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j10 > 0) {
                a(j10);
            }
            q.this.a();
        }

        public final c0 d() {
            return q.this.i;
        }
    }

    public final class c extends uf.b {
        public c() {
        }

        public final IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void k() {
            q.this.e(b.CANCEL);
            f fVar = q.this.f10025n;
            synchronized (fVar) {
                long j10 = fVar.E;
                long j11 = fVar.D;
                if (j10 >= j11) {
                    fVar.D = j11 + 1;
                    fVar.F = System.nanoTime() + ((long) 1000000000);
                    fVar.f9959x.c(new n(android.support.v4.media.a.e(new StringBuilder(), fVar.f9954s, " ping"), fVar), 0);
                }
            }
        }

        public final void l() throws IOException {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public q(int i10, f fVar, boolean z, boolean z10, p002if.q qVar) {
        e6.e.D(fVar, "connection");
        this.f10024m = i10;
        this.f10025n = fVar;
        this.f10017d = (long) fVar.H.a();
        ArrayDeque<p002if.q> arrayDeque = new ArrayDeque<>();
        this.f10018e = arrayDeque;
        this.g = new b((long) fVar.G.a(), z10);
        this.f10020h = new a(z);
        if (qVar != null) {
            if (!h()) {
                arrayDeque.add(qVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() throws IOException {
        boolean z;
        boolean i10;
        byte[] bArr = jf.c.f7250a;
        synchronized (this) {
            b bVar = this.g;
            if (!bVar.f10034t && bVar.f10032c) {
                a aVar = this.f10020h;
                if (aVar.f10028c || aVar.f10027b) {
                    z = true;
                    i10 = i();
                }
            }
            z = false;
            i10 = i();
        }
        if (z) {
            c(b.CANCEL, (IOException) null);
        } else if (!i10) {
            this.f10025n.s(this.f10024m);
        }
    }

    public final void b() throws IOException {
        a aVar = this.f10020h;
        if (aVar.f10027b) {
            throw new IOException("stream closed");
        } else if (aVar.f10028c) {
            throw new IOException("stream finished");
        } else if (this.f10022k != null) {
            Throwable th2 = this.f10023l;
            if (th2 == null) {
                b bVar = this.f10022k;
                e6.e.B(bVar);
                th2 = new v(bVar);
            }
            throw th2;
        }
    }

    public final void c(b bVar, IOException iOException) throws IOException {
        e6.e.D(bVar, "rstStatusCode");
        if (d(bVar, iOException)) {
            f fVar = this.f10025n;
            int i10 = this.f10024m;
            Objects.requireNonNull(fVar);
            fVar.N.w(i10, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = jf.c.f7250a;
        synchronized (this) {
            if (this.f10022k != null) {
                return false;
            }
            if (this.g.f10034t && this.f10020h.f10028c) {
                return false;
            }
            this.f10022k = bVar;
            this.f10023l = iOException;
            notifyAll();
            this.f10025n.s(this.f10024m);
            return true;
        }
    }

    public final void e(b bVar) {
        e6.e.D(bVar, "errorCode");
        if (d(bVar, (IOException) null)) {
            this.f10025n.E(this.f10024m, bVar);
        }
    }

    public final synchronized b f() {
        return this.f10022k;
    }

    public final z g() {
        synchronized (this) {
            if (!(this.f10019f || h())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f10020h;
    }

    public final boolean h() {
        if (this.f10025n.f9951a == ((this.f10024m & 1) == 1)) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.f10022k != null) {
            return false;
        }
        b bVar = this.g;
        if (bVar.f10034t || bVar.f10032c) {
            a aVar = this.f10020h;
            if ((aVar.f10028c || aVar.f10027b) && this.f10019f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(p002if.q r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            e6.e.D(r3, r0)
            byte[] r0 = jf.c.f7250a
            monitor-enter(r2)
            boolean r0 = r2.f10019f     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            pf.q$b r3 = r2.g     // Catch:{ all -> 0x0035 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x001d
        L_0x0016:
            r2.f10019f = r1     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque<if.q> r0 = r2.f10018e     // Catch:{ all -> 0x0035 }
            r0.add(r3)     // Catch:{ all -> 0x0035 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            pf.q$b r3 = r2.g     // Catch:{ all -> 0x0035 }
            r3.f10034t = r1     // Catch:{ all -> 0x0035 }
        L_0x0023:
            boolean r3 = r2.i()     // Catch:{ all -> 0x0035 }
            r2.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0034
            pf.f r3 = r2.f10025n
            int r4 = r2.f10024m
            r3.s(r4)
        L_0x0034:
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.q.j(if.q, boolean):void");
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
