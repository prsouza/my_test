package x0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f12750a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12751b = false;

    /* renamed from: c  reason: collision with root package name */
    public a f12752c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12753s = true;

    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<EditText> f12754a;

        public a(EditText editText) {
            this.f12754a = new WeakReference(editText);
        }

        public final void b() {
            g.a(this.f12754a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f12750a = editText;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            d.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        if (!this.f12750a.isInEditMode()) {
            if (!(!this.f12753s || (!this.f12751b && !d.c())) && i10 <= i11 && (charSequence instanceof Spannable)) {
                int b10 = d.a().b();
                if (b10 != 0) {
                    if (b10 == 1) {
                        d.a().i((Spannable) charSequence, i, i11 + i);
                        return;
                    } else if (b10 != 3) {
                        return;
                    }
                }
                d a10 = d.a();
                if (this.f12752c == null) {
                    this.f12752c = new a(this.f12750a);
                }
                a10.j(this.f12752c);
            }
        }
    }
}
