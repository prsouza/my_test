package v6;

import e6.e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.slf4j.helpers.MessageFormatter;
import v6.b;
import v6.h;
import y.c;

public abstract class d<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient e<Map.Entry<K, V>> f12300a;

    /* renamed from: b  reason: collision with root package name */
    public transient e<K> f12301b;

    /* renamed from: c  reason: collision with root package name */
    public transient b<V> f12302c;

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f12303a = new Object[14];

        /* renamed from: b  reason: collision with root package name */
        public int f12304b = 0;

        public final a<K, V> a(K k10, V v10) {
            int i = (this.f12304b + 1) * 2;
            Object[] objArr = this.f12303a;
            if (i > objArr.length) {
                this.f12303a = Arrays.copyOf(objArr, b.a.a(objArr.length, i));
            }
            c.q(k10, v10);
            Object[] objArr2 = this.f12303a;
            int i10 = this.f12304b;
            int i11 = i10 * 2;
            objArr2[i11] = k10;
            objArr2[i11 + 1] = v10;
            this.f12304b = i10 + 1;
            return this;
        }
    }

    /* renamed from: a */
    public final e<Map.Entry<K, V>> entrySet() {
        e<Map.Entry<K, V>> eVar = this.f12300a;
        if (eVar != null) {
            return eVar;
        }
        h hVar = (h) this;
        h.a aVar = new h.a(hVar, hVar.f12314t, hVar.f12315u);
        this.f12300a = aVar;
        return aVar;
    }

    /* renamed from: c */
    public final b<V> values() {
        b<V> bVar = this.f12302c;
        if (bVar != null) {
            return bVar;
        }
        h hVar = (h) this;
        h.c cVar = new h.c(hVar.f12314t, 1, hVar.f12315u);
        this.f12302c = cVar;
        return cVar;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public final int hashCode() {
        return e.P(entrySet());
    }

    public final boolean isEmpty() {
        return ((h) this).f12315u == 0;
    }

    public final Set keySet() {
        e<K> eVar = this.f12301b;
        if (eVar != null) {
            return eVar;
        }
        h hVar = (h) this;
        h.b bVar = new h.b(hVar, new h.c(hVar.f12314t, 0, hVar.f12315u));
        this.f12301b = bVar;
        return bVar;
    }

    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = ((h) this).size();
        c.r(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb2.append(MessageFormatter.DELIM_START);
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append(MessageFormatter.DELIM_STOP);
        return sb2.toString();
    }
}
