package jh;

import b9.m;
import xh.a;

public final class b extends a.b {
    public int F;
    public byte[] G;

    public b(int i, byte[] bArr) {
        int i10;
        int length = bArr.length;
        if (i == 5) {
            i10 = 14880;
        } else if (i == 6) {
            i10 = 38432;
        } else {
            throw new IllegalArgumentException(m.b("unknown security category: ", i));
        }
        if (length == i10) {
            this.F = i;
            this.G = a.a(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public final byte[] S0() {
        return a.a(this.G);
    }
}
