package tc;

import bd.c;
import bd.f;
import ca.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import ed.i;
import io.sentry.protocol.SentryRuntime;
import java.util.ArrayList;
import java.util.List;
import l6.b1;
import md.g;
import md.j;

public final class k extends qc.a<a, a> {

    /* renamed from: b  reason: collision with root package name */
    public static final i<j, j> f11555b = new i<>();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f11556c = true;

    /* renamed from: d  reason: collision with root package name */
    public static final k f11557d = new k();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final f f11558a;

        /* renamed from: b  reason: collision with root package name */
        public final c f11559b;

        /* renamed from: c  reason: collision with root package name */
        public final List<Object> f11560c;

        public a(f fVar, c cVar, List<? extends Object> list) {
            this.f11558a = fVar;
            this.f11559b = cVar;
            this.f11560c = list;
        }
    }

    public k() {
        super("GenericEvent");
    }

    public final Object a(b bVar, kc.a aVar) {
        Object obj;
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        md.f<j, j> r22 = f11555b.g(bVar);
        Integer valueOf = Integer.valueOf(((j) r22.f8541a).f8550a & 255);
        Integer valueOf2 = Integer.valueOf(((j) r22.f8542b).f8550a & 255);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        f Q = y.c.Q(aVar.f7498b, intValue);
        if (Q != null) {
            try {
                obj = (c) y.c.d0(Q.f2982d, intValue2);
            } catch (Throwable th2) {
                obj = b1.k(th2);
            }
            if (obj instanceof g.a) {
                obj = null;
            }
            c cVar = (c) obj;
            if (cVar != null) {
                List<qc.a<?, ?>> list = cVar.f2971c;
                ArrayList arrayList = new ArrayList(nd.g.S0(list));
                for (qc.a aVar2 : list) {
                    jc.b.j(aVar2, Q, cVar);
                    arrayList.add(aVar2.a(bVar, aVar));
                }
                return new a(Q, cVar, arrayList);
            }
            f(intValue, intValue2);
            throw null;
        }
        f(intValue, intValue2);
        throw null;
    }

    public final void b(ca.c cVar, kc.a aVar, Object obj) {
        a aVar2 = (a) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(aVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        md.f<Integer, Integer> fVar = aVar2.f11559b.f2970b;
        f11555b.b(cVar, new md.f(new j((byte) ((Number) fVar.f8541a).intValue()), new j((byte) ((Number) fVar.f8542b).intValue())));
        int i = 0;
        for (T next : aVar2.f11559b.f2971c) {
            int i10 = i + 1;
            if (i >= 0) {
                qc.a aVar3 = (qc.a) next;
                jc.b.j(aVar3, aVar2.f11558a, aVar2.f11559b);
                aVar3.c(cVar, aVar, aVar2.f11560c.get(i));
                i = i10;
            } else {
                a.b.N0();
                throw null;
            }
        }
    }

    public final boolean d() {
        return f11556c;
    }

    public final boolean e(Object obj) {
        return obj instanceof a;
    }

    public final Void f(int i, int i10) {
        throw new sc.a("No event for (" + i + ", " + i10 + ") index found");
    }
}
