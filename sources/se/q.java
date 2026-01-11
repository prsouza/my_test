package se;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import nd.m;
import oe.e;
import xd.l;
import yd.h;

@e(with = r.class)
public final class q extends e implements Map<String, e>, zd.a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, e> f11126a;

    public static final class a extends h implements l<Map.Entry<? extends String, ? extends e>, CharSequence> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f11127b = new a();

        public a() {
            super(1);
        }

        public final Object k(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            e6.e.D(entry, "<name for destructuring parameter 0>");
            return '\"' + ((String) entry.getKey()) + "\":" + ((e) entry.getValue());
        }
    }

    public q(Map<String, ? extends e> map) {
        e6.e.D(map, "content");
        this.f11126a = map;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        e6.e.D(str, "key");
        return this.f11126a.containsKey(str);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        e6.e.D(eVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return this.f11126a.containsValue(eVar);
    }

    public final Set<Map.Entry<String, e>> entrySet() {
        return this.f11126a.entrySet();
    }

    public final boolean equals(Object obj) {
        return e6.e.r(this.f11126a, obj);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        e6.e.D(str, "key");
        return this.f11126a.get(str);
    }

    public final int hashCode() {
        return this.f11126a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f11126a.isEmpty();
    }

    public final Set<String> keySet() {
        return this.f11126a.keySet();
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map<? extends String, ? extends e> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(BiFunction<? super String, ? super e, ? extends e> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f11126a.size();
    }

    public final String toString() {
        return m.b1(this.f11126a.entrySet(), ",", "{", "}", a.f11127b, 24);
    }

    public final Collection<e> values() {
        return this.f11126a.values();
    }
}
