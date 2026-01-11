package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2193a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f2194b = false;

    public void f() {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final <T> T h(String str, T t10) {
        T t11;
        synchronized (this.f2193a) {
            t11 = this.f2193a.get(str);
            if (t11 == null) {
                this.f2193a.put(str, t10);
            }
        }
        if (t11 != null) {
            t10 = t11;
        }
        if (this.f2194b && (t10 instanceof Closeable)) {
            try {
                ((Closeable) t10).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return t10;
    }
}
