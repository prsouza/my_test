package x3;

import g3.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f12770a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f12771b = new HashMap();

    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f12772a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f12773b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, R> f12774c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f12772a = cls;
            this.f12773b = cls2;
            this.f12774c = jVar;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.util.List<x3.e$a<?, ?>>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.util.List<x3.e$a<?, ?>>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f12770a.contains(str)) {
            this.f12770a.add(str);
        }
        list = (List) this.f12771b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f12771b.put(str, list);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.util.List<x3.e$a<?, ?>>>, java.util.HashMap] */
    public final synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f12770a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f12771b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.f12772a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f12773b)) && !arrayList.contains(aVar.f12773b)) {
                        arrayList.add(aVar.f12773b);
                    }
                }
            }
        }
        return arrayList;
    }
}
