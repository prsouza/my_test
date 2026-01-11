package e6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import e6.j;
import e6.k;
import java.util.BitSet;
import java.util.Objects;

public class f extends Drawable implements l {
    public static final String L = f.class.getSimpleName();
    public static final Paint M;
    public final Region A;
    public i B;
    public final Paint C;
    public final Paint D;
    public final d6.a E;
    public final a F;
    public final j G;
    public PorterDuffColorFilter H;
    public PorterDuffColorFilter I;
    public final RectF J;
    public boolean K;

    /* renamed from: a  reason: collision with root package name */
    public b f4653a;

    /* renamed from: b  reason: collision with root package name */
    public final k.g[] f4654b;

    /* renamed from: c  reason: collision with root package name */
    public final k.g[] f4655c;

    /* renamed from: s  reason: collision with root package name */
    public final BitSet f4656s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4657t;

    /* renamed from: u  reason: collision with root package name */
    public final Matrix f4658u;

    /* renamed from: v  reason: collision with root package name */
    public final Path f4659v;

    /* renamed from: w  reason: collision with root package name */
    public final Path f4660w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f4661x;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f4662y;
    public final Region z;

    public class a implements j.b {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        M = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    public final void b(RectF rectF, Path path) {
        j jVar = this.G;
        b bVar = this.f4653a;
        i iVar = bVar.f4664a;
        float f10 = bVar.f4671j;
        jVar.a(iVar, f10, rectF, this.F, path);
        if (this.f4653a.i != 1.0f) {
            this.f4658u.reset();
            Matrix matrix = this.f4658u;
            float f11 = this.f4653a.i;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4658u);
        }
        path.computeBounds(this.J, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
        r3 = d(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.d(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.d(r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.f.c(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final int d(int i) {
        b bVar = this.f4653a;
        float f10 = bVar.f4675n + bVar.f4676o + bVar.f4674m;
        u5.a aVar = bVar.f4665b;
        return aVar != null ? aVar.a(i, f10) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ec, code lost:
        if ((!r2.f4664a.d(h()) && !r12.f4659v.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            android.graphics.Paint r0 = r12.C
            android.graphics.PorterDuffColorFilter r1 = r12.H
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r12.C
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r12.C
            e6.f$b r2 = r12.f4653a
            int r2 = r2.f4673l
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r12.D
            android.graphics.PorterDuffColorFilter r2 = r12.I
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r12.D
            e6.f$b r2 = r12.f4653a
            float r2 = r2.f4672k
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r12.D
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r12.D
            e6.f$b r3 = r12.f4653a
            int r3 = r3.f4673l
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r12.f4657t
            r3 = 0
            if (r2 == 0) goto L_0x00c1
            boolean r2 = r12.l()
            if (r2 == 0) goto L_0x0056
            android.graphics.Paint r2 = r12.D
            float r2 = r2.getStrokeWidth()
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            float r2 = -r2
            e6.f$b r4 = r12.f4653a
            e6.i r4 = r4.f4664a
            java.util.Objects.requireNonNull(r4)
            e6.i$a r5 = new e6.i$a
            r5.<init>(r4)
            e6.c r6 = r4.f4688e
            boolean r7 = r6 instanceof e6.g
            if (r7 == 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            e6.b r7 = new e6.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0071:
            r5.f4698e = r6
            e6.c r6 = r4.f4689f
            boolean r7 = r6 instanceof e6.g
            if (r7 == 0) goto L_0x007a
            goto L_0x0080
        L_0x007a:
            e6.b r7 = new e6.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0080:
            r5.f4699f = r6
            e6.c r6 = r4.f4690h
            boolean r7 = r6 instanceof e6.g
            if (r7 == 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            e6.b r7 = new e6.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x008f:
            r5.f4700h = r6
            e6.c r4 = r4.g
            boolean r6 = r4 instanceof e6.g
            if (r6 == 0) goto L_0x0098
            goto L_0x009e
        L_0x0098:
            e6.b r6 = new e6.b
            r6.<init>(r2, r4)
            r4 = r6
        L_0x009e:
            r5.g = r4
            e6.i r7 = r5.a()
            r12.B = r7
            e6.j r6 = r12.G
            e6.f$b r2 = r12.f4653a
            float r8 = r2.f4671j
            android.graphics.RectF r9 = r12.i()
            android.graphics.Path r11 = r12.f4660w
            r10 = 0
            r6.a(r7, r8, r9, r10, r11)
            android.graphics.RectF r2 = r12.h()
            android.graphics.Path r4 = r12.f4659v
            r12.b(r2, r4)
            r12.f4657t = r3
        L_0x00c1:
            e6.f$b r2 = r12.f4653a
            int r4 = r2.f4677p
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L_0x00f0
            int r7 = r2.f4678q
            if (r7 <= 0) goto L_0x00f0
            if (r4 == r5) goto L_0x00ee
            int r4 = android.os.Build.VERSION.SDK_INT
            e6.i r2 = r2.f4664a
            android.graphics.RectF r7 = r12.h()
            boolean r2 = r2.d(r7)
            if (r2 != 0) goto L_0x00eb
            android.graphics.Path r2 = r12.f4659v
            boolean r2 = r2.isConvex()
            if (r2 != 0) goto L_0x00eb
            r2 = 29
            if (r4 >= r2) goto L_0x00eb
            r2 = r6
            goto L_0x00ec
        L_0x00eb:
            r2 = r3
        L_0x00ec:
            if (r2 == 0) goto L_0x00f0
        L_0x00ee:
            r2 = r6
            goto L_0x00f1
        L_0x00f0:
            r2 = r3
        L_0x00f1:
            if (r2 != 0) goto L_0x00f5
            goto L_0x0197
        L_0x00f5:
            r13.save()
            e6.f$b r2 = r12.f4653a
            int r4 = r2.f4679r
            double r7 = (double) r4
            int r2 = r2.f4680s
            double r9 = (double) r2
            double r9 = java.lang.Math.toRadians(r9)
            double r9 = java.lang.Math.sin(r9)
            double r9 = r9 * r7
            int r2 = (int) r9
            int r4 = r12.j()
            float r2 = (float) r2
            float r4 = (float) r4
            r13.translate(r2, r4)
            boolean r2 = r12.K
            if (r2 != 0) goto L_0x011e
            r12.e(r13)
            r13.restore()
            goto L_0x0197
        L_0x011e:
            android.graphics.RectF r2 = r12.J
            float r2 = r2.width()
            android.graphics.Rect r4 = r12.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            float r2 = r2 - r4
            int r2 = (int) r2
            android.graphics.RectF r4 = r12.J
            float r4 = r4.height()
            android.graphics.Rect r7 = r12.getBounds()
            int r7 = r7.height()
            float r7 = (float) r7
            float r4 = r4 - r7
            int r4 = (int) r4
            if (r2 < 0) goto L_0x01c9
            if (r4 < 0) goto L_0x01c9
            android.graphics.RectF r7 = r12.J
            float r7 = r7.width()
            int r7 = (int) r7
            e6.f$b r8 = r12.f4653a
            int r8 = r8.f4678q
            int r8 = r8 * r5
            int r8 = r8 + r7
            int r8 = r8 + r2
            android.graphics.RectF r7 = r12.J
            float r7 = r7.height()
            int r7 = (int) r7
            e6.f$b r9 = r12.f4653a
            int r9 = r9.f4678q
            int r9 = r9 * r5
            int r9 = r9 + r7
            int r9 = r9 + r4
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r9, r5)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r5)
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.left
            e6.f$b r9 = r12.f4653a
            int r9 = r9.f4678q
            int r8 = r8 - r9
            int r8 = r8 - r2
            float r2 = (float) r8
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.top
            e6.f$b r9 = r12.f4653a
            int r9 = r9.f4678q
            int r8 = r8 - r9
            int r8 = r8 - r4
            float r4 = (float) r8
            float r8 = -r2
            float r9 = -r4
            r7.translate(r8, r9)
            r12.e(r7)
            r7 = 0
            r13.drawBitmap(r5, r2, r4, r7)
            r5.recycle()
            r13.restore()
        L_0x0197:
            e6.f$b r2 = r12.f4653a
            android.graphics.Paint$Style r4 = r2.f4682u
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r4 == r5) goto L_0x01a3
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            if (r4 != r5) goto L_0x01a4
        L_0x01a3:
            r3 = r6
        L_0x01a4:
            if (r3 == 0) goto L_0x01b5
            android.graphics.Paint r6 = r12.C
            android.graphics.Path r7 = r12.f4659v
            e6.i r8 = r2.f4664a
            android.graphics.RectF r9 = r12.h()
            r4 = r12
            r5 = r13
            r4.f(r5, r6, r7, r8, r9)
        L_0x01b5:
            boolean r2 = r12.l()
            if (r2 == 0) goto L_0x01be
            r12.g(r13)
        L_0x01be:
            android.graphics.Paint r13 = r12.C
            r13.setAlpha(r0)
            android.graphics.Paint r13 = r12.D
            r13.setAlpha(r1)
            return
        L_0x01c9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.f.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f4656s.cardinality() > 0) {
            Log.w(L, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f4653a.f4679r != 0) {
            canvas.drawPath(this.f4659v, this.E.f4343a);
        }
        for (int i = 0; i < 4; i++) {
            k.g gVar = this.f4654b[i];
            d6.a aVar = this.E;
            int i10 = this.f4653a.f4678q;
            Matrix matrix = k.g.f4737a;
            gVar.a(matrix, aVar, i10, canvas);
            this.f4655c[i].a(matrix, this.E, this.f4653a.f4678q, canvas);
        }
        if (this.K) {
            b bVar = this.f4653a;
            int sin = (int) (Math.sin(Math.toRadians((double) bVar.f4680s)) * ((double) bVar.f4679r));
            int j10 = j();
            canvas.translate((float) (-sin), (float) (-j10));
            canvas.drawPath(this.f4659v, M);
            canvas.translate((float) sin, (float) j10);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (iVar.d(rectF)) {
            float a10 = iVar.f4689f.a(rectF) * this.f4653a.f4671j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        f(canvas, this.D, this.f4660w, this.B, i());
    }

    public int getAlpha() {
        return this.f4653a.f4673l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f4653a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        b bVar = this.f4653a;
        if (bVar.f4677p != 2) {
            if (bVar.f4664a.d(h())) {
                outline.setRoundRect(getBounds(), k() * this.f4653a.f4671j);
                return;
            }
            b(h(), this.f4659v);
            if (this.f4659v.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f4659v);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f4653a.f4670h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        this.z.set(getBounds());
        b(h(), this.f4659v);
        this.A.setPath(this.f4659v, this.z);
        this.z.op(this.A, Region.Op.DIFFERENCE);
        return this.z;
    }

    public final RectF h() {
        this.f4661x.set(getBounds());
        return this.f4661x;
    }

    public final RectF i() {
        this.f4662y.set(h());
        float strokeWidth = l() ? this.D.getStrokeWidth() / 2.0f : 0.0f;
        this.f4662y.inset(strokeWidth, strokeWidth);
        return this.f4662y;
    }

    public final void invalidateSelf() {
        this.f4657t = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f4653a.f4667d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f4653a.f4666c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f4653a.f4669f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f4653a.f4668e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            e6.f$b r0 = r1.f4653a
            android.content.res.ColorStateList r0 = r0.f4669f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            e6.f$b r0 = r1.f4653a
            android.content.res.ColorStateList r0 = r0.f4668e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            e6.f$b r0 = r1.f4653a
            android.content.res.ColorStateList r0 = r0.f4667d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            e6.f$b r0 = r1.f4653a
            android.content.res.ColorStateList r0 = r0.f4666c
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.f.isStateful():boolean");
    }

    public final int j() {
        b bVar = this.f4653a;
        return (int) (Math.cos(Math.toRadians((double) bVar.f4680s)) * ((double) bVar.f4679r));
    }

    public final float k() {
        return this.f4653a.f4664a.f4688e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f4653a.f4682u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.D.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.f4653a.f4665b = new u5.a(context);
        w();
    }

    public final Drawable mutate() {
        this.f4653a = new b(this.f4653a);
        return this;
    }

    public final void n(float f10) {
        b bVar = this.f4653a;
        if (bVar.f4675n != f10) {
            bVar.f4675n = f10;
            w();
        }
    }

    public final void o(ColorStateList colorStateList) {
        b bVar = this.f4653a;
        if (bVar.f4666c != colorStateList) {
            bVar.f4666c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void onBoundsChange(Rect rect) {
        this.f4657t = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z10 = u(iArr) || v();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(float f10) {
        b bVar = this.f4653a;
        if (bVar.f4671j != f10) {
            bVar.f4671j = f10;
            this.f4657t = true;
            invalidateSelf();
        }
    }

    public final void q(float f10, int i) {
        t(f10);
        s(ColorStateList.valueOf(i));
    }

    public final void r(float f10, ColorStateList colorStateList) {
        t(f10);
        s(colorStateList);
    }

    public final void s(ColorStateList colorStateList) {
        b bVar = this.f4653a;
        if (bVar.f4667d != colorStateList) {
            bVar.f4667d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setAlpha(int i) {
        b bVar = this.f4653a;
        if (bVar.f4673l != i) {
            bVar.f4673l = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Objects.requireNonNull(this.f4653a);
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(i iVar) {
        this.f4653a.f4664a = iVar;
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4653a.f4669f = colorStateList;
        v();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f4653a;
        if (bVar.g != mode) {
            bVar.g = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final void t(float f10) {
        this.f4653a.f4672k = f10;
        invalidateSelf();
    }

    public final boolean u(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4653a.f4666c == null || (color2 = this.C.getColor()) == (colorForState2 = this.f4653a.f4666c.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            this.C.setColor(colorForState2);
            z10 = true;
        }
        if (this.f4653a.f4667d == null || (color = this.D.getColor()) == (colorForState = this.f4653a.f4667d.getColorForState(iArr, color))) {
            return z10;
        }
        this.D.setColor(colorForState);
        return true;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.H;
        PorterDuffColorFilter porterDuffColorFilter2 = this.I;
        b bVar = this.f4653a;
        this.H = c(bVar.f4669f, bVar.g, this.C, true);
        b bVar2 = this.f4653a;
        this.I = c(bVar2.f4668e, bVar2.g, this.D, false);
        b bVar3 = this.f4653a;
        if (bVar3.f4681t) {
            this.E.a(bVar3.f4669f.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.H) || !Objects.equals(porterDuffColorFilter2, this.I)) {
            return true;
        }
        return false;
    }

    public final void w() {
        b bVar = this.f4653a;
        float f10 = bVar.f4675n + bVar.f4676o;
        bVar.f4678q = (int) Math.ceil((double) (0.75f * f10));
        this.f4653a.f4679r = (int) Math.ceil((double) (f10 * 0.25f));
        v();
        super.invalidateSelf();
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public f(b bVar) {
        j jVar;
        this.f4654b = new k.g[4];
        this.f4655c = new k.g[4];
        this.f4656s = new BitSet(8);
        this.f4658u = new Matrix();
        this.f4659v = new Path();
        this.f4660w = new Path();
        this.f4661x = new RectF();
        this.f4662y = new RectF();
        this.z = new Region();
        this.A = new Region();
        Paint paint = new Paint(1);
        this.C = paint;
        Paint paint2 = new Paint(1);
        this.D = paint2;
        this.E = new d6.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f4714a;
        } else {
            jVar = new j();
        }
        this.G = jVar;
        this.J = new RectF();
        this.K = true;
        this.f4653a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        u(getState());
        this.F = new a();
    }

    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f4664a;

        /* renamed from: b  reason: collision with root package name */
        public u5.a f4665b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f4666c = null;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f4667d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f4668e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f4669f = null;
        public PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;

        /* renamed from: h  reason: collision with root package name */
        public Rect f4670h = null;
        public float i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f4671j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f4672k;

        /* renamed from: l  reason: collision with root package name */
        public int f4673l = 255;

        /* renamed from: m  reason: collision with root package name */
        public float f4674m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public float f4675n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f4676o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public int f4677p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f4678q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f4679r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f4680s = 0;

        /* renamed from: t  reason: collision with root package name */
        public boolean f4681t = false;

        /* renamed from: u  reason: collision with root package name */
        public Paint.Style f4682u = Paint.Style.FILL_AND_STROKE;

        public b(i iVar) {
            this.f4664a = iVar;
            this.f4665b = null;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f4657t = true;
            return fVar;
        }

        public b(b bVar) {
            this.f4664a = bVar.f4664a;
            this.f4665b = bVar.f4665b;
            this.f4672k = bVar.f4672k;
            this.f4666c = bVar.f4666c;
            this.f4667d = bVar.f4667d;
            this.g = bVar.g;
            this.f4669f = bVar.f4669f;
            this.f4673l = bVar.f4673l;
            this.i = bVar.i;
            this.f4679r = bVar.f4679r;
            this.f4677p = bVar.f4677p;
            this.f4681t = bVar.f4681t;
            this.f4671j = bVar.f4671j;
            this.f4674m = bVar.f4674m;
            this.f4675n = bVar.f4675n;
            this.f4676o = bVar.f4676o;
            this.f4678q = bVar.f4678q;
            this.f4680s = bVar.f4680s;
            this.f4668e = bVar.f4668e;
            this.f4682u = bVar.f4682u;
            if (bVar.f4670h != null) {
                this.f4670h = new Rect(bVar.f4670h);
            }
        }
    }
}
