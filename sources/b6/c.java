package b6;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.d1;

public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList Z;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (Z = b.Z(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return Z;
    }

    public static ColorStateList b(Context context, d1 d1Var, int i) {
        int l10;
        ColorStateList Z;
        if (!d1Var.o(i) || (l10 = d1Var.l(i, 0)) == 0 || (Z = b.Z(context, l10)) == null) {
            return d1Var.c(i);
        }
        return Z;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable a02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a02 = b.a0(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return a02;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
