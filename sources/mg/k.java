package mg;

import a8.a;
import lg.d;

public final class k extends c implements d {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(int i) {
        super(i);
        if (i == 128 || i == 256) {
            return;
        }
        throw new IllegalArgumentException(a.b("'bitLength' ", i, " not supported for SHAKE"));
    }

    public final int b(byte[] bArr, int i) {
        int i10 = this.f8694e / 8;
        g(bArr, i, i10);
        return i10;
    }

    public final String c() {
        StringBuilder d10 = a.a.d("SHAKE");
        d10.append(this.f8694e);
        return d10.toString();
    }

    public final int g(byte[] bArr, int i, int i10) {
        if (!this.f8695f) {
            k(15, 4);
        }
        m(bArr, i, ((long) i10) * 8);
        reset();
        return i10;
    }
}
