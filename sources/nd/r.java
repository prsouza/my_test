package nd;

import a.a;
import e6.e;

public final class r<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f8969a;

    /* renamed from: b  reason: collision with root package name */
    public final T f8970b;

    public r(int i, T t10) {
        this.f8969a = i;
        this.f8970b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f8969a == rVar.f8969a && e.r(this.f8970b, rVar.f8970b);
    }

    public final int hashCode() {
        int i = this.f8969a * 31;
        T t10 = this.f8970b;
        return i + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        StringBuilder d10 = a.d("IndexedValue(index=");
        d10.append(this.f8969a);
        d10.append(", value=");
        d10.append(this.f8970b);
        d10.append(')');
        return d10.toString();
    }
}
