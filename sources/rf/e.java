package rf;

import fe.k;
import javax.net.ssl.SSLSocket;
import rf.j;

public final class e implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10774a = "com.google.android.gms.org.conscrypt";

    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return k.d1(name, this.f10774a + '.', false);
    }

    public final k b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!e6.e.r(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
