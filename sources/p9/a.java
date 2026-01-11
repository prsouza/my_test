package p9;

import aa.c;
import i2.a0;
import i2.j;
import i2.z;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E> extends z<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final C0188a f9726c = new C0188a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f9727a;

    /* renamed from: b  reason: collision with root package name */
    public final z<E> f9728b;

    /* renamed from: p9.a$a  reason: collision with other inner class name */
    public class C0188a implements a0 {
        public final <T> z<T> create(j jVar, x9.a<T> aVar) {
            Type type = aVar.f13149b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(jVar, jVar.c(new x9.a(genericComponentType)), g9.a.h(genericComponentType));
        }
    }

    public a(j jVar, z<E> zVar, Class<E> cls) {
        this.f9728b = new n(jVar, zVar, cls);
        this.f9727a = cls;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [i2.z<E>, p9.n] */
    public final Object read(aa.a aVar) {
        if (aVar.A0() == 9) {
            aVar.x0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.e();
        while (aVar.a0()) {
            arrayList.add(this.f9728b.read(aVar));
        }
        aVar.R();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f9727a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [i2.z<E>, p9.n] */
    public final void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.f0();
            return;
        }
        cVar.B();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f9728b.write(cVar, Array.get(obj, i));
        }
        cVar.T();
    }
}
