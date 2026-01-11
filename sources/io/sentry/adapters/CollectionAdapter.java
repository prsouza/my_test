package io.sentry.adapters;

import i2.m;
import i2.p;
import i2.r;
import i2.v;
import i2.w;
import java.lang.reflect.Type;
import java.util.Collection;
import p9.m;

public final class CollectionAdapter implements w<Collection<?>> {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public p serialize(Collection<?> collection, Type type, v vVar) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        m mVar = new m();
        for (Object a10 : collection) {
            Object a11 = ((m.a) vVar).a(a10);
            if (a11 == null) {
                a11 = r.f6004a;
            }
            mVar.f6003a.add(a11);
        }
        return mVar;
    }
}
