package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;
import xh.h;

public final class z extends s {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f467a;

    public z(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f467a = bArr;
            if (!r(0) || !r(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    public final int hashCode() {
        return a.e(this.f467a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof z)) {
            return false;
        }
        return Arrays.equals(this.f467a, ((z) sVar).f467a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 23, this.f467a);
    }

    public final int l() {
        int length = this.f467a.length;
        return v1.a(length) + 1 + length;
    }

    public final boolean o() {
        return false;
    }

    public final boolean r(int i) {
        byte[] bArr = this.f467a;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }

    public final String toString() {
        return h.a(this.f467a);
    }
}
