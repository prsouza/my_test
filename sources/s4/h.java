package s4;

import a.a;

public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final long f10926a;

    public h(long j10) {
        this.f10926a = j10;
    }

    public final long b() {
        return this.f10926a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f10926a == ((n) obj).b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10926a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        StringBuilder d10 = a.d("LogResponse{nextRequestWaitMillis=");
        d10.append(this.f10926a);
        d10.append("}");
        return d10.toString();
    }
}
