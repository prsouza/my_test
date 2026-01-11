package androidx.preference;

import android.widget.CompoundButton;
import java.util.Objects;

public class SwitchPreference extends TwoStatePreference {
    public final a G = new a();
    public CharSequence H;
    public CharSequence I;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(SwitchPreference.this);
            SwitchPreference.this.l(z);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130904074(0x7f03040a, float:1.7414984E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = f0.k.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            androidx.preference.SwitchPreference$a r1 = new androidx.preference.SwitchPreference$a
            r1.<init>()
            r3.G = r1
            int[] r1 = ad.c.f334s
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 7
            java.lang.String r5 = f0.k.i(r4, r5, r2)
            r3.C = r5
            r5 = 6
            r0 = 1
            java.lang.String r5 = f0.k.i(r4, r5, r0)
            r3.D = r5
            r5 = 9
            r0 = 3
            java.lang.String r5 = f0.k.i(r4, r5, r0)
            r3.H = r5
            r5 = 8
            r0 = 4
            java.lang.String r5 = f0.k.i(r4, r5, r0)
            r3.I = r5
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 5
            boolean r5 = r4.getBoolean(r0, r5)
            r3.F = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
