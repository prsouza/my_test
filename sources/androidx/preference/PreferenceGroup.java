package androidx.preference;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import f0.k;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    public final List<Preference> B;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i);
        new Handler(Looper.getMainLooper());
        this.B = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f328p, i, 0);
        k.b(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1) && obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Api.BaseClientBuilder.API_PRIORITY_OTHER)) != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.f2223t))) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        obtainStyledAttributes.recycle();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
