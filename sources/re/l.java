package re;

import e6.e;
import java.util.Arrays;

public final class l extends t0<char[]> {

    /* renamed from: a  reason: collision with root package name */
    public char[] f10716a;

    /* renamed from: b  reason: collision with root package name */
    public int f10717b;

    public l(char[] cArr) {
        e.D(cArr, "bufferWithData");
        this.f10716a = cArr;
        this.f10717b = cArr.length;
        b(10);
    }

    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f10716a, this.f10717b);
        e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void b(int i) {
        char[] cArr = this.f10716a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f10716a = copyOf;
        }
    }

    public final int d() {
        return this.f10717b;
    }
}
