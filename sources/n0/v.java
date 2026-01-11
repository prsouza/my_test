package n0;

import android.text.TextUtils;
import android.view.View;
import io.nodle.cash.R;
import n0.x;

public final class v extends x.b<CharSequence> {
    public v(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    public final Object b(View view) {
        return x.o.a(view);
    }

    public final void c(View view, Object obj) {
        x.o.b(view, (CharSequence) obj);
    }

    public final boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
