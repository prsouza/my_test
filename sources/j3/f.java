package j3;

import j3.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public final class f<K extends k, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f7015a = new a<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final Map<K, a<K, V>> f7016b = new HashMap();

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f7017a;

        /* renamed from: b  reason: collision with root package name */
        public List<V> f7018b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f7019c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f7020d;

        public a() {
            this((Object) null);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<V>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<V>, java.util.ArrayList] */
        public final V a() {
            ? r02 = this.f7018b;
            int size = r02 != 0 ? r02.size() : 0;
            if (size > 0) {
                return this.f7018b.remove(size - 1);
            }
            return null;
        }

        public a(K k10) {
            this.f7020d = this;
            this.f7019c = this;
            this.f7017a = k10;
        }
    }

    public static <K, V> void c(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f7020d;
        aVar2.f7019c = aVar.f7019c;
        aVar.f7019c.f7020d = aVar2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<K, j3.f$a<K, V>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<K, j3.f$a<K, V>>, java.util.HashMap] */
    public final V a(K k10) {
        a<K, V> aVar = (a) this.f7016b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f7016b.put(k10, aVar);
        } else {
            k10.a();
        }
        c(aVar);
        a<K, V> aVar2 = this.f7015a;
        aVar.f7020d = aVar2;
        a<K, V> aVar3 = aVar2.f7019c;
        aVar.f7019c = aVar3;
        aVar3.f7020d = aVar;
        aVar.f7020d.f7019c = aVar;
        return aVar.a();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<K, j3.f$a<K, V>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.List<V>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<K, j3.f$a<K, V>>, java.util.HashMap] */
    public final void b(K k10, V v10) {
        a<K, V> aVar = (a) this.f7016b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            a<K, V> aVar2 = this.f7015a;
            aVar.f7020d = aVar2.f7020d;
            aVar.f7019c = aVar2;
            aVar2.f7020d = aVar;
            aVar.f7020d.f7019c = aVar;
            this.f7016b.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f7018b == null) {
            aVar.f7018b = new ArrayList();
        }
        aVar.f7018b.add(v10);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.Map<K, j3.f$a<K, V>>, java.util.HashMap] */
    public final V d() {
        for (a<K, V> aVar = this.f7015a.f7020d; !aVar.equals(this.f7015a); aVar = aVar.f7020d) {
            V a10 = aVar.a();
            if (a10 != null) {
                return a10;
            }
            c(aVar);
            this.f7016b.remove(aVar.f7017a);
            aVar.f7017a.a();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List<V>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a<K, V> aVar = this.f7015a.f7019c; !aVar.equals(this.f7015a); aVar = aVar.f7019c) {
            z = true;
            sb2.append(MessageFormatter.DELIM_START);
            sb2.append(aVar.f7017a);
            sb2.append(':');
            ? r42 = aVar.f7018b;
            sb2.append(r42 != 0 ? r42.size() : 0);
            sb2.append("}, ");
        }
        if (z) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
