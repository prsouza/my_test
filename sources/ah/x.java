package ah;

import android.support.v4.media.b;
import xg.d;
import xg.e;
import xg.f;

public final class x extends f.c {
    public x(d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public x(d dVar, e eVar, e eVar2, e[] eVarArr) {
        super(dVar, eVar, eVar2, eVarArr);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [xg.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00eb, code lost:
        if (android.support.v4.media.b.y0(12, r10, ah.v.f614b) != false) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0110  */
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
            ah.w r3 = (ah.w) r3
            xg.e r4 = r0.f13247c
            ah.w r4 = (ah.w) r4
            xg.e r5 = r1.f13246b
            ah.w r5 = (ah.w) r5
            xg.e r6 = r17.g()
            ah.w r6 = (ah.w) r6
            xg.e[] r7 = r0.f13248d
            r8 = 0
            r7 = r7[r8]
            ah.w r7 = (ah.w) r7
            xg.e r1 = r17.h()
            ah.w r1 = (ah.w) r1
            r9 = 12
            int[] r10 = new int[r9]
            r11 = 6
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.g()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f628f
            int[] r6 = r6.f628f
            goto L_0x0066
        L_0x0050:
            int[] r8 = r7.f628f
            ah.v.r0(r8, r13)
            int[] r5 = r5.f628f
            ah.v.T(r13, r5, r12)
            int[] r5 = r7.f628f
            ah.v.T(r13, r5, r13)
            int[] r5 = r6.f628f
            ah.v.T(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r8 = r1.g()
            if (r8 == 0) goto L_0x0071
            int[] r3 = r3.f628f
            int[] r4 = r4.f628f
            goto L_0x0087
        L_0x0071:
            int[] r9 = r1.f628f
            ah.v.r0(r9, r14)
            int[] r3 = r3.f628f
            ah.v.T(r14, r3, r10)
            int[] r3 = r1.f628f
            ah.v.T(r14, r3, r14)
            int[] r3 = r4.f628f
            ah.v.T(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0087:
            int[] r9 = new int[r11]
            ah.v.A0(r3, r5, r9)
            ah.v.A0(r4, r6, r12)
            boolean r5 = android.support.v4.media.b.Y0(r9)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = android.support.v4.media.b.Y0(r12)
            if (r1 == 0) goto L_0x00a0
            xg.f r1 = r16.w()
            return r1
        L_0x00a0:
            xg.f r1 = r2.l()
            return r1
        L_0x00a5:
            ah.v.r0(r9, r13)
            int[] r5 = new int[r11]
            ah.v.T(r13, r9, r5)
            ah.v.T(r13, r3, r13)
            ah.v.a0(r5, r5)
            android.support.v4.media.b.n1(r4, r5, r10)
            int r3 = android.support.v4.media.b.s(r13, r13, r5)
            ah.v.l0(r3, r5)
            ah.w r3 = new ah.w
            r3.<init>((int[]) r14)
            ah.v.r0(r12, r14)
            int[] r4 = r3.f628f
            ah.v.A0(r4, r5, r4)
            ah.w r4 = new ah.w
            r4.<init>((int[]) r5)
            int[] r6 = r3.f628f
            ah.v.A0(r13, r6, r5)
            int[] r5 = r4.f628f
            int r5 = android.support.v4.media.b.t1(r5, r12, r10)
            if (r5 != 0) goto L_0x00ee
            r5 = 11
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x00fd
            int[] r5 = ah.v.f614b
            r6 = 12
            boolean r5 = android.support.v4.media.b.y0(r6, r10, r5)
            if (r5 == 0) goto L_0x00fd
            goto L_0x00f0
        L_0x00ee:
            r6 = 12
        L_0x00f0:
            int[] r5 = ah.v.f615c
            r11 = 9
            int r5 = android.support.v4.media.b.v(r11, r5, r10)
            if (r5 == 0) goto L_0x00fd
            android.support.v4.media.b.G0(r6, r10, r11)
        L_0x00fd:
            int[] r5 = r4.f628f
            ah.v.g0(r10, r5)
            ah.w r5 = new ah.w
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x010e
            int[] r6 = r7.f628f
            ah.v.T(r9, r6, r9)
        L_0x010e:
            if (r8 != 0) goto L_0x0117
            int[] r6 = r5.f628f
            int[] r1 = r1.f628f
            ah.v.T(r6, r1, r6)
        L_0x0117:
            r1 = 1
            xg.e[] r1 = new xg.e[r1]
            r6 = 0
            r1[r6] = r5
            ah.x r5 = new ah.x
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.x.a(xg.f):xg.f");
    }

    public final f m() {
        return j() ? this : new x(this.f13245a, this.f13246b, this.f13247c.k(), this.f13248d);
    }

    public final f u() {
        return (j() || this.f13247c.h()) ? this : w().a(this);
    }

    public final f w() {
        if (j()) {
            return this;
        }
        d dVar = this.f13245a;
        w wVar = (w) this.f13247c;
        if (wVar.h()) {
            return dVar.l();
        }
        w wVar2 = (w) this.f13246b;
        w wVar3 = (w) this.f13248d[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        v.r0(wVar.f628f, iArr3);
        int[] iArr4 = new int[6];
        v.r0(iArr3, iArr4);
        boolean g = wVar3.g();
        int[] iArr5 = wVar3.f628f;
        if (!g) {
            v.r0(iArr5, iArr2);
            iArr5 = iArr2;
        }
        v.A0(wVar2.f628f, iArr5, iArr);
        v.o(wVar2.f628f, iArr5, iArr2);
        v.T(iArr2, iArr, iArr2);
        v.l0(b.s(iArr2, iArr2, iArr2), iArr2);
        v.T(iArr3, wVar2.f628f, iArr3);
        v.l0(b.G1(6, iArr3), iArr3);
        v.l0(b.H1(6, iArr4, iArr), iArr);
        w wVar4 = new w(iArr4);
        v.r0(iArr2, iArr4);
        int[] iArr6 = wVar4.f628f;
        v.A0(iArr6, iArr3, iArr6);
        int[] iArr7 = wVar4.f628f;
        v.A0(iArr7, iArr3, iArr7);
        w wVar5 = new w(iArr3);
        v.A0(iArr3, wVar4.f628f, iArr3);
        int[] iArr8 = wVar5.f628f;
        v.T(iArr8, iArr2, iArr8);
        int[] iArr9 = wVar5.f628f;
        v.A0(iArr9, iArr, iArr9);
        w wVar6 = new w(iArr2);
        if (b.F1(6, wVar.f628f, 0, iArr2) != 0 || (iArr2[5] == -1 && b.B0(iArr2, v.f613a))) {
            v.v(iArr2);
        }
        if (!g) {
            int[] iArr10 = wVar6.f628f;
            v.T(iArr10, wVar3.f628f, iArr10);
        }
        return new x(dVar, wVar4, wVar5, new e[]{wVar6});
    }

    public final f x(f fVar) {
        return this == fVar ? u() : j() ? fVar : fVar.j() ? w() : this.f13247c.h() ? fVar : w().a(fVar);
    }
}
