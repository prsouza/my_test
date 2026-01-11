package rc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import java.util.LinkedHashMap;
import java.util.Map;
import qc.d;

public final class g extends qc.a<a, a> {

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, d> f10664b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Object> f10665a;

        public a(Map<String, ? extends Object> map) {
            this.f10665a = map;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str, LinkedHashMap<String, d> linkedHashMap) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(linkedHashMap, "mapping");
        this.f10664b = linkedHashMap;
    }

    public final Object a(b bVar, kc.a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        LinkedHashMap<String, d> linkedHashMap = this.f10664b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aa.b.P(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((d) entry.getValue()).b().a(bVar, aVar));
        }
        return new a(linkedHashMap2);
    }

    public final void b(c cVar, kc.a aVar, Object obj) {
        a aVar2 = (a) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(aVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        for (Map.Entry next : this.f10664b.entrySet()) {
            qc.a<?, ?> b10 = ((d) next.getValue()).b();
            Object obj2 = aVar2.f10665a.get((String) next.getKey());
            if (!(obj2 instanceof Object)) {
                obj2 = null;
            }
            b10.c(cVar, aVar, obj2);
        }
    }

    public final boolean d() {
        LinkedHashMap<String, d> linkedHashMap = this.f10664b;
        if (!linkedHashMap.isEmpty()) {
            for (Map.Entry<String, d> value : linkedHashMap.entrySet()) {
                if (!((d) value.getValue()).a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        LinkedHashMap<String, d> linkedHashMap = this.f10664b;
        if (!linkedHashMap.isEmpty()) {
            for (Map.Entry next : linkedHashMap.entrySet()) {
                qc.a<?, ?> b10 = ((d) next.getValue()).b();
                Object obj2 = ((a) obj).f10665a.get((String) next.getKey());
                if (!(obj2 instanceof Object)) {
                    obj2 = null;
                }
                if (!b10.e(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
