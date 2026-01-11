package qf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p002if.w;

public final class e extends h {

    /* renamed from: d  reason: collision with root package name */
    public final Method f10432d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f10433e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f10434f;
    public final Class<?> g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f10435h;

    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10436a;

        /* renamed from: b  reason: collision with root package name */
        public String f10437b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f10438c;

        public a(List<String> list) {
            this.f10438c = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            e6.e.D(obj, "proxy");
            e6.e.D(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (e6.e.r(name, "supports") && e6.e.r(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!e6.e.r(name, "unsupported") || !e6.e.r(Void.TYPE, returnType)) {
                if (e6.e.r(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f10438c;
                    }
                }
                if ((e6.e.r(name, "selectProtocol") || e6.e.r(name, "select")) && e6.e.r(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f10438c.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f10437b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f10438c.get(0);
                    this.f10437b = str2;
                    return str2;
                } else if ((!e6.e.r(name, "protocolSelected") && !e6.e.r(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.f10437b = (String) obj4;
                    return null;
                }
            } else {
                this.f10436a = true;
                return null;
            }
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f10432d = method;
        this.f10433e = method2;
        this.f10434f = method3;
        this.g = cls;
        this.f10435h = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.f10434f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        e6.e.D(list, "protocols");
        List<String> a10 = h.f10446c.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.g, this.f10435h}, new a(a10));
            this.f10432d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f10433e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z = aVar.f10436a;
                if (!z && aVar.f10437b == null) {
                    i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, (Throwable) null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return aVar.f10437b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
