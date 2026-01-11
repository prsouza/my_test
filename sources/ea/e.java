package ea;

import ca.a;
import ca.c;
import java.io.IOException;
import java.math.BigInteger;

public final class e implements ca.e<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4798a = new c();

    /* renamed from: a */
    public final void b(c cVar, Long l10) throws IOException {
        a forNumber = a.forNumber(l10.longValue());
        if (forNumber == a.BIGINT) {
            f4798a.b(cVar, BigInteger.valueOf(l10.longValue()));
            return;
        }
        long longValue = l10.longValue();
        int i = 2;
        long value = (longValue << 2) + ((long) forNumber.getValue());
        if (forNumber == a.SINGLE) {
            i = 1;
        } else if (forNumber != a.TWO) {
            i = 4;
        }
        while (i > 0) {
            cVar.a(((int) value) & 255);
            value >>= 8;
            i--;
        }
    }
}
