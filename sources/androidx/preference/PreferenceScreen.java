package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import f0.k;
import io.nodle.cash.R;

public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, R.attr.preferenceScreenStyle, 16842891), 0);
    }
}
