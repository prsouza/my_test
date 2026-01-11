package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;

public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    private static final int zab(int i, int i10, int i11, int i12) {
        if (i == 0) {
            return i10;
        }
        if (i == 1) {
            return i11;
        }
        if (i == 2) {
            return i12;
        }
        throw new IllegalStateException(a.b(33, "Unknown color scheme: ", i));
    }

    public final void zaa(Resources resources, int i, int i10) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i11 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i11);
        setMinWidth(i11);
        int i12 = R.drawable.common_google_signin_btn_icon_dark;
        int i13 = R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i10, i12, i13, i13);
        int i14 = R.drawable.common_google_signin_btn_text_dark;
        int i15 = R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i10, i14, i15, i15);
        if (i == 0 || i == 1) {
            zab = zab2;
        } else if (i != 2) {
            throw new IllegalStateException(a.b(32, "Unknown button size: ", i));
        }
        Drawable drawable = resources.getDrawable(zab);
        drawable.setTintList(resources.getColorStateList(R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i16 = R.color.common_google_signin_btn_text_dark;
        int i17 = R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i10, i16, i17, i17))));
        if (i == 0) {
            setText(resources.getString(R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException(a.b(32, "Unknown button size: ", i));
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
