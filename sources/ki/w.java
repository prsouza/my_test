package ki;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

public class w {

    /* renamed from: c  reason: collision with root package name */
    public static final w f7683c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7684a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f7685b;

    public static final class a extends w {

        /* renamed from: ki.w$a$a  reason: collision with other inner class name */
        public static final class C0139a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            public final Handler f7686a = new Handler(Looper.getMainLooper());

            public final void execute(Runnable runnable) {
                this.f7686a.post(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        public final Executor a() {
            return new C0139a();
        }

        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return w.super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        w wVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            wVar = new a();
        } else {
            wVar = new w(true);
        }
        f7683c = wVar;
    }

    public w(boolean z) {
        this.f7684a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f7685b = constructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f7685b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public final boolean c(Method method) {
        return this.f7684a && method.isDefault();
    }
}
