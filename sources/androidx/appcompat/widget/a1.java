package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

public final class a1 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1152a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof a1) && !(context.getResources() instanceof c1)) {
            context.getResources();
            int i = j1.f1294a;
        }
        return context;
    }
}
