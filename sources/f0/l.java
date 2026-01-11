package f0;

import c3.k;
import com.github.mikephil.charting.utils.Utils;

public final class l {

    /* renamed from: k  reason: collision with root package name */
    public static final l f4901k;

    /* renamed from: a  reason: collision with root package name */
    public final float f4902a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4903b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4904c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4905d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4906e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4907f;
    public final float[] g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4908h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public final float f4909j;

    static {
        float[] fArr = k.f3184y;
        float e12 = (float) ((((double) k.e1()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = k.f3182w;
        float f10 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f11 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f12 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f13 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp((double) (((-e12) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d10 = (double) exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < Utils.DOUBLE_EPSILON) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp};
        float f14 = 1.0f / ((5.0f * e12) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float cbrt = (0.1f * f16 * f16 * ((float) Math.cbrt(((double) e12) * 5.0d))) + (f15 * e12);
        float e13 = k.e1() / fArr[1];
        double d11 = (double) e13;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f11)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f12)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f4901k = new l(e13, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f13, 1.0f, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f4907f = f10;
        this.f4902a = f11;
        this.f4903b = f12;
        this.f4904c = f13;
        this.f4905d = f14;
        this.f4906e = f15;
        this.g = fArr;
        this.f4908h = f16;
        this.i = f17;
        this.f4909j = f18;
    }
}
