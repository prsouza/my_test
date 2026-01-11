package re;

import e6.e;
import java.util.Arrays;

public final class o extends t0<double[]> {

    /* renamed from: a  reason: collision with root package name */
    public double[] f10732a;

    /* renamed from: b  reason: collision with root package name */
    public int f10733b;

    public o(double[] dArr) {
        e.D(dArr, "bufferWithData");
        this.f10732a = dArr;
        this.f10733b = dArr.length;
        b(10);
    }

    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f10732a, this.f10733b);
        e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void b(int i) {
        double[] dArr = this.f10732a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f10732a = copyOf;
        }
    }

    public final int d() {
        return this.f10733b;
    }
}
