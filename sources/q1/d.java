package q1;

import a.a;
import android.animation.TypeEvaluator;

public final class d implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final d f10122a = new d();

    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float a10 = a.a(((float) ((intValue2 >> 24) & 255)) / 255.0f, f11, f10, f11);
        float a11 = a.a(pow4, pow, f10, pow);
        float a12 = a.a((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d), pow2, f10, pow2);
        float a13 = a.a((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow((double) a11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) a13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(a10 * 255.0f) << 24) | (Math.round(((float) Math.pow((double) a12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
