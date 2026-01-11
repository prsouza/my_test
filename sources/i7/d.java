package i7;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f6244a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f6245b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f6244a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f6245b = cls2 != null;
    }

    public static boolean a() {
        return f6244a != null && !f6245b;
    }
}
