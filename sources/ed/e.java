package ed;

import android.support.v4.media.b;
import ca.a;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class e<T> extends b {

    /* renamed from: v  reason: collision with root package name */
    public final b f4805v;

    public e(b bVar) {
        this.f4805v = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.util.List
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0031
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            android.support.v4.media.b r0 = r4.f4805v
            boolean r3 = r5 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0019
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0019
        L_0x0017:
            r5 = r2
            goto L_0x002e
        L_0x0019:
            java.util.Iterator r5 = r5.iterator()
        L_0x001d:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0017
            java.lang.Object r3 = r5.next()
            boolean r3 = r0.J(r3)
            if (r3 != 0) goto L_0x001d
            r5 = r1
        L_0x002e:
            if (r5 == 0) goto L_0x0031
            r1 = r2
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.e.J(java.lang.Object):boolean");
    }

    public final void b(c cVar, Object obj) {
        List<Object> list = (List) obj;
        e6.e.D(cVar, "writer");
        e6.e.D(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        BigInteger valueOf = BigInteger.valueOf((long) list.size());
        e6.e.C(valueOf, "BigInteger.valueOf(this.toLong())");
        a forNumber = a.forNumber(valueOf);
        byte[] a10 = fd.a.a(valueOf);
        if (forNumber != a.BIGINT) {
            fd.a.f5084a.b(cVar, Long.valueOf(valueOf.longValue()));
        } else {
            cVar.a(forNumber.getValue() + ((a10.length - 4) << 2));
            for (int length = a10.length - 1; length >= 0; length--) {
                cVar.a(a10[length]);
            }
        }
        for (Object b10 : list) {
            this.f4805v.b(cVar, b10);
        }
    }

    public final Object g(ca.b bVar) {
        e6.e.D(bVar, "reader");
        BigInteger r22 = d.f4804v.g(bVar);
        ArrayList arrayList = new ArrayList();
        int intValue = r22.intValue();
        for (int i = 0; i < intValue; i++) {
            arrayList.add(this.f4805v.g(bVar));
        }
        return arrayList;
    }
}
