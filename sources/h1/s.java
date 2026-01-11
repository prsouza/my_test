package h1;

import e6.e;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import l6.d1;
import l6.f1;
import l6.g1;

public final class s implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5761a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5762b;

    public /* synthetic */ s(BigInteger bigInteger, List list) {
        e.D(list, "signedExtensions");
        this.f5761a = bigInteger;
        this.f5762b = list;
    }

    public /* synthetic */ s(g1 g1Var, List list) {
        this.f5761a = g1Var;
        this.f5762b = list;
    }

    public final Object zza() {
        int i;
        g1 g1Var = (g1) this.f5761a;
        List list = (List) this.f5762b;
        Objects.requireNonNull(g1Var);
        HashMap hashMap = new HashMap();
        for (d1 d1Var : g1Var.f7868e.values()) {
            String str = d1Var.f7816c.f7801a;
            if (list.contains(str)) {
                d1 d1Var2 = (d1) hashMap.get(str);
                if (d1Var2 == null) {
                    i = -1;
                } else {
                    i = d1Var2.f7814a;
                }
                if (i < d1Var.f7814a) {
                    hashMap.put(str, d1Var);
                }
            }
        }
        return hashMap;
    }
}
