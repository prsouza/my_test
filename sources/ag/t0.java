package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;
import xh.h;

public final class t0 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f448a;

    public t0(byte[] bArr) {
        this.f448a = bArr;
    }

    public final int hashCode() {
        return a.e(this.f448a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof t0)) {
            return false;
        }
        return Arrays.equals(this.f448a, ((t0) sVar).f448a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 22, this.f448a);
    }

    public final int l() {
        return v1.a(this.f448a.length) + 1 + this.f448a.length;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        return h.a(this.f448a);
    }
}
