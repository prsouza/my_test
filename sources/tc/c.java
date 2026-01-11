package tc;

import a.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import io.sentry.protocol.SentryRuntime;
import java.util.List;
import java.util.Map;
import kc.a;
import qc.d;
import rc.c;

public final class c extends rc.c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Map<String, d> map) {
        super("Data", (List<c.a<d>>) b.o0(new c.a("None", aa.b.J(map, "Null")), new c.a("Raw", aa.b.J(map, "Bytes")), new c.a("BlakeTwo256", aa.b.J(map, "H256")), new c.a("Sha256", aa.b.J(map, "H256")), new c.a("Keccak256", aa.b.J(map, "H256")), new c.a("ShaThree256", aa.b.J(map, "H256"))));
        e.D(map, "preset");
    }

    /* renamed from: f */
    public final c.a<Object> a(ca.b bVar, a aVar) {
        c.a<Object> aVar2;
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        byte b10 = bVar.b();
        if (b10 == 0) {
            return new c.a<>("None", null);
        }
        if (1 <= b10 && 33 >= b10) {
            aVar2 = new c.a<>("Raw", bVar.c(b10 - 1));
        } else if (34 > b10 || 37 < b10) {
            throw new sc.a(a8.a.b("Cannot process ", b10, " for Data type"));
        } else {
            int i = b10 - 32;
            c.a aVar3 = this.f10659b.get(Integer.valueOf(i));
            if (aVar3 != null) {
                aVar2 = new c.a<>(aVar3.f10660a, ((d) aVar3.f10661b).b().a(bVar, aVar));
            } else {
                g(i);
                throw null;
            }
        }
        return aVar2;
    }

    /* renamed from: h */
    public final void b(ca.c cVar, a aVar, c.a<? extends Object> aVar2) {
        int length;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(aVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        String str = aVar2.f10660a;
        int hashCode = str.hashCode();
        boolean z = false;
        if (hashCode != 81928) {
            if (hashCode == 2433880 && str.equals("None")) {
                cVar.a(0);
                return;
            }
        } else if (str.equals("Raw")) {
            T t10 = aVar2.f10661b;
            if ((t10 instanceof byte[]) && (length = ((byte[]) t10).length) >= 0 && 32 >= length) {
                z = true;
            }
            if (z) {
                byte[] bArr = (byte[]) t10;
                cVar.a((byte) (bArr.length + 1));
                cVar.c(bArr, bArr.length);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Map.Entry<Integer, c.a<d>> i = i(aVar2.f10660a);
        qc.a<?, ?> b10 = ((d) i.getValue().f10661b).b();
        cVar.a(i.getKey().intValue() + 32);
        b10.c(cVar, aVar, aVar2.f10661b);
    }
}
