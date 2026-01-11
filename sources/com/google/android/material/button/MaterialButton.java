package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.g;
import e6.i;
import e6.l;
import io.nodle.cash.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import x5.o;
import x5.t;

public class MaterialButton extends g implements Checkable, l {
    public static final int[] F = {16842911};
    public static final int[] G = {16842912};
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;

    /* renamed from: s  reason: collision with root package name */
    public final m5.a f3741s;

    /* renamed from: t  reason: collision with root package name */
    public final LinkedHashSet<a> f3742t = new LinkedHashSet<>();

    /* renamed from: u  reason: collision with root package name */
    public b f3743u;

    /* renamed from: v  reason: collision with root package name */
    public PorterDuff.Mode f3744v;

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f3745w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f3746x;

    /* renamed from: y  reason: collision with root package name */
    public int f3747y;
    public int z;

    public interface a {
        void a();
    }

    public interface b {
    }

    public static class c extends s0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3748c;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new c[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeInt(this.f3748c ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f3748c = parcel.readInt() != 1 ? false : true;
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(j6.a.a(context, attributeSet, R.attr.materialButtonStyle, 2131821552), attributeSet, R.attr.materialButtonStyle);
        boolean z10 = false;
        this.C = false;
        this.D = false;
        Context context2 = getContext();
        TypedArray d10 = o.d(context2, attributeSet, e5.a.f4628n, R.attr.materialButtonStyle, 2131821552, new int[0]);
        this.B = d10.getDimensionPixelSize(12, 0);
        this.f3744v = t.d(d10.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f3745w = b6.c.a(getContext(), d10, 14);
        this.f3746x = b6.c.c(getContext(), d10, 10);
        this.E = d10.getInteger(11, 1);
        this.f3747y = d10.getDimensionPixelSize(13, 0);
        m5.a aVar = new m5.a(this, i.b(context2, attributeSet, R.attr.materialButtonStyle, 2131821552).a());
        this.f3741s = aVar;
        aVar.f8490c = d10.getDimensionPixelOffset(1, 0);
        aVar.f8491d = d10.getDimensionPixelOffset(2, 0);
        aVar.f8492e = d10.getDimensionPixelOffset(3, 0);
        aVar.f8493f = d10.getDimensionPixelOffset(4, 0);
        if (d10.hasValue(8)) {
            int dimensionPixelSize = d10.getDimensionPixelSize(8, -1);
            aVar.g = dimensionPixelSize;
            aVar.c(aVar.f8489b.e((float) dimensionPixelSize));
            aVar.f8501p = true;
        }
        aVar.f8494h = d10.getDimensionPixelSize(20, 0);
        aVar.i = t.d(d10.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f8495j = b6.c.a(getContext(), d10, 6);
        aVar.f8496k = b6.c.a(getContext(), d10, 19);
        aVar.f8497l = b6.c.a(getContext(), d10, 16);
        aVar.f8502q = d10.getBoolean(5, false);
        aVar.f8504s = d10.getDimensionPixelSize(9, 0);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int f10 = x.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = x.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d10.hasValue(0)) {
            aVar.f8500o = true;
            setSupportBackgroundTintList(aVar.f8495j);
            setSupportBackgroundTintMode(aVar.i);
        } else {
            aVar.e();
        }
        x.e.k(this, f10 + aVar.f8490c, paddingTop + aVar.f8492e, e10 + aVar.f8491d, paddingBottom + aVar.f8493f);
        d10.recycle();
        setCompoundDrawablePadding(this.B);
        g(this.f3746x != null ? true : z10);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        m5.a aVar = this.f3741s;
        return aVar != null && aVar.f8502q;
    }

    public final boolean b() {
        int i = this.E;
        return i == 3 || i == 4;
    }

    public final boolean c() {
        int i = this.E;
        return i == 1 || i == 2;
    }

    public final boolean d() {
        int i = this.E;
        return i == 16 || i == 32;
    }

    public final boolean e() {
        m5.a aVar = this.f3741s;
        return aVar != null && !aVar.f8500o;
    }

    public final void f() {
        if (c()) {
            setCompoundDrawablesRelative(this.f3746x, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (b()) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f3746x, (Drawable) null);
        } else if (d()) {
            setCompoundDrawablesRelative((Drawable) null, this.f3746x, (Drawable) null, (Drawable) null);
        }
    }

    public final void g(boolean z10) {
        Drawable drawable = this.f3746x;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3746x = mutate;
            mutate.setTintList(this.f3745w);
            PorterDuff.Mode mode = this.f3744v;
            if (mode != null) {
                this.f3746x.setTintMode(mode);
            }
            int i = this.f3747y;
            if (i == 0) {
                i = this.f3746x.getIntrinsicWidth();
            }
            int i10 = this.f3747y;
            if (i10 == 0) {
                i10 = this.f3746x.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3746x;
            int i11 = this.z;
            int i12 = this.A;
            drawable2.setBounds(i11, i12, i + i11, i10 + i12);
            this.f3746x.setVisible(true, z10);
        }
        if (z10) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!c() || drawable3 == this.f3746x) && ((!b() || drawable5 == this.f3746x) && (!d() || drawable4 == this.f3746x))) {
            z11 = false;
        }
        if (z11) {
            f();
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f3741s.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3746x;
    }

    public int getIconGravity() {
        return this.E;
    }

    public int getIconPadding() {
        return this.B;
    }

    public int getIconSize() {
        return this.f3747y;
    }

    public ColorStateList getIconTint() {
        return this.f3745w;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3744v;
    }

    public int getInsetBottom() {
        return this.f3741s.f8493f;
    }

    public int getInsetTop() {
        return this.f3741s.f8492e;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f3741s.f8497l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (e()) {
            return this.f3741s.f8489b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f3741s.f8496k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f3741s.f8494h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f3741s.f8495j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f3741s.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(int i, int i10) {
        if (this.f3746x != null && getLayout() != null) {
            if (c() || b()) {
                this.A = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i11 = this.E;
                boolean z10 = true;
                if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.z = 0;
                    g(false);
                    return;
                }
                int i12 = this.f3747y;
                if (i12 == 0) {
                    i12 = this.f3746x.getIntrinsicWidth();
                }
                int textWidth = i - getTextWidth();
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                int e10 = (((textWidth - x.e.e(this)) - i12) - this.B) - x.e.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                boolean z11 = x.e.d(this) == 1;
                if (this.E != 4) {
                    z10 = false;
                }
                if (z11 != z10) {
                    e10 = -e10;
                }
                if (this.z != e10) {
                    this.z = e10;
                    g(false);
                }
            } else if (d()) {
                this.z = 0;
                if (this.E == 16) {
                    this.A = 0;
                    g(false);
                    return;
                }
                int i13 = this.f3747y;
                if (i13 == 0) {
                    i13 = this.f3746x.getIntrinsicHeight();
                }
                int textHeight = (((((i10 - getTextHeight()) - getPaddingTop()) - i13) - this.B) - getPaddingBottom()) / 2;
                if (this.A != textHeight) {
                    this.A = textHeight;
                    g(false);
                }
            }
        }
    }

    public final boolean isChecked() {
        return this.C;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            a.b.F0(this, this.f3741s.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f10849a);
        setChecked(cVar.f3748c);
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3748c = this.C;
        return cVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3746x != null) {
            if (this.f3746x.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (e()) {
            m5.a aVar = this.f3741s;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            m5.a aVar = this.f3741s;
            aVar.f8500o = true;
            aVar.f8488a.setSupportBackgroundTintList(aVar.f8495j);
            aVar.f8488a.setSupportBackgroundTintMode(aVar.i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? a.b.a0(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (e()) {
            this.f3741s.f8502q = z10;
        }
    }

    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.C != z10) {
            this.C = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.C;
                if (!materialButtonToggleGroup.f3754u) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (!this.D) {
                this.D = true;
                Iterator<a> it = this.f3742t.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.D = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (e()) {
            m5.a aVar = this.f3741s;
            if (!aVar.f8501p || aVar.g != i) {
                aVar.g = i;
                aVar.f8501p = true;
                aVar.c(aVar.f8489b.e((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (e()) {
            this.f3741s.b(false).n(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3746x != drawable) {
            this.f3746x = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.E != i) {
            this.E = i;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.B != i) {
            this.B = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? a.b.a0(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f3747y != i) {
            this.f3747y = i;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3745w != colorStateList) {
            this.f3745w = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3744v != mode) {
            this.f3744v = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(a.b.Z(getContext(), i));
    }

    public void setInsetBottom(int i) {
        m5.a aVar = this.f3741s;
        aVar.d(aVar.f8492e, i);
    }

    public void setInsetTop(int i) {
        m5.a aVar = this.f3741s;
        aVar.d(i, aVar.f8493f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f3743u = bVar;
    }

    public void setPressed(boolean z10) {
        b bVar = this.f3743u;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            m5.a aVar = this.f3741s;
            if (aVar.f8497l != colorStateList) {
                aVar.f8497l = colorStateList;
                if (aVar.f8488a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.f8488a.getBackground()).setColor(c6.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(a.b.Z(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        if (e()) {
            this.f3741s.c(iVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (e()) {
            m5.a aVar = this.f3741s;
            aVar.f8499n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            m5.a aVar = this.f3741s;
            if (aVar.f8496k != colorStateList) {
                aVar.f8496k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(a.b.Z(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            m5.a aVar = this.f3741s;
            if (aVar.f8494h != i) {
                aVar.f8494h = i;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            m5.a aVar = this.f3741s;
            if (aVar.f8495j != colorStateList) {
                aVar.f8495j = colorStateList;
                if (aVar.b(false) != null) {
                    aVar.b(false).setTintList(aVar.f8495j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            m5.a aVar = this.f3741s;
            if (aVar.i != mode) {
                aVar.i = mode;
                if (aVar.b(false) != null && aVar.i != null) {
                    aVar.b(false).setTintMode(aVar.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void toggle() {
        setChecked(!this.C);
    }
}
