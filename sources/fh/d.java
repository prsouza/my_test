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

public final class d extends m {

    /* renamed from: a  reason: collision with root package name */
    public final int f5147a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5148b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5149c;

    public d(int i, int i10, a aVar) {
        this.f5147a = i;
        this.f5148b = i10;
        this.f5149c = new a(aVar);
    }

    public d(t tVar) {
        this.f5147a = ((k) tVar.s(0)).v();
        this.f5148b = ((k) tVar.s(1)).v();
        this.f5149c = new a(((o) tVar.s(2)).f430a);
    }

    public final s d() {
        e eVar = new e();
        eVar.a(new k((long) this.f5147a));
        eVar.a(new k((long) this.f5148b));
        eVar.a(new w0(this.f5149c.a()));
        return new a1(eVar);
    }
}
