package re;

import e6.e;
import java.util.Arrays;

public final class f extends t0<boolean[]> {

    /* renamed from: a  reason: collision with root package name */
    public boolean[] f10691a;

    /* renamed from: b  reason: collision with root package name */
    public int f10692b;

    public f(boolean[] zArr) {
        e.D(zArr, "bufferWithData");
        this.f10691a = zArr;
        this.f10692b = zArr.length;
        b(10);
    }

    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f10691a, this.f10692b);
        e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void b(int i) {
        boolean[] zArr = this.f10691a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f10691a = copyOf;
        }
    }

    public final int d() {
        return this.f10692b;
    }
}
