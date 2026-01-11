package io.sentry.adapters;

import i2.p;
import i2.s;
import i2.v;
import i2.w;
import java.lang.reflect.Type;
import java.util.Map;
import p9.m;

public final class MapAdapter implements w<Map<String, ?>> {
    public p serialize(Map<String, ?> map, Type type, v vVar) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        s sVar = new s();
        for (Map.Entry next : map.entrySet()) {
            sVar.g((String) next.getKey(), ((m.a) vVar).a(next.getValue()));
        }
        return sVar;
    }
}
