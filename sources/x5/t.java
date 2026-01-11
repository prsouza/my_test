package x5;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class t {

    public interface a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f12866a;

        /* renamed from: b  reason: collision with root package name */
        public int f12867b;

        /* renamed from: c  reason: collision with root package name */
        public int f12868c;

        public b(int i, int i10, int i11, int i12) {
            this.f12866a = i;
            this.f12867b = i11;
            this.f12868c = i12;
        }
    }

    public static float a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static float b(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            f10 += x.i.i((View) parent);
        }
        return f10;
    }

    public static boolean c(View view) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        return x.e.d(view) == 1;
    }

    public static PorterDuff.Mode d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
