package s8;

public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final String f10989a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10990b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10991c;

    public a(String str, long j10, long j11) {
        this.f10989a = str;
        this.f10990b = j10;
        this.f10991c = j11;
    }

    public final String a() {
        return this.f10989a;
    }

    public final long b() {
        return this.f10991c;
    }

    public final long c() {
        return this.f10990b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f10989a.equals(jVar.a()) && this.f10990b == jVar.c() && this.f10991c == jVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10990b;
        long j11 = this.f10991c;
        return ((((this.f10989a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("InstallationTokenResult{token=");
        d10.append(this.f10989a);
        d10.append(", tokenExpirationTimestamp=");
        d10.append(this.f10990b);
        d10.append(", tokenCreationTimestamp=");
        d10.append(this.f10991c);
        d10.append("}");
        return d10.toString();
    }
}
