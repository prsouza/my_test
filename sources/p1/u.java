package p1;

import a.b;
import android.view.View;

public class u extends b {
    public static boolean F = true;

    public float S0(View view) {
        if (F) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
        return view.getAlpha();
    }

    public void T0(View view, float f10) {
        if (F) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
        view.setAlpha(f10);
    }
}
