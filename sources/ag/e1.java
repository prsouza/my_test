package ag;

import java.io.IOException;
import java.util.Arrays;
import xh.a;
import xh.h;
import yh.e;

public final class e1 extends s {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f391a;

    public e1(byte[] bArr) {
        this.f391a = bArr;
    }

    public final int hashCode() {
        return a.e(this.f391a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof e1)) {
            return false;
        }
        return Arrays.equals(this.f391a, ((e1) sVar).f391a);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.h(z, 12, this.f391a);
    }

    public final int l() throws IOException {
        return v1.a(this.f391a.length) + 1 + this.f391a.length;
    }

    public final boolean o() {
        return false;
    }

    public final String toString() {
        byte[] bArr = this.f391a;
        int i = h.f13295a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = e.f13666a;
        int i10 = 0;
        int i11 = 0;
        loop0:
        while (true) {
            if (i10 >= bArr.length) {
                break;
            }
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0) {
                short s10 = e.f13666a[b10 & Byte.MAX_VALUE];
                int i13 = s10 >>> 8;
                byte b11 = (byte) s10;
                while (true) {
                    if (b11 < 0) {
                        if (b11 == -2) {
                            break;
                        }
                        if (i13 <= 65535) {
                            if (i11 >= length) {
                                break;
                            }
                            cArr[i11] = (char) i13;
                            i11++;
                        } else if (i11 >= length - 1) {
                            break;
                        } else {
                            int i14 = i11 + 1;
                            cArr[i11] = (char) ((i13 >>> 10) + 55232);
                            i11 = i14 + 1;
                            cArr[i14] = (char) ((i13 & 1023) | 56320);
                        }
                        i10 = i12;
                    } else if (i12 >= bArr.length) {
                        break loop0;
                    } else {
                        int i15 = i12 + 1;
                        byte b12 = bArr[i12];
                        i13 = (i13 << 6) | (b12 & 63);
                        b11 = e.f13667b[b11 + ((b12 & 255) >>> 4)];
                        i12 = i15;
                    }
                }
            } else if (i11 >= length) {
                break;
            } else {
                cArr[i11] = (char) b10;
                i10 = i12;
                i11++;
            }
        }
        i11 = -1;
        if (i11 >= 0) {
            return new String(cArr, 0, i11);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }
}
