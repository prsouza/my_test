package x9;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f13148a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f13149b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13150c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a10 = g9.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f13149b = a10;
            this.f13148a = g9.a.h(a10);
            this.f13150c = a10.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && g9.a.e(this.f13149b, ((a) obj).f13149b);
    }

    public final int hashCode() {
        return this.f13150c;
    }

    public final String toString() {
        return g9.a.i(this.f13149b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a10 = g9.a.a(type);
        this.f13149b = a10;
        this.f13148a = g9.a.h(a10);
        this.f13150c = a10.hashCode();
    }
}
