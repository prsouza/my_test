package re;

import e6.e;
import java.util.Arrays;

public final class a1 extends t0<short[]> {

    /* renamed from: a  reason: collision with root package name */
    public short[] f10676a;

    /* renamed from: b  reason: collision with root package name */
    public int f10677b;

    public a1(short[] sArr) {
        e.D(sArr, "bufferWithData");
        this.f10676a = sArr;
        this.f10677b = sArr.length;
        b(10);
    }

    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f10676a, this.f10677b);
        e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void b(int i) {
        short[] sArr = this.f10676a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f10676a = copyOf;
        }
    }

    public final int d() {
        return this.f10677b;
    }
}
