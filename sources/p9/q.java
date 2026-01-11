package p9;

import a.b;
import androidx.activity.result.d;
import i2.a0;
import i2.j;
import i2.z;
import org.slf4j.Marker;
import x9.a;

public final class q implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f9804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f9805b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z f9806c;

    public q(Class cls, Class cls2, z zVar) {
        this.f9804a = cls;
        this.f9805b = cls2;
        this.f9806c = zVar;
    }

    public final <T> z<T> create(j jVar, a<T> aVar) {
        Class<? super T> cls = aVar.f13148a;
        if (cls == this.f9804a || cls == this.f9805b) {
            return this.f9806c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder q10 = b.q("Factory[type=");
        d.h(this.f9805b, q10, Marker.ANY_NON_NULL_MARKER);
        d.h(this.f9804a, q10, ",adapter=");
        q10.append(this.f9806c);
        q10.append("]");
        return q10.toString();
    }
}
