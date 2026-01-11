package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;

public class i extends s {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f406a;

    public i(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f406a = bArr;
            if (!r(0) || !r(1) || !r(2) || !r(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    public final int hashCode() {
        return a.e(this.f406a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof i)) {
            return false;
        }
        return Arrays.equals(this.f406a, ((i) sVar).f406a);
    }

    public void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 24, this.f406a);
    }

    public int l() {
        int length = this.f406a.length;
        return v1.a(length) + 1 + length;
    }

    public final boolean o() {
        return false;
    }

    public s p() {
        return new r0(this.f406a);
    }

    public s q() {
        return new r0(this.f406a);
    }

    public final boolean r(int i) {
        byte[] bArr = this.f406a;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }
}
