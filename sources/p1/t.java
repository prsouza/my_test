package p1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final x f9564a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property<View, Float> f9565b = new a();

    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        public final Object get(Object obj) {
            return Float.valueOf(t.a((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            t.c((View) obj, ((Float) obj2).floatValue());
        }
    }

    public class b extends Property<View, Rect> {
        public b(Class cls) {
            super(cls, "clipBounds");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            return x.f.a((View) obj);
        }

        public final void set(Object obj, Object obj2) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.f.c((View) obj, (Rect) obj2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f9564a = new y();
        } else {
            f9564a = new x();
        }
        new b(Rect.class);
    }

    public static float a(View view) {
        return f9564a.S0(view);
    }

    public static void b(View view, int i, int i10, int i11, int i12) {
        f9564a.W0(view, i, i10, i11, i12);
    }

    public static void c(View view, float f10) {
        f9564a.T0(view, f10);
    }

    public static void d(View view, int i) {
        f9564a.G0(view, i);
    }
}
