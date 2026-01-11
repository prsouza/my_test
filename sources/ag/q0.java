package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;
import xh.h;

public final class q0 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f436a;

    public q0(byte[] bArr) {
        this.f436a = bArr;
    }

    public final int hashCode() {
        return a.e(this.f436a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof q0)) {
            return false;
        }
        return Arrays.equals(this.f436a, ((q0) sVar).f436a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 27, this.f436a);
    }

    public final int l() {
        return v1.a(this.f436a.length) + 1 + this.f436a.length;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        return h.a(this.f436a);
    }
}
