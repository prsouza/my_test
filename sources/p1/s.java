package p1;

import android.os.Build;
import android.view.ViewGroup;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9563a = true;

    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f9563a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f9563a = false;
            }
        }
    }
}
