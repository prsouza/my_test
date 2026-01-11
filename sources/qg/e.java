package qg;

import a.b;
import xh.a;

public final class e extends b {
    public final byte[] F;

    public e(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.F = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }

    public final byte[] getEncoded() {
        return a.a(this.F);
    }
}
