package yg;

import a.b;
import xg.e;
import xg.f;

public final class d extends f.c {
    public d(xg.d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public d(xg.d dVar, e eVar, e eVar2, e[] eVarArr) {
        super(dVar, eVar, eVar2, eVarArr);
    }

    public final d A(boolean z) {
        c cVar = (c) this.f13246b;
        c cVar2 = (c) this.f13247c;
        c cVar3 = (c) this.f13248d[0];
        c z10 = z();
        int[] iArr = new int[8];
        b.H0(cVar.f13660f, iArr);
        int u10 = android.support.v4.media.b.u(iArr, iArr, iArr);
        int[] iArr2 = z10.f13660f;
        long j10 = (((long) iArr2[0]) & 4294967295L) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j10;
        c cVar4 = z10;
        long j11 = (((long) iArr2[1]) & 4294967295L) + (((long) iArr[1]) & 4294967295L) + (j10 >>> 32);
        iArr[1] = (int) j11;
        long j12 = (((long) iArr2[2]) & 4294967295L) + (((long) iArr[2]) & 4294967295L) + (j11 >>> 32);
        iArr[2] = (int) j12;
        long j13 = (((long) iArr2[3]) & 4294967295L) + (((long) iArr[3]) & 4294967295L) + (j12 >>> 32);
        iArr[3] = (int) j13;
        long j14 = (((long) iArr2[4]) & 4294967295L) + (((long) iArr[4]) & 4294967295L) + (j13 >>> 32);
        iArr[4] = (int) j14;
        long j15 = (((long) iArr2[5]) & 4294967295L) + (((long) iArr[5]) & 4294967295L) + (j14 >>> 32);
        iArr[5] = (int) j15;
        long j16 = (((long) iArr2[6]) & 4294967295L) + (((long) iArr[6]) & 4294967295L) + (j15 >>> 32);
        iArr[6] = (int) j16;
        long j17 = (((long) iArr2[7]) & 4294967295L) + (((long) iArr[7]) & 4294967295L) + (j16 >>> 32);
        iArr[7] = (int) j17;
        b.z0(u10 + ((int) (j17 >>> 32)), iArr);
        int[] iArr3 = new int[8];
        b.P0(cVar2.f13660f, iArr3);
        int[] iArr4 = new int[8];
        b.t0(iArr3, cVar2.f13660f, iArr4);
        int[] iArr5 = new int[8];
        b.t0(iArr4, cVar.f13660f, iArr5);
        b.P0(iArr5, iArr5);
        int[] iArr6 = new int[8];
        b.H0(iArr4, iArr6);
        b.P0(iArr6, iArr6);
        c cVar5 = new c(iArr4);
        b.H0(iArr, iArr4);
        int[] iArr7 = cVar5.f13660f;
        b.M0(iArr7, iArr5, iArr7);
        int[] iArr8 = cVar5.f13660f;
        b.M0(iArr8, iArr5, iArr8);
        c cVar6 = new c(iArr5);
        b.M0(iArr5, cVar5.f13660f, iArr5);
        int[] iArr9 = cVar6.f13660f;
        b.t0(iArr9, iArr, iArr9);
        int[] iArr10 = cVar6.f13660f;
        b.M0(iArr10, iArr6, iArr10);
        c cVar7 = new c(iArr3);
        if (!android.support.v4.media.b.R0(cVar3.f13660f)) {
            int[] iArr11 = cVar7.f13660f;
            b.t0(iArr11, cVar3.f13660f, iArr11);
        }
        c cVar8 = null;
        if (z) {
            cVar8 = new c(iArr6);
            b.t0(iArr6, cVar4.f13660f, iArr6);
            int[] iArr12 = cVar8.f13660f;
            b.P0(iArr12, iArr12);
        }
        return new d(this.f13245a, cVar5, cVar6, new e[]{cVar7, cVar8});
    }

    /* JADX WARNING: type inference failed for: r23v0, types: [xg.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xg.f a(xg.f r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r22.j()
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r2 = r23.j()
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            if (r0 != r1) goto L_0x0019
            xg.f r1 = r22.w()
            return r1
        L_0x0019:
            xg.d r2 = r0.f13245a
            xg.e r3 = r0.f13246b
            yg.c r3 = (yg.c) r3
            xg.e r4 = r0.f13247c
            yg.c r4 = (yg.c) r4
            xg.e[] r5 = r0.f13248d
            r6 = 0
            r5 = r5[r6]
            yg.c r5 = (yg.c) r5
            xg.e r7 = r1.f13246b
            yg.c r7 = (yg.c) r7
            xg.e r8 = r23.g()
            yg.c r8 = (yg.c) r8
            xg.e r1 = r23.h()
            yg.c r1 = (yg.c) r1
            r9 = 16
            int[] r10 = new int[r9]
            r11 = 8
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r5.g()
            if (r15 == 0) goto L_0x0051
            int[] r7 = r7.f13660f
            int[] r8 = r8.f13660f
            goto L_0x0067
        L_0x0051:
            int[] r6 = r5.f13660f
            a.b.H0(r6, r13)
            int[] r6 = r7.f13660f
            a.b.t0(r13, r6, r12)
            int[] r6 = r5.f13660f
            a.b.t0(r13, r6, r13)
            int[] r6 = r8.f13660f
            a.b.t0(r13, r6, r13)
            r7 = r12
            r8 = r13
        L_0x0067:
            boolean r6 = r1.g()
            if (r6 == 0) goto L_0x0072
            int[] r3 = r3.f13660f
            int[] r4 = r4.f13660f
            goto L_0x0088
        L_0x0072:
            int[] r9 = r1.f13660f
            a.b.H0(r9, r14)
            int[] r3 = r3.f13660f
            a.b.t0(r14, r3, r10)
            int[] r3 = r1.f13660f
            a.b.t0(r14, r3, r14)
            int[] r3 = r4.f13660f
            a.b.t0(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0088:
            int[] r9 = new int[r11]
            a.b.M0(r3, r7, r9)
            a.b.M0(r4, r8, r12)
            boolean r7 = android.support.v4.media.b.a1(r9)
            if (r7 == 0) goto L_0x00a6
            boolean r1 = android.support.v4.media.b.a1(r12)
            if (r1 == 0) goto L_0x00a1
            xg.f r1 = r22.w()
            return r1
        L_0x00a1:
            xg.f r1 = r2.l()
            return r1
        L_0x00a6:
            int[] r7 = new int[r11]
            a.b.H0(r9, r7)
            int[] r8 = new int[r11]
            a.b.t0(r7, r9, r8)
            a.b.t0(r7, r3, r13)
            boolean r3 = android.support.v4.media.b.a1(r8)
            if (r3 == 0) goto L_0x00bd
            android.support.v4.media.b.q2(r8)
            goto L_0x00c2
        L_0x00bd:
            int[] r3 = a.b.D
            android.support.v4.media.b.Z1(r3, r8, r8)
        L_0x00c2:
            android.support.v4.media.b.p1(r4, r8, r10)
            int r3 = android.support.v4.media.b.u(r13, r13, r8)
            a.b.z0(r3, r8)
            yg.c r3 = new yg.c
            r3.<init>((int[]) r14)
            a.b.H0(r12, r14)
            int[] r4 = r3.f13660f
            a.b.M0(r4, r8, r4)
            yg.c r4 = new yg.c
            r4.<init>((int[]) r8)
            int[] r14 = r3.f13660f
            a.b.M0(r13, r14, r8)
            int[] r8 = r4.f13660f
            android.support.v4.media.b.v1(r8, r12, r10)
            int[] r8 = a.b.E
            r12 = 16
            boolean r12 = android.support.v4.media.b.y0(r12, r10, r8)
            if (r12 == 0) goto L_0x0151
            r12 = 0
            r14 = r10[r12]
            long r13 = (long) r14
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r16
            r11 = r8[r12]
            r18 = r2
            r19 = r3
            long r2 = (long) r11
            long r2 = r2 & r16
            long r13 = r13 - r2
            int r2 = (int) r13
            r10[r12] = r2
            r2 = 32
            long r11 = r13 >> r2
            r13 = 0
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x011d
            r3 = 1
            r13 = 8
            int r11 = android.support.v4.media.b.Y(r13, r10, r3)
            long r11 = (long) r11
            goto L_0x011f
        L_0x011d:
            r13 = 8
        L_0x011f:
            r3 = r10[r13]
            long r2 = (long) r3
            long r2 = r2 & r16
            r20 = 19
            long r2 = r2 + r20
            long r2 = r2 + r11
            int r11 = (int) r2
            r10[r13] = r11
            r11 = 32
            long r2 = r2 >> r11
            r11 = 0
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            r12 = 15
            if (r11 == 0) goto L_0x013e
            r2 = 9
            int r2 = android.support.v4.media.b.G0(r12, r10, r2)
            long r2 = (long) r2
        L_0x013e:
            r11 = r10[r12]
            long r13 = (long) r11
            long r13 = r13 & r16
            r8 = r8[r12]
            r11 = 1
            int r8 = r8 + r11
            r11 = r7
            long r7 = (long) r8
            long r7 = r7 & r16
            long r13 = r13 - r7
            long r13 = r13 + r2
            int r2 = (int) r13
            r10[r12] = r2
            goto L_0x0156
        L_0x0151:
            r18 = r2
            r19 = r3
            r11 = r7
        L_0x0156:
            int[] r2 = r4.f13660f
            a.b.x0(r10, r2)
            yg.c r2 = new yg.c
            r2.<init>((int[]) r9)
            if (r15 != 0) goto L_0x0167
            int[] r3 = r5.f13660f
            a.b.t0(r9, r3, r9)
        L_0x0167:
            if (r6 != 0) goto L_0x0170
            int[] r3 = r2.f13660f
            int[] r1 = r1.f13660f
            a.b.t0(r3, r1, r3)
        L_0x0170:
            if (r15 == 0) goto L_0x0176
            if (r6 == 0) goto L_0x0176
            r7 = r11
            goto L_0x0177
        L_0x0176:
            r7 = 0
        L_0x0177:
            yg.c r1 = r0.y(r2, r7)
            r3 = 2
            xg.e[] r3 = new xg.e[r3]
            r5 = 0
            r3[r5] = r2
            r2 = 1
            r3[r2] = r1
            yg.d r1 = new yg.d
            r2 = r18
            r5 = r19
            r1.<init>(r2, r5, r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.d.a(xg.f):xg.f");
    }

    public final e h() {
        return super.h();
    }

    public final f m() {
        if (j()) {
            return this;
        }
        return new d(this.f13245a, this.f13246b, this.f13247c.k(), this.f13248d);
    }

    public final f u() {
        return (!j() && !this.f13247c.h()) ? A(false).a(this) : this;
    }

    public final f w() {
        if (j()) {
            return this;
        }
        return this.f13247c.h() ? this.f13245a.l() : A(true);
    }

    public final f x(f fVar) {
        return this == fVar ? u() : j() ? fVar : fVar.j() ? w() : this.f13247c.h() ? fVar : A(false).a(fVar);
    }

    public final c y(c cVar, int[] iArr) {
        c cVar2 = (c) this.f13245a.f13238b;
        if (cVar.g()) {
            return cVar2;
        }
        c cVar3 = new c();
        if (iArr == null) {
            iArr = cVar3.f13660f;
            b.H0(cVar.f13660f, iArr);
        }
        b.H0(iArr, cVar3.f13660f);
        int[] iArr2 = cVar3.f13660f;
        b.t0(iArr2, cVar2.f13660f, iArr2);
        return cVar3;
    }

    public final c z() {
        e[] eVarArr = this.f13248d;
        c cVar = (c) eVarArr[1];
        if (cVar != null) {
            return cVar;
        }
        c y10 = y((c) eVarArr[0], (int[]) null);
        eVarArr[1] = y10;
        return y10;
    }
}
