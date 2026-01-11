package r2;

import android.graphics.Path;
import android.graphics.PointF;
import b3.a;
import o2.f;

public final class h extends a<PointF> {

    /* renamed from: o  reason: collision with root package name */
    public Path f10542o;

    /* renamed from: p  reason: collision with root package name */
    public final a<PointF> f10543p;

    public h(f fVar, a<PointF> aVar) {
        super(fVar, aVar.f2845b, aVar.f2846c, aVar.f2847d, aVar.f2848e, aVar.f2849f);
        this.f10543p = aVar;
        d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r12.f2845b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r12 = this;
            T r0 = r12.f2846c
            if (r0 == 0) goto L_0x001b
            T r1 = r12.f2845b
            if (r1 == 0) goto L_0x001b
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            r2 = r0
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.y
            boolean r0 = r1.equals(r2, r0)
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            T r1 = r12.f2846c
            if (r1 == 0) goto L_0x0076
            if (r0 != 0) goto L_0x0076
            T r0 = r12.f2845b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            b3.a<android.graphics.PointF> r2 = r12.f10543p
            android.graphics.PointF r3 = r2.f2854m
            android.graphics.PointF r2 = r2.f2855n
            java.lang.ThreadLocal<android.graphics.PathMeasure> r4 = a3.g.f50a
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            float r5 = r0.x
            float r6 = r0.y
            r4.moveTo(r5, r6)
            if (r3 == 0) goto L_0x006d
            if (r2 == 0) goto L_0x006d
            float r5 = r3.length()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            float r5 = r2.length()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x006d
        L_0x0051:
            float r5 = r0.x
            float r6 = r3.x
            float r6 = r6 + r5
            float r0 = r0.y
            float r3 = r3.y
            float r7 = r0 + r3
            float r10 = r1.x
            float r0 = r2.x
            float r8 = r10 + r0
            float r11 = r1.y
            float r0 = r2.y
            float r9 = r11 + r0
            r5 = r4
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            goto L_0x0074
        L_0x006d:
            float r0 = r1.x
            float r1 = r1.y
            r4.lineTo(r0, r1)
        L_0x0074:
            r12.f10542o = r4
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.h.d():void");
    }
}
