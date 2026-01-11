package androidx.preference;

import android.widget.CompoundButton;
import java.util.Objects;

public class CheckBoxPreference extends TwoStatePreference {
    public final a G = new a();

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(CheckBoxPreference.this);
            CheckBoxPreference.this.l(z);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903207(0x7f0300a7, float:1.7413225E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = f0.k.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            androidx.preference.CheckBoxPreference$a r1 = new androidx.preference.CheckBoxPreference$a
            r1.<init>()
            r3.G = r1
            int[] r1 = ad.c.f316j
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = f0.k.i(r4, r5, r2)
            r3.C = r5
            r5 = 4
            r0 = 1
            java.lang.String r5 = f0.k.i(r4, r5, r0)
            r3.D = r5
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 3
            boolean r5 = r4.getBoolean(r0, r5)
            r3.F = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
