package c6;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3250a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3251b = {16842913, 16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3252c = {16842913};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3253d = {16842910, 16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final String f3254e = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f3252c, StateSet.NOTHING}, new int[]{b(colorStateList, f3251b), b(colorStateList, f3250a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return g0.a.e(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f3253d, 0)) != 0) {
            Log.w(f3254e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z = false;
        boolean z10 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z10 = true;
            }
        }
        return z && z10;
    }
}
