package pf;

import com.google.android.gms.common.internal.ImagesContract;
import e6.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jf.c;
import mf.h;
import nf.d;
import nf.f;
import p002if.a0;
import p002if.r;
import p002if.v;
import p002if.w;
import p002if.x;
import pf.q;
import uf.b0;
import uf.i;
import uf.z;

public final class o implements d {
    public static final List<String> g = c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f9995h = c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public volatile q f9996a;

    /* renamed from: b  reason: collision with root package name */
    public final w f9997b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f9998c;

    /* renamed from: d  reason: collision with root package name */
    public final h f9999d;

    /* renamed from: e  reason: collision with root package name */
    public final f f10000e;

    /* renamed from: f  reason: collision with root package name */
    public final f f10001f;

    public o(v vVar, h hVar, f fVar, f fVar2) {
        e.D(hVar, "connection");
        this.f9999d = hVar;
        this.f10000e = fVar;
        this.f10001f = fVar2;
        List<w> list = vVar.G;
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f9997b = !list.contains(wVar) ? w.HTTP_2 : wVar;
    }

    public final long a(a0 a0Var) {
        if (!nf.e.a(a0Var)) {
            return 0;
        }
        return c.k(a0Var);
    }

    public final void b() {
        q qVar = this.f9996a;
        e.B(qVar);
        ((q.a) qVar.g()).close();
    }

    public final b0 c(a0 a0Var) {
        q qVar = this.f9996a;
        e.B(qVar);
        return qVar.g;
    }

    public final void cancel() {
        this.f9998c = true;
        q qVar = this.f9996a;
        if (qVar != null) {
            qVar.e(b.CANCEL);
        }
    }

    public final void d() {
        this.f10001f.flush();
    }

    public final void e(x xVar) {
        int i;
        q qVar;
        if (this.f9996a == null) {
            boolean z = false;
            boolean z10 = xVar.f6630e != null;
            p002if.q qVar2 = xVar.f6629d;
            ArrayList arrayList = new ArrayList((qVar2.f6560a.length / 2) + 4);
            arrayList.add(new c(c.f9924f, xVar.f6628c));
            i iVar = c.g;
            r rVar = xVar.f6627b;
            e.D(rVar, ImagesContract.URL);
            String b10 = rVar.b();
            String d10 = rVar.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            arrayList.add(new c(iVar, b10));
            String d11 = xVar.f6629d.d("Host");
            if (d11 != null) {
                arrayList.add(new c(c.i, d11));
            }
            arrayList.add(new c(c.f9925h, xVar.f6627b.f6565b));
            int length = qVar2.f6560a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                String e10 = qVar2.e(i10);
                Locale locale = Locale.US;
                e.C(locale, "Locale.US");
                Objects.requireNonNull(e10, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = e10.toLowerCase(locale);
                e.C(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!g.contains(lowerCase) || (e.r(lowerCase, "te") && e.r(qVar2.h(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, qVar2.h(i10)));
                }
            }
            f fVar = this.f10001f;
            Objects.requireNonNull(fVar);
            boolean z11 = !z10;
            synchronized (fVar.N) {
                synchronized (fVar) {
                    if (fVar.f9956u > 1073741823) {
                        fVar.t(b.REFUSED_STREAM);
                    }
                    if (!fVar.f9957v) {
                        i = fVar.f9956u;
                        fVar.f9956u = i + 2;
                        qVar = new q(i, fVar, z11, false, (p002if.q) null);
                        if (!z10 || fVar.K >= fVar.L || qVar.f10016c >= qVar.f10017d) {
                            z = true;
                        }
                        if (qVar.i()) {
                            fVar.f9953c.put(Integer.valueOf(i), qVar);
                        }
                    } else {
                        throw new a();
                    }
                }
                fVar.N.s(z11, i, arrayList);
            }
            if (z) {
                fVar.N.flush();
            }
            this.f9996a = qVar;
            if (!this.f9998c) {
                q qVar3 = this.f9996a;
                e.B(qVar3);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                qVar3.i.g((long) this.f10000e.f9017h);
                q qVar4 = this.f9996a;
                e.B(qVar4);
                qVar4.f10021j.g((long) this.f10000e.i);
                return;
            }
            q qVar5 = this.f9996a;
            e.B(qVar5);
            qVar5.e(b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f3, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        r0.i.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f9, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p002if.a0.a f(boolean r12) {
        /*
            r11 = this;
            pf.q r0 = r11.f9996a
            e6.e.B(r0)
            monitor-enter(r0)
            pf.q$c r1 = r0.i     // Catch:{ all -> 0x00fa }
            r1.h()     // Catch:{ all -> 0x00fa }
        L_0x000b:
            java.util.ArrayDeque<if.q> r1 = r0.f10018e     // Catch:{ all -> 0x00f3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x001b
            pf.b r1 = r0.f10022k     // Catch:{ all -> 0x00f3 }
            if (r1 != 0) goto L_0x001b
            r0.k()     // Catch:{ all -> 0x00f3 }
            goto L_0x000b
        L_0x001b:
            pf.q$c r1 = r0.i     // Catch:{ all -> 0x00fa }
            r1.l()     // Catch:{ all -> 0x00fa }
            java.util.ArrayDeque<if.q> r1 = r0.f10018e     // Catch:{ all -> 0x00fa }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00fa }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00e3
            java.util.ArrayDeque<if.q> r1 = r0.f10018e     // Catch:{ all -> 0x00fa }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = "headersQueue.removeFirst()"
            e6.e.C(r1, r2)     // Catch:{ all -> 0x00fa }
            if.q r1 = (p002if.q) r1     // Catch:{ all -> 0x00fa }
            monitor-exit(r0)
            if.w r0 = r11.f9997b
            java.lang.String r2 = "protocol"
            e6.e.D(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.lang.String[] r3 = r1.f6560a
            int r3 = r3.length
            int r3 = r3 / 2
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
        L_0x004f:
            if (r6 >= r3) goto L_0x009c
            java.lang.String r8 = r1.e(r6)
            java.lang.String r9 = r1.h(r6)
            java.lang.String r10 = ":status"
            boolean r10 = e6.e.r(r8, r10)
            if (r10 == 0) goto L_0x0079
            nf.i$a r7 = nf.i.f9022d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "HTTP/1.1 "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            nf.i r7 = r7.a(r8)
            goto L_0x0099
        L_0x0079:
            java.util.List<java.lang.String> r10 = f9995h
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L_0x0099
            java.lang.String r10 = "name"
            e6.e.D(r8, r10)
            java.lang.String r10 = "value"
            e6.e.D(r9, r10)
            r2.add(r8)
            java.lang.CharSequence r8 = fe.o.D1(r9)
            java.lang.String r8 = r8.toString()
            r2.add(r8)
        L_0x0099:
            int r6 = r6 + 1
            goto L_0x004f
        L_0x009c:
            if (r7 == 0) goto L_0x00db
            if.a0$a r1 = new if.a0$a
            r1.<init>()
            r1.f6463b = r0
            int r0 = r7.f9024b
            r1.f6464c = r0
            java.lang.String r0 = r7.f9025c
            r1.e(r0)
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r0, r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if.q$a r2 = new if.q$a
            r2.<init>()
            java.util.List<java.lang.String> r3 = r2.f6561a
            java.lang.String r4 = "<this>"
            e6.e.D(r3, r4)
            java.util.List r0 = nd.d.D(r0)
            r3.addAll(r0)
            r1.f6467f = r2
            if (r12 == 0) goto L_0x00d9
            int r12 = r1.f6464c
            r0 = 100
            if (r12 != r0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r5 = r1
        L_0x00da:
            return r5
        L_0x00db:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r12.<init>(r0)
            throw r12
        L_0x00e3:
            java.io.IOException r12 = r0.f10023l     // Catch:{ all -> 0x00fa }
            if (r12 == 0) goto L_0x00e8
            goto L_0x00f2
        L_0x00e8:
            pf.v r12 = new pf.v     // Catch:{ all -> 0x00fa }
            pf.b r1 = r0.f10022k     // Catch:{ all -> 0x00fa }
            e6.e.B(r1)     // Catch:{ all -> 0x00fa }
            r12.<init>(r1)     // Catch:{ all -> 0x00fa }
        L_0x00f2:
            throw r12     // Catch:{ all -> 0x00fa }
        L_0x00f3:
            r12 = move-exception
            pf.q$c r1 = r0.i     // Catch:{ all -> 0x00fa }
            r1.l()     // Catch:{ all -> 0x00fa }
            throw r12     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.o.f(boolean):if.a0$a");
    }

    public final z g(x xVar, long j10) {
        q qVar = this.f9996a;
        e.B(qVar);
        return qVar.g();
    }

    public final h h() {
        return this.f9999d;
    }
}
