package a5;

import a.a;
import java.util.Objects;
import t4.m;
import t4.q;

public final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    public final long f71a;

    /* renamed from: b  reason: collision with root package name */
    public final q f72b;

    /* renamed from: c  reason: collision with root package name */
    public final m f73c;

    public b(long j10, q qVar, m mVar) {
        this.f71a = j10;
        Objects.requireNonNull(qVar, "Null transportContext");
        this.f72b = qVar;
        Objects.requireNonNull(mVar, "Null event");
        this.f73c = mVar;
    }

    public final m a() {
        return this.f73c;
    }

    public final long b() {
        return this.f71a;
    }

    public final q c() {
        return this.f72b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f71a != jVar.b() || !this.f72b.equals(jVar.c()) || !this.f73c.equals(jVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f71a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f72b.hashCode()) * 1000003) ^ this.f73c.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.d("PersistedEvent{id=");
        d10.append(this.f71a);
        d10.append(", transportContext=");
        d10.append(this.f72b);
        d10.append(", event=");
        d10.append(this.f73c);
        d10.append("}");
        return d10.toString();
    }
}
