package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;
import xh.h;

public final class h1 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f405a;

    public h1(byte[] bArr) {
        this.f405a = bArr;
    }

    public final int hashCode() {
        return a.e(this.f405a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof h1)) {
            return false;
        }
        return Arrays.equals(this.f405a, ((h1) sVar).f405a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 26, this.f405a);
    }

    public final int l() {
        return v1.a(this.f405a.length) + 1 + this.f405a.length;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        return h.a(this.f405a);
    }
}
