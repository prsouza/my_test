package t4;

import java.util.Objects;
import q4.a;
import q4.b;
import q4.c;
import q4.d;
import q4.e;
import q4.f;
import q4.h;
import t4.h;
import t4.i;
import t4.m;
import t4.q;

public final class t<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q f11389a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11390b;

    /* renamed from: c  reason: collision with root package name */
    public final b f11391c;

    /* renamed from: d  reason: collision with root package name */
    public final e<T, byte[]> f11392d;

    /* renamed from: e  reason: collision with root package name */
    public final u f11393e;

    public t(q qVar, String str, b bVar, e<T, byte[]> eVar, u uVar) {
        this.f11389a = qVar;
        this.f11390b = str;
        this.f11391c = bVar;
        this.f11392d = eVar;
        this.f11393e = uVar;
    }

    public final void a(c<T> cVar, h hVar) {
        u uVar = this.f11393e;
        q qVar = this.f11389a;
        Objects.requireNonNull(qVar, "Null transportContext");
        String str = this.f11390b;
        Objects.requireNonNull(str, "Null transportName");
        e<T, byte[]> eVar = this.f11392d;
        Objects.requireNonNull(eVar, "Null transformer");
        b bVar = this.f11391c;
        Objects.requireNonNull(bVar, "Null encoding");
        v vVar = (v) uVar;
        y4.e eVar2 = vVar.f11397c;
        a aVar = (a) cVar;
        d dVar = aVar.f10301b;
        q.a a10 = q.a();
        a10.a(qVar.b());
        i.a aVar2 = (i.a) a10;
        Objects.requireNonNull(dVar, "Null priority");
        aVar2.f11368c = dVar;
        aVar2.f11367b = qVar.c();
        q b10 = aVar2.b();
        m.a a11 = m.a();
        a11.e(vVar.f11395a.a());
        a11.g(vVar.f11396b.a());
        h.b bVar2 = (h.b) a11;
        bVar2.f11357a = str;
        bVar2.f11359c = new l(bVar, eVar.apply(aVar.f10300a));
        bVar2.f11358b = null;
        eVar2.a(b10, bVar2.c(), hVar);
    }
}
