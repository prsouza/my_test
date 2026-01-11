package eh;

import java.math.BigInteger;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final BigInteger f4840a;

    public f(BigInteger bigInteger) {
        this.f4840a = bigInteger;
    }

    public final int b() {
        return 1;
    }

    public final BigInteger c() {
        return this.f4840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f4840a.equals(((f) obj).f4840a);
    }

    public final int hashCode() {
        return this.f4840a.hashCode();
    }
}
