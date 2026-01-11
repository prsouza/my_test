package q2;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import o2.l;
import r2.a;
import r2.j;
import r2.p;
import s.d;
import v2.c;
import v2.e;
import v2.f;
import w2.b;

public final class h extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f10235o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f10236p;

    /* renamed from: q  reason: collision with root package name */
    public final d<LinearGradient> f10237q = new d<>();

    /* renamed from: r  reason: collision with root package name */
    public final d<RadialGradient> f10238r = new d<>();

    /* renamed from: s  reason: collision with root package name */
    public final RectF f10239s = new RectF();

    /* renamed from: t  reason: collision with root package name */
    public final f f10240t;

    /* renamed from: u  reason: collision with root package name */
    public final int f10241u;

    /* renamed from: v  reason: collision with root package name */
    public final a<c, c> f10242v;

    /* renamed from: w  reason: collision with root package name */
    public final a<PointF, PointF> f10243w;

    /* renamed from: x  reason: collision with root package name */
    public final a<PointF, PointF> f10244x;

    /* renamed from: y  reason: collision with root package name */
    public p f10245y;

    public h(l lVar, b bVar, e eVar) {
        super(lVar, bVar, eVar.f12197h.toPaintCap(), eVar.i.toPaintJoin(), eVar.f12198j, eVar.f12194d, eVar.g, eVar.f12199k, eVar.f12200l);
        this.f10235o = eVar.f12191a;
        this.f10240t = eVar.f12192b;
        this.f10236p = eVar.f12201m;
        this.f10241u = (int) (lVar.f9228b.b() / 32.0f);
        a<c, c> a10 = eVar.f12193c.a();
        this.f10242v = (r2.d) a10;
        a10.a(this);
        bVar.d(a10);
        a<PointF, PointF> a11 = eVar.f12195e.a();
        this.f10243w = (j) a11;
        a11.a(this);
        bVar.d(a11);
        a<PointF, PointF> a12 = eVar.f12196f.a();
        this.f10244x = (j) a12;
        a12.a(this);
        bVar.d(a12);
    }

    public final int[] d(int[] iArr) {
        p pVar = this.f10245y;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f10236p
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f10239s
            r3 = 0
            r0.a(r2, r1, r3)
            v2.f r2 = r0.f10240t
            v2.f r3 = v2.f.LINEAR
            r4 = 0
            if (r2 != r3) goto L_0x005d
            int r2 = r16.h()
            s.d<android.graphics.LinearGradient> r3 = r0.f10237q
            long r5 = (long) r2
            java.lang.Object r2 = r3.g(r5, r4)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x0027
            goto L_0x00ab
        L_0x0027:
            r2.a<android.graphics.PointF, android.graphics.PointF> r2 = r0.f10243w
            java.lang.Object r2 = r2.f()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r2.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f10244x
            java.lang.Object r3 = r3.f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            r2.a<v2.c, v2.c> r4 = r0.f10242v
            java.lang.Object r4 = r4.f()
            v2.c r4 = (v2.c) r4
            int[] r7 = r4.f12183b
            int[] r13 = r0.d(r7)
            float[] r14 = r4.f12182a
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            s.d<android.graphics.LinearGradient> r3 = r0.f10237q
            r3.i(r5, r2)
            goto L_0x00ab
        L_0x005d:
            int r2 = r16.h()
            s.d<android.graphics.RadialGradient> r3 = r0.f10238r
            long r5 = (long) r2
            java.lang.Object r2 = r3.g(r5, r4)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x006d
            goto L_0x00ab
        L_0x006d:
            r2.a<android.graphics.PointF, android.graphics.PointF> r2 = r0.f10243w
            java.lang.Object r2 = r2.f()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r2.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f10244x
            java.lang.Object r3 = r3.f()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            r2.a<v2.c, v2.c> r4 = r0.f10242v
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
            float r11 = (float) r2
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            s.d<android.graphics.RadialGradient> r3 = r0.f10238r
            r3.i(r5, r2)
        L_0x00ab:
            r2.setLocalMatrix(r1)
            p2.a r3 = r0.i
            r3.setShader(r2)
            super.e(r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.h.e(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final <T> void f(T t10, b3.c cVar) {
        super.f(t10, cVar);
        if (t10 == o2.p.D) {
            p pVar = this.f10245y;
            if (pVar != null) {
                this.f10186f.n(pVar);
            }
            if (cVar == null) {
                this.f10245y = null;
                return;
            }
            p pVar2 = new p(cVar, null);
            this.f10245y = pVar2;
            pVar2.a(this);
            this.f10186f.d(this.f10245y);
        }
    }

    public final String getName() {
        return this.f10235o;
    }

    public final int h() {
        int round = Math.round(this.f10243w.f10529d * ((float) this.f10241u));
        int round2 = Math.round(this.f10244x.f10529d * ((float) this.f10241u));
        int round3 = Math.round(this.f10242v.f10529d * ((float) this.f10241u));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
