package r3;

import a.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import d0.a;
import f0.f;
import m.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f10562a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f10562a) {
                return b.a0(theme != null ? new c(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError unused) {
            f10562a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = d0.a.f4256a;
                return a.b.b(context2, i);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = f.f4887a;
        return resources.getDrawable(i, theme);
    }
}
