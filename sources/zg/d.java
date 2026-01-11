package zg;

import android.support.v4.media.b;
import c3.k;
import xg.e;
import xg.f;

public final class d extends f.c {
    public d(xg.d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public d(xg.d dVar, e eVar, e eVar2, e[] eVarArr) {
        super(dVar, eVar, eVar2, eVarArr);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [xg.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        if (android.support.v4.media.b.y0(16, r10, c3.k.G) != false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xg.f a(xg.f r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r16.j()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r17.j()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            xg.f r1 = r16.w()
            return r1
        L_0x0019:
            xg.d r2 = r0.f13245a
            xg.e r3 = r0.f13246b
            zg.c r3 = (zg.c) r3
            xg.e r4 = r0.f13247c
            zg.c r4 = (zg.c) r4
            xg.e r5 = r1.f13246b
            zg.c r5 = (zg.c) r5
            xg.e r6 = r17.g()
            zg.c r6 = (zg.c) r6
            xg.e[] r7 = r0.f13248d
            r8 = 0
            r7 = r7[r8]
            zg.c r7 = (zg.c) r7
            xg.e r1 = r17.h()
            zg.c r1 = (zg.c) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.g()
            if (r15 == 0) goto L_0x0051
            int[] r5 = r5.f14476f
            int[] r6 = r6.f14476f
            goto L_0x0067
        L_0x0051:
            int[] r8 = r7.f14476f
            c3.k.R0(r8, r13)
            int[] r5 = r5.f14476f
            c3.k.z0(r13, r5, r12)
            int[] r5 = r7.f14476f
            c3.k.z0(r13, r5, r13)
            int[] r5 = r6.f14476f
            c3.k.z0(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0067:
            boolean r8 = r1.g()
            if (r8 == 0) goto L_0x0072
            int[] r3 = r3.f14476f
            int[] r4 = r4.f14476f
            goto L_0x0088
        L_0x0072:
            int[] r9 = r1.f14476f
            c3.k.R0(r9, r14)
            int[] r3 = r3.f14476f
            c3.k.z0(r14, r3, r10)
            int[] r3 = r1.f14476f
            c3.k.z0(r14, r3, r14)
            int[] r3 = r4.f14476f
            c3.k.z0(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            c3.k.X0(r3, r5, r9)
            c3.k.X0(r4, r6, r12)
            boolean r5 = android.support.v4.media.b.a1(r9)
            if (r5 == 0) goto L_0x00a6
            boolean r1 = android.support.v4.media.b.a1(r12)
            if (r1 == 0) goto L_0x00a1
            xg.f r1 = r16.w()
            return r1
        L_0x00a1:
            xg.f r1 = r2.l()
            return r1
        L_0x00a6:
            c3.k.R0(r9, r13)
            int[] r5 = new int[r11]
            c3.k.z0(r13, r9, r5)
            c3.k.z0(r13, r3, r13)
            boolean r3 = android.support.v4.media.b.a1(r5)
            if (r3 == 0) goto L_0x00bb
            android.support.v4.media.b.q2(r5)
            goto L_0x00c0
        L_0x00bb:
            int[] r3 = c3.k.F
            android.support.v4.media.b.Z1(r3, r5, r5)
        L_0x00c0:
            android.support.v4.media.b.p1(r4, r5, r10)
            int r3 = android.support.v4.media.b.u(r13, r13, r5)
            c3.k.N0(r3, r5)
            zg.c r3 = new zg.c
            r3.<init>((int[]) r14)
            c3.k.R0(r12, r14)
            int[] r4 = r3.f14476f
            c3.k.X0(r4, r5, r4)
            zg.c r4 = new zg.c
            r4.<init>((int[]) r5)
            int[] r6 = r3.f14476f
            c3.k.X0(r13, r6, r5)
            int[] r5 = r4.f14476f
            int r5 = android.support.v4.media.b.v1(r5, r12, r10)
            r6 = 1
            if (r5 != 0) goto L_0x00ff
            r5 = 15
            r5 = r10[r5]
            int r5 = r5 >>> r6
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r5 < r11) goto L_0x0106
            int[] r5 = c3.k.G
            r11 = 16
            boolean r5 = android.support.v4.media.b.y0(r11, r10, r5)
            if (r5 == 0) goto L_0x0106
            goto L_0x0101
        L_0x00ff:
            r11 = 16
        L_0x0101:
            int[] r5 = c3.k.G
            android.support.v4.media.b.b2(r11, r5, r10)
        L_0x0106:
            int[] r5 = r4.f14476f
            c3.k.J0(r10, r5)
            zg.c r5 = new zg.c
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x0117
            int[] r7 = r7.f14476f
            c3.k.z0(r9, r7, r9)
        L_0x0117:
            if (r8 != 0) goto L_0x0120
            int[] r7 = r5.f14476f
            int[] r1 = r1.f14476f
            c3.k.z0(r7, r1, r7)
        L_0x0120:
            xg.e[] r1 = new xg.e[r6]
            r6 = 0
            r1[r6] = r5
            zg.d r5 = new zg.d
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.d.a(xg.f):xg.f");
    }

    public final f m() {
        return j() ? this : new d(this.f13245a, this.f13246b, this.f13247c.k(), this.f13248d);
    }

    public final f u() {
        return (j() || this.f13247c.h()) ? this : w().a(this);
    }

    public final f w() {
        if (j()) {
            return this;
        }
        xg.d dVar = this.f13245a;
        c cVar = (c) this.f13247c;
        if (cVar.h()) {
            return dVar.l();
        }
        c cVar2 = (c) this.f13246b;
        c cVar3 = (c) this.f13248d[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        k.R0(cVar.f14476f, iArr3);
        int[] iArr4 = new int[8];
        k.R0(iArr3, iArr4);
        boolean g = cVar3.g();
        int[] iArr5 = cVar3.f14476f;
        if (!g) {
            k.R0(iArr5, iArr2);
            iArr5 = iArr2;
        }
        k.X0(cVar2.f14476f, iArr5, iArr);
        k.C(cVar2.f14476f, iArr5, iArr2);
        k.z0(iArr2, iArr, iArr2);
        k.N0(b.u(iArr2, iArr2, iArr2), iArr2);
        k.z0(iArr3, cVar2.f14476f, iArr3);
        k.N0(b.G1(8, iArr3), iArr3);
        k.N0(b.H1(8, iArr4, iArr), iArr);
        c cVar4 = new c(iArr4);
        k.R0(iArr2, iArr4);
        int[] iArr6 = cVar4.f14476f;
        k.X0(iArr6, iArr3, iArr6);
        int[] iArr7 = cVar4.f14476f;
        k.X0(iArr7, iArr3, iArr7);
        c cVar5 = new c(iArr3);
        k.X0(iArr3, cVar4.f14476f, iArr3);
        int[] iArr8 = cVar5.f14476f;
        k.z0(iArr8, iArr2, iArr8);
        int[] iArr9 = cVar5.f14476f;
        k.X0(iArr9, iArr, iArr9);
        c cVar6 = new c(iArr2);
        if (b.F1(8, cVar.f14476f, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && b.D0(iArr2, k.F))) {
            k.F(iArr2);
        }
        if (!g) {
            int[] iArr10 = cVar6.f14476f;
            k.z0(iArr10, cVar3.f14476f, iArr10);
        }
        return new d(dVar, cVar4, cVar5, new e[]{cVar6});
    }

    public final f x(f fVar) {
        return this == fVar ? u() : j() ? fVar : fVar.j() ? w() : this.f13247c.h() ? fVar : w().a(fVar);
    }
}
