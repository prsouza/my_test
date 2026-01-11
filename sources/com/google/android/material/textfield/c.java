package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import i6.i;
import io.nodle.cash.R;
import x5.n;

public final class c extends i {

    /* renamed from: e  reason: collision with root package name */
    public final a f4142e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final b f4143f = new b();
    public final C0051c g = new C0051c();

    public class a extends n {
        public a() {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
            c cVar = c.this;
            cVar.f6194c.setChecked(!c.d(cVar));
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c cVar = c.this;
            cVar.f6194c.setChecked(!c.d(cVar));
            editText.removeTextChangedListener(c.this.f4142e);
            editText.addTextChangedListener(c.this.f4142e);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    public class C0051c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ EditText f4147a;

            public a(EditText editText) {
                this.f4147a = editText;
            }

            public final void run() {
                this.f4147a.removeTextChangedListener(c.this.f4142e);
            }
        }

        public C0051c() {
        }

        public final void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public final void onClick(View view) {
            EditText editText = c.this.f6192a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (c.d(c.this)) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                c.this.f6192a.p();
            }
        }
    }

    public c(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f6192a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    public final void a() {
        TextInputLayout textInputLayout = this.f6192a;
        int i = this.f6195d;
        if (i == 0) {
            i = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f6192a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        boolean z = true;
        this.f6192a.setEndIconVisible(true);
        this.f6192a.setEndIconCheckable(true);
        this.f6192a.setEndIconOnClickListener(new d());
        this.f6192a.a(this.f4143f);
        this.f6192a.b(this.g);
        EditText editText = this.f6192a.getEditText();
        if (editText == null || !(editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z = false;
        }
        if (z) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
