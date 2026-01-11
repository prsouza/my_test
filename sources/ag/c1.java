package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;
import xh.h;

public final class c1 extends s {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f381a;

    public c1(byte[] bArr) {
        this.f381a = a.a(bArr);
    }

    public final int hashCode() {
        return a.e(this.f381a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof c1)) {
            return false;
        }
        return Arrays.equals(this.f381a, ((c1) sVar).f381a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 20, this.f381a);
    }

    public final int l() {
        return v1.a(this.f381a.length) + 1 + this.f381a.length;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        return h.a(this.f381a);
    }
}
