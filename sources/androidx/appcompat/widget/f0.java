package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import g0.e;
import g0.k;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l0.c;
import q0.b;
import q0.g;
import q0.i;

public class f0 extends TextView implements i, b {

    /* renamed from: a  reason: collision with root package name */
    public final f f1224a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f1225b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f1226c;

    /* renamed from: s  reason: collision with root package name */
    public o f1227s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1228t;

    /* renamed from: u  reason: collision with root package name */
    public Future<c> f1229u;

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private o getEmojiTextViewHelper() {
        if (this.f1227s == null) {
            this.f1227s = new o(this);
        }
        return this.f1227s;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1224a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f10093r) {
            return super.getAutoSizeMaxTextSize();
        }
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            return Math.round(d0Var.i.f1254e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f10093r) {
            return super.getAutoSizeMinTextSize();
        }
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            return Math.round(d0Var.i.f1253d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f10093r) {
            return super.getAutoSizeStepGranularity();
        }
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            return Math.round(d0Var.i.f1252c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f10093r) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d0 d0Var = this.f1225b;
        return d0Var != null ? d0Var.i.f1255f : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!b.f10093r) {
            d0 d0Var = this.f1225b;
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
        return g.f(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1224a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1224a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        b1 b1Var = this.f1225b.f1197h;
        if (b1Var != null) {
            return b1Var.f1175a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        b1 b1Var = this.f1225b.f1197h;
        if (b1Var != null) {
            return b1Var.f1176b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<c> future = this.f1229u;
        if (future != null) {
            try {
                this.f1229u = null;
                g.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f1226c) == null) {
            return super.getTextClassifier();
        }
        return c0Var.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return g.a(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1225b.h(this, onCreateInputConnection, editorInfo);
        y.c.X(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        super.onLayout(z, i, i10, i11, i12);
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            Objects.requireNonNull(d0Var);
            if (!b.f10093r) {
                d0Var.c();
            }
        }
    }

    public void onMeasure(int i, int i10) {
        Future<c> future = this.f1229u;
        if (future != null) {
            try {
                this.f1229u = null;
                g.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i10);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        d0 d0Var = this.f1225b;
        if (d0Var != null && !b.f10093r && d0Var.e()) {
            this.f1225b.c();
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
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.j(i, i10, i11, i12);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (b.f10093r) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.k(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f10093r) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.l(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1224a;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1224a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            g.b(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            g.c(this, i);
        }
    }

    public void setLineHeight(int i) {
        g.d(this, i);
    }

    public void setPrecomputedText(c cVar) {
        g.e(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1224a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1224a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1225b.m(colorStateList);
        this.f1225b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1225b.n(mode);
        this.f1225b.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.g(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f1226c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f1190b = textClassifier;
        }
    }

    public void setTextFuture(Future<c> future) {
        this.f1229u = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f7749b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f7748a);
        setBreakStrategy(aVar.f7750c);
        setHyphenationFrequency(aVar.f7751d);
    }

    public final void setTextSize(int i, float f10) {
        boolean z = b.f10093r;
        if (z) {
            super.setTextSize(i, f10);
            return;
        }
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            Objects.requireNonNull(d0Var);
            if (!z && !d0Var.e()) {
                d0Var.i.f(i, f10);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i) {
        if (!this.f1228t) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                Context context = getContext();
                k kVar = e.f5210a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f1228t = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f1228t = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        this.f1228t = false;
        y0.a(this, getContext());
        f fVar = new f(this);
        this.f1224a = fVar;
        fVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.f1225b = d0Var;
        d0Var.f(attributeSet, i);
        d0Var.b();
        this.f1226c = new c0(this);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a02 = i != 0 ? a.b.a0(context, i) : null;
        Drawable a03 = i10 != 0 ? a.b.a0(context, i10) : null;
        Drawable a04 = i11 != 0 ? a.b.a0(context, i11) : null;
        if (i12 != 0) {
            drawable = a.b.a0(context, i12);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a02, a03, a04, drawable);
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a02 = i != 0 ? a.b.a0(context, i) : null;
        Drawable a03 = i10 != 0 ? a.b.a0(context, i10) : null;
        Drawable a04 = i11 != 0 ? a.b.a0(context, i11) : null;
        if (i12 != 0) {
            drawable = a.b.a0(context, i12);
        }
        setCompoundDrawablesWithIntrinsicBounds(a02, a03, a04, drawable);
        d0 d0Var = this.f1225b;
        if (d0Var != null) {
            d0Var.b();
        }
    }
}
