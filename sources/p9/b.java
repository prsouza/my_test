package p9;

import aa.c;
import g9.h;
import i2.a0;
import i2.j;
import i2.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class b implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final g9.b f9729a;

    public static final class a<E> extends z<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final z<E> f9730a;

        /* renamed from: b  reason: collision with root package name */
        public final h<? extends Collection<E>> f9731b;

        public a(j jVar, Type type, z<E> zVar, h<? extends Collection<E>> hVar) {
            this.f9730a = new n(jVar, zVar, type);
            this.f9731b = hVar;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [i2.z<E>, p9.n] */
        public final Object read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            Collection collection = (Collection) this.f9731b.a();
            aVar.e();
            while (aVar.a0()) {
                collection.add(this.f9730a.read(aVar));
            }
            aVar.R();
            return collection;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [i2.z<E>, p9.n] */
        public final void write(c cVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                cVar.f0();
                return;
            }
            cVar.B();
            for (Object write : collection) {
                this.f9730a.write(cVar, write);
            }
            cVar.T();
        }
    }

    public b(g9.b bVar) {
        this.f9729a = bVar;
    }

    public final <T> z<T> create(j jVar, x9.a<T> aVar) {
        Type type = aVar.f13149b;
        Class<? super T> cls = aVar.f13148a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f10 = g9.a.f(type, cls, Collection.class);
        if (f10 instanceof WildcardType) {
            f10 = ((WildcardType) f10).getUpperBounds()[0];
        }
        Class cls2 = f10 instanceof ParameterizedType ? ((ParameterizedType) f10).getActualTypeArguments()[0] : Object.class;
        return new a(jVar, cls2, jVar.c(new x9.a(cls2)), this.f9729a.a(aVar));
    }
}
