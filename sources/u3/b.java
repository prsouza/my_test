package u3;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import g9.h;
import g9.j;
import g9.k;
import g9.l;
import g9.m;
import i3.w;
import j3.c;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p3.e;

public final class b implements c, h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11681a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11682b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11683c;

    public b(Class cls, Type type) {
        Object obj;
        this.f11682b = cls;
        this.f11683c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = new j(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                obj = new k(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    obj = new l(declaredMethod3);
                } catch (Exception unused3) {
                    obj = new m();
                }
            }
        }
        this.f11681a = obj;
    }

    public final Object a() {
        try {
            return ((android.support.v4.media.b) this.f11681a).E((Class) this.f11682b);
        } catch (Exception e10) {
            StringBuilder q10 = a.b.q("Unable to invoke no-args constructor for ");
            q10.append((Type) this.f11683c);
            q10.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(q10.toString(), e10);
        }
    }

    public final w b(w wVar, g3.h hVar) {
        Drawable drawable = (Drawable) wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((c) this.f11682b).b(e.e(((BitmapDrawable) drawable).getBitmap(), (c) this.f11681a), hVar);
        }
        if (drawable instanceof t3.c) {
            return ((c) this.f11683c).b(wVar, hVar);
        }
        return null;
    }

    public /* synthetic */ b(c cVar, c cVar2, c cVar3) {
        this.f11681a = cVar;
        this.f11682b = cVar2;
        this.f11683c = cVar3;
    }
}
