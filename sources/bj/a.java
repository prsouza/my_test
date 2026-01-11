package bj;

import a.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f3038a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3039b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3040c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3041d;

    public a() {
        this.f3038a = 0;
        this.f3039b = 0;
        this.f3040c = 0;
        this.f3041d = 0;
    }

    public a(long j10, long j11, long j12, long j13) {
        this.f3038a = j10;
        this.f3039b = j11;
        this.f3040c = j12;
        this.f3041d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3038a == aVar.f3038a && this.f3039b == aVar.f3039b && this.f3040c == aVar.f3040c && this.f3041d == aVar.f3041d;
    }

    public final int hashCode() {
        long j10 = this.f3038a;
        long j11 = this.f3039b;
        long j12 = this.f3040c;
        long j13 = this.f3041d;
        return (((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        StringBuilder q10 = b.q("MemoryPage(event=");
        q10.append(this.f3038a);
        q10.append(", text=");
        q10.append(this.f3039b);
        q10.append(", data=");
        q10.append(this.f3040c);
        q10.append(", ram=");
        q10.append(this.f3041d);
        q10.append(")");
        return q10.toString();
    }
}
