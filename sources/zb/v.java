package zb;

import java.util.Iterator;
import java.util.Map;

public final class v extends w {

    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Map.Entry<K, v> f14379a;

        public a(Map.Entry<K, v> entry) {
            this.f14379a = entry;
        }

        public final K getKey() {
            return this.f14379a.getKey();
        }

        public final Object getValue() {
            v value = this.f14379a.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        public final Object setValue(Object obj) {
            if (obj instanceof a0) {
                v value = this.f14379a.getValue();
                a0 a0Var = value.f14381a;
                value.f14382b = null;
                value.f14381a = (a0) obj;
                return a0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f14380a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f14380a = it;
        }

        public final boolean hasNext() {
            return this.f14380a.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f14380a.next();
            return next.getValue() instanceof v ? new a(next) : next;
        }

        public final void remove() {
            this.f14380a.remove();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final zb.a0 a() {
        /*
            r2 = this;
            zb.a0 r0 = r2.f14381a
            if (r0 == 0) goto L_0x0005
            goto L_0x001c
        L_0x0005:
            monitor-enter(r2)
            zb.a0 r0 = r2.f14381a     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x000b
            goto L_0x001b
        L_0x000b:
            r0 = 0
            r2.f14381a = r0     // Catch:{ u -> 0x0015 }
            zb.h$d r1 = zb.h.f14304b     // Catch:{ u -> 0x0015 }
            r2.f14382b = r1     // Catch:{ u -> 0x0015 }
            goto L_0x001b
        L_0x0013:
            r0 = move-exception
            goto L_0x001f
        L_0x0015:
            r2.f14381a = r0     // Catch:{ all -> 0x0013 }
            zb.h$d r0 = zb.h.f14304b     // Catch:{ all -> 0x0013 }
            r2.f14382b = r0     // Catch:{ all -> 0x0013 }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
        L_0x001c:
            zb.a0 r0 = r2.f14381a
            return r0
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.v.a():zb.a0");
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
