package yd;

import de.a;
import de.f;
import de.g;
import de.h;
import java.util.Objects;

public abstract class i extends k implements f {
    public i(Class cls, String str, String str2) {
        super(cls, str, str2);
    }

    public final a b() {
        Objects.requireNonNull(v.f13623a);
        return this;
    }

    public final g.a j() {
        a a10 = a();
        if (a10 != this) {
            return ((f) ((h) a10)).j();
        }
        throw new wd.a();
    }

    public final Object k(Object obj) {
        return ((j) this).j().call();
    }
}
