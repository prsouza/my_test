package ed;

import android.support.v4.media.b;
import ca.a;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.math.BigInteger;

public final class d extends b {

    /* renamed from: v  reason: collision with root package name */
    public static final d f4804v = new d();

    public final boolean J(Object obj) {
        return obj instanceof BigInteger;
    }

    /* renamed from: r2 */
    public final BigInteger g(ca.b bVar) {
        BigInteger bigInteger;
        e.D(bVar, "reader");
        int d10 = bVar.d();
        if (a.byValue((byte) (d10 & 3)) != a.BIGINT) {
            int abs = Math.abs(-1);
            int i = bVar.f3311b;
            if (abs <= i) {
                bVar.f3311b = i - 1;
                bigInteger = BigInteger.valueOf((long) da.a.f4400a.s(bVar).intValue());
            } else {
                StringBuilder d11 = a.a.d("Position cannot be negative: ");
                d11.append(bVar.f3311b);
                d11.append(" ");
                d11.append(-1);
                throw new IllegalArgumentException(d11.toString());
            }
        } else {
            byte[] c10 = bVar.c((d10 >> 2) + 4);
            for (int i10 = 0; i10 < c10.length / 2; i10++) {
                byte b10 = c10[i10];
                c10[i10] = c10[(c10.length - i10) - 1];
                c10[(c10.length - i10) - 1] = b10;
            }
            bigInteger = new BigInteger(1, c10);
        }
        e.C(bigInteger, "read");
        return bigInteger;
    }

    /* renamed from: s2 */
    public final void b(c cVar, BigInteger bigInteger) {
        e.D(cVar, "writer");
        e.D(bigInteger, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        a forNumber = a.forNumber(bigInteger);
        byte[] a10 = fd.a.a(bigInteger);
        if (forNumber != a.BIGINT) {
            fd.a.f5084a.b(cVar, Long.valueOf(bigInteger.longValue()));
            return;
        }
        cVar.a(forNumber.getValue() + ((a10.length - 4) << 2));
        for (int length = a10.length - 1; length >= 0; length--) {
            cVar.a(a10[length]);
        }
    }
}
