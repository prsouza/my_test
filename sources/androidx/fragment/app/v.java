package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import s.g;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final g<ClassLoader, g<String, Class<?>>> f2008a = new g<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        g<ClassLoader, g<String, Class<?>>> gVar = f2008a;
        g orDefault = gVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new g();
            gVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new Fragment.j(o.c("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        } catch (ClassCastException e11) {
            throw new Fragment.j(o.c("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e11);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
