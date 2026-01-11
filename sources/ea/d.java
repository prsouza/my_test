package ea;

import ca.a;
import ca.c;
import ca.e;
import java.io.IOException;

public final class d implements e<Integer> {
    /* renamed from: a */
    public final void b(c cVar, Integer num) throws IOException {
        int i;
        a forNumber = a.forNumber(num.intValue());
        int i10 = 4;
        if (forNumber == a.BIGINT) {
            cVar.a(forNumber.getValue());
            i = num.intValue();
        } else {
            i = (num.intValue() << 2) + forNumber.getValue();
            if (forNumber == a.SINGLE) {
                i10 = 1;
            } else if (forNumber == a.TWO) {
                i10 = 2;
            }
        }
        while (i10 > 0) {
            cVar.a(i & 255);
            i >>= 8;
            i10--;
        }
    }
}
