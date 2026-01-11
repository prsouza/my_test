package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {
    public boolean B;
    public CharSequence C;
    public CharSequence D;
    public boolean E;
    public boolean F;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final Object i(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public final boolean k() {
        if ((this.F ? this.B : !this.B) || super.k()) {
            return true;
        }
        return false;
    }

    public final void l(boolean z) {
        boolean z10 = this.B != z;
        if (z10 || !this.E) {
            this.B = z;
            this.E = true;
            if (z10) {
                k();
            }
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
