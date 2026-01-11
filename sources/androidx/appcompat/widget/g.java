package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import io.nodle.cash.R;
import java.util.Objects;
import q0.b;
import q0.i;

public class g extends Button implements b, i {

    /* renamed from: a  reason: collision with root package name */
    public final f f1244a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f1245b;

    /* renamed from: c  reason: collision with root package name */
    public o f1246c;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private o getEmojiTextViewHelper() {
        if (this.f1246c == null) {
            this.f1246c = new o(this);
        }
        return this.f1246c;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1244a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f10093r) {
            return super.getAutoSizeMaxTextSize();
        }
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            return Math.round(d0Var.i.f1254e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f10093r) {
            return super.getAutoSizeMinTextSize();
        }
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            return Math.round(d0Var.i.f1253d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f10093r) {
            return super.getAutoSizeStepGranularity();
        }
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            return Math.round(d0Var.i.f1252c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f10093r) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d0 d0Var = this.f1245b;
        return d0Var != null ? d0Var.i.f1255f : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!b.f10093r) {
            d0 d0Var = this.f1245b;
            if (d0Var != null) {
                return d0Var.i.f1250a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return q0.g.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1244a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1244a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        b1 b1Var = this.f1245b.f1197h;
        if (b1Var != null) {
            return b1Var.f1175a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        b1 b1Var = this.f1245b.f1197h;
        if (b1Var != null) {
            return b1Var.f1176b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i10, int i11, int i12) {
        super.onLayout(z, i, i10, i11, i12);
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            Objects.requireNonNull(d0Var);
            if (!b.f10093r) {
                d0Var.c();
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        d0 d0Var = this.f1245b;
        if (d0Var != null && !b.f10093r && d0Var.e()) {
            this.f1245b.c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i10, int i11, int i12) throws IllegalArgumentException {
        if (b.f10093r) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
            return;
        }
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            d0Var.j(i, i10, i11, i12);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (b.f10093r) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            d0Var.k(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f10093r) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            d0Var.l(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1244a;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1244a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q0.g.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            d0Var.i(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1244a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1244a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1245b.m(colorStateList);
        this.f1245b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1245b.n(mode);
        this.f1245b.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            d0Var.g(context, i);
        }
    }

    public final void setTextSize(int i, float f10) {
        boolean z = b.f10093r;
        if (z) {
            super.setTextSize(i, f10);
            return;
        }
        d0 d0Var = this.f1245b;
        if (d0Var != null) {
            Objects.requireNonNull(d0Var);
            if (!z && !d0Var.e()) {
                d0Var.i.f(i, f10);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        y0.a(this, getContext());
        f fVar = new f(this);
        this.f1244a = fVar;
        fVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.f1245b = d0Var;
        d0Var.f(attributeSet, i);
        d0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
