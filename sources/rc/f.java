package rc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kc.a;
import qc.d;

public final class f extends j<Set<? extends String>> {

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap<String, BigInteger> f10663c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, d dVar, LinkedHashMap<String, BigInteger> linkedHashMap) {
        super(str, dVar);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f10663c = linkedHashMap;
    }

    public final Object a(b bVar, a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        qc.a<?, ?> b10 = this.f10667b.b();
        if (b10 instanceof vc.e) {
            BigInteger bigInteger = (BigInteger) ((vc.e) b10).a(bVar, aVar);
            LinkedHashMap<String, BigInteger> linkedHashMap = this.f10663c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Map.Entry next : linkedHashMap.entrySet()) {
                String str = (String) next.getKey();
                BigInteger and = bigInteger.and((BigInteger) next.getValue());
                e.C(and, "value.and(mask)");
                boolean z = true;
                if (and.signum() != 1) {
                    z = false;
                }
                if (!z) {
                    str = null;
                }
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
            return linkedHashSet;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void b(c cVar, a aVar, Object obj) {
        Set set = (Set) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(set, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.a<?, ?> b10 = this.f10667b.b();
        if (b10 instanceof vc.e) {
            Set<Map.Entry<String, BigInteger>> entrySet = this.f10663c.entrySet();
            e.C(entrySet, "valueList.entries");
            BigInteger bigInteger = BigInteger.ZERO;
            for (Map.Entry entry : entrySet) {
                BigInteger bigInteger2 = (BigInteger) entry.getValue();
                if (set.contains((String) entry.getKey())) {
                    e.C(bigInteger, "acc");
                    e.C(bigInteger2, "mask");
                    bigInteger = bigInteger.add(bigInteger2);
                    e.C(bigInteger, "this.add(other)");
                }
            }
            e.C(bigInteger, "folded");
            ((vc.e) b10).b(cVar, aVar, bigInteger);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean e(Object obj) {
        boolean z;
        if (!(obj instanceof Set)) {
            return false;
        }
        Iterable iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!this.f10663c.containsKey(it.next())) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }
}
