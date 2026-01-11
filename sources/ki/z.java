package ki;

import p002if.a0;
import p002if.b0;

public final class z<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f7732a;

    /* renamed from: b  reason: collision with root package name */
    public final T f7733b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f7734c;

    public z(a0 a0Var, T t10, b0 b0Var) {
        this.f7732a = a0Var;
        this.f7733b = t10;
        this.f7734c = b0Var;
    }

    public static <T> z<T> b(T t10, a0 a0Var) {
        if (a0Var.c()) {
            return new z<>(a0Var, t10, (b0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final boolean a() {
        return this.f7732a.c();
    }

    public final String toString() {
        return this.f7732a.toString();
    }
}
