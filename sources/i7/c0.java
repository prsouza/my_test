package i7;

import java.util.Iterator;
import java.util.Map;

public final class c0 extends d0 {

    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Map.Entry<K, c0> f6239a;

        public b(Map.Entry entry, a aVar) {
            this.f6239a = entry;
        }

        public final K getKey() {
            return this.f6239a.getKey();
        }

        public final Object getValue() {
            c0 value = this.f6239a.getValue();
            if (value == null) {
                return null;
            }
            return value.a((q0) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof q0) {
                c0 value = this.f6239a.getValue();
                q0 q0Var = value.f6246a;
                value.f6247b = null;
                value.f6246a = (q0) obj;
                return q0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f6240a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f6240a = it;
        }

        public final boolean hasNext() {
            return this.f6240a.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f6240a.next();
            return next.getValue() instanceof c0 ? new b(next, (a) null) : next;
        }

        public final void remove() {
            this.f6240a.remove();
        }
    }

    public final boolean equals(Object obj) {
        return a((q0) null).equals(obj);
    }

    public final int hashCode() {
        return a((q0) null).hashCode();
    }

    public final String toString() {
        return a((q0) null).toString();
    }
}
