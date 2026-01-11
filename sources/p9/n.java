package p9;

import aa.a;
import aa.c;
import i2.j;
import i2.z;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p9.j;

public final class n<T> extends z<T> {

    /* renamed from: a  reason: collision with root package name */
    public final j f9773a;

    /* renamed from: b  reason: collision with root package name */
    public final z<T> f9774b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f9775c;

    public n(j jVar, z<T> zVar, Type type) {
        this.f9773a = jVar;
        this.f9774b = zVar;
        this.f9775c = type;
    }

    public final T read(a aVar) {
        return this.f9774b.read(aVar);
    }

    public final void write(c cVar, T t10) {
        z<T> zVar = this.f9774b;
        Type type = this.f9775c;
        if (t10 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t10.getClass();
        }
        if (type != this.f9775c) {
            zVar = this.f9773a.c(new x9.a(type));
            if (zVar instanceof j.a) {
                z<T> zVar2 = this.f9774b;
                if (!(zVar2 instanceof j.a)) {
                    zVar = zVar2;
                }
            }
        }
        zVar.write(cVar, t10);
    }
}
