package n0;

import android.view.Window;
import android.view.WindowInsetsController;

public final class d0 {
    public static f0 a(Window window) {
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            return new f0(insetsController);
        }
        return null;
    }

    public static void b(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }
}
