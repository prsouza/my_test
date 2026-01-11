package jh;

import a.b;
import b9.m;

public final class a extends b {
    public int F;
    public byte[] G;

    public a(int i, byte[] bArr) {
        int i10;
        int length = bArr.length;
        if (i == 5) {
            i10 = 5184;
        } else if (i == 6) {
            i10 = 12352;
        } else {
            throw new IllegalArgumentException(m.b("unknown security category: ", i));
        }
        if (length == i10) {
            this.F = i;
            this.G = xh.a.a(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public final byte[] S0() {
        return xh.a.a(this.G);
    }
}
