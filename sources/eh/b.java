package eh;

import java.math.BigInteger;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final f f4835a = new f(BigInteger.valueOf(2));

    /* renamed from: b  reason: collision with root package name */
    public static final f f4836b = new f(BigInteger.valueOf(3));

    public static e a(int[] iArr) {
        if (iArr[0] == 0) {
            int i = 1;
            while (i < iArr.length) {
                if (iArr[i] > iArr[i - 1]) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
                }
            }
            return new d(f4835a, new c(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }
}
