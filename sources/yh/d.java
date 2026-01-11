package yh;

import java.io.IOException;
import java.io.OutputStream;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13664a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f13665b = new byte[128];

    public d() {
        int i = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f13665b;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = -1;
            i10++;
        }
        while (true) {
            byte[] bArr2 = this.f13664a;
            if (i < bArr2.length) {
                this.f13665b[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = this.f13665b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }

    public static boolean c(char c10) {
        return c10 == 10 || c10 == 13 || c10 == 9 || c10 == ' ';
    }

    public final int a(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0) {
            int i = length - 1;
            if (!c(str.charAt(i))) {
                break;
            }
            length = i;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            while (i10 < length && c(str.charAt(i10))) {
                i10++;
            }
            int i12 = i10 + 1;
            byte b10 = this.f13665b[str.charAt(i10)];
            while (i12 < length && c(str.charAt(i12))) {
                i12++;
            }
            int i13 = i12 + 1;
            byte b11 = this.f13665b[str.charAt(i12)];
            if ((b10 | b11) >= 0) {
                outputStream.write((b10 << 4) | b11);
                i11++;
                i10 = i13;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        return i11;
    }

    public final byte[] b(String str, int i) throws IOException {
        if (i < 0 || str.length() - i < 0) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        } else if ((i & 1) == 0) {
            int i10 = i >>> 1;
            byte[] bArr = new byte[i10];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                byte b10 = (this.f13665b[str.charAt(i12)] << 4) | this.f13665b[str.charAt(i13)];
                if (b10 >= 0) {
                    bArr[i11] = (byte) b10;
                    i11++;
                    i12 = i14;
                } else {
                    throw new IOException("invalid characters encountered in Hex string");
                }
            }
            return bArr;
        } else {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
    }
}
