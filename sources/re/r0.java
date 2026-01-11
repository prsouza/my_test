package re;

import ah.v;
import c3.k;
import e6.e;
import md.f;
import md.m;
import oe.b;
import xd.l;
import yd.h;

public final class r0<K, V> extends c0<K, V, f<? extends K, ? extends V>> {

    /* renamed from: c  reason: collision with root package name */
    public final pe.f f10747c;

    public static final class a extends h implements l<pe.a, m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f10748b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f10749c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, b bVar2) {
            super(1);
            this.f10748b = bVar;
            this.f10749c = bVar2;
        }

        public final Object k(Object obj) {
            pe.a aVar = (pe.a) obj;
            e.D(aVar, "$receiver");
            pe.a.a(aVar, "first", this.f10748b.a());
            pe.a.a(aVar, "second", this.f10749c.a());
            return m.f8555a;
        }
    }

    public r0(b<K> bVar, b<V> bVar2) {
        super(bVar, bVar2, (k) null);
        this.f10747c = (pe.f) v.y("kotlin.Pair", new pe.e[0], new a(bVar, bVar2));
    }

    public final pe.e a() {
        return this.f10747c;
    }

    public final Object c(Object obj, Object obj2) {
        return new f(obj, obj2);
    }
}
