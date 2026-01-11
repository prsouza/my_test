package xg;

import android.support.v4.media.b;
import java.math.BigInteger;

public final class p extends b {
    public final f x1(f fVar, BigInteger bigInteger) {
        int[] iArr;
        f fVar2;
        f fVar3 = fVar;
        BigInteger bigInteger2 = bigInteger;
        q D1 = b.D1(fVar3, b.w0(bigInteger.bitLength(), b.f730c, 16));
        f[] fVarArr = D1.f13273c;
        f[] fVarArr2 = D1.f13274d;
        int i = D1.f13276f;
        if (i == 2) {
            if ((bigInteger.bitLength() >>> 16) != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            } else if (bigInteger.signum() == 0) {
                iArr = b.f732t;
            } else {
                BigInteger add = bigInteger2.shiftLeft(1).add(bigInteger2);
                int bitLength = add.bitLength();
                int i10 = bitLength >> 1;
                int[] iArr2 = new int[i10];
                BigInteger xor = add.xor(bigInteger2);
                int i11 = bitLength - 1;
                int i12 = 1;
                int i13 = 0;
                int i14 = 0;
                while (i12 < i11) {
                    if (!xor.testBit(i12)) {
                        i14++;
                    } else {
                        iArr2[i13] = i14 | ((bigInteger2.testBit(i12) ? -1 : 1) << 16);
                        i12++;
                        i14 = 1;
                        i13++;
                    }
                    i12++;
                }
                int i15 = i13 + 1;
                iArr2[i13] = 65536 | i14;
                if (i10 > i15) {
                    int[] iArr3 = new int[i15];
                    System.arraycopy(iArr2, 0, iArr3, 0, i15);
                    iArr = iArr3;
                } else {
                    iArr = iArr2;
                }
            }
        } else if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        } else if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            iArr = b.f732t;
        } else {
            int bitLength2 = (bigInteger.bitLength() / i) + 1;
            int[] iArr4 = new int[bitLength2];
            int i16 = 1 << i;
            int i17 = i16 - 1;
            int i18 = i16 >>> 1;
            int i19 = 0;
            int i20 = 0;
            boolean z = false;
            while (i19 <= bigInteger2.bitLength()) {
                if (bigInteger2.testBit(i19) == z) {
                    i19++;
                } else {
                    bigInteger2 = bigInteger2.shiftRight(i19);
                    int intValue = bigInteger2.intValue() & i17;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i18) != 0;
                    if (z) {
                        intValue -= i16;
                    }
                    if (i20 > 0) {
                        i19--;
                    }
                    iArr4[i20] = (intValue << 16) | i19;
                    i19 = i;
                    i20++;
                }
            }
            if (bitLength2 > i20) {
                iArr = new int[i20];
                System.arraycopy(iArr4, 0, iArr, 0, i20);
            } else {
                iArr = iArr4;
            }
        }
        f l10 = fVar3.f13245a.l();
        int length = iArr.length;
        if (length > 1) {
            length--;
            int i21 = iArr[length];
            int i22 = i21 >> 16;
            int i23 = i21 & 65535;
            int abs = Math.abs(i22);
            f[] fVarArr3 = i22 < 0 ? fVarArr2 : fVarArr;
            if ((abs << 2) < (1 << i)) {
                int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(abs);
                int i24 = i - numberOfLeadingZeros;
                fVar2 = fVarArr3[((1 << (i - 1)) - 1) >>> 1].a(fVarArr3[(((abs ^ (1 << (numberOfLeadingZeros - 1))) << i24) + 1) >>> 1]);
                i23 -= i24;
            } else {
                fVar2 = fVarArr3[abs >>> 1];
            }
            l10 = fVar2.v(i23);
        }
        while (length > 0) {
            length--;
            int i25 = iArr[length];
            int i26 = i25 >> 16;
            l10 = l10.x((i26 < 0 ? fVarArr2 : fVarArr)[Math.abs(i26) >>> 1]).v(i25 & 65535);
        }
        return l10;
    }
}
