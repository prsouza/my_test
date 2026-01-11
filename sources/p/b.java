package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f9467a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f9468b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f9469c = new WeakHashMap<>();

    /* renamed from: s  reason: collision with root package name */
    public int f9470s = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f9474s;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f9473c;
        }
    }

    /* renamed from: p.b$b  reason: collision with other inner class name */
    public static class C0184b<K, V> extends e<K, V> {
        public C0184b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f9473c;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f9474s;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f9471a;

        /* renamed from: b  reason: collision with root package name */
        public final V f9472b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f9473c;

        /* renamed from: s  reason: collision with root package name */
        public c<K, V> f9474s;

        public c(K k10, V v10) {
            this.f9471a = k10;
            this.f9472b = v10;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f9471a.equals(cVar.f9471a) || !this.f9472b.equals(cVar.f9472b)) {
                return false;
            }
            return true;
        }

        public final K getKey() {
            return this.f9471a;
        }

        public final V getValue() {
            return this.f9472b;
        }

        public final int hashCode() {
            return this.f9471a.hashCode() ^ this.f9472b.hashCode();
        }

        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f9471a + "=" + this.f9472b;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f9475a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9476b = true;

        public d() {
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f9475a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f9474s;
                this.f9475a = cVar3;
                this.f9476b = cVar3 == null;
            }
        }

        public final boolean hasNext() {
            if (!this.f9476b) {
                c<K, V> cVar = this.f9475a;
                if (cVar == null || cVar.f9473c == null) {
                    return false;
                }
                return true;
            } else if (b.this.f9467a != null) {
                return true;
            } else {
                return false;
            }
        }

        public final Object next() {
            if (this.f9476b) {
                this.f9476b = false;
                this.f9475a = b.this.f9467a;
            } else {
                c<K, V> cVar = this.f9475a;
                this.f9475a = cVar != null ? cVar.f9473c : null;
            }
            return this.f9475a;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f9478a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f9479b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f9478a = cVar2;
            this.f9479b = cVar;
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f9478a == cVar && cVar == this.f9479b) {
                this.f9479b = null;
                this.f9478a = null;
            }
            c<K, V> cVar3 = this.f9478a;
            if (cVar3 == cVar) {
                this.f9478a = b(cVar3);
            }
            c<K, V> cVar4 = this.f9479b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f9478a;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f9479b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public final boolean hasNext() {
            return this.f9479b != null;
        }

        public final Object next() {
            c<K, V> cVar = this.f9479b;
            c<K, V> cVar2 = this.f9478a;
            this.f9479b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> b(K k10) {
        c<K, V> cVar = this.f9467a;
        while (cVar != null && !cVar.f9471a.equals(k10)) {
            cVar = cVar.f9473c;
        }
        return cVar;
    }

    public final b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f9469c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public final c<K, V> e(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f9470s++;
        c<K, V> cVar2 = this.f9468b;
        if (cVar2 == null) {
            this.f9467a = cVar;
            this.f9468b = cVar;
            return cVar;
        }
        cVar2.f9473c = cVar;
        cVar.f9474s = cVar2;
        this.f9468b = cVar;
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((p.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            p.b r7 = (p.b) r7
            int r1 = r6.f9470s
            int r3 = r7.f9470s
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            p.b$e r3 = (p.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            p.b$e r4 = (p.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            p.b$e r7 = (p.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.equals(java.lang.Object):boolean");
    }

    public V g(K k10, V v10) {
        c b10 = b(k10);
        if (b10 != null) {
            return b10.f9472b;
        }
        e(k10, v10);
        return null;
    }

    public V h(K k10) {
        c b10 = b(k10);
        if (b10 == null) {
            return null;
        }
        this.f9470s--;
        if (!this.f9469c.isEmpty()) {
            for (f<K, V> a10 : this.f9469c.keySet()) {
                a10.a(b10);
            }
        }
        c<K, V> cVar = b10.f9474s;
        if (cVar != null) {
            cVar.f9473c = b10.f9473c;
        } else {
            this.f9467a = b10.f9473c;
        }
        c<K, V> cVar2 = b10.f9473c;
        if (cVar2 != null) {
            cVar2.f9474s = cVar;
        } else {
            this.f9468b = cVar;
        }
        b10.f9473c = null;
        b10.f9474s = null;
        return b10.f9472b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f9467a, this.f9468b);
        this.f9469c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                d10.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    d10.append(", ");
                }
            } else {
                d10.append("]");
                return d10.toString();
            }
        }
    }
}
