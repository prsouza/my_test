package ag;

import java.io.IOException;
import java.util.Arrays;

public final class m0 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final char[] f422a;

    public m0(char[] cArr) {
        this.f422a = cArr;
    }

    public final int hashCode() {
        char[] cArr = this.f422a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof m0)) {
            return false;
        }
        return Arrays.equals(this.f422a, ((m0) sVar).f422a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        int length = this.f422a.length;
        if (z) {
            qVar.d(30);
        }
        qVar.j(length * 2);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i10 = 0;
        while (i10 < i) {
            char[] cArr = this.f422a;
            char c10 = cArr[i10];
            char c11 = cArr[i10 + 1];
            char c12 = cArr[i10 + 2];
            char c13 = cArr[i10 + 3];
            i10 += 4;
            bArr[0] = (byte) (c10 >> 8);
            bArr[1] = (byte) c10;
            bArr[2] = (byte) (c11 >> 8);
            bArr[3] = (byte) c11;
            bArr[4] = (byte) (c12 >> 8);
            bArr[5] = (byte) c12;
            bArr[6] = (byte) (c13 >> 8);
            bArr[7] = (byte) c13;
            qVar.e(bArr, 0, 8);
        }
        if (i10 < length) {
            int i11 = 0;
            do {
                char c14 = this.f422a[i10];
                i10++;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (c14 >> 8);
                i11 = i12 + 1;
                bArr[i12] = (byte) c14;
            } while (i10 < length);
            qVar.e(bArr, 0, i11);
        }
    }

    public final int l() {
        return (this.f422a.length * 2) + v1.a(this.f422a.length * 2) + 1;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        return new String(this.f422a);
    }
}
