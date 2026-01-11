package qf;

import a.b;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import e6.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p002if.w;
import rf.f;
import rf.g;
import rf.i;
import rf.j;
import rf.k;
import tf.c;

public final class a extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10417e = (h.f10446c.c() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: f  reason: collision with root package name */
    public static final C0201a f10418f = new C0201a();

    /* renamed from: d  reason: collision with root package name */
    public final List<k> f10419d;

    /* renamed from: qf.a$a  reason: collision with other inner class name */
    public static final class C0201a {
    }

    public a() {
        k[] kVarArr = new k[4];
        kVarArr[0] = e.r("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new rf.a() : null;
        kVarArr[1] = new j(f.f10775f);
        kVarArr[2] = new j(i.f10785a);
        kVarArr[3] = new j(g.f10781a);
        List p02 = b.p0(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) p02).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).c()) {
                arrayList.add(next);
            }
        }
        this.f10419d = arrayList;
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

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<rf.k>, java.util.ArrayList] */
    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        Object obj;
        e.D(list, "protocols");
        Iterator it = this.f10419d.iterator();
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

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<rf.k>, java.util.ArrayList] */
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f10419d.iterator();
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

    public final boolean h(String str) {
        e.D(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
