package rf;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p002if.w;
import qf.c;
import qf.h;
import rf.j;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10781a = new a();

    public static final class a implements j.a {
        public final boolean a(SSLSocket sSLSocket) {
            c.a aVar = c.f10426f;
            return c.f10425e && (sSLSocket instanceof BCSSLSocket);
        }

        public final k b(SSLSocket sSLSocket) {
            return new g();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(BuildConfig.FLAVOR))) {
            return applicationProtocol;
        }
        return null;
    }

    public final boolean c() {
        c.a aVar = c.f10426f;
        return c.f10425e;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        e.D(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            e.C(parameters, "sslParameters");
            Object[] array = ((ArrayList) h.f10446c.a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
