package androidx.appcompat.widget;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import io.nodle.cash.R;
import q0.g;
import y.c;

public class e extends AutoCompleteTextView {

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f1209s = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final f f1210a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f1211b;

    /* renamed from: c  reason: collision with root package name */
    public final n f1212c;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1210a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f1211b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1210a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1210a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c.X(onCreateInputConnection, editorInfo, this);
        return this.f1212c.c(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1210a;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1210a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.g(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(b.a0(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1212c.d(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1212c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1210a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1210a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f1211b;
        if (d0Var != null) {
            d0Var.g(context, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        a1.a(context);
        y0.a(this, getContext());
        d1 q10 = d1.q(getContext(), attributeSet, f1209s, R.attr.autoCompleteTextViewStyle);
        if (q10.o(0)) {
            setDropDownBackgroundDrawable(q10.g(0));
        }
        q10.r();
        f fVar = new f(this);
        this.f1210a = fVar;
        fVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        d0 d0Var = new d0(this);
        this.f1211b = d0Var;
        d0Var.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        d0Var.b();
        n nVar = new n(this);
        this.f1212c = nVar;
        nVar.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a10 = nVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
            }
        }
    }
}
