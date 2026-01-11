package r1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final s.a<String, Method> f10517a;

    /* renamed from: b  reason: collision with root package name */
    public final s.a<String, Method> f10518b;

    /* renamed from: c  reason: collision with root package name */
    public final s.a<String, Class> f10519c;

    public a(s.a<String, Method> aVar, s.a<String, Method> aVar2, s.a<String, Class> aVar3) {
        this.f10517a = aVar;
        this.f10518b = aVar2;
        this.f10519c = aVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> cls) throws ClassNotFoundException {
        Class orDefault = this.f10519c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f10519c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<a> cls = a.class;
        Method orDefault = this.f10517a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f10517a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f10518b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c10 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c10.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f10518b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i);

    public abstract int j();

    public final int k(int i, int i10) {
        if (!i(i10)) {
            return i;
        }
        return j();
    }

    public abstract <T extends Parcelable> T l();

    public final <T extends Parcelable> T m(T t10, int i) {
        if (!i(i)) {
            return t10;
        }
        return l();
    }

    public abstract String n();

    public final <T extends c> T o() {
        String n10 = n();
        if (n10 == null) {
            return null;
        }
        a b10 = b();
        try {
            return (c) d(n10).invoke((Object) null, new Object[]{b10});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    public abstract void p(int i);

    public abstract void q(boolean z);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i);

    public final void u(int i, int i10) {
        p(i10);
        t(i);
    }

    public abstract void v(Parcelable parcelable);

    public final void w(Parcelable parcelable, int i) {
        p(i);
        v(parcelable);
    }

    public abstract void x(String str);

    public final void y(c cVar) {
        if (cVar == null) {
            x((String) null);
            return;
        }
        try {
            x(c(cVar.getClass()).getName());
            a b10 = b();
            try {
                e(cVar.getClass()).invoke((Object) null, new Object[]{cVar, b10});
                b10.a();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e14);
        }
    }
}
