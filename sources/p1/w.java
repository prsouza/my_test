package p1;

import android.view.View;

public class w extends v {
    public static boolean I = true;

    public void W0(View view, int i, int i10, int i11, int i12) {
        if (I) {
            try {
                view.setLeftTopRightBottom(i, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                I = false;
            }
        }
    }
}
