package androidx.appcompat.widget;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import io.nodle.cash.R;
import java.util.Objects;

public class h extends CheckBox {

    /* renamed from: a  reason: collision with root package name */
    public final k f1259a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1260b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f1261c;

    /* renamed from: s  reason: collision with root package name */
    public o f1262s;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private o getEmojiTextViewHelper() {
        if (this.f1262s == null) {
            this.f1262s = new o(this);
        }
        return this.f1262s;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1260b;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f1261c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        k kVar = this.f1259a;
        if (kVar != null) {
            Objects.requireNonNull(kVar);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1260b;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1260b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        k kVar = this.f1259a;
        if (kVar != null) {
            return kVar.f1296b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        k kVar = this.f1259a;
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
        f fVar = this.f1260b;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1260b;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        k kVar = this.f1259a;
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
        f fVar = this.f1260b;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1260b;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        k kVar = this.f1259a;
        if (kVar != null) {
            kVar.f1296b = colorStateList;
            kVar.f1298d = true;
            kVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        k kVar = this.f1259a;
        if (kVar != null) {
            kVar.f1297c = mode;
            kVar.f1299e = true;
            kVar.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        y0.a(this, getContext());
        k kVar = new k(this);
        this.f1259a = kVar;
        kVar.b(attributeSet, i);
        f fVar = new f(this);
        this.f1260b = fVar;
        fVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.f1261c = d0Var;
        d0Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(b.a0(getContext(), i));
    }
}
