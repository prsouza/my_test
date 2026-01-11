package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import f0.k;
import io.nodle.cash.R;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, R.attr.preferenceCategoryStyle, 16842892), 0);
    }

    public final boolean e() {
        return false;
    }
}
