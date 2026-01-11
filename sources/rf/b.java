package rf;

import android.net.http.X509TrustManagerExtensions;
import e6.e;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import tf.c;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f10768a;

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManagerExtensions f10769b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f10768a = x509TrustManager;
        this.f10769b = x509TrustManagerExtensions;
    }

    public final List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        e.D(list, "chain");
        e.D(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f10769b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            e.C(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f10768a == this.f10768a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10768a);
    }
}
