package q4;

import java.util.Objects;

public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f10300a;

    /* renamed from: b  reason: collision with root package name */
    public final d f10301b;

    public a(Object obj, d dVar) {
        Objects.requireNonNull(obj, "Null payload");
        this.f10300a = obj;
        Objects.requireNonNull(dVar, "Null priority");
        this.f10301b = dVar;
    }

    public final Integer a() {
        return null;
    }

    public final T b() {
        return this.f10300a;
    }

    public final d c() {
        return this.f10301b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.a() != null || !this.f10300a.equals(cVar.b()) || !this.f10301b.equals(cVar.c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10301b.hashCode() ^ ((-721379959 ^ this.f10300a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=" + null + ", payload=" + this.f10300a + ", priority=" + this.f10301b + "}";
    }
}
