package yd;

import de.a;
import de.g;
import de.h;
import java.util.Objects;
import yd.b;

public abstract class n extends p implements g {
    public n(Class cls, String str, String str2) {
        super(b.a.f13610a, cls, str, str2, 0);
    }

    public final a b() {
        Objects.requireNonNull(v.f13623a);
        return this;
    }

    public final g.a j() {
        a a10 = a();
        if (a10 != this) {
            return ((g) ((h) a10)).j();
        }
        throw new wd.a();
    }

    public final Object k(Object obj) {
        return ((o) this).j().call();
    }
}
