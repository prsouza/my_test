package yd;

import de.b;
import de.i;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final w f13623a;

    /* renamed from: b  reason: collision with root package name */
    public static final b[] f13624b = new b[0];

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (wVar == null) {
            wVar = new w();
        }
        f13623a = wVar;
    }

    public static b a(Class cls) {
        Objects.requireNonNull(f13623a);
        return new d(cls);
    }

    public static i b(Class cls) {
        w wVar = f13623a;
        b a10 = a(cls);
        List emptyList = Collections.emptyList();
        Objects.requireNonNull(wVar);
        return new y(a10, emptyList);
    }
}
