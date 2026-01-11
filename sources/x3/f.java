package x3;

import g3.k;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?>> f12775a = new ArrayList();

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f12776a;

        /* renamed from: b  reason: collision with root package name */
        public final k<T> f12777b;

        public a(Class<T> cls, k<T> kVar) {
            this.f12776a = cls;
            this.f12777b = kVar;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<x3.f$a<?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<x3.f$a<?>>, java.util.ArrayList] */
    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f12775a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.f12775a.get(i);
            if (aVar.f12776a.isAssignableFrom(cls)) {
                return aVar.f12777b;
            }
        }
        return null;
    }
}
