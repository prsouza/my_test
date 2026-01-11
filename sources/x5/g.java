package x5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import e5.a;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public class g extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f12831a;

    /* renamed from: b  reason: collision with root package name */
    public int f12832b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12833c;

    /* renamed from: s  reason: collision with root package name */
    public int f12834s;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        return this.f12833c;
    }

    public int getItemSpacing() {
        return this.f12832b;
    }

    public int getLineSpacing() {
        return this.f12831a;
    }

    public int getRowCount() {
        return this.f12834s;
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (getChildCount() == 0) {
            this.f12834s = 0;
            return;
        }
        this.f12834s = 1;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        boolean z10 = x.e.d(this) == 1;
        int paddingRight = z10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i15 = (i11 - i) - paddingLeft;
        int i16 = paddingRight;
        int i17 = paddingTop;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.getMarginStart();
                    i14 = marginLayoutParams.getMarginEnd();
                } else {
                    i14 = 0;
                    i13 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i16 + i13;
                if (!this.f12833c && measuredWidth > i15) {
                    i17 = this.f12831a + paddingTop;
                    this.f12834s++;
                    i16 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f12834s - 1));
                int i19 = i16 + i13;
                int measuredWidth2 = childAt.getMeasuredWidth() + i19;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (z10) {
                    childAt.layout(i15 - measuredWidth2, i17, (i15 - i16) - i13, measuredHeight);
                } else {
                    childAt.layout(i19, i17, measuredWidth2, measuredHeight);
                }
                i16 += childAt.getMeasuredWidth() + i13 + i14 + this.f12832b;
                paddingTop = measuredHeight;
            }
        }
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i10;
            } else {
                measureChild(childAt, i, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i12 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i12 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i15 = paddingTop + this.f12831a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i12 + i13 + this.f12832b + paddingLeft;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i11 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i11 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i11) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f12832b = i;
    }

    public void setLineSpacing(int i) {
        this.f12831a = i;
    }

    public void setSingleLine(boolean z) {
        this.f12833c = z;
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12833c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.f4625k, 0, 0);
        this.f12831a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f12832b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
