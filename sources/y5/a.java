package y5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.PathInterpolator;
import g0.d;
import io.nodle.cash.R;

public final class a {
    public static float a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    public static TimeInterpolator c(Context context, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.motionEasingStandard, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                }
                StringBuilder d10 = a.a.d("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                d10.append(split.length);
                throw new IllegalArgumentException(d10.toString());
            } else if (b(valueOf, "path")) {
                return new PathInterpolator(d.d(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException(a8.a.c("Invalid motion easing type: ", valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }
}
