package x0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f12739a;

    /* renamed from: b  reason: collision with root package name */
    public a f12740b;

    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<TextView> f12741a;

        /* renamed from: b  reason: collision with root package name */
        public final Reference<d> f12742b;

        public a(TextView textView, d dVar) {
            this.f12741a = new WeakReference(textView);
            this.f12742b = new WeakReference(dVar);
        }

        public final void b() {
            InputFilter[] filters;
            TextView textView = this.f12741a.get();
            InputFilter inputFilter = this.f12742b.get();
            boolean z = false;
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i = 0;
                while (true) {
                    if (i >= filters.length) {
                        break;
                    } else if (filters[i] == inputFilter) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z && textView.isAttachedToWindow()) {
                CharSequence h10 = androidx.emoji2.text.d.a().h(textView.getText());
                int selectionStart = Selection.getSelectionStart(h10);
                int selectionEnd = Selection.getSelectionEnd(h10);
                textView.setText(h10);
                if (h10 instanceof Spannable) {
                    Spannable spannable = (Spannable) h10;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f12739a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i10, Spanned spanned, int i11, int i12) {
        if (this.f12739a.isInEditMode()) {
            return charSequence;
        }
        int b10 = androidx.emoji2.text.d.a().b();
        if (b10 != 0) {
            boolean z = true;
            if (b10 == 1) {
                if (i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == this.f12739a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i10 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i10);
                }
                return androidx.emoji2.text.d.a().i(charSequence, 0, charSequence.length());
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
        if (this.f12740b == null) {
            this.f12740b = new a(this.f12739a, this);
        }
        a10.j(this.f12740b);
        return charSequence;
    }
}
