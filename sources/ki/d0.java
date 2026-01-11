package ki;

import a.a;
import java.lang.annotation.Annotation;

public final class d0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f7582a = new d0();

    public final Class<? extends Annotation> annotationType() {
        return c0.class;
    }

    public final boolean equals(Object obj) {
        return obj instanceof c0;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder d10 = a.d("@");
        d10.append(c0.class.getName());
        d10.append("()");
        return d10.toString();
    }
}
