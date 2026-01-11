package tc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import h1.s;
import io.sentry.protocol.SentryRuntime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nd.g;
import qc.a;

public final class h extends a<Map<String, ? extends Object>, Map<String, ? extends Object>> {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11547b = true;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, a<?, ?>> f11548c;

    public h(Map<String, ? extends a<?, ?>> map) {
        super("ExtrinsicPayloadExtras");
        this.f11548c = map;
    }

    public final boolean d() {
        return this.f11547b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002e
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.keySet()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r4 = r2
            goto L_0x002b
        L_0x0018:
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.next()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L_0x001c
            r4 = r1
        L_0x002b:
            if (r4 == 0) goto L_0x002e
            r1 = r2
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.h.e(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Map<String, Object> a(b bVar, kc.a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        List list = (List) ((s) aVar.f7498b.f8014s).f5762b;
        int P = aa.b.P(g.S0(list));
        if (P < 16) {
            P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P);
        for (Object next : list) {
            a aVar2 = this.f11548c.get((String) next);
            linkedHashMap.put(next, aVar2 != null ? aVar2.a(bVar, aVar) : null);
        }
        return linkedHashMap;
    }

    /* renamed from: g */
    public final void b(c cVar, kc.a aVar, Map<String, ? extends Object> map) {
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(map, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        for (String str : (List) ((s) aVar.f7498b.f8014s).f5762b) {
            a aVar2 = this.f11548c.get(str);
            if (aVar2 != null) {
                aVar2.c(cVar, aVar, map.get(str));
            }
        }
    }
}
