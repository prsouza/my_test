package u5;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import b6.b;
import io.nodle.cash.R;
import y.c;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f11710f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11711a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11712b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11713c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11714d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11715e;

    public a(Context context) {
        TypedValue a10 = b.a(context, R.attr.elevationOverlayEnabled);
        boolean z = (a10 == null || a10.type != 18 || a10.data == 0) ? false : true;
        int A = c.A(context, R.attr.elevationOverlayColor, 0);
        int A2 = c.A(context, R.attr.elevationOverlayAccentColor, 0);
        int A3 = c.A(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f11711a = z;
        this.f11712b = A;
        this.f11713c = A2;
        this.f11714d = A3;
        this.f11715e = f10;
    }

    public final int a(int i, float f10) {
        int i10;
        if (!this.f11711a) {
            return i;
        }
        if (!(g0.a.e(i, 255) == this.f11714d)) {
            return i;
        }
        float f11 = this.f11715e;
        float min = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int N = c.N(g0.a.e(i, 255), this.f11712b, min);
        if (min > 0.0f && (i10 = this.f11713c) != 0) {
            N = g0.a.b(g0.a.e(i10, f11710f), N);
        }
        return g0.a.e(N, alpha);
    }
}
