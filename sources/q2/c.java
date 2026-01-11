package q2;

import a3.g;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o2.l;
import r2.a;
import r2.o;
import t2.e;
import t2.f;
import w2.b;

public final class c implements d, l, a.C0206a, f {

    /* renamed from: a  reason: collision with root package name */
    public p2.a f10195a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f10196b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f10197c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f10198d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f10199e;

    /* renamed from: f  reason: collision with root package name */
    public final String f10200f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f10201h;
    public final l i;

    /* renamed from: j  reason: collision with root package name */
    public List<l> f10202j;

    /* renamed from: k  reason: collision with root package name */
    public o f10203k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(o2.l r8, w2.b r9, v2.n r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f12236a
            boolean r4 = r10.f12238c
            java.util.List<v2.b> r0 = r10.f12237b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        L_0x0011:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x0029
            java.lang.Object r6 = r0.get(r2)
            v2.b r6 = (v2.b) r6
            q2.b r6 = r6.a(r8, r9)
            if (r6 == 0) goto L_0x0026
            r5.add(r6)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            java.util.List<v2.b> r10 = r10.f12237b
        L_0x002b:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0042
            java.lang.Object r0 = r10.get(r1)
            v2.b r0 = (v2.b) r0
            boolean r2 = r0 instanceof u2.l
            if (r2 == 0) goto L_0x003f
            u2.l r0 = (u2.l) r0
            r6 = r0
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0042:
            r10 = 0
            r6 = r10
        L_0x0044:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.c.<init>(o2.l, w2.b, v2.n):void");
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.f10197c.set(matrix);
        o oVar = this.f10203k;
        if (oVar != null) {
            this.f10197c.preConcat(oVar.e());
        }
        this.f10199e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f10201h.size() - 1; size >= 0; size--) {
            b bVar = this.f10201h.get(size);
            if (bVar instanceof d) {
                ((d) bVar).a(this.f10199e, this.f10197c, z);
                rectF.union(this.f10199e);
            }
        }
    }

    public final void b() {
        this.i.invalidateSelf();
    }

    public final void c(List<b> list, List<b> list2) {
        ArrayList arrayList = new ArrayList(this.f10201h.size() + list.size());
        arrayList.addAll(list);
        int size = this.f10201h.size();
        while (true) {
            size--;
            if (size >= 0) {
                b bVar = this.f10201h.get(size);
                bVar.c(arrayList, this.f10201h.subList(0, size));
                arrayList.add(bVar);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final List<l> d() {
        if (this.f10202j == null) {
            this.f10202j = new ArrayList();
            for (int i10 = 0; i10 < this.f10201h.size(); i10++) {
                b bVar = this.f10201h.get(i10);
                if (bVar instanceof l) {
                    this.f10202j.add((l) bVar);
                }
            }
        }
        return this.f10202j;
    }

    public final void e(Canvas canvas, Matrix matrix, int i10) {
        boolean z;
        int i11;
        if (!this.g) {
            this.f10197c.set(matrix);
            o oVar = this.f10203k;
            if (oVar != null) {
                this.f10197c.preConcat(oVar.e());
                a<Integer, Integer> aVar = this.f10203k.f10557j;
                if (aVar == null) {
                    i11 = 100;
                } else {
                    i11 = aVar.f().intValue();
                }
                i10 = (int) ((((((float) i11) / 100.0f) * ((float) i10)) / 255.0f) * 255.0f);
            }
            boolean z10 = false;
            if (this.i.H) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 < this.f10201h.size()) {
                        if ((this.f10201h.get(i12) instanceof d) && (i13 = i13 + 1) >= 2) {
                            z = true;
                            break;
                        }
                        i12++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z && i10 != 255) {
                    z10 = true;
                }
            }
            if (z10) {
                this.f10196b.set(0.0f, 0.0f, 0.0f, 0.0f);
                a(this.f10196b, this.f10197c, true);
                this.f10195a.setAlpha(i10);
                RectF rectF = this.f10196b;
                p2.a aVar2 = this.f10195a;
                ThreadLocal<PathMeasure> threadLocal = g.f50a;
                canvas.saveLayer(rectF, aVar2);
                ad.c.E();
            }
            if (z10) {
                i10 = 255;
            }
            for (int size = this.f10201h.size() - 1; size >= 0; size--) {
                b bVar = this.f10201h.get(size);
                if (bVar instanceof d) {
                    ((d) bVar).e(canvas, this.f10197c, i10);
                }
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public final <T> void f(T t10, b3.c cVar) {
        o oVar = this.f10203k;
        if (oVar != null) {
            oVar.c(t10, cVar);
        }
    }

    public final void g(e eVar, int i10, List<e> list, e eVar2) {
        if (eVar.e(this.f10200f, i10)) {
            if (!"__container".equals(this.f10200f)) {
                eVar2 = eVar2.a(this.f10200f);
                if (eVar.c(this.f10200f, i10)) {
                    list.add(eVar2.g(this));
                }
            }
            if (eVar.f(this.f10200f, i10)) {
                int d10 = eVar.d(this.f10200f, i10) + i10;
                for (int i11 = 0; i11 < this.f10201h.size(); i11++) {
                    b bVar = this.f10201h.get(i11);
                    if (bVar instanceof f) {
                        ((f) bVar).g(eVar, d10, list, eVar2);
                    }
                }
            }
        }
    }

    public final String getName() {
        return this.f10200f;
    }

    public final Path getPath() {
        this.f10197c.reset();
        o oVar = this.f10203k;
        if (oVar != null) {
            this.f10197c.set(oVar.e());
        }
        this.f10198d.reset();
        if (this.g) {
            return this.f10198d;
        }
        for (int size = this.f10201h.size() - 1; size >= 0; size--) {
            b bVar = this.f10201h.get(size);
            if (bVar instanceof l) {
                this.f10198d.addPath(((l) bVar).getPath(), this.f10197c);
            }
        }
        return this.f10198d;
    }

    public c(l lVar, b bVar, String str, boolean z, List<b> list, u2.l lVar2) {
        this.f10195a = new p2.a();
        this.f10196b = new RectF();
        this.f10197c = new Matrix();
        this.f10198d = new Path();
        this.f10199e = new RectF();
        this.f10200f = str;
        this.i = lVar;
        this.g = z;
        this.f10201h = list;
        if (lVar2 != null) {
            o oVar = new o(lVar2);
            this.f10203k = oVar;
            oVar.a(bVar);
            this.f10203k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar2 = list.get(size);
            if (bVar2 instanceof i) {
                arrayList.add((i) bVar2);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((i) arrayList.get(size2)).d(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
