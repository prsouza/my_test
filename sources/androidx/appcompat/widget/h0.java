package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public final class h0 extends ToggleButton {

    /* renamed from: a  reason: collision with root package name */
    public final f f1263a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f1264b;

    /* renamed from: c  reason: collision with root package name */
    public o f1265c;

    public h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        y0.a(this, getContext());
        f fVar = new f(this);
        this.f1263a = fVar;
        fVar.d(attributeSet, 16842827);
        d0 d0Var = new d0(this);
        this.f1264b = d0Var;
        d0Var.f(attributeSet, 16842827);
        getEmojiTextViewHelper().b(attributeSet, 16842827);
    }

    private o getEmojiTextViewHelper() {
        if (this.f1265c == null) {
            this.f1265c = new o(this);
        }
        return this.f1265c;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1263a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f1264b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1263a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1263a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1263a;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1263a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1263a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1263a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }
}
