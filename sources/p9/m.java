package p9;

import ad.c;
import g9.i;
import i2.a0;
import i2.j;
import i2.n;
import i2.o;
import i2.p;
import i2.r;
import i2.v;
import i2.w;
import i2.z;
import java.util.Objects;

public final class m<T> extends z<T> {

    /* renamed from: a  reason: collision with root package name */
    public final w<T> f9761a;

    /* renamed from: b  reason: collision with root package name */
    public final o<T> f9762b;

    /* renamed from: c  reason: collision with root package name */
    public final j f9763c;

    /* renamed from: d  reason: collision with root package name */
    public final x9.a<T> f9764d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f9765e;

    /* renamed from: f  reason: collision with root package name */
    public final m<T>.a f9766f = new a();
    public z<T> g;

    public final class a implements v, n {
        public a() {
        }

        public final p a(Object obj) {
            j jVar = m.this.f9763c;
            Objects.requireNonNull(jVar);
            if (obj == null) {
                return r.f6004a;
            }
            Class<?> cls = obj.getClass();
            f fVar = new f();
            jVar.j(obj, cls, fVar);
            return fVar.x0();
        }
    }

    public static final class b implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public final x9.a<?> f9768a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9769b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<?> f9770c;

        /* renamed from: s  reason: collision with root package name */
        public final w<?> f9771s;

        /* renamed from: t  reason: collision with root package name */
        public final o<?> f9772t;

        public b(Object obj, x9.a<?> aVar, boolean z, Class<?> cls) {
            o<?> oVar = null;
            w<?> wVar = obj instanceof w ? (w) obj : null;
            this.f9771s = wVar;
            oVar = obj instanceof o ? (o) obj : oVar;
            this.f9772t = oVar;
            c.m((wVar == null && oVar == null) ? false : true);
            this.f9768a = aVar;
            this.f9769b = z;
            this.f9770c = cls;
        }

        public final <T> z<T> create(j jVar, x9.a<T> aVar) {
            boolean z;
            x9.a<?> aVar2 = this.f9768a;
            if (aVar2 != null) {
                z = aVar2.equals(aVar) || (this.f9769b && this.f9768a.f13149b == aVar.f13148a);
            } else {
                z = this.f9770c.isAssignableFrom(aVar.f13148a);
            }
            if (z) {
                return new m(this.f9771s, this.f9772t, jVar, aVar, this);
            }
            return null;
        }
    }

    public m(w<T> wVar, o<T> oVar, j jVar, x9.a<T> aVar, a0 a0Var) {
        this.f9761a = wVar;
        this.f9762b = oVar;
        this.f9763c = jVar;
        this.f9764d = aVar;
        this.f9765e = a0Var;
    }

    public final T read(aa.a aVar) {
        if (this.f9762b == null) {
            z<T> zVar = this.g;
            if (zVar == null) {
                zVar = this.f9763c.b(this.f9765e, this.f9764d);
                this.g = zVar;
            }
            return zVar.read(aVar);
        }
        p a10 = i.a(aVar);
        if (a10 instanceof r) {
            return null;
        }
        return this.f9762b.deserialize(a10, this.f9764d.f13149b, this.f9766f);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [p9.o$b0, i2.z<i2.p>, java.lang.Object] */
    public final void write(aa.c cVar, T t10) {
        w<T> wVar = this.f9761a;
        if (wVar == null) {
            z<T> zVar = this.g;
            if (zVar == null) {
                zVar = this.f9763c.b(this.f9765e, this.f9764d);
                this.g = zVar;
            }
            zVar.write(cVar, t10);
        } else if (t10 == null) {
            cVar.f0();
        } else {
            p serialize = wVar.serialize(t10, this.f9764d.f13149b, this.f9766f);
            ? r02 = o.C;
            Objects.requireNonNull(r02);
            r02.write(cVar, serialize);
        }
    }
}
