package qf;

import e6.e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import nd.g;
import p002if.v;
import p002if.w;
import tf.b;
import tf.c;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static volatile h f10444a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f10445b = Logger.getLogger(v.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final a f10446c;

    public static final class a {
        public final List<String> a(List<? extends w> list) {
            e.D(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((w) next) != w.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(g.S0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((w) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] b(List<? extends w> list) {
            e.D(list, "protocols");
            uf.e eVar = new uf.e();
            Iterator it = ((ArrayList) a(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                eVar.y0(str.length());
                eVar.D0(str);
            }
            return eVar.L(eVar.f11952b);
        }

        public final boolean c() {
            return e.r("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: qf.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: qf.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: qf.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: qf.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: qf.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: qf.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0120, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L_0x0183;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0187  */
    static {
        /*
            qf.h$a r0 = new qf.h$a
            r0.<init>()
            f10446c = r0
            boolean r0 = r0.c()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0088
            rf.c r0 = rf.c.f10772c
            java.util.Map<java.lang.String, java.lang.String> r0 = rf.c.f10771b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = rf.c.f10770a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "logger"
            e6.e.C(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x0051
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x005d
        L_0x0051:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x005b
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x005d
        L_0x005b:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x005d:
            r4.setLevel(r3)
            rf.d r3 = rf.d.f10773a
            r4.addHandler(r3)
            goto L_0x001b
        L_0x0066:
            qf.a$a r0 = qf.a.f10418f
            boolean r0 = qf.a.f10417e
            if (r0 == 0) goto L_0x0072
            qf.a r0 = new qf.a
            r0.<init>()
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            goto L_0x018c
        L_0x0077:
            qf.b$a r0 = qf.b.g
            boolean r0 = qf.b.f10420f
            if (r0 == 0) goto L_0x0082
            qf.b r1 = new qf.b
            r1.<init>()
        L_0x0082:
            e6.e.B(r1)
        L_0x0085:
            r0 = r1
            goto L_0x018c
        L_0x0088:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            e6.e.C(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = e6.e.r(r4, r0)
            if (r0 == 0) goto L_0x00b0
            qf.d$a r0 = qf.d.f10429f
            boolean r0 = qf.d.f10428e
            if (r0 == 0) goto L_0x00ab
            qf.d r0 = new qf.d
            r0.<init>()
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            if (r0 == 0) goto L_0x00b0
            goto L_0x018c
        L_0x00b0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            e6.e.C(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = e6.e.r(r4, r0)
            if (r0 == 0) goto L_0x00d6
            qf.c$a r0 = qf.c.f10426f
            boolean r0 = qf.c.f10425e
            if (r0 == 0) goto L_0x00d1
            qf.c r0 = new qf.c
            r0.<init>()
            goto L_0x00d2
        L_0x00d1:
            r0 = r1
        L_0x00d2:
            if (r0 == 0) goto L_0x00d6
            goto L_0x018c
        L_0x00d6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            e6.e.C(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = e6.e.r(r3, r0)
            if (r0 == 0) goto L_0x00fc
            qf.g$a r0 = qf.g.f10442f
            boolean r0 = qf.g.f10441e
            if (r0 == 0) goto L_0x00f7
            qf.g r0 = new qf.g
            r0.<init>()
            goto L_0x00f8
        L_0x00f7:
            r0 = r1
        L_0x00f8:
            if (r0 == 0) goto L_0x00fc
            goto L_0x018c
        L_0x00fc:
            qf.f$a r0 = qf.f.f10440e
            boolean r0 = qf.f.f10439d
            if (r0 == 0) goto L_0x0108
            qf.f r0 = new qf.f
            r0.<init>()
            goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            if (r0 == 0) goto L_0x010d
            goto L_0x018c
        L_0x010d:
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            java.lang.String r3 = "jvmVersion"
            e6.e.C(r0, r3)     // Catch:{ NumberFormatException -> 0x0123 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0123 }
            r3 = 9
            if (r0 < r3) goto L_0x0123
            goto L_0x0183
        L_0x0123:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            qf.e r0 = new qf.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "putMethod"
            e6.e.C(r7, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "getMethod"
            e6.e.C(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "removeMethod"
            e6.e.C(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "clientProviderClass"
            e6.e.C(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "serverProviderClass"
            e6.e.C(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r1 = r0
        L_0x0183:
            if (r1 == 0) goto L_0x0187
            goto L_0x0085
        L_0x0187:
            qf.h r0 = new qf.h
            r0.<init>()
        L_0x018c:
            f10444a = r0
            java.lang.Class<if.v> r0 = p002if.v.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f10445b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.h.<clinit>():void");
    }

    public static /* synthetic */ void j(h hVar, String str, int i, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i = 4;
        }
        hVar.i(str, i, (Throwable) null);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public c b(X509TrustManager x509TrustManager) {
        return new tf.a(c(x509TrustManager));
    }

    public tf.e c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        e.C(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<w> list) {
        e.D(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        e.D(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f10445b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        e.D(str, "hostname");
        return true;
    }

    public final void i(String str, int i, Throwable th2) {
        e.D(str, "message");
        f10445b.log(i == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void k(String str, Object obj) {
        e.D(str, "message");
        if (obj == null) {
            str = a8.a.c(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        e.C(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l10 = l();
            l10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l10.getSocketFactory();
            e.C(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        e.B(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder d10 = a.a.d("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        e.C(arrays, "java.util.Arrays.toString(this)");
        d10.append(arrays);
        throw new IllegalStateException(d10.toString().toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
