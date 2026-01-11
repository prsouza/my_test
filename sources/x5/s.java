package x5;

import android.view.View;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class s implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.h.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
