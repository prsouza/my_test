package v;

public final class b {
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ad, code lost:
        if (r5 == r6) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c0, code lost:
        if (r5 == 2) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01c8, code lost:
        r22 = r21;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02a1, code lost:
        if (r3[r16].f12047f.f12045d == r6) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        if (r4[r8] != 2) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011a, code lost:
        if (r4[r2].f12047f.f12045d == r5) goto L_0x011e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x045a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x06f5  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0704  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(v.f r35, t.d r36, java.util.ArrayList<v.e> r37, int r38) {
        /*
            r0 = r35
            r10 = r36
            r11 = r37
            r12 = 2
            if (r38 != 0) goto L_0x0012
            int r1 = r0.A0
            v.c[] r2 = r0.D0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.B0
            v.c[] r2 = r0.C0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0737
            r1 = r15[r9]
            boolean r2 = r1.f12041q
            r17 = 0
            r8 = 8
            r4 = 1
            if (r2 != 0) goto L_0x0169
            int r2 = r1.f12036l
            int r2 = r2 * r12
            v.e r5 = r1.f12027a
            r6 = r5
            r7 = 0
        L_0x002f:
            if (r7 != 0) goto L_0x012f
            int r13 = r1.i
            int r13 = r13 + r4
            r1.i = r13
            v.e[] r13 = r5.f12076o0
            int r3 = r1.f12036l
            r13[r3] = r17
            v.e[] r13 = r5.f12074n0
            r13[r3] = r17
            int r13 = r5.f12064i0
            if (r13 == r8) goto L_0x00f4
            v.e$b r3 = r5.j(r3)
            v.e$b r13 = v.e.b.MATCH_CONSTRAINT
            if (r3 == r13) goto L_0x004e
            int r3 = r1.f12036l
        L_0x004e:
            v.d[] r3 = r5.R
            r3 = r3[r2]
            r3.d()
            v.d[] r3 = r5.R
            int r19 = r2 + 1
            r3 = r3[r19]
            r3.d()
            v.d[] r3 = r5.R
            r3 = r3[r2]
            r3.d()
            v.d[] r3 = r5.R
            r3 = r3[r19]
            r3.d()
            v.e r3 = r1.f12028b
            if (r3 != 0) goto L_0x0072
            r1.f12028b = r5
        L_0x0072:
            r1.f12030d = r5
            v.e$b[] r3 = r5.U
            int r8 = r1.f12036l
            r4 = r3[r8]
            if (r4 != r13) goto L_0x00f4
            int[] r4 = r5.f12083t
            r21 = r4[r8]
            r12 = 3
            if (r21 == 0) goto L_0x008f
            r21 = r7
            r7 = r4[r8]
            if (r7 == r12) goto L_0x0091
            r7 = r4[r8]
            r12 = 2
            if (r7 != r12) goto L_0x00f6
            goto L_0x0091
        L_0x008f:
            r21 = r7
        L_0x0091:
            int r7 = r1.f12034j
            r12 = 1
            int r7 = r7 + r12
            r1.f12034j = r7
            float[] r7 = r5.f12072m0
            r12 = r7[r8]
            r18 = 0
            int r23 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r23 <= 0) goto L_0x00ab
            r23 = r9
            float r9 = r1.f12035k
            r7 = r7[r8]
            float r9 = r9 + r7
            r1.f12035k = r9
            goto L_0x00ad
        L_0x00ab:
            r23 = r9
        L_0x00ad:
            int r7 = r5.f12064i0
            r9 = 8
            if (r7 == r9) goto L_0x00c2
            r3 = r3[r8]
            if (r3 != r13) goto L_0x00c2
            r3 = r4[r8]
            if (r3 == 0) goto L_0x00c0
            r3 = r4[r8]
            r4 = 3
            if (r3 != r4) goto L_0x00c2
        L_0x00c0:
            r3 = 1
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            if (r3 == 0) goto L_0x00e1
            r3 = 0
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ce
            r3 = 1
            r1.f12038n = r3
            goto L_0x00d1
        L_0x00ce:
            r3 = 1
            r1.f12039o = r3
        L_0x00d1:
            java.util.ArrayList<v.e> r3 = r1.f12033h
            if (r3 != 0) goto L_0x00dc
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f12033h = r3
        L_0x00dc:
            java.util.ArrayList<v.e> r3 = r1.f12033h
            r3.add(r5)
        L_0x00e1:
            v.e r3 = r1.f12032f
            if (r3 != 0) goto L_0x00e7
            r1.f12032f = r5
        L_0x00e7:
            v.e r3 = r1.g
            if (r3 == 0) goto L_0x00f1
            v.e[] r3 = r3.f12074n0
            int r4 = r1.f12036l
            r3[r4] = r5
        L_0x00f1:
            r1.g = r5
            goto L_0x00f8
        L_0x00f4:
            r21 = r7
        L_0x00f6:
            r23 = r9
        L_0x00f8:
            if (r6 == r5) goto L_0x0100
            v.e[] r3 = r6.f12076o0
            int r4 = r1.f12036l
            r3[r4] = r5
        L_0x0100:
            v.d[] r3 = r5.R
            int r4 = r2 + 1
            r3 = r3[r4]
            v.d r3 = r3.f12047f
            if (r3 == 0) goto L_0x011c
            v.e r3 = r3.f12045d
            v.d[] r4 = r3.R
            r6 = r4[r2]
            v.d r6 = r6.f12047f
            if (r6 == 0) goto L_0x011c
            r4 = r4[r2]
            v.d r4 = r4.f12047f
            v.e r4 = r4.f12045d
            if (r4 == r5) goto L_0x011e
        L_0x011c:
            r3 = r17
        L_0x011e:
            if (r3 == 0) goto L_0x0123
            r7 = r21
            goto L_0x0125
        L_0x0123:
            r3 = r5
            r7 = 1
        L_0x0125:
            r6 = r5
            r9 = r23
            r4 = 1
            r8 = 8
            r12 = 2
            r5 = r3
            goto L_0x002f
        L_0x012f:
            r23 = r9
            v.e r3 = r1.f12028b
            if (r3 == 0) goto L_0x013c
            v.d[] r3 = r3.R
            r3 = r3[r2]
            r3.d()
        L_0x013c:
            v.e r3 = r1.f12030d
            if (r3 == 0) goto L_0x0149
            v.d[] r3 = r3.R
            int r2 = r2 + 1
            r2 = r3[r2]
            r2.d()
        L_0x0149:
            r1.f12029c = r5
            int r2 = r1.f12036l
            if (r2 != 0) goto L_0x0156
            boolean r2 = r1.f12037m
            if (r2 == 0) goto L_0x0156
            r1.f12031e = r5
            goto L_0x015a
        L_0x0156:
            v.e r2 = r1.f12027a
            r1.f12031e = r2
        L_0x015a:
            boolean r2 = r1.f12039o
            if (r2 == 0) goto L_0x0164
            boolean r2 = r1.f12038n
            if (r2 == 0) goto L_0x0164
            r2 = 1
            goto L_0x0165
        L_0x0164:
            r2 = 0
        L_0x0165:
            r1.f12040p = r2
            r2 = 1
            goto L_0x016c
        L_0x0169:
            r23 = r9
            r2 = r4
        L_0x016c:
            r1.f12041q = r2
            if (r11 == 0) goto L_0x0181
            v.e r2 = r1.f12027a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L_0x0179
            goto L_0x0181
        L_0x0179:
            r29 = r14
            r27 = r15
            r25 = r23
            goto L_0x072a
        L_0x0181:
            v.e r12 = r1.f12027a
            v.e r13 = r1.f12029c
            v.e r9 = r1.f12028b
            v.e r8 = r1.f12030d
            v.e r2 = r1.f12031e
            float r3 = r1.f12035k
            v.e$b[] r4 = r0.U
            r4 = r4[r38]
            v.e$b r5 = v.e.b.WRAP_CONTENT
            if (r4 != r5) goto L_0x0197
            r4 = 1
            goto L_0x0198
        L_0x0197:
            r4 = 0
        L_0x0198:
            if (r38 != 0) goto L_0x01b0
            int r5 = r2.f12068k0
            r6 = 1
            if (r5 != 0) goto L_0x01a2
            r20 = 1
            goto L_0x01a4
        L_0x01a2:
            r20 = 0
        L_0x01a4:
            if (r5 != r6) goto L_0x01a9
            r7 = r6
            r6 = 2
            goto L_0x01ab
        L_0x01a9:
            r6 = 2
            r7 = 0
        L_0x01ab:
            r21 = r20
            if (r5 != r6) goto L_0x01c8
            goto L_0x01c2
        L_0x01b0:
            r6 = 2
            int r5 = r2.f12070l0
            r7 = 1
            if (r5 != 0) goto L_0x01b9
            r21 = 1
            goto L_0x01bb
        L_0x01b9:
            r21 = 0
        L_0x01bb:
            if (r5 != r7) goto L_0x01bf
            r7 = 1
            goto L_0x01c0
        L_0x01bf:
            r7 = 0
        L_0x01c0:
            if (r5 != r6) goto L_0x01c8
        L_0x01c2:
            r22 = r21
            r5 = 1
        L_0x01c5:
            r21 = r7
            goto L_0x01cc
        L_0x01c8:
            r22 = r21
            r5 = 0
            goto L_0x01c5
        L_0x01cc:
            r24 = r3
            r6 = r12
            r7 = 0
        L_0x01d0:
            if (r7 != 0) goto L_0x02b8
            v.d[] r3 = r6.R
            r3 = r3[r16]
            if (r5 == 0) goto L_0x01db
            r26 = 1
            goto L_0x01dd
        L_0x01db:
            r26 = 4
        L_0x01dd:
            int r27 = r3.d()
            r28 = r7
            v.e$b[] r7 = r6.U
            r7 = r7[r38]
            v.e$b r11 = v.e.b.MATCH_CONSTRAINT
            if (r7 != r11) goto L_0x01f5
            int[] r7 = r6.f12083t
            r7 = r7[r38]
            if (r7 != 0) goto L_0x01f5
            r29 = r14
            r7 = 1
            goto L_0x01f8
        L_0x01f5:
            r29 = r14
            r7 = 0
        L_0x01f8:
            v.d r14 = r3.f12047f
            if (r14 == 0) goto L_0x0204
            if (r6 == r12) goto L_0x0204
            int r14 = r14.d()
            int r27 = r14 + r27
        L_0x0204:
            r14 = r27
            if (r5 == 0) goto L_0x0211
            if (r6 == r12) goto L_0x0211
            if (r6 == r9) goto L_0x0211
            r27 = r15
            r26 = 8
            goto L_0x0213
        L_0x0211:
            r27 = r15
        L_0x0213:
            v.d r15 = r3.f12047f
            if (r15 == 0) goto L_0x0251
            if (r6 != r9) goto L_0x0226
            r30 = r2
            t.g r2 = r3.i
            t.g r15 = r15.i
            r31 = r12
            r12 = 6
            r10.f(r2, r15, r14, r12)
            goto L_0x0233
        L_0x0226:
            r30 = r2
            r31 = r12
            t.g r2 = r3.i
            t.g r12 = r15.i
            r15 = 8
            r10.f(r2, r12, r14, r15)
        L_0x0233:
            if (r7 == 0) goto L_0x0239
            if (r5 != 0) goto L_0x0239
            r26 = 5
        L_0x0239:
            if (r6 != r9) goto L_0x0245
            if (r5 == 0) goto L_0x0245
            boolean[] r2 = r6.T
            boolean r2 = r2[r38]
            if (r2 == 0) goto L_0x0245
            r2 = 5
            goto L_0x0247
        L_0x0245:
            r2 = r26
        L_0x0247:
            t.g r7 = r3.i
            v.d r3 = r3.f12047f
            t.g r3 = r3.i
            r10.d(r7, r3, r14, r2)
            goto L_0x0255
        L_0x0251:
            r30 = r2
            r31 = r12
        L_0x0255:
            if (r4 == 0) goto L_0x0287
            int r2 = r6.f12064i0
            r3 = 8
            if (r2 == r3) goto L_0x0275
            v.e$b[] r2 = r6.U
            r2 = r2[r38]
            if (r2 != r11) goto L_0x0275
            v.d[] r2 = r6.R
            int r3 = r16 + 1
            r3 = r2[r3]
            t.g r3 = r3.i
            r2 = r2[r16]
            t.g r2 = r2.i
            r7 = 5
            r11 = 0
            r10.f(r3, r2, r11, r7)
            goto L_0x0276
        L_0x0275:
            r11 = 0
        L_0x0276:
            v.d[] r2 = r6.R
            r2 = r2[r16]
            t.g r2 = r2.i
            v.d[] r3 = r0.R
            r3 = r3[r16]
            t.g r3 = r3.i
            r7 = 8
            r10.f(r2, r3, r11, r7)
        L_0x0287:
            v.d[] r2 = r6.R
            int r3 = r16 + 1
            r2 = r2[r3]
            v.d r2 = r2.f12047f
            if (r2 == 0) goto L_0x02a3
            v.e r2 = r2.f12045d
            v.d[] r3 = r2.R
            r7 = r3[r16]
            v.d r7 = r7.f12047f
            if (r7 == 0) goto L_0x02a3
            r3 = r3[r16]
            v.d r3 = r3.f12047f
            v.e r3 = r3.f12045d
            if (r3 == r6) goto L_0x02a5
        L_0x02a3:
            r2 = r17
        L_0x02a5:
            if (r2 == 0) goto L_0x02ab
            r6 = r2
            r7 = r28
            goto L_0x02ac
        L_0x02ab:
            r7 = 1
        L_0x02ac:
            r11 = r37
            r15 = r27
            r14 = r29
            r2 = r30
            r12 = r31
            goto L_0x01d0
        L_0x02b8:
            r30 = r2
            r31 = r12
            r29 = r14
            r27 = r15
            if (r8 == 0) goto L_0x0323
            v.d[] r2 = r13.R
            int r3 = r16 + 1
            r2 = r2[r3]
            v.d r2 = r2.f12047f
            if (r2 == 0) goto L_0x0323
            v.d[] r2 = r8.R
            r2 = r2[r3]
            v.e$b[] r6 = r8.U
            r6 = r6[r38]
            v.e$b r7 = v.e.b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x02e0
            int[] r6 = r8.f12083t
            r6 = r6[r38]
            if (r6 != 0) goto L_0x02e0
            r6 = 1
            goto L_0x02e1
        L_0x02e0:
            r6 = 0
        L_0x02e1:
            if (r6 == 0) goto L_0x02f9
            if (r5 != 0) goto L_0x02f9
            v.d r6 = r2.f12047f
            v.e r7 = r6.f12045d
            if (r7 != r0) goto L_0x02f9
            t.g r7 = r2.i
            t.g r6 = r6.i
            int r11 = r2.d()
            int r11 = -r11
            r12 = 5
            r10.d(r7, r6, r11, r12)
            goto L_0x030f
        L_0x02f9:
            r12 = 5
            if (r5 == 0) goto L_0x030f
            v.d r6 = r2.f12047f
            v.e r7 = r6.f12045d
            if (r7 != r0) goto L_0x030f
            t.g r7 = r2.i
            t.g r6 = r6.i
            int r11 = r2.d()
            int r11 = -r11
            r14 = 4
            r10.d(r7, r6, r11, r14)
        L_0x030f:
            t.g r6 = r2.i
            v.d[] r7 = r13.R
            r3 = r7[r3]
            v.d r3 = r3.f12047f
            t.g r3 = r3.i
            int r2 = r2.d()
            int r2 = -r2
            r7 = 6
            r10.g(r6, r3, r2, r7)
            goto L_0x0324
        L_0x0323:
            r12 = 5
        L_0x0324:
            if (r4 == 0) goto L_0x033f
            v.d[] r2 = r0.R
            int r3 = r16 + 1
            r2 = r2[r3]
            t.g r2 = r2.i
            v.d[] r4 = r13.R
            r6 = r4[r3]
            t.g r6 = r6.i
            r3 = r4[r3]
            int r3 = r3.d()
            r4 = 8
            r10.f(r2, r6, r3, r4)
        L_0x033f:
            java.util.ArrayList<v.e> r2 = r1.f12033h
            if (r2 == 0) goto L_0x0458
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0458
            boolean r6 = r1.f12038n
            if (r6 == 0) goto L_0x0356
            boolean r6 = r1.f12040p
            if (r6 != 0) goto L_0x0356
            int r6 = r1.f12034j
            float r6 = (float) r6
            goto L_0x0358
        L_0x0356:
            r6 = r24
        L_0x0358:
            r14 = r17
            r7 = 0
            r11 = 0
        L_0x035c:
            if (r11 >= r3) goto L_0x0458
            java.lang.Object r15 = r2.get(r11)
            v.e r15 = (v.e) r15
            float[] r4 = r15.f12072m0
            r4 = r4[r38]
            r18 = 0
            int r24 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r24 >= 0) goto L_0x0388
            boolean r4 = r1.f12040p
            if (r4 == 0) goto L_0x0384
            v.d[] r4 = r15.R
            int r12 = r16 + 1
            r12 = r4[r12]
            t.g r12 = r12.i
            r4 = r4[r16]
            t.g r4 = r4.i
            r0 = 0
            r15 = 4
            r10.d(r12, r4, r0, r15)
            goto L_0x03a1
        L_0x0384:
            r0 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0389
        L_0x0388:
            r0 = 4
        L_0x0389:
            r18 = 0
            int r24 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r24 != 0) goto L_0x03a9
            v.d[] r4 = r15.R
            int r12 = r16 + 1
            r12 = r4[r12]
            t.g r12 = r12.i
            r4 = r4[r16]
            t.g r4 = r4.i
            r0 = 0
            r15 = 8
            r10.d(r12, r4, r0, r15)
        L_0x03a1:
            r32 = r2
            r25 = r3
            r18 = 0
            goto L_0x044c
        L_0x03a9:
            r0 = 0
            if (r14 == 0) goto L_0x043e
            v.d[] r14 = r14.R
            r0 = r14[r16]
            t.g r0 = r0.i
            int r25 = r16 + 1
            r14 = r14[r25]
            t.g r14 = r14.i
            v.d[] r12 = r15.R
            r32 = r2
            r2 = r12[r16]
            t.g r2 = r2.i
            r12 = r12[r25]
            t.g r12 = r12.i
            r25 = r3
            t.b r3 = r36.m()
            r33 = r15
            r15 = 0
            r3.f11161b = r15
            int r18 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r18 == 0) goto L_0x041f
            int r18 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r18 != 0) goto L_0x03da
            goto L_0x041f
        L_0x03da:
            r18 = 0
            int r34 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r34 != 0) goto L_0x03ed
            t.b$a r2 = r3.f11163d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.d(r0, r7)
            t.b$a r0 = r3.f11163d
            r0.d(r14, r15)
            goto L_0x03fd
        L_0x03ed:
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r24 != 0) goto L_0x0400
            t.b$a r0 = r3.f11163d
            r0.d(r2, r15)
            t.b$a r0 = r3.f11163d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.d(r12, r2)
        L_0x03fd:
            r24 = r4
            goto L_0x043a
        L_0x0400:
            float r7 = r7 / r6
            float r24 = r4 / r6
            float r7 = r7 / r24
            r24 = r4
            t.b$a r4 = r3.f11163d
            r4.d(r0, r15)
            t.b$a r0 = r3.f11163d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.d(r14, r4)
            t.b$a r0 = r3.f11163d
            r0.d(r12, r7)
            t.b$a r0 = r3.f11163d
            float r4 = -r7
            r0.d(r2, r4)
            goto L_0x043a
        L_0x041f:
            r24 = r4
            r4 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            t.b$a r7 = r3.f11163d
            r7.d(r0, r15)
            t.b$a r0 = r3.f11163d
            r0.d(r14, r4)
            t.b$a r0 = r3.f11163d
            r0.d(r12, r15)
            t.b$a r0 = r3.f11163d
            r0.d(r2, r4)
        L_0x043a:
            r10.c(r3)
            goto L_0x0448
        L_0x043e:
            r32 = r2
            r25 = r3
            r24 = r4
            r33 = r15
            r18 = 0
        L_0x0448:
            r7 = r24
            r14 = r33
        L_0x044c:
            int r11 = r11 + 1
            r3 = r25
            r2 = r32
            r4 = 1
            r12 = 5
            r0 = r35
            goto L_0x035c
        L_0x0458:
            if (r9 == 0) goto L_0x04bb
            if (r9 == r8) goto L_0x045e
            if (r5 == 0) goto L_0x04bb
        L_0x045e:
            r0 = r31
            v.d[] r0 = r0.R
            r0 = r0[r16]
            v.d[] r1 = r13.R
            int r2 = r16 + 1
            r1 = r1[r2]
            v.d r0 = r0.f12047f
            if (r0 == 0) goto L_0x0472
            t.g r0 = r0.i
            r3 = r0
            goto L_0x0474
        L_0x0472:
            r3 = r17
        L_0x0474:
            v.d r0 = r1.f12047f
            if (r0 == 0) goto L_0x047c
            t.g r0 = r0.i
            r6 = r0
            goto L_0x047e
        L_0x047c:
            r6 = r17
        L_0x047e:
            v.d[] r0 = r9.R
            r0 = r0[r16]
            if (r8 == 0) goto L_0x0488
            v.d[] r1 = r8.R
            r1 = r1[r2]
        L_0x0488:
            if (r3 == 0) goto L_0x04b2
            if (r6 == 0) goto L_0x04b2
            if (r38 != 0) goto L_0x0493
            r2 = r30
            float r2 = r2.f12060f0
            goto L_0x0497
        L_0x0493:
            r2 = r30
            float r2 = r2.f12061g0
        L_0x0497:
            r5 = r2
            int r4 = r0.d()
            int r11 = r1.d()
            t.g r2 = r0.i
            t.g r7 = r1.i
            r0 = 7
            r1 = r36
            r12 = 2
            r14 = r8
            r8 = r11
            r11 = r9
            r15 = r23
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04b7
        L_0x04b2:
            r14 = r8
            r11 = r9
            r15 = r23
            r12 = 2
        L_0x04b7:
            r25 = r15
            goto L_0x06ca
        L_0x04bb:
            r14 = r8
            r11 = r9
            r15 = r23
            r0 = r31
            r12 = 2
            if (r22 == 0) goto L_0x05bd
            if (r11 == 0) goto L_0x05bd
            int r2 = r1.f12034j
            if (r2 <= 0) goto L_0x04d1
            int r1 = r1.i
            if (r1 != r2) goto L_0x04d1
            r20 = 1
            goto L_0x04d3
        L_0x04d1:
            r20 = 0
        L_0x04d3:
            r8 = r11
            r9 = r8
        L_0x04d5:
            if (r9 == 0) goto L_0x04b7
            v.e[] r1 = r9.f12076o0
            r1 = r1[r38]
            r7 = r1
        L_0x04dc:
            if (r7 == 0) goto L_0x04e9
            int r1 = r7.f12064i0
            r6 = 8
            if (r1 != r6) goto L_0x04eb
            v.e[] r1 = r7.f12076o0
            r7 = r1[r38]
            goto L_0x04dc
        L_0x04e9:
            r6 = 8
        L_0x04eb:
            if (r7 != 0) goto L_0x04f7
            if (r9 != r14) goto L_0x04f0
            goto L_0x04f7
        L_0x04f0:
            r12 = r7
            r18 = r8
            r25 = r15
            goto L_0x05ac
        L_0x04f7:
            v.d[] r1 = r9.R
            r1 = r1[r16]
            t.g r2 = r1.i
            v.d r3 = r1.f12047f
            if (r3 == 0) goto L_0x0504
            t.g r3 = r3.i
            goto L_0x0506
        L_0x0504:
            r3 = r17
        L_0x0506:
            if (r8 == r9) goto L_0x0511
            v.d[] r3 = r8.R
            int r4 = r16 + 1
            r3 = r3[r4]
            t.g r3 = r3.i
            goto L_0x0524
        L_0x0511:
            if (r9 != r11) goto L_0x0524
            v.d[] r3 = r0.R
            r4 = r3[r16]
            v.d r4 = r4.f12047f
            if (r4 == 0) goto L_0x0522
            r3 = r3[r16]
            v.d r3 = r3.f12047f
            t.g r3 = r3.i
            goto L_0x0524
        L_0x0522:
            r3 = r17
        L_0x0524:
            int r1 = r1.d()
            v.d[] r4 = r9.R
            int r5 = r16 + 1
            r4 = r4[r5]
            int r4 = r4.d()
            if (r7 == 0) goto L_0x053b
            v.d[] r6 = r7.R
            r6 = r6[r16]
            t.g r12 = r6.i
            goto L_0x0545
        L_0x053b:
            v.d[] r6 = r13.R
            r6 = r6[r5]
            v.d r6 = r6.f12047f
            if (r6 == 0) goto L_0x0548
            t.g r12 = r6.i
        L_0x0545:
            r18 = r7
            goto L_0x054c
        L_0x0548:
            r18 = r7
            r12 = r17
        L_0x054c:
            v.d[] r7 = r9.R
            r7 = r7[r5]
            t.g r7 = r7.i
            if (r6 == 0) goto L_0x0559
            int r6 = r6.d()
            int r4 = r4 + r6
        L_0x0559:
            v.d[] r6 = r8.R
            r6 = r6[r5]
            int r6 = r6.d()
            int r6 = r6 + r1
            if (r2 == 0) goto L_0x05a6
            if (r3 == 0) goto L_0x05a6
            if (r12 == 0) goto L_0x05a6
            if (r7 == 0) goto L_0x05a6
            if (r9 != r11) goto L_0x0575
            v.d[] r1 = r11.R
            r1 = r1[r16]
            int r1 = r1.d()
            r6 = r1
        L_0x0575:
            if (r9 != r14) goto L_0x0582
            v.d[] r1 = r14.R
            r1 = r1[r5]
            int r1 = r1.d()
            r23 = r1
            goto L_0x0584
        L_0x0582:
            r23 = r4
        L_0x0584:
            if (r20 == 0) goto L_0x0589
            r24 = 8
            goto L_0x058b
        L_0x0589:
            r24 = 5
        L_0x058b:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r36
            r4 = 5
            r25 = r15
            r15 = r4
            r4 = r6
            r19 = 8
            r6 = r12
            r12 = r18
            r18 = r8
            r15 = r19
            r8 = r23
            r15 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05ad
        L_0x05a6:
            r25 = r15
            r12 = r18
            r18 = r8
        L_0x05ac:
            r15 = r9
        L_0x05ad:
            int r1 = r15.f12064i0
            r2 = 8
            if (r1 == r2) goto L_0x05b5
            r8 = r15
            goto L_0x05b7
        L_0x05b5:
            r8 = r18
        L_0x05b7:
            r9 = r12
            r15 = r25
            r12 = 2
            goto L_0x04d5
        L_0x05bd:
            r25 = r15
            if (r21 == 0) goto L_0x06ca
            if (r11 == 0) goto L_0x06ca
            int r2 = r1.f12034j
            if (r2 <= 0) goto L_0x05ce
            int r1 = r1.i
            if (r1 != r2) goto L_0x05ce
            r20 = 1
            goto L_0x05d0
        L_0x05ce:
            r20 = 0
        L_0x05d0:
            r12 = r11
            r15 = r12
        L_0x05d2:
            if (r12 == 0) goto L_0x0678
            v.e[] r1 = r12.f12076o0
            r1 = r1[r38]
        L_0x05d8:
            if (r1 == 0) goto L_0x05e5
            int r2 = r1.f12064i0
            r3 = 8
            if (r2 != r3) goto L_0x05e5
            v.e[] r1 = r1.f12076o0
            r1 = r1[r38]
            goto L_0x05d8
        L_0x05e5:
            if (r12 == r11) goto L_0x066b
            if (r12 == r14) goto L_0x066b
            if (r1 == 0) goto L_0x066b
            if (r1 != r14) goto L_0x05f0
            r9 = r17
            goto L_0x05f1
        L_0x05f0:
            r9 = r1
        L_0x05f1:
            v.d[] r1 = r12.R
            r1 = r1[r16]
            t.g r2 = r1.i
            v.d[] r3 = r15.R
            int r4 = r16 + 1
            r3 = r3[r4]
            t.g r3 = r3.i
            int r1 = r1.d()
            v.d[] r5 = r12.R
            r5 = r5[r4]
            int r5 = r5.d()
            if (r9 == 0) goto L_0x061d
            v.d[] r6 = r9.R
            r6 = r6[r16]
            t.g r7 = r6.i
            v.d r8 = r6.f12047f
            if (r8 == 0) goto L_0x061a
            t.g r8 = r8.i
            goto L_0x062e
        L_0x061a:
            r8 = r17
            goto L_0x062e
        L_0x061d:
            v.d[] r6 = r14.R
            r6 = r6[r16]
            if (r6 == 0) goto L_0x0626
            t.g r7 = r6.i
            goto L_0x0628
        L_0x0626:
            r7 = r17
        L_0x0628:
            v.d[] r8 = r12.R
            r8 = r8[r4]
            t.g r8 = r8.i
        L_0x062e:
            if (r6 == 0) goto L_0x0638
            int r6 = r6.d()
            int r6 = r6 + r5
            r18 = r6
            goto L_0x063a
        L_0x0638:
            r18 = r5
        L_0x063a:
            v.d[] r5 = r15.R
            r4 = r5[r4]
            int r4 = r4.d()
            int r4 = r4 + r1
            if (r20 == 0) goto L_0x0648
            r23 = 8
            goto L_0x064a
        L_0x0648:
            r23 = 4
        L_0x064a:
            if (r2 == 0) goto L_0x0664
            if (r3 == 0) goto L_0x0664
            if (r7 == 0) goto L_0x0664
            if (r8 == 0) goto L_0x0664
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r36
            r24 = 4
            r6 = r7
            r7 = r8
            r8 = r18
            r18 = r9
            r9 = r23
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0668
        L_0x0664:
            r18 = r9
            r24 = 4
        L_0x0668:
            r9 = r18
            goto L_0x066e
        L_0x066b:
            r24 = 4
            r9 = r1
        L_0x066e:
            int r1 = r12.f12064i0
            r2 = 8
            if (r1 == r2) goto L_0x0675
            r15 = r12
        L_0x0675:
            r12 = r9
            goto L_0x05d2
        L_0x0678:
            v.d[] r1 = r11.R
            r1 = r1[r16]
            v.d[] r0 = r0.R
            r0 = r0[r16]
            v.d r0 = r0.f12047f
            v.d[] r2 = r14.R
            int r3 = r16 + 1
            r12 = r2[r3]
            v.d[] r2 = r13.R
            r2 = r2[r3]
            v.d r15 = r2.f12047f
            if (r0 == 0) goto L_0x06b9
            if (r11 == r14) goto L_0x069f
            t.g r2 = r1.i
            t.g r0 = r0.i
            int r1 = r1.d()
            r3 = 5
            r10.d(r2, r0, r1, r3)
            goto L_0x06b9
        L_0x069f:
            if (r15 == 0) goto L_0x06b9
            t.g r2 = r1.i
            t.g r3 = r0.i
            int r4 = r1.d()
            r5 = 1056964608(0x3f000000, float:0.5)
            t.g r6 = r12.i
            t.g r7 = r15.i
            int r8 = r12.d()
            r9 = 5
            r1 = r36
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06b9:
            if (r15 == 0) goto L_0x06ca
            if (r11 == r14) goto L_0x06ca
            t.g r0 = r12.i
            t.g r1 = r15.i
            int r2 = r12.d()
            int r2 = -r2
            r3 = 5
            r10.d(r0, r1, r2, r3)
        L_0x06ca:
            if (r22 != 0) goto L_0x06ce
            if (r21 == 0) goto L_0x072a
        L_0x06ce:
            if (r11 == 0) goto L_0x072a
            if (r11 == r14) goto L_0x072a
            v.d[] r0 = r11.R
            r1 = r0[r16]
            if (r14 != 0) goto L_0x06da
            r9 = r11
            goto L_0x06db
        L_0x06da:
            r9 = r14
        L_0x06db:
            v.d[] r2 = r9.R
            int r3 = r16 + 1
            r2 = r2[r3]
            v.d r4 = r1.f12047f
            if (r4 == 0) goto L_0x06e8
            t.g r4 = r4.i
            goto L_0x06ea
        L_0x06e8:
            r4 = r17
        L_0x06ea:
            v.d r5 = r2.f12047f
            if (r5 == 0) goto L_0x06f1
            t.g r5 = r5.i
            goto L_0x06f3
        L_0x06f1:
            r5 = r17
        L_0x06f3:
            if (r13 == r9) goto L_0x0704
            v.d[] r5 = r13.R
            r5 = r5[r3]
            v.d r5 = r5.f12047f
            if (r5 == 0) goto L_0x0701
            t.g r5 = r5.i
            r17 = r5
        L_0x0701:
            r6 = r17
            goto L_0x0705
        L_0x0704:
            r6 = r5
        L_0x0705:
            if (r11 != r9) goto L_0x070b
            r1 = r0[r16]
            r2 = r0[r3]
        L_0x070b:
            if (r4 == 0) goto L_0x072a
            if (r6 == 0) goto L_0x072a
            r5 = 1056964608(0x3f000000, float:0.5)
            int r0 = r1.d()
            v.d[] r7 = r9.R
            r3 = r7[r3]
            int r8 = r3.d()
            t.g r3 = r1.i
            t.g r7 = r2.i
            r9 = 5
            r1 = r36
            r2 = r3
            r3 = r4
            r4 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x072a:
            int r9 = r25 + 1
            r12 = 2
            r0 = r35
            r11 = r37
            r15 = r27
            r14 = r29
            goto L_0x001b
        L_0x0737:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.b.a(v.f, t.d, java.util.ArrayList, int):void");
    }
}
