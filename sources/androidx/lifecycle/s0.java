package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.w0;
import androidx.savedstate.a;
import androidx.savedstate.c;
import e6.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class s0 extends w0.c {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f2174f;
    public static final Class<?>[] g;

    /* renamed from: a  reason: collision with root package name */
    public final Application f2175a;

    /* renamed from: b  reason: collision with root package name */
    public final w0.d f2176b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2177c;

    /* renamed from: d  reason: collision with root package name */
    public final r f2178d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2179e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.lifecycle.r0> r0 = androidx.lifecycle.r0.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f2174f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.s0.<clinit>():void");
    }

    public s0(Application application, c cVar, Bundle bundle) {
        w0.d dVar;
        this.f2179e = cVar.getSavedStateRegistry();
        this.f2178d = cVar.getLifecycle();
        this.f2177c = bundle;
        this.f2175a = application;
        if (application != null) {
            if (w0.a.f2203c == null) {
                w0.a.f2203c = new w0.a(application);
            }
            dVar = w0.a.f2203c;
            e.B(dVar);
        } else {
            if (w0.d.f2205a == null) {
                w0.d.f2205a = new w0.d();
            }
            dVar = w0.d.f2205a;
            e.B(dVar);
        }
        this.f2176b = dVar;
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    public final <T extends u0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void b(u0 u0Var) {
        SavedStateHandleController.f(u0Var, this.f2179e, this.f2178d);
    }

    public final <T extends u0> T c(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t10;
        boolean isAssignableFrom = b.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.f2175a == null) {
            constructor = d(cls, g);
        } else {
            constructor = d(cls, f2174f);
        }
        if (constructor == null) {
            return this.f2176b.a(cls);
        }
        SavedStateHandleController i = SavedStateHandleController.i(this.f2179e, this.f2178d, str, this.f2177c);
        if (isAssignableFrom) {
            try {
                Application application = this.f2175a;
                if (application != null) {
                    t10 = (u0) constructor.newInstance(new Object[]{application, i.f2075c});
                    t10.h("androidx.lifecycle.savedstate.vm.tag", i);
                    return t10;
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to access " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
            }
        }
        t10 = (u0) constructor.newInstance(new Object[]{i.f2075c});
        t10.h("androidx.lifecycle.savedstate.vm.tag", i);
        return t10;
    }
}
