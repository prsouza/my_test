package ed;

import android.support.v4.media.b;
import ca.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;

public final class c extends b {

    /* renamed from: v  reason: collision with root package name */
    public static final c f4803v = new c();

    public final boolean J(Object obj) {
        return obj instanceof byte[];
    }

    public final Object g(ca.b bVar) {
        e.D(bVar, "reader");
        return bVar.c(ca.b.f3309c.s(bVar).intValue());
    }

    /* renamed from: r2 */
    public final void b(ca.c cVar, byte[] bArr) {
        int i;
        e.D(cVar, "writer");
        e.D(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Integer valueOf = Integer.valueOf(bArr.length);
        a forNumber = a.forNumber(valueOf.intValue());
        int i10 = 4;
        if (forNumber == a.BIGINT) {
            cVar.a(forNumber.getValue());
            i = valueOf.intValue();
        } else {
            i = (valueOf.intValue() << 2) + forNumber.getValue();
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
        cVar.f3316a.write(bArr, 0, bArr.length);
    }
}
