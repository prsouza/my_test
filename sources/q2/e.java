package q2;

import a3.f;
import a9.c;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import o2.l;
import o2.p;
import r2.a;
import r2.j;
import v2.q;
import w2.b;

public final class e implements l, a.C0206a, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f10204a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f10205b;

    /* renamed from: c  reason: collision with root package name */
    public final l f10206c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, PointF> f10207d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, PointF> f10208e;

    /* renamed from: f  reason: collision with root package name */
    public final v2.a f10209f;
    public c g = new c(1);

    /* renamed from: h  reason: collision with root package name */
    public boolean f10210h;

    public e(l lVar, b bVar, v2.a aVar) {
        this.f10205b = aVar.f12177a;
        this.f10206c = lVar;
        a<PointF, PointF> a10 = aVar.f12179c.a();
        this.f10207d = (j) a10;
        a<PointF, PointF> a11 = aVar.f12178b.a();
        this.f10208e = a11;
        this.f10209f = aVar;
        bVar.d(a10);
        bVar.d(a11);
        a10.a(this);
        a11.a(this);
    }

    public final void b() {
        this.f10210h = false;
        this.f10206c.invalidateSelf();
    }

    public final void c(List<b> list, List<b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                b bVar = (b) arrayList.get(i);
                if (bVar instanceof r) {
                    r rVar = (r) bVar;
                    if (rVar.f10294c == q.a.SIMULTANEOUSLY) {
                        this.g.d(rVar);
                        rVar.d(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final <T> void f(T t10, b3.c cVar) {
        if (t10 == p.g) {
            this.f10207d.j(cVar);
        } else if (t10 == p.f9276j) {
            this.f10208e.j(cVar);
        }
    }

    public final void g(t2.e eVar, int i, List<t2.e> list, t2.e eVar2) {
        f.e(eVar, i, list, eVar2, this);
    }

    public final String getName() {
        return this.f10205b;
    }

    public final Path getPath() {
        if (this.f10210h) {
            return this.f10204a;
        }
        this.f10204a.reset();
        if (this.f10209f.f12181e) {
            this.f10210h = true;
            return this.f10204a;
        }
        PointF f10 = this.f10207d.f();
        float f11 = f10.x / 2.0f;
        float f12 = f10.y / 2.0f;
        float f13 = f11 * 0.55228f;
        float f14 = 0.55228f * f12;
        this.f10204a.reset();
        if (this.f10209f.f12180d) {
            float f15 = -f12;
            this.f10204a.moveTo(0.0f, f15);
            float f16 = 0.0f - f13;
            float f17 = -f11;
            float f18 = 0.0f - f14;
            this.f10204a.cubicTo(f16, f15, f17, f18, f17, 0.0f);
            float f19 = f14 + 0.0f;
            float f20 = f15;
            this.f10204a.cubicTo(f17, f19, f16, f12, 0.0f, f12);
            float f21 = f13 + 0.0f;
            this.f10204a.cubicTo(f21, f12, f11, f19, f11, 0.0f);
            this.f10204a.cubicTo(f11, f18, f21, f20, 0.0f, f20);
        } else {
            float f22 = -f12;
            this.f10204a.moveTo(0.0f, f22);
            float f23 = f13 + 0.0f;
            float f24 = 0.0f - f14;
            this.f10204a.cubicTo(f23, f22, f11, f24, f11, 0.0f);
            float f25 = f14 + 0.0f;
            this.f10204a.cubicTo(f11, f25, f23, f12, 0.0f, f12);
            float f26 = 0.0f - f13;
            float f27 = -f11;
            this.f10204a.cubicTo(f26, f12, f27, f25, f27, 0.0f);
            float f28 = f22;
            this.f10204a.cubicTo(f27, f24, f26, f28, 0.0f, f28);
        }
        PointF f29 = this.f10208e.f();
        this.f10204a.offset(f29.x, f29.y);
        this.f10204a.close();
        this.g.e(this.f10204a);
        this.f10210h = true;
        return this.f10204a;
    }
}
