package ed;

import android.support.v4.media.b;
import ca.c;
import e6.e;
import java.util.Objects;

public final class f<T> extends b {

    /* renamed from: v  reason: collision with root package name */
    public final b f4806v;

    public f(b bVar) {
        e.D(bVar, "dataType");
        this.f4806v = bVar;
    }

    public final boolean J(Object obj) {
        return obj == null || this.f4806v.J(obj);
    }

    public final void b(c cVar, T t10) {
        e.D(cVar, "writer");
        b bVar = this.f4806v;
        if (bVar instanceof b) {
            ea.b bVar2 = new ea.b();
            Objects.requireNonNull(t10, "null cannot be cast to non-null type kotlin.Boolean");
            cVar.e(bVar2, (Boolean) t10);
            return;
        }
        cVar.e(bVar, t10);
    }

    public final T g(ca.b bVar) {
        e.D(bVar, "reader");
        if (this.f4806v instanceof b) {
            byte b10 = bVar.b();
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.FALSE;
            }
            if (b10 == 2) {
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException("Not a optional boolean");
        } else if (bVar.a()) {
            return this.f4806v.g(bVar);
        } else {
            return null;
        }
    }
}
