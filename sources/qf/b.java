package qf;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p002if.w;
import rf.f;
import rf.g;
import rf.h;
import rf.i;
import rf.j;
import rf.k;
import rf.l;
import tf.c;
import tf.e;

public final class b extends h {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f10420f;
    public static final a g = new a();

    /* renamed from: d  reason: collision with root package name */
    public final List<k> f10421d;

    /* renamed from: e  reason: collision with root package name */
    public final h f10422e;

    public static final class a {
    }

    /* renamed from: qf.b$b  reason: collision with other inner class name */
    public static final class C0202b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f10423a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f10424b;

        public C0202b(X509TrustManager x509TrustManager, Method method) {
            this.f10423a = x509TrustManager;
            this.f10424b = method;
        }

        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object invoke = this.f10424b.invoke(this.f10423a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0202b)) {
                return false;
            }
            C0202b bVar = (C0202b) obj;
            return e6.e.r(this.f10423a, bVar.f10423a) && e6.e.r(this.f10424b, bVar.f10424b);
        }

        public final int hashCode() {
            X509TrustManager x509TrustManager = this.f10423a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f10424b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("CustomTrustRootIndex(trustManager=");
            d10.append(this.f10423a);
            d10.append(", findByIssuerAndSignatureMethod=");
            d10.append(this.f10424b);
            d10.append(")");
            return d10.toString();
        }
    }

    static {
        boolean z = false;
        if (h.f10446c.c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f10420f = z;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        Method method3 = null;
        try {
            lVar = new l(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"), Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl"), Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        } catch (Exception e10) {
            h.f10444a.i("unable to load android socket classes", 5, e10);
            lVar = null;
        }
        kVarArr[0] = lVar;
        kVarArr[1] = new j(f.f10775f);
        kVarArr[2] = new j(i.f10785a);
        kVarArr[3] = new j(g.f10781a);
        List p02 = a.b.p0(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) p02).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).c()) {
                arrayList.add(next);
            }
        }
        this.f10421d = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method = cls.getMethod("open", new Class[]{String.class});
            method2 = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f10422e = new h(method3, method, method2);
    }

    public final c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        rf.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new rf.b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : new tf.a(c(x509TrustManager));
    }

    public final e c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            e6.e.C(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0202b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<rf.k>, java.util.ArrayList] */
    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        Object obj;
        e6.e.D(list, "protocols");
        Iterator it = this.f10421d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        e6.e.D(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<rf.k>, java.util.ArrayList] */
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f10421d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar.b(sSLSocket);
        }
        return null;
    }

    public final Object g() {
        h hVar = this.f10422e;
        Objects.requireNonNull(hVar);
        Method method = hVar.f10782a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = hVar.f10783b;
            e6.e.B(method2);
            method2.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        e6.e.D(str, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        e6.e.C(instance, "NetworkSecurityPolicy.getInstance()");
        return instance.isCleartextTrafficPermitted();
    }

    public final void k(String str, Object obj) {
        e6.e.D(str, "message");
        h hVar = this.f10422e;
        Objects.requireNonNull(hVar);
        boolean z = false;
        if (obj != null) {
            try {
                Method method = hVar.f10784c;
                e6.e.B(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            h.j(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
