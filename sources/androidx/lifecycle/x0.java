package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, u0> f2207a = new HashMap<>();

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void a() {
        for (u0 next : this.f2207a.values()) {
            next.f2194b = true;
            Map<String, Object> map = next.f2193a;
            if (map != null) {
                synchronized (map) {
                    for (Object next2 : next.f2193a.values()) {
                        if (next2 instanceof Closeable) {
                            try {
                                ((Closeable) next2).close();
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                    }
                }
            }
            next.f();
        }
        this.f2207a.clear();
    }
}
