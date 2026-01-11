package u9;

import i2.q;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f11747d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11748b;

    /* renamed from: c  reason: collision with root package name */
    public final Field f11749c;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f11747d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f11748b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f11749c = field;
    }

    public final void a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (!(this.f11748b == null || this.f11749c == null)) {
            try {
                f11747d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f11748b, new Object[]{accessibleObject, Long.valueOf(((Long) f11747d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f11748b, new Object[]{this.f11749c})).longValue()), Boolean.TRUE});
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new q("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }
}
