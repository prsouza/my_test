package ah;

import aa.b;
import xg.d;
import xg.e;
import xg.f;

public final class k extends f.c {
    public k(d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public k(d dVar, e eVar, e eVar2, e[] eVarArr) {
        super(dVar, eVar, eVar2, eVarArr);
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [xg.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00eb, code lost:
        if (android.support.v4.media.b.y0(10, r10, aa.b.f190b) != false) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f  */
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
            ah.j r3 = (ah.j) r3
            xg.e r4 = r0.f13247c
            ah.j r4 = (ah.j) r4
            xg.e r5 = r1.f13246b
            ah.j r5 = (ah.j) r5
            xg.e r6 = r17.g()
            ah.j r6 = (ah.j) r6
            xg.e[] r7 = r0.f13248d
            r8 = 0
            r7 = r7[r8]
            ah.j r7 = (ah.j) r7
            xg.e r1 = r17.h()
            ah.j r1 = (ah.j) r1
            r9 = 10
            int[] r10 = new int[r9]
            r11 = 5
            int[] r12 = new int[r11]
            int[] r13 = new int[r11]
            int[] r14 = new int[r11]
            boolean r15 = r7.g()
            if (r15 == 0) goto L_0x0050
            int[] r5 = r5.f540f
            int[] r6 = r6.f540f
            goto L_0x0066
        L_0x0050:
            int[] r8 = r7.f540f
            aa.b.g0(r8, r13)
            int[] r5 = r5.f540f
            aa.b.R(r13, r5, r12)
            int[] r5 = r7.f540f
            aa.b.R(r13, r5, r13)
            int[] r5 = r6.f540f
            aa.b.R(r13, r5, r13)
            r5 = r12
            r6 = r13
        L_0x0066:
            boolean r8 = r1.g()
            if (r8 == 0) goto L_0x0071
            int[] r3 = r3.f540f
            int[] r4 = r4.f540f
            goto L_0x0087
        L_0x0071:
            int[] r9 = r1.f540f
            aa.b.g0(r9, r14)
            int[] r3 = r3.f540f
            aa.b.R(r14, r3, r10)
            int[] r3 = r1.f540f
            aa.b.R(r14, r3, r14)
            int[] r3 = r4.f540f
            aa.b.R(r14, r3, r14)
            r3 = r10
            r4 = r14
        L_0x0087:
            int[] r9 = new int[r11]
            aa.b.o0(r3, r5, r9)
            aa.b.o0(r4, r6, r12)
            boolean r5 = android.support.v4.media.b.X0(r9)
            if (r5 == 0) goto L_0x00a5
            boolean r1 = android.support.v4.media.b.X0(r12)
            if (r1 == 0) goto L_0x00a0
            xg.f r1 = r16.w()
            return r1
        L_0x00a0:
            xg.f r1 = r2.l()
            return r1
        L_0x00a5:
            aa.b.g0(r9, r13)
            int[] r5 = new int[r11]
            aa.b.R(r13, r9, r5)
            aa.b.R(r13, r3, r13)
            aa.b.W(r5, r5)
            android.support.v4.media.b.m1(r4, r5, r10)
            int r3 = android.support.v4.media.b.r(r13, r13, r5)
            aa.b.b0(r3, r5)
            ah.j r3 = new ah.j
            r3.<init>((int[]) r14)
            aa.b.g0(r12, r14)
            int[] r4 = r3.f540f
            aa.b.o0(r4, r5, r4)
            ah.j r4 = new ah.j
            r4.<init>((int[]) r5)
            int[] r6 = r3.f540f
            aa.b.o0(r13, r6, r5)
            int[] r5 = r4.f540f
            int r5 = android.support.v4.media.b.s1(r5, r12, r10)
            if (r5 != 0) goto L_0x00ee
            r5 = 9
            r5 = r10[r5]
            r6 = -1
            if (r5 != r6) goto L_0x00fc
            int[] r5 = aa.b.f190b
            r6 = 10
            boolean r5 = android.support.v4.media.b.y0(r6, r10, r5)
            if (r5 == 0) goto L_0x00fc
            goto L_0x00f0
        L_0x00ee:
            r6 = 10
        L_0x00f0:
            int[] r5 = aa.b.f191c
            r11 = 7
            int r5 = android.support.v4.media.b.v(r11, r5, r10)
            if (r5 == 0) goto L_0x00fc
            android.support.v4.media.b.G0(r6, r10, r11)
        L_0x00fc:
            int[] r5 = r4.f540f
            aa.b.X(r10, r5)
            ah.j r5 = new ah.j
            r5.<init>((int[]) r9)
            if (r15 != 0) goto L_0x010d
            int[] r6 = r7.f540f
            aa.b.R(r9, r6, r9)
        L_0x010d:
            if (r8 != 0) goto L_0x0116
            int[] r6 = r5.f540f
            int[] r1 = r1.f540f
            aa.b.R(r6, r1, r6)
        L_0x0116:
            r1 = 1
            xg.e[] r1 = new xg.e[r1]
            r6 = 0
            r1[r6] = r5
            ah.k r5 = new ah.k
            r5.<init>(r2, r3, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.k.a(xg.f):xg.f");
    }

    public final f m() {
        return j() ? this : new k(this.f13245a, this.f13246b, this.f13247c.k(), this.f13248d);
    }

    public final f u() {
        return (j() || this.f13247c.h()) ? this : w().a(this);
    }

    public final f w() {
        if (j()) {
            return this;
        }
        d dVar = this.f13245a;
        j jVar = (j) this.f13247c;
        if (jVar.h()) {
            return dVar.l();
        }
        j jVar2 = (j) this.f13246b;
        j jVar3 = (j) this.f13248d[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        b.g0(jVar.f540f, iArr3);
        int[] iArr4 = new int[5];
        b.g0(iArr3, iArr4);
        boolean g = jVar3.g();
        int[] iArr5 = jVar3.f540f;
        if (!g) {
            b.g0(iArr5, iArr2);
            iArr5 = iArr2;
        }
        b.o0(jVar2.f540f, iArr5, iArr);
        b.k(jVar2.f540f, iArr5, iArr2);
        b.R(iArr2, iArr, iArr2);
        b.b0(android.support.v4.media.b.r(iArr2, iArr2, iArr2), iArr2);
        b.R(iArr3, jVar2.f540f, iArr3);
        b.b0(android.support.v4.media.b.G1(5, iArr3), iArr3);
        b.b0(android.support.v4.media.b.H1(5, iArr4, iArr), iArr);
        j jVar4 = new j(iArr4);
        b.g0(iArr2, iArr4);
        int[] iArr6 = jVar4.f540f;
        b.o0(iArr6, iArr3, iArr6);
        int[] iArr7 = jVar4.f540f;
        b.o0(iArr7, iArr3, iArr7);
        j jVar5 = new j(iArr3);
        b.o0(iArr3, jVar4.f540f, iArr3);
        int[] iArr8 = jVar5.f540f;
        b.R(iArr8, iArr2, iArr8);
        int[] iArr9 = jVar5.f540f;
        b.o0(iArr9, iArr, iArr9);
        j jVar6 = new j(iArr2);
        if (android.support.v4.media.b.F1(5, jVar.f540f, 0, iArr2) != 0 || (iArr2[4] == -1 && android.support.v4.media.b.A0(iArr2, b.f189a))) {
            android.support.v4.media.b.C(5, -2147483647, iArr2);
        }
        if (!g) {
            int[] iArr10 = jVar6.f540f;
            b.R(iArr10, jVar3.f540f, iArr10);
        }
        return new k(dVar, jVar4, jVar5, new e[]{jVar6});
    }

    public final f x(f fVar) {
        return this == fVar ? u() : j() ? fVar : fVar.j() ? w() : this.f13247c.h() ? fVar : w().a(fVar);
    }
}
