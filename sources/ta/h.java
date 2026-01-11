package ta;

import e6.e;

public final class h<T> extends e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f11460a;

    /* renamed from: b  reason: collision with root package name */
    public final T f11461b;

    public h(int i, T t10) {
        this.f11460a = i;
        this.f11461b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11460a == hVar.f11460a && e.r(this.f11461b, hVar.f11461b);
    }

    public final int hashCode() {
        int i = this.f11460a * 31;
        T t10 = this.f11461b;
        return i + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        int i = this.f11460a;
        T t10 = this.f11461b;
        return "Success(status=" + i + ", response=" + t10 + ")";
    }
}
