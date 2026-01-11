package zb;

import java.util.Collections;
import java.util.HashMap;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f14351a = new p(true);

    static {
        try {
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }

    public p() {
        new HashMap();
    }

    public p(boolean z) {
        Collections.emptyMap();
    }

    public static p a() {
        Class<?> cls = o.f14350a;
        if (cls != null) {
            try {
                return (p) cls.getMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return f14351a;
    }
}
