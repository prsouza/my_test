package ta;

import e6.e;

public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f11445a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11446b;

    public a(Throwable th2, String str) {
        e.D(str, "message");
        this.f11445a = th2;
        this.f11446b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e.r(this.f11445a, aVar.f11445a) && e.r(this.f11446b, aVar.f11446b);
    }

    public final int hashCode() {
        return this.f11446b.hashCode() + (this.f11445a.hashCode() * 31);
    }

    public final String toString() {
        Throwable th2 = this.f11445a;
        String str = this.f11446b;
        return "Error(throwable=" + th2 + ", message=" + str + ")";
    }
}
