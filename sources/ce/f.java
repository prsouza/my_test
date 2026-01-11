package ce;

public final class f extends d {
    static {
        new f(1, 0);
    }

    public f(long j10, long j11) {
        super(j10, j11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (!(this.f3439a == fVar.f3439a && this.f3440b == fVar.f3440b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f3439a;
        long j11 = ((long) 31) * (j10 ^ (j10 >>> 32));
        long j12 = this.f3440b;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f3439a > this.f3440b;
    }

    public final String toString() {
        return this.f3439a + ".." + this.f3440b;
    }
}
