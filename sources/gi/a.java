package gi;

import a.b;
import xe.p;

public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public long f5514a;

    public a(long j10) {
        this.f5514a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f5514a == ((a) obj).f5514a;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f5514a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        StringBuilder q10 = b.q("BundleAgeBlockData(age=");
        q10.append(this.f5514a);
        q10.append(")");
        return q10.toString();
    }
}
