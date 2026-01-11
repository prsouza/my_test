package q1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import g0.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class f extends e {

    /* renamed from: y  reason: collision with root package name */
    public static final PorterDuff.Mode f10124y = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public g f10125b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f10126c;

    /* renamed from: s  reason: collision with root package name */
    public ColorFilter f10127s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10128t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10129u;

    /* renamed from: v  reason: collision with root package name */
    public final float[] f10130v;

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f10131w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f10132x;

    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f10170a;

        /* renamed from: b  reason: collision with root package name */
        public C0196f f10171b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f10172c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f10173d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10174e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f10175f;
        public ColorStateList g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f10176h;
        public int i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f10177j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f10178k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f10179l;

        public g(g gVar) {
            this.f10172c = null;
            this.f10173d = f.f10124y;
            if (gVar != null) {
                this.f10170a = gVar.f10170a;
                C0196f fVar = new C0196f(gVar.f10171b);
                this.f10171b = fVar;
                if (gVar.f10171b.f10161e != null) {
                    fVar.f10161e = new Paint(gVar.f10171b.f10161e);
                }
                if (gVar.f10171b.f10160d != null) {
                    this.f10171b.f10160d = new Paint(gVar.f10171b.f10160d);
                }
                this.f10172c = gVar.f10172c;
                this.f10173d = gVar.f10173d;
                this.f10174e = gVar.f10174e;
            }
        }

        public final boolean a() {
            C0196f fVar = this.f10171b;
            if (fVar.f10168n == null) {
                fVar.f10168n = Boolean.valueOf(fVar.g.a());
            }
            return fVar.f10168n.booleanValue();
        }

        public final void b(int i10, int i11) {
            this.f10175f.eraseColor(0);
            Canvas canvas = new Canvas(this.f10175f);
            C0196f fVar = this.f10171b;
            fVar.a(fVar.g, C0196f.f10156p, canvas, i10, i11);
        }

        public int getChangingConfigurations() {
            return this.f10170a;
        }

        public final Drawable newDrawable() {
            return new f(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public g() {
            this.f10172c = null;
            this.f10173d = f.f10124y;
            this.f10171b = new C0196f();
        }
    }

    public f() {
        this.f10129u = true;
        this.f10130v = new float[9];
        this.f10131w = new Matrix();
        this.f10132x = new Rect();
        this.f10125b = new g();
    }

    public static f a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        f fVar = new f();
        fVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return fVar;
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f10123a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cf, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f10175f.getHeight()) == false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f10123a
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.f10132x
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f10132x
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x0167
            android.graphics.Rect r0 = r10.f10132x
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x0167
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.f10127s
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.f10126c
        L_0x0025:
            android.graphics.Matrix r1 = r10.f10131w
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f10131w
            float[] r2 = r10.f10130v
            r1.getValues(r2)
            float[] r1 = r10.f10130v
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f10130v
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f10130v
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f10130v
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0062
        L_0x0060:
            r1 = r8
            r3 = r1
        L_0x0062:
            android.graphics.Rect r4 = r10.f10132x
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f10132x
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x0167
            if (r3 > 0) goto L_0x0084
            goto L_0x0167
        L_0x0084:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f10132x
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00a1
            int r6 = r10.getLayoutDirection()
            if (r6 != r5) goto L_0x00a1
            r6 = r5
            goto L_0x00a2
        L_0x00a1:
            r6 = r2
        L_0x00a2:
            if (r6 == 0) goto L_0x00b3
            android.graphics.Rect r6 = r10.f10132x
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r7)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r8)
        L_0x00b3:
            android.graphics.Rect r6 = r10.f10132x
            r6.offsetTo(r2, r2)
            q1.f$g r6 = r10.f10125b
            android.graphics.Bitmap r7 = r6.f10175f
            if (r7 == 0) goto L_0x00d1
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00ce
            android.graphics.Bitmap r7 = r6.f10175f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00ce
            r7 = r5
            goto L_0x00cf
        L_0x00ce:
            r7 = r2
        L_0x00cf:
            if (r7 != 0) goto L_0x00db
        L_0x00d1:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f10175f = r7
            r6.f10178k = r5
        L_0x00db:
            boolean r6 = r10.f10129u
            if (r6 != 0) goto L_0x00e5
            q1.f$g r6 = r10.f10125b
            r6.b(r1, r3)
            goto L_0x0129
        L_0x00e5:
            q1.f$g r6 = r10.f10125b
            boolean r7 = r6.f10178k
            if (r7 != 0) goto L_0x0109
            android.content.res.ColorStateList r7 = r6.g
            android.content.res.ColorStateList r8 = r6.f10172c
            if (r7 != r8) goto L_0x0109
            android.graphics.PorterDuff$Mode r7 = r6.f10176h
            android.graphics.PorterDuff$Mode r8 = r6.f10173d
            if (r7 != r8) goto L_0x0109
            boolean r7 = r6.f10177j
            boolean r8 = r6.f10174e
            if (r7 != r8) goto L_0x0109
            int r7 = r6.i
            q1.f$f r6 = r6.f10171b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x0109
            r6 = r5
            goto L_0x010a
        L_0x0109:
            r6 = r2
        L_0x010a:
            if (r6 != 0) goto L_0x0129
            q1.f$g r6 = r10.f10125b
            r6.b(r1, r3)
            q1.f$g r1 = r10.f10125b
            android.content.res.ColorStateList r3 = r1.f10172c
            r1.g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f10173d
            r1.f10176h = r3
            q1.f$f r3 = r1.f10171b
            int r3 = r3.getRootAlpha()
            r1.i = r3
            boolean r3 = r1.f10174e
            r1.f10177j = r3
            r1.f10178k = r2
        L_0x0129:
            q1.f$g r1 = r10.f10125b
            android.graphics.Rect r3 = r10.f10132x
            q1.f$f r6 = r1.f10171b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x0138
            r2 = r5
        L_0x0138:
            r6 = 0
            if (r2 != 0) goto L_0x013f
            if (r0 != 0) goto L_0x013f
            r0 = r6
            goto L_0x015f
        L_0x013f:
            android.graphics.Paint r2 = r1.f10179l
            if (r2 != 0) goto L_0x014d
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f10179l = r2
            r2.setFilterBitmap(r5)
        L_0x014d:
            android.graphics.Paint r2 = r1.f10179l
            q1.f$f r5 = r1.f10171b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f10179l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f10179l
        L_0x015f:
            android.graphics.Bitmap r1 = r1.f10175f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.f.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f10125b.f10171b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f10125b.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f10127s;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f10123a != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f10123a.getConstantState());
        }
        this.f10125b.f10170a = getChangingConfigurations();
        return this.f10125b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f10125b.f10171b.i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f10125b.f10171b.f10163h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f10125b.f10174e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f10125b.f10172c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f10125b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10123a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            q1.f$g r0 = r1.f10125b
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0028
            q1.f$g r0 = r1.f10125b
            android.content.res.ColorStateList r0 = r0.f10172c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.f.isStateful():boolean");
    }

    public final Drawable mutate() {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f10128t && super.mutate() == this) {
            this.f10125b = new g(this.f10125b);
            this.f10128t = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        g gVar = this.f10125b;
        ColorStateList colorStateList = gVar.f10172c;
        if (!(colorStateList == null || (mode = gVar.f10173d) == null)) {
            this.f10126c = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (gVar.a()) {
            boolean b10 = gVar.f10171b.g.b(iArr);
            gVar.f10178k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f10125b.f10171b.getRootAlpha() != i) {
            this.f10125b.f10171b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f10125b.f10174e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f10127s = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        g gVar = this.f10125b;
        if (gVar.f10172c != colorStateList) {
            gVar.f10172c = colorStateList;
            this.f10126c = b(colorStateList, gVar.f10173d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        g gVar = this.f10125b;
        if (gVar.f10173d != mode) {
            gVar.f10173d = mode;
            this.f10126c = b(gVar.f10172c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z10) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            return drawable.setVisible(z, z10);
        }
        return super.setVisible(z, z10);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10123a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f10180a;

        public h(Drawable.ConstantState constantState) {
            this.f10180a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f10180a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f10180a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            f fVar = new f();
            fVar.f10123a = (VectorDrawable) this.f10180a.newDrawable();
            return fVar;
        }

        public final Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f10123a = (VectorDrawable) this.f10180a.newDrawable(resources);
            return fVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f10123a = (VectorDrawable) this.f10180a.newDrawable(resources, theme);
            return fVar;
        }
    }

    public static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f10152a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f10153b;

        /* renamed from: c  reason: collision with root package name */
        public int f10154c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f10155d;

        public e() {
        }

        public d.a[] getPathData() {
            return this.f10152a;
        }

        public String getPathName() {
            return this.f10153b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!g0.d.a(this.f10152a, aVarArr)) {
                this.f10152a = g0.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f10152a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].f5208a = aVarArr[i].f5208a;
                for (int i10 = 0; i10 < aVarArr[i].f5209b.length; i10++) {
                    aVarArr2[i].f5209b[i10] = aVarArr[i].f5209b[i10];
                }
            }
        }

        public e(e eVar) {
            this.f10153b = eVar.f10153b;
            this.f10155d = eVar.f10155d;
            this.f10152a = g0.d.e(eVar.f10152a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            android.graphics.drawable.Drawable r0 = r1.f10123a
            if (r0 == 0) goto L_0x0012
            r0.inflate(r2, r3, r4, r5)
            return
        L_0x0012:
            q1.f$g r6 = r1.f10125b
            q1.f$f r0 = new q1.f$f
            r0.<init>()
            r6.f10171b = r0
            int[] r0 = q1.a.f10100a
            android.content.res.TypedArray r7 = f0.k.l(r2, r5, r4, r0)
            q1.f$g r8 = r1.f10125b
            q1.f$f r9 = r8.f10171b
            java.lang.String r0 = "tintMode"
            r10 = 6
            r11 = -1
            int r0 = f0.k.f(r7, r3, r0, r10, r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 9
            r14 = 5
            r15 = 3
            if (r0 == r15) goto L_0x0049
            if (r0 == r14) goto L_0x004b
            if (r0 == r13) goto L_0x0046
            switch(r0) {
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004b
        L_0x003d:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004b
        L_0x0040:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004b
        L_0x0043:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0046:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004b
        L_0x0049:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004b:
            r8.f10173d = r12
            java.lang.String r0 = "tint"
            boolean r0 = f0.k.k(r3, r0)
            r12 = 0
            r10 = 1
            r13 = 2
            if (r0 == 0) goto L_0x00ae
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.getValue(r10, r0)
            int r11 = r0.type
            if (r11 == r13) goto L_0x008f
            r13 = 28
            if (r11 < r13) goto L_0x0073
            r13 = 31
            if (r11 > r13) goto L_0x0073
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00af
        L_0x0073:
            android.content.res.Resources r0 = r7.getResources()
            int r11 = r7.getResourceId(r10, r12)
            java.lang.ThreadLocal<android.util.TypedValue> r13 = f0.b.f4870a
            android.content.res.XmlResourceParser r11 = r0.getXml(r11)     // Catch:{ Exception -> 0x0086 }
            android.content.res.ColorStateList r0 = f0.b.a(r0, r11, r5)     // Catch:{ Exception -> 0x0086 }
            goto L_0x00af
        L_0x0086:
            r0 = move-exception
            java.lang.String r11 = "CSLCompat"
            java.lang.String r13 = "Failed to inflate ColorStateList."
            android.util.Log.e(r11, r13, r0)
            goto L_0x00ae
        L_0x008f:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00ae:
            r0 = 0
        L_0x00af:
            if (r0 == 0) goto L_0x00b3
            r8.f10172c = r0
        L_0x00b3:
            boolean r0 = r8.f10174e
            java.lang.String r11 = "autoMirrored"
            boolean r11 = f0.k.k(r3, r11)
            if (r11 != 0) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            boolean r0 = r7.getBoolean(r14, r0)
        L_0x00c2:
            r8.f10174e = r0
            float r0 = r9.f10164j
            java.lang.String r8 = "viewportWidth"
            r11 = 7
            float r0 = f0.k.e(r7, r3, r8, r11, r0)
            r9.f10164j = r0
            float r0 = r9.f10165k
            java.lang.String r8 = "viewportHeight"
            r13 = 8
            float r0 = f0.k.e(r7, r3, r8, r13, r0)
            r9.f10165k = r0
            float r8 = r9.f10164j
            r18 = 0
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x03da
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x03bf
            float r0 = r9.f10163h
            float r0 = r7.getDimension(r15, r0)
            r9.f10163h = r0
            float r0 = r9.i
            r8 = 2
            float r0 = r7.getDimension(r8, r0)
            r9.i = r0
            float r8 = r9.f10163h
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x03a4
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0389
            float r0 = r9.getAlpha()
            java.lang.String r8 = "alpha"
            r14 = 4
            float r0 = f0.k.e(r7, r3, r8, r14, r0)
            r9.setAlpha(r0)
            java.lang.String r0 = r7.getString(r12)
            if (r0 == 0) goto L_0x011d
            r9.f10167m = r0
            s.a<java.lang.String, java.lang.Object> r8 = r9.f10169o
            r8.put(r0, r9)
        L_0x011d:
            r7.recycle()
            int r0 = r21.getChangingConfigurations()
            r6.f10170a = r0
            r6.f10178k = r10
            q1.f$g r0 = r1.f10125b
            q1.f$f r7 = r0.f10171b
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            q1.f$c r9 = r7.g
            r8.push(r9)
            int r9 = r23.getEventType()
            int r19 = r23.getDepth()
            int r11 = r19 + 1
            r19 = r10
        L_0x0142:
            if (r9 == r10) goto L_0x0374
            int r14 = r23.getDepth()
            if (r14 >= r11) goto L_0x014c
            if (r9 == r15) goto L_0x0374
        L_0x014c:
            java.lang.String r14 = "group"
            r15 = 2
            if (r9 != r15) goto L_0x034f
            java.lang.String r9 = r23.getName()
            java.lang.Object r15 = r8.peek()
            q1.f$c r15 = (q1.f.c) r15
            java.lang.String r13 = "path"
            boolean r13 = r13.equals(r9)
            java.lang.String r10 = "fillType"
            java.lang.String r12 = "pathData"
            if (r13 == 0) goto L_0x0264
            q1.f$b r9 = new q1.f$b
            r9.<init>()
            int[] r13 = q1.a.f10102c
            android.content.res.TypedArray r13 = f0.k.l(r2, r5, r4, r13)
            boolean r12 = f0.k.k(r3, r12)
            if (r12 != 0) goto L_0x017c
            r20 = r11
            goto L_0x023c
        L_0x017c:
            r12 = 0
            java.lang.String r14 = r13.getString(r12)
            if (r14 == 0) goto L_0x0185
            r9.f10153b = r14
        L_0x0185:
            r12 = 2
            java.lang.String r14 = r13.getString(r12)
            if (r14 == 0) goto L_0x0192
            g0.d$a[] r12 = g0.d.c(r14)
            r9.f10152a = r12
        L_0x0192:
            java.lang.String r12 = "fillColor"
            r14 = 1
            f0.c r12 = f0.k.d(r13, r3, r5, r12, r14)
            r9.g = r12
            r12 = 12
            float r14 = r9.i
            r20 = r11
            java.lang.String r11 = "fillAlpha"
            float r11 = f0.k.e(r13, r3, r11, r12, r14)
            r9.i = r11
            java.lang.String r11 = "strokeLineCap"
            r12 = 8
            r14 = -1
            int r11 = f0.k.f(r13, r3, r11, r12, r14)
            android.graphics.Paint$Cap r14 = r9.f10139m
            if (r11 == 0) goto L_0x01c3
            r12 = 1
            if (r11 == r12) goto L_0x01c0
            r12 = 2
            if (r11 == r12) goto L_0x01bd
            goto L_0x01c5
        L_0x01bd:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01c5
        L_0x01c0:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.ROUND
            goto L_0x01c5
        L_0x01c3:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.BUTT
        L_0x01c5:
            r9.f10139m = r14
            java.lang.String r11 = "strokeLineJoin"
            r12 = 9
            r14 = -1
            int r11 = f0.k.f(r13, r3, r11, r12, r14)
            android.graphics.Paint$Join r12 = r9.f10140n
            if (r11 == 0) goto L_0x01e1
            r14 = 1
            if (r11 == r14) goto L_0x01de
            r14 = 2
            if (r11 == r14) goto L_0x01db
            goto L_0x01e3
        L_0x01db:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.BEVEL
            goto L_0x01e3
        L_0x01de:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.ROUND
            goto L_0x01e3
        L_0x01e1:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.MITER
        L_0x01e3:
            r9.f10140n = r12
            r11 = 10
            float r12 = r9.f10141o
            java.lang.String r14 = "strokeMiterLimit"
            float r11 = f0.k.e(r13, r3, r14, r11, r12)
            r9.f10141o = r11
            java.lang.String r11 = "strokeColor"
            r12 = 3
            f0.c r11 = f0.k.d(r13, r3, r5, r11, r12)
            r9.f10133e = r11
            r11 = 11
            float r12 = r9.f10135h
            java.lang.String r14 = "strokeAlpha"
            float r11 = f0.k.e(r13, r3, r14, r11, r12)
            r9.f10135h = r11
            float r11 = r9.f10134f
            java.lang.String r12 = "strokeWidth"
            r14 = 4
            float r11 = f0.k.e(r13, r3, r12, r14, r11)
            r9.f10134f = r11
            float r11 = r9.f10137k
            java.lang.String r12 = "trimPathEnd"
            r14 = 6
            float r11 = f0.k.e(r13, r3, r12, r14, r11)
            r9.f10137k = r11
            float r11 = r9.f10138l
            java.lang.String r12 = "trimPathOffset"
            r14 = 7
            float r11 = f0.k.e(r13, r3, r12, r14, r11)
            r9.f10138l = r11
            float r11 = r9.f10136j
            java.lang.String r12 = "trimPathStart"
            r14 = 5
            float r11 = f0.k.e(r13, r3, r12, r14, r11)
            r9.f10136j = r11
            r11 = 13
            int r12 = r9.f10154c
            int r10 = f0.k.f(r13, r3, r10, r11, r12)
            r9.f10154c = r10
        L_0x023c:
            r13.recycle()
            java.util.ArrayList<q1.f$d> r10 = r15.f10143b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L_0x0253
            s.a<java.lang.String, java.lang.Object> r10 = r7.f10169o
            java.lang.String r11 = r9.getPathName()
            r10.put(r11, r9)
        L_0x0253:
            int r10 = r0.f10170a
            int r9 = r9.f10155d
            r9 = r9 | r10
            r0.f10170a = r9
            r10 = 5
            r11 = 0
            r12 = 3
            r13 = 7
            r16 = -1
            r19 = 0
            goto L_0x0366
        L_0x0264:
            r20 = r11
            r13 = 9
            r16 = -1
            java.lang.String r11 = "clip-path"
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L_0x02c1
            q1.f$a r9 = new q1.f$a
            r9.<init>()
            boolean r11 = f0.k.k(r3, r12)
            if (r11 != 0) goto L_0x027e
            goto L_0x02a4
        L_0x027e:
            int[] r11 = q1.a.f10103d
            android.content.res.TypedArray r11 = f0.k.l(r2, r5, r4, r11)
            r12 = 0
            java.lang.String r14 = r11.getString(r12)
            if (r14 == 0) goto L_0x028d
            r9.f10153b = r14
        L_0x028d:
            r14 = 1
            java.lang.String r17 = r11.getString(r14)
            if (r17 == 0) goto L_0x029a
            g0.d$a[] r14 = g0.d.c(r17)
            r9.f10152a = r14
        L_0x029a:
            r14 = 2
            int r10 = f0.k.f(r11, r3, r10, r14, r12)
            r9.f10154c = r10
            r11.recycle()
        L_0x02a4:
            java.util.ArrayList<q1.f$d> r10 = r15.f10143b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L_0x02b8
            s.a<java.lang.String, java.lang.Object> r10 = r7.f10169o
            java.lang.String r11 = r9.getPathName()
            r10.put(r11, r9)
        L_0x02b8:
            int r10 = r0.f10170a
            int r9 = r9.f10155d
            r9 = r9 | r10
            r0.f10170a = r9
            goto L_0x0349
        L_0x02c1:
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0349
            q1.f$c r9 = new q1.f$c
            r9.<init>()
            int[] r10 = q1.a.f10101b
            android.content.res.TypedArray r10 = f0.k.l(r2, r5, r4, r10)
            float r11 = r9.f10144c
            java.lang.String r12 = "rotation"
            r14 = 5
            float r11 = f0.k.e(r10, r3, r12, r14, r11)
            r9.f10144c = r11
            float r11 = r9.f10145d
            r12 = 1
            float r11 = r10.getFloat(r12, r11)
            r9.f10145d = r11
            float r11 = r9.f10146e
            r12 = 2
            float r11 = r10.getFloat(r12, r11)
            r9.f10146e = r11
            float r11 = r9.f10147f
            java.lang.String r12 = "scaleX"
            r13 = 3
            float r11 = f0.k.e(r10, r3, r12, r13, r11)
            r9.f10147f = r11
            float r11 = r9.g
            java.lang.String r12 = "scaleY"
            r13 = 4
            float r11 = f0.k.e(r10, r3, r12, r13, r11)
            r9.g = r11
            float r11 = r9.f10148h
            java.lang.String r12 = "translateX"
            r13 = 6
            float r11 = f0.k.e(r10, r3, r12, r13, r11)
            r9.f10148h = r11
            float r11 = r9.i
            java.lang.String r12 = "translateY"
            r13 = 7
            float r11 = f0.k.e(r10, r3, r12, r13, r11)
            r9.i = r11
            r11 = 0
            java.lang.String r12 = r10.getString(r11)
            if (r12 == 0) goto L_0x0324
            r9.f10151l = r12
        L_0x0324:
            r9.c()
            r10.recycle()
            java.util.ArrayList<q1.f$d> r10 = r15.f10143b
            r10.add(r9)
            r8.push(r9)
            java.lang.String r10 = r9.getGroupName()
            if (r10 == 0) goto L_0x0341
            s.a<java.lang.String, java.lang.Object> r10 = r7.f10169o
            java.lang.String r12 = r9.getGroupName()
            r10.put(r12, r9)
        L_0x0341:
            int r10 = r0.f10170a
            int r9 = r9.f10150k
            r9 = r9 | r10
            r0.f10170a = r9
            goto L_0x034c
        L_0x0349:
            r11 = 0
            r13 = 7
            r14 = 5
        L_0x034c:
            r10 = r14
            r12 = 3
            goto L_0x0366
        L_0x034f:
            r20 = r11
            r11 = r12
            r10 = 5
            r12 = 3
            r13 = 7
            r16 = -1
            if (r9 != r12) goto L_0x0366
            java.lang.String r9 = r23.getName()
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0366
            r8.pop()
        L_0x0366:
            int r9 = r23.next()
            r15 = r12
            r10 = 1
            r13 = 8
            r14 = 4
            r12 = r11
            r11 = r20
            goto L_0x0142
        L_0x0374:
            if (r19 != 0) goto L_0x0381
            android.content.res.ColorStateList r0 = r6.f10172c
            android.graphics.PorterDuff$Mode r2 = r6.f10173d
            android.graphics.PorterDuffColorFilter r0 = r1.b(r0, r2)
            r1.f10126c = r0
            return
        L_0x0381:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "no path defined"
            r0.<init>(r2)
            throw r0
        L_0x0389:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03a4:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03bf:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03da:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public f(g gVar) {
        this.f10129u = true;
        this.f10130v = new float[9];
        this.f10131w = new Matrix();
        this.f10132x = new Rect();
        this.f10125b = gVar;
        this.f10126c = b(gVar.f10172c, gVar.f10173d);
    }

    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public f0.c f10133e;

        /* renamed from: f  reason: collision with root package name */
        public float f10134f = 0.0f;
        public f0.c g;

        /* renamed from: h  reason: collision with root package name */
        public float f10135h = 1.0f;
        public float i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f10136j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f10137k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f10138l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public Paint.Cap f10139m = Paint.Cap.BUTT;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Join f10140n = Paint.Join.MITER;

        /* renamed from: o  reason: collision with root package name */
        public float f10141o = 4.0f;

        public b() {
        }

        public final boolean a() {
            return this.g.c() || this.f10133e.c();
        }

        public final boolean b(int[] iArr) {
            return this.f10133e.d(iArr) | this.g.d(iArr);
        }

        public float getFillAlpha() {
            return this.i;
        }

        public int getFillColor() {
            return this.g.f4873c;
        }

        public float getStrokeAlpha() {
            return this.f10135h;
        }

        public int getStrokeColor() {
            return this.f10133e.f4873c;
        }

        public float getStrokeWidth() {
            return this.f10134f;
        }

        public float getTrimPathEnd() {
            return this.f10137k;
        }

        public float getTrimPathOffset() {
            return this.f10138l;
        }

        public float getTrimPathStart() {
            return this.f10136j;
        }

        public void setFillAlpha(float f10) {
            this.i = f10;
        }

        public void setFillColor(int i10) {
            this.g.f4873c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f10135h = f10;
        }

        public void setStrokeColor(int i10) {
            this.f10133e.f4873c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f10134f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f10137k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f10138l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f10136j = f10;
        }

        public b(b bVar) {
            super(bVar);
            this.f10133e = bVar.f10133e;
            this.f10134f = bVar.f10134f;
            this.f10135h = bVar.f10135h;
            this.g = bVar.g;
            this.f10154c = bVar.f10154c;
            this.i = bVar.i;
            this.f10136j = bVar.f10136j;
            this.f10137k = bVar.f10137k;
            this.f10138l = bVar.f10138l;
            this.f10139m = bVar.f10139m;
            this.f10140n = bVar.f10140n;
            this.f10141o = bVar.f10141o;
        }
    }

    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f10142a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<d> f10143b;

        /* renamed from: c  reason: collision with root package name */
        public float f10144c;

        /* renamed from: d  reason: collision with root package name */
        public float f10145d;

        /* renamed from: e  reason: collision with root package name */
        public float f10146e;

        /* renamed from: f  reason: collision with root package name */
        public float f10147f;
        public float g;

        /* renamed from: h  reason: collision with root package name */
        public float f10148h;
        public float i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f10149j;

        /* renamed from: k  reason: collision with root package name */
        public int f10150k;

        /* renamed from: l  reason: collision with root package name */
        public String f10151l;

        public c() {
            this.f10142a = new Matrix();
            this.f10143b = new ArrayList<>();
            this.f10144c = 0.0f;
            this.f10145d = 0.0f;
            this.f10146e = 0.0f;
            this.f10147f = 1.0f;
            this.g = 1.0f;
            this.f10148h = 0.0f;
            this.i = 0.0f;
            this.f10149j = new Matrix();
            this.f10151l = null;
        }

        public final boolean a() {
            for (int i10 = 0; i10 < this.f10143b.size(); i10++) {
                if (this.f10143b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(int[] iArr) {
            boolean z = false;
            for (int i10 = 0; i10 < this.f10143b.size(); i10++) {
                z |= this.f10143b.get(i10).b(iArr);
            }
            return z;
        }

        public final void c() {
            this.f10149j.reset();
            this.f10149j.postTranslate(-this.f10145d, -this.f10146e);
            this.f10149j.postScale(this.f10147f, this.g);
            this.f10149j.postRotate(this.f10144c, 0.0f, 0.0f);
            this.f10149j.postTranslate(this.f10148h + this.f10145d, this.i + this.f10146e);
        }

        public String getGroupName() {
            return this.f10151l;
        }

        public Matrix getLocalMatrix() {
            return this.f10149j;
        }

        public float getPivotX() {
            return this.f10145d;
        }

        public float getPivotY() {
            return this.f10146e;
        }

        public float getRotation() {
            return this.f10144c;
        }

        public float getScaleX() {
            return this.f10147f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.f10148h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f10145d) {
                this.f10145d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f10146e) {
                this.f10146e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f10144c) {
                this.f10144c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f10147f) {
                this.f10147f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.g) {
                this.g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f10148h) {
                this.f10148h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.i) {
                this.i = f10;
                c();
            }
        }

        public c(c cVar, s.a<String, Object> aVar) {
            e eVar;
            this.f10142a = new Matrix();
            this.f10143b = new ArrayList<>();
            this.f10144c = 0.0f;
            this.f10145d = 0.0f;
            this.f10146e = 0.0f;
            this.f10147f = 1.0f;
            this.g = 1.0f;
            this.f10148h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.f10149j = matrix;
            this.f10151l = null;
            this.f10144c = cVar.f10144c;
            this.f10145d = cVar.f10145d;
            this.f10146e = cVar.f10146e;
            this.f10147f = cVar.f10147f;
            this.g = cVar.g;
            this.f10148h = cVar.f10148h;
            this.i = cVar.i;
            String str = cVar.f10151l;
            this.f10151l = str;
            this.f10150k = cVar.f10150k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.f10149j);
            ArrayList<d> arrayList = cVar.f10143b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f10143b.add(new c((c) dVar, aVar));
                } else {
                    if (dVar instanceof b) {
                        eVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        eVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f10143b.add(eVar);
                    String str2 = eVar.f10153b;
                    if (str2 != null) {
                        aVar.put(str2, eVar);
                    }
                }
            }
        }
    }

    /* renamed from: q1.f$f  reason: collision with other inner class name */
    public static class C0196f {

        /* renamed from: p  reason: collision with root package name */
        public static final Matrix f10156p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f10157a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f10158b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f10159c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f10160d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f10161e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f10162f;
        public final c g;

        /* renamed from: h  reason: collision with root package name */
        public float f10163h;
        public float i;

        /* renamed from: j  reason: collision with root package name */
        public float f10164j;

        /* renamed from: k  reason: collision with root package name */
        public float f10165k;

        /* renamed from: l  reason: collision with root package name */
        public int f10166l;

        /* renamed from: m  reason: collision with root package name */
        public String f10167m;

        /* renamed from: n  reason: collision with root package name */
        public Boolean f10168n;

        /* renamed from: o  reason: collision with root package name */
        public final s.a<String, Object> f10169o;

        public C0196f() {
            this.f10159c = new Matrix();
            this.f10163h = 0.0f;
            this.i = 0.0f;
            this.f10164j = 0.0f;
            this.f10165k = 0.0f;
            this.f10166l = 255;
            this.f10167m = null;
            this.f10168n = null;
            this.f10169o = new s.a<>();
            this.g = new c();
            this.f10157a = new Path();
            this.f10158b = new Path();
        }

        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r9v2 */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            c cVar2 = cVar;
            Canvas canvas2 = canvas;
            cVar2.f10142a.set(matrix);
            cVar2.f10142a.preConcat(cVar2.f10149j);
            canvas.save();
            ? r92 = 0;
            C0196f fVar = this;
            int i12 = 0;
            while (i12 < cVar2.f10143b.size()) {
                d dVar = cVar2.f10143b.get(i12);
                if (dVar instanceof c) {
                    a((c) dVar, cVar2.f10142a, canvas, i10, i11);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f10 = ((float) i10) / fVar.f10164j;
                    float f11 = ((float) i11) / fVar.f10165k;
                    float min = Math.min(f10, f11);
                    Matrix matrix2 = cVar2.f10142a;
                    fVar.f10159c.set(matrix2);
                    fVar.f10159c.postScale(f10, f11);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f12 = min;
                    float f13 = (fArr[r92] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r92], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f13) / max : 0.0f;
                    if (abs != 0.0f) {
                        Path path = this.f10157a;
                        Objects.requireNonNull(eVar);
                        path.reset();
                        d.a[] aVarArr = eVar.f10152a;
                        if (aVarArr != null) {
                            d.a.b(aVarArr, path);
                        }
                        Path path2 = this.f10157a;
                        this.f10158b.reset();
                        if (eVar instanceof a) {
                            this.f10158b.setFillType(eVar.f10154c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            this.f10158b.addPath(path2, this.f10159c);
                            canvas2.clipPath(this.f10158b);
                        } else {
                            b bVar = (b) eVar;
                            float f14 = bVar.f10136j;
                            if (!(f14 == 0.0f && bVar.f10137k == 1.0f)) {
                                float f15 = bVar.f10138l;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (bVar.f10137k + f15) % 1.0f;
                                if (this.f10162f == null) {
                                    this.f10162f = new PathMeasure();
                                }
                                this.f10162f.setPath(this.f10157a, r92);
                                float length = this.f10162f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path2.reset();
                                if (f18 > f19) {
                                    this.f10162f.getSegment(f18, length, path2, true);
                                    this.f10162f.getSegment(0.0f, f19, path2, true);
                                } else {
                                    this.f10162f.getSegment(f18, f19, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.f10158b.addPath(path2, this.f10159c);
                            f0.c cVar3 = bVar.g;
                            if ((cVar3.b() || cVar3.f4873c != 0) ? true : r92) {
                                f0.c cVar4 = bVar.g;
                                if (this.f10161e == null) {
                                    Paint paint = new Paint(1);
                                    this.f10161e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f10161e;
                                if (cVar4.b()) {
                                    Shader shader = cVar4.f4871a;
                                    shader.setLocalMatrix(this.f10159c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.i * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i13 = cVar4.f4873c;
                                    float f20 = bVar.i;
                                    PorterDuff.Mode mode = f.f10124y;
                                    paint2.setColor((i13 & 16777215) | (((int) (((float) Color.alpha(i13)) * f20)) << 24));
                                }
                                paint2.setColorFilter((ColorFilter) null);
                                this.f10158b.setFillType(bVar.f10154c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(this.f10158b, paint2);
                            }
                            f0.c cVar5 = bVar.f10133e;
                            if (cVar5.b() || cVar5.f4873c != 0) {
                                f0.c cVar6 = bVar.f10133e;
                                if (this.f10160d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f10160d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f10160d;
                                Paint.Join join = bVar.f10140n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f10139m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f10141o);
                                if (cVar6.b()) {
                                    Shader shader2 = cVar6.f4871a;
                                    shader2.setLocalMatrix(this.f10159c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f10135h * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i14 = cVar6.f4873c;
                                    float f21 = bVar.f10135h;
                                    PorterDuff.Mode mode2 = f.f10124y;
                                    paint4.setColor((i14 & 16777215) | (((int) (((float) Color.alpha(i14)) * f21)) << 24));
                                }
                                paint4.setColorFilter((ColorFilter) null);
                                paint4.setStrokeWidth(bVar.f10134f * abs * f12);
                                canvas2.drawPath(this.f10158b, paint4);
                            }
                        }
                    }
                    fVar = this;
                    i12++;
                    r92 = 0;
                }
                int i15 = i10;
                int i16 = i11;
                i12++;
                r92 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f10166l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f10166l = i10;
        }

        public C0196f(C0196f fVar) {
            this.f10159c = new Matrix();
            this.f10163h = 0.0f;
            this.i = 0.0f;
            this.f10164j = 0.0f;
            this.f10165k = 0.0f;
            this.f10166l = 255;
            this.f10167m = null;
            this.f10168n = null;
            s.a<String, Object> aVar = new s.a<>();
            this.f10169o = aVar;
            this.g = new c(fVar.g, aVar);
            this.f10157a = new Path(fVar.f10157a);
            this.f10158b = new Path(fVar.f10158b);
            this.f10163h = fVar.f10163h;
            this.i = fVar.i;
            this.f10164j = fVar.f10164j;
            this.f10165k = fVar.f10165k;
            this.f10166l = fVar.f10166l;
            this.f10167m = fVar.f10167m;
            String str = fVar.f10167m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f10168n = fVar.f10168n;
        }
    }
}
