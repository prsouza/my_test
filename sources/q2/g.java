package q2;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o2.l;
import r2.a;
import r2.e;
import r2.j;
import r2.p;
import s.d;
import v2.c;
import v2.f;
import w2.b;

public final class g implements d, a.C0206a, j {

    /* renamed from: a  reason: collision with root package name */
    public final String f10219a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10220b;

    /* renamed from: c  reason: collision with root package name */
    public final b f10221c;

    /* renamed from: d  reason: collision with root package name */
    public final d<LinearGradient> f10222d = new d<>();

    /* renamed from: e  reason: collision with root package name */
    public final d<RadialGradient> f10223e = new d<>();

    /* renamed from: f  reason: collision with root package name */
    public final Path f10224f;
    public final p2.a g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f10225h;
    public final List<l> i;

    /* renamed from: j  reason: collision with root package name */
    public final f f10226j;

    /* renamed from: k  reason: collision with root package name */
    public final a<c, c> f10227k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Integer, Integer> f10228l;

    /* renamed from: m  reason: collision with root package name */
    public final a<PointF, PointF> f10229m;

    /* renamed from: n  reason: collision with root package name */
    public final a<PointF, PointF> f10230n;

    /* renamed from: o  reason: collision with root package name */
    public a<ColorFilter, ColorFilter> f10231o;

    /* renamed from: p  reason: collision with root package name */
    public p f10232p;

    /* renamed from: q  reason: collision with root package name */
    public final l f10233q;

    /* renamed from: r  reason: collision with root package name */
    public final int f10234r;

    public g(l lVar, b bVar, v2.d dVar) {
        Path path = new Path();
        this.f10224f = path;
        this.g = new p2.a(1);
        this.f10225h = new RectF();
        this.i = new ArrayList();
        this.f10221c = bVar;
        this.f10219a = dVar.g;
        this.f10220b = dVar.f12190h;
        this.f10233q = lVar;
        this.f10226j = dVar.f12184a;
        path.setFillType(dVar.f12185b);
        this.f10234r = (int) (lVar.f9228b.b() / 32.0f);
        a<c, c> a10 = dVar.f12186c.a();
        this.f10227k = (r2.d) a10;
        a10.a(this);
        bVar.d(a10);
        a<Integer, Integer> a11 = dVar.f12187d.a();
        this.f10228l = (e) a11;
        a11.a(this);
        bVar.d(a11);
        a<PointF, PointF> a12 = dVar.f12188e.a();
        this.f10229m = (j) a12;
        a12.a(this);
        bVar.d(a12);
        a<PointF, PointF> a13 = dVar.f12189f.a();
        this.f10230n = (j) a13;
        a13.a(this);
        bVar.d(a13);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.f10224f.reset();
        for (int i10 = 0; i10 < this.i.size(); i10++) {
            this.f10224f.addPath(((l) this.i.get(i10)).getPath(), matrix);
        }
        this.f10224f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void b() {
        this.f10233q.invalidateSelf();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<q2.l>, java.util.ArrayList] */
    public final void c(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b bVar = list2.get(i10);
            if (bVar instanceof l) {
                this.i.add((l) bVar);
            }
        }
    }

    public final int[] d(int[] iArr) {
        p pVar = this.f10232p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [r2.p, r2.a<android.graphics.ColorFilter, android.graphics.ColorFilter>] */
    /* JADX WARNING: type inference failed for: r2v25, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.List<q2.l>, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f10220b
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.Path r2 = r0.f10224f
            r2.reset()
            r2 = 0
            r3 = r2
        L_0x0010:
            java.util.List<q2.l> r4 = r0.i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002c
            android.graphics.Path r4 = r0.f10224f
            java.util.List<q2.l> r5 = r0.i
            java.lang.Object r5 = r5.get(r3)
            q2.l r5 = (q2.l) r5
            android.graphics.Path r5 = r5.getPath()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002c:
            android.graphics.Path r3 = r0.f10224f
            android.graphics.RectF r4 = r0.f10225h
            r3.computeBounds(r4, r2)
            v2.f r2 = r0.f10226j
            v2.f r3 = v2.f.LINEAR
            r4 = 0
            if (r2 != r3) goto L_0x0082
            int r2 = r16.h()
            s.d<android.graphics.LinearGradient> r3 = r0.f10222d
            long r5 = (long) r2
            java.lang.Object r2 = r3.g(r5, r4)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x004b
            goto L_0x00d9
        L_0x004b:
            r2.a<android.graphics.PointF, android.graphics.PointF> r2 = r0.f10229m
            java.lang.Object r2 = r2.f()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r2.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f10230n
            java.lang.Object r3 = r3.f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            r2.a<v2.c, v2.c> r4 = r0.f10227k
            java.lang.Object r4 = r4.f()
            v2.c r4 = (v2.c) r4
            int[] r7 = r4.f12183b
            int[] r13 = r0.d(r7)
            float[] r14 = r4.f12182a
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            s.d<android.graphics.LinearGradient> r2 = r0.f10222d
            r2.i(r5, r4)
            r2 = r4
            goto L_0x00d9
        L_0x0082:
            int r2 = r16.h()
            s.d<android.graphics.RadialGradient> r3 = r0.f10223e
            long r5 = (long) r2
            java.lang.Object r2 = r3.g(r5, r4)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x0092
            goto L_0x00d9
        L_0x0092:
            r2.a<android.graphics.PointF, android.graphics.PointF> r2 = r0.f10229m
            java.lang.Object r2 = r2.f()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r2.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f10230n
            java.lang.Object r3 = r3.f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            r2.a<v2.c, v2.c> r4 = r0.f10227k
            java.lang.Object r4 = r4.f()
            v2.c r4 = (v2.c) r4
            int[] r7 = r4.f12183b
            int[] r12 = r0.d(r7)
            float[] r13 = r4.f12182a
            float r9 = r2.x
            float r10 = r2.y
            float r2 = r3.x
            float r3 = r3.y
            float r2 = r2 - r9
            double r7 = (double) r2
            float r3 = r3 - r10
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r7, r2)
            float r2 = (float) r2
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x00cb
            r2 = 981668463(0x3a83126f, float:0.001)
        L_0x00cb:
            r11 = r2
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            s.d<android.graphics.RadialGradient> r3 = r0.f10223e
            r3.i(r5, r2)
        L_0x00d9:
            r2.setLocalMatrix(r1)
            p2.a r1 = r0.g
            r1.setShader(r2)
            r2.a<android.graphics.ColorFilter, android.graphics.ColorFilter> r1 = r0.f10231o
            if (r1 == 0) goto L_0x00f0
            p2.a r2 = r0.g
            java.lang.Object r1 = r1.f()
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            r2.setColorFilter(r1)
        L_0x00f0:
            r1 = r19
            float r1 = (float) r1
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r2
            r2.a<java.lang.Integer, java.lang.Integer> r3 = r0.f10228l
            java.lang.Object r3 = r3.f()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            float r1 = r1 * r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            float r1 = r1 * r2
            int r1 = (int) r1
            p2.a r2 = r0.g
            int r1 = a3.f.c(r1)
            r2.setAlpha(r1)
            android.graphics.Path r1 = r0.f10224f
            p2.a r2 = r0.g
            r3 = r17
            r3.drawPath(r1, r2)
            ad.c.E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.g.e(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final <T> void f(T t10, b3.c cVar) {
        if (t10 == o2.p.f9272d) {
            this.f10228l.j(cVar);
        } else if (t10 == o2.p.C) {
            a<ColorFilter, ColorFilter> aVar = this.f10231o;
            if (aVar != null) {
                this.f10221c.n(aVar);
            }
            if (cVar == null) {
                this.f10231o = null;
                return;
            }
            p pVar = new p(cVar, null);
            this.f10231o = pVar;
            pVar.a(this);
            this.f10221c.d(this.f10231o);
        } else if (t10 == o2.p.D) {
            p pVar2 = this.f10232p;
            if (pVar2 != null) {
                this.f10221c.n(pVar2);
            }
            if (cVar == null) {
                this.f10232p = null;
                return;
            }
            this.f10222d.b();
            this.f10223e.b();
            p pVar3 = new p(cVar, null);
            this.f10232p = pVar3;
            pVar3.a(this);
            this.f10221c.d(this.f10232p);
        }
    }

    public final void g(t2.e eVar, int i10, List<t2.e> list, t2.e eVar2) {
        a3.f.e(eVar, i10, list, eVar2, this);
    }

    public final String getName() {
        return this.f10219a;
    }

    public final int h() {
        int round = Math.round(this.f10229m.f10529d * ((float) this.f10234r));
        int round2 = Math.round(this.f10230n.f10529d * ((float) this.f10234r));
        int round3 = Math.round(this.f10227k.f10529d * ((float) this.f10234r));
        int i10 = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }
}
