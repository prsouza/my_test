package u4;

import a.a;
import java.util.Objects;
import u4.g;

public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public final g.a f11691a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11692b;

    public b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f11691a = aVar;
        this.f11692b = j10;
    }

    public final long b() {
        return this.f11692b;
    }

    public final g.a c() {
        return this.f11691a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f11691a.equals(gVar.c()) || this.f11692b != gVar.b()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f11692b;
        return ((this.f11691a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder d10 = a.d("BackendResponse{status=");
        d10.append(this.f11691a);
        d10.append(", nextRequestWaitMillis=");
        d10.append(this.f11692b);
        d10.append("}");
        return d10.toString();
    }
}
