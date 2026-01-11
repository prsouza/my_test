package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.d;
import io.nodle.cash.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n0.a0;
import n0.v;
import n0.x;
import q0.g;

public class SwitchCompat extends CompoundButton {

    /* renamed from: i0  reason: collision with root package name */
    public static final Property<SwitchCompat, Float> f1090i0 = new a();

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f1091j0 = {16842912};
    public int A;
    public int B;
    public boolean C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public float L;
    public VelocityTracker M;
    public int N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final TextPaint W;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f1092a;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f1093a0;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1094b;
    public StaticLayout b0;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1095c;

    /* renamed from: c0  reason: collision with root package name */
    public StaticLayout f1096c0;

    /* renamed from: d0  reason: collision with root package name */
    public l.a f1097d0;

    /* renamed from: e0  reason: collision with root package name */
    public ObjectAnimator f1098e0;

    /* renamed from: f0  reason: collision with root package name */
    public o f1099f0;

    /* renamed from: g0  reason: collision with root package name */
    public b f1100g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f1101h0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1102s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1103t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f1104u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f1105v;

    /* renamed from: w  reason: collision with root package name */
    public PorterDuff.Mode f1106w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1107x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1108y;
    public int z;

    public class a extends Property<SwitchCompat, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).O);
        }

        public final void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    }

    public static class b extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<SwitchCompat> f1109a;

        public b(SwitchCompat switchCompat) {
            this.f1109a = new WeakReference(switchCompat);
        }

        public final void a() {
            SwitchCompat switchCompat = this.f1109a.get();
            if (switchCompat != null) {
                switchCompat.e();
            }
        }

        public final void b() {
            SwitchCompat switchCompat = this.f1109a.get();
            if (switchCompat != null) {
                switchCompat.e();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    private o getEmojiTextViewHelper() {
        if (this.f1099f0 == null) {
            this.f1099f0 = new o(this);
        }
        return this.f1099f0;
    }

    private boolean getTargetCheckedState() {
        return this.O > 0.5f;
    }

    private int getThumbOffset() {
        float f10;
        if (k1.b(this)) {
            f10 = 1.0f - this.O;
        } else {
            f10 = this.O;
        }
        return (int) ((f10 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1104u;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1101h0;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1092a;
        if (drawable2 != null) {
            rect = k0.d(drawable2);
        } else {
            rect = k0.f1303c;
        }
        return ((((this.P - this.R) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.F = charSequence;
        this.G = c(charSequence);
        this.f1096c0 = null;
        if (this.H) {
            h();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.D = charSequence;
        this.E = c(charSequence);
        this.b0 = null;
        if (this.H) {
            h();
        }
    }

    public final void a() {
        Drawable drawable = this.f1092a;
        if (drawable == null) {
            return;
        }
        if (this.f1102s || this.f1103t) {
            Drawable mutate = drawable.mutate();
            this.f1092a = mutate;
            if (this.f1102s) {
                mutate.setTintList(this.f1094b);
            }
            if (this.f1103t) {
                this.f1092a.setTintMode(this.f1095c);
            }
            if (this.f1092a.isStateful()) {
                this.f1092a.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1104u;
        if (drawable == null) {
            return;
        }
        if (this.f1107x || this.f1108y) {
            Drawable mutate = drawable.mutate();
            this.f1104u = mutate;
            if (this.f1107x) {
                mutate.setTintList(this.f1105v);
            }
            if (this.f1108y) {
                this.f1104u.setTintMode(this.f1106w);
            }
            if (this.f1104u.isStateful()) {
                this.f1104u.setState(getDrawableState());
            }
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        TransformationMethod e10 = getEmojiTextViewHelper().f1351b.f12745a.e(this.f1097d0);
        return e10 != null ? e10.getTransformation(charSequence, this) : charSequence;
    }

    public final Layout d(CharSequence charSequence) {
        TextPaint textPaint = this.W;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i10;
        Rect rect2 = this.f1101h0;
        int i11 = this.S;
        int i12 = this.T;
        int i13 = this.U;
        int i14 = this.V;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f1092a;
        if (drawable != null) {
            rect = k0.d(drawable);
        } else {
            rect = k0.f1303c;
        }
        Drawable drawable2 = this.f1104u;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i15 = rect2.left;
            thumbOffset += i15;
            if (rect != null) {
                int i16 = rect.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                i = i17 > i18 ? (i17 - i18) + i12 : i12;
                int i19 = rect.right;
                int i20 = rect2.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rect.bottom;
                int i22 = rect2.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                    this.f1104u.setBounds(i11, i, i13, i10);
                }
            } else {
                i = i12;
            }
            i10 = i14;
            this.f1104u.setBounds(i11, i, i13, i10);
        }
        Drawable drawable3 = this.f1092a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i23 = thumbOffset - rect2.left;
            int i24 = thumbOffset + this.R + rect2.right;
            this.f1092a.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1092a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f1104u;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1092a;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1104u;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        setTextOnInternal(this.D);
        setTextOffInternal(this.F);
        requestLayout();
    }

    public final void f() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.F;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            new v(CharSequence.class).e(this, obj);
        }
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.D;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            new v(CharSequence.class).e(this, obj);
        }
    }

    public int getCompoundPaddingLeft() {
        if (!k1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.P;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.B : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (k1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.P;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.B : compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.H;
    }

    public boolean getSplitTrack() {
        return this.C;
    }

    public int getSwitchMinWidth() {
        return this.A;
    }

    public int getSwitchPadding() {
        return this.B;
    }

    public CharSequence getTextOff() {
        return this.F;
    }

    public CharSequence getTextOn() {
        return this.D;
    }

    public Drawable getThumbDrawable() {
        return this.f1092a;
    }

    public int getThumbTextPadding() {
        return this.z;
    }

    public ColorStateList getThumbTintList() {
        return this.f1094b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1095c;
    }

    public Drawable getTrackDrawable() {
        return this.f1104u;
    }

    public ColorStateList getTrackTintList() {
        return this.f1105v;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1106w;
    }

    public final void h() {
        if (this.f1100g0 == null && this.f1099f0.f1351b.f12745a.b() && d.c()) {
            d a10 = d.a();
            int b10 = a10.b();
            if (b10 == 3 || b10 == 0) {
                b bVar = new b(this);
                this.f1100g0 = bVar;
                a10.j(bVar);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1092a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1104u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1098e0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1098e0.end();
            this.f1098e0 = null;
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1091j0);
        }
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1101h0;
        Drawable drawable = this.f1104u;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.T;
        int i11 = this.V;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1092a;
        if (drawable != null) {
            if (!this.C || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = k0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.b0 : this.f1096c0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1093a0;
            if (colorStateList != null) {
                this.W.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.W.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (staticLayout.getWidth() / 2)), (float) (((i12 + i13) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.D : this.F;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        super.onLayout(z10, i, i10, i11, i12);
        int i18 = 0;
        if (this.f1092a != null) {
            Rect rect = this.f1101h0;
            Drawable drawable = this.f1104u;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = k0.d(this.f1092a);
            i13 = Math.max(0, d10.left - rect.left);
            i18 = Math.max(0, d10.right - rect.right);
        } else {
            i13 = 0;
        }
        if (k1.b(this)) {
            i15 = getPaddingLeft() + i13;
            i14 = ((this.P + i15) - i13) - i18;
        } else {
            i14 = (getWidth() - getPaddingRight()) - i18;
            i15 = (i14 - this.P) + i13 + i18;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i19 = this.Q;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i19 / 2);
            int i20 = height;
            i16 = i19 + height;
            i17 = i20;
        } else if (gravity != 80) {
            i17 = getPaddingTop();
            i16 = this.Q + i17;
        } else {
            i16 = getHeight() - getPaddingBottom();
            i17 = i16 - this.Q;
        }
        this.S = i15;
        this.T = i17;
        this.V = i16;
        this.U = i14;
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.H) {
            if (this.b0 == null) {
                this.b0 = (StaticLayout) d(this.E);
            }
            if (this.f1096c0 == null) {
                this.f1096c0 = (StaticLayout) d(this.G);
            }
        }
        Rect rect = this.f1101h0;
        Drawable drawable = this.f1092a;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f1092a.getIntrinsicWidth() - rect.left) - rect.right;
            i11 = this.f1092a.getIntrinsicHeight();
        } else {
            i12 = 0;
            i11 = 0;
        }
        if (this.H) {
            i13 = (this.z * 2) + Math.max(this.b0.getWidth(), this.f1096c0.getWidth());
        } else {
            i13 = 0;
        }
        this.R = Math.max(i13, i12);
        Drawable drawable2 = this.f1104u;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f1104u.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f1092a;
        if (drawable3 != null) {
            Rect d10 = k0.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = Math.max(this.A, (this.R * 2) + i15 + i16);
        int max2 = Math.max(i14, i11);
        this.P = max;
        this.Q = max2;
        super.onMeasure(i, i10);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.D : this.F;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.M
            r0.addMovement(r11)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00fd
            r3 = 3
            r4 = 0
            r5 = 2
            if (r0 == r2) goto L_0x0090
            if (r0 == r5) goto L_0x0018
            if (r0 == r3) goto L_0x0090
            goto L_0x0150
        L_0x0018:
            int r0 = r10.I
            if (r0 == r2) goto L_0x005c
            if (r0 == r5) goto L_0x0020
            goto L_0x0150
        L_0x0020:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.K
            float r1 = r11 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003c
        L_0x0033:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r1 = r3
            goto L_0x003c
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L_0x003c:
            boolean r0 = androidx.appcompat.widget.k1.b(r10)
            if (r0 == 0) goto L_0x0043
            float r1 = -r1
        L_0x0043:
            float r0 = r10.O
            float r1 = r1 + r0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            r4 = r3
            goto L_0x0052
        L_0x0051:
            r4 = r1
        L_0x0052:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            r10.K = r11
            r10.setThumbPosition(r4)
        L_0x005b:
            return r2
        L_0x005c:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.K
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.J
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0082
            float r3 = r10.L
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.J
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0150
        L_0x0082:
            r10.I = r5
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            r10.K = r0
            r10.L = r1
            return r2
        L_0x0090:
            int r0 = r10.I
            if (r0 != r5) goto L_0x00f5
            r10.I = r1
            int r0 = r11.getAction()
            if (r0 != r2) goto L_0x00a4
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x00a4
            r0 = r2
            goto L_0x00a5
        L_0x00a4:
            r0 = r1
        L_0x00a5:
            boolean r5 = r10.isChecked()
            if (r0 == 0) goto L_0x00db
            android.view.VelocityTracker r0 = r10.M
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r10.M
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r10.N
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            boolean r6 = androidx.appcompat.widget.k1.b(r10)
            if (r6 == 0) goto L_0x00ce
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d4
            goto L_0x00d2
        L_0x00ce:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d4
        L_0x00d2:
            r0 = r2
            goto L_0x00dc
        L_0x00d4:
            r0 = r1
            goto L_0x00dc
        L_0x00d6:
            boolean r0 = r10.getTargetCheckedState()
            goto L_0x00dc
        L_0x00db:
            r0 = r5
        L_0x00dc:
            if (r0 == r5) goto L_0x00e1
            r10.playSoundEffect(r1)
        L_0x00e1:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r2
        L_0x00f5:
            r10.I = r1
            android.view.VelocityTracker r0 = r10.M
            r0.clear()
            goto L_0x0150
        L_0x00fd:
            float r0 = r11.getX()
            float r3 = r11.getY()
            boolean r4 = r10.isEnabled()
            if (r4 == 0) goto L_0x0150
            android.graphics.drawable.Drawable r4 = r10.f1092a
            if (r4 != 0) goto L_0x0110
            goto L_0x0148
        L_0x0110:
            int r4 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r10.f1092a
            android.graphics.Rect r6 = r10.f1101h0
            r5.getPadding(r6)
            int r5 = r10.T
            int r6 = r10.J
            int r5 = r5 - r6
            int r7 = r10.S
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r10.R
            int r4 = r4 + r7
            android.graphics.Rect r8 = r10.f1101h0
            int r9 = r8.left
            int r4 = r4 + r9
            int r8 = r8.right
            int r4 = r4 + r8
            int r4 = r4 + r6
            int r8 = r10.V
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0148
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0148
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0148
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0148
            r1 = r2
        L_0x0148:
            if (r1 == 0) goto L_0x0150
            r10.I = r2
            r10.K = r0
            r10.L = r3
        L_0x0150:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            g();
        } else {
            f();
        }
        float f10 = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.g.c(this)) {
                if (!isChecked) {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1090i0, new float[]{f10});
                this.f1098e0 = ofFloat;
                ofFloat.setDuration(250);
                this.f1098e0.setAutoCancel(true);
                this.f1098e0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1098e0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f10 = 0.0f;
        }
        setThumbPosition(f10);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.D);
        setTextOffInternal(this.F);
        requestLayout();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            requestLayout();
            if (z10) {
                h();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.C = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.A = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.B = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.W.getTypeface() != null && !this.W.getTypeface().equals(typeface)) || (this.W.getTypeface() == null && typeface != null)) {
            this.W.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            f();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            g();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1092a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1092a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.O = f10;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(a.b.a0(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.z = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1094b = colorStateList;
        this.f1102s = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1095c = mode;
        this.f1103t = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1104u;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1104u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(a.b.a0(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1105v = colorStateList;
        this.f1107x = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1106w = mode;
        this.f1108y = true;
        b();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1092a || drawable == this.f1104u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010b, code lost:
        r9 = a.b.Z(r12, (r9 = r7.getResourceId(3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r14 = 2130904075(0x7f03040b, float:1.7414986E38)
            r11.<init>(r12, r13, r14)
            r0 = 0
            r11.f1094b = r0
            r11.f1095c = r0
            r1 = 0
            r11.f1102s = r1
            r11.f1103t = r1
            r11.f1105v = r0
            r11.f1106w = r0
            r11.f1107x = r1
            r11.f1108y = r1
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r11.M = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r11.f1101h0 = r2
            android.content.Context r2 = r11.getContext()
            androidx.appcompat.widget.y0.a(r11, r2)
            android.text.TextPaint r2 = new android.text.TextPaint
            r3 = 1
            r2.<init>(r3)
            r11.W = r2
            android.content.res.Resources r4 = r11.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r2.density = r4
            int[] r7 = ad.c.Q
            androidx.appcompat.widget.d1 r4 = new androidx.appcompat.widget.d1
            android.content.res.TypedArray r9 = r12.obtainStyledAttributes(r13, r7, r14, r1)
            r4.<init>(r12, r9)
            r10 = 2130904075(0x7f03040b, float:1.7414986E38)
            r5 = r11
            r6 = r12
            r8 = r13
            n0.x.o(r5, r6, r7, r8, r9, r10)
            r5 = 2
            android.graphics.drawable.Drawable r6 = r4.g(r5)
            r11.f1092a = r6
            if (r6 == 0) goto L_0x0060
            r6.setCallback(r11)
        L_0x0060:
            r6 = 11
            android.graphics.drawable.Drawable r6 = r4.g(r6)
            r11.f1104u = r6
            if (r6 == 0) goto L_0x006d
            r6.setCallback(r11)
        L_0x006d:
            java.lang.CharSequence r6 = r4.n(r1)
            r11.setTextOnInternal(r6)
            java.lang.CharSequence r6 = r4.n(r3)
            r11.setTextOffInternal(r6)
            r6 = 3
            boolean r7 = r4.a(r6, r3)
            r11.H = r7
            r7 = 8
            int r7 = r4.f(r7, r1)
            r11.z = r7
            r7 = 5
            int r7 = r4.f(r7, r1)
            r11.A = r7
            r7 = 6
            int r7 = r4.f(r7, r1)
            r11.B = r7
            r7 = 4
            boolean r7 = r4.a(r7, r1)
            r11.C = r7
            r7 = 9
            android.content.res.ColorStateList r7 = r4.c(r7)
            if (r7 == 0) goto L_0x00ab
            r11.f1094b = r7
            r11.f1102s = r3
        L_0x00ab:
            r7 = 10
            r8 = -1
            int r7 = r4.j(r7, r8)
            android.graphics.PorterDuff$Mode r7 = androidx.appcompat.widget.k0.e(r7, r0)
            android.graphics.PorterDuff$Mode r9 = r11.f1095c
            if (r9 == r7) goto L_0x00be
            r11.f1095c = r7
            r11.f1103t = r3
        L_0x00be:
            boolean r7 = r11.f1102s
            if (r7 != 0) goto L_0x00c6
            boolean r7 = r11.f1103t
            if (r7 == 0) goto L_0x00c9
        L_0x00c6:
            r11.a()
        L_0x00c9:
            r7 = 12
            android.content.res.ColorStateList r7 = r4.c(r7)
            if (r7 == 0) goto L_0x00d5
            r11.f1105v = r7
            r11.f1107x = r3
        L_0x00d5:
            r7 = 13
            int r7 = r4.j(r7, r8)
            android.graphics.PorterDuff$Mode r7 = androidx.appcompat.widget.k0.e(r7, r0)
            android.graphics.PorterDuff$Mode r9 = r11.f1106w
            if (r9 == r7) goto L_0x00e7
            r11.f1106w = r7
            r11.f1108y = r3
        L_0x00e7:
            boolean r7 = r11.f1107x
            if (r7 != 0) goto L_0x00ef
            boolean r7 = r11.f1108y
            if (r7 == 0) goto L_0x00f2
        L_0x00ef:
            r11.b()
        L_0x00f2:
            r7 = 7
            int r7 = r4.l(r7, r1)
            if (r7 == 0) goto L_0x01a8
            int[] r9 = ad.c.R
            android.content.res.TypedArray r7 = r12.obtainStyledAttributes(r7, r9)
            boolean r9 = r7.hasValue(r6)
            if (r9 == 0) goto L_0x0112
            int r9 = r7.getResourceId(r6, r1)
            if (r9 == 0) goto L_0x0112
            android.content.res.ColorStateList r9 = a.b.Z(r12, r9)
            if (r9 == 0) goto L_0x0112
            goto L_0x0116
        L_0x0112:
            android.content.res.ColorStateList r9 = r7.getColorStateList(r6)
        L_0x0116:
            if (r9 == 0) goto L_0x011b
            r11.f1093a0 = r9
            goto L_0x0121
        L_0x011b:
            android.content.res.ColorStateList r9 = r11.getTextColors()
            r11.f1093a0 = r9
        L_0x0121:
            int r9 = r7.getDimensionPixelSize(r1, r1)
            if (r9 == 0) goto L_0x0136
            float r9 = (float) r9
            float r10 = r2.getTextSize()
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0136
            r2.setTextSize(r9)
            r11.requestLayout()
        L_0x0136:
            int r9 = r7.getInt(r3, r8)
            int r8 = r7.getInt(r5, r8)
            if (r9 == r3) goto L_0x014c
            if (r9 == r5) goto L_0x0149
            if (r9 == r6) goto L_0x0146
            r6 = r0
            goto L_0x014e
        L_0x0146:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            goto L_0x014e
        L_0x0149:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            goto L_0x014e
        L_0x014c:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
        L_0x014e:
            r9 = 0
            if (r8 <= 0) goto L_0x017c
            if (r6 != 0) goto L_0x0158
            android.graphics.Typeface r6 = android.graphics.Typeface.defaultFromStyle(r8)
            goto L_0x015c
        L_0x0158:
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r8)
        L_0x015c:
            r11.setSwitchTypeface(r6)
            if (r6 == 0) goto L_0x0166
            int r6 = r6.getStyle()
            goto L_0x0167
        L_0x0166:
            r6 = r1
        L_0x0167:
            int r6 = ~r6
            r6 = r6 & r8
            r8 = r6 & 1
            if (r8 == 0) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r3 = r1
        L_0x016f:
            r2.setFakeBoldText(r3)
            r3 = r6 & 2
            if (r3 == 0) goto L_0x0178
            r9 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0178:
            r2.setTextSkewX(r9)
            goto L_0x0185
        L_0x017c:
            r2.setFakeBoldText(r1)
            r2.setTextSkewX(r9)
            r11.setSwitchTypeface(r6)
        L_0x0185:
            r2 = 14
            boolean r1 = r7.getBoolean(r2, r1)
            if (r1 == 0) goto L_0x0199
            l.a r0 = new l.a
            android.content.Context r1 = r11.getContext()
            r0.<init>(r1)
            r11.f1097d0 = r0
            goto L_0x019b
        L_0x0199:
            r11.f1097d0 = r0
        L_0x019b:
            java.lang.CharSequence r0 = r11.D
            r11.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r11.F
            r11.setTextOffInternal(r0)
            r7.recycle()
        L_0x01a8:
            androidx.appcompat.widget.d0 r0 = new androidx.appcompat.widget.d0
            r0.<init>(r11)
            r0.f(r13, r14)
            r4.r()
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r12)
            int r0 = r12.getScaledTouchSlop()
            r11.J = r0
            int r12 = r12.getScaledMinimumFlingVelocity()
            r11.N = r12
            androidx.appcompat.widget.o r12 = r11.getEmojiTextViewHelper()
            r12.b(r13, r14)
            r11.refreshDrawableState()
            boolean r12 = r11.isChecked()
            r11.setChecked(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
