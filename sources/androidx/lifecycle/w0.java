package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final x0 f2201a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2202b;

    public static class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public static a f2203c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f2204b;

        public a(Application application) {
            e6.e.D(application, "application");
            this.f2204b = application;
        }

        public final <T extends u0> T a(Class<T> cls) {
            e6.e.D(cls, "modelClass");
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t10 = (u0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f2204b});
                e6.e.C(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e6.e.a0("Cannot create an instance of ", cls), e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e6.e.a0("Cannot create an instance of ", cls), e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(e6.e.a0("Cannot create an instance of ", cls), e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(e6.e.a0("Cannot create an instance of ", cls), e13);
            }
        }
    }

    public interface b {
        <T extends u0> T a(Class<T> cls);
    }

    public static abstract class c extends e implements b {
        public <T extends u0> T a(Class<T> cls) {
            e6.e.D(cls, "modelClass");
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementations of KeyedFactory");
        }

        public abstract <T extends u0> T c(String str, Class<T> cls);
    }

    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static d f2205a;

        public <T extends u0> T a(Class<T> cls) {
            e6.e.D(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                e6.e.C(newInstance, "{\n                modelC…wInstance()\n            }");
                return (u0) newInstance;
            } catch (InstantiationException e10) {
                throw new RuntimeException(e6.e.a0("Cannot create an instance of ", cls), e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e6.e.a0("Cannot create an instance of ", cls), e11);
            }
        }
    }

    public static class e {
        public void b(u0 u0Var) {
        }
    }

    public w0(x0 x0Var, b bVar) {
        e6.e.D(x0Var, "store");
        e6.e.D(bVar, "factory");
        this.f2201a = x0Var;
        this.f2202b = bVar;
    }

    public final <T extends u0> T a(Class<T> cls) {
        T t10;
        e6.e.D(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String a02 = e6.e.a0("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            e6.e.D(a02, "key");
            T t11 = (u0) this.f2201a.f2207a.get(a02);
            if (cls.isInstance(t11)) {
                b bVar = this.f2202b;
                e eVar = bVar instanceof e ? (e) bVar : null;
                if (eVar != null) {
                    e6.e.C(t11, "viewModel");
                    eVar.b(t11);
                }
                Objects.requireNonNull(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                b bVar2 = this.f2202b;
                if (bVar2 instanceof c) {
                    t10 = ((c) bVar2).c(a02, cls);
                } else {
                    t10 = bVar2.a(cls);
                }
                t11 = t10;
                u0 put = this.f2201a.f2207a.put(a02, t11);
                if (put != null) {
                    put.f();
                }
                e6.e.C(t11, "viewModel");
            }
            return t11;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w0(androidx.lifecycle.y0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            e6.e.D(r3, r0)
            androidx.lifecycle.x0 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            e6.e.C(r0, r1)
            boolean r1 = r3 instanceof androidx.lifecycle.q
            if (r1 == 0) goto L_0x001e
            androidx.lifecycle.q r3 = (androidx.lifecycle.q) r3
            androidx.lifecycle.w0$b r3 = r3.getDefaultViewModelProviderFactory()
            java.lang.String r1 = "owner.defaultViewModelProviderFactory"
            e6.e.C(r3, r1)
            goto L_0x002e
        L_0x001e:
            androidx.lifecycle.w0$d r3 = androidx.lifecycle.w0.d.f2205a
            if (r3 != 0) goto L_0x0029
            androidx.lifecycle.w0$d r3 = new androidx.lifecycle.w0$d
            r3.<init>()
            androidx.lifecycle.w0.d.f2205a = r3
        L_0x0029:
            androidx.lifecycle.w0$d r3 = androidx.lifecycle.w0.d.f2205a
            e6.e.B(r3)
        L_0x002e:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.w0.<init>(androidx.lifecycle.y0):void");
    }
}
