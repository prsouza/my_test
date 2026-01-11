package f5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import b1.b;
import b1.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f4984a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final b f4985b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final b1.a f4986c = new b1.a();

    /* renamed from: d  reason: collision with root package name */
    public static final c f4987d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f4988e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return f14 < f12 ? f10 : f14 > f13 ? f11 : a.a.a(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }

    public static int b(int i, int i10, float f10) {
        return Math.round(f10 * ((float) (i10 - i))) + i;
    }
}
