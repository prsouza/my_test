package fh;

import ag.a1;
import ag.k;
import ag.m;
import ag.o;
import ag.s;
import ag.t;
import ag.w0;
import wh.a;
import wh.b;
import wh.d;
import wh.e;

public final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    public int f5140a;

    /* renamed from: b  reason: collision with root package name */
    public int f5141b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f5142c;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f5143s;

    /* renamed from: t  reason: collision with root package name */
    public byte[] f5144t;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f5145u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f5146v;

    public c(int i, int i10, b bVar, e eVar, d dVar, d dVar2, a aVar) {
        this.f5140a = i;
        this.f5141b = i10;
        this.f5142c = bVar.a();
        this.f5143s = eVar.f();
        this.f5144t = aVar.a();
        this.f5145u = dVar.a();
        this.f5146v = dVar2.a();
    }

    public c(t tVar) {
        this.f5140a = ((k) tVar.s(0)).v();
        this.f5141b = ((k) tVar.s(1)).v();
        this.f5142c = ((o) tVar.s(2)).f430a;
        this.f5143s = ((o) tVar.s(3)).f430a;
        this.f5145u = ((o) tVar.s(4)).f430a;
        this.f5146v = ((o) tVar.s(5)).f430a;
        this.f5144t = ((o) tVar.s(6)).f430a;
    }

    public final s d() {
        ag.e eVar = new ag.e();
        eVar.a(new k((long) this.f5140a));
        eVar.a(new k((long) this.f5141b));
        eVar.a(new w0(this.f5142c));
        eVar.a(new w0(this.f5143s));
        eVar.a(new w0(this.f5145u));
        eVar.a(new w0(this.f5146v));
        eVar.a(new w0(this.f5144t));
        return new a1(eVar);
    }
}
