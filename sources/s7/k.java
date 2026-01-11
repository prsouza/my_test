package s7;

import android.support.v4.media.b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m8.c;
import m8.d;
import r8.a;

public final class k extends b implements h8.a {
    public final AtomicReference<Boolean> A = new AtomicReference<>();

    /* renamed from: v  reason: collision with root package name */
    public final Map<b<?>, r8.b<?>> f10956v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    public final Map<Class<?>, r8.b<?>> f10957w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    public final Map<Class<?>, s<?>> f10958x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    public final List<r8.b<f>> f10959y;
    public final p z;

    /* JADX WARNING: type inference failed for: r8v4, types: [java.util.HashMap, java.util.Map<s7.b<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<s7.b<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r9v15, types: [java.util.HashMap, java.util.Map<s7.b<?>, r8.b<?>>] */
    public k(Executor executor, Iterable iterable, Collection collection, a aVar) {
        p pVar = new p(executor);
        this.z = pVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.c(pVar, p.class, d.class, c.class));
        arrayList.add(b.c(this, h8.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.f10959y = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    f fVar = (f) ((r8.b) it2.next()).get();
                    if (fVar != null) {
                        arrayList.addAll(fVar.getComponents());
                        it2.remove();
                    }
                } catch (q e10) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f10956v.isEmpty()) {
                m.a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f10956v.keySet());
                arrayList4.addAll(arrayList);
                m.a(arrayList4);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                this.f10956v.put(bVar2, new r(new i(this, bVar2)));
            }
            arrayList3.addAll(t2(arrayList));
            arrayList3.addAll(u2());
            s2();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.A.get();
        if (bool != null) {
            r2(this.f10956v, bool.booleanValue());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, r8.b<?>>] */
    public final synchronized <T> r8.b<T> d(Class<T> cls) {
        return (r8.b) this.f10957w.get(cls);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, s7.s<?>>] */
    public final synchronized <T> r8.b<Set<T>> e(Class<T> cls) {
        s sVar = (s) this.f10958x.get(cls);
        if (sVar != null) {
            return sVar;
        }
        return j.f10955a;
    }

    public final <T> r8.a<T> f(Class<T> cls) {
        r8.b<T> d10 = d(cls);
        if (d10 == null) {
            return new w(h1.c.f5662t, v.f10980a);
        }
        if (d10 instanceof w) {
            return (w) d10;
        }
        return new w((a.C0207a) null, d10);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Queue<m8.a<?>>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<m8.b<java.lang.Object>, java.util.concurrent.Executor>>, java.util.HashMap] */
    public final void r2(Map<b<?>, r8.b<?>> map, boolean z10) {
        Queue<m8.a<?>> queue;
        Set<Map.Entry> emptySet;
        Iterator<Map.Entry<b<?>, r8.b<?>>> it = map.entrySet().iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            r8.b bVar = (r8.b) next.getValue();
            int i = ((b) next.getKey()).f10937c;
            if (!(i == 1)) {
                if (i != 2) {
                    z11 = false;
                }
                if (z11) {
                    if (!z10) {
                    }
                }
            }
            bVar.get();
        }
        p pVar = this.z;
        synchronized (pVar) {
            try {
                queue = pVar.f10971b;
                if (queue != null) {
                    pVar.f10971b = null;
                } else {
                    queue = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        if (queue != null) {
            for (m8.a next2 : queue) {
                Objects.requireNonNull(next2);
                synchronized (pVar) {
                    ? r32 = pVar.f10971b;
                    if (r32 != 0) {
                        r32.add(next2);
                    } else {
                        synchronized (pVar) {
                            Map map2 = (Map) pVar.f10970a.get((Object) null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new a1.b(entry, next2, 1));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<s7.b<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, s7.s<?>>] */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, s7.s<?>>] */
    public final void s2() {
        for (b bVar : this.f10956v.keySet()) {
            Iterator<n> it = bVar.f10936b.iterator();
            while (true) {
                if (it.hasNext()) {
                    n next = it.next();
                    if (next.a() && !this.f10958x.containsKey(next.f10966a)) {
                        this.f10958x.put(next.f10966a, new s(Collections.emptySet()));
                    } else if (this.f10957w.containsKey(next.f10966a)) {
                        continue;
                    } else {
                        if (next.f10967b == 1) {
                            throw new t(String.format("Unsatisfied dependency for component %s: %s", new Object[]{bVar, next.f10966a}));
                        } else if (!next.a()) {
                            this.f10957w.put(next.f10966a, new w(h1.c.f5662t, v.f10980a));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<s7.b<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, r8.b<?>>] */
    public final List<Runnable> t2(List<b<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (b next : list) {
            if (next.b()) {
                r8.b bVar = (r8.b) this.f10956v.get(next);
                for (Class next2 : next.f10935a) {
                    if (!this.f10957w.containsKey(next2)) {
                        this.f10957w.put(next2, bVar);
                    } else {
                        arrayList.add(new g((w) ((r8.b) this.f10957w.get(next2)), bVar, 0));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<s7.b<?>, r8.b<?>>] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, s7.s<?>>] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, s7.s<?>>] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, s7.s<?>>] */
    public final List<Runnable> u2() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f10956v.entrySet()) {
            b bVar = (b) entry.getKey();
            if (!bVar.b()) {
                r8.b bVar2 = (r8.b) entry.getValue();
                for (Class next : bVar.f10935a) {
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, new HashSet());
                    }
                    ((Set) hashMap.get(next)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f10958x.containsKey(entry2.getKey())) {
                this.f10958x.put((Class) entry2.getKey(), new s((Set) ((Collection) entry2.getValue())));
            } else {
                s sVar = (s) this.f10958x.get(entry2.getKey());
                for (r8.b hVar : (Set) entry2.getValue()) {
                    arrayList.add(new h(sVar, hVar));
                }
            }
        }
        return arrayList;
    }
}
