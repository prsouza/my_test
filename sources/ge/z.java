package ge;

import pd.b;
import pd.d;
import pd.e;
import pd.f;
import xd.l;
import yd.h;

public abstract class z extends pd.a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5474a = new a();

    public static final class a extends b<e, z> {

        /* renamed from: ge.z$a$a  reason: collision with other inner class name */
        public static final class C0089a extends h implements l<f.a, z> {

            /* renamed from: b  reason: collision with root package name */
            public static final C0089a f5475b = new C0089a();

            public C0089a() {
                super(1);
            }

            public final Object k(Object obj) {
                f.a aVar = (f.a) obj;
                if (aVar instanceof z) {
                    return (z) aVar;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f9879a, C0089a.f5475b);
        }
    }

    public z() {
        super(e.a.f9879a);
    }

    public final void e(d<?> dVar) {
        ((le.e) dVar).p();
    }

    public final <T> d<T> f0(d<? super T> dVar) {
        return new le.e(this, dVar);
    }

    public final <E extends f.a> E get(f.b<E> bVar) {
        e6.e.D(bVar, "key");
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            f.b<?> key = getKey();
            e6.e.D(key, "key");
            if (!(key == bVar2 || bVar2.f9874b == key)) {
                return null;
            }
            E e10 = (f.a) bVar2.f9873a.k(this);
            if (e10 instanceof f.a) {
                return e10;
            }
            return null;
        } else if (e.a.f9879a == bVar) {
            return this;
        } else {
            return null;
        }
    }

    public final f minusKey(f.b<?> bVar) {
        e6.e.D(bVar, "key");
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            f.b<?> key = getKey();
            e6.e.D(key, "key");
            if ((key == bVar2 || bVar2.f9874b == key) && ((f.a) bVar2.f9873a.k(this)) != null) {
                return pd.h.f9881a;
            }
        } else if (e.a.f9879a == bVar) {
            return pd.h.f9881a;
        }
        return this;
    }

    public abstract void p0(f fVar, Runnable runnable);

    public String toString() {
        return getClass().getSimpleName() + '@' + g0.o(this);
    }

    public boolean v0(f fVar) {
        return !(this instanceof b2);
    }
}
