package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;
import xh.h;

public final class v0 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f456a;

    public v0(byte[] bArr) {
        this.f456a = bArr;
    }

    public final int hashCode() {
        return a.e(this.f456a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof v0)) {
            return false;
        }
        return Arrays.equals(this.f456a, ((v0) sVar).f456a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 18, this.f456a);
    }

    public final int l() {
        return v1.a(this.f456a.length) + 1 + this.f456a.length;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        return h.a(this.f456a);
    }
}
