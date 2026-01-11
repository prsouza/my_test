package p1;

import android.graphics.Matrix;
import android.view.View;

public final class y extends x {
    public final void G0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public final float S0(View view) {
        return view.getTransitionAlpha();
    }

    public final void T0(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    public final void U0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void V0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public final void W0(View view, int i, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i, i10, i11, i12);
    }
}
