package rc;

import ca.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nd.g;
import nd.l;
import nd.r;
import nd.s;
import nd.t;
import qc.d;

public class c extends qc.a<a<? extends Object>, a<? extends Object>> {

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, a<d>> f10659b;

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f10660a;

        /* renamed from: b  reason: collision with root package name */
        public final T f10661b;

        public a(String str, T t10) {
            e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f10660a = str;
            this.f10661b = t10;
        }
    }

    public c(String str, Map<Integer, a<d>> map) {
        super(str);
        this.f10659b = map;
    }

    public final boolean d() {
        Collection<a<d>> values = this.f10659b.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (a aVar : values) {
                if (!((d) aVar.f10661b).a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(Object obj) {
        T t10;
        if (!(obj instanceof a)) {
            return false;
        }
        Iterator<T> it = this.f10659b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (e.r(((a) t10).f10660a, ((a) obj).f10660a)) {
                break;
            }
        }
        a aVar = (a) t10;
        if (aVar != null) {
            return ((d) aVar.f10661b).b().e(((a) obj).f10661b);
        }
        return false;
    }

    /* renamed from: f */
    public a<Object> a(b bVar, kc.a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        byte b10 = bVar.b() & 255;
        a aVar2 = this.f10659b.get(Integer.valueOf(b10));
        if (aVar2 != null) {
            return new a<>(aVar2.f10660a, ((d) aVar2.f10661b).b().a(bVar, aVar));
        }
        g(b10);
        throw null;
    }

    public final Void g(int i) {
        StringBuilder d10 = a8.a.d("No index ", i, " found in ");
        d10.append(this.f10659b.keySet());
        throw new sc.a(d10.toString());
    }

    /* renamed from: h */
    public void b(ca.c cVar, kc.a aVar, a<? extends Object> aVar2) {
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(aVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Map.Entry<Integer, a<d>> i = i(aVar2.f10660a);
        qc.a<?, ?> b10 = ((d) i.getValue().f10661b).b();
        cVar.a(i.getKey().intValue());
        b10.c(cVar, aVar, aVar2.f10661b);
    }

    public final Map.Entry<Integer, a<d>> i(String str) {
        T t10;
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Iterator<T> it = this.f10659b.entrySet().iterator();
        do {
            t10 = null;
            if (!it.hasNext()) {
                break;
            }
            t10 = it.next();
        } while (!e.r(((a) ((Map.Entry) t10).getValue()).f10660a, str));
        Map.Entry<Integer, a<d>> entry = (Map.Entry) t10;
        if (entry != null) {
            return entry;
        }
        StringBuilder d10 = androidx.activity.result.d.d("No ", str, " in ");
        Map<Integer, a<d>> map = this.f10659b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Integer, a<d>> value : map.entrySet()) {
            arrayList.add(((a) value.getValue()).f10660a);
        }
        d10.append(arrayList);
        throw new sc.a(d10.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, List<a<d>> list) {
        super(str);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        s sVar = new s(new l(list));
        int P = aa.b.P(g.S0(sVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap(P < 16 ? 16 : P);
        Iterator it = sVar.iterator();
        while (true) {
            t tVar = (t) it;
            if (tVar.hasNext()) {
                r rVar = (r) tVar.next();
                linkedHashMap.put(Integer.valueOf(rVar.f8969a), (a) rVar.f8970b);
            } else {
                this.f10659b = linkedHashMap;
                return;
            }
        }
    }
}
