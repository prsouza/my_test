package mf;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p002if.a0;
import p002if.d;
import p002if.l;
import p002if.n;
import p002if.v;
import p002if.x;
import qf.h;

public final class e implements d {
    public boolean A = true;
    public volatile boolean B;
    public volatile c C;
    public volatile h D;
    public final v E;
    public final x F;
    public final boolean G;

    /* renamed from: a  reason: collision with root package name */
    public final j f8625a;

    /* renamed from: b  reason: collision with root package name */
    public final n f8626b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8627c;

    /* renamed from: s  reason: collision with root package name */
    public final AtomicBoolean f8628s = new AtomicBoolean();

    /* renamed from: t  reason: collision with root package name */
    public Object f8629t;

    /* renamed from: u  reason: collision with root package name */
    public d f8630u;

    /* renamed from: v  reason: collision with root package name */
    public h f8631v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8632w;

    /* renamed from: x  reason: collision with root package name */
    public c f8633x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8634y;
    public boolean z;

    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public volatile AtomicInteger f8635a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        public final p002if.e f8636b;

        public a(p002if.e eVar) {
            this.f8636b = eVar;
        }

        public final String a() {
            return e.this.F.f6627b.f6568e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009a A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                java.lang.String r0 = "OkHttp "
                java.lang.StringBuilder r0 = a.a.d(r0)
                mf.e r1 = mf.e.this
                if.x r1 = r1.F
                if.r r1 = r1.f6627b
                java.lang.String r1 = r1.g()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                e6.e.C(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                mf.e r0 = mf.e.this     // Catch:{ all -> 0x00b7 }
                mf.e$c r0 = r0.f8627c     // Catch:{ all -> 0x00b7 }
                r0.h()     // Catch:{ all -> 0x00b7 }
                r0 = 0
                mf.e r3 = mf.e.this     // Catch:{ IOException -> 0x0077, all -> 0x004c }
                if.a0 r0 = r3.h()     // Catch:{ IOException -> 0x0077, all -> 0x004c }
                r3 = 1
                if.e r4 = r7.f8636b     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                ki.r$a r4 = (ki.r.a) r4     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                r4.b(r0)     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                mf.e r0 = mf.e.this     // Catch:{ all -> 0x00b7 }
            L_0x003f:
                if.v r0 = r0.E     // Catch:{ all -> 0x00b7 }
                goto L_0x00a4
            L_0x0042:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x004d
            L_0x0047:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x0078
            L_0x004c:
                r3 = move-exception
            L_0x004d:
                mf.e r4 = mf.e.this     // Catch:{ all -> 0x0075 }
                r4.cancel()     // Catch:{ all -> 0x0075 }
                if (r0 != 0) goto L_0x0074
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                r4.append(r3)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                r0.<init>(r4)     // Catch:{ all -> 0x0075 }
                a.b.D(r0, r3)     // Catch:{ all -> 0x0075 }
                if.e r4 = r7.f8636b     // Catch:{ all -> 0x0075 }
                ki.r$a r4 = (ki.r.a) r4     // Catch:{ all -> 0x0075 }
                r4.a(r0)     // Catch:{ all -> 0x0075 }
            L_0x0074:
                throw r3     // Catch:{ all -> 0x0075 }
            L_0x0075:
                r0 = move-exception
                goto L_0x00ad
            L_0x0077:
                r3 = move-exception
            L_0x0078:
                if (r0 == 0) goto L_0x009a
                qf.h$a r0 = qf.h.f10446c     // Catch:{ all -> 0x0075 }
                qf.h r0 = qf.h.f10444a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                mf.e r5 = mf.e.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = mf.e.a(r5)     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                r5 = 4
                r0.i(r4, r5, r3)     // Catch:{ all -> 0x0075 }
                goto L_0x00a1
            L_0x009a:
                if.e r0 = r7.f8636b     // Catch:{ all -> 0x0075 }
                ki.r$a r0 = (ki.r.a) r0     // Catch:{ all -> 0x0075 }
                r0.a(r3)     // Catch:{ all -> 0x0075 }
            L_0x00a1:
                mf.e r0 = mf.e.this     // Catch:{ all -> 0x00b7 }
                goto L_0x003f
            L_0x00a4:
                if.l r0 = r0.f6597a     // Catch:{ all -> 0x00b7 }
                r0.b(r7)     // Catch:{ all -> 0x00b7 }
                r1.setName(r2)
                return
            L_0x00ad:
                mf.e r3 = mf.e.this     // Catch:{ all -> 0x00b7 }
                if.v r3 = r3.E     // Catch:{ all -> 0x00b7 }
                if.l r3 = r3.f6597a     // Catch:{ all -> 0x00b7 }
                r3.b(r7)     // Catch:{ all -> 0x00b7 }
                throw r0     // Catch:{ all -> 0x00b7 }
            L_0x00b7:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mf.e.a.run():void");
        }
    }

    public static final class b extends WeakReference<e> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f8638a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            e6.e.D(eVar, "referent");
            this.f8638a = obj;
        }
    }

    public static final class c extends uf.b {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e f8639l;

        public c(e eVar) {
            this.f8639l = eVar;
        }

        public final void k() {
            this.f8639l.cancel();
        }
    }

    public e(v vVar, x xVar, boolean z10) {
        e6.e.D(vVar, "client");
        e6.e.D(xVar, "originalRequest");
        this.E = vVar;
        this.F = xVar;
        this.G = z10;
        this.f8625a = (j) vVar.f6598b.f7785a;
        this.f8626b = vVar.f6601t.a(this);
        c cVar = new c(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.g((long) 0);
        this.f8627c = cVar;
    }

    public static final String a(e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.B ? "canceled " : BuildConfig.FLAVOR);
        sb2.append(eVar.G ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(eVar.F.f6627b.g());
        return sb2.toString();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<java.lang.ref.Reference<mf.e>>, java.util.ArrayList] */
    public final void b(h hVar) {
        byte[] bArr = jf.c.f7250a;
        if (this.f8631v == null) {
            this.f8631v = hVar;
            hVar.f8655o.add(new b(this, this.f8629t));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <E extends IOException> E c(E e10) {
        E e11;
        Socket k10;
        byte[] bArr = jf.c.f7250a;
        h hVar = this.f8631v;
        if (hVar != null) {
            synchronized (hVar) {
                k10 = k();
            }
            if (this.f8631v == null) {
                if (k10 != null) {
                    jf.c.e(k10);
                }
                Objects.requireNonNull(this.f8626b);
            } else {
                if (!(k10 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f8632w && this.f8627c.i()) {
            e11 = new InterruptedIOException("timeout");
            if (e10 != null) {
                e11.initCause(e10);
            }
        } else {
            e11 = e10;
        }
        if (e10 != null) {
            n nVar = this.f8626b;
            e6.e.B(e11);
            Objects.requireNonNull(nVar);
        } else {
            Objects.requireNonNull(this.f8626b);
        }
        return e11;
    }

    public final void cancel() {
        Socket socket;
        if (!this.B) {
            this.B = true;
            c cVar = this.C;
            if (cVar != null) {
                cVar.f8605f.cancel();
            }
            h hVar = this.D;
            if (!(hVar == null || (socket = hVar.f8644b) == null)) {
                jf.c.e(socket);
            }
            Objects.requireNonNull(this.f8626b);
        }
    }

    public final Object clone() {
        return new e(this.E, this.F, this.G);
    }

    public final a0 d() {
        if (this.f8628s.compareAndSet(false, true)) {
            this.f8627c.h();
            h.a aVar = h.f10446c;
            this.f8629t = h.f10444a.g();
            Objects.requireNonNull(this.f8626b);
            try {
                l lVar = this.E.f6597a;
                synchronized (lVar) {
                    lVar.f6544d.add(this);
                }
                a0 h10 = h();
                l lVar2 = this.E.f6597a;
                Objects.requireNonNull(lVar2);
                lVar2.a(lVar2.f6544d, this);
                return h10;
            } catch (Throwable th2) {
                l lVar3 = this.E.f6597a;
                Objects.requireNonNull(lVar3);
                lVar3.a(lVar3.f6544d, this);
                throw th2;
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final x e() {
        return this.F;
    }

    public final boolean f() {
        return this.B;
    }

    public final void g(boolean z10) {
        c cVar;
        synchronized (this) {
            if (!this.A) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (cVar = this.C) != null) {
            cVar.f8605f.cancel();
            cVar.f8602c.i(cVar, true, true, (IOException) null);
        }
        this.f8633x = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p002if.a0 h() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if.v r0 = r11.E
            java.util.List<if.s> r0 = r0.f6599c
            nd.i.U0(r2, r0)
            nf.h r0 = new nf.h
            if.v r1 = r11.E
            r0.<init>(r1)
            r2.add(r0)
            nf.a r0 = new nf.a
            if.v r1 = r11.E
            if.k r1 = r1.f6606y
            r0.<init>(r1)
            r2.add(r0)
            kf.a r0 = new kf.a
            if.v r1 = r11.E
            java.util.Objects.requireNonNull(r1)
            r0.<init>()
            r2.add(r0)
            mf.a r0 = mf.a.f8595a
            r2.add(r0)
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x003f
            if.v r0 = r11.E
            java.util.List<if.s> r0 = r0.f6600s
            nd.i.U0(r2, r0)
        L_0x003f:
            nf.b r0 = new nf.b
            boolean r1 = r11.G
            r0.<init>(r1)
            r2.add(r0)
            nf.f r9 = new nf.f
            r3 = 0
            r4 = 0
            if.x r5 = r11.F
            if.v r0 = r11.E
            int r6 = r0.K
            int r7 = r0.L
            int r8 = r0.M
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            if.x r2 = r11.F     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            if.a0 r2 = r9.b(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            boolean r3 = r11.B     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            if (r3 != 0) goto L_0x006c
            r11.j(r1)
            return r2
        L_0x006c:
            jf.c.d(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            throw r2     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
        L_0x0077:
            r2 = move-exception
            goto L_0x008e
        L_0x0079:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.j(r0)     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0089
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x008e:
            if (r0 != 0) goto L_0x0093
            r11.j(r1)
        L_0x0093:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.e.h():if.a0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E i(mf.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            e6.e.D(r3, r0)
            mf.c r0 = r2.C
            boolean r3 = e6.e.r(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f8634y     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x0042
        L_0x001b:
            if (r5 == 0) goto L_0x0044
            boolean r1 = r2.z     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f8634y = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.z = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f8634y     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.z     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.z     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.A     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            r4 = r3
            r3 = r5
            goto L_0x0045
        L_0x0042:
            monitor-exit(r2)
            throw r3
        L_0x0044:
            r4 = r3
        L_0x0045:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            r2.C = r3
            mf.h r3 = r2.f8631v
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)
            int r5 = r3.f8652l     // Catch:{ all -> 0x0057 }
            int r5 = r5 + r0
            r3.f8652l = r5     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.c(r6)
            return r3
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.e.i(mf.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException j(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.A) {
                this.A = false;
                if (!this.f8634y && !this.z) {
                    z10 = true;
                }
            }
        }
        return z10 ? c(iOException) : iOException;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List, java.util.List<java.lang.ref.Reference<mf.e>>, java.util.ArrayList] */
    public final Socket k() {
        h hVar = this.f8631v;
        e6.e.B(hVar);
        byte[] bArr = jf.c.f7250a;
        ? r12 = hVar.f8655o;
        Iterator it = r12.iterator();
        boolean z10 = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (e6.e.r((e) ((Reference) it.next()).get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            r12.remove(i);
            this.f8631v = null;
            if (r12.isEmpty()) {
                hVar.f8656p = System.nanoTime();
                j jVar = this.f8625a;
                Objects.requireNonNull(jVar);
                byte[] bArr2 = jf.c.f7250a;
                if (hVar.i || jVar.f8663e == 0) {
                    hVar.i = true;
                    jVar.f8662d.remove(hVar);
                    if (jVar.f8662d.isEmpty()) {
                        jVar.f8660b.a();
                    }
                    z10 = true;
                } else {
                    jVar.f8660b.c(jVar.f8661c, 0);
                }
                if (z10) {
                    Socket socket = hVar.f8645c;
                    e6.e.B(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void s(p002if.e eVar) {
        a aVar;
        if (this.f8628s.compareAndSet(false, true)) {
            h.a aVar2 = h.f10446c;
            this.f8629t = h.f10444a.g();
            Objects.requireNonNull(this.f8626b);
            l lVar = this.E.f6597a;
            a aVar3 = new a(eVar);
            Objects.requireNonNull(lVar);
            synchronized (lVar) {
                lVar.f6542b.add(aVar3);
                if (!this.G) {
                    String a10 = aVar3.a();
                    Iterator<a> it = lVar.f6543c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = lVar.f6542b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                }
                                aVar = it2.next();
                                if (e6.e.r(aVar.a(), a10)) {
                                    break;
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (e6.e.r(aVar.a(), a10)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar3.f8635a = aVar.f8635a;
                    }
                }
            }
            lVar.c();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }
}
