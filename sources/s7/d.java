package s7;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import r8.b;

public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10947a;

    public /* synthetic */ d(String str) {
        this.f10947a = str;
    }

    public final Object get() {
        String str = this.f10947a;
        try {
            Class<?> cls = Class.forName(str);
            if (f.class.isAssignableFrom(cls)) {
                return (f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new q(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e10) {
            throw new q(String.format("Could not instantiate %s.", new Object[]{str}), e10);
        } catch (InstantiationException e11) {
            throw new q(String.format("Could not instantiate %s.", new Object[]{str}), e11);
        } catch (NoSuchMethodException e12) {
            throw new q(String.format("Could not instantiate %s", new Object[]{str}), e12);
        } catch (InvocationTargetException e13) {
            throw new q(String.format("Could not instantiate %s", new Object[]{str}), e13);
        }
    }
}
