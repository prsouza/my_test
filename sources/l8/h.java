package l8;

import i8.b;
import i8.d;
import i8.f;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f8138a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f8139b;

    /* renamed from: c  reason: collision with root package name */
    public final d<Object> f8140c;

    public static final class a implements j8.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, d<?>> f8141a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<Class<?>, f<?>> f8142b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public d<Object> f8143c = g.f8137a;

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, i8.d<?>>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, i8.f<?>>, java.util.HashMap] */
        public final j8.a a(Class cls, d dVar) {
            this.f8141a.put(cls, dVar);
            this.f8142b.remove(cls);
            return this;
        }

        public final h b() {
            return new h(new HashMap(this.f8141a), new HashMap(this.f8142b), this.f8143c);
        }
    }

    public h(Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar) {
        this.f8138a = map;
        this.f8139b = map2;
        this.f8140c = dVar;
    }

    public final void a(Object obj, OutputStream outputStream) throws IOException {
        Map<Class<?>, d<?>> map = this.f8138a;
        f fVar = new f(outputStream, map, this.f8139b, this.f8140c);
        if (obj != null) {
            d dVar = map.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, fVar);
                return;
            }
            StringBuilder d10 = a.a.d("No encoder for ");
            d10.append(obj.getClass());
            throw new b(d10.toString());
        }
    }
}
