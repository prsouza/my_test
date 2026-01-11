package rf;

import e6.e;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p002if.w;

public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public k f10786a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10787b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        e.D(aVar, "socketAdapterFactory");
        this.f10787b = aVar;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f10787b.a(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        k e10 = e(sSLSocket);
        if (e10 != null) {
            return e10.b(sSLSocket);
        }
        return null;
    }

    public final boolean c() {
        return true;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        e.D(list, "protocols");
        k e10 = e(sSLSocket);
        if (e10 != null) {
            e10.d(sSLSocket, str, list);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        if (this.f10786a == null && this.f10787b.a(sSLSocket)) {
            this.f10786a = this.f10787b.b(sSLSocket);
        }
        return this.f10786a;
    }
}
