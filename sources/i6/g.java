package i6;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

public final class g implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f6189a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f6190b;

    public g(b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f6190b = bVar;
        this.f6189a = autoCompleteTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f6190b.l()) {
                this.f6190b.f4122j = false;
            }
            b.g(this.f6190b, this.f6189a);
            b.h(this.f6190b);
        }
        return false;
    }
}
