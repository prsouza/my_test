package f2;

import f2.a;
import java.util.Objects;

public final class c<V> extends a<V> {
    public final boolean j(V v10) {
        if (v10 == null) {
            v10 = a.f4913v;
        }
        if (!a.f4912u.b(this, (Object) null, v10)) {
            return false;
        }
        a.b(this);
        return true;
    }

    public final boolean k(Throwable th2) {
        Objects.requireNonNull(th2);
        if (!a.f4912u.b(this, (Object) null, new a.c(th2))) {
            return false;
        }
        a.b(this);
        return true;
    }

    public final boolean l(z6.a<? extends V> aVar) {
        a.f fVar;
        a.c cVar;
        Objects.requireNonNull(aVar);
        Object obj = this.f4914a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!a.f4912u.b(this, (Object) null, a.f(aVar))) {
                    return false;
                }
                a.b(this);
            } else {
                fVar = new a.f(this, aVar);
                if (a.f4912u.b(this, (Object) null, fVar)) {
                    try {
                        aVar.d(fVar, b.INSTANCE);
                    } catch (Throwable unused) {
                        cVar = a.c.f4921b;
                    }
                } else {
                    obj = this.f4914a;
                }
            }
            return true;
        }
        if (!(obj instanceof a.b)) {
            return false;
        }
        aVar.cancel(((a.b) obj).f4919a);
        return false;
        a.f4912u.b(this, fVar, cVar);
        return true;
    }
}
