package h;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static Field f5604a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5605b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f5606c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5607d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f5608e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f5609f;
    public static Field g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f5610h;

    public static void a(Object obj) {
        if (!f5607d) {
            try {
                f5606c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f5607d = true;
        }
        Class<?> cls = f5606c;
        if (cls != null) {
            if (!f5609f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f5608e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f5609f = true;
            }
            Field field = f5608e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
