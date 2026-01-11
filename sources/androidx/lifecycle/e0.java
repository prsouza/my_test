package androidx.lifecycle;

import com.github.mikephil.charting.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class<?>, Integer> f2103a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class<?>, List<Constructor<? extends p>>> f2104b = new HashMap();

    public static p a(Constructor<? extends p> constructor, Object obj) {
        try {
            return (p) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Boolean>] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.p>>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.p>>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.p>>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Boolean>] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.p>>>, java.util.HashMap] */
    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z;
        Integer num = (Integer) f2103a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        Class<z> cls2 = z.class;
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : BuildConfig.FLAVOR;
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b10 = b(canonicalName);
                if (!name.isEmpty()) {
                    b10 = name + "." + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            if (constructor != null) {
                f2104b.put(cls, Collections.singletonList(constructor));
            } else {
                f fVar = f.f2105c;
                Boolean bool = (Boolean) fVar.f2107b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                fVar.f2107b.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((l0) declaredMethods[i10].getAnnotation(l0.class)) != null) {
                                fVar.a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) f2104b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            Class cls3 = interfaces[i11];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) f2104b.get(cls3));
                            }
                            i11++;
                        } else if (arrayList != null) {
                            f2104b.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        f2103a.put(cls, Integer.valueOf(i));
        return i;
    }
}
