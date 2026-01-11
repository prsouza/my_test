package qf;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p002if.w;

public final class c extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10425e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f10426f;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f10427d = new BouncyCastleJsseProvider();

    public static final class a {
    }

    static {
        a aVar = new a();
        f10426f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f10425e = z;
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        e.D(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> a10 = h.f10446c.a(list);
            e.C(parameters, "sslParameters");
            Object[] array = ((ArrayList) a10).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(BuildConfig.FLAVOR))) {
            return null;
        }
        return applicationProtocol;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f10427d);
        e.C(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public final X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
}
