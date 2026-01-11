package i6;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f6192a;

    /* renamed from: b  reason: collision with root package name */
    public Context f6193b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f6194c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6195d;

    public i(TextInputLayout textInputLayout, int i) {
        this.f6192a = textInputLayout;
        this.f6193b = textInputLayout.getContext();
        this.f6194c = textInputLayout.getEndIconView();
        this.f6195d = i;
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public void c(boolean z) {
    }
}
