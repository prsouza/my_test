package f0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f4871a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f4872b;

    /* renamed from: c  reason: collision with root package name */
    public int f4873c;

    public c(Shader shader, ColorStateList colorStateList, int i) {
        this.f4871a = shader;
        this.f4872b = colorStateList;
        this.f4873c = i;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r16v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0164, code lost:
        if (r7.size() <= 0) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0166, code lost:
        r0 = new f0.e((java.util.List<java.lang.Integer>) r7, (java.util.List<java.lang.Float>) r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x016c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016d, code lost:
        if (r0 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0170, code lost:
        if (r19 == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0172, code lost:
        r0 = new f0.e(r5, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0178, code lost:
        r0 = new f0.e(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017e, code lost:
        if (r11 == 1) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0181, code lost:
        if (r11 == 2) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0183, code lost:
        r4 = r0.f4885a;
        r0 = r0.f4886b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0189, code lost:
        if (r6 == 1) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018b, code lost:
        if (r6 == 2) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018d, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0190, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0193, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0195, code lost:
        r11 = new android.graphics.LinearGradient(r12, r26, r25, r23, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a6, code lost:
        r3 = new android.graphics.SweepGradient(r21, r22, r0.f4885a, r0.f4886b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b4, code lost:
        r2 = r21;
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01bb, code lost:
        if (r24 <= 0.0f) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bd, code lost:
        r1 = r0.f4885a;
        r0 = r0.f4886b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c4, code lost:
        if (r6 == 1) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c7, code lost:
        if (r6 == 2) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c9, code lost:
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01cc, code lost:
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01cf, code lost:
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d1, code lost:
        r16 = new android.graphics.RadialGradient(r2, r4, r24, r1, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e9, code lost:
        return new f0.c(r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f1, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f0.c a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r29
            r1 = r31
            android.content.res.XmlResourceParser r2 = r29.getXml(r30)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        L_0x000c:
            int r4 = r2.next()
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L_0x0017
            if (r4 == r6) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r4 != r5) goto L_0x0210
            java.lang.String r4 = r2.getName()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L_0x005d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = f0.b.b(r0, r2, r3, r1)
            f0.c r1 = new f0.c
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x01f2
            int[] r4 = e6.e.f4650w
            android.content.res.TypedArray r4 = f0.k.l(r0, r1, r3, r4)
            r7 = 8
            java.lang.String r8 = "startX"
            r10 = 0
            float r12 = f0.k.e(r4, r2, r8, r7, r10)
            r7 = 9
            java.lang.String r8 = "startY"
            float r13 = f0.k.e(r4, r2, r8, r7, r10)
            r7 = 10
            java.lang.String r8 = "endX"
            float r14 = f0.k.e(r4, r2, r8, r7, r10)
            r7 = 11
            java.lang.String r8 = "endY"
            float r15 = f0.k.e(r4, r2, r8, r7, r10)
            java.lang.String r7 = "centerX"
            r8 = 3
            float r7 = f0.k.e(r4, r2, r7, r8, r10)
            r11 = 4
            java.lang.String r9 = "centerY"
            float r9 = f0.k.e(r4, r2, r9, r11, r10)
            java.lang.String r11 = "type"
            r8 = 0
            int r11 = f0.k.f(r4, r2, r11, r5, r8)
            java.lang.String r5 = "startColor"
            int r5 = f0.k.c(r4, r2, r5, r8)
            java.lang.String r10 = "centerColor"
            boolean r19 = f0.k.k(r2, r10)
            r8 = 7
            int r8 = f0.k.c(r4, r2, r10, r8)
            java.lang.String r10 = "endColor"
            int r10 = f0.k.c(r4, r2, r10, r6)
            r6 = 6
            r21 = r7
            java.lang.String r7 = "tileMode"
            r22 = r9
            r9 = 0
            int r6 = f0.k.f(r4, r2, r7, r6, r9)
            r7 = 5
            java.lang.String r9 = "gradientRadius"
            r23 = r15
            r15 = 0
            float r7 = f0.k.e(r4, r2, r9, r7, r15)
            r4.recycle()
            int r4 = r2.getDepth()
            r9 = 1
            int r4 = r4 + r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r9 = 20
            r15.<init>(r9)
            r24 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r9)
        L_0x00e7:
            int r9 = r2.next()
            r25 = r14
            r14 = 1
            if (r9 == r14) goto L_0x015e
            int r14 = r2.getDepth()
            r26 = r13
            if (r14 >= r4) goto L_0x00fb
            r13 = 3
            if (r9 == r13) goto L_0x0160
        L_0x00fb:
            r13 = 2
            if (r9 == r13) goto L_0x00ff
            goto L_0x0159
        L_0x00ff:
            if (r14 > r4) goto L_0x0159
            java.lang.String r9 = r2.getName()
            java.lang.String r13 = "item"
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x010e
            goto L_0x0159
        L_0x010e:
            int[] r9 = e6.e.f4651x
            android.content.res.TypedArray r9 = f0.k.l(r0, r1, r3, r9)
            r13 = 0
            boolean r14 = r9.hasValue(r13)
            r13 = 1
            boolean r20 = r9.hasValue(r13)
            if (r14 == 0) goto L_0x013e
            if (r20 == 0) goto L_0x013e
            r14 = 0
            int r27 = r9.getColor(r14, r14)
            r14 = 0
            float r28 = r9.getFloat(r13, r14)
            r9.recycle()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r27)
            r7.add(r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r28)
            r15.add(r9)
            goto L_0x0159
        L_0x013e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0159:
            r14 = r25
            r13 = r26
            goto L_0x00e7
        L_0x015e:
            r26 = r13
        L_0x0160:
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x016c
            f0.e r0 = new f0.e
            r0.<init>((java.util.List<java.lang.Integer>) r7, (java.util.List<java.lang.Float>) r15)
            goto L_0x016d
        L_0x016c:
            r0 = 0
        L_0x016d:
            if (r0 == 0) goto L_0x0170
            goto L_0x017d
        L_0x0170:
            if (r19 == 0) goto L_0x0178
            f0.e r0 = new f0.e
            r0.<init>(r5, r8, r10)
            goto L_0x017d
        L_0x0178:
            f0.e r0 = new f0.e
            r0.<init>((int) r5, (int) r10)
        L_0x017d:
            r1 = 1
            if (r11 == r1) goto L_0x01b4
            r2 = 2
            if (r11 == r2) goto L_0x01a6
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            int[] r4 = r0.f4885a
            float[] r0 = r0.f4886b
            if (r6 == r1) goto L_0x0193
            if (r6 == r2) goto L_0x0190
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x0195
        L_0x0190:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x0195
        L_0x0193:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
        L_0x0195:
            r18 = r1
            r11 = r3
            r13 = r26
            r14 = r25
            r15 = r23
            r16 = r4
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x01e2
        L_0x01a6:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            int[] r1 = r0.f4885a
            float[] r0 = r0.f4886b
            r2 = r21
            r4 = r22
            r3.<init>(r2, r4, r1, r0)
            goto L_0x01e2
        L_0x01b4:
            r2 = r21
            r4 = r22
            r1 = 0
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x01ea
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            int[] r1 = r0.f4885a
            float[] r0 = r0.f4886b
            r5 = 1
            if (r6 == r5) goto L_0x01cf
            r5 = 2
            if (r6 == r5) goto L_0x01cc
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x01d1
        L_0x01cc:
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01d1
        L_0x01cf:
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.REPEAT
        L_0x01d1:
            r22 = r5
            r16 = r3
            r17 = r2
            r18 = r4
            r19 = r24
            r20 = r1
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x01e2:
            f0.c r0 = new f0.c
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
        L_0x01ea:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x01f2:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0210:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.a(android.content.res.Resources, int, android.content.res.Resources$Theme):f0.c");
    }

    public final boolean b() {
        return this.f4871a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f4872b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f4871a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f4872b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.c():boolean");
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.f4872b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f4873c) {
                this.f4873c = colorForState;
                return true;
            }
        }
        return false;
    }
}
