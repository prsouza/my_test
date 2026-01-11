package y2;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import z2.c;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f13390a = c.a.a("ty", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v2, types: [v2.b] */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v37 */
    /* JADX WARNING: type inference failed for: r17v9, types: [v2.a] */
    /* JADX WARNING: type inference failed for: r15v2, types: [v2.m] */
    /* JADX WARNING: type inference failed for: r18v24, types: [v2.d] */
    /* JADX WARNING: type inference failed for: r18v25, types: [v2.e] */
    /* JADX WARNING: type inference failed for: r17v10, types: [v2.j] */
    /* JADX WARNING: type inference failed for: r17v11, types: [v2.k] */
    /* JADX WARNING: type inference failed for: r17v12, types: [v2.i] */
    /* JADX WARNING: type inference failed for: r18v26, types: [v2.p] */
    /* JADX WARNING: type inference failed for: r17v13, types: [v2.q] */
    /* JADX WARNING: type inference failed for: r6v38 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static v2.b a(z2.c r32, o2.f r33) throws java.io.IOException {
        /*
            r0 = r32
            r1 = r33
            r32.c()
            r2 = 2
            r3 = r2
        L_0x0009:
            boolean r4 = r32.s()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x002c
            z2.c$a r4 = f13390a
            int r4 = r0.S(r4)
            if (r4 == 0) goto L_0x0027
            if (r4 == r5) goto L_0x0022
            r32.T()
            r32.a0()
            goto L_0x0009
        L_0x0022:
            int r3 = r32.y()
            goto L_0x0009
        L_0x0027:
            java.lang.String r4 = r32.E()
            goto L_0x002d
        L_0x002c:
            r4 = r6
        L_0x002d:
            if (r4 != 0) goto L_0x0030
            return r6
        L_0x0030:
            int r7 = r4.hashCode()
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 0
            switch(r7) {
                case 3239: goto L_0x00d2;
                case 3270: goto L_0x00c7;
                case 3295: goto L_0x00bc;
                case 3307: goto L_0x00b1;
                case 3308: goto L_0x00a6;
                case 3488: goto L_0x009b;
                case 3633: goto L_0x0090;
                case 3646: goto L_0x0083;
                case 3669: goto L_0x0075;
                case 3679: goto L_0x0067;
                case 3681: goto L_0x0059;
                case 3705: goto L_0x004b;
                case 3710: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x00dd
        L_0x003d:
            java.lang.String r7 = "tr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0047
            goto L_0x00dd
        L_0x0047:
            r7 = 12
            goto L_0x00de
        L_0x004b:
            java.lang.String r7 = "tm"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0055
            goto L_0x00dd
        L_0x0055:
            r7 = 11
            goto L_0x00de
        L_0x0059:
            java.lang.String r7 = "st"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0063
            goto L_0x00dd
        L_0x0063:
            r7 = 10
            goto L_0x00de
        L_0x0067:
            java.lang.String r7 = "sr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0071
            goto L_0x00dd
        L_0x0071:
            r7 = 9
            goto L_0x00de
        L_0x0075:
            java.lang.String r7 = "sh"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x007f
            goto L_0x00dd
        L_0x007f:
            r7 = 8
            goto L_0x00de
        L_0x0083:
            java.lang.String r7 = "rp"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x008d
            goto L_0x00dd
        L_0x008d:
            r7 = 7
            goto L_0x00de
        L_0x0090:
            java.lang.String r7 = "rc"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0099
            goto L_0x00dd
        L_0x0099:
            r7 = 6
            goto L_0x00de
        L_0x009b:
            java.lang.String r7 = "mm"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00a4
            goto L_0x00dd
        L_0x00a4:
            r7 = r8
            goto L_0x00de
        L_0x00a6:
            java.lang.String r7 = "gs"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00af
            goto L_0x00dd
        L_0x00af:
            r7 = r9
            goto L_0x00de
        L_0x00b1:
            java.lang.String r7 = "gr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00ba
            goto L_0x00dd
        L_0x00ba:
            r7 = r10
            goto L_0x00de
        L_0x00bc:
            java.lang.String r7 = "gf"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00c5
            goto L_0x00dd
        L_0x00c5:
            r7 = r2
            goto L_0x00de
        L_0x00c7:
            java.lang.String r7 = "fl"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00d0
            goto L_0x00dd
        L_0x00d0:
            r7 = r5
            goto L_0x00de
        L_0x00d2:
            java.lang.String r7 = "el"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r7 = r11
            goto L_0x00de
        L_0x00dd:
            r7 = -1
        L_0x00de:
            r13 = 0
            r14 = 100
            java.lang.String r15 = "d"
            java.lang.String r6 = "g"
            java.lang.String r12 = "o"
            switch(r7) {
                case 0: goto L_0x068a;
                case 1: goto L_0x061b;
                case 2: goto L_0x0566;
                case 3: goto L_0x051f;
                case 4: goto L_0x03de;
                case 5: goto L_0x03a1;
                case 6: goto L_0x0359;
                case 7: goto L_0x0311;
                case 8: goto L_0x02ce;
                case 9: goto L_0x0263;
                case 10: goto L_0x015c;
                case 11: goto L_0x0107;
                case 12: goto L_0x0101;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown shape type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            a3.c.b(r1)
            r6 = 0
            goto L_0x06df
        L_0x0101:
            u2.l r6 = y2.c.a(r32, r33)
            goto L_0x06df
        L_0x0107:
            z2.c$a r3 = y2.g0.f13391a
            r23 = r11
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0115:
            boolean r3 = r32.s()
            if (r3 == 0) goto L_0x0153
            z2.c$a r3 = y2.g0.f13391a
            int r3 = r0.S(r3)
            if (r3 == 0) goto L_0x014e
            if (r3 == r5) goto L_0x0149
            if (r3 == r2) goto L_0x0144
            if (r3 == r10) goto L_0x013f
            if (r3 == r9) goto L_0x0136
            if (r3 == r8) goto L_0x0131
            r32.a0()
            goto L_0x0115
        L_0x0131:
            boolean r23 = r32.t()
            goto L_0x0115
        L_0x0136:
            int r3 = r32.y()
            v2.q$a r19 = v2.q.a.forId(r3)
            goto L_0x0115
        L_0x013f:
            java.lang.String r18 = r32.E()
            goto L_0x0115
        L_0x0144:
            u2.b r22 = y2.d.c(r0, r1, r11)
            goto L_0x0115
        L_0x0149:
            u2.b r21 = y2.d.c(r0, r1, r11)
            goto L_0x0115
        L_0x014e:
            u2.b r20 = y2.d.c(r0, r1, r11)
            goto L_0x0115
        L_0x0153:
            v2.q r6 = new v2.q
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x06df
        L_0x015c:
            z2.c$a r3 = y2.f0.f13388a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r28 = r11
            r27 = r13
            r4 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x0174:
            boolean r7 = r32.s()
            if (r7 == 0) goto L_0x023f
            z2.c$a r7 = y2.f0.f13388a
            int r7 = r0.S(r7)
            switch(r7) {
                case 0: goto L_0x0239;
                case 1: goto L_0x0233;
                case 2: goto L_0x022d;
                case 3: goto L_0x0227;
                case 4: goto L_0x021a;
                case 5: goto L_0x020d;
                case 6: goto L_0x0204;
                case 7: goto L_0x01fe;
                case 8: goto L_0x0187;
                default: goto L_0x0183;
            }
        L_0x0183:
            r32.a0()
            goto L_0x0174
        L_0x0187:
            r32.a()
        L_0x018a:
            boolean r7 = r32.s()
            if (r7 == 0) goto L_0x01ec
            r32.c()
            r7 = 0
            r8 = 0
        L_0x0195:
            boolean r9 = r32.s()
            if (r9 == 0) goto L_0x01b6
            z2.c$a r9 = y2.f0.f13389b
            int r9 = r0.S(r9)
            if (r9 == 0) goto L_0x01b1
            if (r9 == r5) goto L_0x01ac
            r32.T()
            r32.a0()
            goto L_0x0195
        L_0x01ac:
            u2.b r7 = y2.d.c(r0, r1, r5)
            goto L_0x0195
        L_0x01b1:
            java.lang.String r8 = r32.E()
            goto L_0x0195
        L_0x01b6:
            r32.f()
            java.util.Objects.requireNonNull(r8)
            int r9 = r8.hashCode()
            switch(r9) {
                case 100: goto L_0x01d7;
                case 103: goto L_0x01ce;
                case 111: goto L_0x01c5;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            r8 = -1
            goto L_0x01df
        L_0x01c5:
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01cc
            goto L_0x01c3
        L_0x01cc:
            r8 = r2
            goto L_0x01df
        L_0x01ce:
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x01d5
            goto L_0x01c3
        L_0x01d5:
            r8 = r5
            goto L_0x01df
        L_0x01d7:
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x01de
            goto L_0x01c3
        L_0x01de:
            r8 = r11
        L_0x01df:
            switch(r8) {
                case 0: goto L_0x01e6;
                case 1: goto L_0x01e6;
                case 2: goto L_0x01e3;
                default: goto L_0x01e2;
            }
        L_0x01e2:
            goto L_0x018a
        L_0x01e3:
            r20 = r7
            goto L_0x018a
        L_0x01e6:
            r1.f9208n = r5
            r3.add(r7)
            goto L_0x018a
        L_0x01ec:
            r32.e()
            int r7 = r3.size()
            if (r7 != r5) goto L_0x0174
            java.lang.Object r7 = r3.get(r11)
            r3.add(r7)
            goto L_0x0174
        L_0x01fe:
            boolean r28 = r32.t()
            goto L_0x0174
        L_0x0204:
            double r7 = r32.w()
            float r7 = (float) r7
            r27 = r7
            goto L_0x0174
        L_0x020d:
            v2.p$c[] r7 = v2.p.c.values()
            int r8 = r32.y()
            int r8 = r8 - r5
            r26 = r7[r8]
            goto L_0x0174
        L_0x021a:
            v2.p$b[] r7 = v2.p.b.values()
            int r8 = r32.y()
            int r8 = r8 - r5
            r25 = r7[r8]
            goto L_0x0174
        L_0x0227:
            u2.d r4 = y2.d.d(r32, r33)
            goto L_0x0174
        L_0x022d:
            u2.b r24 = y2.d.c(r0, r1, r5)
            goto L_0x0174
        L_0x0233:
            u2.a r22 = y2.d.b(r32, r33)
            goto L_0x0174
        L_0x0239:
            java.lang.String r19 = r32.E()
            goto L_0x0174
        L_0x023f:
            if (r4 != 0) goto L_0x0256
            u2.d r1 = new u2.d
            b3.a r2 = new b3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r2.<init>(r4)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r2)
            r23 = r1
            goto L_0x0258
        L_0x0256:
            r23 = r4
        L_0x0258:
            v2.p r6 = new v2.p
            r18 = r6
            r21 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x06df
        L_0x0263:
            z2.c$a r2 = y2.x.f13422a
            r27 = r11
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x0279:
            boolean r2 = r32.s()
            if (r2 == 0) goto L_0x02c5
            z2.c$a r2 = y2.x.f13422a
            int r2 = r0.S(r2)
            switch(r2) {
                case 0: goto L_0x02c0;
                case 1: goto L_0x02b7;
                case 2: goto L_0x02b2;
                case 3: goto L_0x02ad;
                case 4: goto L_0x02a8;
                case 5: goto L_0x02a3;
                case 6: goto L_0x029e;
                case 7: goto L_0x0299;
                case 8: goto L_0x0294;
                case 9: goto L_0x028f;
                default: goto L_0x0288;
            }
        L_0x0288:
            r32.T()
            r32.a0()
            goto L_0x0279
        L_0x028f:
            boolean r27 = r32.t()
            goto L_0x0279
        L_0x0294:
            u2.b r25 = y2.d.c(r0, r1, r11)
            goto L_0x0279
        L_0x0299:
            u2.b r23 = y2.d.c(r0, r1, r5)
            goto L_0x0279
        L_0x029e:
            u2.b r26 = y2.d.c(r0, r1, r11)
            goto L_0x0279
        L_0x02a3:
            u2.b r24 = y2.d.c(r0, r1, r5)
            goto L_0x0279
        L_0x02a8:
            u2.b r22 = y2.d.c(r0, r1, r11)
            goto L_0x0279
        L_0x02ad:
            u2.m r21 = y2.a.b(r32, r33)
            goto L_0x0279
        L_0x02b2:
            u2.b r20 = y2.d.c(r0, r1, r11)
            goto L_0x0279
        L_0x02b7:
            int r2 = r32.y()
            v2.i$a r19 = v2.i.a.forValue(r2)
            goto L_0x0279
        L_0x02c0:
            java.lang.String r18 = r32.E()
            goto L_0x0279
        L_0x02c5:
            v2.i r6 = new v2.i
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x06df
        L_0x02ce:
            z2.c$a r3 = y2.e0.f13386a
            r4 = r11
            r3 = 0
            r6 = 0
        L_0x02d3:
            boolean r7 = r32.s()
            if (r7 == 0) goto L_0x030a
            z2.c$a r7 = y2.e0.f13386a
            int r7 = r0.S(r7)
            if (r7 == 0) goto L_0x0305
            if (r7 == r5) goto L_0x0300
            if (r7 == r2) goto L_0x02f0
            if (r7 == r10) goto L_0x02eb
            r32.a0()
            goto L_0x02d3
        L_0x02eb:
            boolean r4 = r32.t()
            goto L_0x02d3
        L_0x02f0:
            u2.h r3 = new u2.h
            float r7 = a3.g.c()
            y2.b0 r8 = y2.b0.f13379a
            java.util.List r7 = y2.r.a(r0, r1, r7, r8)
            r3.<init>(r7)
            goto L_0x02d3
        L_0x0300:
            int r11 = r32.y()
            goto L_0x02d3
        L_0x0305:
            java.lang.String r6 = r32.E()
            goto L_0x02d3
        L_0x030a:
            v2.o r1 = new v2.o
            r1.<init>(r6, r11, r3, r4)
            goto L_0x0563
        L_0x0311:
            z2.c$a r3 = y2.z.f13424a
            r22 = r11
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x031d:
            boolean r3 = r32.s()
            if (r3 == 0) goto L_0x0350
            z2.c$a r3 = y2.z.f13424a
            int r3 = r0.S(r3)
            if (r3 == 0) goto L_0x034b
            if (r3 == r5) goto L_0x0346
            if (r3 == r2) goto L_0x0341
            if (r3 == r10) goto L_0x033c
            if (r3 == r9) goto L_0x0337
            r32.a0()
            goto L_0x031d
        L_0x0337:
            boolean r22 = r32.t()
            goto L_0x031d
        L_0x033c:
            u2.l r21 = y2.c.a(r32, r33)
            goto L_0x031d
        L_0x0341:
            u2.b r20 = y2.d.c(r0, r1, r11)
            goto L_0x031d
        L_0x0346:
            u2.b r19 = y2.d.c(r0, r1, r11)
            goto L_0x031d
        L_0x034b:
            java.lang.String r18 = r32.E()
            goto L_0x031d
        L_0x0350:
            v2.k r6 = new v2.k
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x06df
        L_0x0359:
            z2.c$a r3 = y2.y.f13423a
            r22 = r11
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0365:
            boolean r3 = r32.s()
            if (r3 == 0) goto L_0x0398
            z2.c$a r3 = y2.y.f13423a
            int r3 = r0.S(r3)
            if (r3 == 0) goto L_0x0393
            if (r3 == r5) goto L_0x038e
            if (r3 == r2) goto L_0x0389
            if (r3 == r10) goto L_0x0384
            if (r3 == r9) goto L_0x037f
            r32.a0()
            goto L_0x0365
        L_0x037f:
            boolean r22 = r32.t()
            goto L_0x0365
        L_0x0384:
            u2.b r21 = y2.d.c(r0, r1, r5)
            goto L_0x0365
        L_0x0389:
            u2.f r20 = y2.d.e(r32, r33)
            goto L_0x0365
        L_0x038e:
            u2.m r19 = y2.a.b(r32, r33)
            goto L_0x0365
        L_0x0393:
            java.lang.String r18 = r32.E()
            goto L_0x0365
        L_0x0398:
            v2.j r6 = new v2.j
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x06df
        L_0x03a1:
            z2.c$a r3 = y2.u.f13419a
            r3 = 0
            r6 = 0
        L_0x03a5:
            boolean r4 = r32.s()
            if (r4 == 0) goto L_0x03d1
            z2.c$a r4 = y2.u.f13419a
            int r4 = r0.S(r4)
            if (r4 == 0) goto L_0x03cc
            if (r4 == r5) goto L_0x03c3
            if (r4 == r2) goto L_0x03be
            r32.T()
            r32.a0()
            goto L_0x03a5
        L_0x03be:
            boolean r11 = r32.t()
            goto L_0x03a5
        L_0x03c3:
            int r3 = r32.y()
            v2.h$a r3 = v2.h.a.forId(r3)
            goto L_0x03a5
        L_0x03cc:
            java.lang.String r6 = r32.E()
            goto L_0x03a5
        L_0x03d1:
            v2.h r2 = new v2.h
            r2.<init>(r6, r3, r11)
            java.lang.String r3 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r1.a(r3)
            r6 = r2
            goto L_0x06df
        L_0x03de:
            z2.c$a r2 = y2.n.f13401a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r31 = r11
            r28 = r13
            r3 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 0
        L_0x03fc:
            boolean r4 = r32.s()
            if (r4 == 0) goto L_0x04fb
            z2.c$a r4 = y2.n.f13401a
            int r4 = r0.S(r4)
            switch(r4) {
                case 0: goto L_0x04f5;
                case 1: goto L_0x04bf;
                case 2: goto L_0x04b9;
                case 3: goto L_0x04aa;
                case 4: goto L_0x04a4;
                case 5: goto L_0x049e;
                case 6: goto L_0x0498;
                case 7: goto L_0x048b;
                case 8: goto L_0x047e;
                case 9: goto L_0x0475;
                case 10: goto L_0x0470;
                case 11: goto L_0x0412;
                default: goto L_0x040b;
            }
        L_0x040b:
            r32.T()
            r32.a0()
            goto L_0x03fc
        L_0x0412:
            r32.a()
        L_0x0415:
            boolean r4 = r32.s()
            if (r4 == 0) goto L_0x045f
            r32.c()
            r4 = 0
            r7 = 0
        L_0x0420:
            boolean r8 = r32.s()
            if (r8 == 0) goto L_0x0441
            z2.c$a r8 = y2.n.f13403c
            int r8 = r0.S(r8)
            if (r8 == 0) goto L_0x043c
            if (r8 == r5) goto L_0x0437
            r32.T()
            r32.a0()
            goto L_0x0420
        L_0x0437:
            u2.b r4 = y2.d.c(r0, r1, r5)
            goto L_0x0420
        L_0x043c:
            java.lang.String r7 = r32.E()
            goto L_0x0420
        L_0x0441:
            r32.f()
            boolean r8 = r7.equals(r12)
            if (r8 == 0) goto L_0x044d
            r30 = r4
            goto L_0x0415
        L_0x044d:
            boolean r8 = r7.equals(r15)
            if (r8 != 0) goto L_0x0459
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0415
        L_0x0459:
            r1.f9208n = r5
            r2.add(r4)
            goto L_0x0415
        L_0x045f:
            r32.e()
            int r4 = r2.size()
            if (r4 != r5) goto L_0x03fc
            java.lang.Object r4 = r2.get(r11)
            r2.add(r4)
            goto L_0x03fc
        L_0x0470:
            boolean r31 = r32.t()
            goto L_0x03fc
        L_0x0475:
            double r7 = r32.w()
            float r4 = (float) r7
            r28 = r4
            goto L_0x03fc
        L_0x047e:
            v2.p$c[] r4 = v2.p.c.values()
            int r7 = r32.y()
            int r7 = r7 - r5
            r27 = r4[r7]
            goto L_0x03fc
        L_0x048b:
            v2.p$b[] r4 = v2.p.b.values()
            int r7 = r32.y()
            int r7 = r7 - r5
            r26 = r4[r7]
            goto L_0x03fc
        L_0x0498:
            u2.b r25 = y2.d.c(r0, r1, r5)
            goto L_0x03fc
        L_0x049e:
            u2.f r24 = y2.d.e(r32, r33)
            goto L_0x03fc
        L_0x04a4:
            u2.f r23 = y2.d.e(r32, r33)
            goto L_0x03fc
        L_0x04aa:
            int r4 = r32.y()
            if (r4 != r5) goto L_0x04b3
            v2.f r4 = v2.f.LINEAR
            goto L_0x04b5
        L_0x04b3:
            v2.f r4 = v2.f.RADIAL
        L_0x04b5:
            r20 = r4
            goto L_0x03fc
        L_0x04b9:
            u2.d r3 = y2.d.d(r32, r33)
            goto L_0x03fc
        L_0x04bf:
            r32.c()
            r4 = -1
        L_0x04c3:
            boolean r7 = r32.s()
            if (r7 == 0) goto L_0x04f0
            z2.c$a r7 = y2.n.f13402b
            int r7 = r0.S(r7)
            if (r7 == 0) goto L_0x04eb
            if (r7 == r5) goto L_0x04da
            r32.T()
            r32.a0()
            goto L_0x04c3
        L_0x04da:
            u2.c r7 = new u2.c
            y2.l r8 = new y2.l
            r8.<init>(r4)
            java.util.List r8 = y2.d.a(r0, r1, r8)
            r7.<init>(r8)
            r21 = r7
            goto L_0x04c3
        L_0x04eb:
            int r4 = r32.y()
            goto L_0x04c3
        L_0x04f0:
            r32.f()
            goto L_0x03fc
        L_0x04f5:
            java.lang.String r19 = r32.E()
            goto L_0x03fc
        L_0x04fb:
            if (r3 != 0) goto L_0x0512
            u2.d r1 = new u2.d
            b3.a r3 = new b3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r3.<init>(r4)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r1.<init>(r3)
            r22 = r1
            goto L_0x0514
        L_0x0512:
            r22 = r3
        L_0x0514:
            v2.e r6 = new v2.e
            r18 = r6
            r29 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x06df
        L_0x051f:
            z2.c$a r3 = y2.d0.f13384a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = 0
        L_0x0527:
            boolean r4 = r32.s()
            if (r4 == 0) goto L_0x055e
            z2.c$a r4 = y2.d0.f13384a
            int r4 = r0.S(r4)
            if (r4 == 0) goto L_0x0559
            if (r4 == r5) goto L_0x0554
            if (r4 == r2) goto L_0x053d
            r32.a0()
            goto L_0x0527
        L_0x053d:
            r32.a()
        L_0x0540:
            boolean r4 = r32.s()
            if (r4 == 0) goto L_0x0550
            v2.b r4 = a(r32, r33)
            if (r4 == 0) goto L_0x0540
            r3.add(r4)
            goto L_0x0540
        L_0x0550:
            r32.e()
            goto L_0x0527
        L_0x0554:
            boolean r11 = r32.t()
            goto L_0x0527
        L_0x0559:
            java.lang.String r6 = r32.E()
            goto L_0x0527
        L_0x055e:
            v2.n r1 = new v2.n
            r1.<init>(r6, r3, r11)
        L_0x0563:
            r6 = r1
            goto L_0x06df
        L_0x0566:
            z2.c$a r2 = y2.m.f13399a
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
            r21 = r2
            r26 = r11
            r6 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
        L_0x0579:
            boolean r2 = r32.s()
            if (r2 == 0) goto L_0x05f9
            z2.c$a r2 = y2.m.f13399a
            int r2 = r0.S(r2)
            switch(r2) {
                case 0: goto L_0x05f4;
                case 1: goto L_0x05bf;
                case 2: goto L_0x05ba;
                case 3: goto L_0x05ac;
                case 4: goto L_0x05a7;
                case 5: goto L_0x05a2;
                case 6: goto L_0x0594;
                case 7: goto L_0x058f;
                default: goto L_0x0588;
            }
        L_0x0588:
            r32.T()
            r32.a0()
            goto L_0x0579
        L_0x058f:
            boolean r26 = r32.t()
            goto L_0x0579
        L_0x0594:
            int r2 = r32.y()
            if (r2 != r5) goto L_0x059d
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
            goto L_0x059f
        L_0x059d:
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.EVEN_ODD
        L_0x059f:
            r21 = r2
            goto L_0x0579
        L_0x05a2:
            u2.f r25 = y2.d.e(r32, r33)
            goto L_0x0579
        L_0x05a7:
            u2.f r24 = y2.d.e(r32, r33)
            goto L_0x0579
        L_0x05ac:
            int r2 = r32.y()
            if (r2 != r5) goto L_0x05b5
            v2.f r2 = v2.f.LINEAR
            goto L_0x05b7
        L_0x05b5:
            v2.f r2 = v2.f.RADIAL
        L_0x05b7:
            r20 = r2
            goto L_0x0579
        L_0x05ba:
            u2.d r6 = y2.d.d(r32, r33)
            goto L_0x0579
        L_0x05bf:
            r32.c()
            r2 = -1
        L_0x05c3:
            boolean r3 = r32.s()
            if (r3 == 0) goto L_0x05f0
            z2.c$a r3 = y2.m.f13400b
            int r3 = r0.S(r3)
            if (r3 == 0) goto L_0x05eb
            if (r3 == r5) goto L_0x05da
            r32.T()
            r32.a0()
            goto L_0x05c3
        L_0x05da:
            u2.c r3 = new u2.c
            y2.l r4 = new y2.l
            r4.<init>(r2)
            java.util.List r4 = y2.d.a(r0, r1, r4)
            r3.<init>(r4)
            r22 = r3
            goto L_0x05c3
        L_0x05eb:
            int r2 = r32.y()
            goto L_0x05c3
        L_0x05f0:
            r32.f()
            goto L_0x0579
        L_0x05f4:
            java.lang.String r19 = r32.E()
            goto L_0x0579
        L_0x05f9:
            if (r6 != 0) goto L_0x0610
            u2.d r1 = new u2.d
            b3.a r2 = new b3.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r2.<init>(r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r2)
            r23 = r1
            goto L_0x0612
        L_0x0610:
            r23 = r6
        L_0x0612:
            v2.d r6 = new v2.d
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x06df
        L_0x061b:
            z2.c$a r3 = y2.c0.f13383a
            r3 = r5
            r17 = r11
            r21 = r17
            r6 = 0
            r16 = 0
            r19 = 0
        L_0x0627:
            boolean r4 = r32.s()
            if (r4 == 0) goto L_0x0664
            z2.c$a r4 = y2.c0.f13383a
            int r4 = r0.S(r4)
            if (r4 == 0) goto L_0x065f
            if (r4 == r5) goto L_0x065a
            if (r4 == r2) goto L_0x0655
            if (r4 == r10) goto L_0x0650
            if (r4 == r9) goto L_0x064b
            if (r4 == r8) goto L_0x0646
            r32.T()
            r32.a0()
            goto L_0x0627
        L_0x0646:
            boolean r21 = r32.t()
            goto L_0x0627
        L_0x064b:
            int r3 = r32.y()
            goto L_0x0627
        L_0x0650:
            boolean r17 = r32.t()
            goto L_0x0627
        L_0x0655:
            u2.d r6 = y2.d.d(r32, r33)
            goto L_0x0627
        L_0x065a:
            u2.a r19 = y2.d.b(r32, r33)
            goto L_0x0627
        L_0x065f:
            java.lang.String r16 = r32.E()
            goto L_0x0627
        L_0x0664:
            if (r6 != 0) goto L_0x0678
            u2.d r6 = new u2.d
            b3.a r1 = new b3.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r6.<init>(r1)
        L_0x0678:
            r20 = r6
            if (r3 != r5) goto L_0x067f
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.WINDING
            goto L_0x0681
        L_0x067f:
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0681:
            r18 = r1
            v2.m r6 = new v2.m
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21)
            goto L_0x06df
        L_0x068a:
            z2.c$a r4 = y2.e.f13385a
            if (r3 != r10) goto L_0x0690
            r3 = r5
            goto L_0x0691
        L_0x0690:
            r3 = r11
        L_0x0691:
            r21 = r3
            r22 = r11
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x069b:
            boolean r3 = r32.s()
            if (r3 == 0) goto L_0x06d8
            z2.c$a r3 = y2.e.f13385a
            int r3 = r0.S(r3)
            if (r3 == 0) goto L_0x06d3
            if (r3 == r5) goto L_0x06ce
            if (r3 == r2) goto L_0x06c9
            if (r3 == r10) goto L_0x06c4
            if (r3 == r9) goto L_0x06b8
            r32.T()
            r32.a0()
            goto L_0x069b
        L_0x06b8:
            int r3 = r32.y()
            if (r3 != r10) goto L_0x06c1
            r21 = r5
            goto L_0x069b
        L_0x06c1:
            r21 = r11
            goto L_0x069b
        L_0x06c4:
            boolean r22 = r32.t()
            goto L_0x069b
        L_0x06c9:
            u2.f r20 = y2.d.e(r32, r33)
            goto L_0x069b
        L_0x06ce:
            u2.m r19 = y2.a.b(r32, r33)
            goto L_0x069b
        L_0x06d3:
            java.lang.String r18 = r32.E()
            goto L_0x069b
        L_0x06d8:
            v2.a r6 = new v2.a
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x06df:
            boolean r1 = r32.s()
            if (r1 == 0) goto L_0x06e9
            r32.a0()
            goto L_0x06df
        L_0x06e9:
            r32.f()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.g.a(z2.c, o2.f):v2.b");
    }
}
