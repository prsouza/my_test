package xg;

import c3.r;
import java.math.BigInteger;
import xg.d;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final BigInteger f13262a;

    /* renamed from: b  reason: collision with root package name */
    public static final BigInteger f13263b = b.f13230c.negate();

    /* renamed from: c  reason: collision with root package name */
    public static final r[] f13264c;

    /* renamed from: d  reason: collision with root package name */
    public static final byte[][] f13265d = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};

    /* renamed from: e  reason: collision with root package name */
    public static final r[] f13266e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[][] f13267f = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};

    static {
        BigInteger bigInteger = b.f13229b;
        BigInteger negate = bigInteger.negate();
        f13262a = negate;
        BigInteger negate2 = b.f13231d.negate();
        BigInteger bigInteger2 = b.f13228a;
        f13264c = new r[]{null, new r(bigInteger, bigInteger2), null, new r(negate2, negate), null, new r(negate, negate), null, new r(bigInteger, negate), null};
        f13266e = new r[]{null, new r(bigInteger, bigInteger2), null, new r(negate2, bigInteger), null, new r(negate, bigInteger), null, new r(bigInteger, bigInteger), null};
    }

    public static m a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b10, int i) {
        int i10 = ((i + 5) / 2) + 10;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i10) - 2) + b10));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i11 = i10 - 10;
        BigInteger shiftRight = add.shiftRight(i11);
        if (add.testBit(i11 - 1)) {
            shiftRight = shiftRight.add(b.f13229b);
        }
        return new m(shiftRight, 10);
    }

    public static BigInteger[] b(byte b10, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b10 == 1 || b10 == -1) {
            if (z) {
                bigInteger = b.f13230c;
                bigInteger2 = BigInteger.valueOf((long) b10);
            } else {
                bigInteger = b.f13228a;
                bigInteger2 = b.f13229b;
            }
            int i10 = 1;
            while (i10 < i) {
                i10++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b10 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static BigInteger[] c(d.a aVar) {
        int i;
        if (aVar.r()) {
            int k10 = aVar.k();
            int intValue = aVar.f13238b.q().intValue();
            byte b10 = (byte) (intValue == 0 ? -1 : 1);
            BigInteger bigInteger = aVar.f13241e;
            if (bigInteger != null) {
                if (bigInteger.equals(b.f13230c)) {
                    i = 1;
                } else if (bigInteger.equals(b.f13232e)) {
                    i = 2;
                }
                BigInteger[] b11 = b(b10, (k10 + 3) - intValue, false);
                if (b10 == 1) {
                    b11[0] = b11[0].negate();
                    b11[1] = b11[1].negate();
                }
                BigInteger bigInteger2 = b.f13229b;
                return new BigInteger[]{bigInteger2.add(b11[1]).shiftRight(i), bigInteger2.add(b11[0]).shiftRight(i).negate()};
            }
            throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }
}
