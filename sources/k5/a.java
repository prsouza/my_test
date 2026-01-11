package k5;

import android.view.View;
import androidx.appcompat.view.menu.e;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;
import z5.c;

public final class a extends c {
    public boolean G;

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i;
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (x.e.d(this) == 1) {
                    int i17 = i13 - i15;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i14);
                } else {
                    childAt.layout(i15, 0, childAt.getMeasuredWidth() + i15, i14);
                }
                i15 += childAt.getMeasuredWidth();
            }
        }
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        e menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.m().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i12 = 1;
        if (!(labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3) || !this.G) {
            if (size2 == 0) {
                size2 = 1;
            }
            Math.min(size / size2, 0);
            if (childCount > 0) {
                if (getChildAt(0).getVisibility() != 8) {
                    throw null;
                }
                throw null;
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(0, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK), makeMeasureSpec);
                i11 = Math.max(0, childAt.getMeasuredWidth());
            } else {
                i11 = 0;
            }
            int i13 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = size - Math.min(size - (i13 * 0), Math.min(i11, 0));
            if (i13 != 0) {
                i12 = i13;
            }
            Math.min(min / i12, 0);
            if (childCount > 0) {
                if (getChildAt(0).getVisibility() != 8) {
                    getSelectedItemPosition();
                    throw null;
                }
                throw null;
            }
        }
        int i14 = 0;
        while (i14 < childCount) {
            if (getChildAt(i14).getVisibility() == 8) {
                i14++;
            } else {
                throw null;
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(0, View.MeasureSpec.makeMeasureSpec(0, 1073741824), 0), View.resolveSizeAndState(size3, i10, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.G = z;
    }
}
