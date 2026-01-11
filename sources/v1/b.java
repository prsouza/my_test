package v1;

import androidx.lifecycle.j0;
import f2.c;
import u1.s;

public final class b implements s {

    /* renamed from: c  reason: collision with root package name */
    public final j0<s.b> f12127c = new j0<>();

    /* renamed from: d  reason: collision with root package name */
    public final c<s.b.c> f12128d = new c<>();

    public b() {
        a(s.f11654b);
    }

    public final void a(s.b bVar) {
        this.f12127c.k(bVar);
        if (bVar instanceof s.b.c) {
            this.f12128d.j((s.b.c) bVar);
        } else if (bVar instanceof s.b.a) {
            this.f12128d.k(((s.b.a) bVar).f11655a);
        }
    }
}
