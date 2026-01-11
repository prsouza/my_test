package i6;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

public final class h implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f6191a;

    public h(b bVar) {
        this.f6191a = bVar;
    }

    public final void onDismiss() {
        b.h(this.f6191a);
        b.f(this.f6191a, false);
    }
}
