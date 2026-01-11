package ah;

import aa.b;
import xg.d;
import xg.e;
import xg.f;

public final class b0 extends f.c {
    public b0(d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public b0(d dVar, e eVar, e eVar2, e[] eVarArr) {
        super(dVar, eVar, eVar2, eVarArr);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [xg.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f7, code lost:
        if (android.support.v4.media.b.y0(14, r10, aa.b.f193t) != false) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011c  */
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
            ah.a0 r3 = (ah.a0) r3
            xg.e r4 = r0.f13247c
            ah.a0 r4 = (ah.a0) r4
            xg.e r5 = r1.f13246b
            ah.a0 r5 = (ah.a0) r5
            xg.e r6 = r17.g()
            ah.a0 r6 = (ah.a0) r6
            xg.e[] r7 = r0.f13248d
            r8 = 0
            r7 = r7[r8]
            ah.a0 r7 = (ah.a0) r7
            xg.e r1 = r17.h()
            ah.a0 r1 = (ah.a0) r1
            r9 = 14
            int[] r10 = new int[r9]
            r11 = 7
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.g()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f473f
            int[] r6 = r6.f473f
            goto L_0x0066
        L_0x0050:
            int[] r8 = r7.f473f
            aa.b.h0(r8, r13)
            int[] r5 = r5.f473f
            aa.b.T(r13, r5, r12)
            int[] r5 = r7.f473f
            aa.b.T(r13, r5, r13)
            int[] r5 = r6.f473f
            aa.b.T(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r8 = r1.g()
            if (r8 == 0) goto L_0x0071
            int[] r3 = r3.f473f
            int[] r4 = r4.f473f
            goto L_0x0087
        L_0x0071:
            int[] r9 = r1.f473f
            aa.b.h0(r9, r14)
            int[] r3 = r3.f473f
            aa.b.T(r14, r3, r10)
            int[] r3 = r1.f473f
            aa.b.T(r14, r3, r14)
            int[] r3 = r4.f473f
            aa.b.T(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0087:
            int[] r9 = new int[r11]
            aa.b.p0(r3, r5, r9)
            aa.b.p0(r4, r6, r12)
            boolean r5 = android.support.v4.media.b.Z0(r9)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = android.support.v4.media.b.Z0(r12)
            if (r1 == 0) goto L_0x00a0
            xg.f r1 = r16.w()
            return r1
        L_0x00a0:
            xg.f r1 = r2.l()
            return r1
        L_0x00a5:
            aa.b.h0(r9, r13)
            int[] r5 = new int[r11]
            aa.b.T(r13, r9, r5)
            aa.b.T(r13, r3, r13)
            boolean r3 = android.support.v4.media.b.Z0(r5)
            if (r3 == 0) goto L_0x00ba
            android.support.v4.media.b.p2(r5)
            goto L_0x00bf
        L_0x00ba:
            int[] r3 = aa.b.f192s
            android.support.v4.media.b.Y1(r3, r5, r5)
        L_0x00bf:
            android.support.v4.media.b.o1(r4, r5, r10)
            int r3 = android.support.v4.media.b.t(r13, r13, r5)
            aa.b.c0(r3, r5)
            ah.a0 r3 = new ah.a0
            r3.<init>((int[]) r14)
            aa.b.h0(r12, r14)
            int[] r4 = r3.f473f
            aa.b.p0(r4, r5, r4)
            ah.a0 r4 = new ah.a0
            r4.<init>((int[]) r5)
            int[] r6 = r3.f473f
            aa.b.p0(r13, r6, r5)
            int[] r5 = r4.f473f
            int r5 = android.support.v4.media.b.u1(r5, r12, r10)
            if (r5 != 0) goto L_0x00fa
            r5 = 13
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x0109
            int[] r5 = aa.b.f193t
            r6 = 14
            boolean r5 = android.support.v4.media.b.y0(r6, r10, r5)
            if (r5 == 0) goto L_0x0109
            goto L_0x00fc
        L_0x00fa:
            r6 = 14
        L_0x00fc:
            int[] r5 = aa.b.f194u
            r11 = 9
            int r5 = android.support.v4.media.b.v(r11, r5, r10)
            if (r5 == 0) goto L_0x0109
            android.support.v4.media.b.G0(r6, r10, r11)
        L_0x0109:
            int[] r5 = r4.f473f
            aa.b.Z(r10, r5)
            ah.a0 r5 = new ah.a0
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x011a
            int[] r6 = r7.f473f
            aa.b.T(r9, r6, r9)
        L_0x011a:
            if (r8 != 0) goto L_0x0123
            int[] r6 = r5.f473f
            int[] r1 = r1.f473f
            aa.b.T(r6, r1, r6)
        L_0x0123:
            r1 = 1
            xg.e[] r1 = new xg.e[r1]
            r6 = 0
            r1[r6] = r5
            ah.b0 r5 = new ah.b0
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.b0.a(xg.f):xg.f");
    }

    public final f m() {
        return j() ? this : new b0(this.f13245a, this.f13246b, this.f13247c.k(), this.f13248d);
    }

    public final f u() {
        return (j() || this.f13247c.h()) ? this : w().a(this);
    }

    public final f w() {
        if (j()) {
            return this;
        }
        d dVar = this.f13245a;
        a0 a0Var = (a0) this.f13247c;
        if (a0Var.h()) {
            return dVar.l();
        }
        a0 a0Var2 = (a0) this.f13246b;
        a0 a0Var3 = (a0) this.f13248d[0];
        int[] iArr = new int[7];
        b.h0(a0Var.f473f, iArr);
        int[] iArr2 = new int[7];
        b.h0(iArr, iArr2);
        int[] iArr3 = new int[7];
        b.h0(a0Var2.f473f, iArr3);
        b.c0(android.support.v4.media.b.t(iArr3, iArr3, iArr3), iArr3);
        b.T(iArr, a0Var2.f473f, iArr);
        b.c0(android.support.v4.media.b.G1(7, iArr), iArr);
        int[] iArr4 = new int[7];
        b.c0(android.support.v4.media.b.H1(7, iArr2, iArr4), iArr4);
        a0 a0Var4 = new a0(iArr2);
        b.h0(iArr3, iArr2);
        int[] iArr5 = a0Var4.f473f;
        b.p0(iArr5, iArr, iArr5);
        int[] iArr6 = a0Var4.f473f;
        b.p0(iArr6, iArr, iArr6);
        a0 a0Var5 = new a0(iArr);
        b.p0(iArr, a0Var4.f473f, iArr);
        int[] iArr7 = a0Var5.f473f;
        b.T(iArr7, iArr3, iArr7);
        int[] iArr8 = a0Var5.f473f;
        b.p0(iArr8, iArr4, iArr8);
        a0 a0Var6 = new a0(iArr3);
        if (android.support.v4.media.b.F1(7, a0Var.f473f, 0, iArr3) != 0 || (iArr3[6] == -1 && android.support.v4.media.b.C0(iArr3, b.f192s))) {
            android.support.v4.media.b.o(7, 6803, iArr3);
        }
        if (!a0Var3.g()) {
            int[] iArr9 = a0Var6.f473f;
            b.T(iArr9, a0Var3.f473f, iArr9);
        }
        return new b0(dVar, a0Var4, a0Var5, new e[]{a0Var6});
    }

    public final f x(f fVar) {
        return this == fVar ? u() : j() ? fVar : fVar.j() ? w() : this.f13247c.h() ? fVar : w().a(fVar);
    }
}
