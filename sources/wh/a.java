package wh;

import a.b;
import ad.c;
import java.lang.reflect.Array;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f12678a;

    /* renamed from: b  reason: collision with root package name */
    public int f12679b;

    /* renamed from: c  reason: collision with root package name */
    public int[][] f12680c;

    /* renamed from: d  reason: collision with root package name */
    public int f12681d;

    public a(int i, int[][] iArr) {
        if (iArr[0].length == ((i + 31) >> 5)) {
            this.f12679b = i;
            this.f12678a = iArr.length;
            this.f12681d = iArr[0].length;
            int i10 = i & 31;
            int i11 = i10 == 0 ? -1 : (1 << i10) - 1;
            for (int i12 = 0; i12 < this.f12678a; i12++) {
                int[] iArr2 = iArr[i12];
                int i13 = this.f12681d - 1;
                iArr2[i13] = iArr2[i13] & i11;
            }
            this.f12680c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public final byte[] a() {
        int i = this.f12678a;
        int i10 = 8;
        byte[] bArr = new byte[((((this.f12679b + 7) >>> 3) * i) + 8)];
        c.a(i, bArr, 0);
        c.a(this.f12679b, bArr, 4);
        int i11 = this.f12679b;
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        for (int i14 = 0; i14 < this.f12678a; i14++) {
            int i15 = 0;
            while (i15 < i12) {
                c.a(this.f12680c[i14][i15], bArr, i10);
                i15++;
                i10 += 4;
            }
            int i16 = 0;
            while (i16 < i13) {
                bArr[i10] = (byte) ((this.f12680c[i14][i12] >>> i16) & 255);
                i16 += 8;
                i10++;
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f12678a != aVar.f12678a || this.f12679b != aVar.f12679b || this.f12681d != aVar.f12681d) {
            return false;
        }
        for (int i = 0; i < this.f12678a; i++) {
            if (!b.V(this.f12680c[i], aVar.f12680c[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (((this.f12678a * 31) + this.f12679b) * 31) + this.f12681d;
        for (int i10 = 0; i10 < this.f12678a; i10++) {
            i = (i * 31) + xh.a.f(this.f12680c[i10]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f12679b & 31;
        int i10 = this.f12681d;
        if (i != 0) {
            i10--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < this.f12678a; i11++) {
            stringBuffer.append(i11 + ": ");
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = this.f12680c[i11][i12];
                for (int i14 = 0; i14 < 32; i14++) {
                    if (((i13 >>> i14) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i15 = this.f12680c[i11][this.f12681d - 1];
            for (int i16 = 0; i16 < i; i16++) {
                if (((i15 >>> i16) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }

    public a(a aVar) {
        this.f12679b = aVar.f12679b;
        this.f12678a = aVar.f12678a;
        this.f12681d = aVar.f12681d;
        this.f12680c = new int[aVar.f12680c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.f12680c;
            if (i < iArr.length) {
                iArr[i] = b.N(aVar.f12680c[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public a(byte[] bArr) {
        if (bArr.length >= 9) {
            this.f12678a = c.c(bArr, 0);
            int c10 = c.c(bArr, 4);
            this.f12679b = c10;
            int i = this.f12678a;
            int i10 = ((c10 + 7) >>> 3) * i;
            if (i > 0) {
                int i11 = 8;
                if (i10 == bArr.length - 8) {
                    int i12 = (c10 + 31) >>> 5;
                    this.f12681d = i12;
                    int[] iArr = new int[2];
                    iArr[1] = i12;
                    iArr[0] = i;
                    this.f12680c = (int[][]) Array.newInstance(int.class, iArr);
                    int i13 = this.f12679b;
                    int i14 = i13 >> 5;
                    int i15 = i13 & 31;
                    for (int i16 = 0; i16 < this.f12678a; i16++) {
                        int i17 = 0;
                        while (i17 < i14) {
                            this.f12680c[i16][i17] = c.c(bArr, i11);
                            i17++;
                            i11 += 4;
                        }
                        int i18 = 0;
                        while (i18 < i15) {
                            int[] iArr2 = this.f12680c[i16];
                            iArr2[i14] = ((bArr[i11] & 255) << i18) ^ iArr2[i14];
                            i18 += 8;
                            i11++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
