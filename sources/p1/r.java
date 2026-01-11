package p1;

import a.b;
import g9.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class r implements h {

    /* renamed from: a  reason: collision with root package name */
    public Object f9562a;

    public /* synthetic */ r(Constructor constructor) {
        this.f9562a = constructor;
    }

    public final Object a() {
        try {
            return ((Constructor) this.f9562a).newInstance((Object[]) null);
        } catch (InstantiationException e10) {
            StringBuilder q10 = b.q("Failed to invoke ");
            q10.append((Constructor) this.f9562a);
            q10.append(" with no args");
            throw new RuntimeException(q10.toString(), e10);
        } catch (InvocationTargetException e11) {
            StringBuilder q11 = b.q("Failed to invoke ");
            q11.append((Constructor) this.f9562a);
            q11.append(" with no args");
            throw new RuntimeException(q11.toString(), e11.getTargetException());
        } catch (IllegalAccessException e12) {
            throw new AssertionError(e12);
        }
    }
}
