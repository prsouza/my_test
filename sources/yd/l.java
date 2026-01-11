package yd;

import e6.e;

public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f13617a;

    public l(Class cls) {
        e.D(cls, "jClass");
        this.f13617a = cls;
    }

    public final Class<?> b() {
        return this.f13617a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && e.r(this.f13617a, ((l) obj).f13617a);
    }

    public final int hashCode() {
        return this.f13617a.hashCode();
    }

    public final String toString() {
        return this.f13617a.toString() + " (Kotlin reflection is not available)";
    }
}
