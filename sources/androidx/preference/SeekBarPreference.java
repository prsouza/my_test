package androidx.preference;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import io.nodle.cash.R;

public class SeekBarPreference extends Preference {
    public int B;
    public int C;
    public int D;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f332r, R.attr.seekBarPreferenceStyle, 0);
        this.B = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i10 = this.B;
        i = i < i10 ? i10 : i;
        if (i != this.C) {
            this.C = i;
        }
        int i11 = obtainStyledAttributes.getInt(4, 0);
        if (i11 != this.D) {
            this.D = Math.min(this.C - this.B, Math.abs(i11));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final Object i(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
