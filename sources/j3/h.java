package j3;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import org.slf4j.helpers.MessageFormatter;
import u2.n;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f<a, Object> f7021a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f7022b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f7023c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, a<?>> f7024d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f7025e;

    /* renamed from: f  reason: collision with root package name */
    public int f7026f;

    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final b f7027a;

        /* renamed from: b  reason: collision with root package name */
        public int f7028b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f7029c;

        public a(b bVar) {
            this.f7027a = bVar;
        }

        public final void a() {
            this.f7027a.f(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7028b == aVar.f7028b && this.f7029c == aVar.f7029c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i = this.f7028b * 31;
            Class<?> cls = this.f7029c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("Key{size=");
            d10.append(this.f7028b);
            d10.append("array=");
            d10.append(this.f7029c);
            d10.append(MessageFormatter.DELIM_STOP);
            return d10.toString();
        }
    }

    public static final class b extends n {
        public b() {
            super(1);
        }

        public final k d() {
            return new a(this);
        }

        public final a g(int i, Class<?> cls) {
            a aVar = (a) e();
            aVar.f7028b = i;
            aVar.f7029c = cls;
            return aVar;
        }
    }

    public h(int i) {
        this.f7025e = i;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto L_0x0011
            monitor-enter(r1)     // Catch:{ all -> 0x000f }
            r2 = 0
            r1.g(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            goto L_0x0020
        L_0x000c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            throw r2     // Catch:{ all -> 0x000f }
        L_0x000f:
            r2 = move-exception
            goto L_0x0022
        L_0x0011:
            r0 = 20
            if (r2 >= r0) goto L_0x0019
            r0 = 15
            if (r2 != r0) goto L_0x0020
        L_0x0019:
            int r2 = r1.f7025e     // Catch:{ all -> 0x000f }
            int r2 = r2 / 2
            r1.g(r2)     // Catch:{ all -> 0x000f }
        L_0x0020:
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.h.a(int):void");
    }

    public final synchronized void b() {
        g(0);
    }

    public final synchronized <T> void c(T t10) {
        Class<?> cls = t10.getClass();
        a<?> h10 = h(cls);
        int b10 = h10.b(t10);
        int c10 = h10.c() * b10;
        int i = 1;
        if (c10 <= this.f7025e / 2) {
            a g = this.f7022b.g(b10, cls);
            this.f7021a.b(g, t10);
            NavigableMap<Integer, Integer> j10 = j(cls);
            Integer num = j10.get(Integer.valueOf(g.f7028b));
            Integer valueOf = Integer.valueOf(g.f7028b);
            if (num != null) {
                i = 1 + num.intValue();
            }
            j10.put(valueOf, Integer.valueOf(i));
            this.f7026f += c10;
            g(this.f7025e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T> T d(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.j(r7)     // Catch:{ all -> 0x0046 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x0046 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0046 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f7026f     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f7025e     // Catch:{ all -> 0x0046 }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x0046 }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x003a
            j3.h$b r6 = r5.f7022b     // Catch:{ all -> 0x0046 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0046 }
            j3.h$a r6 = r6.g(r0, r7)     // Catch:{ all -> 0x0046 }
            goto L_0x0040
        L_0x003a:
            j3.h$b r0 = r5.f7022b     // Catch:{ all -> 0x0046 }
            j3.h$a r6 = r0.g(r6, r7)     // Catch:{ all -> 0x0046 }
        L_0x0040:
            java.lang.Object r6 = r5.i(r6, r7)     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            return r6
        L_0x0046:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.h.d(int, java.lang.Class):java.lang.Object");
    }

    public final synchronized <T> Object e() {
        Object i;
        Class cls = byte[].class;
        synchronized (this) {
            i = i(this.f7022b.g(8, cls), cls);
        }
        return i;
    }

    public final void f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> j10 = j(cls);
        Integer num = j10.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            j10.remove(Integer.valueOf(i));
        } else {
            j10.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void g(int i) {
        while (this.f7026f > i) {
            Object d10 = this.f7021a.d();
            aa.b.u(d10);
            a<?> h10 = h(d10.getClass());
            this.f7026f -= h10.c() * h10.b(d10);
            f(h10.b(d10), d10.getClass());
            if (Log.isLoggable(h10.a(), 2)) {
                String a10 = h10.a();
                StringBuilder d11 = a.a.d("evicted: ");
                d11.append(h10.b(d10));
                Log.v(a10, d11.toString());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, j3.a<?>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.Class<?>, j3.a<?>>, java.util.HashMap] */
    public final <T> a<T> h(Class<T> cls) {
        a<T> aVar = (a) this.f7024d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new g();
            } else if (cls.equals(byte[].class)) {
                aVar = new e();
            } else {
                StringBuilder d10 = a.a.d("No array pool found for: ");
                d10.append(cls.getSimpleName());
                throw new IllegalArgumentException(d10.toString());
            }
            this.f7024d.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T i(a aVar, Class<T> cls) {
        a<T> h10 = h(cls);
        T a10 = this.f7021a.a(aVar);
        if (a10 != null) {
            this.f7026f -= h10.c() * h10.b(a10);
            f(h10.b(a10), cls);
        }
        if (a10 != null) {
            return a10;
        }
        if (Log.isLoggable(h10.a(), 2)) {
            String a11 = h10.a();
            StringBuilder d10 = a.a.d("Allocated ");
            d10.append(aVar.f7028b);
            d10.append(" bytes");
            Log.v(a11, d10.toString());
        }
        return h10.newArray(aVar.f7028b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>, java.util.HashMap] */
    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f7023c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f7023c.put(cls, treeMap);
        return treeMap;
    }
}
