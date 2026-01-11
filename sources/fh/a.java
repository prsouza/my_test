package fh;

import ag.a1;
import ag.k;
import ag.m;
import ag.o;
import ag.s;
import ag.t;
import ag.w0;
import wh.b;
import wh.d;
import wh.e;

public final class a extends m {

    /* renamed from: a  reason: collision with root package name */
    public int f5130a;

    /* renamed from: b  reason: collision with root package name */
    public int f5131b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f5132c;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f5133s;

    /* renamed from: t  reason: collision with root package name */
    public byte[] f5134t;

    /* renamed from: u  reason: collision with root package name */
    public jg.a f5135u;

    public a(int i, int i10, b bVar, e eVar, d dVar, jg.a aVar) {
        this.f5130a = i;
        this.f5131b = i10;
        this.f5132c = bVar.a();
        this.f5133s = eVar.f();
        this.f5134t = dVar.a();
        this.f5135u = aVar;
    }

    public a(t tVar) {
        this.f5130a = ((k) tVar.s(0)).v();
        this.f5131b = ((k) tVar.s(1)).v();
        this.f5132c = ((o) tVar.s(2)).f430a;
        this.f5133s = ((o) tVar.s(3)).f430a;
        this.f5134t = ((o) tVar.s(4)).f430a;
        this.f5135u = jg.a.j(tVar.s(5));
    }

    public final s d() {
        ag.e eVar = new ag.e();
        eVar.a(new k((long) this.f5130a));
        eVar.a(new k((long) this.f5131b));
        eVar.a(new w0(this.f5132c));
        eVar.a(new w0(this.f5133s));
        eVar.a(new w0(this.f5134t));
        eVar.a(this.f5135u);
        return new a1(eVar);
    }
}
