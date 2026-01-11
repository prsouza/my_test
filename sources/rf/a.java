package rf;

import android.net.ssl.SSLSockets;
import android.os.Build;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p002if.w;
import qf.h;

public final class a implements k {
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(BuildConfig.FLAVOR))) {
            return applicationProtocol;
        }
        return null;
    }

    public final boolean c() {
        return h.f10446c.c() && Build.VERSION.SDK_INT >= 29;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        e.D(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            e.C(sSLParameters, "sslParameters");
            Object[] array = ((ArrayList) h.f10446c.a(list)).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
