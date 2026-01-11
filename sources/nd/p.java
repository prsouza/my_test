package nd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.slf4j.helpers.MessageFormatter;
import zd.a;

public final class p implements Map, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final p f8967a = new p();

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        e.D((Void) obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return q.f8968a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return q.f8968a;
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return MessageFormatter.DELIM_STR;
    }

    public final /* bridge */ Collection values() {
        return o.f8966a;
    }
}
