package u3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?, ?>> f11684a = new ArrayList();

    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f11685a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f11686b;

        /* renamed from: c  reason: collision with root package name */
        public final c<Z, R> f11687c;

        public a(Class<Z> cls, Class<R> cls2, c<Z, R> cVar) {
            this.f11685a = cls;
            this.f11686b = cls2;
            this.f11687c = cVar;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<u3.d$a<?, ?>>, java.util.ArrayList] */
    public final synchronized <Z, R> List<Class<R>> a(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f11684a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f11685a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f11686b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
