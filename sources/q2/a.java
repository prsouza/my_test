package q2;

import a3.f;
import a3.g;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o2.l;
import o2.p;
import r2.a;
import r2.c;
import r2.e;
import u2.d;
import v2.q;
import w2.b;

public abstract class a implements a.C0206a, j, d {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f10181a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f10182b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f10183c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f10184d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final l f10185e;

    /* renamed from: f  reason: collision with root package name */
    public final b f10186f;
    public final List<C0197a> g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f10187h;
    public final p2.a i;

    /* renamed from: j  reason: collision with root package name */
    public final r2.a<?, Float> f10188j;

    /* renamed from: k  reason: collision with root package name */
    public final r2.a<?, Integer> f10189k;

    /* renamed from: l  reason: collision with root package name */
    public final List<r2.a<?, Float>> f10190l;

    /* renamed from: m  reason: collision with root package name */
    public final r2.a<?, Float> f10191m;

    /* renamed from: n  reason: collision with root package name */
    public r2.a<ColorFilter, ColorFilter> f10192n;

    /* renamed from: q2.a$a  reason: collision with other inner class name */
    public static final class C0197a {

        /* renamed from: a  reason: collision with root package name */
        public final List<l> f10193a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final r f10194b;

        public C0197a(r rVar) {
            this.f10194b = rVar;
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.List<r2.a<?, java.lang.Float>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.List<r2.a<?, java.lang.Float>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.util.List<r2.a<?, java.lang.Float>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v7, types: [java.util.List<r2.a<?, java.lang.Float>>, java.util.ArrayList] */
    public a(l lVar, b bVar, Paint.Cap cap, Paint.Join join, float f10, d dVar, u2.b bVar2, List<u2.b> list, u2.b bVar3) {
        p2.a aVar = new p2.a(1);
        this.i = aVar;
        this.f10185e = lVar;
        this.f10186f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f10189k = (e) dVar.a();
        this.f10188j = (c) bVar2.a();
        if (bVar3 == null) {
            this.f10191m = null;
        } else {
            this.f10191m = (c) bVar3.a();
        }
        this.f10190l = new ArrayList(list.size());
        this.f10187h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f10190l.add(list.get(i10).a());
        }
        bVar.d(this.f10189k);
        bVar.d(this.f10188j);
        for (int i11 = 0; i11 < this.f10190l.size(); i11++) {
            bVar.d((r2.a) this.f10190l.get(i11));
        }
        r2.a<?, Float> aVar2 = this.f10191m;
        if (aVar2 != null) {
            bVar.d(aVar2);
        }
        this.f10189k.a(this);
        this.f10188j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((r2.a) this.f10190l.get(i12)).a(this);
        }
        r2.a<?, Float> aVar3 = this.f10191m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<q2.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v2, types: [r2.c, r2.a<?, java.lang.Float>] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.List<q2.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.f10182b.reset();
        for (int i10 = 0; i10 < this.g.size(); i10++) {
            C0197a aVar = (C0197a) this.g.get(i10);
            for (int i11 = 0; i11 < aVar.f10193a.size(); i11++) {
                this.f10182b.addPath(((l) aVar.f10193a.get(i11)).getPath(), matrix);
            }
        }
        this.f10182b.computeBounds(this.f10184d, false);
        float k10 = this.f10188j.k();
        RectF rectF2 = this.f10184d;
        float f10 = k10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f10184d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ad.c.E();
    }

    public final void b() {
        this.f10185e.invalidateSelf();
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [java.util.List<q2.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<q2.a$a>, java.util.ArrayList] */
    public final void c(List<b> list, List<b> list2) {
        ArrayList arrayList = (ArrayList) list;
        C0197a aVar = null;
        r rVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList.get(size);
            if (bVar instanceof r) {
                r rVar2 = (r) bVar;
                if (rVar2.f10294c == q.a.INDIVIDUALLY) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            b bVar2 = list2.get(size2);
            if (bVar2 instanceof r) {
                r rVar3 = (r) bVar2;
                if (rVar3.f10294c == q.a.INDIVIDUALLY) {
                    if (aVar != null) {
                        this.g.add(aVar);
                    }
                    C0197a aVar2 = new C0197a(rVar3);
                    rVar3.d(this);
                    aVar = aVar2;
                }
            }
            if (bVar2 instanceof l) {
                if (aVar == null) {
                    aVar = new C0197a(rVar);
                }
                aVar.f10193a.add((l) bVar2);
            }
        }
        if (aVar != null) {
            this.g.add(aVar);
        }
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [r2.e, r2.a<?, java.lang.Integer>, r2.a] */
    /* JADX WARNING: type inference failed for: r7v5, types: [r2.c, r2.a<?, java.lang.Float>] */
    /* JADX WARNING: type inference failed for: r3v16, types: [java.util.List<r2.a<?, java.lang.Float>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v18, types: [r2.p, r2.a<android.graphics.ColorFilter, android.graphics.ColorFilter>] */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.util.List<q2.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v7, types: [java.util.List<q2.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v8, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r11v10, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v12, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v9, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v12, types: [java.util.List<r2.a<?, java.lang.Float>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r11v19, types: [java.util.List<r2.a<?, java.lang.Float>>, java.util.ArrayList] */
    public void e(Canvas canvas, Matrix matrix, int i10) {
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        float[] fArr = g.f53d.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix2.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            ad.c.E();
            return;
        }
        ? r82 = this.f10189k;
        float k10 = (((float) i10) / 255.0f) * ((float) r82.k(r82.b(), r82.d()));
        float f10 = 100.0f;
        this.i.setAlpha(f.c((int) ((k10 / 100.0f) * 255.0f)));
        this.i.setStrokeWidth(g.d(matrix) * this.f10188j.k());
        if (this.i.getStrokeWidth() <= 0.0f) {
            ad.c.E();
            return;
        }
        float f11 = 1.0f;
        if (this.f10190l.isEmpty()) {
            ad.c.E();
        } else {
            float d10 = g.d(matrix);
            for (int i11 = 0; i11 < this.f10190l.size(); i11++) {
                this.f10187h[i11] = ((Float) ((r2.a) this.f10190l.get(i11)).f()).floatValue();
                if (i11 % 2 == 0) {
                    float[] fArr2 = this.f10187h;
                    if (fArr2[i11] < 1.0f) {
                        fArr2[i11] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f10187h;
                    if (fArr3[i11] < 0.1f) {
                        fArr3[i11] = 0.1f;
                    }
                }
                float[] fArr4 = this.f10187h;
                fArr4[i11] = fArr4[i11] * d10;
            }
            r2.a<?, Float> aVar = this.f10191m;
            this.i.setPathEffect(new DashPathEffect(this.f10187h, aVar == null ? 0.0f : aVar.f().floatValue() * d10));
            ad.c.E();
        }
        ? r32 = this.f10192n;
        if (r32 != 0) {
            this.i.setColorFilter((ColorFilter) r32.f());
        }
        int i12 = 0;
        while (i12 < this.g.size()) {
            C0197a aVar2 = (C0197a) this.g.get(i12);
            if (aVar2.f10194b != null) {
                this.f10182b.reset();
                int size = aVar2.f10193a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f10182b.addPath(((l) aVar2.f10193a.get(size)).getPath(), matrix2);
                }
                this.f10181a.setPath(this.f10182b, z);
                float length = this.f10181a.getLength();
                while (this.f10181a.nextContour()) {
                    length += this.f10181a.getLength();
                }
                float floatValue = (aVar2.f10194b.f10297f.f().floatValue() * length) / 360.0f;
                float floatValue2 = ((aVar2.f10194b.f10295d.f().floatValue() * length) / f10) + floatValue;
                float floatValue3 = ((aVar2.f10194b.f10296e.f().floatValue() * length) / f10) + floatValue;
                int size2 = aVar2.f10193a.size() - 1;
                float f12 = 0.0f;
                while (size2 >= 0) {
                    this.f10183c.set(((l) aVar2.f10193a.get(size2)).getPath());
                    this.f10183c.transform(matrix2);
                    this.f10181a.setPath(this.f10183c, z);
                    float length2 = this.f10181a.getLength();
                    if (floatValue3 > length) {
                        float f13 = floatValue3 - length;
                        if (f13 < f12 + length2 && f12 < f13) {
                            g.a(this.f10183c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f13 / length2, f11), 0.0f);
                            canvas2.drawPath(this.f10183c, this.i);
                            f12 += length2;
                            size2--;
                            z = false;
                            f11 = 1.0f;
                        }
                    }
                    float f14 = f12 + length2;
                    if (f14 >= floatValue2 && f12 <= floatValue3) {
                        if (f14 > floatValue3 || floatValue2 >= f12) {
                            g.a(this.f10183c, floatValue2 < f12 ? 0.0f : (floatValue2 - f12) / length2, floatValue3 > f14 ? 1.0f : (floatValue3 - f12) / length2, 0.0f);
                            canvas2.drawPath(this.f10183c, this.i);
                        } else {
                            canvas2.drawPath(this.f10183c, this.i);
                        }
                    }
                    f12 += length2;
                    size2--;
                    z = false;
                    f11 = 1.0f;
                }
                ad.c.E();
            } else {
                this.f10182b.reset();
                for (int size3 = aVar2.f10193a.size() - 1; size3 >= 0; size3--) {
                    this.f10182b.addPath(((l) aVar2.f10193a.get(size3)).getPath(), matrix2);
                }
                ad.c.E();
                canvas2.drawPath(this.f10182b, this.i);
                ad.c.E();
            }
            i12++;
            z = false;
            f11 = 1.0f;
            f10 = 100.0f;
        }
        ad.c.E();
    }

    public <T> void f(T t10, b3.c cVar) {
        if (t10 == p.f9272d) {
            this.f10189k.j(cVar);
        } else if (t10 == p.f9281o) {
            this.f10188j.j(cVar);
        } else if (t10 == p.C) {
            r2.a<ColorFilter, ColorFilter> aVar = this.f10192n;
            if (aVar != null) {
                this.f10186f.n(aVar);
            }
            if (cVar == null) {
                this.f10192n = null;
                return;
            }
            r2.p pVar = new r2.p(cVar, null);
            this.f10192n = pVar;
            pVar.a(this);
            this.f10186f.d(this.f10192n);
        }
    }

    public final void g(t2.e eVar, int i10, List<t2.e> list, t2.e eVar2) {
        f.e(eVar, i10, list, eVar2, this);
    }
}
