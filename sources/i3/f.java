package i3;

import a.a;
import java.security.MessageDigest;
import org.slf4j.helpers.MessageFormatter;

public final class f implements g3.f {

    /* renamed from: b  reason: collision with root package name */
    public final g3.f f6037b;

    /* renamed from: c  reason: collision with root package name */
    public final g3.f f6038c;

    public f(g3.f fVar, g3.f fVar2) {
        this.f6037b = fVar;
        this.f6038c = fVar2;
    }

    public final void b(MessageDigest messageDigest) {
        this.f6037b.b(messageDigest);
        this.f6038c.b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f6037b.equals(fVar.f6037b) || !this.f6038c.equals(fVar.f6038c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6038c.hashCode() + (this.f6037b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder d10 = a.d("DataCacheKey{sourceKey=");
        d10.append(this.f6037b);
        d10.append(", signature=");
        d10.append(this.f6038c);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
