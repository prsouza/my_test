package n0;

import android.view.View;
import io.nodle.cash.R;
import n0.x;

public final class w extends x.b<Boolean> {
    public w() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(x.m.c(view));
    }

    public final void c(View view, Object obj) {
        x.m.g(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }
}
