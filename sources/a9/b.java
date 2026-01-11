package a9;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f172a;

    /* renamed from: b  reason: collision with root package name */
    public final c f173b;

    public b(Set<d> set, c cVar) {
        this.f172a = b(set);
        this.f173b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f173b;
        synchronized (((Set) cVar.f176b)) {
            unmodifiableSet = Collections.unmodifiableSet((Set) cVar.f176b);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f172a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f172a);
        sb2.append(' ');
        c cVar2 = this.f173b;
        synchronized (((Set) cVar2.f176b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((Set) cVar2.f176b);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
