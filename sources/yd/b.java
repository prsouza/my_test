package yd;

import de.d;
import java.io.Serializable;
import java.util.Objects;

public abstract class b implements de.a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient de.a f13604a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13605b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f13606c;

    /* renamed from: s  reason: collision with root package name */
    public final String f13607s;

    /* renamed from: t  reason: collision with root package name */
    public final String f13608t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f13609u;

    public static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13610a = new a();
    }

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.f13605b = obj;
        this.f13606c = cls;
        this.f13607s = str;
        this.f13608t = str2;
        this.f13609u = z;
    }

    public final de.a a() {
        de.a aVar = this.f13604a;
        if (aVar != null) {
            return aVar;
        }
        de.a b10 = b();
        this.f13604a = b10;
        return b10;
    }

    public abstract de.a b();

    public final d d() {
        Class cls = this.f13606c;
        if (cls == null) {
            return null;
        }
        if (!this.f13609u) {
            return v.a(cls);
        }
        Objects.requireNonNull(v.f13623a);
        return new l(cls);
    }
}
