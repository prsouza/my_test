package q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import r2.a;
import r2.c;
import v2.q;
import w2.b;

public final class r implements b, a.C0206a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10292a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a.C0206a> f10293b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final q.a f10294c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Float> f10295d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, Float> f10296e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f10297f;

    public r(b bVar, q qVar) {
        Objects.requireNonNull(qVar);
        this.f10292a = qVar.f12258f;
        this.f10294c = qVar.f12254b;
        a<Float, Float> a10 = qVar.f12255c.a();
        this.f10295d = (c) a10;
        a<Float, Float> a11 = qVar.f12256d.a();
        this.f10296e = (c) a11;
        a<Float, Float> a12 = qVar.f12257e.a();
        this.f10297f = (c) a12;
        bVar.d(a10);
        bVar.d(a11);
        bVar.d(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<r2.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<r2.a$a>, java.util.ArrayList] */
    public final void b() {
        for (int i = 0; i < this.f10293b.size(); i++) {
            ((a.C0206a) this.f10293b.get(i)).b();
        }
    }

    public final void c(List<b> list, List<b> list2) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<r2.a$a>, java.util.ArrayList] */
    public final void d(a.C0206a aVar) {
        this.f10293b.add(aVar);
    }
}
