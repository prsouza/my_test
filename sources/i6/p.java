package i6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.f0;
import b6.c;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import x5.t;

public final class p extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f6226a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f6227b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f6228c;

    /* renamed from: s  reason: collision with root package name */
    public final CheckableImageButton f6229s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f6230t;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuff.Mode f6231u;

    /* renamed from: v  reason: collision with root package name */
    public View.OnLongClickListener f6232v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6233w;

    public p(TextInputLayout textInputLayout, d1 d1Var) {
        super(textInputLayout.getContext());
        this.f6226a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.f6229s = checkableImageButton;
        CharSequence charSequence = null;
        f0 f0Var = new f0(getContext(), (AttributeSet) null);
        this.f6227b = f0Var;
        if (c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        c((View.OnClickListener) null);
        d((View.OnLongClickListener) null);
        if (d1Var.o(62)) {
            this.f6230t = c.b(getContext(), d1Var, 62);
        }
        if (d1Var.o(63)) {
            this.f6231u = t.d(d1Var.j(63, -1), (PorterDuff.Mode) null);
        }
        if (d1Var.o(61)) {
            b(d1Var.g(61));
            if (d1Var.o(60)) {
                a(d1Var.n(60));
            }
            checkableImageButton.setCheckable(d1Var.a(59, true));
        }
        f0Var.setVisibility(8);
        f0Var.setId(R.id.textinput_prefix_text);
        f0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.g.f(f0Var, 1);
        f0Var.setTextAppearance(d1Var.l(55, 0));
        if (d1Var.o(56)) {
            f0Var.setTextColor(d1Var.c(56));
        }
        CharSequence n10 = d1Var.n(54);
        this.f6228c = !TextUtils.isEmpty(n10) ? n10 : charSequence;
        f0Var.setText(n10);
        g();
        addView(checkableImageButton);
        addView(f0Var);
    }

    public final void a(CharSequence charSequence) {
        if (this.f6229s.getContentDescription() != charSequence) {
            this.f6229s.setContentDescription(charSequence);
        }
    }

    public final void b(Drawable drawable) {
        this.f6229s.setImageDrawable(drawable);
        if (drawable != null) {
            j.a(this.f6226a, this.f6229s, this.f6230t, this.f6231u);
            e(true);
            j.c(this.f6226a, this.f6229s, this.f6230t);
            return;
        }
        e(false);
        c((View.OnClickListener) null);
        d((View.OnLongClickListener) null);
        a((CharSequence) null);
    }

    public final void c(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f6229s;
        View.OnLongClickListener onLongClickListener = this.f6232v;
        checkableImageButton.setOnClickListener(onClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public final void d(View.OnLongClickListener onLongClickListener) {
        this.f6232v = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f6229s;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public final void e(boolean z) {
        int i = 0;
        if ((this.f6229s.getVisibility() == 0) != z) {
            CheckableImageButton checkableImageButton = this.f6229s;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            f();
            g();
        }
    }

    public final void f() {
        EditText editText = this.f6226a.f4085t;
        if (editText != null) {
            int i = 0;
            if (!(this.f6229s.getVisibility() == 0)) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                i = x.e.f(editText);
            }
            f0 f0Var = this.f6227b;
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
            x.e.k(f0Var, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void g() {
        int i = 8;
        int i10 = (this.f6228c == null || this.f6233w) ? 8 : 0;
        if (this.f6229s.getVisibility() == 0 || i10 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.f6227b.setVisibility(i10);
        this.f6226a.v();
    }

    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        f();
    }
}
