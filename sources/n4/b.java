package n4;

import java.lang.ref.SoftReference;
import n4.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final g f8903a;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<SoftReference<a>> f8904b = new ThreadLocal<>();

    static {
        boolean z;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z = false;
        }
        f8903a = z ? g.a.f8922a : null;
    }
}
