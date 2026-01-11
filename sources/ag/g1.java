package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;

public final class g1 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f399a;

    public g1(byte[] bArr) {
        this.f399a = a.a(bArr);
    }

    public final int hashCode() {
        return a.e(this.f399a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof g1)) {
            return false;
        }
        return Arrays.equals(this.f399a, ((g1) sVar).f399a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 21, this.f399a);
    }

    public final int l() {
        return v1.a(this.f399a.length) + 1 + this.f399a.length;
    }

    public final boolean o() {
        return false;
    }
}
