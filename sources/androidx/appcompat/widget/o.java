package androidx.appcompat.widget;

import ad.c;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import x0.f;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1350a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1351b;

    public o(TextView textView) {
        this.f1350a = textView;
        this.f1351b = new f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1351b.f12745a.a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1350a.getContext().obtainStyledAttributes(attributeSet, c.C, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z) {
        this.f1351b.f12745a.c(z);
    }

    public final void d(boolean z) {
        this.f1351b.f12745a.d(z);
    }
}
