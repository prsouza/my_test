package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;

public final class s0 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f442a;

    public s0(byte[] bArr) {
        this.f442a = a.a(bArr);
    }

    public final int hashCode() {
        return a.e(this.f442a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof s0)) {
            return false;
        }
        return Arrays.equals(this.f442a, ((s0) sVar).f442a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 25, this.f442a);
    }

    public final int l() {
        return v1.a(this.f442a.length) + 1 + this.f442a.length;
    }

    public final boolean o() {
        return false;
    }
}
