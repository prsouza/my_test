package re;

import e6.e;
import java.util.Arrays;

public final class i extends t0<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f10707a;

    /* renamed from: b  reason: collision with root package name */
    public int f10708b;

    public i(byte[] bArr) {
        e.D(bArr, "bufferWithData");
        this.f10707a = bArr;
        this.f10708b = bArr.length;
        b(10);
    }

    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f10707a, this.f10708b);
        e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void b(int i) {
        byte[] bArr = this.f10707a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i);
            e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f10707a = copyOf;
        }
    }

    public final int d() {
        return this.f10708b;
    }
}
