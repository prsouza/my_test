package re;

import e6.e;
import java.util.Arrays;

public final class z extends t0<int[]> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f10764a;

    /* renamed from: b  reason: collision with root package name */
    public int f10765b;

    public z(int[] iArr) {
        e.D(iArr, "bufferWithData");
        this.f10764a = iArr;
        this.f10765b = iArr.length;
        b(10);
    }

    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f10764a, this.f10765b);
        e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void b(int i) {
        int[] iArr = this.f10764a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f10764a = copyOf;
        }
    }

    public final int d() {
        return this.f10765b;
    }
}
