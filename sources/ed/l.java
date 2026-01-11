package ed;

import android.support.v4.media.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fd.a;
import java.math.BigInteger;
import java.nio.ByteOrder;
import nd.d;
import nd.f;

public final class l extends b {

    /* renamed from: v  reason: collision with root package name */
    public final int f4813v;

    public l(int i) {
        this.f4813v = i;
    }

    public final boolean J(Object obj) {
        return obj instanceof BigInteger;
    }

    /* renamed from: r2 */
    public final BigInteger g(ca.b bVar) {
        e.D(bVar, "reader");
        byte[] c10 = bVar.c(this.f4813v);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        e.C(byteOrder, "ByteOrder.LITTLE_ENDIAN");
        if (e.r(byteOrder, byteOrder)) {
            c10 = f.N(c10);
        }
        return new BigInteger(1, c10);
    }

    /* renamed from: s2 */
    public final void b(c cVar, BigInteger bigInteger) {
        e.D(cVar, "writer");
        e.D(bigInteger, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        byte[] a10 = a.a(bigInteger);
        int i = this.f4813v;
        byte[] bArr = new byte[i];
        d.F(a10, bArr, i - a10.length, 0, 0, 12);
        cVar.c(f.N(bArr), this.f4813v);
    }
}
