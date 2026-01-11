package mf;

import androidx.lifecycle.i0;
import com.google.android.gms.common.api.Api;
import e6.e;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jf.c;
import of.b;
import org.slf4j.helpers.MessageFormatter;
import p002if.a;
import p002if.a0;
import p002if.d;
import p002if.d0;
import p002if.n;
import p002if.p;
import p002if.r;
import p002if.w;
import p002if.x;
import p002if.z;
import pf.b;
import pf.f;
import pf.o;
import pf.q;
import qf.h;
import uf.b0;
import uf.c0;
import uf.u;
import uf.v;

public final class h extends f.d implements p002if.h {

    /* renamed from: b  reason: collision with root package name */
    public Socket f8644b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f8645c;

    /* renamed from: d  reason: collision with root package name */
    public p f8646d;

    /* renamed from: e  reason: collision with root package name */
    public w f8647e;

    /* renamed from: f  reason: collision with root package name */
    public f f8648f;
    public v g;

    /* renamed from: h  reason: collision with root package name */
    public u f8649h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8650j;

    /* renamed from: k  reason: collision with root package name */
    public int f8651k;

    /* renamed from: l  reason: collision with root package name */
    public int f8652l;

    /* renamed from: m  reason: collision with root package name */
    public int f8653m;

    /* renamed from: n  reason: collision with root package name */
    public int f8654n = 1;

    /* renamed from: o  reason: collision with root package name */
    public final List<Reference<e>> f8655o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public long f8656p = Long.MAX_VALUE;

    /* renamed from: q  reason: collision with root package name */
    public final d0 f8657q;

    public h(j jVar, d0 d0Var) {
        e.D(jVar, "connectionPool");
        e.D(d0Var, "route");
        this.f8657q = d0Var;
    }

    public final synchronized void a(f fVar, pf.u uVar) {
        e.D(fVar, "connection");
        e.D(uVar, "settings");
        this.f8654n = (uVar.f10052a & 16) != 0 ? uVar.f10053b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void b(q qVar) throws IOException {
        e.D(qVar, "stream");
        qVar.c(b.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015f A[EDGE_INSN: B:83:0x015f->B:76:0x015f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, int r18, int r19, boolean r20, p002if.d r21, p002if.n r22) {
        /*
            r16 = this;
            r7 = r16
            r8 = r21
            r9 = r22
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r0 = "call"
            e6.e.D(r8, r0)
            java.lang.String r0 = "eventListener"
            e6.e.D(r9, r0)
            if.w r0 = r7.f8647e
            r12 = 1
            if (r0 != 0) goto L_0x001b
            r0 = r12
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x016d
            if.d0 r0 = r7.f8657q
            if.a r0 = r0.f6493a
            java.util.List<if.i> r0 = r0.f6445c
            mf.b r13 = new mf.b
            r13.<init>(r0)
            if.d0 r1 = r7.f8657q
            if.a r1 = r1.f6493a
            javax.net.ssl.SSLSocketFactory r2 = r1.f6448f
            if (r2 != 0) goto L_0x006c
            if.i r1 = p002if.i.f6519f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005f
            if.d0 r0 = r7.f8657q
            if.a r0 = r0.f6493a
            if.r r0 = r0.f6443a
            java.lang.String r0 = r0.f6568e
            qf.h$a r1 = qf.h.f10446c
            qf.h r1 = qf.h.f10444a
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x004c
            goto L_0x0076
        L_0x004c:
            mf.k r1 = new mf.k
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = androidx.fragment.app.o.c(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x005f:
            mf.k r0 = new mf.k
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006c:
            java.util.List<if.w> r0 = r1.f6444b
            if.w r1 = p002if.w.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0160
        L_0x0076:
            r14 = 0
            r15 = r14
        L_0x0078:
            if.d0 r0 = r7.f8657q     // Catch:{ IOException -> 0x00f4 }
            if.a r1 = r0.f6493a     // Catch:{ IOException -> 0x00f4 }
            javax.net.ssl.SSLSocketFactory r1 = r1.f6448f     // Catch:{ IOException -> 0x00f4 }
            if (r1 == 0) goto L_0x008c
            java.net.Proxy r0 = r0.f6494b     // Catch:{ IOException -> 0x00f4 }
            java.net.Proxy$Type r0 = r0.type()     // Catch:{ IOException -> 0x00f4 }
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00f4 }
            if (r0 != r1) goto L_0x008c
            r0 = r12
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 == 0) goto L_0x00ad
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r22
            r1.f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f4 }
            java.net.Socket r0 = r7.f8644b     // Catch:{ IOException -> 0x00f4 }
            if (r0 != 0) goto L_0x00a3
            goto L_0x00c3
        L_0x00a3:
            r1 = r17
            r2 = r18
            goto L_0x00b4
        L_0x00a8:
            r1 = r17
            r2 = r18
            goto L_0x00f6
        L_0x00ad:
            r1 = r17
            r2 = r18
            r7.e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00f2 }
        L_0x00b4:
            r7.g(r13, r8, r9)     // Catch:{ IOException -> 0x00f2 }
            if.d0 r0 = r7.f8657q     // Catch:{ IOException -> 0x00f2 }
            java.net.InetSocketAddress r3 = r0.f6495c     // Catch:{ IOException -> 0x00f2 }
            java.net.Proxy r0 = r0.f6494b     // Catch:{ IOException -> 0x00f2 }
            e6.e.D(r3, r11)     // Catch:{ IOException -> 0x00f2 }
            e6.e.D(r0, r10)     // Catch:{ IOException -> 0x00f2 }
        L_0x00c3:
            if.d0 r0 = r7.f8657q
            if.a r1 = r0.f6493a
            javax.net.ssl.SSLSocketFactory r1 = r1.f6448f
            if (r1 == 0) goto L_0x00d6
            java.net.Proxy r0 = r0.f6494b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r12 = 0
        L_0x00d7:
            if (r12 == 0) goto L_0x00eb
            java.net.Socket r0 = r7.f8644b
            if (r0 == 0) goto L_0x00de
            goto L_0x00eb
        L_0x00de:
            mf.k r0 = new mf.k
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            long r0 = java.lang.System.nanoTime()
            r7.f8656p = r0
            return
        L_0x00f2:
            r0 = move-exception
            goto L_0x00f6
        L_0x00f4:
            r0 = move-exception
            goto L_0x00a8
        L_0x00f6:
            java.net.Socket r3 = r7.f8645c
            if (r3 == 0) goto L_0x00fd
            jf.c.e(r3)
        L_0x00fd:
            java.net.Socket r3 = r7.f8644b
            if (r3 == 0) goto L_0x0104
            jf.c.e(r3)
        L_0x0104:
            r7.f8645c = r14
            r7.f8644b = r14
            r7.g = r14
            r7.f8649h = r14
            r7.f8646d = r14
            r7.f8647e = r14
            r7.f8648f = r14
            r7.f8654n = r12
            if.d0 r3 = r7.f8657q
            java.net.InetSocketAddress r4 = r3.f6495c
            java.net.Proxy r3 = r3.f6494b
            e6.e.D(r4, r11)
            e6.e.D(r3, r10)
            if (r15 != 0) goto L_0x0128
            mf.k r15 = new mf.k
            r15.<init>(r0)
            goto L_0x012f
        L_0x0128:
            java.io.IOException r3 = r15.f8665b
            a.b.D(r3, r0)
            r15.f8664a = r0
        L_0x012f:
            if (r20 == 0) goto L_0x015f
            r13.f8598c = r12
            boolean r3 = r13.f8597b
            if (r3 != 0) goto L_0x0138
            goto L_0x015a
        L_0x0138:
            boolean r3 = r0 instanceof java.net.ProtocolException
            if (r3 == 0) goto L_0x013d
            goto L_0x015a
        L_0x013d:
            boolean r3 = r0 instanceof java.io.InterruptedIOException
            if (r3 == 0) goto L_0x0142
            goto L_0x015a
        L_0x0142:
            boolean r3 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L_0x014f
            java.lang.Throwable r3 = r0.getCause()
            boolean r3 = r3 instanceof java.security.cert.CertificateException
            if (r3 == 0) goto L_0x014f
            goto L_0x015a
        L_0x014f:
            boolean r3 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0154
            goto L_0x015a
        L_0x0154:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x015a
            r0 = r12
            goto L_0x015b
        L_0x015a:
            r0 = 0
        L_0x015b:
            if (r0 == 0) goto L_0x015f
            goto L_0x0078
        L_0x015f:
            throw r15
        L_0x0160:
            mf.k r0 = new mf.k
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x016d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.h.c(int, int, int, boolean, if.d, if.n):void");
    }

    public final void d(p002if.v vVar, d0 d0Var, IOException iOException) {
        e.D(vVar, "client");
        e.D(d0Var, "failedRoute");
        e.D(iOException, "failure");
        if (d0Var.f6494b.type() != Proxy.Type.DIRECT) {
            a aVar = d0Var.f6493a;
            aVar.f6451k.connectFailed(aVar.f6443a.h(), d0Var.f6494b.address(), iOException);
        }
        i0 i0Var = vVar.N;
        synchronized (i0Var) {
            ((Set) i0Var.f2124a).add(d0Var);
        }
    }

    public final void e(int i10, int i11, d dVar, n nVar) throws IOException {
        Socket socket;
        int i12;
        d0 d0Var = this.f8657q;
        Proxy proxy = d0Var.f6494b;
        a aVar = d0Var.f6493a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i12 = f.f8640a[type.ordinal()]) == 1 || i12 == 2)) {
            socket = aVar.f6447e.createSocket();
            e.B(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f8644b = socket;
        InetSocketAddress inetSocketAddress = this.f8657q.f6495c;
        Objects.requireNonNull(nVar);
        e.D(dVar, "call");
        e.D(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i11);
        try {
            h.a aVar2 = qf.h.f10446c;
            qf.h.f10444a.e(socket, this.f8657q.f6495c, i10);
            try {
                this.g = new v(uf.p.f(socket));
                this.f8649h = (u) uf.p.a(uf.p.d(socket));
            } catch (NullPointerException e10) {
                if (e.r(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            StringBuilder d10 = a.a.d("Failed to connect to ");
            d10.append(this.f8657q.f6495c);
            ConnectException connectException = new ConnectException(d10.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, d dVar, n nVar) throws IOException {
        x.a aVar = new x.a();
        aVar.e(this.f8657q.f6493a.f6443a);
        aVar.c("CONNECT", (z) null);
        aVar.b("Host", c.w(this.f8657q.f6493a.f6443a, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/4.9.3");
        x a10 = aVar.a();
        a0.a aVar2 = new a0.a();
        aVar2.f6462a = a10;
        aVar2.f(w.HTTP_1_1);
        aVar2.f6464c = 407;
        aVar2.f6465d = "Preemptive Authenticate";
        aVar2.g = c.f7252c;
        aVar2.f6470k = -1;
        aVar2.f6471l = -1;
        aVar2.f6467f.e("Proxy-Authenticate", "OkHttp-Preemptive");
        a0 a11 = aVar2.a();
        d0 d0Var = this.f8657q;
        d0Var.f6493a.i.b(d0Var, a11);
        r rVar = a10.f6627b;
        e(i10, i11, dVar, nVar);
        String str = "CONNECT " + c.w(rVar, true) + " HTTP/1.1";
        v vVar = this.g;
        e.B(vVar);
        u uVar = this.f8649h;
        e.B(uVar);
        of.b bVar = new of.b((p002if.v) null, this, vVar, uVar);
        c0 d10 = vVar.d();
        long j10 = (long) i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d10.g(j10);
        uVar.d().g((long) i12);
        bVar.k(a10.f6629d, str);
        bVar.g.flush();
        a0.a f10 = bVar.f(false);
        e.B(f10);
        f10.f6462a = a10;
        a0 a12 = f10.a();
        long k10 = c.k(a12);
        if (k10 != -1) {
            b0 j11 = bVar.j(k10);
            c.u(j11, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            ((b.d) j11).close();
        }
        int i13 = a12.f6455s;
        if (i13 != 200) {
            if (i13 == 407) {
                d0 d0Var2 = this.f8657q;
                d0Var2.f6493a.i.b(d0Var2, a12);
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder d11 = a.a.d("Unexpected response code for CONNECT: ");
            d11.append(a12.f6455s);
            throw new IOException(d11.toString());
        } else if (!vVar.f11989a.J() || !uVar.f11986a.J()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(mf.b r9, p002if.d r10, p002if.n r11) throws java.io.IOException {
        /*
            r8 = this;
            if.d0 r0 = r8.f8657q
            if.a r0 = r0.f6493a
            javax.net.ssl.SSLSocketFactory r1 = r0.f6448f
            if (r1 != 0) goto L_0x0025
            java.util.List<if.w> r9 = r0.f6444b
            if.w r10 = p002if.w.H2_PRIOR_KNOWLEDGE
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L_0x001c
            java.net.Socket r9 = r8.f8644b
            r8.f8645c = r9
            r8.f8647e = r10
            r8.m()
            return
        L_0x001c:
            java.net.Socket r9 = r8.f8644b
            r8.f8645c = r9
            if.w r9 = p002if.w.HTTP_1_1
            r8.f8647e = r9
            return
        L_0x0025:
            java.util.Objects.requireNonNull(r11)
            java.lang.String r11 = "call"
            e6.e.D(r10, r11)
            if.d0 r10 = r8.f8657q
            if.a r10 = r10.f6493a
            javax.net.ssl.SSLSocketFactory r11 = r10.f6448f
            r0 = 0
            e6.e.B(r11)     // Catch:{ all -> 0x01b2 }
            java.net.Socket r1 = r8.f8644b     // Catch:{ all -> 0x01b2 }
            if.r r2 = r10.f6443a     // Catch:{ all -> 0x01b2 }
            java.lang.String r3 = r2.f6568e     // Catch:{ all -> 0x01b2 }
            int r2 = r2.f6569f     // Catch:{ all -> 0x01b2 }
            r4 = 1
            java.net.Socket r11 = r11.createSocket(r1, r3, r2, r4)     // Catch:{ all -> 0x01b2 }
            if (r11 == 0) goto L_0x01aa
            javax.net.ssl.SSLSocket r11 = (javax.net.ssl.SSLSocket) r11     // Catch:{ all -> 0x01b2 }
            if.i r9 = r9.a(r11)     // Catch:{ all -> 0x01a7 }
            boolean r1 = r9.f6521b     // Catch:{ all -> 0x01a7 }
            if (r1 == 0) goto L_0x005d
            qf.h$a r1 = qf.h.f10446c     // Catch:{ all -> 0x01a7 }
            qf.h r1 = qf.h.f10444a     // Catch:{ all -> 0x01a7 }
            if.r r2 = r10.f6443a     // Catch:{ all -> 0x01a7 }
            java.lang.String r2 = r2.f6568e     // Catch:{ all -> 0x01a7 }
            java.util.List<if.w> r3 = r10.f6444b     // Catch:{ all -> 0x01a7 }
            r1.d(r11, r2, r3)     // Catch:{ all -> 0x01a7 }
        L_0x005d:
            r11.startHandshake()     // Catch:{ all -> 0x01a7 }
            javax.net.ssl.SSLSession r1 = r11.getSession()     // Catch:{ all -> 0x01a7 }
            if.p$a r2 = p002if.p.f6552e     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = "sslSocketSession"
            e6.e.C(r1, r3)     // Catch:{ all -> 0x01a7 }
            if.p r2 = r2.a(r1)     // Catch:{ all -> 0x01a7 }
            javax.net.ssl.HostnameVerifier r3 = r10.g     // Catch:{ all -> 0x01a7 }
            e6.e.B(r3)     // Catch:{ all -> 0x01a7 }
            if.r r5 = r10.f6443a     // Catch:{ all -> 0x01a7 }
            java.lang.String r5 = r5.f6568e     // Catch:{ all -> 0x01a7 }
            boolean r1 = r3.verify(r5, r1)     // Catch:{ all -> 0x01a7 }
            if (r1 != 0) goto L_0x0129
            java.util.List r9 = r2.b()     // Catch:{ all -> 0x01a7 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01a7 }
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x0109
            r0 = 0
            java.lang.Object r9 = r9.get(r0)     // Catch:{ all -> 0x01a7 }
            if (r9 != 0) goto L_0x0098
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r9.<init>(r10)     // Catch:{ all -> 0x01a7 }
            throw r9     // Catch:{ all -> 0x01a7 }
        L_0x0098:
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ all -> 0x01a7 }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r1.<init>()     // Catch:{ all -> 0x01a7 }
            java.lang.String r2 = "\n              |Hostname "
            r1.append(r2)     // Catch:{ all -> 0x01a7 }
            if.r r10 = r10.f6443a     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = r10.f6568e     // Catch:{ all -> 0x01a7 }
            r1.append(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = " not verified:\n              |    certificate: "
            r1.append(r10)     // Catch:{ all -> 0x01a7 }
            if.f$a r10 = p002if.f.f6497d     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = r10.a(r9)     // Catch:{ all -> 0x01a7 }
            r1.append(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = "\n              |    DN: "
            r1.append(r10)     // Catch:{ all -> 0x01a7 }
            java.security.Principal r10 = r9.getSubjectDN()     // Catch:{ all -> 0x01a7 }
            java.lang.String r2 = "cert.subjectDN"
            e6.e.C(r10, r2)     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x01a7 }
            r1.append(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = "\n              |    subjectAltNames: "
            r1.append(r10)     // Catch:{ all -> 0x01a7 }
            tf.d r10 = tf.d.f11606a     // Catch:{ all -> 0x01a7 }
            r2 = 7
            java.util.List r2 = r10.b(r9, r2)     // Catch:{ all -> 0x01a7 }
            r3 = 2
            java.util.List r9 = r10.b(r9, r3)     // Catch:{ all -> 0x01a7 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x01a7 }
            int r3 = r2.size()     // Catch:{ all -> 0x01a7 }
            int r4 = r9.size()     // Catch:{ all -> 0x01a7 }
            int r4 = r4 + r3
            r10.<init>(r4)     // Catch:{ all -> 0x01a7 }
            r10.addAll(r2)     // Catch:{ all -> 0x01a7 }
            r10.addAll(r9)     // Catch:{ all -> 0x01a7 }
            r1.append(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.String r9 = "\n              "
            r1.append(r9)     // Catch:{ all -> 0x01a7 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x01a7 }
            java.lang.String r9 = fe.g.U0(r9)     // Catch:{ all -> 0x01a7 }
            r0.<init>(r9)     // Catch:{ all -> 0x01a7 }
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x0109:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01a7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r0.<init>()     // Catch:{ all -> 0x01a7 }
            java.lang.String r1 = "Hostname "
            r0.append(r1)     // Catch:{ all -> 0x01a7 }
            if.r r10 = r10.f6443a     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = r10.f6568e     // Catch:{ all -> 0x01a7 }
            r0.append(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = " not verified (no certificates)"
            r0.append(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x01a7 }
            r9.<init>(r10)     // Catch:{ all -> 0x01a7 }
            throw r9     // Catch:{ all -> 0x01a7 }
        L_0x0129:
            if.f r1 = r10.f6449h     // Catch:{ all -> 0x01a7 }
            e6.e.B(r1)     // Catch:{ all -> 0x01a7 }
            if.p r3 = new if.p     // Catch:{ all -> 0x01a7 }
            if.e0 r4 = r2.f6554b     // Catch:{ all -> 0x01a7 }
            if.g r5 = r2.f6555c     // Catch:{ all -> 0x01a7 }
            java.util.List<java.security.cert.Certificate> r6 = r2.f6556d     // Catch:{ all -> 0x01a7 }
            mf.g r7 = new mf.g     // Catch:{ all -> 0x01a7 }
            r7.<init>(r1, r2, r10)     // Catch:{ all -> 0x01a7 }
            r3.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x01a7 }
            r8.f8646d = r3     // Catch:{ all -> 0x01a7 }
            if.r r10 = r10.f6443a     // Catch:{ all -> 0x01a7 }
            java.lang.String r10 = r10.f6568e     // Catch:{ all -> 0x01a7 }
            java.lang.String r2 = "hostname"
            e6.e.D(r10, r2)     // Catch:{ all -> 0x01a7 }
            java.util.Set<if.f$b> r10 = r1.f6498a     // Catch:{ all -> 0x01a7 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x01a7 }
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x01a7 }
            if (r1 != 0) goto L_0x0198
            boolean r9 = r9.f6521b     // Catch:{ all -> 0x01a7 }
            if (r9 == 0) goto L_0x0161
            qf.h$a r9 = qf.h.f10446c     // Catch:{ all -> 0x01a7 }
            qf.h r9 = qf.h.f10444a     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = r9.f(r11)     // Catch:{ all -> 0x01a7 }
        L_0x0161:
            r8.f8645c = r11     // Catch:{ all -> 0x01a7 }
            uf.b0 r9 = uf.p.f(r11)     // Catch:{ all -> 0x01a7 }
            uf.v r10 = new uf.v     // Catch:{ all -> 0x01a7 }
            r10.<init>(r9)     // Catch:{ all -> 0x01a7 }
            r8.g = r10     // Catch:{ all -> 0x01a7 }
            uf.z r9 = uf.p.d(r11)     // Catch:{ all -> 0x01a7 }
            uf.g r9 = uf.p.a(r9)     // Catch:{ all -> 0x01a7 }
            uf.u r9 = (uf.u) r9     // Catch:{ all -> 0x01a7 }
            r8.f8649h = r9     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x0183
            if.w$a r9 = p002if.w.Companion     // Catch:{ all -> 0x01a7 }
            if.w r9 = r9.a(r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x0185
        L_0x0183:
            if.w r9 = p002if.w.HTTP_1_1     // Catch:{ all -> 0x01a7 }
        L_0x0185:
            r8.f8647e = r9     // Catch:{ all -> 0x01a7 }
            qf.h$a r9 = qf.h.f10446c
            qf.h r9 = qf.h.f10444a
            r9.a(r11)
            if.w r9 = r8.f8647e
            if.w r10 = p002if.w.HTTP_2
            if (r9 != r10) goto L_0x0197
            r8.m()
        L_0x0197:
            return
        L_0x0198:
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x01a7 }
            if.f$b r9 = (p002if.f.b) r9     // Catch:{ all -> 0x01a7 }
            java.util.Objects.requireNonNull(r9)     // Catch:{ all -> 0x01a7 }
            java.lang.String r9 = "**."
            boolean unused = fe.k.d1(r0, r9, false)     // Catch:{ all -> 0x01a7 }
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x01a7:
            r9 = move-exception
            r0 = r11
            goto L_0x01b3
        L_0x01aa:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x01b2 }
            java.lang.String r10 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r9.<init>(r10)     // Catch:{ all -> 0x01b2 }
            throw r9     // Catch:{ all -> 0x01b2 }
        L_0x01b2:
            r9 = move-exception
        L_0x01b3:
            if (r0 == 0) goto L_0x01bc
            qf.h$a r10 = qf.h.f10446c
            qf.h r10 = qf.h.f10444a
            r10.a(r0)
        L_0x01bc:
            if (r0 == 0) goto L_0x01c1
            jf.c.e(r0)
        L_0x01c1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.h.g(mf.b, if.d, if.n):void");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<java.lang.ref.Reference<mf.e>>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (r9 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d9 A[SYNTHETIC, Splitter:B:53:0x00d9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(p002if.a r8, java.util.List<p002if.d0> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "hostname"
            java.lang.String r1 = "address"
            e6.e.D(r8, r1)
            byte[] r1 = jf.c.f7250a
            java.util.List<java.lang.ref.Reference<mf.e>> r1 = r7.f8655o
            int r1 = r1.size()
            int r2 = r7.f8654n
            r3 = 0
            if (r1 >= r2) goto L_0x0110
            boolean r1 = r7.i
            if (r1 == 0) goto L_0x001a
            goto L_0x0110
        L_0x001a:
            if.d0 r1 = r7.f8657q
            if.a r1 = r1.f6493a
            boolean r1 = r1.a(r8)
            if (r1 != 0) goto L_0x0025
            return r3
        L_0x0025:
            if.r r1 = r8.f6443a
            java.lang.String r1 = r1.f6568e
            if.d0 r2 = r7.f8657q
            if.a r2 = r2.f6493a
            if.r r2 = r2.f6443a
            java.lang.String r2 = r2.f6568e
            boolean r1 = e6.e.r(r1, r2)
            r2 = 1
            if (r1 == 0) goto L_0x0039
            return r2
        L_0x0039:
            pf.f r1 = r7.f8648f
            if (r1 != 0) goto L_0x003e
            return r3
        L_0x003e:
            if (r9 == 0) goto L_0x0110
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x0047
            goto L_0x0080
        L_0x0047:
            java.util.Iterator r9 = r9.iterator()
        L_0x004b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r9.next()
            if.d0 r1 = (p002if.d0) r1
            java.net.Proxy r4 = r1.f6494b
            java.net.Proxy$Type r4 = r4.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.DIRECT
            if (r4 != r5) goto L_0x007b
            if.d0 r4 = r7.f8657q
            java.net.Proxy r4 = r4.f6494b
            java.net.Proxy$Type r4 = r4.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.DIRECT
            if (r4 != r5) goto L_0x007b
            if.d0 r4 = r7.f8657q
            java.net.InetSocketAddress r4 = r4.f6495c
            java.net.InetSocketAddress r1 = r1.f6495c
            boolean r1 = e6.e.r(r4, r1)
            if (r1 == 0) goto L_0x007b
            r1 = r2
            goto L_0x007c
        L_0x007b:
            r1 = r3
        L_0x007c:
            if (r1 == 0) goto L_0x004b
            r9 = r2
            goto L_0x0081
        L_0x0080:
            r9 = r3
        L_0x0081:
            if (r9 != 0) goto L_0x0085
            goto L_0x0110
        L_0x0085:
            javax.net.ssl.HostnameVerifier r9 = r8.g
            tf.d r1 = tf.d.f11606a
            if (r9 == r1) goto L_0x008c
            return r3
        L_0x008c:
            if.r r9 = r8.f6443a
            byte[] r4 = jf.c.f7250a
            if.d0 r4 = r7.f8657q
            if.a r4 = r4.f6493a
            if.r r4 = r4.f6443a
            int r5 = r9.f6569f
            int r6 = r4.f6569f
            if (r5 == r6) goto L_0x009d
            goto L_0x00d5
        L_0x009d:
            java.lang.String r5 = r9.f6568e
            java.lang.String r4 = r4.f6568e
            boolean r4 = e6.e.r(r5, r4)
            if (r4 == 0) goto L_0x00a8
            goto L_0x00d3
        L_0x00a8:
            boolean r4 = r7.f8650j
            if (r4 != 0) goto L_0x00d5
            if.p r4 = r7.f8646d
            if (r4 == 0) goto L_0x00d5
            java.util.List r4 = r4.b()
            boolean r5 = r4.isEmpty()
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x00d0
            java.lang.String r9 = r9.f6568e
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r4, r5)
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            boolean r9 = r1.d(r9, r4)
            if (r9 == 0) goto L_0x00d0
            r9 = r2
            goto L_0x00d1
        L_0x00d0:
            r9 = r3
        L_0x00d1:
            if (r9 == 0) goto L_0x00d5
        L_0x00d3:
            r9 = r2
            goto L_0x00d6
        L_0x00d5:
            r9 = r3
        L_0x00d6:
            if (r9 != 0) goto L_0x00d9
            return r3
        L_0x00d9:
            if.f r9 = r8.f6449h     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            e6.e.B(r9)     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            if.r r8 = r8.f6443a     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            java.lang.String r8 = r8.f6568e     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            if.p r1 = r7.f8646d     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            e6.e.B(r1)     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            java.util.List r1 = r1.b()     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            e6.e.D(r8, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            java.lang.String r8 = "peerCertificates"
            e6.e.D(r1, r8)     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            java.util.Set<if.f$b> r8 = r9.f6498a     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            boolean r9 = r8.hasNext()     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            if (r9 != 0) goto L_0x0100
            return r2
        L_0x0100:
            java.lang.Object r8 = r8.next()     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            if.f$b r8 = (p002if.f.b) r8     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            java.util.Objects.requireNonNull(r8)     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            r8 = 0
            java.lang.String r9 = "**."
            boolean unused = fe.k.d1(r8, r9, false)     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
            throw r8     // Catch:{ SSLPeerUnverifiedException -> 0x0110 }
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.h.h(if.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = jf.c.f7250a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f8644b
            e6.e.B(r2)
            java.net.Socket r3 = r9.f8645c
            e6.e.B(r3)
            uf.v r4 = r9.g
            e6.e.B(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x007d
        L_0x002f:
            pf.f r2 = r9.f8648f
            r6 = 1
            if (r2 == 0) goto L_0x0051
            monitor-enter(r2)
            boolean r10 = r2.f9957v     // Catch:{ all -> 0x004e }
            if (r10 == 0) goto L_0x003b
            monitor-exit(r2)
            goto L_0x004d
        L_0x003b:
            long r3 = r2.E     // Catch:{ all -> 0x004e }
            long r7 = r2.D     // Catch:{ all -> 0x004e }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004b
            long r3 = r2.F     // Catch:{ all -> 0x004e }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004b
            monitor-exit(r2)
            goto L_0x004d
        L_0x004b:
            monitor-exit(r2)
            r5 = r6
        L_0x004d:
            return r5
        L_0x004e:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0051:
            monitor-enter(r9)
            long r7 = r9.f8656p     // Catch:{ all -> 0x007a }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0079
            if (r10 == 0) goto L_0x0079
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x0072 }
            boolean r0 = r4.J()     // Catch:{ all -> 0x0072 }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            r5 = r0
            goto L_0x0078
        L_0x0072:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
        L_0x0077:
            r5 = r6
        L_0x0078:
            return r5
        L_0x0079:
            return r6
        L_0x007a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.h.i(boolean):boolean");
    }

    public final boolean j() {
        return this.f8648f != null;
    }

    public final nf.d k(p002if.v vVar, nf.f fVar) throws SocketException {
        Socket socket = this.f8645c;
        e.B(socket);
        v vVar2 = this.g;
        e.B(vVar2);
        u uVar = this.f8649h;
        e.B(uVar);
        f fVar2 = this.f8648f;
        if (fVar2 != null) {
            return new o(vVar, this, fVar, fVar2);
        }
        socket.setSoTimeout(fVar.f9017h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar2.d().g((long) fVar.f9017h);
        uVar.d().g((long) fVar.i);
        return new of.b(vVar, this, vVar2, uVar);
    }

    public final synchronized void l() {
        this.i = true;
    }

    public final void m() throws IOException {
        String str;
        Socket socket = this.f8645c;
        e.B(socket);
        v vVar = this.g;
        e.B(vVar);
        u uVar = this.f8649h;
        e.B(uVar);
        socket.setSoTimeout(0);
        lf.d dVar = lf.d.f8287h;
        f.b bVar = new f.b(dVar);
        String str2 = this.f8657q.f6493a.f6443a.f6568e;
        e.D(str2, "peerName");
        bVar.f9963a = socket;
        if (bVar.f9969h) {
            str = c.g + ' ' + str2;
        } else {
            str = a8.a.c("MockWebServer ", str2);
        }
        bVar.f9964b = str;
        bVar.f9965c = vVar;
        bVar.f9966d = uVar;
        bVar.f9967e = this;
        bVar.g = 0;
        f fVar = new f(bVar);
        this.f8648f = fVar;
        f.c cVar = f.R;
        pf.u uVar2 = f.Q;
        this.f8654n = (uVar2.f10052a & 16) != 0 ? uVar2.f10053b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        pf.r rVar = fVar.N;
        synchronized (rVar) {
            if (rVar.f10040c) {
                throw new IOException("closed");
            } else if (rVar.f10043u) {
                Logger logger = pf.r.f10037v;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(c.i(">> CONNECTION " + pf.e.f9946a.i(), new Object[0]));
                }
                rVar.f10042t.e0(pf.e.f9946a);
                rVar.f10042t.flush();
            }
        }
        pf.r rVar2 = fVar.N;
        pf.u uVar3 = fVar.G;
        synchronized (rVar2) {
            e.D(uVar3, "settings");
            if (!rVar2.f10040c) {
                rVar2.e(0, Integer.bitCount(uVar3.f10052a) * 6, 4, 0);
                int i10 = 0;
                while (i10 < 10) {
                    boolean z = true;
                    if (((1 << i10) & uVar3.f10052a) == 0) {
                        z = false;
                    }
                    if (z) {
                        rVar2.f10042t.u(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                        rVar2.f10042t.A(uVar3.f10053b[i10]);
                    }
                    i10++;
                }
                rVar2.f10042t.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a10 = fVar.G.a();
        if (a10 != 65535) {
            fVar.N.y(0, (long) (a10 - 65535));
        }
        dVar.f().c(new lf.b(fVar.O, fVar.f9954s), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder d10 = a.a.d("Connection{");
        d10.append(this.f8657q.f6493a.f6443a.f6568e);
        d10.append(':');
        d10.append(this.f8657q.f6493a.f6443a.f6569f);
        d10.append(',');
        d10.append(" proxy=");
        d10.append(this.f8657q.f6494b);
        d10.append(" hostAddress=");
        d10.append(this.f8657q.f6495c);
        d10.append(" cipherSuite=");
        p pVar = this.f8646d;
        if (pVar == null || (obj = pVar.f6555c) == null) {
            obj = "none";
        }
        d10.append(obj);
        d10.append(" protocol=");
        d10.append(this.f8647e);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
