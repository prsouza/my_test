package tc;

import bd.d;
import bd.e;
import bd.f;
import ca.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.i;
import io.sentry.protocol.SentryRuntime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l6.b1;
import md.g;
import y.c;

public final class j extends qc.a<a, a> {

    /* renamed from: b  reason: collision with root package name */
    public static final i<md.j, md.j> f11550b = new i<>();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f11551c = true;

    /* renamed from: d  reason: collision with root package name */
    public static final j f11552d = new j();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final e f11553a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f11554b;

        public a(f fVar, e eVar, Map<String, ? extends Object> map) {
            this.f11553a = eVar;
            this.f11554b = map;
        }
    }

    public j() {
        super("GenericCall");
    }

    public final boolean d() {
        return f11551c;
    }

    public final boolean e(Object obj) {
        return obj instanceof a;
    }

    public final Void f(int i, int i10) {
        throw new sc.a("No call found for index (" + i + ", " + i10 + ')');
    }

    /* renamed from: g */
    public final a a(b bVar, kc.a aVar) {
        Object obj;
        e6.e.D(bVar, "scaleCodecReader");
        e6.e.D(aVar, SentryRuntime.TYPE);
        md.f<md.j, md.j> r22 = f11550b.g(bVar);
        Integer valueOf = Integer.valueOf(((md.j) r22.f8541a).f8550a & 255);
        Integer valueOf2 = Integer.valueOf(((md.j) r22.f8542b).f8550a & 255);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        f Q = c.Q(aVar.f7498b, intValue);
        if (Q != null) {
            try {
                obj = (e) c.d0(Q.f2981c, intValue2);
            } catch (Throwable th2) {
                obj = b1.k(th2);
            }
            if (obj instanceof g.a) {
                obj = null;
            }
            e eVar = (e) obj;
            if (eVar != null) {
                List<d> list = eVar.f2976b;
                int P = aa.b.P(nd.g.S0(list));
                if (P < 16) {
                    P = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(P);
                for (d dVar : list) {
                    linkedHashMap.put(dVar.f2973a, f11552d.i(dVar).a(bVar, aVar));
                }
                return new a(Q, eVar, linkedHashMap);
            }
            f(intValue, intValue2);
            throw null;
        }
        f(intValue, intValue2);
        throw null;
    }

    /* renamed from: h */
    public final void b(ca.c cVar, kc.a aVar, a aVar2) {
        e6.e.D(cVar, "scaleCodecWriter");
        e6.e.D(aVar, SentryRuntime.TYPE);
        e6.e.D(aVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        md.f<Integer, Integer> fVar = aVar2.f11553a.f2978d;
        f11550b.b(cVar, new md.f(new md.j((byte) ((Number) fVar.f8541a).intValue()), new md.j((byte) ((Number) fVar.f8542b).intValue())));
        for (d dVar : aVar2.f11553a.f2976b) {
            f11552d.i(dVar).c(cVar, aVar, aVar2.f11554b.get(dVar.f2973a));
        }
    }

    public final qc.a<?, ?> i(d dVar) {
        qc.a<?, ?> aVar = dVar.f2974b;
        if (aVar != null) {
            return aVar;
        }
        throw new sc.a(android.support.v4.media.a.e(a.a.d("Argument "), dVar.f2973a, " is not resolved"));
    }
}
