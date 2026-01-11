package b1;

import a.a;
import android.view.animation.Interpolator;

public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2823a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2824b;

    public d(float[] fArr) {
        this.f2823a = fArr;
        this.f2824b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2823a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f2824b;
        float f12 = (f10 - (((float) min) * f11)) / f11;
        float[] fArr2 = this.f2823a;
        return a.a(fArr2[min + 1], fArr2[min], f12, fArr2[min]);
    }
}
