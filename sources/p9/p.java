package p9;

import a.b;
import androidx.activity.result.d;
import i2.a0;
import i2.j;
import i2.z;
import x9.a;

public final class p implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f9802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f9803b;

    public p(Class cls, z zVar) {
        this.f9802a = cls;
        this.f9803b = zVar;
    }

    public final <T> z<T> create(j jVar, a<T> aVar) {
        if (aVar.f13148a == this.f9802a) {
            return this.f9803b;
        }
        return null;
    }

    public final String toString() {
        StringBuilder q10 = b.q("Factory[type=");
        d.h(this.f9802a, q10, ",adapter=");
        q10.append(this.f9803b);
        q10.append("]");
        return q10.toString();
    }
}
