package z1;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13762a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13763b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13764c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13765d;

    public b(boolean z, boolean z10, boolean z11, boolean z12) {
        this.f13762a = z;
        this.f13763b = z10;
        this.f13764c = z11;
        this.f13765d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f13762a == bVar.f13762a && this.f13763b == bVar.f13763b && this.f13764c == bVar.f13764c && this.f13765d == bVar.f13765d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f13762a;
        if (this.f13763b) {
            i += 16;
        }
        if (this.f13764c) {
            i += 256;
        }
        return this.f13765d ? i + LZ4Constants.HASH_TABLE_SIZE : i;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f13762a), Boolean.valueOf(this.f13763b), Boolean.valueOf(this.f13764c), Boolean.valueOf(this.f13765d)});
    }
}
