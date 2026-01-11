package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import i6.i;
import io.nodle.cash.R;

public final class a extends i {

    /* renamed from: e  reason: collision with root package name */
    public final C0047a f4107e = new C0047a();

    /* renamed from: f  reason: collision with root package name */
    public final b f4108f = new b();
    public final c g = new c();

    /* renamed from: h  reason: collision with root package name */
    public final d f4109h = new d();
    public AnimatorSet i;

    /* renamed from: j  reason: collision with root package name */
    public ValueAnimator f4110j;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    public class C0047a implements TextWatcher {
        public C0047a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (a.this.f6192a.getSuffixText() == null) {
                a aVar = a.this;
                aVar.e(a.d(aVar));
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public final void onFocusChange(View view, boolean z) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.d(a.this));
            editText.setOnFocusChangeListener(a.this.f4108f);
            a aVar = a.this;
            aVar.f6194c.setOnFocusChangeListener(aVar.f4108f);
            editText.removeTextChangedListener(a.this.f4107e);
            editText.addTextChangedListener(a.this.f4107e);
        }
    }

    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        public class C0048a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ EditText f4115a;

            public C0048a(EditText editText) {
                this.f4115a = editText;
            }

            public final void run() {
                this.f4115a.removeTextChangedListener(a.this.f4107e);
                a.this.e(true);
            }
        }

        public d() {
        }

        public final void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C0048a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f4108f) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                View.OnFocusChangeListener onFocusChangeListener = a.this.f6194c.getOnFocusChangeListener();
                a aVar = a.this;
                if (onFocusChangeListener == aVar.f4108f) {
                    aVar.f6194c.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public final void onClick(View view) {
            Editable text = a.this.f6192a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f6192a.p();
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f6194c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.f6192a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.f6194c.hasFocus()) && editText.getText().length() > 0;
    }

    public final void a() {
        TextInputLayout textInputLayout = this.f6192a;
        int i10 = this.f6195d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f6192a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f6192a.setEndIconCheckable(false);
        this.f6192a.setEndIconOnClickListener(new e());
        this.f6192a.a(this.g);
        this.f6192a.b(this.f4109h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(f5.a.f4987d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new i6.c(this));
        ValueAnimator f10 = f(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.i = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, f10});
        this.i.addListener(new i6.a(this));
        ValueAnimator f11 = f(1.0f, 0.0f);
        this.f4110j = f11;
        f11.addListener(new i6.b(this));
    }

    public final void c(boolean z) {
        if (this.f6192a.getSuffixText() != null) {
            e(z);
        }
    }

    public final void e(boolean z) {
        boolean z10 = this.f6192a.k() == z;
        if (z && !this.i.isRunning()) {
            this.f4110j.cancel();
            this.i.start();
            if (z10) {
                this.i.end();
            }
        } else if (!z) {
            this.i.cancel();
            this.f4110j.start();
            if (z10) {
                this.f4110j.end();
            }
        }
    }

    public final ValueAnimator f(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f5.a.f4984a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }
}
