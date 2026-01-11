package q2;

import a3.f;
import a9.c;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o2.l;
import o2.p;
import r2.a;
import t2.e;
import v2.j;
import v2.q;
import w2.b;

public final class n implements a.C0206a, j, l {

    /* renamed from: a  reason: collision with root package name */
    public final Path f10265a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f10266b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final String f10267c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10268d;

    /* renamed from: e  reason: collision with root package name */
    public final l f10269e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, PointF> f10270f;
    public final a<?, PointF> g;

    /* renamed from: h  reason: collision with root package name */
    public final a<?, Float> f10271h;
    public c i = new c(1);

    /* renamed from: j  reason: collision with root package name */
    public boolean f10272j;

    public n(l lVar, b bVar, j jVar) {
        this.f10267c = jVar.f12217a;
        this.f10268d = jVar.f12221e;
        this.f10269e = lVar;
        a<PointF, PointF> a10 = jVar.f12218b.a();
        this.f10270f = a10;
        a<PointF, PointF> a11 = jVar.f12219c.a();
        this.g = (r2.j) a11;
        a<Float, Float> a12 = jVar.f12220d.a();
        this.f10271h = (r2.c) a12;
        bVar.d(a10);
        bVar.d(a11);
        bVar.d(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    public final void b() {
        this.f10272j = false;
        this.f10269e.invalidateSelf();
    }

    public final void c(List<b> list, List<b> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                b bVar = (b) arrayList.get(i10);
                if (bVar instanceof r) {
                    r rVar = (r) bVar;
                    if (rVar.f10294c == q.a.SIMULTANEOUSLY) {
                        this.i.d(rVar);
                        rVar.d(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final <T> void f(T t10, b3.c cVar) {
        if (t10 == p.f9275h) {
            this.g.j(cVar);
        } else if (t10 == p.f9276j) {
            this.f10270f.j(cVar);
        } else if (t10 == p.i) {
            this.f10271h.j(cVar);
        }
    }

    public final void g(e eVar, int i10, List<e> list, e eVar2) {
        f.e(eVar, i10, list, eVar2, this);
    }

    public final String getName() {
        return this.f10267c;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [r2.c, r2.a<?, java.lang.Float>] */
    public final Path getPath() {
        float f10;
        if (this.f10272j) {
            return this.f10265a;
        }
        this.f10265a.reset();
        if (this.f10268d) {
            this.f10272j = true;
            return this.f10265a;
        }
        PointF f11 = this.g.f();
        float f12 = f11.x / 2.0f;
        float f13 = f11.y / 2.0f;
        ? r42 = this.f10271h;
        if (r42 == 0) {
            f10 = 0.0f;
        } else {
            f10 = r42.k();
        }
        float min = Math.min(f12, f13);
        if (f10 > min) {
            f10 = min;
        }
        PointF f14 = this.f10270f.f();
        this.f10265a.moveTo(f14.x + f12, (f14.y - f13) + f10);
        this.f10265a.lineTo(f14.x + f12, (f14.y + f13) - f10);
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF = this.f10266b;
            float f15 = f14.x + f12;
            float f16 = f10 * 2.0f;
            float f17 = f14.y + f13;
            rectF.set(f15 - f16, f17 - f16, f15, f17);
            this.f10265a.arcTo(this.f10266b, 0.0f, 90.0f, false);
        }
        this.f10265a.lineTo((f14.x - f12) + f10, f14.y + f13);
        if (i10 > 0) {
            RectF rectF2 = this.f10266b;
            float f18 = f14.x - f12;
            float f19 = f14.y + f13;
            float f20 = f10 * 2.0f;
            rectF2.set(f18, f19 - f20, f20 + f18, f19);
            this.f10265a.arcTo(this.f10266b, 90.0f, 90.0f, false);
        }
        this.f10265a.lineTo(f14.x - f12, (f14.y - f13) + f10);
        if (i10 > 0) {
            RectF rectF3 = this.f10266b;
            float f21 = f14.x - f12;
            float f22 = f14.y - f13;
            float f23 = f10 * 2.0f;
            rectF3.set(f21, f22, f21 + f23, f23 + f22);
            this.f10265a.arcTo(this.f10266b, 180.0f, 90.0f, false);
        }
        this.f10265a.lineTo((f14.x + f12) - f10, f14.y - f13);
        if (i10 > 0) {
            RectF rectF4 = this.f10266b;
            float f24 = f14.x + f12;
            float f25 = f10 * 2.0f;
            float f26 = f14.y - f13;
            rectF4.set(f24 - f25, f26, f24, f25 + f26);
            this.f10265a.arcTo(this.f10266b, 270.0f, 90.0f, false);
        }
        this.f10265a.close();
        this.i.e(this.f10265a);
        this.f10272j = true;
        return this.f10265a;
    }
}
