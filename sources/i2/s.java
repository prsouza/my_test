package i2;

import g9.g;
import java.util.Objects;

public final class s extends p {

    /* renamed from: a  reason: collision with root package name */
    public final g<String, p> f6005a = new g<>();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof s) && ((s) obj).f6005a.equals(this.f6005a));
    }

    public final void g(String str, V v10) {
        g<String, p> gVar = this.f6005a;
        if (v10 == null) {
            v10 = r.f6004a;
        }
        Objects.requireNonNull(str, "key == null");
        g.e<String, p> c10 = gVar.c(str, true);
        V v11 = c10.f5305v;
        c10.f5305v = v10;
    }

    public final int hashCode() {
        return this.f6005a.hashCode();
    }
}
