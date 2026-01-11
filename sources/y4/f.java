package y4;

import c5.b;
import cc.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import q4.d;
import z4.c;
import z4.f;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a<c5.a> f13488a = b.a.f3248a;

    public final Object get() {
        c5.a aVar = this.f13488a.get();
        HashMap hashMap = new HashMap();
        d dVar = d.DEFAULT;
        f.a.C0265a a10 = f.a.a();
        a10.b(30000);
        a10.c();
        hashMap.put(dVar, a10.a());
        d dVar2 = d.HIGHEST;
        f.a.C0265a a11 = f.a.a();
        a11.b(1000);
        a11.c();
        hashMap.put(dVar2, a11.a());
        d dVar3 = d.VERY_LOW;
        f.a.C0265a a12 = f.a.a();
        a12.b(86400000);
        a12.c();
        Set<f.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new f.b[]{f.b.NETWORK_UNMETERED, f.b.DEVICE_IDLE})));
        c.b bVar = (c.b) a12;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        bVar.f13801c = unmodifiableSet;
        hashMap.put(dVar3, bVar.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        if (hashMap.keySet().size() >= d.values().length) {
            new HashMap();
            return new z4.b(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
