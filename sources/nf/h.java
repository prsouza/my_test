package nf;

import com.google.android.gms.common.api.Api;
import e6.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import mf.c;
import mf.d;
import mf.j;
import mf.k;
import mf.l;
import nd.m;
import nd.o;
import p002if.a;
import p002if.a0;
import p002if.b0;
import p002if.d0;
import p002if.f;
import p002if.r;
import p002if.s;
import p002if.v;
import p002if.x;

public final class h implements s {

    /* renamed from: a  reason: collision with root package name */
    public final v f9021a;

    public h(v vVar) {
        e.D(vVar, "client");
        this.f9021a = vVar;
    }

    public final a0 a(s.a aVar) throws IOException {
        int i;
        List list;
        f fVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        f fVar2 = (f) aVar;
        x xVar = fVar2.f9016f;
        mf.e eVar = fVar2.f9012b;
        boolean z = true;
        List list2 = o.f8966a;
        int i10 = 0;
        a0 a0Var = null;
        x xVar2 = xVar;
        boolean z10 = true;
        while (true) {
            Objects.requireNonNull(eVar);
            e.D(xVar2, "request");
            if (eVar.f8633x == null ? z : false) {
                synchronized (eVar) {
                    if (!(eVar.z ^ z)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    } else if (!(eVar.f8634y ^ z)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (z10) {
                    j jVar = eVar.f8625a;
                    r rVar = xVar2.f6627b;
                    if (rVar.f6564a) {
                        v vVar = eVar.E;
                        SSLSocketFactory sSLSocketFactory2 = vVar.D;
                        if (sSLSocketFactory2 != null) {
                            HostnameVerifier hostnameVerifier2 = vVar.H;
                            fVar = vVar.I;
                            sSLSocketFactory = sSLSocketFactory2;
                            hostnameVerifier = hostnameVerifier2;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        fVar = null;
                    }
                    String str = rVar.f6568e;
                    int i11 = rVar.f6569f;
                    v vVar2 = eVar.E;
                    list = list2;
                    i = i10;
                    a aVar2 = r12;
                    a aVar3 = new a(str, i11, vVar2.z, vVar2.C, sSLSocketFactory, hostnameVerifier, fVar, vVar2.B, vVar2.G, vVar2.F, vVar2.A);
                    eVar.f8630u = new d(jVar, aVar2, eVar, eVar.f8626b);
                } else {
                    list = list2;
                    i = i10;
                }
                try {
                    if (!eVar.B) {
                        a0 b10 = fVar2.b(xVar2);
                        if (a0Var != null) {
                            a0.a aVar4 = new a0.a(b10);
                            a0.a aVar5 = new a0.a(a0Var);
                            aVar5.g = null;
                            a0 a10 = aVar5.a();
                            if (a10.f6458v == null) {
                                aVar4.f6469j = a10;
                                b10 = aVar4.a();
                            } else {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                        }
                        a0Var = b10;
                        c cVar = eVar.f8633x;
                        xVar2 = b(a0Var, cVar);
                        if (xVar2 == null) {
                            if (cVar != null && cVar.f8600a) {
                                if (!eVar.f8632w) {
                                    eVar.f8632w = true;
                                    eVar.f8627c.i();
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            eVar.g(false);
                            return a0Var;
                        }
                        b0 b0Var = a0Var.f6458v;
                        if (b0Var != null) {
                            jf.c.d(b0Var);
                        }
                        i10 = i + 1;
                        if (i10 <= 20) {
                            eVar.g(true);
                            list2 = list;
                            z10 = true;
                            z = true;
                        } else {
                            throw new ProtocolException("Too many follow-up requests: " + i10);
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (k e10) {
                    List list3 = list;
                    k kVar = e10;
                    if (c(kVar.f8664a, eVar, xVar2, false)) {
                        List e12 = m.e1(list3, kVar.f8665b);
                        eVar.g(true);
                        z = true;
                        i10 = i;
                        list2 = e12;
                        z10 = false;
                    } else {
                        IOException iOException = kVar.f8665b;
                        jf.c.A(iOException, list3);
                        throw iOException;
                    }
                } catch (IOException e11) {
                    IOException iOException2 = e11;
                    if (c(iOException2, eVar, xVar2, !(iOException2 instanceof pf.a))) {
                        list2 = m.e1(list, iOException2);
                        eVar.g(true);
                        z = true;
                        i10 = i;
                        z10 = false;
                    } else {
                        jf.c.A(iOException2, list);
                        throw iOException2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    eVar.g(true);
                    throw th;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r12.f8601b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p002if.x b(p002if.a0 r11, mf.c r12) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            if (r12 == 0) goto L_0x000a
            mf.h r1 = r12.f8601b
            if (r1 == 0) goto L_0x000a
            if.d0 r1 = r1.f8657q
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            int r2 = r11.f6455s
            if.x r3 = r11.f6452a
            java.lang.String r3 = r3.f6628c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00b1
            if (r2 == r5) goto L_0x00b1
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00a9
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0080
            r12 = 503(0x1f7, float:7.05E-43)
            if (r2 == r12) goto L_0x006a
            r12 = 407(0x197, float:5.7E-43)
            if (r2 == r12) goto L_0x004d
            r12 = 408(0x198, float:5.72E-43)
            if (r2 == r12) goto L_0x0033
            switch(r2) {
                case 300: goto L_0x00b1;
                case 301: goto L_0x00b1;
                case 302: goto L_0x00b1;
                case 303: goto L_0x00b1;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r0
        L_0x0033:
            if.v r1 = r10.f9021a
            boolean r1 = r1.f6602u
            if (r1 != 0) goto L_0x003a
            return r0
        L_0x003a:
            if.a0 r1 = r11.f6461y
            if (r1 == 0) goto L_0x0043
            int r1 = r1.f6455s
            if (r1 != r12) goto L_0x0043
            return r0
        L_0x0043:
            int r12 = r10.d(r11, r4)
            if (r12 <= 0) goto L_0x004a
            return r0
        L_0x004a:
            if.x r11 = r11.f6452a
            return r11
        L_0x004d:
            e6.e.B(r1)
            java.net.Proxy r12 = r1.f6494b
            java.net.Proxy$Type r12 = r12.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP
            if (r12 != r2) goto L_0x0062
            if.v r12 = r10.f9021a
            if.b r12 = r12.B
            r12.b(r1, r11)
            return r0
        L_0x0062:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r12 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r11.<init>(r12)
            throw r11
        L_0x006a:
            if.a0 r1 = r11.f6461y
            if (r1 == 0) goto L_0x0073
            int r1 = r1.f6455s
            if (r1 != r12) goto L_0x0073
            return r0
        L_0x0073:
            r12 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r10.d(r11, r12)
            if (r12 != 0) goto L_0x007f
            if.x r11 = r11.f6452a
            return r11
        L_0x007f:
            return r0
        L_0x0080:
            if (r12 == 0) goto L_0x00a8
            mf.d r1 = r12.f8604e
            if.a r1 = r1.f8623h
            if.r r1 = r1.f6443a
            java.lang.String r1 = r1.f6568e
            mf.h r2 = r12.f8601b
            if.d0 r2 = r2.f8657q
            if.a r2 = r2.f6493a
            if.r r2 = r2.f6443a
            java.lang.String r2 = r2.f6568e
            boolean r1 = e6.e.r(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            mf.h r12 = r12.f8601b
            monitor-enter(r12)
            r12.f8650j = r7     // Catch:{ all -> 0x00a5 }
            monitor-exit(r12)
            if.x r11 = r11.f6452a
            return r11
        L_0x00a5:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x00a8:
            return r0
        L_0x00a9:
            if.v r12 = r10.f9021a
            if.b r12 = r12.f6603v
            r12.b(r1, r11)
            return r0
        L_0x00b1:
            if.v r12 = r10.f9021a
            boolean r12 = r12.f6604w
            if (r12 != 0) goto L_0x00b9
            goto L_0x014f
        L_0x00b9:
            java.lang.String r12 = "Location"
            java.lang.String r12 = p002if.a0.a(r11, r12)
            if (r12 == 0) goto L_0x014f
            if.x r1 = r11.f6452a
            if.r r1 = r1.f6627b
            java.util.Objects.requireNonNull(r1)
            if.r$a r12 = r1.f(r12)
            if (r12 == 0) goto L_0x00d3
            if.r r12 = r12.a()
            goto L_0x00d4
        L_0x00d3:
            r12 = r0
        L_0x00d4:
            if (r12 == 0) goto L_0x014f
            java.lang.String r1 = r12.f6565b
            if.x r2 = r11.f6452a
            if.r r2 = r2.f6627b
            java.lang.String r2 = r2.f6565b
            boolean r1 = e6.e.r(r1, r2)
            if (r1 != 0) goto L_0x00eb
            if.v r1 = r10.f9021a
            boolean r1 = r1.f6605x
            if (r1 != 0) goto L_0x00eb
            goto L_0x014f
        L_0x00eb:
            if.x r1 = r11.f6452a
            if.x$a r2 = new if.x$a
            r2.<init>(r1)
            boolean r1 = c3.k.D0(r3)
            if (r1 == 0) goto L_0x0138
            int r1 = r11.f6455s
            java.lang.String r8 = "PROPFIND"
            boolean r9 = e6.e.r(r3, r8)
            if (r9 != 0) goto L_0x0106
            if (r1 == r5) goto L_0x0106
            if (r1 != r6) goto L_0x0107
        L_0x0106:
            r4 = r7
        L_0x0107:
            boolean r8 = e6.e.r(r3, r8)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0118
            if (r1 == r5) goto L_0x0118
            if (r1 == r6) goto L_0x0118
            java.lang.String r1 = "GET"
            r2.c(r1, r0)
            goto L_0x0121
        L_0x0118:
            if (r4 == 0) goto L_0x011e
            if.x r0 = r11.f6452a
            if.z r0 = r0.f6630e
        L_0x011e:
            r2.c(r3, r0)
        L_0x0121:
            if (r4 != 0) goto L_0x0138
            java.lang.String r0 = "Transfer-Encoding"
            if.q$a r1 = r2.f6634c
            r1.d(r0)
            java.lang.String r0 = "Content-Length"
            if.q$a r1 = r2.f6634c
            r1.d(r0)
            java.lang.String r0 = "Content-Type"
            if.q$a r1 = r2.f6634c
            r1.d(r0)
        L_0x0138:
            if.x r11 = r11.f6452a
            if.r r11 = r11.f6627b
            boolean r11 = jf.c.a(r11, r12)
            if (r11 != 0) goto L_0x0149
            java.lang.String r11 = "Authorization"
            if.q$a r0 = r2.f6634c
            r0.d(r11)
        L_0x0149:
            r2.f6632a = r12
            if.x r0 = r2.a()
        L_0x014f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.h.b(if.a0, mf.c):if.x");
    }

    public final boolean c(IOException iOException, mf.e eVar, x xVar, boolean z) {
        boolean z10;
        l lVar;
        mf.h hVar;
        if (!this.f9021a.f6602u) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        d dVar = eVar.f8630u;
        e.B(dVar);
        int i = dVar.f8619c;
        if (i == 0 && dVar.f8620d == 0 && dVar.f8621e == 0) {
            z10 = false;
        } else {
            if (dVar.f8622f == null) {
                d0 d0Var = null;
                if (i <= 1 && dVar.f8620d <= 1 && dVar.f8621e <= 0 && (hVar = dVar.i.f8631v) != null) {
                    synchronized (hVar) {
                        if (hVar.f8651k == 0) {
                            if (jf.c.a(hVar.f8657q.f6493a.f6443a, dVar.f8623h.f6443a)) {
                                d0Var = hVar.f8657q;
                            }
                        }
                    }
                }
                if (d0Var != null) {
                    dVar.f8622f = d0Var;
                } else {
                    l.a aVar = dVar.f8617a;
                    if ((aVar == null || !aVar.a()) && (lVar = dVar.f8618b) != null) {
                        z10 = lVar.a();
                    }
                }
            }
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final int d(a0 a0Var, int i) {
        String a10 = a0.a(a0Var, "Retry-After");
        if (a10 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        e.C(compile, "compile(pattern)");
        if (!compile.matcher(a10).matches()) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Integer valueOf = Integer.valueOf(a10);
        e.C(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }
}
