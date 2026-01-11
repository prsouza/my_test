package wh;

import a.b;
import ad.c;
import b9.m;
import xh.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int[] f12685a;

    public d(byte[] bArr) {
        int i;
        if (bArr.length > 4) {
            boolean z = false;
            int c10 = c.c(bArr, 0);
            int i10 = c10 - 1;
            int i11 = c.f12684a;
            if (i10 == 0) {
                i = 1;
            } else {
                i = 0;
                for (i10 = i10 < 0 ? -i10 : i10; i10 > 0; i10 >>>= 8) {
                    i++;
                }
            }
            if (bArr.length == (c10 * i) + 4) {
                this.f12685a = new int[c10];
                for (int i12 = 0; i12 < c10; i12++) {
                    int[] iArr = this.f12685a;
                    int i13 = (i12 * i) + 4;
                    int i14 = 0;
                    for (int i15 = i - 1; i15 >= 0; i15--) {
                        i14 |= (bArr[i13 + i15] & 255) << (i15 * 8);
                    }
                    iArr[i12] = i14;
                }
                int[] iArr2 = this.f12685a;
                int length = iArr2.length;
                boolean[] zArr = new boolean[length];
                int i16 = 0;
                while (true) {
                    if (i16 < length) {
                        if (iArr2[i16] < 0 || iArr2[i16] >= length || zArr[iArr2[i16]]) {
                            break;
                        }
                        zArr[iArr2[i16]] = true;
                        i16++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException("invalid encoding");
                }
                return;
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    public final byte[] a() {
        int i;
        int length = this.f12685a.length;
        int i10 = length - 1;
        int i11 = c.f12684a;
        if (i10 == 0) {
            i = 1;
        } else {
            if (i10 < 0) {
                i10 = -i10;
            }
            int i12 = 0;
            while (i10 > 0) {
                i12++;
                i10 >>>= 8;
            }
            i = i12;
        }
        byte[] bArr = new byte[((length * i) + 4)];
        c.a(length, bArr, 0);
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = this.f12685a[i13];
            int i15 = (i13 * i) + 4;
            for (int i16 = i - 1; i16 >= 0; i16--) {
                bArr[i15 + i16] = (byte) (i14 >>> (i16 * 8));
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return b.V(this.f12685a, ((d) obj).f12685a);
    }

    public final int hashCode() {
        return a.f(this.f12685a);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("[");
        d10.append(this.f12685a[0]);
        String sb2 = d10.toString();
        for (int i = 1; i < this.f12685a.length; i++) {
            StringBuilder c10 = m.c(sb2, ", ");
            c10.append(this.f12685a[i]);
            sb2 = c10.toString();
        }
        return a8.a.c(sb2, "]");
    }
}
