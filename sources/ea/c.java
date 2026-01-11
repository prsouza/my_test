package ea;

import ca.a;
import ca.e;
import java.io.IOException;
import java.math.BigInteger;

public final class c implements e<BigInteger> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f4797a = new e();

    /* renamed from: a */
    public final void b(ca.c cVar, BigInteger bigInteger) throws IOException {
        a forNumber = a.forNumber(bigInteger);
        byte[] byteArray = bigInteger.toByteArray();
        if (forNumber != a.BIGINT) {
            f4797a.b(cVar, Long.valueOf(bigInteger.longValue()));
            return;
        }
        cVar.a(forNumber.getValue() + ((byteArray.length - 4) << 2));
        for (int length = byteArray.length - 1; length >= 0; length--) {
            cVar.a(byteArray[length]);
        }
    }
}
