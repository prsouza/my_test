package androidx.preference;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.common.api.Api;
import f0.k;
import io.nodle.cash.R;

public class Preference implements Comparable<Preference> {
    public a A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2219a;

    /* renamed from: b  reason: collision with root package name */
    public int f2220b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f2221c;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f2222s;

    /* renamed from: t  reason: collision with root package name */
    public String f2223t;

    /* renamed from: u  reason: collision with root package name */
    public String f2224u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2225v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2226w;

    /* renamed from: x  reason: collision with root package name */
    public Object f2227x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2228y;
    public boolean z;

    public interface a<T extends Preference> {
        CharSequence a(T t10);
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f2220b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2225v = true;
        this.f2226w = true;
        this.f2228y = true;
        this.z = true;
        this.f2219a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f326o, i, 0);
        k.h(obtainStyledAttributes);
        this.f2223t = k.i(obtainStyledAttributes, 26, 6);
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f2221c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f2222s = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f2220b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        this.f2224u = k.i(obtainStyledAttributes, 22, 13);
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.f2225v = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.f2226w = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        k.i(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.f2226w));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.f2226w));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f2227x = i(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f2227x = i(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public final int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f2220b;
        int i10 = preference.f2220b;
        if (i != i10) {
            return i - i10;
        }
        CharSequence charSequence = this.f2221c;
        CharSequence charSequence2 = preference.f2221c;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f2221c.toString());
    }

    public CharSequence d() {
        a aVar = this.A;
        if (aVar != null) {
            return aVar.a(this);
        }
        return this.f2222s;
    }

    public boolean e() {
        return this.f2225v && this.f2228y && this.z;
    }

    public void h() {
    }

    public Object i(TypedArray typedArray, int i) {
        return null;
    }

    public boolean k() {
        return !e();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f2221c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence d10 = d();
        if (!TextUtils.isEmpty(d10)) {
            sb2.append(d10);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.preferenceStyle, 16842894));
    }
}
