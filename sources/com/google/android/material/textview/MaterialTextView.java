package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.f0;
import b6.b;
import io.nodle.cash.R;
import j6.a;

public class MaterialTextView extends f0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (e(context2)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = e5.a.f4636v;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int f10 = f(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(f10 != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    c(theme, resourceId);
                }
            }
        }
    }

    public static boolean e(Context context) {
        TypedValue a10 = b.a(context, R.attr.textAppearanceLineHeightEnabled);
        if (a10 != null && a10.type == 18 && a10.data == 0) {
            return false;
        }
        return true;
    }

    public static int f(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i10 = 0; i10 < iArr.length && i < 0; i10++) {
            int i11 = iArr[i10];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i11, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i11, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            }
        }
        return i;
    }

    public final void c(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, e5.a.f4635u);
        int f10 = f(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (f10 >= 0) {
            setLineHeight(f10);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (e(context)) {
            c(context.getTheme(), i);
        }
    }
}
