package n0;

import android.view.View;
import io.nodle.cash.R;
import n0.x;

public final class t extends x.b<Boolean> {
    public t() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(x.m.d(view));
    }

    public final void c(View view, Object obj) {
        x.m.i(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }
}
