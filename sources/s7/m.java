package s7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class m {

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f10961a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<b> f10962b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Set<b> f10963c = new HashSet();

        public b(b<?> bVar) {
            this.f10961a = bVar;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<s7.m$b>] */
        public final boolean a() {
            return this.f10963c.isEmpty();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f10964a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10965b;

        public c(Class cls, boolean z, a aVar) {
            this.f10964a = cls;
            this.f10965b = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f10964a.equals(this.f10964a) || cVar.f10965b != this.f10965b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((this.f10964a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f10965b).hashCode();
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.HashSet, java.util.Set<s7.m$b>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.HashSet, java.util.Set<s7.m$b>] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.HashSet, java.util.Set<s7.m$b>] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.util.HashSet, java.util.Set<s7.m$b>] */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.util.HashSet, java.util.Set<s7.m$b>] */
    public static void a(List<b<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<b<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                b next = it.next();
                b bVar = new b(next);
                Iterator<Class<? super T>> it2 = next.f10935a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next2 = it2.next();
                        boolean z = !next.b();
                        c cVar = new c(next2, z, (a) null);
                        if (!hashMap.containsKey(cVar)) {
                            hashMap.put(cVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(cVar);
                        if (set2.isEmpty() || z) {
                            set2.add(bVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<b> it3 : hashMap.values()) {
                    for (b bVar2 : it3) {
                        for (n next3 : bVar2.f10961a.f10936b) {
                            if ((next3.f10968c == 0) && (set = (Set) hashMap.get(new c(next3.f10966a, next3.a(), (a) null))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.f10962b.add(bVar3);
                                    bVar3.f10963c.add(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    b bVar4 = (b) it4.next();
                    if (bVar4.a()) {
                        hashSet2.add(bVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b bVar5 = (b) hashSet2.iterator().next();
                    hashSet2.remove(bVar5);
                    i++;
                    Iterator it5 = bVar5.f10962b.iterator();
                    while (it5.hasNext()) {
                        b bVar6 = (b) it5.next();
                        bVar6.f10963c.remove(bVar5);
                        if (bVar6.a()) {
                            hashSet2.add(bVar6);
                        }
                    }
                }
                if (i != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        b bVar7 = (b) it6.next();
                        if (!bVar7.a() && !bVar7.f10962b.isEmpty()) {
                            arrayList.add(bVar7.f10961a);
                        }
                    }
                    throw new o(arrayList);
                }
                return;
            }
        }
    }
}
