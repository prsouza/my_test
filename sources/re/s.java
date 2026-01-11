package re;

import e6.e;
import java.util.Arrays;

public final class s extends t0<float[]> {

    /* renamed from: a  reason: collision with root package name */
    public float[] f10750a;

    /* renamed from: b  reason: collision with root package name */
    public int f10751b;

    public s(float[] fArr) {
        e.D(fArr, "bufferWithData");
        this.f10750a = fArr;
        this.f10751b = fArr.length;
        b(10);
    }

    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f10750a, this.f10751b);
        e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void b(int i) {
        float[] fArr = this.f10750a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f10750a = copyOf;
        }
    }

    public final int d() {
        return this.f10751b;
    }
}
