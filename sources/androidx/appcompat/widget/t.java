package androidx.appcompat.widget;

import a.b;
import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import q0.f;

public final class t extends PopupWindow {
    public t(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.M, i, i10);
        if (obtainStyledAttributes.hasValue(2)) {
            f.c(this, obtainStyledAttributes.getBoolean(2, false));
        }
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = b.a0(context, resourceId);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    public final void showAsDropDown(View view, int i, int i10) {
        super.showAsDropDown(view, i, i10);
    }

    public final void update(View view, int i, int i10, int i11, int i12) {
        super.update(view, i, i10, i11, i12);
    }

    public final void showAsDropDown(View view, int i, int i10, int i11) {
        super.showAsDropDown(view, i, i10, i11);
    }
}
