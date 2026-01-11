package v;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t.d;
import v.e;
import w.b;
import w.e;

public final class f extends l {
    public int A0 = 0;
    public int B0 = 0;
    public c[] C0 = new c[4];
    public c[] D0 = new c[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference<d> H0 = null;
    public WeakReference<d> I0 = null;
    public WeakReference<d> J0 = null;
    public WeakReference<d> K0 = null;
    public HashSet<e> L0 = new HashSet<>();
    public b.a M0 = new b.a();

    /* renamed from: s0  reason: collision with root package name */
    public b f12091s0 = new b(this);

    /* renamed from: t0  reason: collision with root package name */
    public e f12092t0 = new e(this);

    /* renamed from: u0  reason: collision with root package name */
    public int f12093u0;

    /* renamed from: v0  reason: collision with root package name */
    public b.C0243b f12094v0 = null;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f12095w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public d f12096x0 = new d();

    /* renamed from: y0  reason: collision with root package name */
    public int f12097y0;
    public int z0;

    public static boolean c0(e eVar, b.C0243b bVar, b.a aVar) {
        int i;
        int i10;
        if (bVar == null) {
            return false;
        }
        if (eVar.f12064i0 == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f12491e = 0;
            aVar.f12492f = 0;
            return false;
        }
        e.b[] bVarArr = eVar.U;
        aVar.f12487a = bVarArr[0];
        aVar.f12488b = bVarArr[1];
        aVar.f12489c = eVar.r();
        aVar.f12490d = eVar.k();
        aVar.i = false;
        aVar.f12494j = 0;
        e.b bVar2 = aVar.f12487a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z10 = aVar.f12488b == bVar3;
        boolean z11 = z && eVar.Y > 0.0f;
        boolean z12 = z10 && eVar.Y > 0.0f;
        if (z && eVar.u(0) && eVar.f12081r == 0 && !z11) {
            aVar.f12487a = e.b.WRAP_CONTENT;
            if (z10 && eVar.f12082s == 0) {
                aVar.f12487a = e.b.FIXED;
            }
            z = false;
        }
        if (z10 && eVar.u(1) && eVar.f12082s == 0 && !z12) {
            aVar.f12488b = e.b.WRAP_CONTENT;
            if (z && eVar.f12081r == 0) {
                aVar.f12488b = e.b.FIXED;
            }
            z10 = false;
        }
        if (eVar.B()) {
            aVar.f12487a = e.b.FIXED;
            z = false;
        }
        if (eVar.C()) {
            aVar.f12488b = e.b.FIXED;
            z10 = false;
        }
        if (z11) {
            if (eVar.f12083t[0] == 4) {
                aVar.f12487a = e.b.FIXED;
            } else if (!z10) {
                e.b bVar4 = aVar.f12488b;
                e.b bVar5 = e.b.FIXED;
                if (bVar4 == bVar5) {
                    i10 = aVar.f12490d;
                } else {
                    aVar.f12487a = e.b.WRAP_CONTENT;
                    ((ConstraintLayout.c) bVar).b(eVar, aVar);
                    i10 = aVar.f12492f;
                }
                aVar.f12487a = bVar5;
                aVar.f12489c = (int) (eVar.Y * ((float) i10));
            }
        }
        if (z12) {
            if (eVar.f12083t[1] == 4) {
                aVar.f12488b = e.b.FIXED;
            } else if (!z) {
                e.b bVar6 = aVar.f12487a;
                e.b bVar7 = e.b.FIXED;
                if (bVar6 == bVar7) {
                    i = aVar.f12489c;
                } else {
                    aVar.f12488b = e.b.WRAP_CONTENT;
                    ((ConstraintLayout.c) bVar).b(eVar, aVar);
                    i = aVar.f12491e;
                }
                aVar.f12488b = bVar7;
                if (eVar.Z == -1) {
                    aVar.f12490d = (int) (((float) i) / eVar.Y);
                } else {
                    aVar.f12490d = (int) (eVar.Y * ((float) i));
                }
            }
        }
        ((ConstraintLayout.c) bVar).b(eVar, aVar);
        eVar.Q(aVar.f12491e);
        eVar.L(aVar.f12492f);
        eVar.E = aVar.f12493h;
        eVar.I(aVar.g);
        aVar.f12494j = 0;
        return aVar.i;
    }

    public final void D() {
        this.f12096x0.u();
        this.f12097y0 = 0;
        this.z0 = 0;
        super.D();
    }

    public final void R(boolean z, boolean z10) {
        super.R(z, z10);
        int size = this.f12108r0.size();
        for (int i = 0; i < size; i++) {
            this.f12108r0.get(i).R(z, z10);
        }
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05c9, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x063e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0778  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x07ec A[LOOP:32: B:465:0x07ea->B:466:0x07ec, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0855  */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0872  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x08c5  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x08c7  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x08d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T() {
        /*
            r26 = this;
            r1 = r26
            r2 = 0
            r1.f12051a0 = r2
            r1.b0 = r2
            r1.F0 = r2
            r1.G0 = r2
            java.util.ArrayList<v.e> r0 = r1.f12108r0
            int r3 = r0.size()
            int r0 = r26.r()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r26.k()
            int r4 = java.lang.Math.max(r2, r4)
            v.e$b[] r5 = r1.U
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f12093u0
            if (r8 != 0) goto L_0x0241
            int r8 = r1.E0
            boolean r8 = v.j.b(r8, r6)
            if (r8 == 0) goto L_0x0241
            w.b$b r8 = r1.f12094v0
            v.e$b[] r10 = r1.U
            r11 = r10[r2]
            r10 = r10[r6]
            r26.E()
            java.util.ArrayList<v.e> r12 = r1.f12108r0
            int r13 = r12.size()
            r14 = r2
        L_0x0046:
            if (r14 >= r13) goto L_0x0054
            java.lang.Object r15 = r12.get(r14)
            v.e r15 = (v.e) r15
            r15.E()
            int r14 = r14 + 1
            goto L_0x0046
        L_0x0054:
            boolean r14 = r1.f12095w0
            v.e$b r15 = v.e.b.FIXED
            if (r11 != r15) goto L_0x0062
            int r11 = r26.r()
            r1.J(r2, r11)
            goto L_0x0069
        L_0x0062:
            v.d r11 = r1.J
            r11.j(r2)
            r1.f12051a0 = r2
        L_0x0069:
            r11 = r2
            r15 = r11
            r16 = r15
        L_0x006d:
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r11 >= r13) goto L_0x00c9
            java.lang.Object r18 = r12.get(r11)
            r2 = r18
            v.e r2 = (v.e) r2
            boolean r9 = r2 instanceof v.g
            if (r9 == 0) goto L_0x00b7
            v.g r2 = (v.g) r2
            int r9 = r2.f12102v0
            if (r9 != r6) goto L_0x00c5
            int r9 = r2.f12099s0
            r15 = -1
            if (r9 == r15) goto L_0x008c
            r2.T(r9)
            goto L_0x00b5
        L_0x008c:
            int r9 = r2.f12100t0
            if (r9 == r15) goto L_0x00a1
            boolean r9 = r26.B()
            if (r9 == 0) goto L_0x00a1
            int r9 = r26.r()
            int r15 = r2.f12100t0
            int r9 = r9 - r15
            r2.T(r9)
            goto L_0x00b5
        L_0x00a1:
            boolean r9 = r26.B()
            if (r9 == 0) goto L_0x00b5
            float r9 = r2.f12098r0
            int r15 = r26.r()
            float r15 = (float) r15
            float r9 = r9 * r15
            float r9 = r9 + r17
            int r9 = (int) r9
            r2.T(r9)
        L_0x00b5:
            r15 = r6
            goto L_0x00c5
        L_0x00b7:
            boolean r9 = r2 instanceof v.a
            if (r9 == 0) goto L_0x00c5
            v.a r2 = (v.a) r2
            int r2 = r2.V()
            if (r2 != 0) goto L_0x00c5
            r16 = r6
        L_0x00c5:
            int r11 = r11 + 1
            r2 = 0
            goto L_0x006d
        L_0x00c9:
            if (r15 == 0) goto L_0x00e7
            r2 = 0
        L_0x00cc:
            if (r2 >= r13) goto L_0x00e7
            java.lang.Object r9 = r12.get(r2)
            v.e r9 = (v.e) r9
            boolean r11 = r9 instanceof v.g
            if (r11 == 0) goto L_0x00e3
            v.g r9 = (v.g) r9
            int r11 = r9.f12102v0
            if (r11 != r6) goto L_0x00e3
            r11 = 0
            w.h.b(r11, r9, r8, r14)
            goto L_0x00e4
        L_0x00e3:
            r11 = 0
        L_0x00e4:
            int r2 = r2 + 1
            goto L_0x00cc
        L_0x00e7:
            r11 = 0
            w.h.b(r11, r1, r8, r14)
            if (r16 == 0) goto L_0x010e
            r2 = 0
        L_0x00ee:
            if (r2 >= r13) goto L_0x010e
            java.lang.Object r9 = r12.get(r2)
            v.e r9 = (v.e) r9
            boolean r11 = r9 instanceof v.a
            if (r11 == 0) goto L_0x010b
            v.a r9 = (v.a) r9
            int r11 = r9.V()
            if (r11 != 0) goto L_0x010b
            boolean r11 = r9.U()
            if (r11 == 0) goto L_0x010b
            w.h.b(r6, r9, r8, r14)
        L_0x010b:
            int r2 = r2 + 1
            goto L_0x00ee
        L_0x010e:
            v.e$b r2 = v.e.b.FIXED
            if (r10 != r2) goto L_0x011b
            int r2 = r26.k()
            r9 = 0
            r1.K(r9, r2)
            goto L_0x0123
        L_0x011b:
            r9 = 0
            v.d r2 = r1.K
            r2.j(r9)
            r1.b0 = r9
        L_0x0123:
            r2 = 0
            r9 = 0
            r10 = 0
        L_0x0126:
            if (r2 >= r13) goto L_0x017c
            java.lang.Object r11 = r12.get(r2)
            v.e r11 = (v.e) r11
            boolean r15 = r11 instanceof v.g
            if (r15 == 0) goto L_0x016c
            v.g r11 = (v.g) r11
            int r15 = r11.f12102v0
            if (r15 != 0) goto L_0x0179
            int r9 = r11.f12099s0
            r15 = -1
            if (r9 == r15) goto L_0x0141
            r11.T(r9)
            goto L_0x016a
        L_0x0141:
            int r9 = r11.f12100t0
            if (r9 == r15) goto L_0x0156
            boolean r9 = r26.C()
            if (r9 == 0) goto L_0x0156
            int r9 = r26.k()
            int r15 = r11.f12100t0
            int r9 = r9 - r15
            r11.T(r9)
            goto L_0x016a
        L_0x0156:
            boolean r9 = r26.C()
            if (r9 == 0) goto L_0x016a
            float r9 = r11.f12098r0
            int r15 = r26.k()
            float r15 = (float) r15
            float r9 = r9 * r15
            float r9 = r9 + r17
            int r9 = (int) r9
            r11.T(r9)
        L_0x016a:
            r9 = r6
            goto L_0x0179
        L_0x016c:
            boolean r15 = r11 instanceof v.a
            if (r15 == 0) goto L_0x0179
            v.a r11 = (v.a) r11
            int r11 = r11.V()
            if (r11 != r6) goto L_0x0179
            r10 = r6
        L_0x0179:
            int r2 = r2 + 1
            goto L_0x0126
        L_0x017c:
            if (r9 == 0) goto L_0x0197
            r2 = 0
        L_0x017f:
            if (r2 >= r13) goto L_0x0197
            java.lang.Object r9 = r12.get(r2)
            v.e r9 = (v.e) r9
            boolean r11 = r9 instanceof v.g
            if (r11 == 0) goto L_0x0194
            v.g r9 = (v.g) r9
            int r11 = r9.f12102v0
            if (r11 != 0) goto L_0x0194
            w.h.g(r6, r9, r8)
        L_0x0194:
            int r2 = r2 + 1
            goto L_0x017f
        L_0x0197:
            r2 = 0
            w.h.g(r2, r1, r8)
            if (r10 == 0) goto L_0x01be
            r2 = 0
        L_0x019e:
            if (r2 >= r13) goto L_0x01be
            java.lang.Object r9 = r12.get(r2)
            v.e r9 = (v.e) r9
            boolean r10 = r9 instanceof v.a
            if (r10 == 0) goto L_0x01bb
            v.a r9 = (v.a) r9
            int r10 = r9.V()
            if (r10 != r6) goto L_0x01bb
            boolean r10 = r9.U()
            if (r10 == 0) goto L_0x01bb
            w.h.g(r6, r9, r8)
        L_0x01bb:
            int r2 = r2 + 1
            goto L_0x019e
        L_0x01be:
            r2 = 0
        L_0x01bf:
            if (r2 >= r13) goto L_0x01f7
            java.lang.Object r9 = r12.get(r2)
            v.e r9 = (v.e) r9
            boolean r10 = r9.A()
            if (r10 == 0) goto L_0x01f4
            boolean r10 = w.h.a(r9)
            if (r10 == 0) goto L_0x01f4
            w.b$a r10 = w.h.f12515a
            c0(r9, r8, r10)
            boolean r10 = r9 instanceof v.g
            if (r10 == 0) goto L_0x01ed
            r10 = r9
            v.g r10 = (v.g) r10
            int r10 = r10.f12102v0
            if (r10 != 0) goto L_0x01e8
            r10 = 0
            w.h.g(r10, r9, r8)
            goto L_0x01f4
        L_0x01e8:
            r10 = 0
            w.h.b(r10, r9, r8, r14)
            goto L_0x01f4
        L_0x01ed:
            r10 = 0
            w.h.b(r10, r9, r8, r14)
            w.h.g(r10, r9, r8)
        L_0x01f4:
            int r2 = r2 + 1
            goto L_0x01bf
        L_0x01f7:
            r2 = 0
        L_0x01f8:
            if (r2 >= r3) goto L_0x0241
            java.util.ArrayList<v.e> r8 = r1.f12108r0
            java.lang.Object r8 = r8.get(r2)
            v.e r8 = (v.e) r8
            boolean r9 = r8.A()
            if (r9 == 0) goto L_0x023e
            boolean r9 = r8 instanceof v.g
            if (r9 != 0) goto L_0x023e
            boolean r9 = r8 instanceof v.a
            if (r9 != 0) goto L_0x023e
            boolean r9 = r8 instanceof v.k
            if (r9 != 0) goto L_0x023e
            boolean r9 = r8.G
            if (r9 != 0) goto L_0x023e
            r9 = 0
            v.e$b r10 = r8.j(r9)
            v.e$b r9 = r8.j(r6)
            v.e$b r11 = v.e.b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0231
            int r10 = r8.f12081r
            if (r10 == r6) goto L_0x0231
            if (r9 != r11) goto L_0x0231
            int r9 = r8.f12082s
            if (r9 == r6) goto L_0x0231
            r9 = r6
            goto L_0x0232
        L_0x0231:
            r9 = 0
        L_0x0232:
            if (r9 != 0) goto L_0x023e
            w.b$a r9 = new w.b$a
            r9.<init>()
            w.b$b r10 = r1.f12094v0
            c0(r8, r10, r9)
        L_0x023e:
            int r2 = r2 + 1
            goto L_0x01f8
        L_0x0241:
            r2 = 2
            if (r3 <= r2) goto L_0x0615
            v.e$b r9 = v.e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x024a
            if (r7 != r9) goto L_0x0615
        L_0x024a:
            int r9 = r1.E0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = v.j.b(r9, r10)
            if (r9 == 0) goto L_0x0615
            w.b$b r9 = r1.f12094v0
            java.util.ArrayList<v.e> r10 = r1.f12108r0
            int r11 = r10.size()
            r12 = 0
        L_0x025d:
            if (r12 >= r11) goto L_0x0288
            java.lang.Object r13 = r10.get(r12)
            v.e r13 = (v.e) r13
            v.e$b[] r14 = r1.U
            r15 = 0
            r2 = r14[r15]
            r14 = r14[r6]
            v.e$b[] r13 = r13.U
            r8 = r13[r15]
            r13 = r13[r6]
            boolean r2 = w.i.c(r2, r14, r8, r13)
            if (r2 != 0) goto L_0x0284
            r24 = r0
            r22 = r3
            r21 = r4
            r25 = r5
            r23 = r7
            goto L_0x05c9
        L_0x0284:
            int r12 = r12 + 1
            r2 = 2
            goto L_0x025d
        L_0x0288:
            r2 = 0
            r6 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x028f:
            if (r6 >= r11) goto L_0x0374
            java.lang.Object r21 = r10.get(r6)
            r22 = r3
            r3 = r21
            v.e r3 = (v.e) r3
            r21 = r4
            v.e$b[] r4 = r1.U
            r23 = r7
            r19 = 0
            r7 = r4[r19]
            r20 = 1
            r4 = r4[r20]
            r24 = r0
            v.e$b[] r0 = r3.U
            r25 = r5
            r5 = r0[r19]
            r0 = r0[r20]
            boolean r0 = w.i.c(r7, r4, r5, r0)
            if (r0 != 0) goto L_0x02be
            w.b$a r0 = r1.M0
            c0(r3, r9, r0)
        L_0x02be:
            boolean r0 = r3 instanceof v.g
            if (r0 == 0) goto L_0x02e3
            r4 = r3
            v.g r4 = (v.g) r4
            int r5 = r4.f12102v0
            if (r5 != 0) goto L_0x02d4
            if (r12 != 0) goto L_0x02d1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r12 = r5
        L_0x02d1:
            r12.add(r4)
        L_0x02d4:
            int r5 = r4.f12102v0
            r7 = 1
            if (r5 != r7) goto L_0x02e3
            if (r2 != 0) goto L_0x02e0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x02e0:
            r2.add(r4)
        L_0x02e3:
            boolean r4 = r3 instanceof v.i
            if (r4 == 0) goto L_0x0328
            boolean r4 = r3 instanceof v.a
            if (r4 == 0) goto L_0x0311
            r4 = r3
            v.a r4 = (v.a) r4
            int r5 = r4.V()
            if (r5 != 0) goto L_0x02ff
            if (r8 != 0) goto L_0x02fc
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r5
        L_0x02fc:
            r8.add(r4)
        L_0x02ff:
            int r5 = r4.V()
            r7 = 1
            if (r5 != r7) goto L_0x0328
            if (r13 != 0) goto L_0x030d
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x030d:
            r13.add(r4)
            goto L_0x0328
        L_0x0311:
            r4 = r3
            v.i r4 = (v.i) r4
            if (r8 != 0) goto L_0x031b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x031b:
            r8.add(r4)
            if (r13 != 0) goto L_0x0325
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0325:
            r13.add(r4)
        L_0x0328:
            v.d r4 = r3.J
            v.d r4 = r4.f12047f
            if (r4 != 0) goto L_0x0344
            v.d r4 = r3.L
            v.d r4 = r4.f12047f
            if (r4 != 0) goto L_0x0344
            if (r0 != 0) goto L_0x0344
            boolean r4 = r3 instanceof v.a
            if (r4 != 0) goto L_0x0344
            if (r14 != 0) goto L_0x0341
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0341:
            r14.add(r3)
        L_0x0344:
            v.d r4 = r3.K
            v.d r4 = r4.f12047f
            if (r4 != 0) goto L_0x0366
            v.d r4 = r3.M
            v.d r4 = r4.f12047f
            if (r4 != 0) goto L_0x0366
            v.d r4 = r3.N
            v.d r4 = r4.f12047f
            if (r4 != 0) goto L_0x0366
            if (r0 != 0) goto L_0x0366
            boolean r0 = r3 instanceof v.a
            if (r0 != 0) goto L_0x0366
            if (r15 != 0) goto L_0x0363
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0363:
            r15.add(r3)
        L_0x0366:
            int r6 = r6 + 1
            r4 = r21
            r3 = r22
            r7 = r23
            r0 = r24
            r5 = r25
            goto L_0x028f
        L_0x0374:
            r24 = r0
            r22 = r3
            r21 = r4
            r25 = r5
            r23 = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L_0x039b
            java.util.Iterator r2 = r2.iterator()
        L_0x0389:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x039b
            java.lang.Object r3 = r2.next()
            v.g r3 = (v.g) r3
            r4 = 0
            r5 = 0
            w.i.a(r3, r5, r0, r4)
            goto L_0x0389
        L_0x039b:
            r4 = 0
            r5 = 0
            if (r8 == 0) goto L_0x03bc
            java.util.Iterator r2 = r8.iterator()
        L_0x03a3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03bc
            java.lang.Object r3 = r2.next()
            v.i r3 = (v.i) r3
            w.o r6 = w.i.a(r3, r5, r0, r4)
            r3.T(r0, r5, r6)
            r6.b(r0)
            r4 = 0
            r5 = 0
            goto L_0x03a3
        L_0x03bc:
            v.d$b r2 = v.d.b.LEFT
            v.d r2 = r1.h(r2)
            java.util.HashSet<v.d> r2 = r2.f12042a
            if (r2 == 0) goto L_0x03de
            java.util.Iterator r2 = r2.iterator()
        L_0x03ca:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03de
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.e r3 = r3.f12045d
            r4 = 0
            r5 = 0
            w.i.a(r3, r5, r0, r4)
            goto L_0x03ca
        L_0x03de:
            v.d$b r2 = v.d.b.RIGHT
            v.d r2 = r1.h(r2)
            java.util.HashSet<v.d> r2 = r2.f12042a
            if (r2 == 0) goto L_0x0400
            java.util.Iterator r2 = r2.iterator()
        L_0x03ec:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0400
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.e r3 = r3.f12045d
            r4 = 0
            r5 = 0
            w.i.a(r3, r5, r0, r4)
            goto L_0x03ec
        L_0x0400:
            v.d$b r2 = v.d.b.CENTER
            v.d r2 = r1.h(r2)
            java.util.HashSet<v.d> r2 = r2.f12042a
            if (r2 == 0) goto L_0x0422
            java.util.Iterator r2 = r2.iterator()
        L_0x040e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0422
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.e r3 = r3.f12045d
            r4 = 0
            r5 = 0
            w.i.a(r3, r5, r0, r4)
            goto L_0x040e
        L_0x0422:
            r4 = 0
            r5 = 0
            if (r14 == 0) goto L_0x043a
            java.util.Iterator r2 = r14.iterator()
        L_0x042a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x043a
            java.lang.Object r3 = r2.next()
            v.e r3 = (v.e) r3
            w.i.a(r3, r5, r0, r4)
            goto L_0x042a
        L_0x043a:
            if (r12 == 0) goto L_0x0451
            java.util.Iterator r2 = r12.iterator()
        L_0x0440:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0451
            java.lang.Object r3 = r2.next()
            v.g r3 = (v.g) r3
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x0440
        L_0x0451:
            r5 = 1
            if (r13 == 0) goto L_0x0471
            java.util.Iterator r2 = r13.iterator()
        L_0x0458:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0471
            java.lang.Object r3 = r2.next()
            v.i r3 = (v.i) r3
            w.o r6 = w.i.a(r3, r5, r0, r4)
            r3.T(r0, r5, r6)
            r6.b(r0)
            r4 = 0
            r5 = 1
            goto L_0x0458
        L_0x0471:
            v.d$b r2 = v.d.b.TOP
            v.d r2 = r1.h(r2)
            java.util.HashSet<v.d> r2 = r2.f12042a
            if (r2 == 0) goto L_0x0493
            java.util.Iterator r2 = r2.iterator()
        L_0x047f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0493
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.e r3 = r3.f12045d
            r4 = 0
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x047f
        L_0x0493:
            v.d$b r2 = v.d.b.BASELINE
            v.d r2 = r1.h(r2)
            java.util.HashSet<v.d> r2 = r2.f12042a
            if (r2 == 0) goto L_0x04b5
            java.util.Iterator r2 = r2.iterator()
        L_0x04a1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b5
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.e r3 = r3.f12045d
            r4 = 0
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x04a1
        L_0x04b5:
            v.d$b r2 = v.d.b.BOTTOM
            v.d r2 = r1.h(r2)
            java.util.HashSet<v.d> r2 = r2.f12042a
            if (r2 == 0) goto L_0x04d7
            java.util.Iterator r2 = r2.iterator()
        L_0x04c3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d7
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.e r3 = r3.f12045d
            r4 = 0
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x04c3
        L_0x04d7:
            v.d$b r2 = v.d.b.CENTER
            v.d r2 = r1.h(r2)
            java.util.HashSet<v.d> r2 = r2.f12042a
            if (r2 == 0) goto L_0x04f9
            java.util.Iterator r2 = r2.iterator()
        L_0x04e5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04f9
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.e r3 = r3.f12045d
            r4 = 0
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x04e5
        L_0x04f9:
            r4 = 0
            r5 = 1
            if (r15 == 0) goto L_0x0511
            java.util.Iterator r2 = r15.iterator()
        L_0x0501:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0511
            java.lang.Object r3 = r2.next()
            v.e r3 = (v.e) r3
            w.i.a(r3, r5, r0, r4)
            goto L_0x0501
        L_0x0511:
            r2 = 0
        L_0x0512:
            if (r2 >= r11) goto L_0x054a
            java.lang.Object r3 = r10.get(r2)
            v.e r3 = (v.e) r3
            v.e$b[] r4 = r3.U
            r5 = 0
            r6 = r4[r5]
            v.e$b r5 = v.e.b.MATCH_CONSTRAINT
            if (r6 != r5) goto L_0x052a
            r6 = 1
            r4 = r4[r6]
            if (r4 != r5) goto L_0x052a
            r4 = 1
            goto L_0x052b
        L_0x052a:
            r4 = 0
        L_0x052b:
            if (r4 == 0) goto L_0x0547
            int r4 = r3.f12078p0
            w.o r4 = w.i.b(r0, r4)
            int r3 = r3.f12080q0
            w.o r3 = w.i.b(r0, r3)
            if (r4 == 0) goto L_0x0547
            if (r3 == 0) goto L_0x0547
            r5 = 0
            r4.d(r5, r3)
            r5 = 2
            r3.f12526c = r5
            r0.remove(r4)
        L_0x0547:
            int r2 = r2 + 1
            goto L_0x0512
        L_0x054a:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x0553
            goto L_0x05c9
        L_0x0553:
            v.e$b[] r2 = r1.U
            r3 = 0
            r2 = r2[r3]
            v.e$b r3 = v.e.b.WRAP_CONTENT
            if (r2 != r3) goto L_0x058b
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x0562:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0580
            java.lang.Object r5 = r2.next()
            w.o r5 = (w.o) r5
            int r6 = r5.f12526c
            r7 = 1
            if (r6 != r7) goto L_0x0574
            goto L_0x0562
        L_0x0574:
            t.d r6 = r1.f12096x0
            r7 = 0
            int r6 = r5.c(r6, r7)
            if (r6 <= r4) goto L_0x0562
            r3 = r5
            r4 = r6
            goto L_0x0562
        L_0x0580:
            if (r3 == 0) goto L_0x058b
            v.e$b r2 = v.e.b.FIXED
            r1.M(r2)
            r1.Q(r4)
            goto L_0x058c
        L_0x058b:
            r3 = 0
        L_0x058c:
            v.e$b[] r2 = r1.U
            r4 = 1
            r2 = r2[r4]
            v.e$b r4 = v.e.b.WRAP_CONTENT
            if (r2 != r4) goto L_0x05c3
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r4 = 0
        L_0x059b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05b8
            java.lang.Object r5 = r0.next()
            w.o r5 = (w.o) r5
            int r6 = r5.f12526c
            if (r6 != 0) goto L_0x05ac
            goto L_0x059b
        L_0x05ac:
            t.d r6 = r1.f12096x0
            r7 = 1
            int r6 = r5.c(r6, r7)
            if (r6 <= r4) goto L_0x059b
            r2 = r5
            r4 = r6
            goto L_0x059b
        L_0x05b8:
            if (r2 == 0) goto L_0x05c3
            v.e$b r0 = v.e.b.FIXED
            r1.P(r0)
            r1.L(r4)
            goto L_0x05c4
        L_0x05c3:
            r2 = 0
        L_0x05c4:
            if (r3 != 0) goto L_0x05cb
            if (r2 == 0) goto L_0x05c9
            goto L_0x05cb
        L_0x05c9:
            r0 = 0
            goto L_0x05cc
        L_0x05cb:
            r0 = 1
        L_0x05cc:
            if (r0 == 0) goto L_0x060c
            v.e$b r0 = v.e.b.WRAP_CONTENT
            r2 = r25
            if (r2 != r0) goto L_0x05ea
            int r3 = r26.r()
            r4 = r24
            if (r4 >= r3) goto L_0x05e5
            if (r4 <= 0) goto L_0x05e5
            r1.Q(r4)
            r3 = 1
            r1.F0 = r3
            goto L_0x05ec
        L_0x05e5:
            int r3 = r26.r()
            goto L_0x05ed
        L_0x05ea:
            r4 = r24
        L_0x05ec:
            r3 = r4
        L_0x05ed:
            r5 = r23
            if (r5 != r0) goto L_0x0607
            int r0 = r26.k()
            r6 = r21
            if (r6 >= r0) goto L_0x0602
            if (r6 <= 0) goto L_0x0602
            r1.L(r6)
            r4 = 1
            r1.G0 = r4
            goto L_0x0609
        L_0x0602:
            int r4 = r26.k()
            goto L_0x060a
        L_0x0607:
            r6 = r21
        L_0x0609:
            r4 = r6
        L_0x060a:
            r0 = 1
            goto L_0x061e
        L_0x060c:
            r6 = r21
            r5 = r23
            r4 = r24
            r2 = r25
            goto L_0x061b
        L_0x0615:
            r22 = r3
            r6 = r4
            r2 = r5
            r5 = r7
            r4 = r0
        L_0x061b:
            r3 = r4
            r4 = r6
            r0 = 0
        L_0x061e:
            r6 = 64
            boolean r7 = r1.d0(r6)
            if (r7 != 0) goto L_0x0631
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.d0(r7)
            if (r7 == 0) goto L_0x062f
            goto L_0x0631
        L_0x062f:
            r7 = 0
            goto L_0x0632
        L_0x0631:
            r7 = 1
        L_0x0632:
            t.d r8 = r1.f12096x0
            java.util.Objects.requireNonNull(r8)
            r9 = 0
            r8.g = r9
            int r10 = r1.E0
            if (r10 == 0) goto L_0x0644
            if (r7 == 0) goto L_0x0644
            r7 = 1
            r8.g = r7
            goto L_0x0645
        L_0x0644:
            r7 = 1
        L_0x0645:
            java.util.ArrayList<v.e> r8 = r1.f12108r0
            v.e$b[] r10 = r1.U
            r11 = r10[r9]
            v.e$b r12 = v.e.b.WRAP_CONTENT
            if (r11 == r12) goto L_0x0656
            r10 = r10[r7]
            if (r10 != r12) goto L_0x0654
            goto L_0x0656
        L_0x0654:
            r11 = r9
            goto L_0x0657
        L_0x0656:
            r11 = 1
        L_0x0657:
            r1.A0 = r9
            r1.B0 = r9
            r9 = r22
            r7 = 0
        L_0x065e:
            if (r7 >= r9) goto L_0x0674
            java.util.ArrayList<v.e> r10 = r1.f12108r0
            java.lang.Object r10 = r10.get(r7)
            v.e r10 = (v.e) r10
            boolean r12 = r10 instanceof v.l
            if (r12 == 0) goto L_0x0671
            v.l r10 = (v.l) r10
            r10.T()
        L_0x0671:
            int r7 = r7 + 1
            goto L_0x065e
        L_0x0674:
            boolean r7 = r1.d0(r6)
            r10 = r0
            r0 = 0
            r12 = 1
        L_0x067b:
            if (r12 == 0) goto L_0x08ce
            r13 = 1
            int r14 = r0 + 1
            t.d r0 = r1.f12096x0     // Catch:{ Exception -> 0x075b }
            r0.u()     // Catch:{ Exception -> 0x075b }
            r13 = 0
            r1.A0 = r13     // Catch:{ Exception -> 0x075b }
            r1.B0 = r13     // Catch:{ Exception -> 0x075b }
            t.d r0 = r1.f12096x0     // Catch:{ Exception -> 0x075b }
            r1.f(r0)     // Catch:{ Exception -> 0x075b }
            r0 = 0
        L_0x0690:
            if (r0 >= r9) goto L_0x06a2
            java.util.ArrayList<v.e> r13 = r1.f12108r0     // Catch:{ Exception -> 0x075b }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x075b }
            v.e r13 = (v.e) r13     // Catch:{ Exception -> 0x075b }
            t.d r15 = r1.f12096x0     // Catch:{ Exception -> 0x075b }
            r13.f(r15)     // Catch:{ Exception -> 0x075b }
            int r0 = r0 + 1
            goto L_0x0690
        L_0x06a2:
            t.d r0 = r1.f12096x0     // Catch:{ Exception -> 0x075b }
            r1.V(r0)     // Catch:{ Exception -> 0x075b }
            java.lang.ref.WeakReference<v.d> r0 = r1.H0     // Catch:{ Exception -> 0x074d }
            r12 = 5
            if (r0 == 0) goto L_0x06d1
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x074d }
            if (r0 == 0) goto L_0x06d1
            java.lang.ref.WeakReference<v.d> r0 = r1.H0     // Catch:{ Exception -> 0x074d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x074d }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x074d }
            t.d r13 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            v.d r15 = r1.K     // Catch:{ Exception -> 0x074d }
            t.g r13 = r13.l(r15)     // Catch:{ Exception -> 0x074d }
            t.d r15 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            t.g r0 = r15.l(r0)     // Catch:{ Exception -> 0x074d }
            t.d r15 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            r6 = 0
            r15.f(r0, r13, r6, r12)     // Catch:{ Exception -> 0x074d }
            r6 = 0
            r1.H0 = r6     // Catch:{ Exception -> 0x0758 }
        L_0x06d1:
            java.lang.ref.WeakReference<v.d> r0 = r1.J0     // Catch:{ Exception -> 0x074d }
            if (r0 == 0) goto L_0x06fa
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x074d }
            if (r0 == 0) goto L_0x06fa
            java.lang.ref.WeakReference<v.d> r0 = r1.J0     // Catch:{ Exception -> 0x074d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x074d }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x074d }
            t.d r6 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            v.d r13 = r1.M     // Catch:{ Exception -> 0x074d }
            t.g r6 = r6.l(r13)     // Catch:{ Exception -> 0x074d }
            t.d r13 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            t.g r0 = r13.l(r0)     // Catch:{ Exception -> 0x074d }
            t.d r13 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x074d }
            r6 = 0
            r1.J0 = r6     // Catch:{ Exception -> 0x0758 }
        L_0x06fa:
            java.lang.ref.WeakReference<v.d> r0 = r1.I0     // Catch:{ Exception -> 0x074d }
            if (r0 == 0) goto L_0x0723
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x074d }
            if (r0 == 0) goto L_0x0723
            java.lang.ref.WeakReference<v.d> r0 = r1.I0     // Catch:{ Exception -> 0x074d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x074d }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x074d }
            t.d r6 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            v.d r13 = r1.J     // Catch:{ Exception -> 0x074d }
            t.g r6 = r6.l(r13)     // Catch:{ Exception -> 0x074d }
            t.d r13 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            t.g r0 = r13.l(r0)     // Catch:{ Exception -> 0x074d }
            t.d r13 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            r15 = 0
            r13.f(r0, r6, r15, r12)     // Catch:{ Exception -> 0x074d }
            r6 = 0
            r1.I0 = r6     // Catch:{ Exception -> 0x0758 }
        L_0x0723:
            java.lang.ref.WeakReference<v.d> r0 = r1.K0     // Catch:{ Exception -> 0x074d }
            if (r0 == 0) goto L_0x0750
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x074d }
            if (r0 == 0) goto L_0x0750
            java.lang.ref.WeakReference<v.d> r0 = r1.K0     // Catch:{ Exception -> 0x074d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x074d }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x074d }
            t.d r6 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            v.d r13 = r1.L     // Catch:{ Exception -> 0x074d }
            t.g r6 = r6.l(r13)     // Catch:{ Exception -> 0x074d }
            t.d r13 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            t.g r0 = r13.l(r0)     // Catch:{ Exception -> 0x074d }
            t.d r13 = r1.f12096x0     // Catch:{ Exception -> 0x074d }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x074d }
            r6 = 0
            r1.K0 = r6     // Catch:{ Exception -> 0x0758 }
            goto L_0x0751
        L_0x074d:
            r0 = move-exception
            r6 = 0
            goto L_0x0759
        L_0x0750:
            r6 = 0
        L_0x0751:
            t.d r0 = r1.f12096x0     // Catch:{ Exception -> 0x0758 }
            r0.q()     // Catch:{ Exception -> 0x0758 }
            r12 = 1
            goto L_0x0776
        L_0x0758:
            r0 = move-exception
        L_0x0759:
            r12 = 1
            goto L_0x075d
        L_0x075b:
            r0 = move-exception
            r6 = 0
        L_0x075d:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "EXCEPTION : "
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r13.println(r0)
        L_0x0776:
            if (r12 == 0) goto L_0x07bf
            t.d r0 = r1.f12096x0
            boolean[] r6 = v.j.f12107a
            r12 = 2
            r13 = 0
            r6[r12] = r13
            r6 = 64
            boolean r12 = r1.d0(r6)
            r1.S(r0, r12)
            java.util.ArrayList<v.e> r13 = r1.f12108r0
            int r13 = r13.size()
            r15 = 0
            r21 = 0
        L_0x0792:
            if (r15 >= r13) goto L_0x07bd
            java.util.ArrayList<v.e> r6 = r1.f12108r0
            java.lang.Object r6 = r6.get(r15)
            v.e r6 = (v.e) r6
            r6.S(r0, r12)
            r23 = r0
            int r0 = r6.f12062h
            r24 = r12
            r12 = -1
            if (r0 != r12) goto L_0x07af
            int r0 = r6.i
            if (r0 == r12) goto L_0x07ad
            goto L_0x07af
        L_0x07ad:
            r0 = 0
            goto L_0x07b0
        L_0x07af:
            r0 = 1
        L_0x07b0:
            if (r0 == 0) goto L_0x07b4
            r21 = 1
        L_0x07b4:
            int r15 = r15 + 1
            r0 = r23
            r12 = r24
            r6 = 64
            goto L_0x0792
        L_0x07bd:
            r12 = -1
            goto L_0x07da
        L_0x07bf:
            r12 = -1
            t.d r0 = r1.f12096x0
            r1.S(r0, r7)
            r0 = 0
        L_0x07c6:
            if (r0 >= r9) goto L_0x07d8
            java.util.ArrayList<v.e> r6 = r1.f12108r0
            java.lang.Object r6 = r6.get(r0)
            v.e r6 = (v.e) r6
            t.d r13 = r1.f12096x0
            r6.S(r13, r7)
            int r0 = r0 + 1
            goto L_0x07c6
        L_0x07d8:
            r21 = 0
        L_0x07da:
            r0 = 8
            if (r11 == 0) goto L_0x0845
            if (r14 >= r0) goto L_0x0845
            boolean[] r6 = v.j.f12107a
            r13 = 2
            boolean r6 = r6[r13]
            if (r6 == 0) goto L_0x0845
            r6 = 0
            r12 = 0
            r15 = 0
        L_0x07ea:
            if (r6 >= r9) goto L_0x0811
            java.util.ArrayList<v.e> r13 = r1.f12108r0
            java.lang.Object r13 = r13.get(r6)
            v.e r13 = (v.e) r13
            int r0 = r13.f12051a0
            int r24 = r13.r()
            int r0 = r24 + r0
            int r15 = java.lang.Math.max(r15, r0)
            int r0 = r13.b0
            int r13 = r13.k()
            int r13 = r13 + r0
            int r12 = java.lang.Math.max(r12, r13)
            int r6 = r6 + 1
            r0 = 8
            r13 = 2
            goto L_0x07ea
        L_0x0811:
            int r0 = r1.f12056d0
            int r0 = java.lang.Math.max(r0, r15)
            int r6 = r1.f12058e0
            int r6 = java.lang.Math.max(r6, r12)
            v.e$b r12 = v.e.b.WRAP_CONTENT
            if (r2 != r12) goto L_0x0832
            int r13 = r26.r()
            if (r13 >= r0) goto L_0x0832
            r1.Q(r0)
            v.e$b[] r0 = r1.U
            r10 = 0
            r0[r10] = r12
            r10 = 1
            r21 = 1
        L_0x0832:
            if (r5 != r12) goto L_0x0845
            int r0 = r26.k()
            if (r0 >= r6) goto L_0x0845
            r1.L(r6)
            v.e$b[] r0 = r1.U
            r6 = 1
            r0[r6] = r12
            r10 = 1
            r21 = 1
        L_0x0845:
            int r0 = r1.f12056d0
            int r6 = r26.r()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r26.r()
            if (r0 <= r6) goto L_0x0862
            r1.Q(r0)
            v.e$b[] r0 = r1.U
            v.e$b r6 = v.e.b.FIXED
            r10 = 0
            r0[r10] = r6
            r10 = 1
            r21 = 1
        L_0x0862:
            int r0 = r1.f12058e0
            int r6 = r26.k()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r26.k()
            if (r0 <= r6) goto L_0x0880
            r1.L(r0)
            v.e$b[] r0 = r1.U
            v.e$b r6 = v.e.b.FIXED
            r12 = 1
            r0[r12] = r6
            r10 = r12
            r21 = r10
            goto L_0x0881
        L_0x0880:
            r12 = 1
        L_0x0881:
            if (r10 != 0) goto L_0x08c1
            v.e$b[] r0 = r1.U
            r6 = 0
            r0 = r0[r6]
            v.e$b r13 = v.e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x08a2
            if (r3 <= 0) goto L_0x08a2
            int r0 = r26.r()
            if (r0 <= r3) goto L_0x08a2
            r1.F0 = r12
            v.e$b[] r0 = r1.U
            v.e$b r10 = v.e.b.FIXED
            r0[r6] = r10
            r1.Q(r3)
            r10 = r12
            r21 = r10
        L_0x08a2:
            v.e$b[] r0 = r1.U
            r0 = r0[r12]
            if (r0 != r13) goto L_0x08c1
            if (r4 <= 0) goto L_0x08c1
            int r0 = r26.k()
            if (r0 <= r4) goto L_0x08c1
            r1.G0 = r12
            v.e$b[] r0 = r1.U
            v.e$b r6 = v.e.b.FIXED
            r0[r12] = r6
            r1.L(r4)
            r0 = 8
            r10 = 1
            r21 = 1
            goto L_0x08c3
        L_0x08c1:
            r0 = 8
        L_0x08c3:
            if (r14 <= r0) goto L_0x08c7
            r12 = 0
            goto L_0x08c9
        L_0x08c7:
            r12 = r21
        L_0x08c9:
            r0 = r14
            r6 = 64
            goto L_0x067b
        L_0x08ce:
            r1.f12108r0 = r8
            if (r10 == 0) goto L_0x08da
            v.e$b[] r0 = r1.U
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r5
        L_0x08da:
            t.d r0 = r1.f12096x0
            t.c r0 = r0.f11180l
            r1.F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.T():void");
    }

    public final void U(e eVar, int i) {
        if (i == 0) {
            int i10 = this.A0 + 1;
            c[] cVarArr = this.D0;
            if (i10 >= cVarArr.length) {
                this.D0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.D0;
            int i11 = this.A0;
            cVarArr2[i11] = new c(eVar, 0, this.f12095w0);
            this.A0 = i11 + 1;
        } else if (i == 1) {
            int i12 = this.B0 + 1;
            c[] cVarArr3 = this.C0;
            if (i12 >= cVarArr3.length) {
                this.C0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.C0;
            int i13 = this.B0;
            cVarArr4[i13] = new c(eVar, 1, this.f12095w0);
            this.B0 = i13 + 1;
        }
    }

    public final void V(d dVar) {
        boolean z;
        boolean d02 = d0(64);
        c(dVar, d02);
        int size = this.f12108r0.size();
        boolean z10 = false;
        for (int i = 0; i < size; i++) {
            e eVar = this.f12108r0.get(i);
            boolean[] zArr = eVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i10 = 0; i10 < size; i10++) {
                e eVar2 = this.f12108r0.get(i10);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i11 = 0; i11 < aVar.f12106s0; i11++) {
                        e eVar3 = aVar.f12105r0[i11];
                        if (aVar.f12024u0 || eVar3.d()) {
                            int i12 = aVar.f12023t0;
                            if (i12 == 0 || i12 == 1) {
                                eVar3.T[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                eVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.L0.clear();
        for (int i13 = 0; i13 < size; i13++) {
            e eVar4 = this.f12108r0.get(i13);
            if (eVar4.b()) {
                if (eVar4 instanceof k) {
                    this.L0.add(eVar4);
                } else {
                    eVar4.c(dVar, d02);
                }
            }
        }
        while (this.L0.size() > 0) {
            int size2 = this.L0.size();
            Iterator<e> it = this.L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                HashSet<e> hashSet = this.L0;
                int i14 = 0;
                while (true) {
                    if (i14 >= kVar.f12106s0) {
                        z = false;
                        continue;
                        break;
                    } else if (hashSet.contains(kVar.f12105r0[i14])) {
                        z = true;
                        continue;
                        break;
                    } else {
                        i14++;
                    }
                }
                if (z) {
                    kVar.c(dVar, d02);
                    this.L0.remove(kVar);
                    break;
                }
            }
            if (size2 == this.L0.size()) {
                Iterator<e> it2 = this.L0.iterator();
                while (it2.hasNext()) {
                    it2.next().c(dVar, d02);
                }
                this.L0.clear();
            }
        }
        if (d.f11169p) {
            HashSet hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                e eVar5 = this.f12108r0.get(i15);
                if (!eVar5.b()) {
                    hashSet2.add(eVar5);
                }
            }
            a(this, dVar, hashSet2, this.U[0] == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e eVar6 = (e) it3.next();
                j.a(this, dVar, eVar6);
                eVar6.c(dVar, d02);
            }
        } else {
            for (int i16 = 0; i16 < size; i16++) {
                e eVar7 = this.f12108r0.get(i16);
                if (eVar7 instanceof f) {
                    e.b[] bVarArr = eVar7.U;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar7.M(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.P(e.b.FIXED);
                    }
                    eVar7.c(dVar, d02);
                    if (bVar == bVar3) {
                        eVar7.M(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.P(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar7);
                    if (!eVar7.b()) {
                        eVar7.c(dVar, d02);
                    }
                }
            }
        }
        if (this.A0 > 0) {
            b.a(this, dVar, (ArrayList<e>) null, 0);
        }
        if (this.B0 > 0) {
            b.a(this, dVar, (ArrayList<e>) null, 1);
        }
    }

    public final void W(d dVar) {
        WeakReference<d> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > this.K0.get().c()) {
            this.K0 = new WeakReference<>(dVar);
        }
    }

    public final void X(d dVar) {
        WeakReference<d> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > this.I0.get().c()) {
            this.I0 = new WeakReference<>(dVar);
        }
    }

    public final void Y(d dVar) {
        WeakReference<d> weakReference = this.J0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > this.J0.get().c()) {
            this.J0 = new WeakReference<>(dVar);
        }
    }

    public final void Z(d dVar) {
        WeakReference<d> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > this.H0.get().c()) {
            this.H0 = new WeakReference<>(dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0144 A[EDGE_INSN: B:77:0x0144->B:62:0x0144 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a0(boolean r11, int r12) {
        /*
            r10 = this;
            w.e r0 = r10.f12092t0
            r1 = 1
            r11 = r11 & r1
            v.f r2 = r0.f12497a
            r3 = 0
            v.e$b r2 = r2.j(r3)
            v.f r4 = r0.f12497a
            v.e$b r4 = r4.j(r1)
            v.f r5 = r0.f12497a
            int r5 = r5.s()
            v.f r6 = r0.f12497a
            int r6 = r6.t()
            if (r11 == 0) goto L_0x008b
            v.e$b r7 = v.e.b.WRAP_CONTENT
            if (r2 == r7) goto L_0x0025
            if (r4 != r7) goto L_0x008b
        L_0x0025:
            java.util.ArrayList<w.p> r7 = r0.f12501e
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0042
            java.lang.Object r8 = r7.next()
            w.p r8 = (w.p) r8
            int r9 = r8.f12534f
            if (r9 != r12) goto L_0x002b
            boolean r8 = r8.k()
            if (r8 != 0) goto L_0x002b
            r11 = r3
        L_0x0042:
            if (r12 != 0) goto L_0x0068
            if (r11 == 0) goto L_0x008b
            v.e$b r11 = v.e.b.WRAP_CONTENT
            if (r2 != r11) goto L_0x008b
            v.f r11 = r0.f12497a
            v.e$b r7 = v.e.b.FIXED
            r11.M(r7)
            v.f r11 = r0.f12497a
            int r7 = r0.d(r11, r3)
            r11.Q(r7)
            v.f r11 = r0.f12497a
            w.l r7 = r11.f12055d
            w.g r7 = r7.f12533e
            int r11 = r11.r()
            r7.d(r11)
            goto L_0x008b
        L_0x0068:
            if (r11 == 0) goto L_0x008b
            v.e$b r11 = v.e.b.WRAP_CONTENT
            if (r4 != r11) goto L_0x008b
            v.f r11 = r0.f12497a
            v.e$b r7 = v.e.b.FIXED
            r11.P(r7)
            v.f r11 = r0.f12497a
            int r7 = r0.d(r11, r1)
            r11.L(r7)
            v.f r11 = r0.f12497a
            w.n r7 = r11.f12057e
            w.g r7 = r7.f12533e
            int r11 = r11.k()
            r7.d(r11)
        L_0x008b:
            if (r12 != 0) goto L_0x00b6
            v.f r11 = r0.f12497a
            v.e$b[] r6 = r11.U
            r7 = r6[r3]
            v.e$b r8 = v.e.b.FIXED
            if (r7 == r8) goto L_0x009d
            r6 = r6[r3]
            v.e$b r7 = v.e.b.MATCH_PARENT
            if (r6 != r7) goto L_0x00c7
        L_0x009d:
            int r11 = r11.r()
            int r11 = r11 + r5
            v.f r6 = r0.f12497a
            w.l r6 = r6.f12055d
            w.f r6 = r6.i
            r6.d(r11)
            v.f r6 = r0.f12497a
            w.l r6 = r6.f12055d
            w.g r6 = r6.f12533e
            int r11 = r11 - r5
            r6.d(r11)
            goto L_0x00e1
        L_0x00b6:
            v.f r11 = r0.f12497a
            v.e$b[] r5 = r11.U
            r7 = r5[r1]
            v.e$b r8 = v.e.b.FIXED
            if (r7 == r8) goto L_0x00c9
            r5 = r5[r1]
            v.e$b r7 = v.e.b.MATCH_PARENT
            if (r5 != r7) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r11 = r3
            goto L_0x00e2
        L_0x00c9:
            int r11 = r11.k()
            int r11 = r11 + r6
            v.f r5 = r0.f12497a
            w.n r5 = r5.f12057e
            w.f r5 = r5.i
            r5.d(r11)
            v.f r5 = r0.f12497a
            w.n r5 = r5.f12057e
            w.g r5 = r5.f12533e
            int r11 = r11 - r6
            r5.d(r11)
        L_0x00e1:
            r11 = r1
        L_0x00e2:
            r0.g()
            java.util.ArrayList<w.p> r5 = r0.f12501e
            java.util.Iterator r5 = r5.iterator()
        L_0x00eb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x010b
            java.lang.Object r6 = r5.next()
            w.p r6 = (w.p) r6
            int r7 = r6.f12534f
            if (r7 == r12) goto L_0x00fc
            goto L_0x00eb
        L_0x00fc:
            v.e r7 = r6.f12530b
            v.f r8 = r0.f12497a
            if (r7 != r8) goto L_0x0107
            boolean r7 = r6.g
            if (r7 != 0) goto L_0x0107
            goto L_0x00eb
        L_0x0107:
            r6.e()
            goto L_0x00eb
        L_0x010b:
            java.util.ArrayList<w.p> r5 = r0.f12501e
            java.util.Iterator r5 = r5.iterator()
        L_0x0111:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0144
            java.lang.Object r6 = r5.next()
            w.p r6 = (w.p) r6
            int r7 = r6.f12534f
            if (r7 == r12) goto L_0x0122
            goto L_0x0111
        L_0x0122:
            if (r11 != 0) goto L_0x012b
            v.e r7 = r6.f12530b
            v.f r8 = r0.f12497a
            if (r7 != r8) goto L_0x012b
            goto L_0x0111
        L_0x012b:
            w.f r7 = r6.f12535h
            boolean r7 = r7.f12511j
            if (r7 != 0) goto L_0x0132
            goto L_0x0143
        L_0x0132:
            w.f r7 = r6.i
            boolean r7 = r7.f12511j
            if (r7 != 0) goto L_0x0139
            goto L_0x0143
        L_0x0139:
            boolean r7 = r6 instanceof w.c
            if (r7 != 0) goto L_0x0111
            w.g r6 = r6.f12533e
            boolean r6 = r6.f12511j
            if (r6 != 0) goto L_0x0111
        L_0x0143:
            r1 = r3
        L_0x0144:
            v.f r11 = r0.f12497a
            r11.M(r2)
            v.f r11 = r0.f12497a
            r11.P(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.a0(boolean, int):boolean");
    }

    public final void b0() {
        this.f12092t0.f12498b = true;
    }

    public final boolean d0(int i) {
        return (this.E0 & i) == i;
    }

    public final void e0(int i) {
        this.E0 = i;
        d.f11169p = d0(512);
    }

    public final void o(StringBuilder sb2) {
        sb2.append(this.f12065j + ":{\n");
        sb2.append("  actualWidth:" + this.W);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.X);
        sb2.append("\n");
        Iterator<e> it = this.f12108r0.iterator();
        while (it.hasNext()) {
            it.next().o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
