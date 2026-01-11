package nh;

import nh.h;
import nh.n;

public final class s {
    public static r a(j jVar, m mVar, h hVar) {
        double d10;
        int i = jVar.f9087a.f9097d;
        byte[][] c10 = w.c(mVar.f9099a);
        r[] rVarArr = new r[c10.length];
        for (int i10 = 0; i10 < c10.length; i10++) {
            rVarArr[i10] = new r(0, c10[i10]);
        }
        h.a aVar = (h.a) ((h.a) new h.a().c(hVar.f9100a)).d(hVar.f9101b);
        aVar.f9081e = hVar.f9079e;
        aVar.f9082f = 0;
        aVar.g = hVar.g;
        n.a b10 = aVar.b(hVar.f9103d);
        while (true) {
            h hVar2 = new h((h.a) b10);
            if (i <= 1) {
                return rVarArr[0];
            }
            int i11 = 0;
            while (true) {
                d10 = (double) (i / 2);
                if (i11 >= ((int) Math.floor(d10))) {
                    break;
                }
                h.a aVar2 = (h.a) ((h.a) new h.a().c(hVar2.f9100a)).d(hVar2.f9101b);
                aVar2.f9081e = hVar2.f9079e;
                aVar2.f9082f = hVar2.f9080f;
                aVar2.g = i11;
                h hVar3 = new h((h.a) aVar2.b(hVar2.f9103d));
                int i12 = i11 * 2;
                rVarArr[i11] = b(jVar, rVarArr[i12], rVarArr[i12 + 1], hVar3);
                i11++;
                hVar2 = hVar3;
            }
            if (i % 2 == 1) {
                rVarArr[(int) Math.floor(d10)] = rVarArr[i - 1];
            }
            i = (int) Math.ceil(((double) i) / 2.0d);
            h.a aVar3 = (h.a) ((h.a) new h.a().c(hVar2.f9100a)).d(hVar2.f9101b);
            aVar3.f9081e = hVar2.f9079e;
            aVar3.f9082f = hVar2.f9080f + 1;
            aVar3.g = hVar2.g;
            b10 = aVar3.b(hVar2.f9103d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x016b A[LOOP:0: B:24:0x0169->B:25:0x016b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x017c A[LOOP:1: B:26:0x017a->B:27:0x017c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static nh.r b(nh.j r11, nh.r r12, nh.r r13, nh.n r14) {
        /*
            java.lang.String r0 = "left == null"
            java.util.Objects.requireNonNull(r12, r0)
            java.lang.String r0 = "right == null"
            java.util.Objects.requireNonNull(r13, r0)
            int r0 = r12.f9124a
            int r1 = r13.f9124a
            if (r0 != r1) goto L_0x01b6
            byte[] r0 = r11.f9090d
            byte[] r0 = xh.a.a(r0)
            boolean r1 = r14 instanceof nh.h
            r2 = 0
            if (r1 == 0) goto L_0x004b
            nh.h r14 = (nh.h) r14
            nh.h$a r1 = new nh.h$a
            r1.<init>()
            int r3 = r14.f9100a
            nh.n$a r1 = r1.c(r3)
            nh.h$a r1 = (nh.h.a) r1
            long r3 = r14.f9101b
            nh.n$a r1 = r1.d(r3)
            nh.h$a r1 = (nh.h.a) r1
            int r3 = r14.f9079e
            r1.f9081e = r3
            int r3 = r14.f9080f
            r1.f9082f = r3
            int r14 = r14.g
            r1.g = r14
            nh.n$a r14 = r1.b(r2)
            nh.h$a r14 = (nh.h.a) r14
            nh.h r1 = new nh.h
            r1.<init>(r14)
        L_0x0049:
            r14 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r14 instanceof nh.g
            if (r1 == 0) goto L_0x007a
            nh.g r14 = (nh.g) r14
            nh.g$a r1 = new nh.g$a
            r1.<init>()
            int r3 = r14.f9100a
            nh.n$a r1 = r1.c(r3)
            nh.g$a r1 = (nh.g.a) r1
            long r3 = r14.f9101b
            nh.n$a r1 = r1.d(r3)
            nh.g$a r1 = (nh.g.a) r1
            int r3 = r14.f9075e
            r1.f9077e = r3
            int r14 = r14.f9076f
            r1.f9078f = r14
            nh.n$a r14 = r1.b(r2)
            nh.g$a r14 = (nh.g.a) r14
            nh.g r1 = new nh.g
            r1.<init>(r14)
            goto L_0x0049
        L_0x007a:
            la.a r1 = r11.f9088b
            byte[] r3 = r14.a()
            byte[] r1 = r1.a(r0, r3)
            boolean r3 = r14 instanceof nh.h
            r4 = 1
            if (r3 == 0) goto L_0x00b9
            nh.h r14 = (nh.h) r14
            nh.h$a r3 = new nh.h$a
            r3.<init>()
            int r5 = r14.f9100a
            nh.n$a r3 = r3.c(r5)
            nh.h$a r3 = (nh.h.a) r3
            long r5 = r14.f9101b
            nh.n$a r3 = r3.d(r5)
            nh.h$a r3 = (nh.h.a) r3
            int r5 = r14.f9079e
            r3.f9081e = r5
            int r5 = r14.f9080f
            r3.f9082f = r5
            int r14 = r14.g
            r3.g = r14
            nh.n$a r14 = r3.b(r4)
            nh.h$a r14 = (nh.h.a) r14
            nh.h r3 = new nh.h
            r3.<init>(r14)
        L_0x00b7:
            r14 = r3
            goto L_0x00e8
        L_0x00b9:
            boolean r3 = r14 instanceof nh.g
            if (r3 == 0) goto L_0x00e8
            nh.g r14 = (nh.g) r14
            nh.g$a r3 = new nh.g$a
            r3.<init>()
            int r5 = r14.f9100a
            nh.n$a r3 = r3.c(r5)
            nh.g$a r3 = (nh.g.a) r3
            long r5 = r14.f9101b
            nh.n$a r3 = r3.d(r5)
            nh.g$a r3 = (nh.g.a) r3
            int r5 = r14.f9075e
            r3.f9077e = r5
            int r14 = r14.f9076f
            r3.f9078f = r14
            nh.n$a r14 = r3.b(r4)
            nh.g$a r14 = (nh.g.a) r14
            nh.g r3 = new nh.g
            r3.<init>(r14)
            goto L_0x00b7
        L_0x00e8:
            la.a r3 = r11.f9088b
            byte[] r5 = r14.a()
            byte[] r3 = r3.a(r0, r5)
            boolean r5 = r14 instanceof nh.h
            r6 = 2
            if (r5 == 0) goto L_0x0127
            nh.h r14 = (nh.h) r14
            nh.h$a r5 = new nh.h$a
            r5.<init>()
            int r7 = r14.f9100a
            nh.n$a r5 = r5.c(r7)
            nh.h$a r5 = (nh.h.a) r5
            long r7 = r14.f9101b
            nh.n$a r5 = r5.d(r7)
            nh.h$a r5 = (nh.h.a) r5
            int r7 = r14.f9079e
            r5.f9081e = r7
            int r7 = r14.f9080f
            r5.f9082f = r7
            int r14 = r14.g
            r5.g = r14
            nh.n$a r14 = r5.b(r6)
            nh.h$a r14 = (nh.h.a) r14
            nh.h r5 = new nh.h
            r5.<init>(r14)
        L_0x0125:
            r14 = r5
            goto L_0x0156
        L_0x0127:
            boolean r5 = r14 instanceof nh.g
            if (r5 == 0) goto L_0x0156
            nh.g r14 = (nh.g) r14
            nh.g$a r5 = new nh.g$a
            r5.<init>()
            int r7 = r14.f9100a
            nh.n$a r5 = r5.c(r7)
            nh.g$a r5 = (nh.g.a) r5
            long r7 = r14.f9101b
            nh.n$a r5 = r5.d(r7)
            nh.g$a r5 = (nh.g.a) r5
            int r7 = r14.f9075e
            r5.f9077e = r7
            int r14 = r14.f9076f
            r5.f9078f = r14
            nh.n$a r14 = r5.b(r6)
            nh.g$a r14 = (nh.g.a) r14
            nh.g r5 = new nh.g
            r5.<init>(r14)
            goto L_0x0125
        L_0x0156:
            la.a r5 = r11.f9088b
            byte[] r14 = r14.a()
            byte[] r14 = r5.a(r0, r14)
            nh.l r0 = r11.f9087a
            int r0 = r0.f9095b
            int r5 = r0 * 2
            byte[] r7 = new byte[r5]
            r8 = r2
        L_0x0169:
            if (r8 >= r0) goto L_0x017a
            byte[] r9 = r12.a()
            byte r9 = r9[r8]
            byte r10 = r3[r8]
            r9 = r9 ^ r10
            byte r9 = (byte) r9
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0169
        L_0x017a:
            if (r2 >= r0) goto L_0x018d
            int r3 = r2 + r0
            byte[] r8 = r13.a()
            byte r8 = r8[r2]
            byte r9 = r14[r2]
            r8 = r8 ^ r9
            byte r8 = (byte) r8
            r7[r3] = r8
            int r2 = r2 + 1
            goto L_0x017a
        L_0x018d:
            la.a r11 = r11.f9088b
            java.util.Objects.requireNonNull(r11)
            int r13 = r1.length
            int r14 = r11.f8155a
            if (r13 != r14) goto L_0x01ae
            int r14 = r14 * r6
            if (r5 != r14) goto L_0x01a6
            byte[] r11 = r11.b(r4, r1, r7)
            nh.r r13 = new nh.r
            int r12 = r12.f9124a
            r13.<init>(r12, r11)
            return r13
        L_0x01a6:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "wrong in length"
            r11.<init>(r12)
            throw r11
        L_0x01ae:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "wrong key length"
            r11.<init>(r12)
            throw r11
        L_0x01b6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "height of both nodes must be equal"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.s.b(nh.j, nh.r, nh.r, nh.n):nh.r");
    }
}
