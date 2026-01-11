package q2;

import a3.f;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import java.util.Objects;
import o2.l;
import o2.p;
import r2.a;
import r2.c;
import t2.e;
import v2.k;
import w2.b;

public final class o implements d, l, i, a.C0206a, j {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f10273a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f10274b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final l f10275c;

    /* renamed from: d  reason: collision with root package name */
    public final b f10276d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10277e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10278f;
    public final a<Float, Float> g;

    /* renamed from: h  reason: collision with root package name */
    public final a<Float, Float> f10279h;
    public final r2.o i;

    /* renamed from: j  reason: collision with root package name */
    public c f10280j;

    public o(l lVar, b bVar, k kVar) {
        this.f10275c = lVar;
        this.f10276d = bVar;
        this.f10277e = kVar.f12222a;
        this.f10278f = kVar.f12226e;
        a<Float, Float> a10 = kVar.f12223b.a();
        this.g = (c) a10;
        bVar.d(a10);
        a10.a(this);
        a<Float, Float> a11 = kVar.f12224c.a();
        this.f10279h = (c) a11;
        bVar.d(a11);
        a11.a(this);
        u2.l lVar2 = kVar.f12225d;
        Objects.requireNonNull(lVar2);
        r2.o oVar = new r2.o(lVar2);
        this.i = oVar;
        oVar.a(bVar);
        oVar.b(this);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.f10280j.a(rectF, matrix, z);
    }

    public final void b() {
        this.f10275c.invalidateSelf();
    }

    public final void c(List<b> list, List<b> list2) {
        this.f10280j.c(list, list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.util.ListIterator<q2.b> r9) {
        /*
            r8 = this;
            q2.c r0 = r8.f10280j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            q2.c r9 = new q2.c
            o2.l r2 = r8.f10275c
            w2.b r3 = r8.f10276d
            boolean r5 = r8.f10278f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f10280j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.o.d(java.util.ListIterator):void");
    }

    public final void e(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.g.f().floatValue();
        float floatValue2 = this.f10279h.f().floatValue();
        float floatValue3 = this.i.f10560m.f().floatValue() / 100.0f;
        float floatValue4 = this.i.f10561n.f().floatValue() / 100.0f;
        int i11 = (int) floatValue;
        while (true) {
            i11--;
            if (i11 >= 0) {
                this.f10273a.set(matrix);
                float f10 = (float) i11;
                this.f10273a.preConcat(this.i.f(f10 + floatValue2));
                PointF pointF = f.f49a;
                this.f10280j.e(canvas, this.f10273a, (int) ((((floatValue4 - floatValue3) * (f10 / floatValue)) + floatValue3) * ((float) i10)));
            } else {
                return;
            }
        }
    }

    public final <T> void f(T t10, b3.c cVar) {
        if (!this.i.c(t10, cVar)) {
            if (t10 == p.f9283q) {
                this.g.j(cVar);
            } else if (t10 == p.f9284r) {
                this.f10279h.j(cVar);
            }
        }
    }

    public final void g(e eVar, int i10, List<e> list, e eVar2) {
        f.e(eVar, i10, list, eVar2, this);
    }

    public final String getName() {
        return this.f10277e;
    }

    public final Path getPath() {
        Path path = this.f10280j.getPath();
        this.f10274b.reset();
        float floatValue = this.g.f().floatValue();
        float floatValue2 = this.f10279h.f().floatValue();
        int i10 = (int) floatValue;
        while (true) {
            i10--;
            if (i10 < 0) {
                return this.f10274b;
            }
            this.f10273a.set(this.i.f(((float) i10) + floatValue2));
            this.f10274b.addPath(path, this.f10273a);
        }
    }
}
