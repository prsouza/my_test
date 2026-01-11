package p9;

import a.b;
import androidx.activity.result.d;
import i2.a0;
import i2.j;
import i2.z;
import org.slf4j.Marker;
import x9.a;

public final class s implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f9809a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f9810b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z f9811c;

    public s(Class cls, Class cls2, z zVar) {
        this.f9809a = cls;
        this.f9810b = cls2;
        this.f9811c = zVar;
    }

    public final <T> z<T> create(j jVar, a<T> aVar) {
        Class<? super T> cls = aVar.f13148a;
        if (cls == this.f9809a || cls == this.f9810b) {
            return this.f9811c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder q10 = b.q("Factory[type=");
        d.h(this.f9809a, q10, Marker.ANY_NON_NULL_MARKER);
        d.h(this.f9810b, q10, ",adapter=");
        q10.append(this.f9811c);
        q10.append("]");
        return q10.toString();
    }
}
