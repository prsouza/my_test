package f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class k {
    public static int a(Context context, int i, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i10;
    }

    public static boolean b(TypedArray typedArray, int i, int i10, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i10, z));
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!k(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    public static c d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        c cVar;
        if (k(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new c((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                cVar = c.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new c((Shader) null, (ColorStateList) null, 0);
    }

    public static float e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f10) {
        if (!k(xmlPullParser, str)) {
            return f10;
        }
        return typedArray.getFloat(i, f10);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i10) {
        if (!k(xmlPullParser, str)) {
            return i10;
        }
        return typedArray.getInt(i, i10);
    }

    public static String g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!k(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static int h(TypedArray typedArray) {
        return typedArray.getResourceId(23, typedArray.getResourceId(0, 0));
    }

    public static String i(TypedArray typedArray, int i, int i10) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i10) : string;
    }

    public static CharSequence[] j(TypedArray typedArray, int i, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i10) : textArray;
    }

    public static boolean k(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
