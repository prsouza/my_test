package re;

import e6.e;
import java.util.Arrays;

public final class j0 extends t0<long[]> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f10711a;

    /* renamed from: b  reason: collision with root package name */
    public int f10712b;

    public j0(long[] jArr) {
        e.D(jArr, "bufferWithData");
        this.f10711a = jArr;
        this.f10712b = jArr.length;
        b(10);
    }

    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f10711a, this.f10712b);
        e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void b(int i) {
        long[] jArr = this.f10711a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f10711a = copyOf;
        }
    }

    public final int d() {
        return this.f10712b;
    }
}
