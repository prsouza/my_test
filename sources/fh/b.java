package fh;

import ag.a1;
import ag.e;
import ag.k;
import ag.m;
import ag.o;
import ag.s;
import ag.t;
import ag.w0;
import wh.a;

public final class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public final int f5136a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5137b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5138c;

    /* renamed from: s  reason: collision with root package name */
    public final jg.a f5139s;

    public b(int i, int i10, a aVar, jg.a aVar2) {
        this.f5136a = i;
        this.f5137b = i10;
        this.f5138c = new a(aVar.a());
        this.f5139s = aVar2;
    }

    public b(t tVar) {
        this.f5136a = ((k) tVar.s(0)).v();
        this.f5137b = ((k) tVar.s(1)).v();
        this.f5138c = new a(((o) tVar.s(2)).f430a);
        this.f5139s = jg.a.j(tVar.s(3));
    }

    public final s d() {
        e eVar = new e();
        eVar.a(new k((long) this.f5136a));
        eVar.a(new k((long) this.f5137b));
        eVar.a(new w0(this.f5138c.a()));
        eVar.a(this.f5139s);
        return new a1(eVar);
    }
}
