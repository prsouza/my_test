package p1;

import android.os.Build;
import android.view.View;

public class x extends w {
    public static boolean J = true;

    public void G0(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.G0(view, i);
        } else if (J) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                J = false;
            }
        }
    }
}
