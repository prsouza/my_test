package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import p1.d;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f1942a = new k0();

    /* renamed from: b  reason: collision with root package name */
    public static final o0 f1943b;

    static {
        o0 o0Var;
        try {
            o0Var = d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o0Var = null;
        }
        f1943b = o0Var;
    }

    public static void a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }
}
