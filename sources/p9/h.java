package p9;

import aa.b;
import aa.c;
import g9.g;
import i2.a0;
import i2.j;
import i2.z;
import java.util.ArrayList;
import java.util.Objects;

public final class h extends z<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9741b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final j f9742a;

    public class a implements a0 {
        public final <T> z<T> create(j jVar, x9.a<T> aVar) {
            if (aVar.f13148a == Object.class) {
                return new h(jVar);
            }
            return null;
        }
    }

    public h(j jVar) {
        this.f9742a = jVar;
    }

    public final Object read(aa.a aVar) {
        int d10 = b.d(aVar.A0());
        if (d10 == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.e();
            while (aVar.a0()) {
                arrayList.add(read(aVar));
            }
            aVar.R();
            return arrayList;
        } else if (d10 == 2) {
            g gVar = new g(g.f5285w);
            aVar.w();
            while (aVar.a0()) {
                gVar.put(aVar.w0(), read(aVar));
            }
            aVar.S();
            return gVar;
        } else if (d10 == 5) {
            return aVar.y0();
        } else {
            if (d10 == 6) {
                return Double.valueOf(aVar.f0());
            }
            if (d10 == 7) {
                return Boolean.valueOf(aVar.b0());
            }
            if (d10 == 8) {
                aVar.x0();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public final void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.f0();
            return;
        }
        j jVar = this.f9742a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(jVar);
        z c10 = jVar.c(new x9.a(cls));
        if (c10 instanceof h) {
            cVar.R();
            cVar.a0();
            return;
        }
        c10.write(cVar, obj);
    }
}
