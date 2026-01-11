package f0;

import android.util.TypedValue;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f4870a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.b.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r34, org.xmlpull.v1.XmlPullParser r35, android.util.AttributeSet r36, android.content.res.Resources.Theme r37) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r34
            r1 = r36
            r2 = r37
            java.lang.String r3 = r35.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x035e
            int r3 = r35.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r35.next()
            if (r9 == r4) goto L_0x034d
            int r10 = r35.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x034d
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x033c
            if (r10 > r3) goto L_0x033c
            java.lang.String r9 = r35.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x033c
        L_0x0042:
            int[] r9 = e6.e.f4647t
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L_0x008f
            java.lang.ThreadLocal<android.util.TypedValue> r10 = f4870a
            java.lang.Object r15 = r10.get()
            android.util.TypedValue r15 = (android.util.TypedValue) r15
            if (r15 != 0) goto L_0x006b
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r10.set(r15)
        L_0x006b:
            r0.getValue(r13, r15, r4)
            int r10 = r15.type
            r15 = 28
            if (r10 < r15) goto L_0x007a
            r15 = 31
            if (r10 > r15) goto L_0x007a
            r10 = r4
            goto L_0x007b
        L_0x007a:
            r10 = r7
        L_0x007b:
            if (r10 != 0) goto L_0x008f
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008a }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008a }
            goto L_0x0093
        L_0x008a:
            int r10 = r9.getColor(r7, r14)
            goto L_0x0093
        L_0x008f:
            int r10 = r9.getColor(r7, r14)
        L_0x0093:
            boolean r13 = r9.hasValue(r4)
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x00a0
            float r11 = r9.getFloat(r4, r14)
            goto L_0x00ac
        L_0x00a0:
            boolean r13 = r9.hasValue(r11)
            if (r13 == 0) goto L_0x00ab
            float r11 = r9.getFloat(r11, r14)
            goto L_0x00ac
        L_0x00ab:
            r11 = r14
        L_0x00ac:
            boolean r13 = j0.a.a()
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 4
            if (r13 == 0) goto L_0x00c0
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x00c0
            float r13 = r9.getFloat(r12, r15)
            goto L_0x00c4
        L_0x00c0:
            float r13 = r9.getFloat(r4, r15)
        L_0x00c4:
            r9.recycle()
            int r9 = r36.getAttributeCount()
            int[] r15 = new int[r9]
            r4 = r7
            r12 = r4
        L_0x00cf:
            if (r4 >= r9) goto L_0x00ff
            int r14 = r1.getAttributeNameResource(r4)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r14 == r7) goto L_0x00f7
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r14 == r7) goto L_0x00f7
            r7 = 2130903090(0x7f030032, float:1.7412988E38)
            if (r14 == r7) goto L_0x00f7
            r7 = 2130903625(0x7f030249, float:1.7414073E38)
            if (r14 == r7) goto L_0x00f7
            int r7 = r12 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r4, r0)
            if (r19 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            int r14 = -r14
        L_0x00f4:
            r15[r12] = r14
            r12 = r7
        L_0x00f7:
            int r4 = r4 + 1
            r0 = r34
            r7 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00cf
        L_0x00ff:
            int[] r0 = android.util.StateSet.trimStateSet(r15, r12)
            r4 = 0
            int r7 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r7 < 0) goto L_0x0110
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x0110
            r7 = 1
            goto L_0x0111
        L_0x0110:
            r7 = 0
        L_0x0111:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0121
            if (r7 != 0) goto L_0x0121
            r32 = r0
            r29 = r3
            r16 = 1
            goto L_0x02f7
        L_0x0121:
            int r12 = android.graphics.Color.alpha(r10)
            float r12 = (float) r12
            float r12 = r12 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r11 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = y.c.s(r11, r14, r12)
            if (r7 == 0) goto L_0x02e9
            f0.a r7 = f0.a.a(r10)
            float r10 = r7.f4864a
            float r7 = r7.f4865b
            f0.l r12 = f0.l.f4901k
            double r14 = (double) r7
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x02de
            int r14 = java.lang.Math.round(r13)
            double r14 = (double) r14
            r19 = 0
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 <= 0) goto L_0x02de
            int r14 = java.lang.Math.round(r13)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x015d
            goto L_0x02de
        L_0x015d:
            int r14 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x0163
            r10 = r4
            goto L_0x0169
        L_0x0163:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L_0x0169:
            r20 = r4
            r15 = r7
            r14 = 0
            r19 = 1
        L_0x016f:
            float r21 = r20 - r7
            float r21 = java.lang.Math.abs(r21)
            r22 = 1053609165(0x3ecccccd, float:0.4)
            int r21 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r21 < 0) goto L_0x02cc
            r21 = 1148846080(0x447a0000, float:1000.0)
            r23 = r4
            r24 = r9
            r22 = r21
            r25 = 0
        L_0x0186:
            float r26 = r23 - r24
            float r26 = java.lang.Math.abs(r26)
            r27 = 1008981770(0x3c23d70a, float:0.01)
            int r26 = (r26 > r27 ? 1 : (r26 == r27 ? 0 : -1))
            r27 = 1073741824(0x40000000, float:2.0)
            if (r26 <= 0) goto L_0x0281
            float r26 = r24 - r23
            float r26 = r26 / r27
            float r4 = r26 + r23
            f0.a r9 = f0.a.b(r4, r15, r10)
            f0.l r1 = f0.l.f4901k
            int r1 = r9.c(r1)
            int r9 = android.graphics.Color.red(r1)
            float r9 = c3.k.u0(r9)
            int r28 = android.graphics.Color.green(r1)
            float r28 = c3.k.u0(r28)
            int r29 = android.graphics.Color.blue(r1)
            float r29 = c3.k.u0(r29)
            float[][] r30 = c3.k.z
            r16 = 1
            r31 = r30[r16]
            r18 = 0
            r31 = r31[r18]
            float r9 = r9 * r31
            r31 = r30[r16]
            r31 = r31[r16]
            float r28 = r28 * r31
            float r28 = r28 + r9
            r9 = r30[r16]
            r17 = 2
            r9 = r9[r17]
            float r29 = r29 * r9
            float r29 = r29 + r28
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r29 / r9
            r26 = 1007753895(0x3c111aa7, float:0.008856452)
            int r26 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r26 > 0) goto L_0x01ee
            r26 = 1147261687(0x4461d2f7, float:903.2963)
            float r2 = r2 * r26
            r26 = r10
            goto L_0x01fc
        L_0x01ee:
            r26 = r10
            double r9 = (double) r2
            double r9 = java.lang.Math.cbrt(r9)
            float r2 = (float) r9
            r9 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r9
            r9 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 - r9
        L_0x01fc:
            float r9 = r13 - r2
            float r9 = java.lang.Math.abs(r9)
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0257
            f0.a r1 = f0.a.a(r1)
            float r10 = r1.f4866c
            r29 = r3
            float r3 = r1.f4865b
            r30 = r4
            r4 = r26
            f0.a r3 = f0.a.b(r10, r3, r4)
            float r10 = r1.f4867d
            float r4 = r3.f4867d
            float r10 = r10 - r4
            float r4 = r1.f4868e
            r31 = r9
            float r9 = r3.f4868e
            float r4 = r4 - r9
            float r9 = r1.f4869f
            float r3 = r3.f4869f
            float r9 = r9 - r3
            float r10 = r10 * r10
            float r4 = r4 * r4
            float r4 = r4 + r10
            float r9 = r9 * r9
            float r9 = r9 + r4
            double r3 = (double) r9
            double r3 = java.lang.Math.sqrt(r3)
            r9 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r32 = r0
            r33 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r3, r0)
            double r0 = r0 * r9
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x025f
            r22 = r0
            r21 = r31
            r25 = r33
            goto L_0x025f
        L_0x0257:
            r32 = r0
            r29 = r3
            r30 = r4
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x025f:
            r0 = 0
            int r3 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0269
            int r3 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0269
            goto L_0x028e
        L_0x0269:
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0270
            r23 = r30
            goto L_0x0272
        L_0x0270:
            r24 = r30
        L_0x0272:
            r1 = r36
            r2 = r37
            r4 = r0
            r10 = r26
            r3 = r29
            r0 = r32
            r9 = 1120403456(0x42c80000, float:100.0)
            goto L_0x0186
        L_0x0281:
            r32 = r0
            r29 = r3
            r0 = r4
            r26 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 2
        L_0x028e:
            r2 = r25
            if (r19 == 0) goto L_0x02b0
            if (r2 == 0) goto L_0x0299
            int r10 = r2.c(r12)
            goto L_0x02ef
        L_0x0299:
            float r2 = r7 - r20
            float r2 = r2 / r27
            float r15 = r2 + r20
            r1 = r36
            r2 = r37
            r4 = r0
            r10 = r26
            r3 = r29
            r0 = r32
            r9 = 1120403456(0x42c80000, float:100.0)
            r19 = 0
            goto L_0x016f
        L_0x02b0:
            if (r2 != 0) goto L_0x02b4
            r7 = r15
            goto L_0x02b7
        L_0x02b4:
            r14 = r2
            r20 = r15
        L_0x02b7:
            float r2 = r7 - r20
            float r2 = r2 / r27
            float r15 = r2 + r20
            r1 = r36
            r2 = r37
            r4 = r0
            r10 = r26
            r3 = r29
            r0 = r32
            r9 = 1120403456(0x42c80000, float:100.0)
            goto L_0x016f
        L_0x02cc:
            r32 = r0
            r29 = r3
            r16 = 1
            if (r14 != 0) goto L_0x02d9
            int r10 = c3.k.r0(r13)
            goto L_0x02ef
        L_0x02d9:
            int r10 = r14.c(r12)
            goto L_0x02ef
        L_0x02de:
            r32 = r0
            r29 = r3
            r16 = 1
            int r10 = c3.k.r0(r13)
            goto L_0x02ef
        L_0x02e9:
            r32 = r0
            r29 = r3
            r16 = 1
        L_0x02ef:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02f7:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            if (r0 <= r1) goto L_0x030c
            r1 = 4
            if (r8 > r1) goto L_0x0303
            r1 = r2
            goto L_0x0305
        L_0x0303:
            int r1 = r8 * 2
        L_0x0305:
            int[] r1 = new int[r1]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r3, r8)
            r5 = r1
        L_0x030c:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x032a
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r8 > r3) goto L_0x031d
            goto L_0x031f
        L_0x031d:
            int r2 = r8 * 2
        L_0x031f:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x032a:
            r6[r8] = r32
            int[][] r6 = (int[][]) r6
            r1 = r36
            r2 = r37
            r8 = r0
            r4 = r16
            r3 = r29
            r7 = 0
            r0 = r34
            goto L_0x0020
        L_0x033c:
            r29 = r3
            r16 = r4
            r0 = r34
            r1 = r36
            r2 = r37
            r4 = r16
            r3 = r29
            r7 = 0
            goto L_0x0020
        L_0x034d:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x035e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r35.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.b.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
