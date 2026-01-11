package q2;

import ad.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o2.l;
import o2.p;
import r2.a;
import r2.e;
import v2.m;
import w2.b;

public final class f implements d, a.C0206a, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f10211a;

    /* renamed from: b  reason: collision with root package name */
    public final p2.a f10212b = new p2.a(1);

    /* renamed from: c  reason: collision with root package name */
    public final b f10213c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10214d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10215e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f10216f = new ArrayList();
    public final a<Integer, Integer> g;

    /* renamed from: h  reason: collision with root package name */
    public final a<Integer, Integer> f10217h;
    public a<ColorFilter, ColorFilter> i;

    /* renamed from: j  reason: collision with root package name */
    public final l f10218j;

    public f(l lVar, b bVar, m mVar) {
        Path path = new Path();
        this.f10211a = path;
        this.f10213c = bVar;
        this.f10214d = mVar.f12232c;
        this.f10215e = mVar.f12235f;
        this.f10218j = lVar;
        if (mVar.f12233d == null || mVar.f12234e == null) {
            this.g = null;
            this.f10217h = null;
            return;
        }
        path.setFillType(mVar.f12231b);
        a<Integer, Integer> a10 = mVar.f12233d.a();
        this.g = (r2.b) a10;
        a10.a(this);
        bVar.d(a10);
        a<Integer, Integer> a11 = mVar.f12234e.a();
        this.f10217h = (e) a11;
        a11.a(this);
        bVar.d(a11);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.f10211a.reset();
        for (int i10 = 0; i10 < this.f10216f.size(); i10++) {
            this.f10211a.addPath(((l) this.f10216f.get(i10)).getPath(), matrix);
        }
        this.f10211a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void b() {
        this.f10218j.invalidateSelf();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final void c(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b bVar = list2.get(i10);
            if (bVar instanceof l) {
                this.f10216f.add((l) bVar);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [r2.b, r2.a, r2.a<java.lang.Integer, java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r7v8, types: [r2.p, r2.a<android.graphics.ColorFilter, android.graphics.ColorFilter>] */
    /* JADX WARNING: type inference failed for: r7v10, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final void e(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f10215e) {
            p2.a aVar = this.f10212b;
            ? r12 = this.g;
            aVar.setColor(r12.k(r12.b(), r12.d()));
            this.f10212b.setAlpha(a3.f.c((int) ((((((float) i10) / 255.0f) * ((float) this.f10217h.f().intValue())) / 100.0f) * 255.0f)));
            ? r72 = this.i;
            if (r72 != 0) {
                this.f10212b.setColorFilter((ColorFilter) r72.f());
            }
            this.f10211a.reset();
            for (int i11 = 0; i11 < this.f10216f.size(); i11++) {
                this.f10211a.addPath(((l) this.f10216f.get(i11)).getPath(), matrix);
            }
            canvas.drawPath(this.f10211a, this.f10212b);
            c.E();
        }
    }

    public final <T> void f(T t10, b3.c cVar) {
        if (t10 == p.f9269a) {
            this.g.j(cVar);
        } else if (t10 == p.f9272d) {
            this.f10217h.j(cVar);
        } else if (t10 == p.C) {
            a<ColorFilter, ColorFilter> aVar = this.i;
            if (aVar != null) {
                this.f10213c.n(aVar);
            }
            if (cVar == null) {
                this.i = null;
                return;
            }
            r2.p pVar = new r2.p(cVar, null);
            this.i = pVar;
            pVar.a(this);
            this.f10213c.d(this.i);
        }
    }

    public final void g(t2.e eVar, int i10, List<t2.e> list, t2.e eVar2) {
        a3.f.e(eVar, i10, list, eVar2, this);
    }

    public final String getName() {
        return this.f10214d;
    }
}
