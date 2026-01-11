package xg;

public final class s implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f13279b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f13280c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f13281d;

    public s(int i, f fVar, d dVar) {
        this.f13278a = i;
        this.f13280c = fVar;
        this.f13281d = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if ((r6 != null && r6.length >= r4) != false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0107 A[LOOP:0: B:63:0x0105->B:64:0x0107, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xg.l a(xg.l r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof xg.q
            r1 = 0
            if (r0 == 0) goto L_0x0008
            xg.q r14 = (xg.q) r14
            goto L_0x0009
        L_0x0008:
            r14 = r1
        L_0x0009:
            int r0 = r13.f13278a
            r2 = 16
            int r0 = java.lang.Math.min(r2, r0)
            r3 = 2
            int r0 = java.lang.Math.max(r3, r0)
            int r4 = r0 + -2
            r5 = 1
            int r4 = r5 << r4
            boolean r6 = r13.f13279b
            r7 = 0
            if (r14 == 0) goto L_0x0046
            int r8 = r14.f13276f
            int r9 = r14.f13272b
            int r9 = java.lang.Math.max(r9, r0)
            if (r8 < r9) goto L_0x0046
            xg.f[] r8 = r14.f13273c
            if (r8 == 0) goto L_0x0033
            int r8 = r8.length
            if (r8 < r4) goto L_0x0033
            r8 = r5
            goto L_0x0034
        L_0x0033:
            r8 = r7
        L_0x0034:
            if (r8 == 0) goto L_0x0046
            if (r6 == 0) goto L_0x0044
            xg.f[] r6 = r14.f13274d
            if (r6 == 0) goto L_0x0041
            int r6 = r6.length
            if (r6 < r4) goto L_0x0041
            r4 = r5
            goto L_0x0042
        L_0x0041:
            r4 = r7
        L_0x0042:
            if (r4 == 0) goto L_0x0046
        L_0x0044:
            r4 = r5
            goto L_0x0047
        L_0x0046:
            r4 = r7
        L_0x0047:
            if (r4 == 0) goto L_0x004d
            r14.a()
            return r14
        L_0x004d:
            xg.q r4 = new xg.q
            r4.<init>()
            if (r14 == 0) goto L_0x0065
            int r6 = r14.a()
            r4.f13271a = r6
            int r6 = r14.f13272b
            r4.f13272b = r6
            xg.f[] r6 = r14.f13273c
            xg.f[] r8 = r14.f13274d
            xg.f r14 = r14.f13275e
            goto L_0x0068
        L_0x0065:
            r14 = r1
            r6 = r14
            r8 = r6
        L_0x0068:
            int r9 = r4.f13272b
            int r0 = java.lang.Math.max(r9, r0)
            int r0 = java.lang.Math.min(r2, r0)
            int r2 = r0 + -2
            int r2 = r5 << r2
            if (r6 != 0) goto L_0x007c
            xg.f[] r6 = android.support.v4.media.b.f733u
            r9 = r7
            goto L_0x007d
        L_0x007c:
            int r9 = r6.length
        L_0x007d:
            if (r9 >= r2) goto L_0x0119
            xg.f[] r10 = new xg.f[r2]
            int r11 = r6.length
            java.lang.System.arraycopy(r6, r7, r10, r7, r11)
            if (r2 != r5) goto L_0x0091
            xg.f r1 = r13.f13280c
            xg.f r1 = r1.n()
            r10[r7] = r1
            goto L_0x0118
        L_0x0091:
            if (r9 != 0) goto L_0x0099
            xg.f r6 = r13.f13280c
            r10[r7] = r6
            r6 = r5
            goto L_0x009a
        L_0x0099:
            r6 = r9
        L_0x009a:
            if (r2 != r3) goto L_0x00a6
            xg.f r3 = r13.f13280c
            xg.f r3 = r3.u()
            r10[r5] = r3
            goto L_0x0111
        L_0x00a6:
            int r5 = r6 + -1
            r5 = r10[r5]
            if (r14 != 0) goto L_0x0104
            r14 = r10[r7]
            xg.f r14 = r14.w()
            boolean r11 = r14.j()
            if (r11 != 0) goto L_0x0104
            xg.d r11 = r13.f13281d
            boolean r11 = xg.a.g(r11)
            if (r11 == 0) goto L_0x0104
            xg.d r11 = r13.f13281d
            int r11 = r11.k()
            r12 = 64
            if (r11 < r12) goto L_0x0104
            xg.d r11 = r13.f13281d
            int r11 = r11.f13242f
            if (r11 == r3) goto L_0x00d7
            r3 = 3
            if (r11 == r3) goto L_0x00d7
            r3 = 4
            if (r11 == r3) goto L_0x00d7
            goto L_0x0104
        L_0x00d7:
            xg.e r1 = r14.h()
            xg.d r3 = r13.f13281d
            xg.e r11 = r14.f13246b
            java.math.BigInteger r11 = r11.q()
            xg.e r12 = r14.g()
            java.math.BigInteger r12 = r12.q()
            xg.f r3 = r3.d(r11, r12)
            xg.e r11 = r1.m()
            xg.e r12 = r11.i(r1)
            xg.f r5 = r5.r(r11)
            xg.f r5 = r5.s(r12)
            if (r9 != 0) goto L_0x0105
            r10[r7] = r5
            goto L_0x0105
        L_0x0104:
            r3 = r14
        L_0x0105:
            if (r6 >= r2) goto L_0x0111
            int r11 = r6 + 1
            xg.f r5 = r5.a(r3)
            r10[r6] = r5
            r6 = r11
            goto L_0x0105
        L_0x0111:
            xg.d r3 = r13.f13281d
            int r5 = r2 - r9
            r3.n(r10, r9, r5, r1)
        L_0x0118:
            r6 = r10
        L_0x0119:
            boolean r1 = r13.f13279b
            if (r1 == 0) goto L_0x013d
            if (r8 != 0) goto L_0x0123
            xg.f[] r1 = new xg.f[r2]
            r8 = r1
            goto L_0x0130
        L_0x0123:
            int r1 = r8.length
            if (r1 >= r2) goto L_0x012f
            xg.f[] r3 = new xg.f[r2]
            int r5 = r8.length
            java.lang.System.arraycopy(r8, r7, r3, r7, r5)
            r7 = r1
            r8 = r3
            goto L_0x0130
        L_0x012f:
            r7 = r1
        L_0x0130:
            if (r7 >= r2) goto L_0x013d
            r1 = r6[r7]
            xg.f r1 = r1.m()
            r8[r7] = r1
            int r7 = r7 + 1
            goto L_0x0130
        L_0x013d:
            r4.f13273c = r6
            r4.f13274d = r8
            r4.f13275e = r14
            r4.f13276f = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.s.a(xg.l):xg.l");
    }
}
