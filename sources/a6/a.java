package a6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.v;
import b6.c;
import io.nodle.cash.R;
import x5.o;

public final class a extends v {

    /* renamed from: v  reason: collision with root package name */
    public static final int[][] f134v = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f135t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f136u;

    public a(Context context, AttributeSet attributeSet) {
        super(j6.a.a(context, attributeSet, R.attr.radioButtonStyle, 2131821577), attributeSet);
        Context context2 = getContext();
        TypedArray d10 = o.d(context2, attributeSet, e5.a.f4633s, R.attr.radioButtonStyle, 2131821577, new int[0]);
        if (d10.hasValue(0)) {
            setButtonTintList(c.a(context2, d10, 0));
        }
        this.f136u = d10.getBoolean(1, false);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f135t == null) {
            int B = y.c.B(this, R.attr.colorControlActivated);
            int B2 = y.c.B(this, R.attr.colorOnSurface);
            int B3 = y.c.B(this, R.attr.colorSurface);
            this.f135t = new ColorStateList(f134v, new int[]{y.c.N(B3, B, 1.0f), y.c.N(B3, B2, 0.54f), y.c.N(B3, B2, 0.38f), y.c.N(B3, B2, 0.38f)});
        }
        return this.f135t;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f136u && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f136u = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }
}
