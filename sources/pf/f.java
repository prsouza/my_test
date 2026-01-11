package pf;

import ge.g0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import md.m;
import pf.p;
import pf.q;
import uf.h;
import uf.i;

public final class f implements Closeable {
    public static final u Q;
    public static final c R = new c();
    public final g0 A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public final u G;
    public u H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final Socket M;
    public final r N;
    public final e O;
    public final Set<Integer> P;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9951a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9952b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, q> f9953c = new LinkedHashMap();

    /* renamed from: s  reason: collision with root package name */
    public final String f9954s;

    /* renamed from: t  reason: collision with root package name */
    public int f9955t;

    /* renamed from: u  reason: collision with root package name */
    public int f9956u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9957v;

    /* renamed from: w  reason: collision with root package name */
    public final lf.d f9958w;

    /* renamed from: x  reason: collision with root package name */
    public final lf.c f9959x;

    /* renamed from: y  reason: collision with root package name */
    public final lf.c f9960y;
    public final lf.c z;

    public static final class a extends lf.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f9961e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f9962f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, f fVar, long j10) {
            super(str, true);
            this.f9961e = fVar;
            this.f9962f = j10;
        }

        public final long a() {
            f fVar;
            boolean z;
            synchronized (this.f9961e) {
                fVar = this.f9961e;
                long j10 = fVar.C;
                long j11 = fVar.B;
                if (j10 < j11) {
                    z = true;
                } else {
                    fVar.B = j11 + 1;
                    z = false;
                }
            }
            if (z) {
                f.a(fVar, (IOException) null);
                return -1;
            }
            fVar.B(false, 1, 0);
            return this.f9962f;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Socket f9963a;

        /* renamed from: b  reason: collision with root package name */
        public String f9964b;

        /* renamed from: c  reason: collision with root package name */
        public h f9965c;

        /* renamed from: d  reason: collision with root package name */
        public uf.g f9966d;

        /* renamed from: e  reason: collision with root package name */
        public d f9967e;

        /* renamed from: f  reason: collision with root package name */
        public g0 f9968f;
        public int g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f9969h = true;
        public final lf.d i;

        public b(lf.d dVar) {
            e6.e.D(dVar, "taskRunner");
            this.i = dVar;
            this.f9967e = d.f9970a;
            this.f9968f = t.f10051q;
        }
    }

    public static final class c {
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9970a = new a();

        public static final class a extends d {
            public final void b(q qVar) throws IOException {
                e6.e.D(qVar, "stream");
                qVar.c(b.REFUSED_STREAM, (IOException) null);
            }
        }

        public void a(f fVar, u uVar) {
            e6.e.D(fVar, "connection");
            e6.e.D(uVar, "settings");
        }

        public abstract void b(q qVar) throws IOException;
    }

    public final class e implements p.c, xd.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final p f9971a;

        public static final class a extends lf.a {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ e f9973e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ int f9974f;
            public final /* synthetic */ int g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, e eVar, int i, int i10) {
                super(str, true);
                this.f9973e = eVar;
                this.f9974f = i;
                this.g = i10;
            }

            public final long a() {
                f.this.B(true, this.f9974f, this.g);
                return -1;
            }
        }

        public e(p pVar) {
            this.f9971a = pVar;
        }

        public final void a(int i, List list) {
            f fVar = f.this;
            Objects.requireNonNull(fVar);
            synchronized (fVar) {
                if (fVar.P.contains(Integer.valueOf(i))) {
                    fVar.E(i, b.PROTOCOL_ERROR);
                    return;
                }
                fVar.P.add(Integer.valueOf(i));
                lf.c cVar = fVar.f9960y;
                cVar.c(new l(fVar.f9954s + '[' + i + "] onRequest", fVar, i, list), 0);
            }
        }

        public final void b() {
        }

        public final Object c() {
            b bVar;
            b bVar2 = b.INTERNAL_ERROR;
            e = null;
            try {
                this.f9971a.c(this);
                while (this.f9971a.a(false, this)) {
                }
                bVar = b.NO_ERROR;
                try {
                    f.this.c(bVar, b.CANCEL, (IOException) null);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        b bVar3 = b.PROTOCOL_ERROR;
                        f.this.c(bVar3, bVar3, e);
                        jf.c.d(this.f9971a);
                        return m.f8555a;
                    } catch (Throwable th2) {
                        th = th2;
                        f.this.c(bVar, bVar2, e);
                        jf.c.d(this.f9971a);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                bVar = bVar2;
                b bVar32 = b.PROTOCOL_ERROR;
                f.this.c(bVar32, bVar32, e);
                jf.c.d(this.f9971a);
                return m.f8555a;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                f.this.c(bVar, bVar2, e);
                jf.c.d(this.f9971a);
                throw th;
            }
            jf.c.d(this.f9971a);
            return m.f8555a;
        }

        public final void d(boolean z, int i, List list) {
            if (f.this.f(i)) {
                f fVar = f.this;
                Objects.requireNonNull(fVar);
                lf.c cVar = fVar.f9960y;
                cVar.c(new k(fVar.f9954s + '[' + i + "] onHeaders", fVar, i, list, z), 0);
                return;
            }
            synchronized (f.this) {
                q e10 = f.this.e(i);
                if (e10 == null) {
                    f fVar2 = f.this;
                    if (!fVar2.f9957v) {
                        if (i > fVar2.f9955t) {
                            if (i % 2 != fVar2.f9956u % 2) {
                                int i10 = i;
                                q qVar = new q(i10, f.this, false, z, jf.c.v(list));
                                f fVar3 = f.this;
                                fVar3.f9955t = i;
                                fVar3.f9953c.put(Integer.valueOf(i), qVar);
                                lf.c f10 = f.this.f9958w.f();
                                f10.c(new h(f.this.f9954s + '[' + i + "] onStream", qVar, this, list), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                e10.j(jf.c.v(list), z);
            }
        }

        public final void e() {
        }

        public final void f(boolean z, int i, int i10) {
            if (z) {
                synchronized (f.this) {
                    if (i == 1) {
                        f.this.C++;
                    } else if (i == 2) {
                        f.this.E++;
                    } else if (i == 3) {
                        f fVar = f.this;
                        Objects.requireNonNull(fVar);
                        fVar.notifyAll();
                    }
                }
                return;
            }
            f.this.f9959x.c(new a(android.support.v4.media.a.e(new StringBuilder(), f.this.f9954s, " ping"), this, i, i10), 0);
        }

        public final void g(boolean z, int i, h hVar, int i10) throws IOException {
            boolean z10;
            boolean z11;
            long j10;
            e6.e.D(hVar, "source");
            if (f.this.f(i)) {
                f fVar = f.this;
                Objects.requireNonNull(fVar);
                uf.e eVar = new uf.e();
                long j11 = (long) i10;
                hVar.i0(j11);
                hVar.I(eVar, j11);
                fVar.f9960y.c(new j(fVar.f9954s + '[' + i + "] onData", fVar, i, eVar, i10, z), 0);
                return;
            }
            q e10 = f.this.e(i);
            if (e10 == null) {
                f.this.E(i, b.PROTOCOL_ERROR);
                long j12 = (long) i10;
                f.this.w(j12);
                hVar.skip(j12);
                return;
            }
            byte[] bArr = jf.c.f7250a;
            q.b bVar = e10.g;
            long j13 = (long) i10;
            Objects.requireNonNull(bVar);
            while (true) {
                boolean z12 = true;
                if (j13 <= 0) {
                    break;
                }
                synchronized (q.this) {
                    z10 = bVar.f10034t;
                    z11 = bVar.f10031b.f11952b + j13 > bVar.f10033s;
                }
                if (z11) {
                    hVar.skip(j13);
                    q.this.e(b.FLOW_CONTROL_ERROR);
                    break;
                } else if (z10) {
                    hVar.skip(j13);
                    break;
                } else {
                    long I = hVar.I(bVar.f10030a, j13);
                    if (I != -1) {
                        j13 -= I;
                        synchronized (q.this) {
                            if (bVar.f10032c) {
                                uf.e eVar2 = bVar.f10030a;
                                j10 = eVar2.f11952b;
                                eVar2.a();
                            } else {
                                uf.e eVar3 = bVar.f10031b;
                                if (eVar3.f11952b != 0) {
                                    z12 = false;
                                }
                                eVar3.x0(bVar.f10030a);
                                if (z12) {
                                    q qVar = q.this;
                                    if (qVar != null) {
                                        qVar.notifyAll();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j10 = 0;
                            }
                        }
                        if (j10 > 0) {
                            bVar.a(j10);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                e10.j(jf.c.f7251b, true);
            }
        }

        public final void i(int i, b bVar) {
            if (f.this.f(i)) {
                f fVar = f.this;
                Objects.requireNonNull(fVar);
                lf.c cVar = fVar.f9960y;
                cVar.c(new m(fVar.f9954s + '[' + i + "] onReset", fVar, i, bVar), 0);
                return;
            }
            q s10 = f.this.s(i);
            if (s10 != null) {
                synchronized (s10) {
                    if (s10.f10022k == null) {
                        s10.f10022k = bVar;
                        s10.notifyAll();
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, pf.q>] */
        public final void l(int i, b bVar, i iVar) {
            int i10;
            q[] qVarArr;
            e6.e.D(iVar, "debugData");
            iVar.h();
            synchronized (f.this) {
                Object[] array = f.this.f9953c.values().toArray(new q[0]);
                if (array != null) {
                    qVarArr = (q[]) array;
                    f.this.f9957v = true;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (q qVar : qVarArr) {
                if (qVar.f10024m > i && qVar.h()) {
                    b bVar2 = b.REFUSED_STREAM;
                    synchronized (qVar) {
                        e6.e.D(bVar2, "errorCode");
                        if (qVar.f10022k == null) {
                            qVar.f10022k = bVar2;
                            qVar.notifyAll();
                        }
                    }
                    f.this.s(qVar.f10024m);
                }
            }
        }

        public final void m(int i, long j10) {
            if (i == 0) {
                synchronized (f.this) {
                    f fVar = f.this;
                    fVar.L += j10;
                    if (fVar != null) {
                        fVar.notifyAll();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            q e10 = f.this.e(i);
            if (e10 != null) {
                synchronized (e10) {
                    e10.f10017d += j10;
                    if (j10 > 0) {
                        e10.notifyAll();
                    }
                }
            }
        }

        public final void n(u uVar) {
            f.this.f9959x.c(new i(android.support.v4.media.a.e(new StringBuilder(), f.this.f9954s, " applyAndAckSettings"), this, uVar), 0);
        }
    }

    /* renamed from: pf.f$f  reason: collision with other inner class name */
    public static final class C0193f extends lf.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f9975e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f9976f;
        public final /* synthetic */ b g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0193f(String str, f fVar, int i, b bVar) {
            super(str, true);
            this.f9975e = fVar;
            this.f9976f = i;
            this.g = bVar;
        }

        public final long a() {
            try {
                f fVar = this.f9975e;
                int i = this.f9976f;
                b bVar = this.g;
                Objects.requireNonNull(fVar);
                e6.e.D(bVar, "statusCode");
                fVar.N.w(i, bVar);
                return -1;
            } catch (IOException e10) {
                f.a(this.f9975e, e10);
                return -1;
            }
        }
    }

    public static final class g extends lf.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f9977e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f9978f;
        public final /* synthetic */ long g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, f fVar, int i, long j10) {
            super(str, true);
            this.f9977e = fVar;
            this.f9978f = i;
            this.g = j10;
        }

        public final long a() {
            try {
                this.f9977e.N.y(this.f9978f, this.g);
                return -1;
            } catch (IOException e10) {
                f.a(this.f9977e, e10);
                return -1;
            }
        }
    }

    static {
        u uVar = new u();
        uVar.c(7, 65535);
        uVar.c(5, 16384);
        Q = uVar;
    }

    public f(b bVar) {
        boolean z10 = bVar.f9969h;
        this.f9951a = z10;
        this.f9952b = bVar.f9967e;
        String str = bVar.f9964b;
        if (str != null) {
            this.f9954s = str;
            this.f9956u = bVar.f9969h ? 3 : 2;
            lf.d dVar = bVar.i;
            this.f9958w = dVar;
            lf.c f10 = dVar.f();
            this.f9959x = f10;
            this.f9960y = dVar.f();
            this.z = dVar.f();
            this.A = bVar.f9968f;
            u uVar = new u();
            if (bVar.f9969h) {
                uVar.c(7, 16777216);
            }
            this.G = uVar;
            u uVar2 = Q;
            this.H = uVar2;
            this.L = (long) uVar2.a();
            Socket socket = bVar.f9963a;
            if (socket != null) {
                this.M = socket;
                uf.g gVar = bVar.f9966d;
                if (gVar != null) {
                    this.N = new r(gVar, z10);
                    h hVar = bVar.f9965c;
                    if (hVar != null) {
                        this.O = new e(new p(hVar, z10));
                        this.P = new LinkedHashSet();
                        int i = bVar.g;
                        if (i != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                            f10.c(new a(a8.a.c(str, " ping"), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    e6.e.c0("source");
                    throw null;
                }
                e6.e.c0("sink");
                throw null;
            }
            e6.e.c0("socket");
            throw null;
        }
        e6.e.c0("connectionName");
        throw null;
    }

    public static final void a(f fVar, IOException iOException) {
        Objects.requireNonNull(fVar);
        b bVar = b.PROTOCOL_ERROR;
        fVar.c(bVar, bVar, iOException);
    }

    public final void B(boolean z10, int i, int i10) {
        try {
            this.N.t(z10, i, i10);
        } catch (IOException e10) {
            b bVar = b.PROTOCOL_ERROR;
            c(bVar, bVar, e10);
        }
    }

    public final void E(int i, b bVar) {
        e6.e.D(bVar, "errorCode");
        lf.c cVar = this.f9959x;
        cVar.c(new C0193f(this.f9954s + '[' + i + "] writeSynReset", this, i, bVar), 0);
    }

    public final void O(int i, long j10) {
        lf.c cVar = this.f9959x;
        cVar.c(new g(this.f9954s + '[' + i + "] windowUpdate", this, i, j10), 0);
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, pf.q>] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, pf.q>] */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|10|(2:16|(5:18|19|20|33|21))|23|24|25|26|27|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(pf.b r4, pf.b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            e6.e.D(r4, r0)
            java.lang.String r0 = "streamCode"
            e6.e.D(r5, r0)
            byte[] r0 = jf.c.f7250a
            r3.t(r4)     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, pf.q> r0 = r3.f9953c     // Catch:{ all -> 0x0062 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0062 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.Map<java.lang.Integer, pf.q> r4 = r3.f9953c     // Catch:{ all -> 0x0062 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0062 }
            pf.q[] r0 = new pf.q[r1]     // Catch:{ all -> 0x0062 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0032
            pf.q[] r4 = (pf.q[]) r4     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.Integer, pf.q> r0 = r3.f9953c     // Catch:{ all -> 0x0062 }
            r0.clear()     // Catch:{ all -> 0x0062 }
            goto L_0x003a
        L_0x0032:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0062 }
            throw r4     // Catch:{ all -> 0x0062 }
        L_0x003a:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0048
            int r0 = r4.length
        L_0x003e:
            if (r1 >= r0) goto L_0x0048
            r2 = r4[r1]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0048:
            pf.r r4 = r3.N     // Catch:{ IOException -> 0x004d }
            r4.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            java.net.Socket r4 = r3.M     // Catch:{ IOException -> 0x0052 }
            r4.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            lf.c r4 = r3.f9959x
            r4.e()
            lf.c r4 = r3.f9960y
            r4.e()
            lf.c r4 = r3.z
            r4.e()
            return
        L_0x0062:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.f.c(pf.b, pf.b, java.io.IOException):void");
    }

    public final void close() {
        c(b.NO_ERROR, b.CANCEL, (IOException) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, pf.q>] */
    public final synchronized q e(int i) {
        return (q) this.f9953c.get(Integer.valueOf(i));
    }

    public final boolean f(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final void flush() throws IOException {
        this.N.flush();
    }

    public final synchronized q s(int i) {
        q remove;
        remove = this.f9953c.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void t(b bVar) throws IOException {
        e6.e.D(bVar, "statusCode");
        synchronized (this.N) {
            synchronized (this) {
                if (!this.f9957v) {
                    this.f9957v = true;
                    int i = this.f9955t;
                    this.N.f(i, bVar, jf.c.f7250a);
                }
            }
        }
    }

    public final synchronized void w(long j10) {
        long j11 = this.I + j10;
        this.I = j11;
        long j12 = j11 - this.J;
        if (j12 >= ((long) (this.G.a() / 2))) {
            O(0, j12);
            this.J += j12;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.N.f10039b);
        r6 = (long) r2;
        r8.K += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(int r9, boolean r10, uf.e r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            pf.r r12 = r8.N
            r12.c(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.K     // Catch:{ InterruptedException -> 0x0059 }
            long r6 = r8.L     // Catch:{ InterruptedException -> 0x0059 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, pf.q> r2 = r8.f9953c     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0057 }
            int r2 = (int) r4     // Catch:{ all -> 0x0057 }
            pf.r r4 = r8.N     // Catch:{ all -> 0x0057 }
            int r4 = r4.f10039b     // Catch:{ all -> 0x0057 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0057 }
            long r4 = r8.K     // Catch:{ all -> 0x0057 }
            long r6 = (long) r2     // Catch:{ all -> 0x0057 }
            long r4 = r4 + r6
            r8.K = r4     // Catch:{ all -> 0x0057 }
            monitor-exit(r8)
            long r12 = r12 - r6
            pf.r r4 = r8.N
            if (r10 == 0) goto L_0x0052
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = r3
        L_0x0053:
            r4.c(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0057:
            r9 = move-exception
            goto L_0x0066
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0057 }
            r9.interrupt()     // Catch:{ all -> 0x0057 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0057 }
            r9.<init>()     // Catch:{ all -> 0x0057 }
            throw r9     // Catch:{ all -> 0x0057 }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.f.y(int, boolean, uf.e, long):void");
    }
}
