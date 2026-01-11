package androidx.preference;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import f0.k;
import io.nodle.cash.R;

public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f318k, i, 0);
        k.i(obtainStyledAttributes, 9, 0);
        k.i(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        k.i(obtainStyledAttributes, 11, 3);
        k.i(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
