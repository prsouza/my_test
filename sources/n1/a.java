package n1;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f8863d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f8864e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f8865a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f8866b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f8867c;

    public a(Context context) {
        this.f8867c = context.getApplicationContext();
    }

    public static a b(Context context) {
        if (f8863d == null) {
            synchronized (f8864e) {
                if (f8863d == null) {
                    f8863d = new a(context);
                }
            }
        }
        return f8863d;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
    public final <T> T a(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t10;
        synchronized (f8864e) {
            if (o1.a.a()) {
                try {
                    Trace.beginSection(cls.getSimpleName());
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            if (!set.contains(cls)) {
                if (!this.f8865a.containsKey(cls)) {
                    set.add(cls);
                    b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends b<?>>> a10 = bVar.a();
                    if (!a10.isEmpty()) {
                        for (Class next : a10) {
                            if (!this.f8865a.containsKey(next)) {
                                a(next, set);
                            }
                        }
                    }
                    t10 = bVar.b(this.f8867c);
                    set.remove(cls);
                    this.f8865a.put(cls, t10);
                } else {
                    t10 = this.f8865a.get(cls);
                }
                Trace.endSection();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
            }
        }
        return t10;
    }
}
