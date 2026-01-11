package ag;

import java.io.IOException;
import java.util.Objects;

public final class i1 extends b {
    public i1(byte[] bArr, int i) {
        super(bArr, i);
    }

    public final void k(q qVar, boolean z) throws IOException {
        byte b10 = (byte) this.f373b;
        byte[] bArr = this.f372a;
        Objects.requireNonNull(qVar);
        if (z) {
            qVar.d(3);
        }
        qVar.j(bArr.length + 1);
        qVar.d(b10);
        qVar.e(bArr, 0, bArr.length);
    }

    public final int l() {
        return v1.a(this.f372a.length + 1) + 1 + this.f372a.length + 1;
    }

    public final boolean o() {
        return false;
    }

    public final s q() {
        return this;
    }
}
