package p1;

import android.graphics.Matrix;
import android.view.View;

public class v extends u {
    public static boolean G = true;
    public static boolean H = true;

    public void U0(View view, Matrix matrix) {
        if (G) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                G = false;
            }
        }
    }

    public void V0(View view, Matrix matrix) {
        if (H) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                H = false;
            }
        }
    }
}
