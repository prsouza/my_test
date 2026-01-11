package ah;

import android.support.v4.media.b;
import xg.d;
import xg.e;
import xg.f;
import y.c;

public final class s extends f.c {
    public s(d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public s(d dVar, e eVar, e eVar2, e[] eVarArr) {
        super(dVar, eVar, eVar2, eVarArr);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [xg.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00eb, code lost:
        if (android.support.v4.media.b.y0(12, r10, y.c.f13318c) != false) goto L_0x00f0;
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
            ah.r r3 = (ah.r) r3
            xg.e r4 = r0.f13247c
            ah.r r4 = (ah.r) r4
            xg.e r5 = r1.f13246b
            ah.r r5 = (ah.r) r5
            xg.e r6 = r17.g()
            ah.r r6 = (ah.r) r6
            xg.e[] r7 = r0.f13248d
            r8 = 0
            r7 = r7[r8]
            ah.r r7 = (ah.r) r7
            xg.e r1 = r17.h()
            ah.r r1 = (ah.r) r1
            r9 = 12
            int[] r10 = new int[r9]
            r11 = 6
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.g()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f589f
            int[] r6 = r6.f589f
            goto L_0x0066
        L_0x0050:
            int[] r8 = r7.f589f
            y.c.e0(r8, r13)
            int[] r5 = r5.f589f
            y.c.R(r13, r5, r12)
            int[] r5 = r7.f589f
            y.c.R(r13, r5, r13)
            int[] r5 = r6.f589f
            y.c.R(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r8 = r1.g()
            if (r8 == 0) goto L_0x0071
            int[] r3 = r3.f589f
            int[] r4 = r4.f589f
            goto L_0x0087
        L_0x0071:
            int[] r9 = r1.f589f
            y.c.e0(r9, r14)
            int[] r3 = r3.f589f
            y.c.R(r14, r3, r10)
            int[] r3 = r1.f589f
            y.c.R(r14, r3, r14)
            int[] r3 = r4.f589f
            y.c.R(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0087:
            int[] r9 = new int[r11]
            y.c.l0(r3, r5, r9)
            y.c.l0(r4, r6, r12)
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
            y.c.e0(r9, r13)
            int[] r5 = new int[r11]
            y.c.R(r13, r9, r5)
            y.c.R(r13, r3, r13)
            y.c.W(r5, r5)
            android.support.v4.media.b.n1(r4, r5, r10)
            int r3 = android.support.v4.media.b.s(r13, r13, r5)
            y.c.c0(r3, r5)
            ah.r r3 = new ah.r
            r3.<init>((int[]) r14)
            y.c.e0(r12, r14)
            int[] r4 = r3.f589f
            y.c.l0(r4, r5, r4)
            ah.r r4 = new ah.r
            r4.<init>((int[]) r5)
            int[] r6 = r3.f589f
            y.c.l0(r13, r6, r5)
            int[] r5 = r4.f589f
            int r5 = android.support.v4.media.b.t1(r5, r12, r10)
            if (r5 != 0) goto L_0x00ee
            r5 = 11
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x00fd
            int[] r5 = y.c.f13318c
            r6 = 12
            boolean r5 = android.support.v4.media.b.y0(r6, r10, r5)
            if (r5 == 0) goto L_0x00fd
            goto L_0x00f0
        L_0x00ee:
            r6 = 12
        L_0x00f0:
            int[] r5 = y.c.f13319s
            r11 = 8
            int r5 = android.support.v4.media.b.v(r11, r5, r10)
            if (r5 == 0) goto L_0x00fd
            android.support.v4.media.b.G0(r6, r10, r11)
        L_0x00fd:
            int[] r5 = r4.f589f
            y.c.Z(r10, r5)
            ah.r r5 = new ah.r
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x010e
            int[] r6 = r7.f589f
            y.c.R(r9, r6, r9)
        L_0x010e:
            if (r8 != 0) goto L_0x0117
            int[] r6 = r5.f589f
            int[] r1 = r1.f589f
            y.c.R(r6, r1, r6)
        L_0x0117:
            r1 = 1
            xg.e[] r1 = new xg.e[r1]
            r6 = 0
            r1[r6] = r5
            ah.s r5 = new ah.s
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.s.a(xg.f):xg.f");
    }

    public final f m() {
        return j() ? this : new s(this.f13245a, this.f13246b, this.f13247c.k(), this.f13248d);
    }

    public final f u() {
        return (j() || this.f13247c.h()) ? this : w().a(this);
    }

    public final f w() {
        if (j()) {
            return this;
        }
        d dVar = this.f13245a;
        r rVar = (r) this.f13247c;
        if (rVar.h()) {
            return dVar.l();
        }
        r rVar2 = (r) this.f13246b;
        r rVar3 = (r) this.f13248d[0];
        int[] iArr = new int[6];
        c.e0(rVar.f589f, iArr);
        int[] iArr2 = new int[6];
        c.e0(iArr, iArr2);
        int[] iArr3 = new int[6];
        c.e0(rVar2.f589f, iArr3);
        c.c0(b.s(iArr3, iArr3, iArr3), iArr3);
        c.R(iArr, rVar2.f589f, iArr);
        c.c0(b.G1(6, iArr), iArr);
        int[] iArr4 = new int[6];
        c.c0(b.H1(6, iArr2, iArr4), iArr4);
        r rVar4 = new r(iArr2);
        c.e0(iArr3, iArr2);
        int[] iArr5 = rVar4.f589f;
        c.l0(iArr5, iArr, iArr5);
        int[] iArr6 = rVar4.f589f;
        c.l0(iArr6, iArr, iArr6);
        r rVar5 = new r(iArr);
        c.l0(iArr, rVar4.f589f, iArr);
        int[] iArr7 = rVar5.f589f;
        c.R(iArr7, iArr3, iArr7);
        int[] iArr8 = rVar5.f589f;
        c.l0(iArr8, iArr4, iArr8);
        r rVar6 = new r(iArr3);
        if (b.F1(6, rVar.f589f, 0, iArr3) != 0 || (iArr3[5] == -1 && b.B0(iArr3, c.f13317b))) {
            b.o(6, 4553, iArr3);
        }
        if (!rVar3.g()) {
            int[] iArr9 = rVar6.f589f;
            c.R(iArr9, rVar3.f589f, iArr9);
        }
        return new s(dVar, rVar4, rVar5, new e[]{rVar6});
    }

    public final f x(f fVar) {
        return this == fVar ? u() : j() ? fVar : fVar.j() ? w() : this.f13247c.h() ? fVar : w().a(fVar);
    }
}
