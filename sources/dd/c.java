package dd;

import android.support.v4.media.b;
import dd.d;
import de.h;
import e6.e;
import ed.f;

public final class c<S extends d<S>, T> {

    /* renamed from: a  reason: collision with root package name */
    public b<T> f4451a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4452b;

    /* renamed from: c  reason: collision with root package name */
    public final S f4453c;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<dd.b<?>>, java.util.ArrayList] */
    public c(b bVar, S s10, T t10) {
        e.D(s10, "schema");
        this.f4452b = bVar;
        this.f4453c = s10;
        b<T> bVar2 = new b<>(bVar, t10);
        s10.f4454a.add(bVar2);
        this.f4451a = bVar2;
    }

    public final b<T> a(d<S> dVar, h<?> hVar) {
        e.D(dVar, "thisRef");
        e.D(hVar, "property");
        return this.f4451a;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<dd.b<?>>, java.util.ArrayList] */
    public final a9.c b() {
        this.f4453c.f4454a.remove(this.f4451a);
        return new a9.c(new f(this.f4452b), this.f4453c, this.f4451a.f4450b);
    }
}
