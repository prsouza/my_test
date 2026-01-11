package b4;

import a.a;
import g3.f;
import java.security.MessageDigest;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f2865b;

    public b(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f2865b = obj;
    }

    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f2865b.toString().getBytes(f.f5231a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f2865b.equals(((b) obj).f2865b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2865b.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.d("ObjectKey{object=");
        d10.append(this.f2865b);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
