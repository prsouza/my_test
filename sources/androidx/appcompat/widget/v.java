package androidx.appcompat.widget;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import io.nodle.cash.R;
import java.util.Objects;

public class v extends RadioButton {

    /* renamed from: a  reason: collision with root package name */
    public final k f1402a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1403b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f1404c;

    /* renamed from: s  reason: collision with root package name */
    public o f1405s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        a1.a(context);
        y0.a(this, getContext());
        k kVar = new k(this);
        this.f1402a = kVar;
        kVar.b(attributeSet, R.attr.radioButtonStyle);
        f fVar = new f(this);
        this.f1403b = fVar;
        fVar.d(attributeSet, R.attr.radioButtonStyle);
        d0 d0Var = new d0(this);
        this.f1404c = d0Var;
        d0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private o getEmojiTextViewHelper() {
        if (this.f1405s == null) {
            this.f1405s = new o(this);
        }
        return this.f1405s;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1403b;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f1404c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        k kVar = this.f1402a;
        if (kVar != null) {
            Objects.requireNonNull(kVar);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1403b;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1403b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        k kVar = this.f1402a;
        if (kVar != null) {
            return kVar.f1296b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        k kVar = this.f1402a;
        if (kVar != null) {
            return kVar.f1297c;
        }
        return null;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1403b;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1403b;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        k kVar = this.f1402a;
        if (kVar == null) {
            return;
        }
        if (kVar.f1300f) {
            kVar.f1300f = false;
            return;
        }
        kVar.f1300f = true;
        kVar.a();
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1403b;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1403b;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        k kVar = this.f1402a;
        if (kVar != null) {
            kVar.f1296b = colorStateList;
            kVar.f1298d = true;
            kVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        k kVar = this.f1402a;
        if (kVar != null) {
            kVar.f1297c = mode;
            kVar.f1299e = true;
            kVar.a();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(b.a0(getContext(), i));
    }
}
