package rf;

import e6.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p002if.w;
import qf.b;
import qf.h;

public class f implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final e f10775f = new e();
    public static final a g = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Method f10776a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f10777b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f10778c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f10779d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<? super SSLSocket> f10780e;

    public static final class a {
    }

    public f(Class<? super SSLSocket> cls) {
        this.f10780e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        e.C(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f10776a = declaredMethod;
        this.f10777b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f10778c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f10779d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f10780e.isInstance(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        if (!this.f10780e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f10778c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            e.C(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e10) {
            if (e.r(e10.getMessage(), "ssl == null")) {
                return null;
            }
            throw e10;
        } catch (IllegalAccessException e11) {
            throw new AssertionError(e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
    }

    public final boolean c() {
        b.a aVar = b.g;
        return b.f10420f;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        e.D(list, "protocols");
        if (this.f10780e.isInstance(sSLSocket)) {
            try {
                this.f10776a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f10777b.invoke(sSLSocket, new Object[]{str});
                }
                this.f10779d.invoke(sSLSocket, new Object[]{h.f10446c.b(list)});
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
