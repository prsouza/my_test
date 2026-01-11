package androidx.preference;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.github.mikephil.charting.BuildConfig;
import f0.k;
import io.nodle.cash.R;

public class ListPreference extends DialogPreference {
    public CharSequence[] B;
    public CharSequence[] C;
    public String D;

    public static final class a implements Preference.a<ListPreference> {

        /* renamed from: a  reason: collision with root package name */
        public static a f2218a;

        public final CharSequence a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            if (TextUtils.isEmpty(listPreference.l())) {
                return listPreference.f2219a.getString(R.string.not_set);
            }
            return listPreference.l();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f322m, i, 0);
        this.B = k.j(obtainStyledAttributes, 2, 0);
        this.C = k.j(obtainStyledAttributes, 3, 1);
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (a.f2218a == null) {
                a.f2218a = new a();
            }
            this.A = a.f2218a;
            h();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.f326o, i, 0);
        this.D = k.i(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public final CharSequence d() {
        Preference.a aVar = this.A;
        if (aVar != null) {
            return aVar.a(this);
        }
        Object l10 = l();
        CharSequence d10 = super.d();
        String str = this.D;
        if (str == null) {
            return d10;
        }
        Object[] objArr = new Object[1];
        if (l10 == null) {
            l10 = BuildConfig.FLAVOR;
        }
        objArr[0] = l10;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, d10)) {
            return d10;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public final Object i(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final CharSequence l() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
