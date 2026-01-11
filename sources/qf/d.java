package qf;

import e6.e;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p002if.w;

public final class d extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10428e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f10429f;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f10430d;

    public static final class a {
        public final boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != 2) {
                if (version.major() > 2) {
                    return true;
                }
                return false;
            } else if (version.minor() != 1) {
                if (version.minor() > 1) {
                    return true;
                }
                return false;
            } else if (version.patch() >= 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10431a = new b();
    }

    static {
        a aVar = new a();
        f10429f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable() && aVar.a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f10428e = z;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        e.C(newProvider, "Conscrypt.newProvider()");
        this.f10430d = newProvider;
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        e.D(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) h.f10446c.a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f10430d);
        e.C(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext instance = SSLContext.getInstance("TLS", this.f10430d);
        e.C(instance, "SSLContext.getInstance(\"TLS\", provider)");
        instance.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        e.C(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public final X509TrustManager n() {
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
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.f10431a);
            return x509TrustManager;
        }
        StringBuilder d10 = a.a.d("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        e.C(arrays, "java.util.Arrays.toString(this)");
        d10.append(arrays);
        throw new IllegalStateException(d10.toString().toString());
    }
}
