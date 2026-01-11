package rf;

import e6.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p002if.w;
import qf.d;
import qf.h;
import rf.j;

public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10785a = new a();

    public static final class a implements j.a {
        public final boolean a(SSLSocket sSLSocket) {
            d.a aVar = d.f10429f;
            return d.f10428e && Conscrypt.isConscrypt(sSLSocket);
        }

        public final k b(SSLSocket sSLSocket) {
            return new i();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final boolean c() {
        d.a aVar = d.f10429f;
        return d.f10428e;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        e.D(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) h.f10446c.a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
