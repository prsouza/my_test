package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import b6.d;
import com.github.mikephil.charting.BuildConfig;
import e6.f;
import e6.i;
import e6.j;
import f5.g;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x5.m;
import x5.t;

public final class a extends f implements Drawable.Callback, m.b {
    public static final int[] W0 = {16842910};
    public static final ShapeDrawable X0 = new ShapeDrawable(new OvalShape());
    public final m A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public boolean H0;
    public int I0;
    public int J0 = 255;
    public ColorFilter K0;
    public PorterDuffColorFilter L0;
    public ColorStateList M0;
    public ColorStateList N;
    public PorterDuff.Mode N0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList O;
    public int[] O0;
    public float P;
    public boolean P0;
    public float Q = -1.0f;
    public ColorStateList Q0;
    public ColorStateList R;
    public WeakReference<C0043a> R0 = new WeakReference<>((Object) null);
    public float S;
    public TextUtils.TruncateAt S0;
    public ColorStateList T;
    public boolean T0;
    public CharSequence U;
    public int U0;
    public boolean V;
    public boolean V0;
    public Drawable W;
    public ColorStateList X;
    public float Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f3785a0;
    public Drawable b0;

    /* renamed from: c0  reason: collision with root package name */
    public RippleDrawable f3786c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f3787d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f3788e0;

    /* renamed from: f0  reason: collision with root package name */
    public SpannableStringBuilder f3789f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3790g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3791h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f3792i0;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f3793j0;

    /* renamed from: k0  reason: collision with root package name */
    public g f3794k0;

    /* renamed from: l0  reason: collision with root package name */
    public g f3795l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f3796m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f3797n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f3798o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f3799p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f3800q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f3801r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f3802s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f3803t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Context f3804u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Paint f3805v0 = new Paint(1);

    /* renamed from: w0  reason: collision with root package name */
    public final Paint.FontMetrics f3806w0 = new Paint.FontMetrics();

    /* renamed from: x0  reason: collision with root package name */
    public final RectF f3807x0 = new RectF();

    /* renamed from: y0  reason: collision with root package name */
    public final PointF f3808y0 = new PointF();
    public final Path z0 = new Path();

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0043a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(new i(i.b(context, attributeSet, R.attr.chipStyle, 2131821566)));
        m(context);
        this.f3804u0 = context;
        m mVar = new m(this);
        this.A0 = mVar;
        this.U = BuildConfig.FLAVOR;
        mVar.f12853a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = W0;
        setState(iArr);
        d0(iArr);
        this.T0 = true;
        int[] iArr2 = c6.a.f3250a;
        X0.setTint(-1);
    }

    public static boolean G(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean H(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q0()) {
            float f10 = this.f3803t0 + this.f3802s0;
            if (getLayoutDirection() == 0) {
                float f11 = ((float) rect.right) - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f3788e0;
            } else {
                float f12 = ((float) rect.left) + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f3788e0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f3788e0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q0()) {
            float f10 = this.f3803t0 + this.f3802s0 + this.f3788e0 + this.f3801r0 + this.f3800q0;
            if (getLayoutDirection() == 0) {
                float f11 = (float) rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f10;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public final float C() {
        if (q0()) {
            return this.f3801r0 + this.f3788e0 + this.f3802s0;
        }
        return 0.0f;
    }

    public final float D() {
        return this.V0 ? k() : this.Q;
    }

    public final Drawable E() {
        Drawable drawable = this.b0;
        if (drawable != null) {
            return h0.a.a(drawable);
        }
        return null;
    }

    public final float F() {
        Drawable drawable = this.H0 ? this.f3792i0 : this.W;
        float f10 = this.Y;
        return (f10 > 0.0f || drawable == null) ? f10 : (float) drawable.getIntrinsicWidth();
    }

    public final void I() {
        C0043a aVar = this.R0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean J(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z10;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.N;
        int d10 = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.B0) : 0);
        boolean z11 = true;
        if (this.B0 != d10) {
            this.B0 = d10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.O;
        int d11 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.C0) : 0);
        if (this.C0 != d11) {
            this.C0 = d11;
            onStateChange = true;
        }
        int b10 = g0.a.b(d11, d10);
        if ((this.D0 != b10) || (this.f4653a.f4666c == null)) {
            this.D0 = b10;
            o(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.R;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.E0) : 0;
        if (this.E0 != colorForState) {
            this.E0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.Q0 == null || !c6.a.d(iArr)) ? 0 : this.Q0.getColorForState(iArr, this.F0);
        if (this.F0 != colorForState2) {
            this.F0 = colorForState2;
            if (this.P0) {
                onStateChange = true;
            }
        }
        d dVar = this.A0.f12858f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f2876j) == null) ? 0 : colorStateList.getColorForState(iArr, this.G0);
        if (this.G0 != colorForState3) {
            this.G0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (state[i] == 16842912) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        boolean z12 = z && this.f3790g0;
        if (this.H0 == z12 || this.f3792i0 == null) {
            z10 = false;
        } else {
            float z13 = z();
            this.H0 = z12;
            if (z13 != z()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.M0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.I0) : 0;
        if (this.I0 != colorForState4) {
            this.I0 = colorForState4;
            this.L0 = t5.a.a(this, this.M0, this.N0);
        } else {
            z11 = onStateChange;
        }
        if (H(this.W)) {
            z11 |= this.W.setState(iArr);
        }
        if (H(this.f3792i0)) {
            z11 |= this.f3792i0.setState(iArr);
        }
        if (H(this.b0)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.b0.setState(iArr3);
        }
        int[] iArr4 = c6.a.f3250a;
        if (H(this.f3786c0)) {
            z11 |= this.f3786c0.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            I();
        }
        return z11;
    }

    public final void K(boolean z) {
        if (this.f3790g0 != z) {
            this.f3790g0 = z;
            float z10 = z();
            if (!z && this.H0) {
                this.H0 = false;
            }
            float z11 = z();
            invalidateSelf();
            if (z10 != z11) {
                I();
            }
        }
    }

    public final void L(Drawable drawable) {
        if (this.f3792i0 != drawable) {
            float z = z();
            this.f3792i0 = drawable;
            float z10 = z();
            r0(this.f3792i0);
            x(this.f3792i0);
            invalidateSelf();
            if (z != z10) {
                I();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f3793j0 != colorStateList) {
            this.f3793j0 = colorStateList;
            if (this.f3791h0 && this.f3792i0 != null && this.f3790g0) {
                this.f3792i0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z) {
        if (this.f3791h0 != z) {
            boolean o02 = o0();
            this.f3791h0 = z;
            boolean o03 = o0();
            if (o02 != o03) {
                if (o03) {
                    x(this.f3792i0);
                } else {
                    r0(this.f3792i0);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public final void P(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            setShapeAppearanceModel(this.f4653a.f4664a.e(f10));
        }
    }

    public final void Q(float f10) {
        if (this.f3803t0 != f10) {
            this.f3803t0 = f10;
            invalidateSelf();
            I();
        }
    }

    public final void R(Drawable drawable) {
        Drawable drawable2 = this.W;
        Drawable drawable3 = null;
        Drawable a10 = drawable2 != null ? h0.a.a(drawable2) : null;
        if (a10 != drawable) {
            float z = z();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.W = drawable3;
            float z10 = z();
            r0(a10);
            if (p0()) {
                x(this.W);
            }
            invalidateSelf();
            if (z != z10) {
                I();
            }
        }
    }

    public final void S(float f10) {
        if (this.Y != f10) {
            float z = z();
            this.Y = f10;
            float z10 = z();
            invalidateSelf();
            if (z != z10) {
                I();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        this.Z = true;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (p0()) {
                this.W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void U(boolean z) {
        if (this.V != z) {
            boolean p02 = p0();
            this.V = z;
            boolean p03 = p0();
            if (p02 != p03) {
                if (p03) {
                    x(this.W);
                } else {
                    r0(this.W);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public final void V(float f10) {
        if (this.P != f10) {
            this.P = f10;
            invalidateSelf();
            I();
        }
    }

    public final void W(float f10) {
        if (this.f3796m0 != f10) {
            this.f3796m0 = f10;
            invalidateSelf();
            I();
        }
    }

    public final void X(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (this.V0) {
                s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(float f10) {
        if (this.S != f10) {
            this.S = f10;
            this.f3805v0.setStrokeWidth(f10);
            if (this.V0) {
                t(f10);
            }
            invalidateSelf();
        }
    }

    public final void Z(Drawable drawable) {
        Drawable E = E();
        if (E != drawable) {
            float C = C();
            this.b0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = c6.a.f3250a;
            this.f3786c0 = new RippleDrawable(c6.a.c(this.T), this.b0, X0);
            float C2 = C();
            r0(E);
            if (q0()) {
                x(this.b0);
            }
            invalidateSelf();
            if (C != C2) {
                I();
            }
        }
    }

    public final void a() {
        I();
        invalidateSelf();
    }

    public final void a0(float f10) {
        if (this.f3802s0 != f10) {
            this.f3802s0 = f10;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public final void b0(float f10) {
        if (this.f3788e0 != f10) {
            this.f3788e0 = f10;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public final void c0(float f10) {
        if (this.f3801r0 != f10) {
            this.f3801r0 = f10;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public final boolean d0(int[] iArr) {
        if (Arrays.equals(this.O0, iArr)) {
            return false;
        }
        this.O0 = iArr;
        if (q0()) {
            return J(getState(), iArr);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.J0) != 0) {
            int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i) : 0;
            if (!this.V0) {
                this.f3805v0.setColor(this.B0);
                this.f3805v0.setStyle(Paint.Style.FILL);
                this.f3807x0.set(bounds);
                canvas2.drawRoundRect(this.f3807x0, D(), D(), this.f3805v0);
            }
            if (!this.V0) {
                this.f3805v0.setColor(this.C0);
                this.f3805v0.setStyle(Paint.Style.FILL);
                Paint paint = this.f3805v0;
                ColorFilter colorFilter = this.K0;
                if (colorFilter == null) {
                    colorFilter = this.L0;
                }
                paint.setColorFilter(colorFilter);
                this.f3807x0.set(bounds);
                canvas2.drawRoundRect(this.f3807x0, D(), D(), this.f3805v0);
            }
            if (this.V0) {
                super.draw(canvas);
            }
            if (this.S > 0.0f && !this.V0) {
                this.f3805v0.setColor(this.E0);
                this.f3805v0.setStyle(Paint.Style.STROKE);
                if (!this.V0) {
                    Paint paint2 = this.f3805v0;
                    ColorFilter colorFilter2 = this.K0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.L0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f3807x0;
                float f10 = this.S / 2.0f;
                rectF.set(((float) bounds.left) + f10, ((float) bounds.top) + f10, ((float) bounds.right) - f10, ((float) bounds.bottom) - f10);
                float f11 = this.Q - (this.S / 2.0f);
                canvas2.drawRoundRect(this.f3807x0, f11, f11, this.f3805v0);
            }
            this.f3805v0.setColor(this.F0);
            this.f3805v0.setStyle(Paint.Style.FILL);
            this.f3807x0.set(bounds);
            if (!this.V0) {
                canvas2.drawRoundRect(this.f3807x0, D(), D(), this.f3805v0);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.z0;
                j jVar = this.G;
                f.b bVar = this.f4653a;
                jVar.a(bVar.f4664a, bVar.f4671j, rectF2, this.F, path);
                f(canvas, this.f3805v0, this.z0, this.f4653a.f4664a, h());
            }
            if (p0()) {
                y(bounds, this.f3807x0);
                RectF rectF3 = this.f3807x0;
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                canvas2.translate(f12, f13);
                this.W.setBounds(0, 0, (int) this.f3807x0.width(), (int) this.f3807x0.height());
                this.W.draw(canvas2);
                canvas2.translate(-f12, -f13);
            }
            if (o0()) {
                y(bounds, this.f3807x0);
                RectF rectF4 = this.f3807x0;
                float f14 = rectF4.left;
                float f15 = rectF4.top;
                canvas2.translate(f14, f15);
                this.f3792i0.setBounds(0, 0, (int) this.f3807x0.width(), (int) this.f3807x0.height());
                this.f3792i0.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (!this.T0 || this.U == null) {
                i10 = saveLayerAlpha;
                i11 = 0;
                i12 = 255;
            } else {
                PointF pointF = this.f3808y0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.U != null) {
                    float z = z() + this.f3796m0 + this.f3799p0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = ((float) bounds.left) + z;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - z;
                        align = Paint.Align.RIGHT;
                    }
                    this.A0.f12853a.getFontMetrics(this.f3806w0);
                    Paint.FontMetrics fontMetrics = this.f3806w0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF5 = this.f3807x0;
                rectF5.setEmpty();
                if (this.U != null) {
                    float z10 = z() + this.f3796m0 + this.f3799p0;
                    float C = C() + this.f3803t0 + this.f3800q0;
                    if (getLayoutDirection() == 0) {
                        rectF5.left = ((float) bounds.left) + z10;
                        rectF5.right = ((float) bounds.right) - C;
                    } else {
                        rectF5.left = ((float) bounds.left) + C;
                        rectF5.right = ((float) bounds.right) - z10;
                    }
                    rectF5.top = (float) bounds.top;
                    rectF5.bottom = (float) bounds.bottom;
                }
                m mVar = this.A0;
                if (mVar.f12858f != null) {
                    mVar.f12853a.drawableState = getState();
                    m mVar2 = this.A0;
                    mVar2.f12858f.e(this.f3804u0, mVar2.f12853a, mVar2.f12854b);
                }
                this.A0.f12853a.setTextAlign(align);
                boolean z11 = Math.round(this.A0.a(this.U.toString())) > Math.round(this.f3807x0.width());
                if (z11) {
                    i13 = canvas.save();
                    canvas2.clipRect(this.f3807x0);
                } else {
                    i13 = 0;
                }
                CharSequence charSequence = this.U;
                if (z11 && this.S0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.A0.f12853a, this.f3807x0.width(), this.S0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f3808y0;
                i10 = saveLayerAlpha;
                float f16 = pointF2.x;
                i11 = 0;
                float f17 = pointF2.y;
                i12 = 255;
                canvas.drawText(charSequence2, 0, length, f16, f17, this.A0.f12853a);
                if (z11) {
                    canvas2.restoreToCount(i13);
                }
            }
            if (q0()) {
                A(bounds, this.f3807x0);
                RectF rectF6 = this.f3807x0;
                float f18 = rectF6.left;
                float f19 = rectF6.top;
                canvas2.translate(f18, f19);
                this.b0.setBounds(i11, i11, (int) this.f3807x0.width(), (int) this.f3807x0.height());
                int[] iArr = c6.a.f3250a;
                this.f3786c0.setBounds(this.b0.getBounds());
                this.f3786c0.jumpToCurrentState();
                this.f3786c0.draw(canvas2);
                canvas2.translate(-f18, -f19);
            }
            if (this.J0 < i12) {
                canvas2.restoreToCount(i10);
            }
        }
    }

    public final void e0(ColorStateList colorStateList) {
        if (this.f3787d0 != colorStateList) {
            this.f3787d0 = colorStateList;
            if (q0()) {
                this.b0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void f0(boolean z) {
        if (this.f3785a0 != z) {
            boolean q02 = q0();
            this.f3785a0 = z;
            boolean q03 = q0();
            if (q02 != q03) {
                if (q03) {
                    x(this.b0);
                } else {
                    r0(this.b0);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public final void g0(float f10) {
        if (this.f3798o0 != f10) {
            float z = z();
            this.f3798o0 = f10;
            float z10 = z();
            invalidateSelf();
            if (z != z10) {
                I();
            }
        }
    }

    public final int getAlpha() {
        return this.J0;
    }

    public final ColorFilter getColorFilter() {
        return this.K0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.P;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(C() + this.A0.a(this.U.toString()) + z() + this.f3796m0 + this.f3799p0 + this.f3800q0 + this.f3803t0), this.U0);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (this.V0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.Q);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.P, this.Q);
        }
        outline.setAlpha(((float) this.J0) / 255.0f);
    }

    public final void h0(float f10) {
        if (this.f3797n0 != f10) {
            float z = z();
            this.f3797n0 = f10;
            float z10 = z();
            invalidateSelf();
            if (z != z10) {
                I();
            }
        }
    }

    public final void i0(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            this.Q0 = this.P0 ? c6.a.c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f2876j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.N
            boolean r0 = G(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.O
            boolean r0 = G(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.R
            boolean r0 = G(r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.P0
            if (r0 == 0) goto L_0x0026
            android.content.res.ColorStateList r0 = r3.Q0
            boolean r0 = G(r0)
            if (r0 != 0) goto L_0x0064
        L_0x0026:
            x5.m r0 = r3.A0
            b6.d r0 = r0.f12858f
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f2876j
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.f3791h0
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.f3792i0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.f3790g0
            if (r0 == 0) goto L_0x0049
            r0 = r2
            goto L_0x004a
        L_0x0049:
            r0 = r1
        L_0x004a:
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.W
            boolean r0 = H(r0)
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.f3792i0
            boolean r0 = H(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.M0
            boolean r0 = G(r0)
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.isStateful():boolean");
    }

    public final void j0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (!TextUtils.equals(this.U, charSequence)) {
            this.U = charSequence;
            this.A0.f12856d = true;
            invalidateSelf();
            I();
        }
    }

    public final void k0(d dVar) {
        this.A0.b(dVar, this.f3804u0);
    }

    public final void l0(float f10) {
        if (this.f3800q0 != f10) {
            this.f3800q0 = f10;
            invalidateSelf();
            I();
        }
    }

    public final void m0(float f10) {
        if (this.f3799p0 != f10) {
            this.f3799p0 = f10;
            invalidateSelf();
            I();
        }
    }

    public final void n0() {
        if (this.P0) {
            this.P0 = false;
            this.Q0 = null;
            onStateChange(getState());
        }
    }

    public final boolean o0() {
        return this.f3791h0 && this.f3792i0 != null && this.H0;
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (p0()) {
            onLayoutDirectionChanged |= this.W.setLayoutDirection(i);
        }
        if (o0()) {
            onLayoutDirectionChanged |= this.f3792i0.setLayoutDirection(i);
        }
        if (q0()) {
            onLayoutDirectionChanged |= this.b0.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (p0()) {
            onLevelChange |= this.W.setLevel(i);
        }
        if (o0()) {
            onLevelChange |= this.f3792i0.setLevel(i);
        }
        if (q0()) {
            onLevelChange |= this.b0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.V0) {
            super.onStateChange(iArr);
        }
        return J(iArr, this.O0);
    }

    public final boolean p0() {
        return this.V && this.W != null;
    }

    public final boolean q0() {
        return this.f3785a0 && this.b0 != null;
    }

    public final void r0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i) {
        if (this.J0 != i) {
            this.J0 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.K0 != colorFilter) {
            this.K0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.N0 != mode) {
            this.N0 = mode;
            this.L0 = t5.a.a(this, this.M0, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z10) {
        boolean visible = super.setVisible(z, z10);
        if (p0()) {
            visible |= this.W.setVisible(z, z10);
        }
        if (o0()) {
            visible |= this.f3792i0.setVisible(z, z10);
        }
        if (q0()) {
            visible |= this.b0.setVisible(z, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.b0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.O0);
                }
                drawable.setTintList(this.f3787d0);
                return;
            }
            Drawable drawable2 = this.W;
            if (drawable == drawable2 && this.Z) {
                drawable2.setTintList(this.X);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void y(Rect rect, RectF rectF) {
        float f10;
        rectF.setEmpty();
        if (p0() || o0()) {
            float f11 = this.f3796m0 + this.f3797n0;
            float F = F();
            if (getLayoutDirection() == 0) {
                float f12 = ((float) rect.left) + f11;
                rectF.left = f12;
                rectF.right = f12 + F;
            } else {
                float f13 = ((float) rect.right) - f11;
                rectF.right = f13;
                rectF.left = f13 - F;
            }
            Drawable drawable = this.H0 ? this.f3792i0 : this.W;
            float f14 = this.Y;
            if (f14 <= 0.0f && drawable != null) {
                f14 = (float) Math.ceil((double) t.a(this.f3804u0, 24));
                if (((float) drawable.getIntrinsicHeight()) <= f14) {
                    f10 = (float) drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f14;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final float z() {
        if (!p0() && !o0()) {
            return 0.0f;
        }
        return F() + this.f3797n0 + this.f3798o0;
    }
}
