package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;
import xh.h;

public final class z0 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f468a;

    public z0(byte[] bArr) {
        this.f468a = bArr;
    }

    public final int hashCode() {
        return a.e(this.f468a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof z0)) {
            return false;
        }
        return Arrays.equals(this.f468a, ((z0) sVar).f468a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 19, this.f468a);
    }

    public final int l() {
        return v1.a(this.f468a.length) + 1 + this.f468a.length;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        return h.a(this.f468a);
    }
}
