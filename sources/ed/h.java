package ed;

import android.support.v4.media.b;
import ca.a;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.nio.charset.StandardCharsets;

public final class h extends b {

    /* renamed from: v  reason: collision with root package name */
    public static final h f4808v = new h();

    public final boolean J(Object obj) {
        return obj instanceof String;
    }

    public final void b(c cVar, Object obj) {
        int i;
        String str = (String) obj;
        e.D(cVar, "writer");
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        Integer valueOf = Integer.valueOf(bytes.length);
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
        cVar.f3316a.write(bytes, 0, bytes.length);
    }

    public final Object g(ca.b bVar) {
        e.D(bVar, "reader");
        return new String(bVar.c(ca.b.f3309c.s(bVar).intValue()));
    }
}
