package androidx.preference;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import f0.k;
import io.nodle.cash.R;
import java.util.Objects;

public class SwitchPreferenceCompat extends TwoStatePreference {
    public final a G = new a();
    public CharSequence H;
    public CharSequence I;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(SwitchPreferenceCompat.this);
            SwitchPreferenceCompat.this.l(z);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f335t, R.attr.switchPreferenceCompatStyle, 0);
        this.C = k.i(obtainStyledAttributes, 7, 0);
        this.D = k.i(obtainStyledAttributes, 6, 1);
        this.H = k.i(obtainStyledAttributes, 9, 3);
        this.I = k.i(obtainStyledAttributes, 8, 4);
        this.F = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
