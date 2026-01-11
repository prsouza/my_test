package af;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f350a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f351b;

    /* renamed from: c  reason: collision with root package name */
    public long f352c;

    public b(int i, boolean z, long j10) {
        this.f350a = i;
        this.f351b = z;
        this.f352c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f350a == bVar.f350a && this.f351b == bVar.f351b && this.f352c == bVar.f352c;
    }

    public final int hashCode() {
        int i = this.f350a * 31;
        boolean z = this.f351b;
        if (z) {
            z = true;
        }
        long j10 = this.f352c;
        return ((i + (z ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder q10 = a.b.q("StatusItem(statusAssertion=");
        q10.append(this.f350a);
        q10.append(", asserted=");
        q10.append(this.f351b);
        q10.append(", timestamp=");
        q10.append(this.f352c);
        q10.append(")");
        return q10.toString();
    }
}
