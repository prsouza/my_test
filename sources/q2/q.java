package q2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import b3.c;
import o2.l;
import r2.a;
import v2.p;
import w2.b;

public final class q extends a {

    /* renamed from: o  reason: collision with root package name */
    public final b f10287o;

    /* renamed from: p  reason: collision with root package name */
    public final String f10288p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f10289q;

    /* renamed from: r  reason: collision with root package name */
    public final a<Integer, Integer> f10290r;

    /* renamed from: s  reason: collision with root package name */
    public a<ColorFilter, ColorFilter> f10291s;

    public q(l lVar, b bVar, p pVar) {
        super(lVar, bVar, pVar.g.toPaintCap(), pVar.f12249h.toPaintJoin(), pVar.i, pVar.f12247e, pVar.f12248f, pVar.f12245c, pVar.f12244b);
        this.f10287o = bVar;
        this.f10288p = pVar.f12243a;
        this.f10289q = pVar.f12250j;
        a<Integer, Integer> a10 = pVar.f12246d.a();
        this.f10290r = (r2.b) a10;
        a10.a(this);
        bVar.d(a10);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [r2.b, r2.a, r2.a<java.lang.Integer, java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r0v2, types: [r2.p, r2.a<android.graphics.ColorFilter, android.graphics.ColorFilter>] */
    public final void e(Canvas canvas, Matrix matrix, int i) {
        if (!this.f10289q) {
            p2.a aVar = this.i;
            ? r12 = this.f10290r;
            aVar.setColor(r12.k(r12.b(), r12.d()));
            ? r02 = this.f10291s;
            if (r02 != 0) {
                this.i.setColorFilter((ColorFilter) r02.f());
            }
            super.e(canvas, matrix, i);
        }
    }

    public final <T> void f(T t10, c cVar) {
        super.f(t10, cVar);
        if (t10 == o2.p.f9270b) {
            this.f10290r.j(cVar);
        } else if (t10 == o2.p.C) {
            a<ColorFilter, ColorFilter> aVar = this.f10291s;
            if (aVar != null) {
                this.f10287o.n(aVar);
            }
            if (cVar == null) {
                this.f10291s = null;
                return;
            }
            r2.p pVar = new r2.p(cVar, null);
            this.f10291s = pVar;
            pVar.a(this);
            this.f10287o.d(this.f10290r);
        }
    }

    public final String getName() {
        return this.f10288p;
    }
}
