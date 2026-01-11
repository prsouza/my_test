package androidx.appcompat.widget;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1028a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1029b;

    /* renamed from: c  reason: collision with root package name */
    public int f1030c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = c.E;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        x.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f1028a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1028a);
        }
    }

    private void setStacked(boolean z) {
        if (this.f1029b == z) {
            return;
        }
        if (!z || this.f1028a) {
            this.f1029b = z;
            setOrientation(z ? 1 : 0);
            setGravity(z ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void onMeasure(int i, int i10) {
        boolean z;
        int i11;
        int size = View.MeasureSpec.getSize(i);
        int i12 = 0;
        if (this.f1028a) {
            if (size > this.f1030c && this.f1029b) {
                setStacked(false);
            }
            this.f1030c = size;
        }
        if (this.f1029b || View.MeasureSpec.getMode(i) != 1073741824) {
            i11 = i;
            z = false;
        } else {
            i11 = View.MeasureSpec.makeMeasureSpec(size, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
            z = true;
        }
        super.onMeasure(i11, i10);
        if (this.f1028a && !this.f1029b) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i10);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (this.f1029b) {
                int a11 = a(a10 + 1);
                i12 = a11 >= 0 ? getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i12 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.d.d(this) != i12) {
            setMinimumHeight(i12);
            if (i10 == 0) {
                super.onMeasure(i, i10);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1028a != z) {
            this.f1028a = z;
            if (!z && this.f1029b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
