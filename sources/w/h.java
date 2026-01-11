package w;

import v.e;
import v.f;
import w.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static b.a f12515a = new b.a();

    public static boolean a(e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b[] bVarArr = eVar.U;
        e.b bVar3 = bVarArr[0];
        e.b bVar4 = bVarArr[1];
        e eVar2 = eVar.V;
        f fVar = eVar2 != null ? (f) eVar2 : null;
        if (fVar != null) {
            e.b bVar5 = fVar.U[0];
            e.b bVar6 = e.b.FIXED;
        }
        if (fVar != null) {
            e.b bVar7 = fVar.U[1];
            e.b bVar8 = e.b.FIXED;
        }
        e.b bVar9 = e.b.FIXED;
        boolean z = bVar3 == bVar9 || eVar.B() || bVar3 == e.b.WRAP_CONTENT || (bVar3 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f12081r == 0 && eVar.Y == 0.0f && eVar.u(0)) || (bVar3 == bVar2 && eVar.f12081r == 1 && eVar.v(0, eVar.r()));
        boolean z10 = bVar4 == bVar9 || eVar.C() || bVar4 == e.b.WRAP_CONTENT || (bVar4 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f12082s == 0 && eVar.Y == 0.0f && eVar.u(1)) || (bVar4 == bVar && eVar.f12082s == 1 && eVar.v(1, eVar.k()));
        if (eVar.Y > 0.0f && (z || z10)) {
            return true;
        }
        if (!z || !z10) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r11 = r12.L.f12047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        r11 = r15.f12047f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r16, v.e r17, w.b.C0243b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f12071m
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            boolean r3 = r0 instanceof v.f
            r4 = 0
            if (r3 != 0) goto L_0x0024
            boolean r3 = r17.A()
            if (r3 == 0) goto L_0x0024
            boolean r3 = a(r17)
            if (r3 == 0) goto L_0x0024
            w.b$a r3 = new w.b$a
            r3.<init>()
            v.f.c0(r0, r1, r3)
        L_0x0024:
            v.d$b r3 = v.d.b.LEFT
            v.d r3 = r0.h(r3)
            v.d$b r5 = v.d.b.RIGHT
            v.d r5 = r0.h(r5)
            int r6 = r3.c()
            int r7 = r5.c()
            java.util.HashSet<v.d> r8 = r3.f12042a
            if (r8 == 0) goto L_0x0110
            boolean r3 = r3.f12044c
            if (r3 == 0) goto L_0x0110
            java.util.Iterator r3 = r8.iterator()
        L_0x0044:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0110
            java.lang.Object r8 = r3.next()
            v.d r8 = (v.d) r8
            v.e r12 = r8.f12045d
            int r13 = r16 + 1
            boolean r14 = a(r12)
            boolean r15 = r12.A()
            if (r15 == 0) goto L_0x0068
            if (r14 == 0) goto L_0x0068
            w.b$a r15 = new w.b$a
            r15.<init>()
            v.f.c0(r12, r1, r15)
        L_0x0068:
            v.d r15 = r12.J
            if (r8 != r15) goto L_0x0076
            v.d r11 = r12.L
            v.d r11 = r11.f12047f
            if (r11 == 0) goto L_0x0076
            boolean r11 = r11.f12044c
            if (r11 != 0) goto L_0x0082
        L_0x0076:
            v.d r11 = r12.L
            if (r8 != r11) goto L_0x0084
            v.d r11 = r15.f12047f
            if (r11 == 0) goto L_0x0084
            boolean r11 = r11.f12044c
            if (r11 == 0) goto L_0x0084
        L_0x0082:
            r11 = 1
            goto L_0x0085
        L_0x0084:
            r11 = r4
        L_0x0085:
            v.e$b[] r15 = r12.U
            r9 = r15[r4]
            v.e$b r10 = v.e.b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x00c3
            if (r14 == 0) goto L_0x0090
            goto L_0x00c3
        L_0x0090:
            r8 = r15[r4]
            if (r8 != r10) goto L_0x0044
            int r8 = r12.f12085v
            if (r8 < 0) goto L_0x0044
            int r8 = r12.f12084u
            if (r8 < 0) goto L_0x0044
            int r8 = r12.f12064i0
            r9 = 8
            if (r8 == r9) goto L_0x00ad
            int r8 = r12.f12081r
            if (r8 != 0) goto L_0x0044
            float r8 = r12.Y
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0044
        L_0x00ad:
            boolean r8 = r12.y()
            if (r8 != 0) goto L_0x0044
            boolean r8 = r12.G
            if (r8 != 0) goto L_0x0044
            if (r11 == 0) goto L_0x0044
            boolean r8 = r12.y()
            if (r8 != 0) goto L_0x0044
            d(r13, r0, r1, r12, r2)
            goto L_0x0044
        L_0x00c3:
            boolean r9 = r12.A()
            if (r9 == 0) goto L_0x00cb
            goto L_0x0044
        L_0x00cb:
            v.d r9 = r12.J
            if (r8 != r9) goto L_0x00e7
            v.d r10 = r12.L
            v.d r10 = r10.f12047f
            if (r10 != 0) goto L_0x00e7
            int r8 = r9.d()
            int r8 = r8 + r6
            int r9 = r12.r()
            int r9 = r9 + r8
            r12.J(r8, r9)
            b(r13, r12, r1, r2)
            goto L_0x0044
        L_0x00e7:
            v.d r10 = r12.L
            if (r8 != r10) goto L_0x0103
            v.d r8 = r9.f12047f
            if (r8 != 0) goto L_0x0103
            int r8 = r10.d()
            int r8 = r6 - r8
            int r9 = r12.r()
            int r9 = r8 - r9
            r12.J(r9, r8)
            b(r13, r12, r1, r2)
            goto L_0x0044
        L_0x0103:
            if (r11 == 0) goto L_0x0044
            boolean r8 = r12.y()
            if (r8 != 0) goto L_0x0044
            c(r13, r1, r12, r2)
            goto L_0x0044
        L_0x0110:
            boolean r3 = r0 instanceof v.g
            if (r3 == 0) goto L_0x0115
            return
        L_0x0115:
            java.util.HashSet<v.d> r3 = r5.f12042a
            if (r3 == 0) goto L_0x01f9
            boolean r5 = r5.f12044c
            if (r5 == 0) goto L_0x01f9
            java.util.Iterator r3 = r3.iterator()
        L_0x0121:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01f9
            java.lang.Object r5 = r3.next()
            v.d r5 = (v.d) r5
            v.e r6 = r5.f12045d
            r8 = 1
            int r9 = r16 + 1
            boolean r8 = a(r6)
            boolean r10 = r6.A()
            if (r10 == 0) goto L_0x0146
            if (r8 == 0) goto L_0x0146
            w.b$a r10 = new w.b$a
            r10.<init>()
            v.f.c0(r6, r1, r10)
        L_0x0146:
            v.d r10 = r6.J
            if (r5 != r10) goto L_0x0154
            v.d r11 = r6.L
            v.d r11 = r11.f12047f
            if (r11 == 0) goto L_0x0154
            boolean r11 = r11.f12044c
            if (r11 != 0) goto L_0x0160
        L_0x0154:
            v.d r11 = r6.L
            if (r5 != r11) goto L_0x0162
            v.d r10 = r10.f12047f
            if (r10 == 0) goto L_0x0162
            boolean r10 = r10.f12044c
            if (r10 == 0) goto L_0x0162
        L_0x0160:
            r10 = 1
            goto L_0x0163
        L_0x0162:
            r10 = r4
        L_0x0163:
            v.e$b[] r11 = r6.U
            r12 = r11[r4]
            v.e$b r13 = v.e.b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01a9
            if (r8 == 0) goto L_0x016e
            goto L_0x01a9
        L_0x016e:
            r5 = r11[r4]
            if (r5 != r13) goto L_0x01a4
            int r5 = r6.f12085v
            if (r5 < 0) goto L_0x01a4
            int r5 = r6.f12084u
            if (r5 < 0) goto L_0x01a4
            int r5 = r6.f12064i0
            r8 = 8
            if (r5 == r8) goto L_0x018c
            int r5 = r6.f12081r
            if (r5 != 0) goto L_0x01a6
            float r5 = r6.Y
            r11 = 0
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0121
            goto L_0x018d
        L_0x018c:
            r11 = 0
        L_0x018d:
            boolean r5 = r6.y()
            if (r5 != 0) goto L_0x0121
            boolean r5 = r6.G
            if (r5 != 0) goto L_0x0121
            if (r10 == 0) goto L_0x0121
            boolean r5 = r6.y()
            if (r5 != 0) goto L_0x0121
            d(r9, r0, r1, r6, r2)
            goto L_0x0121
        L_0x01a4:
            r8 = 8
        L_0x01a6:
            r11 = 0
            goto L_0x0121
        L_0x01a9:
            r8 = 8
            r11 = 0
            boolean r12 = r6.A()
            if (r12 == 0) goto L_0x01b4
            goto L_0x0121
        L_0x01b4:
            v.d r12 = r6.J
            if (r5 != r12) goto L_0x01d0
            v.d r13 = r6.L
            v.d r13 = r13.f12047f
            if (r13 != 0) goto L_0x01d0
            int r5 = r12.d()
            int r5 = r5 + r7
            int r10 = r6.r()
            int r10 = r10 + r5
            r6.J(r5, r10)
            b(r9, r6, r1, r2)
            goto L_0x0121
        L_0x01d0:
            v.d r13 = r6.L
            if (r5 != r13) goto L_0x01ec
            v.d r5 = r12.f12047f
            if (r5 != 0) goto L_0x01ec
            int r5 = r13.d()
            int r5 = r7 - r5
            int r10 = r6.r()
            int r10 = r5 - r10
            r6.J(r10, r5)
            b(r9, r6, r1, r2)
            goto L_0x0121
        L_0x01ec:
            if (r10 == 0) goto L_0x0121
            boolean r5 = r6.y()
            if (r5 != 0) goto L_0x0121
            c(r9, r1, r6, r2)
            goto L_0x0121
        L_0x01f9:
            r1 = 1
            r0.f12071m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.b(int, v.e, w.b$b, boolean):void");
    }

    public static void c(int i, b.C0243b bVar, e eVar, boolean z) {
        float f10 = eVar.f12060f0;
        int c10 = eVar.J.f12047f.c();
        int c11 = eVar.L.f12047f.c();
        int d10 = eVar.J.d() + c10;
        int d11 = c11 - eVar.L.d();
        if (c10 == c11) {
            f10 = 0.5f;
        } else {
            c10 = d10;
            c11 = d11;
        }
        int r10 = eVar.r();
        int i10 = (c11 - c10) - r10;
        if (c10 > c11) {
            i10 = (c10 - c11) - r10;
        }
        int i11 = ((int) (i10 > 0 ? (f10 * ((float) i10)) + 0.5f : f10 * ((float) i10))) + c10;
        int i12 = i11 + r10;
        if (c10 > c11) {
            i12 = i11 - r10;
        }
        eVar.J(i11, i12);
        b(i + 1, eVar, bVar, z);
    }

    public static void d(int i, e eVar, b.C0243b bVar, e eVar2, boolean z) {
        int i10;
        float f10 = eVar2.f12060f0;
        int d10 = eVar2.J.d() + eVar2.J.f12047f.c();
        int c10 = eVar2.L.f12047f.c() - eVar2.L.d();
        if (c10 >= d10) {
            int r10 = eVar2.r();
            if (eVar2.f12064i0 != 8) {
                int i11 = eVar2.f12081r;
                if (i11 == 2) {
                    if (eVar instanceof f) {
                        i10 = eVar.r();
                    } else {
                        i10 = eVar.V.r();
                    }
                    r10 = (int) (eVar2.f12060f0 * 0.5f * ((float) i10));
                } else if (i11 == 0) {
                    r10 = c10 - d10;
                }
                r10 = Math.max(eVar2.f12084u, r10);
                int i12 = eVar2.f12085v;
                if (i12 > 0) {
                    r10 = Math.min(i12, r10);
                }
            }
            int i13 = d10 + ((int) ((f10 * ((float) ((c10 - d10) - r10))) + 0.5f));
            eVar2.J(i13, r10 + i13);
            b(i + 1, eVar2, bVar, z);
        }
    }

    public static void e(int i, b.C0243b bVar, e eVar) {
        float f10 = eVar.f12061g0;
        int c10 = eVar.K.f12047f.c();
        int c11 = eVar.M.f12047f.c();
        int d10 = eVar.K.d() + c10;
        int d11 = c11 - eVar.M.d();
        if (c10 == c11) {
            f10 = 0.5f;
        } else {
            c10 = d10;
            c11 = d11;
        }
        int k10 = eVar.k();
        int i10 = (c11 - c10) - k10;
        if (c10 > c11) {
            i10 = (c10 - c11) - k10;
        }
        int i11 = (int) (i10 > 0 ? (f10 * ((float) i10)) + 0.5f : f10 * ((float) i10));
        int i12 = c10 + i11;
        int i13 = i12 + k10;
        if (c10 > c11) {
            i12 = c10 - i11;
            i13 = i12 - k10;
        }
        eVar.K(i12, i13);
        g(i + 1, eVar, bVar);
    }

    public static void f(int i, e eVar, b.C0243b bVar, e eVar2) {
        int i10;
        float f10 = eVar2.f12061g0;
        int d10 = eVar2.K.d() + eVar2.K.f12047f.c();
        int c10 = eVar2.M.f12047f.c() - eVar2.M.d();
        if (c10 >= d10) {
            int k10 = eVar2.k();
            if (eVar2.f12064i0 != 8) {
                int i11 = eVar2.f12082s;
                if (i11 == 2) {
                    if (eVar instanceof f) {
                        i10 = eVar.k();
                    } else {
                        i10 = eVar.V.k();
                    }
                    k10 = (int) (f10 * 0.5f * ((float) i10));
                } else if (i11 == 0) {
                    k10 = c10 - d10;
                }
                k10 = Math.max(eVar2.f12087x, k10);
                int i12 = eVar2.f12088y;
                if (i12 > 0) {
                    k10 = Math.min(i12, k10);
                }
            }
            int i13 = d10 + ((int) ((f10 * ((float) ((c10 - d10) - k10))) + 0.5f));
            eVar2.K(i13, k10 + i13);
            g(i + 1, eVar2, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r15 = r11.M.f12047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        r14 = r14.f12047f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(int r16, v.e r17, w.b.C0243b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.f12073n
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            boolean r2 = r0 instanceof v.f
            if (r2 != 0) goto L_0x0021
            boolean r2 = r17.A()
            if (r2 == 0) goto L_0x0021
            boolean r2 = a(r17)
            if (r2 == 0) goto L_0x0021
            w.b$a r2 = new w.b$a
            r2.<init>()
            v.f.c0(r0, r1, r2)
        L_0x0021:
            v.d$b r2 = v.d.b.TOP
            v.d r2 = r0.h(r2)
            v.d$b r3 = v.d.b.BOTTOM
            v.d r3 = r0.h(r3)
            int r4 = r2.c()
            int r5 = r3.c()
            java.util.HashSet<v.d> r6 = r2.f12042a
            r7 = 8
            r10 = 1
            if (r6 == 0) goto L_0x010e
            boolean r2 = r2.f12044c
            if (r2 == 0) goto L_0x010e
            java.util.Iterator r2 = r6.iterator()
        L_0x0044:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x010e
            java.lang.Object r6 = r2.next()
            v.d r6 = (v.d) r6
            v.e r11 = r6.f12045d
            int r12 = r16 + 1
            boolean r13 = a(r11)
            boolean r14 = r11.A()
            if (r14 == 0) goto L_0x0068
            if (r13 == 0) goto L_0x0068
            w.b$a r14 = new w.b$a
            r14.<init>()
            v.f.c0(r11, r1, r14)
        L_0x0068:
            v.d r14 = r11.K
            if (r6 != r14) goto L_0x0076
            v.d r15 = r11.M
            v.d r15 = r15.f12047f
            if (r15 == 0) goto L_0x0076
            boolean r15 = r15.f12044c
            if (r15 != 0) goto L_0x0082
        L_0x0076:
            v.d r15 = r11.M
            if (r6 != r15) goto L_0x0084
            v.d r14 = r14.f12047f
            if (r14 == 0) goto L_0x0084
            boolean r14 = r14.f12044c
            if (r14 == 0) goto L_0x0084
        L_0x0082:
            r14 = r10
            goto L_0x0085
        L_0x0084:
            r14 = 0
        L_0x0085:
            v.e$b[] r15 = r11.U
            r9 = r15[r10]
            v.e$b r8 = v.e.b.MATCH_CONSTRAINT
            if (r9 != r8) goto L_0x00c1
            if (r13 == 0) goto L_0x0090
            goto L_0x00c1
        L_0x0090:
            r6 = r15[r10]
            if (r6 != r8) goto L_0x0044
            int r6 = r11.f12088y
            if (r6 < 0) goto L_0x0044
            int r6 = r11.f12087x
            if (r6 < 0) goto L_0x0044
            int r6 = r11.f12064i0
            if (r6 == r7) goto L_0x00ab
            int r6 = r11.f12082s
            if (r6 != 0) goto L_0x0044
            float r6 = r11.Y
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0044
        L_0x00ab:
            boolean r6 = r11.z()
            if (r6 != 0) goto L_0x0044
            boolean r6 = r11.G
            if (r6 != 0) goto L_0x0044
            if (r14 == 0) goto L_0x0044
            boolean r6 = r11.z()
            if (r6 != 0) goto L_0x0044
            f(r12, r0, r1, r11)
            goto L_0x0044
        L_0x00c1:
            boolean r8 = r11.A()
            if (r8 == 0) goto L_0x00c9
            goto L_0x0044
        L_0x00c9:
            v.d r8 = r11.K
            if (r6 != r8) goto L_0x00e5
            v.d r9 = r11.M
            v.d r9 = r9.f12047f
            if (r9 != 0) goto L_0x00e5
            int r6 = r8.d()
            int r6 = r6 + r4
            int r8 = r11.k()
            int r8 = r8 + r6
            r11.K(r6, r8)
            g(r12, r11, r1)
            goto L_0x0044
        L_0x00e5:
            v.d r9 = r11.M
            if (r6 != r9) goto L_0x0101
            v.d r6 = r8.f12047f
            if (r6 != 0) goto L_0x0101
            int r6 = r9.d()
            int r6 = r4 - r6
            int r8 = r11.k()
            int r8 = r6 - r8
            r11.K(r8, r6)
            g(r12, r11, r1)
            goto L_0x0044
        L_0x0101:
            if (r14 == 0) goto L_0x0044
            boolean r6 = r11.z()
            if (r6 != 0) goto L_0x0044
            e(r12, r1, r11)
            goto L_0x0044
        L_0x010e:
            boolean r2 = r0 instanceof v.g
            if (r2 == 0) goto L_0x0113
            return
        L_0x0113:
            java.util.HashSet<v.d> r2 = r3.f12042a
            if (r2 == 0) goto L_0x01ef
            boolean r3 = r3.f12044c
            if (r3 == 0) goto L_0x01ef
            java.util.Iterator r2 = r2.iterator()
        L_0x011f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ef
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.e r4 = r3.f12045d
            int r6 = r16 + 1
            boolean r8 = a(r4)
            boolean r9 = r4.A()
            if (r9 == 0) goto L_0x0143
            if (r8 == 0) goto L_0x0143
            w.b$a r9 = new w.b$a
            r9.<init>()
            v.f.c0(r4, r1, r9)
        L_0x0143:
            v.d r9 = r4.K
            if (r3 != r9) goto L_0x0151
            v.d r11 = r4.M
            v.d r11 = r11.f12047f
            if (r11 == 0) goto L_0x0151
            boolean r11 = r11.f12044c
            if (r11 != 0) goto L_0x015d
        L_0x0151:
            v.d r11 = r4.M
            if (r3 != r11) goto L_0x015f
            v.d r9 = r9.f12047f
            if (r9 == 0) goto L_0x015f
            boolean r9 = r9.f12044c
            if (r9 == 0) goto L_0x015f
        L_0x015d:
            r9 = r10
            goto L_0x0160
        L_0x015f:
            r9 = 0
        L_0x0160:
            v.e$b[] r11 = r4.U
            r12 = r11[r10]
            v.e$b r13 = v.e.b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01a1
            if (r8 == 0) goto L_0x016b
            goto L_0x01a1
        L_0x016b:
            r3 = r11[r10]
            if (r3 != r13) goto L_0x019e
            int r3 = r4.f12088y
            if (r3 < 0) goto L_0x019e
            int r3 = r4.f12087x
            if (r3 < 0) goto L_0x019e
            int r3 = r4.f12064i0
            if (r3 == r7) goto L_0x0187
            int r3 = r4.f12082s
            if (r3 != 0) goto L_0x019e
            float r3 = r4.Y
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x011f
            goto L_0x0188
        L_0x0187:
            r8 = 0
        L_0x0188:
            boolean r3 = r4.z()
            if (r3 != 0) goto L_0x011f
            boolean r3 = r4.G
            if (r3 != 0) goto L_0x011f
            if (r9 == 0) goto L_0x011f
            boolean r3 = r4.z()
            if (r3 != 0) goto L_0x011f
            f(r6, r0, r1, r4)
            goto L_0x011f
        L_0x019e:
            r8 = 0
            goto L_0x011f
        L_0x01a1:
            r8 = 0
            boolean r11 = r4.A()
            if (r11 == 0) goto L_0x01aa
            goto L_0x011f
        L_0x01aa:
            v.d r11 = r4.K
            if (r3 != r11) goto L_0x01c6
            v.d r12 = r4.M
            v.d r12 = r12.f12047f
            if (r12 != 0) goto L_0x01c6
            int r3 = r11.d()
            int r3 = r3 + r5
            int r9 = r4.k()
            int r9 = r9 + r3
            r4.K(r3, r9)
            g(r6, r4, r1)
            goto L_0x011f
        L_0x01c6:
            v.d r12 = r4.M
            if (r3 != r12) goto L_0x01e2
            v.d r3 = r11.f12047f
            if (r3 != 0) goto L_0x01e2
            int r3 = r12.d()
            int r3 = r5 - r3
            int r9 = r4.k()
            int r9 = r3 - r9
            r4.K(r9, r3)
            g(r6, r4, r1)
            goto L_0x011f
        L_0x01e2:
            if (r9 == 0) goto L_0x011f
            boolean r3 = r4.z()
            if (r3 != 0) goto L_0x011f
            e(r6, r1, r4)
            goto L_0x011f
        L_0x01ef:
            v.d$b r2 = v.d.b.BASELINE
            v.d r2 = r0.h(r2)
            java.util.HashSet<v.d> r3 = r2.f12042a
            if (r3 == 0) goto L_0x026b
            boolean r3 = r2.f12044c
            if (r3 == 0) goto L_0x026b
            int r3 = r2.c()
            java.util.HashSet<v.d> r2 = r2.f12042a
            java.util.Iterator r2 = r2.iterator()
        L_0x0207:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x026b
            java.lang.Object r4 = r2.next()
            v.d r4 = (v.d) r4
            v.e r5 = r4.f12045d
            int r6 = r16 + 1
            boolean r7 = a(r5)
            boolean r8 = r5.A()
            if (r8 == 0) goto L_0x022b
            if (r7 == 0) goto L_0x022b
            w.b$a r8 = new w.b$a
            r8.<init>()
            v.f.c0(r5, r1, r8)
        L_0x022b:
            v.e$b[] r8 = r5.U
            r8 = r8[r10]
            v.e$b r9 = v.e.b.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x0235
            if (r7 == 0) goto L_0x0207
        L_0x0235:
            boolean r7 = r5.A()
            if (r7 == 0) goto L_0x023c
            goto L_0x0207
        L_0x023c:
            v.d r7 = r5.N
            if (r4 != r7) goto L_0x0207
            int r4 = r4.d()
            int r4 = r4 + r3
            boolean r7 = r5.E
            if (r7 != 0) goto L_0x024a
            goto L_0x0264
        L_0x024a:
            int r7 = r5.f12054c0
            int r7 = r4 - r7
            int r8 = r5.X
            int r8 = r8 + r7
            r5.b0 = r7
            v.d r9 = r5.K
            r9.j(r7)
            v.d r7 = r5.M
            r7.j(r8)
            v.d r7 = r5.N
            r7.j(r4)
            r5.f12069l = r10
        L_0x0264:
            g(r6, r5, r1)     // Catch:{ all -> 0x0268 }
            goto L_0x0207
        L_0x0268:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x026b:
            r0.f12073n = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.g(int, v.e, w.b$b):void");
    }
}
