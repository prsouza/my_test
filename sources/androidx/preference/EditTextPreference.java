package androidx.preference;

import android.content.res.TypedArray;
import android.text.TextUtils;
import androidx.preference.Preference;
import io.nodle.cash.R;
import java.util.Objects;

public class EditTextPreference extends DialogPreference {

    public static final class a implements Preference.a<EditTextPreference> {

        /* renamed from: a  reason: collision with root package name */
        public static a f2217a;

        public final CharSequence a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            Objects.requireNonNull(editTextPreference);
            if (TextUtils.isEmpty((CharSequence) null)) {
                return editTextPreference.f2219a.getString(R.string.not_set);
            }
            return null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903428(0x7f030184, float:1.7413674E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = f0.k.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = ad.c.f320l
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = f0.k.b(r4, r2, r2, r2)
            if (r5 == 0) goto L_0x0029
            androidx.preference.EditTextPreference$a r5 = androidx.preference.EditTextPreference.a.f2217a
            if (r5 != 0) goto L_0x0025
            androidx.preference.EditTextPreference$a r5 = new androidx.preference.EditTextPreference$a
            r5.<init>()
            androidx.preference.EditTextPreference.a.f2217a = r5
        L_0x0025:
            androidx.preference.EditTextPreference$a r5 = androidx.preference.EditTextPreference.a.f2217a
            r3.A = r5
        L_0x0029:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object i(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
