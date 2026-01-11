package androidx.lifecycle;

import androidx.lifecycle.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Deprecated
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static f f2105c = new f();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, a> f2106a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2107b = new HashMap();

    @Deprecated
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<r.b, List<b>> f2108a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, r.b> f2109b;

        /* JADX WARNING: type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<androidx.lifecycle.r$b, java.util.List<androidx.lifecycle.f$b>>] */
        /* JADX WARNING: type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<androidx.lifecycle.r$b, java.util.List<androidx.lifecycle.f$b>>] */
        public a(Map<b, r.b> map) {
            this.f2109b = map;
            for (Map.Entry next : map.entrySet()) {
                r.b bVar = (r.b) next.getValue();
                List list = (List) this.f2108a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2108a.put(bVar, list);
                }
                list.add((b) next.getKey());
            }
        }

        public static void a(List<b> list, a0 a0Var, r.b bVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar2 = list.get(size);
                    Objects.requireNonNull(bVar2);
                    try {
                        int i = bVar2.f2110a;
                        if (i == 0) {
                            bVar2.f2111b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar2.f2111b.invoke(obj, new Object[]{a0Var});
                        } else if (i == 2) {
                            bVar2.f2111b.invoke(obj, new Object[]{a0Var, bVar});
                        }
                        size--;
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException("Failed to call observer method", e10.getCause());
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2110a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2111b;

        public b(int i, Method method) {
            this.f2110a = i;
            this.f2111b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2110a != bVar.f2110a || !this.f2111b.getName().equals(bVar.f2111b.getName())) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f2111b.getName().hashCode() + (this.f2110a * 31);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, androidx.lifecycle.f$a>] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Boolean>] */
    public final a a(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f2109b);
        }
        for (Class b10 : cls.getInterfaces()) {
            for (Map.Entry next : b(b10).f2109b.entrySet()) {
                c(hashMap, (b) next.getKey(), (r.b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            l0 l0Var = (l0) method.getAnnotation(l0.class);
            if (l0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(a0.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                r.b value = l0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(r.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == r.b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f2106a.put(cls, aVar);
        this.f2107b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, androidx.lifecycle.f$a>] */
    public final a b(Class<?> cls) {
        a aVar = (a) this.f2106a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    public final void c(Map<b, r.b> map, b bVar, r.b bVar2, Class<?> cls) {
        r.b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f2111b;
            StringBuilder d10 = a.a.d("Method ");
            d10.append(method.getName());
            d10.append(" in ");
            d10.append(cls.getName());
            d10.append(" already declared with different @OnLifecycleEvent value: previous value ");
            d10.append(bVar3);
            d10.append(", new value ");
            d10.append(bVar2);
            throw new IllegalArgumentException(d10.toString());
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }
}
