package j;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import j.b;
import j.d;
import s.h;

public final class a extends d {
    public b E;
    public f F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: j.a$a  reason: collision with other inner class name */
    public static class C0118a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f6934a;

        public C0118a(Animatable animatable) {
            this.f6934a = animatable;
        }

        public final void c() {
            this.f6934a.start();
        }

        public final void d() {
            this.f6934a.stop();
        }
    }

    public static class b extends d.a {
        public s.d<Long> I;
        public h<Integer> J;

        public b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.I = bVar.I;
                this.J = bVar.J;
                return;
            }
            this.I = new s.d<>();
            this.J = new h<>();
        }

        public static long h(int i, int i10) {
            return ((long) i10) | (((long) i) << 32);
        }

        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        public final int i(int i) {
            if (i < 0) {
                return 0;
            }
            return this.J.c(i, 0).intValue();
        }

        public final Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    public static class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final q1.b f6935a;

        public c(q1.b bVar) {
            this.f6935a = bVar;
        }

        public final void c() {
            this.f6935a.start();
        }

        public final void d() {
            this.f6935a.stop();
        }
    }

    public static class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f6936a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6937b;

        public d(AnimationDrawable animationDrawable, boolean z, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i10 = z ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i10});
            k.a.a(ofInt, true);
            ofInt.setDuration((long) eVar.f6940c);
            ofInt.setInterpolator(eVar);
            this.f6937b = z10;
            this.f6936a = ofInt;
        }

        public final boolean a() {
            return this.f6937b;
        }

        public final void b() {
            this.f6936a.reverse();
        }

        public final void c() {
            this.f6936a.start();
        }

        public final void d() {
            this.f6936a.cancel();
        }
    }

    public static class e implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f6938a;

        /* renamed from: b  reason: collision with root package name */
        public int f6939b;

        /* renamed from: c  reason: collision with root package name */
        public int f6940c;

        public e(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f6939b = numberOfFrames;
            int[] iArr = this.f6938a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f6938a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f6938a;
            int i = 0;
            for (int i10 = 0; i10 < numberOfFrames; i10++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i10) - 1 : i10);
                iArr2[i10] = duration;
                i += duration;
            }
            this.f6940c = i;
        }

        public final float getInterpolation(float f10) {
            int i = (int) ((f10 * ((float) this.f6940c)) + 0.5f);
            int i10 = this.f6939b;
            int[] iArr = this.f6938a;
            int i11 = 0;
            while (i11 < i10 && i >= iArr[i11]) {
                i -= iArr[i11];
                i11++;
            }
            return (((float) i11) / ((float) i10)) + (i11 < i10 ? ((float) i) / ((float) this.f6940c) : 0.0f);
        }
    }

    public static abstract class f {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    static {
        Class<a> cls = a.class;
    }

    public a() {
        this((b) null, (Resources) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0224, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r23.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j.a g(android.content.Context r21, android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r21
            r1 = r22
            r2 = r24
            r3 = r25
            java.lang.String r4 = r23.getName()
            java.lang.String r5 = "animated-selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0250
            j.a r4 = new j.a
            r5 = 0
            r4.<init>(r5, r5)
            int[] r6 = jc.b.f7138a
            android.content.res.TypedArray r6 = f0.k.l(r1, r3, r2, r6)
            r7 = 1
            boolean r8 = r6.getBoolean(r7, r7)
            r4.setVisible(r8, r7)
            j.a$b r8 = r4.E
            int r9 = r8.f6956d
            int r10 = k.b.b(r6)
            r9 = r9 | r10
            r8.f6956d = r9
            boolean r9 = r8.i
            r10 = 2
            boolean r9 = r6.getBoolean(r10, r9)
            r8.i = r9
            boolean r9 = r8.f6962l
            r11 = 3
            boolean r9 = r6.getBoolean(r11, r9)
            r8.f6962l = r9
            int r9 = r8.f6975y
            r12 = 4
            int r9 = r6.getInt(r12, r9)
            r8.f6975y = r9
            r9 = 5
            int r13 = r8.z
            int r9 = r6.getInt(r9, r13)
            r8.z = r9
            boolean r8 = r8.f6973w
            r9 = 0
            boolean r8 = r6.getBoolean(r9, r8)
            r4.setDither(r8)
            j.b$c r8 = r4.f6941a
            r8.f(r1)
            r6.recycle()
            int r6 = r23.getDepth()
            int r6 = r6 + r7
        L_0x006e:
            int r8 = r23.next()
            if (r8 == r7) goto L_0x0248
            int r13 = r23.getDepth()
            if (r13 >= r6) goto L_0x007c
            if (r8 == r11) goto L_0x0248
        L_0x007c:
            if (r8 == r10) goto L_0x007f
            goto L_0x006e
        L_0x007f:
            if (r13 <= r6) goto L_0x0082
            goto L_0x006e
        L_0x0082:
            java.lang.String r8 = r23.getName()
            java.lang.String r13 = "item"
            boolean r8 = r8.equals(r13)
            r13 = -1
            if (r8 == 0) goto L_0x014d
            int[] r8 = jc.b.f7139b
            android.content.res.TypedArray r8 = f0.k.l(r1, r3, r2, r8)
            int r14 = r8.getResourceId(r9, r9)
            int r13 = r8.getResourceId(r7, r13)
            if (r13 <= 0) goto L_0x00a8
            androidx.appcompat.widget.t0 r15 = androidx.appcompat.widget.t0.d()
            android.graphics.drawable.Drawable r13 = r15.f(r0, r13)
            goto L_0x00a9
        L_0x00a8:
            r13 = r5
        L_0x00a9:
            r8.recycle()
            int r8 = r24.getAttributeCount()
            int[] r15 = new int[r8]
            r5 = r9
            r11 = r5
        L_0x00b4:
            if (r5 >= r8) goto L_0x00d8
            int r7 = r2.getAttributeNameResource(r5)
            if (r7 == 0) goto L_0x00d3
            r10 = 16842960(0x10100d0, float:2.369414E-38)
            if (r7 == r10) goto L_0x00d3
            r10 = 16843161(0x1010199, float:2.3694704E-38)
            if (r7 == r10) goto L_0x00d3
            int r10 = r11 + 1
            boolean r16 = r2.getAttributeBooleanValue(r5, r9)
            if (r16 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            int r7 = -r7
        L_0x00d0:
            r15[r11] = r7
            r11 = r10
        L_0x00d3:
            int r5 = r5 + 1
            r7 = 1
            r10 = 2
            goto L_0x00b4
        L_0x00d8:
            int[] r5 = android.util.StateSet.trimStateSet(r15, r11)
            java.lang.String r7 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r13 != 0) goto L_0x0119
        L_0x00e0:
            int r8 = r23.next()
            if (r8 != r12) goto L_0x00e7
            goto L_0x00e0
        L_0x00e7:
            r10 = 2
            if (r8 != r10) goto L_0x0100
            java.lang.String r8 = r23.getName()
            java.lang.String r10 = "vector"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x00fb
            q1.f r13 = q1.f.a(r22, r23, r24, r25)
            goto L_0x0119
        L_0x00fb:
            android.graphics.drawable.Drawable r13 = k.b.a(r22, r23, r24, r25)
            goto L_0x0119
        L_0x0100:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0119:
            if (r13 == 0) goto L_0x0134
            j.a$b r7 = r4.E
            int r8 = r7.a(r13)
            int[][] r10 = r7.H
            r10[r8] = r5
            s.h<java.lang.Integer> r5 = r7.J
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r5.g(r8, r7)
            r5 = 0
            r7 = 1
            r10 = 2
            r11 = 3
            goto L_0x006e
        L_0x0134:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x014d:
            java.lang.String r5 = r23.getName()
            java.lang.String r7 = "transition"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x023e
            int[] r5 = jc.b.f7140c
            android.content.res.TypedArray r5 = f0.k.l(r1, r3, r2, r5)
            r7 = 2
            int r8 = r5.getResourceId(r7, r13)
            r7 = 1
            int r10 = r5.getResourceId(r7, r13)
            int r11 = r5.getResourceId(r9, r13)
            if (r11 <= 0) goto L_0x0178
            androidx.appcompat.widget.t0 r14 = androidx.appcompat.widget.t0.d()
            android.graphics.drawable.Drawable r11 = r14.f(r0, r11)
            goto L_0x0179
        L_0x0178:
            r11 = 0
        L_0x0179:
            r14 = 3
            boolean r15 = r5.getBoolean(r14, r9)
            r5.recycle()
            java.lang.String r5 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r11 != 0) goto L_0x01c8
        L_0x0185:
            int r11 = r23.next()
            if (r11 != r12) goto L_0x018c
            goto L_0x0185
        L_0x018c:
            r7 = 2
            if (r11 != r7) goto L_0x01ad
            java.lang.String r11 = r23.getName()
            java.lang.String r7 = "animated-vector"
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x01a6
            q1.b r11 = new q1.b
            r11.<init>(r0)
            r7 = r23
            r11.inflate(r1, r7, r2, r3)
            goto L_0x01ca
        L_0x01a6:
            r7 = r23
            android.graphics.drawable.Drawable r11 = k.b.a(r22, r23, r24, r25)
            goto L_0x01ca
        L_0x01ad:
            r7 = r23
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c8:
            r7 = r23
        L_0x01ca:
            if (r11 == 0) goto L_0x0225
            if (r8 == r13) goto L_0x020a
            if (r10 == r13) goto L_0x020a
            j.a$b r5 = r4.E
            int r11 = r5.a(r11)
            long r12 = j.a.b.h(r8, r10)
            if (r15 == 0) goto L_0x01e2
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x01e4
        L_0x01e2:
            r16 = 0
        L_0x01e4:
            s.d<java.lang.Long> r9 = r5.I
            r18 = r15
            long r14 = (long) r11
            long r19 = r14 | r16
            java.lang.Long r11 = java.lang.Long.valueOf(r19)
            r9.a(r12, r11)
            if (r18 == 0) goto L_0x0240
            long r8 = j.a.b.h(r10, r8)
            s.d<java.lang.Long> r5 = r5.I
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r10 = r10 | r14
            long r10 = r16 | r10
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r5.a(r8, r10)
            goto L_0x0240
        L_0x020a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0225:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x023e:
            r7 = r23
        L_0x0240:
            r5 = 0
            r7 = 1
            r9 = 0
            r10 = 2
            r11 = 3
            r12 = 4
            goto L_0x006e
        L_0x0248:
            int[] r0 = r4.getState()
            r4.onStateChange(r0)
            return r4
        L_0x0250:
            r7 = r23
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):j.a");
    }

    public final b.c b() {
        return new b(this.E, this, (Resources) null);
    }

    public final void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.E = (b) cVar;
        }
    }

    public final d.a f() {
        return new b(this.E, this, (Resources) null);
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.F;
        if (fVar != null) {
            fVar.d();
            this.F = null;
            d(this.G);
            this.G = -1;
            this.H = -1;
        }
    }

    public final Drawable mutate() {
        if (!this.I) {
            super.mutate();
            this.E.e();
            this.I = true;
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        if (d(r1) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r15) {
        /*
            r14 = this;
            j.a$b r0 = r14.E
            int r1 = r0.g(r15)
            if (r1 < 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            int[] r1 = android.util.StateSet.WILD_CARD
            int r1 = r0.g(r1)
        L_0x000f:
            int r0 = r14.f6947v
            r2 = 1
            r3 = 0
            if (r1 == r0) goto L_0x00ed
            j.a$f r4 = r14.F
            if (r4 == 0) goto L_0x0039
            int r0 = r14.G
            if (r1 != r0) goto L_0x0020
        L_0x001d:
            r0 = r2
            goto L_0x00e4
        L_0x0020:
            int r0 = r14.H
            if (r1 != r0) goto L_0x0034
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0034
            r4.b()
            int r0 = r14.H
            r14.G = r0
            r14.H = r1
            goto L_0x001d
        L_0x0034:
            int r0 = r14.G
            r4.d()
        L_0x0039:
            r4 = 0
            r14.F = r4
            r4 = -1
            r14.H = r4
            r14.G = r4
            j.a$b r4 = r14.E
            int r5 = r4.i(r0)
            int r6 = r4.i(r1)
            if (r6 == 0) goto L_0x00e3
            if (r5 != 0) goto L_0x0051
            goto L_0x00e3
        L_0x0051:
            long r7 = j.a.b.h(r5, r6)
            s.d<java.lang.Long> r9 = r4.I
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r7 = r9.g(r7, r12)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r7 = (int) r7
            if (r7 >= 0) goto L_0x006c
            goto L_0x00e3
        L_0x006c:
            long r8 = j.a.b.h(r5, r6)
            s.d<java.lang.Long> r12 = r4.I
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r8 = r12.g(r8, r13)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            long r8 = r8 & r12
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x008e
            r8 = r2
            goto L_0x008f
        L_0x008e:
            r8 = r3
        L_0x008f:
            r14.d(r7)
            android.graphics.drawable.Drawable r7 = r14.f6943c
            boolean r9 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L_0x00c1
            long r5 = j.a.b.h(r5, r6)
            s.d<java.lang.Long> r4 = r4.I
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.Object r4 = r4.g(r5, r9)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            long r4 = r4 & r9
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x00b8
            r4 = r2
            goto L_0x00b9
        L_0x00b8:
            r4 = r3
        L_0x00b9:
            j.a$d r5 = new j.a$d
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r4, r8)
            goto L_0x00d8
        L_0x00c1:
            boolean r4 = r7 instanceof q1.b
            if (r4 == 0) goto L_0x00cd
            j.a$c r5 = new j.a$c
            q1.b r7 = (q1.b) r7
            r5.<init>(r7)
            goto L_0x00d8
        L_0x00cd:
            boolean r4 = r7 instanceof android.graphics.drawable.Animatable
            if (r4 == 0) goto L_0x00e3
            j.a$a r5 = new j.a$a
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L_0x00d8:
            r5.c()
            r14.F = r5
            r14.H = r0
            r14.G = r1
            goto L_0x001d
        L_0x00e3:
            r0 = r3
        L_0x00e4:
            if (r0 != 0) goto L_0x00ee
            boolean r0 = r14.d(r1)
            if (r0 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r2 = r3
        L_0x00ee:
            android.graphics.drawable.Drawable r0 = r14.f6943c
            if (r0 == 0) goto L_0x00f7
            boolean r15 = r0.setState(r15)
            r2 = r2 | r15
        L_0x00f7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.onStateChange(int[]):boolean");
    }

    public final boolean setVisible(boolean z, boolean z10) {
        boolean visible = super.setVisible(z, z10);
        f fVar = this.F;
        if (fVar != null && (visible || z10)) {
            if (z) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public a(b bVar, Resources resources) {
        this.G = -1;
        this.H = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
