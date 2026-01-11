package md;

import e6.e;
import java.io.Serializable;

public final class i<A, B, C> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final A f8547a;

    /* renamed from: b  reason: collision with root package name */
    public final B f8548b;

    /* renamed from: c  reason: collision with root package name */
    public final C f8549c;

    public i(A a10, B b10, C c10) {
        this.f8547a = a10;
        this.f8548b = b10;
        this.f8549c = c10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return e.r(this.f8547a, iVar.f8547a) && e.r(this.f8548b, iVar.f8548b) && e.r(this.f8549c, iVar.f8549c);
    }

    public final int hashCode() {
        A a10 = this.f8547a;
        int i = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f8548b;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f8549c;
        if (c10 != null) {
            i = c10.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return '(' + this.f8547a + ", " + this.f8548b + ", " + this.f8549c + ')';
    }
}
