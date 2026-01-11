package f0;

import android.graphics.Color;
import c3.k;
import com.github.mikephil.charting.utils.Utils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f4864a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4865b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4866c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4867d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4868e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4869f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f4864a = f10;
        this.f4865b = f11;
        this.f4866c = f12;
        this.f4867d = f13;
        this.f4868e = f14;
        this.f4869f = f15;
    }

    public static a a(int i) {
        l lVar = l.f4901k;
        float u02 = k.u0(Color.red(i));
        float u03 = k.u0(Color.green(i));
        float u04 = k.u0(Color.blue(i));
        float[][] fArr = k.z;
        float[] fArr2 = {(fArr[0][2] * u04) + (fArr[0][1] * u03) + (fArr[0][0] * u02), (fArr[1][2] * u04) + (fArr[1][1] * u03) + (fArr[1][0] * u02), (u04 * fArr[2][2]) + (u03 * fArr[2][1]) + (u02 * fArr[2][0])};
        float[][] fArr3 = k.f3182w;
        float f10 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f11 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f12 = fArr2[0] * fArr3[2][0];
        float f13 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = lVar.g;
        float f14 = fArr4[0] * f10;
        float f15 = fArr4[1] * f11;
        float f16 = fArr4[2] * (f13 + (fArr2[1] * fArr3[2][1]) + f12);
        float pow = (float) Math.pow(((double) (Math.abs(f14) * lVar.f4908h)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f15) * lVar.f4908h)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f16) * lVar.f4908h)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f17 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d10)) / 11.0f;
        float f18 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f18, (double) f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = atan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f21 * lVar.f4903b) / lVar.f4902a), (double) (lVar.f4905d * lVar.f4909j))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.f4907f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f22) < 20.14d ? 360.0f + f22 : f22)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f4906e) * lVar.f4904c) * ((float) Math.sqrt((double) ((f18 * f18) + (f17 * f17))))) / (f20 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * lVar.f4905d) / (lVar.f4902a + 4.0f)));
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((lVar.i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d11 = (double) f23;
        return new a(f22, sqrt, pow4, f24, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar = l.f4901k;
        float f13 = lVar.f4905d;
        double d10 = ((double) f10) / 100.0d;
        Math.sqrt(d10);
        Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * lVar.f4905d) / (lVar.f4902a + 4.0f)));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((((double) (lVar.i * f11)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (double) ((3.1415927f * f12) / 180.0f);
        return new a(f12, f11, f10, f14, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public final int c(l lVar) {
        float f10;
        l lVar2 = lVar;
        float f11 = this.f4865b;
        if (((double) f11) != Utils.DOUBLE_EPSILON) {
            double d10 = (double) this.f4866c;
            if (d10 != Utils.DOUBLE_EPSILON) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar2.f4907f), 0.73d), 1.1111111111111112d);
                double d11 = (double) ((this.f4864a * 3.1415927f) / 180.0f);
                float pow2 = lVar2.f4902a * ((float) Math.pow(((double) this.f4866c) / 100.0d, (1.0d / ((double) lVar2.f4905d)) / ((double) lVar2.f4909j)));
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f * 3846.1538f * lVar2.f4906e * lVar2.f4904c;
                float f12 = pow2 / lVar2.f4903b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f13 = 11.0f * pow * cos2;
                float f14 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f13 + (cos * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f12 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))));
                float signum = (100.0f / lVar2.f4908h) * Math.signum(f18) * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = (100.0f / lVar2.f4908h) * Math.signum(f19) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19))))), 2.380952380952381d));
                float signum3 = Math.signum(f20);
                float[] fArr = lVar2.g;
                float f21 = signum / fArr[0];
                float f22 = signum2 / fArr[1];
                float pow3 = (((100.0f / lVar2.f4908h) * signum3) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = k.f3183x;
                float f23 = (fArr2[0][2] * pow3) + (fArr2[0][1] * f22) + (fArr2[0][0] * f21);
                float f24 = (fArr2[1][2] * pow3) + (fArr2[1][1] * f22) + (fArr2[1][0] * f21);
                float f25 = f21 * fArr2[2][0];
                return g0.a.a((double) f23, (double) f24, (double) ((pow3 * fArr2[2][2]) + (f22 * fArr2[2][1]) + f25));
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar2.f4907f), 0.73d), 1.1111111111111112d);
        double d112 = (double) ((this.f4864a * 3.1415927f) / 180.0f);
        float pow22 = lVar2.f4902a * ((float) Math.pow(((double) this.f4866c) / 100.0d, (1.0d / ((double) lVar2.f4905d)) / ((double) lVar2.f4909j)));
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f * 3846.1538f * lVar2.f4906e * lVar2.f4904c;
        float f122 = pow22 / lVar2.f4903b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f132 = 11.0f * pow4 * cos22;
        float f142 = (((0.305f + f122) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f132 + (cos3 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f122 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f202 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f182)) * 27.13d) / (400.0d - ((double) Math.abs(f182))));
        float signum4 = (100.0f / lVar2.f4908h) * Math.signum(f182) * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = (100.0f / lVar2.f4908h) * Math.signum(f192) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f192)) * 27.13d) / (400.0d - ((double) Math.abs(f192))))), 2.380952380952381d));
        float signum32 = Math.signum(f202);
        float[] fArr3 = lVar2.g;
        float f212 = signum4 / fArr3[0];
        float f222 = signum22 / fArr3[1];
        float pow32 = (((100.0f / lVar2.f4908h) * signum32) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f202)) * 27.13d) / (400.0d - ((double) Math.abs(f202))))), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = k.f3183x;
        float f232 = (fArr22[0][2] * pow32) + (fArr22[0][1] * f222) + (fArr22[0][0] * f212);
        float f242 = (fArr22[1][2] * pow32) + (fArr22[1][1] * f222) + (fArr22[1][0] * f212);
        float f252 = f212 * fArr22[2][0];
        return g0.a.a((double) f232, (double) f242, (double) ((pow32 * fArr22[2][2]) + (f222 * fArr22[2][1]) + f252));
    }
}
