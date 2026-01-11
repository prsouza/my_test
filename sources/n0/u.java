package n0;

import android.text.TextUtils;
import android.view.View;
import io.nodle.cash.R;
import n0.x;

public final class u extends x.b<CharSequence> {
    public u(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    public final Object b(View view) {
        return x.m.b(view);
    }

    public final void c(View view, Object obj) {
        x.m.h(view, (CharSequence) obj);
    }

    public final boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
