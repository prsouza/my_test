package i7;

import i7.g0;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class b1 {

    /* renamed from: c  reason: collision with root package name */
    public static final b1 f6235c = new b1();

    /* renamed from: a  reason: collision with root package name */
    public final i0 f6236a = new i0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, f1<?>> f6237b = new ConcurrentHashMap();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, i7.f1<?>>] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, i7.f1<?>>] */
    public final <T> f1<T> a(Class<T> cls) {
        f1<T> f1Var;
        u0 u0Var;
        Class<?> cls2;
        Charset charset = z.f6396a;
        Objects.requireNonNull(cls, "messageType");
        f1<T> f1Var2 = (f1) this.f6237b.get(cls);
        if (f1Var2 != null) {
            return f1Var2;
        }
        i0 i0Var = this.f6236a;
        Objects.requireNonNull(i0Var);
        Class<x> cls3 = x.class;
        Class<?> cls4 = g1.f6262a;
        if (cls3.isAssignableFrom(cls) || (cls2 = g1.f6262a) == null || cls2.isAssignableFrom(cls)) {
            o0 a10 = i0Var.f6278a.a(cls);
            if (a10.a()) {
                if (cls3.isAssignableFrom(cls)) {
                    l1<?, ?> l1Var = g1.f6265d;
                    q<?> qVar = s.f6353a;
                    u0Var = new u0(l1Var, s.f6353a, a10.c());
                } else {
                    l1<?, ?> l1Var2 = g1.f6263b;
                    q<?> qVar2 = s.f6354b;
                    if (qVar2 != null) {
                        u0Var = new u0(l1Var2, qVar2, a10.c());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                f1Var = u0Var;
            } else {
                boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                boolean z = true;
                if (isAssignableFrom) {
                    if (a10.b() != a1.PROTO2) {
                        z = false;
                    }
                    if (z) {
                        w0 w0Var = x0.f6393b;
                        g0.b bVar = g0.f6260b;
                        l1<?, ?> l1Var3 = g1.f6265d;
                        q<?> qVar3 = s.f6353a;
                        f1Var = t0.z(a10, w0Var, bVar, l1Var3, s.f6353a, n0.f6333b);
                    } else {
                        f1Var = t0.z(a10, x0.f6393b, g0.f6260b, g1.f6265d, (q) null, n0.f6333b);
                    }
                } else {
                    if (a10.b() != a1.PROTO2) {
                        z = false;
                    }
                    if (z) {
                        v0 v0Var = x0.f6392a;
                        g0.a aVar = g0.f6259a;
                        l1<?, ?> l1Var4 = g1.f6263b;
                        q<?> qVar4 = s.f6354b;
                        if (qVar4 != null) {
                            f1Var = t0.z(a10, v0Var, aVar, l1Var4, qVar4, n0.f6332a);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        f1Var = t0.z(a10, x0.f6392a, g0.f6259a, g1.f6264c, (q) null, n0.f6332a);
                    }
                }
            }
            f1<T> f1Var3 = (f1) this.f6237b.putIfAbsent(cls, f1Var);
            return f1Var3 != null ? f1Var3 : f1Var;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public final <T> f1<T> b(T t10) {
        return a(t10.getClass());
    }
}
