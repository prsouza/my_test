package ki;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Method f7613a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f7614b;

    public l(Method method, List<?> list) {
        this.f7613a = method;
        this.f7614b = Collections.unmodifiableList(list);
    }

    public final String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f7613a.getDeclaringClass().getName(), this.f7613a.getName(), this.f7614b});
    }
}
