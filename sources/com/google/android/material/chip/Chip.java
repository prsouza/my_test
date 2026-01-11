package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.h;
import b6.d;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.material.chip.a;
import e6.l;
import f5.g;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import x5.i;

public class Chip extends h implements a.C0043a, l, i<Chip> {
    public static final Rect L = new Rect();
    public static final int[] M = {16842913};
    public static final int[] N = {16842911};
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public CharSequence F;
    public final b G;
    public boolean H;
    public final Rect I = new Rect();
    public final RectF J = new RectF();
    public final a K = new a();

    /* renamed from: t  reason: collision with root package name */
    public a f3767t;

    /* renamed from: u  reason: collision with root package name */
    public InsetDrawable f3768u;

    /* renamed from: v  reason: collision with root package name */
    public RippleDrawable f3769v;

    /* renamed from: w  reason: collision with root package name */
    public View.OnClickListener f3770w;

    /* renamed from: x  reason: collision with root package name */
    public i.a<Chip> f3771x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3772y;
    public boolean z;

    public class a extends android.support.v4.media.b {
        public a() {
        }

        public final void A1(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            a aVar = chip.f3767t;
            if (aVar.T0) {
                charSequence = aVar.U;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        public final void z1(int i) {
        }
    }

    public class b extends t0.a {
        public b(Chip chip) {
            super(chip);
        }

        public final void m(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.L;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                a aVar = chip2.f3767t;
                if (aVar != null && aVar.f3785a0) {
                    z = true;
                }
                if (z && chip2.f3770w != null) {
                    list.add(1);
                }
            }
        }

        public final boolean p(int i, int i10) {
            if (i10 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.g();
            }
            return false;
        }

        public final void q(int i, o0.b bVar) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    bVar.r(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    bVar.r(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                bVar.l(Chip.this.getCloseIconTouchBoundsInt());
                bVar.b(b.a.f9176e);
                bVar.f9173a.setEnabled(Chip.this.isEnabled());
                return;
            }
            bVar.r(charSequence);
            bVar.l(Chip.L);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011d, code lost:
        r4 = r1.getResourceId(0, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r1 = 2130903240(0x7f0300c8, float:1.7413292E38)
            r2 = 2131821566(0x7f1103fe, float:1.9275879E38)
            r3 = r18
            android.content.Context r2 = j6.a.a(r3, r7, r1, r2)
            r0.<init>(r2, r7, r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.I = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.J = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.K = r1
            android.content.Context r8 = r17.getContext()
            r9 = 8388627(0x800013, float:1.175497E-38)
            r10 = 1
            if (r7 != 0) goto L_0x0033
            goto L_0x0093
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0044:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x036b
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0363
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x035d
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0357
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r10)
            if (r2 == 0) goto L_0x034f
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x034f
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x034f
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x034f
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r9)
            if (r1 == r9) goto L_0x0093
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0093:
            com.google.android.material.chip.a r11 = new com.google.android.material.chip.a
            r11.<init>(r8, r7)
            android.content.Context r1 = r11.f3804u0
            int[] r12 = e5.a.f4621e
            r13 = 0
            int[] r6 = new int[r13]
            r5 = 2131821566(0x7f1103fe, float:1.9275879E38)
            r4 = 2130903240(0x7f0300c8, float:1.7413292E38)
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = x5.o.d(r1, r2, r3, r4, r5, r6)
            r14 = 37
            boolean r2 = r1.hasValue(r14)
            r11.V0 = r2
            android.content.Context r2 = r11.f3804u0
            r3 = 24
            android.content.res.ColorStateList r2 = b6.c.a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r11.N
            if (r3 == r2) goto L_0x00c9
            r11.N = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00c9:
            android.content.Context r2 = r11.f3804u0
            r3 = 11
            android.content.res.ColorStateList r2 = b6.c.a(r2, r1, r3)
            r11.O(r2)
            r2 = 19
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r11.V(r2)
            r2 = 12
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x00ed
            float r2 = r1.getDimension(r2, r3)
            r11.P(r2)
        L_0x00ed:
            android.content.Context r2 = r11.f3804u0
            r4 = 22
            android.content.res.ColorStateList r2 = b6.c.a(r2, r1, r4)
            r11.X(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r3)
            r11.Y(r2)
            android.content.Context r2 = r11.f3804u0
            r4 = 36
            android.content.res.ColorStateList r2 = b6.c.a(r2, r1, r4)
            r11.i0(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            r11.j0(r2)
            android.content.Context r2 = r11.f3804u0
            boolean r4 = r1.hasValue(r13)
            r5 = 0
            if (r4 == 0) goto L_0x0129
            int r4 = r1.getResourceId(r13, r13)
            if (r4 == 0) goto L_0x0129
            b6.d r6 = new b6.d
            r6.<init>(r2, r4)
            goto L_0x012a
        L_0x0129:
            r6 = r5
        L_0x012a:
            float r2 = r6.f2877k
            float r2 = r1.getDimension(r10, r2)
            r6.f2877k = r2
            r11.k0(r6)
            r2 = 3
            int r4 = r1.getInt(r2, r13)
            if (r4 == r10) goto L_0x014c
            r6 = 2
            if (r4 == r6) goto L_0x0147
            if (r4 == r2) goto L_0x0142
            goto L_0x0150
        L_0x0142:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r11.S0 = r2
            goto L_0x0150
        L_0x0147:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r11.S0 = r2
            goto L_0x0150
        L_0x014c:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r11.S0 = r2
        L_0x0150:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r13)
            r11.U(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0176
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x0176
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x0176
            r4 = 15
            boolean r4 = r1.getBoolean(r4, r13)
            r11.U(r4)
        L_0x0176:
            android.content.Context r4 = r11.f3804u0
            r6 = 14
            android.graphics.drawable.Drawable r4 = b6.c.c(r4, r1, r6)
            r11.R(r4)
            r4 = 17
            boolean r6 = r1.hasValue(r4)
            if (r6 == 0) goto L_0x0192
            android.content.Context r6 = r11.f3804u0
            android.content.res.ColorStateList r4 = b6.c.a(r6, r1, r4)
            r11.T(r4)
        L_0x0192:
            r4 = 16
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.getDimension(r4, r6)
            r11.S(r4)
            r4 = 31
            boolean r4 = r1.getBoolean(r4, r13)
            r11.f0(r4)
            if (r7 == 0) goto L_0x01c1
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01c1
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x01c1
            r4 = 26
            boolean r4 = r1.getBoolean(r4, r13)
            r11.f0(r4)
        L_0x01c1:
            android.content.Context r4 = r11.f3804u0
            r6 = 25
            android.graphics.drawable.Drawable r4 = b6.c.c(r4, r1, r6)
            r11.Z(r4)
            android.content.Context r4 = r11.f3804u0
            r6 = 30
            android.content.res.ColorStateList r4 = b6.c.a(r4, r1, r6)
            r11.e0(r4)
            r4 = 28
            float r4 = r1.getDimension(r4, r3)
            r11.b0(r4)
            r4 = 6
            boolean r4 = r1.getBoolean(r4, r13)
            r11.K(r4)
            r4 = 10
            boolean r4 = r1.getBoolean(r4, r13)
            r11.N(r4)
            if (r7 == 0) goto L_0x020c
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x020c
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L_0x020c
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r13)
            r11.N(r2)
        L_0x020c:
            android.content.Context r2 = r11.f3804u0
            r4 = 7
            android.graphics.drawable.Drawable r2 = b6.c.c(r2, r1, r4)
            r11.L(r2)
            r2 = 9
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x0227
            android.content.Context r4 = r11.f3804u0
            android.content.res.ColorStateList r2 = b6.c.a(r4, r1, r2)
            r11.M(r2)
        L_0x0227:
            android.content.Context r2 = r11.f3804u0
            r4 = 39
            boolean r6 = r1.hasValue(r4)
            if (r6 == 0) goto L_0x023c
            int r4 = r1.getResourceId(r4, r13)
            if (r4 == 0) goto L_0x023c
            f5.g r2 = f5.g.a(r2, r4)
            goto L_0x023d
        L_0x023c:
            r2 = r5
        L_0x023d:
            r11.f3794k0 = r2
            android.content.Context r2 = r11.f3804u0
            r4 = 33
            boolean r6 = r1.hasValue(r4)
            if (r6 == 0) goto L_0x0253
            int r4 = r1.getResourceId(r4, r13)
            if (r4 == 0) goto L_0x0253
            f5.g r5 = f5.g.a(r2, r4)
        L_0x0253:
            r11.f3795l0 = r5
            r2 = 21
            float r2 = r1.getDimension(r2, r3)
            r11.W(r2)
            r2 = 35
            float r2 = r1.getDimension(r2, r3)
            r11.h0(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r3)
            r11.g0(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r3)
            r11.m0(r2)
            r2 = 40
            float r2 = r1.getDimension(r2, r3)
            r11.l0(r2)
            r2 = 29
            float r2 = r1.getDimension(r2, r3)
            r11.c0(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r3)
            r11.a0(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r3)
            r11.Q(r2)
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r11.U0 = r2
            r1.recycle()
            int[] r6 = new int[r13]
            r15 = 2131821566(0x7f1103fe, float:1.9275879E38)
            r16 = 2130903240(0x7f0300c8, float:1.7413292E38)
            r4 = 2130903240(0x7f0300c8, float:1.7413292E38)
            r5 = 2131821566(0x7f1103fe, float:1.9275879E38)
            r1 = r8
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = x5.o.d(r1, r2, r3, r4, r5, r6)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r13)
            r0.C = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = x5.t.a(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.E = r2
            r1.recycle()
            r0.setChipDrawable(r11)
            float r1 = n0.x.i.i(r17)
            r11.n(r1)
            int[] r6 = new int[r13]
            r1 = r8
            r2 = r19
            r3 = r12
            r4 = r16
            r5 = r15
            android.content.res.TypedArray r1 = x5.o.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r14)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.G = r1
            r17.i()
            if (r2 != 0) goto L_0x031b
            p5.a r1 = new p5.a
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x031b:
            boolean r1 = r0.f3772y
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r11.U
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r11.S0
            r0.setEllipsize(r1)
            r17.m()
            com.google.android.material.chip.a r1 = r0.f3767t
            boolean r1 = r1.T0
            if (r1 != 0) goto L_0x0339
            r0.setLines(r10)
            r0.setHorizontallyScrolling(r10)
        L_0x0339:
            r0.setGravity(r9)
            r17.l()
            boolean r1 = r0.C
            if (r1 == 0) goto L_0x0348
            int r1 = r0.E
            r0.setMinHeight(r1)
        L_0x0348:
            int r1 = n0.x.e.d(r17)
            r0.D = r1
            return
        L_0x034f:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x0357:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x035d:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0363:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x036b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.J.setEmpty();
        if (e() && this.f3770w != null) {
            a aVar = this.f3767t;
            aVar.B(aVar.getBounds(), this.J);
        }
        return this.J;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.I.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.I;
    }

    private d getTextAppearance() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.A0.f12858f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.z != z10) {
            this.z = z10;
            refreshDrawableState();
        }
    }

    public final void a() {
        d(this.E);
        requestLayout();
        invalidateOutline();
    }

    public final boolean d(int i) {
        this.E = i;
        int i10 = 0;
        if (!this.C) {
            if (this.f3768u != null) {
                h();
            } else {
                j();
            }
            return false;
        }
        int max = Math.max(0, i - ((int) this.f3767t.P));
        int max2 = Math.max(0, i - this.f3767t.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i11 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i10 = max / 2;
            }
            int i12 = i10;
            if (this.f3768u != null) {
                Rect rect = new Rect();
                this.f3768u.getPadding(rect);
                if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                    j();
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            this.f3768u = new InsetDrawable(this.f3767t, i11, i12, i11, i12);
            j();
            return true;
        }
        if (this.f3768u != null) {
            h();
        } else {
            j();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.H
            if (r0 != 0) goto L_0x0009
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L_0x0009:
            com.google.android.material.chip.Chip$b r0 = r9.G
            android.view.accessibility.AccessibilityManager r1 = r0.f11206h
            boolean r1 = r1.isEnabled()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0074
            android.view.accessibility.AccessibilityManager r1 = r0.f11206h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x001e
            goto L_0x0074
        L_0x001e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L_0x0044
            r4 = 9
            if (r1 == r4) goto L_0x0044
            r4 = 10
            if (r1 == r4) goto L_0x0034
            goto L_0x0074
        L_0x0034:
            int r1 = r0.f11210m
            if (r1 == r7) goto L_0x0074
            if (r1 != r7) goto L_0x003b
            goto L_0x0072
        L_0x003b:
            r0.f11210m = r7
            r0.s(r7, r6)
            r0.s(r1, r5)
            goto L_0x0072
        L_0x0044:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.e()
            if (r8 == 0) goto L_0x0062
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L_0x0062
            r1 = r2
            goto L_0x0063
        L_0x0062:
            r1 = r3
        L_0x0063:
            int r4 = r0.f11210m
            if (r4 != r1) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r0.f11210m = r1
            r0.s(r1, r6)
            r0.s(r4, r5)
        L_0x0070:
            if (r1 == r7) goto L_0x0074
        L_0x0072:
            r0 = r2
            goto L_0x0075
        L_0x0074:
            r0 = r3
        L_0x0075:
            if (r0 != 0) goto L_0x007f
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r2 = r3
        L_0x007f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.H) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.G;
        Objects.requireNonNull(bVar);
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i10 = 33;
                                } else if (keyCode == 21) {
                                    i10 = 17;
                                } else if (keyCode != 22) {
                                    i10 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i11 = 0;
                                while (i < repeatCount && bVar.n(i10, (Rect) null)) {
                                    i++;
                                    i11 = 1;
                                }
                                i = i11;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = bVar.f11209l;
                    if (i12 != Integer.MIN_VALUE) {
                        bVar.p(i12, 16);
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = bVar.n(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = bVar.n(1, (Rect) null);
            }
        }
        if (i == 0 || this.G.f11209l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f3767t;
        int i = 0;
        if (aVar != null && a.H(aVar.b0)) {
            a aVar2 = this.f3767t;
            int isEnabled = isEnabled();
            if (this.B) {
                isEnabled++;
            }
            if (this.A) {
                isEnabled++;
            }
            if (this.z) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.B) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.A) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.z) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            i = aVar2.d0(iArr);
        }
        if (i != 0) {
            invalidate();
        }
    }

    public final boolean e() {
        a aVar = this.f3767t;
        return (aVar == null || aVar.E() == null) ? false : true;
    }

    public final boolean f() {
        a aVar = this.f3767t;
        return aVar != null && aVar.f3790g0;
    }

    public final boolean g() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f3770w;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.H) {
            this.G.s(1, 1);
        }
        return z10;
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.F)) {
            return this.F;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f3778w.f12802d) ? "android.widget.CompoundButton" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3768u;
        return insetDrawable == null ? this.f3767t : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3792i0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3793j0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.O;
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return Math.max(0.0f, aVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3767t;
    }

    public float getChipEndPadding() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3803t0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        a aVar = this.f3767t;
        if (aVar == null || (drawable = aVar.W) == null) {
            return null;
        }
        return h0.a.a(drawable);
    }

    public float getChipIconSize() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.P;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3796m0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.R;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.S;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.E();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3789f0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3802s0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3788e0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3801r0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3787d0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.S0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.H) {
            b bVar = this.G;
            if (bVar.f11209l == 1 || bVar.f11208k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3795l0;
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3798o0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3797n0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public e6.i getShapeAppearanceModel() {
        return this.f3767t.f4653a.f4664a;
    }

    public g getShowMotionSpec() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3794k0;
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3800q0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f3767t;
        if (aVar != null) {
            return aVar.f3799p0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f3768u != null) {
            this.f3768u = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            j();
        }
    }

    public final void i() {
        if (e()) {
            a aVar = this.f3767t;
            if ((aVar != null && aVar.f3785a0) && this.f3770w != null) {
                x.p(this, this.G);
                this.H = true;
                return;
            }
        }
        x.p(this, (n0.a) null);
        this.H = false;
    }

    public final void j() {
        int[] iArr = c6.a.f3250a;
        k();
    }

    public final void k() {
        this.f3769v = new RippleDrawable(c6.a.c(this.f3767t.T), getBackgroundDrawable(), (Drawable) null);
        this.f3767t.n0();
        RippleDrawable rippleDrawable = this.f3769v;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.q(this, rippleDrawable);
        l();
    }

    public final void l() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f3767t) != null) {
            int C2 = (int) (aVar.C() + aVar.f3803t0 + aVar.f3800q0);
            a aVar2 = this.f3767t;
            int z10 = (int) (aVar2.z() + aVar2.f3796m0 + aVar2.f3799p0);
            if (this.f3768u != null) {
                Rect rect = new Rect();
                this.f3768u.getPadding(rect);
                z10 += rect.left;
                C2 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.e.k(this, z10, paddingTop, C2, paddingBottom);
        }
    }

    public final void m() {
        TextPaint paint = getPaint();
        a aVar = this.f3767t;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.K);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.b.F0(this, this.f3767t);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, M);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        super.onFocusChanged(z10, i, rect);
        if (this.H) {
            b bVar = this.G;
            int i10 = bVar.f11209l;
            if (i10 != Integer.MIN_VALUE) {
                bVar.k(i10);
            }
            if (z10) {
                bVar.n(i, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i10 = -1;
            if (chipGroup.f12833c) {
                int i11 = 0;
                i = 0;
                while (true) {
                    if (i11 >= chipGroup.getChildCount()) {
                        break;
                    }
                    if (chipGroup.getChildAt(i11) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i11)) == this) {
                            break;
                        }
                        i++;
                    }
                    i11++;
                }
            }
            i = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i10 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(i10, 1, i, 1, isChecked()).f9187a);
        }
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.D != i) {
            this.D = i;
            l();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.z
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.z
            if (r0 == 0) goto L_0x0034
            r5.g()
            r0 = r3
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.F = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3769v) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3769v) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.K(z10);
        }
    }

    public void setCheckableResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.K(aVar.f3804u0.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z10) {
        i.a<Chip> aVar;
        a aVar2 = this.f3767t;
        if (aVar2 == null) {
            this.f3772y = z10;
        } else if (aVar2.f3790g0) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked != z10 && (aVar = this.f3771x) != null) {
                x5.a aVar3 = (x5.a) aVar;
                Objects.requireNonNull(aVar3);
                if (!z10) {
                    x5.b bVar = aVar3.f12798a;
                    if (!bVar.e(this, bVar.f12803e)) {
                        return;
                    }
                } else if (!aVar3.f12798a.a(this)) {
                    return;
                }
                aVar3.f12798a.d();
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.L(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.L(a.b.a0(aVar.f3804u0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.M(a.b.Z(aVar.f3804u0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.N(aVar.f3804u0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.O(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.O(a.b.Z(aVar.f3804u0, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.P(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.P(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f3767t;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.R0 = new WeakReference<>((Object) null);
            }
            this.f3767t = aVar;
            aVar.T0 = false;
            Objects.requireNonNull(aVar);
            aVar.R0 = new WeakReference<>(this);
            d(this.E);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.Q(f10);
        }
    }

    public void setChipEndPaddingResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.Q(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.R(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.R(a.b.a0(aVar.f3804u0, i));
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setChipIconSizeResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.S(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.T(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.T(a.b.Z(aVar.f3804u0, i));
        }
    }

    public void setChipIconVisible(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.U(aVar.f3804u0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.V(f10);
        }
    }

    public void setChipMinHeightResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.V(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.W(f10);
        }
    }

    public void setChipStartPaddingResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.W(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.X(a.b.Z(aVar.f3804u0, i));
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.Y(f10);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.Y(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.Z(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f3767t;
        if (aVar != null && aVar.f3789f0 != charSequence) {
            l0.a c10 = l0.a.c();
            aVar.f3789f0 = (SpannableStringBuilder) c10.d(charSequence, c10.f7742c);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.a0(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.a0(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.Z(a.b.a0(aVar.f3804u0, i));
        }
        i();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.b0(f10);
        }
    }

    public void setCloseIconSizeResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.b0(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.c0(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.c0(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.e0(a.b.Z(aVar.f3804u0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i11 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i10, i11, i12);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i11 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i10, i11, i12);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.n(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3767t != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f3767t;
                if (aVar != null) {
                    aVar.S0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.C = z10;
        d(this.E);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(g gVar) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.f3795l0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.f3795l0 = g.a(aVar.f3804u0, i);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.g0(f10);
        }
    }

    public void setIconEndPaddingResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.g0(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.h0(f10);
        }
    }

    public void setIconStartPaddingResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.h0(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(i.a<Chip> aVar) {
        this.f3771x = aVar;
    }

    public void setLayoutDirection(int i) {
        if (this.f3767t != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.U0 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3770w = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.i0(colorStateList);
        }
        if (!this.f3767t.P0) {
            k();
        }
    }

    public void setRippleColorResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.i0(a.b.Z(aVar.f3804u0, i));
            if (!this.f3767t.P0) {
                k();
            }
        }
    }

    public void setShapeAppearanceModel(e6.i iVar) {
        this.f3767t.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.f3794k0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.f3794k0 = g.a(aVar.f3804u0, i);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f3767t;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            super.setText(aVar.T0 ? null : charSequence, bufferType);
            a aVar2 = this.f3767t;
            if (aVar2 != null) {
                aVar2.j0(charSequence);
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.k0(dVar);
        }
        m();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.l0(f10);
        }
    }

    public void setTextEndPaddingResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.l0(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.m0(f10);
        }
    }

    public void setTextStartPaddingResource(int i) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.m0(aVar.f3804u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.f0(z10);
        }
        i();
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.N(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.U(z10);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.k0(new d(aVar.f3804u0, i));
        }
        m();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        a aVar = this.f3767t;
        if (aVar != null) {
            aVar.k0(new d(aVar.f3804u0, i));
        }
        m();
    }
}
