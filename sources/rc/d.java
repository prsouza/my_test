package rc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import java.util.ArrayList;
import java.util.List;
import kc.a;

public final class d extends j<List<?>> {

    /* renamed from: c  reason: collision with root package name */
    public final int f10662c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, int i, qc.d dVar) {
        super(str, dVar);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f10662c = i;
    }

    public final Object a(b bVar, a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        qc.a<?, ?> b10 = this.f10667b.b();
        ArrayList arrayList = new ArrayList();
        int i = this.f10662c;
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add(b10.a(bVar, aVar));
        }
        return arrayList;
    }

    public final void b(c cVar, a aVar, Object obj) {
        List<Object> list = (List) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.a<?, ?> b10 = this.f10667b.b();
        for (Object c10 : list) {
            b10.c(cVar, aVar, c10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r6) {
        /*
            r5 = this;
            qc.d r0 = r5.f10667b
            qc.a r0 = r0.b()
            boolean r1 = r6 instanceof java.util.List
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0040
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            int r4 = r5.f10662c
            if (r1 != r4) goto L_0x0040
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0028
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0028
        L_0x0026:
            r6 = r3
            goto L_0x003d
        L_0x0028:
            java.util.Iterator r6 = r6.iterator()
        L_0x002c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r6.next()
            boolean r1 = r0.e(r1)
            if (r1 != 0) goto L_0x002c
            r6 = r2
        L_0x003d:
            if (r6 == 0) goto L_0x0040
            r2 = r3
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.d.e(java.lang.Object):boolean");
    }
}
