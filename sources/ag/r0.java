package ag;

import java.io.IOException;
import xh.h;

public final class r0 extends i {
    public r0(byte[] bArr) {
        super(bArr);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 24, s());
    }

    public final int l() {
        int length = s().length;
        return v1.a(length) + 1 + length;
    }

    public final s p() {
        return this;
    }

    public final s q() {
        return this;
    }

    public final byte[] s() {
        byte[] bArr;
        boolean z;
        byte[] bArr2 = this.f406a;
        if (bArr2[bArr2.length - 1] != 90) {
            return bArr2;
        }
        if (!(r(10) && r(11))) {
            byte[] bArr3 = this.f406a;
            byte[] bArr4 = new byte[(bArr3.length + 4)];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length - 1);
            System.arraycopy(h.b("0000Z"), 0, bArr4, this.f406a.length - 1, 5);
            return bArr4;
        }
        if (!(r(12) && r(13))) {
            byte[] bArr5 = this.f406a;
            byte[] bArr6 = new byte[(bArr5.length + 2)];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length - 1);
            System.arraycopy(h.b("00Z"), 0, bArr6, this.f406a.length - 1, 3);
            return bArr6;
        }
        int i = 0;
        while (true) {
            bArr = this.f406a;
            if (i != bArr.length) {
                if (bArr[i] == 46 && i == 14) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return bArr;
        }
        int length = bArr.length - 2;
        while (length > 0 && this.f406a[length] == 48) {
            length--;
        }
        byte[] bArr7 = this.f406a;
        if (bArr7[length] == 46) {
            byte[] bArr8 = new byte[(length + 1)];
            System.arraycopy(bArr7, 0, bArr8, 0, length);
            bArr8[length] = 90;
            return bArr8;
        }
        byte[] bArr9 = new byte[(length + 2)];
        int i10 = length + 1;
        System.arraycopy(bArr7, 0, bArr9, 0, i10);
        bArr9[i10] = 90;
        return bArr9;
    }
}
