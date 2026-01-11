package g9;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final Comparator<Comparable> f5285w = new a();

    /* renamed from: a  reason: collision with root package name */
    public Comparator<? super K> f5286a;

    /* renamed from: b  reason: collision with root package name */
    public e<K, V> f5287b;

    /* renamed from: c  reason: collision with root package name */
    public int f5288c;

    /* renamed from: s  reason: collision with root package name */
    public int f5289s;

    /* renamed from: t  reason: collision with root package name */
    public final e<K, V> f5290t;

    /* renamed from: u  reason: collision with root package name */
    public g<K, V>.b f5291u;

    /* renamed from: v  reason: collision with root package name */
    public g<K, V>.c f5292v;

    public class a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends g<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        public final void clear() {
            g.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.d((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public final boolean remove(Object obj) {
            e d10;
            if (!(obj instanceof Map.Entry) || (d10 = g.this.d((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.i(d10, true);
            return true;
        }

        public final int size() {
            return g.this.f5288c;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends g<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            public final K next() {
                return a().f5304u;
            }
        }

        public c() {
        }

        public final void clear() {
            g.this.clear();
        }

        public final boolean contains(Object obj) {
            return g.this.a(obj) != null;
        }

        public final Iterator<K> iterator() {
            return new a(this);
        }

        public final boolean remove(Object obj) {
            g gVar = g.this;
            e a10 = gVar.a(obj);
            if (a10 != null) {
                gVar.i(a10, true);
            }
            return a10 != null;
        }

        public final int size() {
            return g.this.f5288c;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f5295a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f5296b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f5297c;

        public d() {
            this.f5295a = g.this.f5290t.f5302s;
            this.f5297c = g.this.f5289s;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f5295a;
            g gVar = g.this;
            if (eVar == gVar.f5290t) {
                throw new NoSuchElementException();
            } else if (gVar.f5289s == this.f5297c) {
                this.f5295a = eVar.f5302s;
                this.f5296b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f5295a != g.this.f5290t;
        }

        public final void remove() {
            e<K, V> eVar = this.f5296b;
            if (eVar != null) {
                g.this.i(eVar, true);
                this.f5296b = null;
                this.f5297c = g.this.f5289s;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f5299a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f5300b;

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f5301c;

        /* renamed from: s  reason: collision with root package name */
        public e<K, V> f5302s;

        /* renamed from: t  reason: collision with root package name */
        public e<K, V> f5303t;

        /* renamed from: u  reason: collision with root package name */
        public final K f5304u;

        /* renamed from: v  reason: collision with root package name */
        public V f5305v;

        /* renamed from: w  reason: collision with root package name */
        public int f5306w;

        public e() {
            this.f5304u = null;
            this.f5303t = this;
            this.f5302s = this;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f5299a = eVar;
            this.f5304u = k10;
            this.f5306w = 1;
            this.f5302s = eVar2;
            this.f5303t = eVar3;
            eVar3.f5302s = this;
            eVar2.f5303t = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f5304u
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f5305v
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.g.e.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f5304u;
        }

        public final V getValue() {
            return this.f5305v;
        }

        public final int hashCode() {
            K k10 = this.f5304u;
            int i = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f5305v;
            if (v10 != null) {
                i = v10.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v10) {
            V v11 = this.f5305v;
            this.f5305v = v10;
            return v11;
        }

        public final String toString() {
            return this.f5304u + "=" + this.f5305v;
        }
    }

    static {
        Class<g> cls = g.class;
    }

    public g() {
        this(f5285w);
    }

    public g(Comparator<? super K> comparator) {
        this.f5288c = 0;
        this.f5289s = 0;
        this.f5290t = new e<>();
        this.f5286a = comparator;
    }

    public final e<K, V> a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return c(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final e<K, V> c(K k10, boolean z) {
        int i;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f5286a;
        e<K, V> eVar2 = this.f5287b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f5285w ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f5304u;
                i = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i < 0 ? eVar2.f5300b : eVar2.f5301c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f5290t;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f5303t);
            if (i < 0) {
                eVar2.f5300b = eVar;
            } else {
                eVar2.f5301c = eVar;
            }
            g(eVar2, true);
        } else if (comparator != f5285w || (k10 instanceof Comparable)) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f5303t);
            this.f5287b = eVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        this.f5288c++;
        this.f5289s++;
        return eVar;
    }

    public final void clear() {
        this.f5287b = null;
        this.f5288c = 0;
        this.f5289s++;
        e<K, V> eVar = this.f5290t;
        eVar.f5303t = eVar;
        eVar.f5302s = eVar;
    }

    public final boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g9.g.e<K, V> d(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            g9.g$e r0 = r4.a(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f5305v
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.g.d(java.util.Map$Entry):g9.g$e");
    }

    public final void e(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f5300b;
        e<K, V> eVar3 = eVar.f5301c;
        e<K, V> eVar4 = eVar3.f5300b;
        e<K, V> eVar5 = eVar3.f5301c;
        eVar.f5301c = eVar4;
        if (eVar4 != null) {
            eVar4.f5299a = eVar;
        }
        f(eVar, eVar3);
        eVar3.f5300b = eVar;
        eVar.f5299a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f5306w : 0, eVar4 != null ? eVar4.f5306w : 0) + 1;
        eVar.f5306w = max;
        if (eVar5 != null) {
            i = eVar5.f5306w;
        }
        eVar3.f5306w = Math.max(max, i) + 1;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.b bVar = this.f5291u;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.f5291u = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f5299a;
        eVar.f5299a = null;
        if (eVar2 != null) {
            eVar2.f5299a = eVar3;
        }
        if (eVar3 == null) {
            this.f5287b = eVar2;
        } else if (eVar3.f5300b == eVar) {
            eVar3.f5300b = eVar2;
        } else {
            eVar3.f5301c = eVar2;
        }
    }

    public final void g(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f5300b;
            e<K, V> eVar3 = eVar.f5301c;
            int i = 0;
            int i10 = eVar2 != null ? eVar2.f5306w : 0;
            int i11 = eVar3 != null ? eVar3.f5306w : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f5300b;
                e<K, V> eVar5 = eVar3.f5301c;
                int i13 = eVar5 != null ? eVar5.f5306w : 0;
                if (eVar4 != null) {
                    i = eVar4.f5306w;
                }
                int i14 = i - i13;
                if (i14 != -1 && (i14 != 0 || z)) {
                    h(eVar3);
                }
                e(eVar);
                if (z) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f5300b;
                e<K, V> eVar7 = eVar2.f5301c;
                int i15 = eVar7 != null ? eVar7.f5306w : 0;
                if (eVar6 != null) {
                    i = eVar6.f5306w;
                }
                int i16 = i - i15;
                if (i16 != 1 && (i16 != 0 || z)) {
                    e(eVar2);
                }
                h(eVar);
                if (z) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f5306w = i10 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f5306w = Math.max(i10, i11) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f5299a;
        }
    }

    public final V get(Object obj) {
        e a10 = a(obj);
        if (a10 != null) {
            return a10.f5305v;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f5300b;
        e<K, V> eVar3 = eVar.f5301c;
        e<K, V> eVar4 = eVar2.f5300b;
        e<K, V> eVar5 = eVar2.f5301c;
        eVar.f5300b = eVar5;
        if (eVar5 != null) {
            eVar5.f5299a = eVar;
        }
        f(eVar, eVar2);
        eVar2.f5301c = eVar;
        eVar.f5299a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f5306w : 0, eVar5 != null ? eVar5.f5306w : 0) + 1;
        eVar.f5306w = max;
        if (eVar4 != null) {
            i = eVar4.f5306w;
        }
        eVar2.f5306w = Math.max(max, i) + 1;
    }

    public final void i(e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            e<K, V> eVar2 = eVar.f5303t;
            eVar2.f5302s = eVar.f5302s;
            eVar.f5302s.f5303t = eVar2;
        }
        e<K, V> eVar3 = eVar.f5300b;
        e<K, V> eVar4 = eVar.f5301c;
        e<K, V> eVar5 = eVar.f5299a;
        int i10 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                f(eVar, eVar3);
                eVar.f5300b = null;
            } else if (eVar4 != null) {
                f(eVar, eVar4);
                eVar.f5301c = null;
            } else {
                f(eVar, (e<K, V>) null);
            }
            g(eVar5, false);
            this.f5288c--;
            this.f5289s++;
            return;
        }
        if (eVar3.f5306w > eVar4.f5306w) {
            while (true) {
                e<K, V> eVar6 = eVar3.f5301c;
                if (eVar6 == null) {
                    break;
                }
                eVar3 = eVar6;
            }
        } else {
            while (true) {
                e<K, V> eVar7 = eVar4.f5300b;
                if (eVar7 == null) {
                    break;
                }
                eVar4 = eVar7;
            }
            eVar3 = eVar4;
        }
        i(eVar3, false);
        e<K, V> eVar8 = eVar.f5300b;
        if (eVar8 != null) {
            i = eVar8.f5306w;
            eVar3.f5300b = eVar8;
            eVar8.f5299a = eVar3;
            eVar.f5300b = null;
        } else {
            i = 0;
        }
        e<K, V> eVar9 = eVar.f5301c;
        if (eVar9 != null) {
            i10 = eVar9.f5306w;
            eVar3.f5301c = eVar9;
            eVar9.f5299a = eVar3;
            eVar.f5301c = null;
        }
        eVar3.f5306w = Math.max(i, i10) + 1;
        f(eVar, eVar3);
    }

    public final Set<K> keySet() {
        g<K, V>.c cVar = this.f5292v;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.c cVar2 = new c();
        this.f5292v = cVar2;
        return cVar2;
    }

    public final V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e c10 = c(k10, true);
        V v11 = c10.f5305v;
        c10.f5305v = v10;
        return v11;
    }

    public final V remove(Object obj) {
        e a10 = a(obj);
        if (a10 != null) {
            i(a10, true);
        }
        if (a10 != null) {
            return a10.f5305v;
        }
        return null;
    }

    public final int size() {
        return this.f5288c;
    }
}
