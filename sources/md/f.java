package md;

import e6.e;
import java.io.Serializable;

public final class f<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final A f8541a;

    /* renamed from: b  reason: collision with root package name */
    public final B f8542b;

    public f(A a10, B b10) {
        this.f8541a = a10;
        this.f8542b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e.r(this.f8541a, fVar.f8541a) && e.r(this.f8542b, fVar.f8542b);
    }

    public final int hashCode() {
        A a10 = this.f8541a;
        int i = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f8542b;
        if (b10 != null) {
            i = b10.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return '(' + this.f8541a + ", " + this.f8542b + ')';
    }
}
