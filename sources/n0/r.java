package n0;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public Object f8840a;

    public r(Object obj) {
        this.f8840a = obj;
    }

    public static r a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new r(PointerIcon.getSystemIcon(context, 1002));
        }
        return new r((Object) null);
    }
}
